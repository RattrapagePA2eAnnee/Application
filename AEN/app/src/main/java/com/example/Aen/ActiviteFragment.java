package com.example.cookmaster;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.cookmaster.ApiService.ApiClient;
import com.example.cookmaster.R;
import com.example.cookmaster.model.ApiResponse;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonSyntaxException;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Response;

public class ActiviteFragment extends Fragment {

    private EditText searchBar;
    private Button searchButton;
    private TextView test;

    private JsonObject jsonResponseObject;


    public ActiviteFragment() {
        // Required empty public constructor
    }

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_activite, container, false);

        searchBar = view.findViewById(R.id.searchEditText);
        searchButton = view.findViewById(R.id.searchButton);
        test = view.findViewById(R.id.testname);

        searchButton.setOnClickListener(v -> {
            String query = searchBar.getText().toString().toUpperCase();
            searchBar.setText(query);
            callApi(query);
        });

        return view;
    }

    private void callApi(String airportCode) {
        final CountDownLatch latch = new CountDownLatch(1);
        final AtomicBoolean result = new AtomicBoolean(false);

        new Thread(() -> {
            ApiClient.MetarService metarService = ApiClient.getMetarService();
            Call<ResponseBody> call = metarService.getMetar(
                    "CjJWpyhX62W3GNSjjlZ9ulAEVOX7jRUb",
                    "2.3",
                    "fr-FR",
                    airportCode,
                    1
            );

            try {
                Response<ResponseBody> response = call.execute();
                if (response.isSuccessful() && response.body() != null) {
                    String responseBody = response.body().string();
                    System.out.println(responseBody);
                    responseBody = responseBody.replace("<pre>", "").replace("</pre>", "").trim();

                    // Create a Gson instance
                    Gson gson = new Gson();

                    // Convert the response string to a JsonObject
                    jsonResponseObject = gson.fromJson(responseBody, JsonObject.class);

                    // Check and remove the 'trends' key from 'metar' if it exists
                    if (jsonResponseObject.has("metar")) {
                        JsonObject metarObject = jsonResponseObject.getAsJsonObject("metar");
                        if (metarObject.has("trends")) {
                            metarObject.remove("trends");
                        }
                    }

                    print();  // Directly call the print method here

                } else {
                    Log.e("API Error", "Code: " + response.code() + ", Message: " + response.message());
                    result.set(false);
                }
            } catch (IOException e) {
                e.printStackTrace();
                Log.e("API Communication Error", "Error communicating with the server.");
                result.set(false);
            } finally {
                latch.countDown();
            }
        }).start();

        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
            Log.e("Latch Error", "Error waiting for the latch.");
        }
    }





    private void print() {
        if (getActivity() != null) {
            getActivity().runOnUiThread(() -> {
                if (jsonResponseObject != null) {
                    JsonObject airportObject = jsonResponseObject.getAsJsonObject("airport");
                    if (airportObject != null) {
                        String airportName = "AÉROPORT: " + airportObject.get("name_translated").getAsString();
                        TextView airportNameTextView = getActivity().findViewById(R.id.airportNameTextView);
                        airportNameTextView.setText(airportName);
                    }

                    JsonArray runwaysArray = jsonResponseObject.getAsJsonArray("runways");
                    if (runwaysArray != null) {
                        int numberOfRunways = runwaysArray.size();
                        StringBuilder runwayInfo = new StringBuilder("PISTES\nNombre: " + numberOfRunways);
                        for (JsonElement runwayElem : runwaysArray) {
                            JsonObject runway = runwayElem.getAsJsonObject();
                            runwayInfo.append("\n    ")
                                    .append(runway.get("id_l").getAsString()).append("/").append(runway.get("id_h").getAsString())
                                    .append(" - Orientations: ")
                                    .append(runway.get("hdg_l").getAsString()).append("°/")
                                    .append(runway.get("hdg_h").getAsString()).append("°");
                        }
                        TextView runwayInfoTextView = getActivity().findViewById(R.id.runwayInfoTextView);
                        runwayInfoTextView.setText(runwayInfo);
                    }

                    // Set METAR title
                    TextView metarTitleTextView = getActivity().findViewById(R.id.metarTitleTextView);
                    metarTitleTextView.setText("INFO METAR");

                    JsonObject metarObject = jsonResponseObject.getAsJsonObject("metar");
                    if (metarObject != null && metarObject.get("raw") != null) {
                        String metarRaw = "Données brutes: " + metarObject.get("raw").getAsString();
                        TextView metarInfoTextView = getActivity().findViewById(R.id.metarInfoTextView);
                        metarInfoTextView.setText(metarRaw);
                    }
                } else {
                    Toast.makeText(getActivity(), "Erreur lors de la récupération des données de l'aéroport.", Toast.LENGTH_LONG).show();
                }
            });
        }
    }









}

package com.example.cookmaster.ApiService;

import okhttp3.MultipartBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Query;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class ApiClient {

    private static final String BASE_URL = "https://api.aen.best";

    private static Retrofit retrofit = null;
    public static Retrofit getRetrofitInstance() {
        if (retrofit == null) {
            Gson gson = new GsonBuilder()
                    .setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ")
                    .create();

            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();
        }
        return retrofit;
    }

    public interface Connection {
        @POST("/connection")
        Call<ResponseBody> login(@Body JsonObject body);
    }

    public interface ConnectionToken {
        @POST("/connectiontoken")
        Call<ResponseBody> connectoken(@Body JsonObject body);
    }

    public interface SavePicture {
        @POST("/pictures")
        Call<ResponseBody> savepicture(@Header("Authorization") String headerValue, @Part MultipartBody.Part photo);
    }

    public interface MetarService {
        @GET("https://api.metar-taf.com/metar")
        Call<ResponseBody> getMetar(
                @Query("api_key") String apiKey,
                @Query("v") String version,
                @Query("locale") String locale,
                @Query("id") String id,
                @Query("test") int test
        );
    }

    private static MetarService metarService;
    public static MetarService getMetarService() {
        if (metarService == null) {
            metarService = getRetrofitInstance().create(MetarService.class);
        }
        return metarService;
    }
}

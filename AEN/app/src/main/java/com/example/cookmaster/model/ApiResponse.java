package com.example.cookmaster.model;

import java.util.List;

public class ApiResponse {

    public boolean status;
    public int credits;
    public Airport airport;
    public Metar metar;
    public Metar trends;
    public List<Runway> runways;
    public List<Station> stations;
    public Station station;

    public ApiResponse(boolean status, int credits, Airport airport, Metar metar, List<Runway> runways, List<Station> stations, Station station) {
        this.status = status;
        this.credits = credits;
        this.airport = airport;
        this.metar = metar;
        this.runways = runways;
        this.stations = stations;
        this.station = station;
    }


    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public Airport getAirport() {
        return airport;
    }

    public void setAirport(Airport airport) {
        this.airport = airport;
    }

    public Metar getMetar() {
        return metar;
    }

    public void setMetar(Metar metar) {
        this.metar = metar;
    }

    public List<Runway> getRunways() {
        return runways;
    }

    public void setRunways(List<Runway> runways) {
        this.runways = runways;
    }

    public List<Station> getStations() {
        return stations;
    }

    public void setStations(List<Station> stations) {
        this.stations = stations;
    }

    public Station getStation() {
        return station;
    }

    public void setStation(Station station) {
        this.station = station;
    }




    public static class Airport {
        public String id;
        public String iata;
        public String name;
        public String name_translated;
        public String city_name;
        public String admin1;
        public String admin2;
        public String country_id;

        public Airport(String id, String iata, String name, String name_translated, String city_name, String admin1, String admin2, String country_id, String country_name, double lat, double lng, boolean metar, boolean taf, int timezone, String fir, int elevation, int type, long last_notam) {
            this.id = id;
            this.iata = iata;
            this.name = name;
            this.name_translated = name_translated;
            this.city_name = city_name;
            this.admin1 = admin1;
            this.admin2 = admin2;
            this.country_id = country_id;
            this.country_name = country_name;
            this.lat = lat;
            this.lng = lng;
            this.metar = metar;
            this.taf = taf;
            this.timezone = timezone;
            this.fir = fir;
            this.elevation = elevation;
            this.type = type;
            this.last_notam = last_notam;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getIata() {
            return iata;
        }

        public void setIata(String iata) {
            this.iata = iata;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName_translated() {
            return name_translated;
        }

        public void setName_translated(String name_translated) {
            this.name_translated = name_translated;
        }

        public String getCity_name() {
            return city_name;
        }

        public void setCity_name(String city_name) {
            this.city_name = city_name;
        }

        public String getAdmin1() {
            return admin1;
        }

        public void setAdmin1(String admin1) {
            this.admin1 = admin1;
        }

        public String getAdmin2() {
            return admin2;
        }

        public void setAdmin2(String admin2) {
            this.admin2 = admin2;
        }

        public String getCountry_id() {
            return country_id;
        }

        public void setCountry_id(String country_id) {
            this.country_id = country_id;
        }

        public String getCountry_name() {
            return country_name;
        }

        public void setCountry_name(String country_name) {
            this.country_name = country_name;
        }

        public double getLat() {
            return lat;
        }

        public void setLat(double lat) {
            this.lat = lat;
        }

        public double getLng() {
            return lng;
        }

        public void setLng(double lng) {
            this.lng = lng;
        }

        public boolean isMetar() {
            return metar;
        }

        public void setMetar(boolean metar) {
            this.metar = metar;
        }

        public boolean isTaf() {
            return taf;
        }

        public void setTaf(boolean taf) {
            this.taf = taf;
        }

        public int getTimezone() {
            return timezone;
        }

        public void setTimezone(int timezone) {
            this.timezone = timezone;
        }

        public String getFir() {
            return fir;
        }

        public void setFir(String fir) {
            this.fir = fir;
        }

        public int getElevation() {
            return elevation;
        }

        public void setElevation(int elevation) {
            this.elevation = elevation;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public long getLast_notam() {
            return last_notam;
        }

        public void setLast_notam(long last_notam) {
            this.last_notam = last_notam;
        }

        public String country_name;
        public double lat;
        public double lng;
        public boolean metar;
        public boolean taf;
        public int timezone;
        public String fir;
        public int elevation;
        public int type;
        public long last_notam;
    }

    public static class Metar {
        public boolean cavok;
        public int ceiling;
        public String ceiling_color;
        public List<Cloud> clouds;
        public String code;
        public String code_color;
        public String colour_state;
        public int dewpoint;
        public String dewpoint_exact;
        public int humidity;
        public boolean is_day;
        public long observed;
        public int qnh;
        public String raw;
        public String recent_weather_report;
        public String remarks;
        public List<String> runway_condition;
        public List<String> runway_visibility;
        public boolean snoclo;
        public String station_id;
        public long sunrise;
        public long sunset;
        public int temperature;
        public String temperature_exact;
        public List<String> trends;
        public String vertical_visibility;
        public int visibility;
        public String visibility_sign;
        public String visibility_color;
        public String visibility_min;
        public String visibility_min_direction;
        public List<String> warnings;
        public String weather;
        public String weather_image;
        public String weather_report;
        public String wind_color;
        public int wind_dir;
        public String wind_dir_max;
        public String wind_dir_min;
        public String wind_gust;
        public int wind_speed;
        public String ws_all;
        public String ws_runways;
        public long id;

        public Metar(boolean cavok, int ceiling, String ceiling_color, List<Cloud> clouds, String code, String code_color, String colour_state, int dewpoint, String dewpoint_exact, int humidity, boolean is_day, long observed, int qnh, String raw, String recent_weather_report, String remarks, List<String> runway_condition, List<String> runway_visibility, boolean snoclo, String station_id, long sunrise, long sunset, int temperature, String temperature_exact, List<String> trends, String vertical_visibility, int visibility, String visibility_sign, String visibility_color, String visibility_min, String visibility_min_direction, List<String> warnings, String weather, String weather_image, String weather_report, String wind_color, int wind_dir, String wind_dir_max, String wind_dir_min, String wind_gust, int wind_speed, String ws_all, String ws_runways, long id) {
            this.cavok = cavok;
            this.ceiling = ceiling;
            this.ceiling_color = ceiling_color;
            this.clouds = clouds;
            this.code = code;
            this.code_color = code_color;
            this.colour_state = colour_state;
            this.dewpoint = dewpoint;
            this.dewpoint_exact = dewpoint_exact;
            this.humidity = humidity;
            this.is_day = is_day;
            this.observed = observed;
            this.qnh = qnh;
            this.raw = raw;
            this.recent_weather_report = recent_weather_report;
            this.remarks = remarks;
            this.runway_condition = runway_condition;
            this.runway_visibility = runway_visibility;
            this.snoclo = snoclo;
            this.station_id = station_id;
            this.sunrise = sunrise;
            this.sunset = sunset;
            this.temperature = temperature;
            this.temperature_exact = temperature_exact;
            this.trends = trends;
            this.vertical_visibility = vertical_visibility;
            this.visibility = visibility;
            this.visibility_sign = visibility_sign;
            this.visibility_color = visibility_color;
            this.visibility_min = visibility_min;
            this.visibility_min_direction = visibility_min_direction;
            this.warnings = warnings;
            this.weather = weather;
            this.weather_image = weather_image;
            this.weather_report = weather_report;
            this.wind_color = wind_color;
            this.wind_dir = wind_dir;
            this.wind_dir_max = wind_dir_max;
            this.wind_dir_min = wind_dir_min;
            this.wind_gust = wind_gust;
            this.wind_speed = wind_speed;
            this.ws_all = ws_all;
            this.ws_runways = ws_runways;
            this.id = id;
        }

        public boolean isCavok() {
            return cavok;
        }

        public void setCavok(boolean cavok) {
            this.cavok = cavok;
        }

        public int getCeiling() {
            return ceiling;
        }

        public void setCeiling(int ceiling) {
            this.ceiling = ceiling;
        }

        public String getCeiling_color() {
            return ceiling_color;
        }

        public void setCeiling_color(String ceiling_color) {
            this.ceiling_color = ceiling_color;
        }

        public List<Cloud> getClouds() {
            return clouds;
        }

        public void setClouds(List<Cloud> clouds) {
            this.clouds = clouds;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getCode_color() {
            return code_color;
        }

        public void setCode_color(String code_color) {
            this.code_color = code_color;
        }

        public String getColour_state() {
            return colour_state;
        }

        public void setColour_state(String colour_state) {
            this.colour_state = colour_state;
        }

        public int getDewpoint() {
            return dewpoint;
        }

        public void setDewpoint(int dewpoint) {
            this.dewpoint = dewpoint;
        }

        public String getDewpoint_exact() {
            return dewpoint_exact;
        }

        public void setDewpoint_exact(String dewpoint_exact) {
            this.dewpoint_exact = dewpoint_exact;
        }

        public int getHumidity() {
            return humidity;
        }

        public void setHumidity(int humidity) {
            this.humidity = humidity;
        }

        public boolean isIs_day() {
            return is_day;
        }

        public void setIs_day(boolean is_day) {
            this.is_day = is_day;
        }

        public long getObserved() {
            return observed;
        }

        public void setObserved(long observed) {
            this.observed = observed;
        }

        public int getQnh() {
            return qnh;
        }

        public void setQnh(int qnh) {
            this.qnh = qnh;
        }

        public String getRaw() {
            return raw;
        }

        public void setRaw(String raw) {
            this.raw = raw;
        }

        public String getRecent_weather_report() {
            return recent_weather_report;
        }

        public void setRecent_weather_report(String recent_weather_report) {
            this.recent_weather_report = recent_weather_report;
        }

        public String getRemarks() {
            return remarks;
        }

        public void setRemarks(String remarks) {
            this.remarks = remarks;
        }

        public List<String> getRunway_condition() {
            return runway_condition;
        }

        public void setRunway_condition(List<String> runway_condition) {
            this.runway_condition = runway_condition;
        }

        public List<String> getRunway_visibility() {
            return runway_visibility;
        }

        public void setRunway_visibility(List<String> runway_visibility) {
            this.runway_visibility = runway_visibility;
        }

        public boolean isSnoclo() {
            return snoclo;
        }

        public void setSnoclo(boolean snoclo) {
            this.snoclo = snoclo;
        }

        public String getStation_id() {
            return station_id;
        }

        public void setStation_id(String station_id) {
            this.station_id = station_id;
        }

        public long getSunrise() {
            return sunrise;
        }

        public void setSunrise(long sunrise) {
            this.sunrise = sunrise;
        }

        public long getSunset() {
            return sunset;
        }

        public void setSunset(long sunset) {
            this.sunset = sunset;
        }

        public int getTemperature() {
            return temperature;
        }

        public void setTemperature(int temperature) {
            this.temperature = temperature;
        }

        public String getTemperature_exact() {
            return temperature_exact;
        }

        public void setTemperature_exact(String temperature_exact) {
            this.temperature_exact = temperature_exact;
        }

        public List<String> getTrends() {
            return trends;
        }

        public void setTrends(List<String> trends) {
            this.trends = trends;
        }

        public String getVertical_visibility() {
            return vertical_visibility;
        }

        public void setVertical_visibility(String vertical_visibility) {
            this.vertical_visibility = vertical_visibility;
        }

        public int getVisibility() {
            return visibility;
        }

        public void setVisibility(int visibility) {
            this.visibility = visibility;
        }

        public String getVisibility_sign() {
            return visibility_sign;
        }

        public void setVisibility_sign(String visibility_sign) {
            this.visibility_sign = visibility_sign;
        }

        public String getVisibility_color() {
            return visibility_color;
        }

        public void setVisibility_color(String visibility_color) {
            this.visibility_color = visibility_color;
        }

        public String getVisibility_min() {
            return visibility_min;
        }

        public void setVisibility_min(String visibility_min) {
            this.visibility_min = visibility_min;
        }

        public String getVisibility_min_direction() {
            return visibility_min_direction;
        }

        public void setVisibility_min_direction(String visibility_min_direction) {
            this.visibility_min_direction = visibility_min_direction;
        }

        public List<String> getWarnings() {
            return warnings;
        }

        public void setWarnings(List<String> warnings) {
            this.warnings = warnings;
        }

        public String getWeather() {
            return weather;
        }

        public void setWeather(String weather) {
            this.weather = weather;
        }

        public String getWeather_image() {
            return weather_image;
        }

        public void setWeather_image(String weather_image) {
            this.weather_image = weather_image;
        }

        public String getWeather_report() {
            return weather_report;
        }

        public void setWeather_report(String weather_report) {
            this.weather_report = weather_report;
        }

        public String getWind_color() {
            return wind_color;
        }

        public void setWind_color(String wind_color) {
            this.wind_color = wind_color;
        }

        public int getWind_dir() {
            return wind_dir;
        }

        public void setWind_dir(int wind_dir) {
            this.wind_dir = wind_dir;
        }

        public String getWind_dir_max() {
            return wind_dir_max;
        }

        public void setWind_dir_max(String wind_dir_max) {
            this.wind_dir_max = wind_dir_max;
        }

        public String getWind_dir_min() {
            return wind_dir_min;
        }

        public void setWind_dir_min(String wind_dir_min) {
            this.wind_dir_min = wind_dir_min;
        }

        public String getWind_gust() {
            return wind_gust;
        }

        public void setWind_gust(String wind_gust) {
            this.wind_gust = wind_gust;
        }

        public int getWind_speed() {
            return wind_speed;
        }

        public void setWind_speed(int wind_speed) {
            this.wind_speed = wind_speed;
        }

        public String getWs_all() {
            return ws_all;
        }

        public void setWs_all(String ws_all) {
            this.ws_all = ws_all;
        }

        public String getWs_runways() {
            return ws_runways;
        }

        public void setWs_runways(String ws_runways) {
            this.ws_runways = ws_runways;
        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public static class Cloud {
            public int id;
            public int height;
            public String report;
            public String amount;

            public Cloud(int id, int height, String report, String amount) {
                this.id = id;
                this.height = height;
                this.report = report;
                this.amount = amount;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }

            public String getReport() {
                return report;
            }

            public void setReport(String report) {
                this.report = report;
            }

            public String getAmount() {
                return amount;
            }

            public void setAmount(String amount) {
                this.amount = amount;
            }
        }
    }

    public static class Runway {
        public String id_l;
        public String id_h;
        public int hdg_l;
        public int hdg_h;
        public int in_use;
        public double xwnd;
        public double hwnd;

        public Runway(String id_l, String id_h, int hdg_l, int hdg_h, int in_use, double xwnd, double hwnd) {
            this.id_l = id_l;
            this.id_h = id_h;
            this.hdg_l = hdg_l;
            this.hdg_h = hdg_h;
            this.in_use = in_use;
            this.xwnd = xwnd;
            this.hwnd = hwnd;
        }

        public String getId_l() {
            return id_l;
        }

        public void setId_l(String id_l) {
            this.id_l = id_l;
        }

        public String getId_h() {
            return id_h;
        }

        public void setId_h(String id_h) {
            this.id_h = id_h;
        }

        public int getHdg_l() {
            return hdg_l;
        }

        public void setHdg_l(int hdg_l) {
            this.hdg_l = hdg_l;
        }

        public int getHdg_h() {
            return hdg_h;
        }

        public void setHdg_h(int hdg_h) {
            this.hdg_h = hdg_h;
        }

        public int getIn_use() {
            return in_use;
        }

        public void setIn_use(int in_use) {
            this.in_use = in_use;
        }

        public double getXwnd() {
            return xwnd;
        }

        public void setXwnd(double xwnd) {
            this.xwnd = xwnd;
        }

        public double getHwnd() {
            return hwnd;
        }

        public void setHwnd(double hwnd) {
            this.hwnd = hwnd;
        }
    }

    public static class Station {
        public String id;
        public String iata;
        public String name;
        public String name_translated;
        public String city_name;
        public String admin1;
        public String admin2;
        public String country_id;
        public String country_name;
        public double lat;
        public double lng;
        public boolean metar;
        public boolean taf;
        public int timezone;
        public String fir;
        public int elevation;
        public int type;
        public long last_notam;
        public long distance;
        public int bearing;

        public Station(String id, String iata, String name, String name_translated, String city_name, String admin1, String admin2, String country_id, String country_name, double lat, double lng, boolean metar, boolean taf, int timezone, String fir, int elevation, int type, long last_notam, long distance, int bearing) {
            this.id = id;
            this.iata = iata;
            this.name = name;
            this.name_translated = name_translated;
            this.city_name = city_name;
            this.admin1 = admin1;
            this.admin2 = admin2;
            this.country_id = country_id;
            this.country_name = country_name;
            this.lat = lat;
            this.lng = lng;
            this.metar = metar;
            this.taf = taf;
            this.timezone = timezone;
            this.fir = fir;
            this.elevation = elevation;
            this.type = type;
            this.last_notam = last_notam;
            this.distance = distance;
            this.bearing = bearing;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getIata() {
            return iata;
        }

        public void setIata(String iata) {
            this.iata = iata;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName_translated() {
            return name_translated;
        }

        public void setName_translated(String name_translated) {
            this.name_translated = name_translated;
        }

        public String getCity_name() {
            return city_name;
        }

        public void setCity_name(String city_name) {
            this.city_name = city_name;
        }

        public String getAdmin1() {
            return admin1;
        }

        public void setAdmin1(String admin1) {
            this.admin1 = admin1;
        }

        public String getAdmin2() {
            return admin2;
        }

        public void setAdmin2(String admin2) {
            this.admin2 = admin2;
        }

        public String getCountry_id() {
            return country_id;
        }

        public void setCountry_id(String country_id) {
            this.country_id = country_id;
        }

        public String getCountry_name() {
            return country_name;
        }

        public void setCountry_name(String country_name) {
            this.country_name = country_name;
        }

        public double getLat() {
            return lat;
        }

        public void setLat(double lat) {
            this.lat = lat;
        }

        public double getLng() {
            return lng;
        }

        public void setLng(double lng) {
            this.lng = lng;
        }

        public boolean isMetar() {
            return metar;
        }

        public void setMetar(boolean metar) {
            this.metar = metar;
        }

        public boolean isTaf() {
            return taf;
        }

        public void setTaf(boolean taf) {
            this.taf = taf;
        }

        public int getTimezone() {
            return timezone;
        }

        public void setTimezone(int timezone) {
            this.timezone = timezone;
        }

        public String getFir() {
            return fir;
        }

        public void setFir(String fir) {
            this.fir = fir;
        }

        public int getElevation() {
            return elevation;
        }

        public void setElevation(int elevation) {
            this.elevation = elevation;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public long getLast_notam() {
            return last_notam;
        }

        public void setLast_notam(long last_notam) {
            this.last_notam = last_notam;
        }

        public long getDistance() {
            return distance;
        }

        public void setDistance(long distance) {
            this.distance = distance;
        }

        public int getBearing() {
            return bearing;
        }

        public void setBearing(int bearing) {
            this.bearing = bearing;
        }
    }

    public class Trend {
        private String from;
        private String to;
        private String flag;
        private List<Cloud> clouds;

        public Trend(String from, String to, String flag, List<Cloud> clouds) {
            this.from = from;
            this.to = to;
            this.flag = flag;
            this.clouds = clouds;
        }

        public String getFrom() {
            return from;
        }

        public void setFrom(String from) {
            this.from = from;
        }

        public String getTo() {
            return to;
        }

        public void setTo(String to) {
            this.to = to;
        }

        public String getFlag() {
            return flag;
        }

        public void setFlag(String flag) {
            this.flag = flag;
        }

        public List<Cloud> getClouds() {
            return clouds;
        }

        public void setClouds(List<Cloud> clouds) {
            this.clouds = clouds;
        }

        // ... getters and setters ...
    }

    public class Cloud {
        private String amount;
        private int height;
        private String type;
        private String report;
        private String raw;

        public Cloud(String amount, int height, String type, String report, String raw) {
            this.amount = amount;
            this.height = height;
            this.type = type;
            this.report = report;
            this.raw = raw;
        }

        public String getAmount() {
            return amount;
        }

        public void setAmount(String amount) {
            this.amount = amount;
        }

        public int getHeight() {
            return height;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getReport() {
            return report;
        }

        public void setReport(String report) {
            this.report = report;
        }

        public String getRaw() {
            return raw;
        }

        public void setRaw(String raw) {
            this.raw = raw;
        }

        // ... getters and setters ...
    }

}


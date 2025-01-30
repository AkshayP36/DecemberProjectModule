package com.eshopping.decemberprojectmodule.models.User;

public class Geolocation {
    private String lat;
    private String longitude;

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public Geolocation() {
    }

    public Geolocation(String lat, String longitude) {
        this.lat = lat;
        this.longitude = longitude;
    }
}

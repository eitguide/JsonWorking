package com.example.nguyennghia.jsonworking;

/**
 * Created by NguyenNghia on 6/11/2016.
 */
public class LatLng {
    private double mLat;
    private double mLng;
    public LatLng(){

    }

    public LatLng(double lat, double lng){
        mLat = lat;
        mLng = lng;
    }


    public void setLat(double lat) {
        this.mLat = lat;
    }

    public void setLng(double lng) {
        this.mLng = lng;
    }

    public double getLat() {
        return mLat;
    }

    public double getLng() {
        return mLng;
    }
}

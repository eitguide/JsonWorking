package com.example.nguyennghia.jsonworking;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by NguyenNghia on 6/11/2016.
 */
public class City {
    private String mName;
    private LatLng mPos;

    public City(String name, LatLng pos){
        mName = name;
        mPos = pos;
    }

    public String getName() {
        return mName;
    }

    public LatLng getPos() {
        return mPos;
    }

    public void setName(String name) {
        this.mName = name;
    }

    public void setPos(LatLng pos) {
        this.mPos = pos;
    }

    @Override
    public String toString() {
        JSONObject jsonCity = new JSONObject();
        JSONObject jsonLatLng = new JSONObject();
        try {
            jsonLatLng.put("lat", mPos.getLat());
            jsonLatLng.put("lng", mPos.getLng());

            jsonCity.put("name", mName);
            jsonCity.put("latlng", jsonLatLng);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return jsonCity.toString();
    }
}

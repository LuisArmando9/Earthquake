package com.example.earthquakeactivity;

public class Earthquake {
    private double eMagnitude;
    private String eLocation;
    private long mTimeInMilliseconds;
    private String url;

    public Earthquake(double eMagnitude, String eLocation, long timeInMilliseconds, String url) {
        this.eMagnitude = eMagnitude;
        this.eLocation = eLocation;
        mTimeInMilliseconds = timeInMilliseconds;
        this.url = url;
    }

    public double geteMagnitude() {
        return eMagnitude;
    }

    public long getmTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public String geteLocation() {
        return eLocation;
    }

    public String getUrl() {
        return url;
    }
}

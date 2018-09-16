package com.daikirah.joshua.geoguess;

import java.util.List;

public class GeoObject {

    private String GeoInEurope;
    private int GeoImage;


    public String getGeoInEurope() {
        return GeoInEurope;
    }

    public void setGeoInEurope(String geoInEurope) {
        GeoInEurope = geoInEurope;
    }

    public int getGeoImage() {
        return GeoImage;
    }

    public void setGeoImage(int geoImage) {
        GeoImage = geoImage;
    }

    public GeoObject(String geoInEurope, int geoImage) {
        GeoInEurope = geoInEurope;
        GeoImage = geoImage;
    }

    public static String[] GEO_LIST_LOCATIONS = {
            "In Europe",
            "Not In Europe",
            "Not In Europe",
            "In Europe",
            "Not In Europe",
            "In Europe",
            "In Europe",
            "Not In Europe"
    };

    public static int[] GEO_IMAGE_ID = {

            R.drawable.img1_yes_denmark,
            R.drawable.img2_no_canada,
            R.drawable.img3_no_bangladesh,
            R.drawable.img4_yes_kazachstan,
            R.drawable.img5_no_colombia,
            R.drawable.img6_yes_poland,
            R.drawable.img7_yes_malta,
            R.drawable.img8_no_thailand
    };


}

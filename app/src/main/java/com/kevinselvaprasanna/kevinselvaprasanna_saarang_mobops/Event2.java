package com.kevinselvaprasanna.kevinselvaprasanna_saarang_mobops;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import java.util.Locale;

/**
 * Created by kevin selva prasanna on 21-May-15.
 */
public class Event2 extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String uri= String.format(Locale.ENGLISH, "http://maps.google.com/maps?daddr=12.98751474,80.23813883(event1)");
        //Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("geo:12.98751474,80.23813883"));
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
        i.setClassName("com.google.android.apps.maps","com.google.android.maps.MapsActivity");
        startActivity(i);
    }
}


package com.kevinselvaprasanna.kevinselvaprasanna_saarang_mobops;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.view.View;
import android.widget.Button;

import java.util.Calendar;
import java.util.Locale;

/**
 * Created by kevin selva prasanna on 21-May-15.
 */
public class Event1 extends Activity implements View.OnClickListener {
    Button cal,map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.event1);

        cal=(Button)findViewById(R.id.cal);
        map=(Button)findViewById(R.id.map);
        cal.setOnClickListener(this);
        map.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
            case R.id.cal:
                Calendar beginTime = Calendar.getInstance();
                beginTime.set(2015, 5, 10, 7, 30);
                Calendar endTime = Calendar.getInstance();
                endTime.set(2015, 5, 10, 8, 30);
                Intent intent = new Intent(Intent.ACTION_INSERT)
                        .setData(CalendarContract.Events.CONTENT_URI)
                        .putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME, beginTime.getTimeInMillis())
                        .putExtra(CalendarContract.EXTRA_EVENT_END_TIME, endTime.getTimeInMillis())
                        .putExtra(CalendarContract.Events.TITLE, "eventone")
                        .putExtra(CalendarContract.Events.DESCRIPTION, "Saarang eventone")
                        .putExtra(CalendarContract.Events.EVENT_LOCATION, "Pampa hostel")
                        .putExtra(CalendarContract.Events.AVAILABILITY, CalendarContract.Events.AVAILABILITY_BUSY);
//                        .putExtra(Intent.EXTRA_EMAIL, "rowan@example.com,trevor@example.com");
                startActivity(intent);
                break;
            case R.id.map:
                String uri= String.format(Locale.ENGLISH, "http://maps.google.com/maps?daddr=12.98751474,80.23813883(event1)");
                //Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("geo:12.98751474,80.23813883"));
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
                i.setClassName("com.google.android.apps.maps","com.google.android.maps.MapsActivity");
                startActivity(i);
                break;


        }
    }
}

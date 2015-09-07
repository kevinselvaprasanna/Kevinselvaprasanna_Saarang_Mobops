package com.kevinselvaprasanna.kevinselvaprasanna_saarang_mobops;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainMenu extends ListActivity{

    String classes[] = {"Event1","Event2","Event 3","Event 4",
            "Event 5"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);


        setListAdapter(new ArrayAdapter<String>(MainMenu.this, android.R.layout.simple_list_item_1, classes));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        // TODO Auto-generated method stub
        super.onListItemClick(l, v, position, id);
        String cheese = classes[position];
        try{
            Class ourClass = Class.forName("com.kevinselvaprasanna.kevinselvaprasanna_saarang_mobops." + cheese);
            Intent ourIntent = new Intent(MainMenu.this,ourClass);
            startActivity(ourIntent);
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }

   /* @Override
    public boolean onCreateOptionsMenu(android.view.Menu menu) {
         //TODO Auto-generated method stub
        super.onCreateOptionsMenu(menu);
        MenuInflater blowup = getMenuInflater();
        blowup.inflate(R.menu.main, menu);
        return true;
    }*/
   /* @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        switch(id){
            case R.id.action_settings:
                Intent i = new Intent("android.intent.action.ABOUT");
                startActivity(i);
                break;
            case R.id.prefernces:
                Intent p = new Intent("android.intent.action.PREFS");
                startActivity(p);
                break;
            case R.id.exit:
                finish();
                break;
        }
        return false;
    }*/
}

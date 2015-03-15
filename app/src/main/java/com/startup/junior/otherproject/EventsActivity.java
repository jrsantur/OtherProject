package com.startup.junior.otherproject;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;

import com.startup.junior.otherproject.Fragments.EventsFragment;


public class EventsActivity extends BaseActivity {

    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_events);
        ViewGroup content = (ViewGroup) findViewById(R.id.container);
        content.removeAllViews();
        getLayoutInflater().inflate(R.layout.activity_events, content,true);
        toolbar = (Toolbar) findViewById(R.id.app_bar);
        toolbar.setTitle("Eventoos");
        setSupportActionBar(toolbar);

        //android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
        //fragmentManager.beginTransaction().replace(R.id.container, EventsFragment.newInstance(position + 1)).commit();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_events, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        switch(keyCode) {
            case KeyEvent.KEYCODE_BACK:
                Intent i = new Intent(EventsActivity.this, MainActivity.class);
                startActivity(i);
                return true;
        }
        return super.onKeyUp(keyCode, event);
    }
}

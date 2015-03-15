package com.startup.junior.otherproject;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.format.DateUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends BaseActivity {

    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        ViewGroup content = (ViewGroup) findViewById(R.id.container);
        content.removeAllViews();
        getLayoutInflater().inflate(R.layout.activity_main, content, true);
        toolbar = (Toolbar) findViewById(R.id.app_bar);
        toolbar.setTitle("Discotecas Piura");
        setSupportActionBar(toolbar);


        /*

        TextView view = (TextView)findViewById(R.id.text_click);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this , SubActivity.class);
                startActivity(i);
            }
        });
        */

      //  mNavigationDrawerFragment.setUp( R.id.fragment_navigation_drawer,
      //          (DrawerLayout)findViewById(R.id.drawer_layout),toolbar);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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


    public void titleToolbar(String titulo){
            toolbar.setTitle(titulo);
    }

    /*
    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        // Sync the toggle state after onRestoreInstanceState has occurred.
        mNavigationDrawerFragment.getDrawerToggle().syncState();
    }
    */
    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        switch(keyCode) {
            case KeyEvent.KEYCODE_BACK:
                finish();
            return true;
        }
        return super.onKeyUp(keyCode, event);
    }

}

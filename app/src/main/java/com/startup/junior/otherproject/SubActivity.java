package com.startup.junior.otherproject;

import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.support.v4.app.TaskStackBuilder;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;


public class SubActivity extends BaseActivity {


    Toolbar toolbar;
    CharSequence mTitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_sub);
        ViewGroup content = (ViewGroup) findViewById(R.id.container);
        content.removeAllViews();
        getLayoutInflater().inflate(R.layout.activity_sub, content, true);

       // mNavigationDrawerFragment = (NavigationDrawerFragment)getSupportFragmentManager()
        //        .findFragmentById(R.id.fragment_navigation_drawer);

        //mNavigationDrawerFragment.getDrawerToggle().setHomeAsUpIndicator(R.drawable.star_empty);
        mTitle = getTitle();
        toolbar = (Toolbar) findViewById(R.id.app_bar);

        //toolbar.setTitle(mTitle);
//        toolbar.setNavigationIcon(getResources().getDrawable(R.drawable.star_empty));
        setSupportActionBar(toolbar);

        //toolbar.setNavigationIcon(R.drawable.calendar);
        //getSupportActionBar().setDisplayShowHomeEnabled(false);
       // getSupportActionBar().setHomeAsUpIndicator(R.drawable.star_empty);
        //getSupportActionBar().setIcon(getResources().getDrawable(R.drawable.star_empty));
        //getSupportActionBar().setIcon(getResources().getDrawable(R.drawable.star_empty));
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mNavigationDrawerFragment.getDrawerToggle().setDrawerIndicatorEnabled(false);
        //getSupportActionBar().setHomeAsUpIndicator(getResources().getDrawable(R.drawable.star_empty));



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sub, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();



        if (id == android.R.id.home){
            NavUtils.navigateUpFromSameTask(this);
            return true;
        }

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }




}

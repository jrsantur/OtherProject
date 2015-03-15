package com.startup.junior.otherproject;

import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;

import com.startup.junior.otherproject.Fragments.DiscotecasFragment;
import com.startup.junior.otherproject.Fragments.EventsFragment;
import com.startup.junior.otherproject.Fragments.FragmentPerfil;


public class BaseActivity extends ActionBarActivity implements NavigationDrawerFragment.NavigationDrawerCallbacks {

    protected NavigationDrawerFragment mNavigationDrawerFragment;
    private CharSequence mTitle;
    protected String[] listArray = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
    private int positionFragment;
    ViewGroup content;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base);
        content = (ViewGroup) findViewById(R.id.container);
        mNavigationDrawerFragment = (NavigationDrawerFragment)getSupportFragmentManager()
                .findFragmentById(R.id.fragment_navigation_drawer);


        mNavigationDrawerFragment.setUp( R.id.fragment_navigation_drawer,
                (DrawerLayout)findViewById(R.id.drawer_layout),null);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_base, menu);
        return true;
    }
    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        // Sync the toggle state after onRestoreInstanceState has occurred.
        mNavigationDrawerFragment.getDrawerToggle().syncState();
    }

    public void onSectionAttached(int number) {

        switch (number) {
            case 1:
                mTitle = getString(R.string.title_section1);
                break;
            case 2:
                mTitle = getString(R.string.title_section2);
                break;
            case 3:
                mTitle = getString(R.string.title_section3);
                break;
            case 4:
                mTitle = getString(R.string.title_section4);
                break;
            case 5:
                mTitle = getString(R.string.title_section5);
                break;
        }
    }


    @Override
    public void onNavigationDrawerItemSelected(int position) {
        android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
        //fragmentManager.beginTransaction().replace(R.id.container, FragmentPerfil.newInstance(position + 1)).commit();
        onSectionAttached(position+1);
        if(position==0){

            //fragmentManager.beginTransaction().replace(R.id.container, FragmentPerfil.newInstance(position+1)).commit();
            //setTittleToolBar(""+mTitle);
            //toolbar.setTitle(mTitle);

        }
        else if(position==1){
            positionFragment = position;
            //fragmentManager.beginTransaction().remove(EventsFragment.newInstance(position + 1));
            fragmentManager.beginTransaction().replace(R.id.container, EventsFragment.newInstance(position + 1)).commit();
            //setTittleToolBar("" + mTitle);
            //startActivity(new Intent(BaseActivity.this, EventsActivity.class));
        }
        else if(position==2){
            fragmentManager.beginTransaction().replace(R.id.container, DiscotecasFragment.newInstance(position + 1)).commit();
            //setTittleToolBar("" + mTitle);
            //discotecas
            //startActivity(new Intent(BaseActivity.this, DiscotecasActivity.class));
        }
        else if(position==3){
            fragmentManager.beginTransaction().replace(R.id.container, FragmentPerfil.newInstance(position+1)).commit();
            //setTittleToolBar("" + mTitle);
        }else if(position==4){
            fragmentManager.beginTransaction().replace(R.id.container, DiscotecasFragment.newInstance(position + 1)).commit();
            //setTittleToolBar("" + mTitle);
        }
    }

    @Override
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        switch(keyCode) {
            case KeyEvent.KEYCODE_BACK:
                if(positionFragment>1){
                    android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
                    fragmentManager.beginTransaction().replace(R.id.container, EventsFragment.newInstance(positionFragment + 1)).commit();

                }
                return true;
        }
        return super.onKeyUp(keyCode, event);
    }

}

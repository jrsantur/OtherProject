package com.startup.junior.otherproject;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.startup.junior.otherproject.Widget.SlidingTabLayout;


public class DetallesDiscotecasActivity extends BaseActivity {

    Toolbar toolbar;
    ViewPager mViewPager;
    SlidingTabLayout mSlidingTabLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ViewGroup content = (ViewGroup) findViewById(R.id.container);
        getLayoutInflater().inflate(R.layout.activity_detalles_discotecas, content, true);
        //setContentView(R.layout.activity_detalles_discotecas);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles_discotecas);
        toolbar = (Toolbar) findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        mViewPager = (ViewPager) findViewById(R.id.pagerTabs);
        mViewPager.setAdapter(new MyViewPagerTabs(getSupportFragmentManager()));
        mSlidingTabLayout = (SlidingTabLayout) findViewById(R.id.tabs);
        //mSlidingTabLayout.setDistributeEvenly(true);

        mSlidingTabLayout.setCustomTabColorizer(new SlidingTabLayout.TabColorizer() {
            @Override
            public int getIndicatorColor(int position) {
                return getResources().getColor(R.color.tabsScrollColor);
            }
        });
        mSlidingTabLayout.setViewPager(mViewPager);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_detalles_discotecas, menu);
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

    class MyViewPagerTabs extends FragmentPagerAdapter {


        String[] tabs;

        public MyViewPagerTabs(FragmentManager fm) {
            super(fm);
            tabs = getResources().getStringArray(R.array.tabs_array);
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return tabs[position];
        }

        @Override
        public Fragment getItem(int position) {
            Fragment fragment = MyFragment.newInstance(position);
            return fragment;
        }

        @Override
        public int getCount() {
            return 3;
        }
    }

    public static class  MyFragment extends Fragment {


        static Fragment newInstance (int position){
            MyFragment fragment = new MyFragment();
            Bundle args = new Bundle();
            args.putInt("position", position);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

            View rootView = inflater.inflate(R.layout.view_kenburns,container ,false);
            TextView textView = (TextView) rootView.findViewById(R.id.textViewPrueba);
            Bundle args = getArguments();

            if(args!=null){
                textView.setText("la posicion del pa pagina es "+args.getInt("position"));
            }
            return rootView;
        }
    }

}

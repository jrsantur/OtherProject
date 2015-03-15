package com.startup.junior.otherproject.Fragments;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.startup.junior.otherproject.BaseActivity;
import com.startup.junior.otherproject.MainActivity;
import com.startup.junior.otherproject.R;


public class FragmentPerfil extends Fragment {
    private static final String ARG_SECTION_NUMBER = "section_number";

    public static FragmentPerfil newInstance(int sectionNumber){
        FragmentPerfil fragment = new FragmentPerfil();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }
    public FragmentPerfil(){

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_perfil, container, false);

        return rootView;

    }


    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ((BaseActivity) activity).onSectionAttached(
                getArguments().getInt(ARG_SECTION_NUMBER));
    }

}

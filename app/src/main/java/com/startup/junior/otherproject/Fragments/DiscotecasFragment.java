package com.startup.junior.otherproject.Fragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.startup.junior.otherproject.Adapter.DiscotecasAdapter;
import com.startup.junior.otherproject.BaseActivity;
import com.startup.junior.otherproject.MainActivity;
import com.startup.junior.otherproject.Models.Discotecas;
import com.startup.junior.otherproject.R;

import java.util.ArrayList;


public class DiscotecasFragment extends Fragment {


    private static final String ARG_SECTION_NUMBER = "section_number";
    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    MainActivity activity ;



    public static DiscotecasFragment newInstance(int sectionNumber) {
        DiscotecasFragment fragment = new DiscotecasFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activity = (MainActivity) getActivity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_discotecas, container, false);
        ArrayList<Discotecas> data = new ArrayList<Discotecas>();
        //data
        Discotecas disco1 = new Discotecas();
        disco1.setLogo("http://nochesenlima.com/wp-content/themes/volt/scripts/timthumb.php?src=http://nochesenlima.com/wp-content/uploads/2009/08/discoteca.jpg&w=140&h=135&zc=1&q=100");
        disco1.setName("Discoteca Muelle Inn");
        disco1.setAddress("José de la Torre Ugarte 420 – Comas");
        data.add(disco1);
        data.add(disco1);
        data.add(disco1);
        data.add(disco1);
        data.add(disco1);
        data.add(disco1);
        data.add(disco1);
        data.add(disco1);
        data.add(disco1);

        mRecyclerView = (RecyclerView) view.findViewById(R.id.list_recycle);
        mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setAdapter(new DiscotecasAdapter( activity ,getActivity(),data, R.layout.fragment_discotecas_row));
        mRecyclerView.setLayoutManager(mLayoutManager);
        //mRecyclerView.setItemAnimator(new DefaultItemAnimator());

        return view;
    }


    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ((BaseActivity) activity).onSectionAttached(
                getArguments().getInt(ARG_SECTION_NUMBER));
    }

    public interface OnFragmentInteractionListener {
        public void onFragmentInteraction(String id);
    }

}

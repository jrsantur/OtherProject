package com.startup.junior.otherproject.Fragments;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.startup.junior.otherproject.Adapter.EventosAdapter;
import com.startup.junior.otherproject.BaseActivity;
import com.startup.junior.otherproject.MainActivity;
import com.startup.junior.otherproject.Models.Contacts;
import com.startup.junior.otherproject.Models.Discotecas;
import com.startup.junior.otherproject.Models.Eventos;
import com.startup.junior.otherproject.Models.Links;
import com.startup.junior.otherproject.R;

import java.util.ArrayList;


public class EventsFragment extends Fragment {

    private static final String ARG_SECTION_NUMBER = "section_number";

    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    ArrayList<String> Url = new ArrayList<>();
    public ArrayList<Eventos> events= new ArrayList<>();
    public Discotecas discotecas;
    public Contacts contacts;
    public Links links;
    private ProgressDialog pDialog;
    SwipeRefreshLayout mSwipeRefreshLayout;

    public static EventsFragment newInstance(int sectionNumber) {
        EventsFragment fragment = new EventsFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    public EventsFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //dowloadData():
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_events, container, false);
        downloadData();

      // mSwipeRefreshLayout = (SwipeRefreshLayout)rootView.findViewById(R.id.refresh);

        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.list_events);
        mLayoutManager = new LinearLayoutManager(getActivity().getApplicationContext());
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setAdapter(new EventosAdapter(getActivity() ,events, R.layout.fragment_events_row));
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());

        /*
        mSwipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mRecyclerView.setAdapter(new EventosAdapter(getActivity().getSupportFragmentManager(), events, R.layout.fragment_events_row));
                        mRecyclerView.setLayoutManager(mLayoutManager);
                        mSwipeRefreshLayout.setRefreshing(false);
                    }
                }, 2500);
            }
        });*/


        return  rootView ;
    }

    /*
    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        ((BaseActivity) activity).onSectionAttached(
                getArguments().getInt(ARG_SECTION_NUMBER));
    }
    */

    @Override
    public void onDestroyView() {
        super.onDestroyView();
    }

    private void downloadData() {
        events.add(new Eventos("Noche de piratas",
                "Thu Nov 27 2014 09:30:00",
                "",
                "",
                "",
                "",
                "",
                new Discotecas("https://fbcdn-sphotos-d-a.akamaihd.net/hphotos-ak-xpf1/v/t1.0-9/10917852_756568957758484_6479909910170174921_n.jpg?oh=39fccf6a2a418c7132075572ab98195b&oe=5560C8CA&__gda__=1432231584_c072755f943512435f0185baf43887e5","Vertigo",null,0.0,0.0,null),
                null,
                null));

        events.add(new Eventos("Noche de piratas1",
                "Thu Nov 27 2014 09:30:00",
                "",
                "",
                "",
                "",
                "",
                new Discotecas("https://fbcdn-sphotos-d-a.akamaihd.net/hphotos-ak-xpf1/v/t1.0-9/10917852_756568957758484_6479909910170174921_n.jpg?oh=39fccf6a2a418c7132075572ab98195b&oe=5560C8CA&__gda__=1432231584_c072755f943512435f0185baf43887e5","Vertigo",null,0.0,0.0,null),
                null,
                null));

        events.add(new Eventos("Noche de piratas2",
                "Thu Nov 27 2014 09:30:00",
                "",
                "",
                "",
                "",
                "",
                new Discotecas("https://fbcdn-sphotos-d-a.akamaihd.net/hphotos-ak-xpf1/v/t1.0-9/10917852_756568957758484_6479909910170174921_n.jpg?oh=39fccf6a2a418c7132075572ab98195b&oe=5560C8CA&__gda__=1432231584_c072755f943512435f0185baf43887e5","Vertigo",null,0.0,0.0,null),
                null,
                null));
        events.add(new Eventos("Noche de piratas3",
                "Thu Nov 28 2014 09:30:00",
                "",
                "",
                "",
                "",
                "",
                new Discotecas("https://fbcdn-sphotos-d-a.akamaihd.net/hphotos-ak-xpf1/v/t1.0-9/10917852_756568957758484_6479909910170174921_n.jpg?oh=39fccf6a2a418c7132075572ab98195b&oe=5560C8CA&__gda__=1432231584_c072755f943512435f0185baf43887e5","Vertigo",null,0.0,0.0,null),
                null,
                null));
        events.add(new Eventos("Noche de piratas4",
                "Thu Nov 28 2014 09:30:00",
                "",
                "",
                "",
                "",
                "",
                new Discotecas("https://fbcdn-sphotos-d-a.akamaihd.net/hphotos-ak-xpf1/v/t1.0-9/10917852_756568957758484_6479909910170174921_n.jpg?oh=39fccf6a2a418c7132075572ab98195b&oe=5560C8CA&__gda__=1432231584_c072755f943512435f0185baf43887e5","Vertigo",null,0.0,0.0,null),
                null,
                null));



        /*
        String urlJsonArry = "http://10.0.3.3:3000/events/allevent/events.json";
        pDialog.setMessage("Loading...");
        showpDialog();
        JsonArrayRequest request = new JsonArrayRequest(urlJsonArry, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                Log.d(getActivity().getClass().getSimpleName(), response.toString());
                try {

                    for (int i = 0; i < response.length(); i++) {
                        JSONObject event = (JSONObject) response.get(i);

                        //JSONObject eventsObject = event.getJSONObject("Eventososs");
                        String title = event.getString("title");
                        String starTime = event.getString("startTime");
                        String summary = event.getString("summary");
                        String descripcion = event.getString("description");
                        //separamos las urls
                        String url = event.getString("urls");
                        Url = new EventsControllers().separarLinks(url);

                        JSONObject venue = event.getJSONObject("venue");
                        String logo = venue.getString("logo");
                        String nameVenue = venue.getString("name");
                        String addressVenue = venue.getString("address");
                        String latitudVenue = venue.getString("latitud");
                        double latitud = Double.parseDouble(latitudVenue);
                        String logitudVenue = venue.getString("longitud");
                        double longitud = Double.parseDouble(logitudVenue);
                        String webVenue = venue.getString("website");
                        discotecas = new Discotecas(logo ,nameVenue, addressVenue, latitud, longitud, webVenue);

                        JSONObject contact = event.getJSONObject("contacts");
                        String nameContact = contact.getString("name");
                        String emailContact = contact.getString("email");
                        String telefonoContact = contact.getString("telefono");
                        contacts = new Contacts(nameContact, emailContact, telefonoContact);

                        JSONObject link = event.getJSONObject("links");
                        String linkFacebook = link.getString("facebook");
                        String linkTwitter = link.getString("twitter");
                        links = new Links(linkFacebook, linkTwitter);

                        events.add(new Eventos(title,
                                starTime,
                                summary,
                                descripcion,
                                Url.get(0),
                                Url.get(1),
                                Url.get(2),
                                discotecas,
                                contacts,
                                links));

                        //informationEventItem.add(events.get(1).getStartTime().getTime());

                        Toast.makeText(getActivity().getApplicationContext(), "Esta todo bien", Toast.LENGTH_LONG).show();
                    }
                } catch (JSONException ex) {
                    ex.printStackTrace();
                    Log.e("Error", "" + ex);
                }
                hidepDialog();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                VolleyLog.d(getActivity().getClass().getSimpleName(), "Error: " + error.getMessage());
                Toast.makeText(getActivity().getApplicationContext(),
                        error.getMessage(), Toast.LENGTH_LONG).show();
                hidepDialog();
            }
        });
        //adding request to request queue
        AppController1.getInstance(getActivity().getApplicationContext()).addToRequestQueue(request);
    */
    }


    private void showpDialog() {
        if (!pDialog.isShowing())
            pDialog.show();
    }

    private void hidepDialog() {
        if (pDialog.isShowing())
            pDialog.dismiss();
    }







}

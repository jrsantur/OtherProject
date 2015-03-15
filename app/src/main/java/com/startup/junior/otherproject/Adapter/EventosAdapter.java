package com.startup.junior.otherproject.Adapter;


import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;
import com.startup.junior.otherproject.Controllers.EventsControllers;
import com.startup.junior.otherproject.DetallesEventoActivity;
import com.startup.junior.otherproject.Models.Eventos;
import com.startup.junior.otherproject.Models.FechaEvento;
import com.startup.junior.otherproject.Network.AppController;
import com.startup.junior.otherproject.R;

import java.util.ArrayList;

/**
 * Created by Junior on 10/01/2015.
 */
public class EventosAdapter extends RecyclerView.Adapter<EventosAdapter.ViewHolder>{

    ArrayList<Eventos> dataEventos = new ArrayList<>();
    ArrayList<FechaEvento> fechaEventos = new ArrayList<>();
    ArrayList<FechaEvento> fechaEventosAux = new ArrayList<>();
    ArrayList<Integer> posiciones = new ArrayList<>();
    //FragmentManager manager;
    Context context;
    private int itemLayput;
    int espacio=0;



    public EventosAdapter( Context context,ArrayList<Eventos> data, int itemLayput) {
        this.context = context;
        //this.manager = manager;
        this.dataEventos = data;
        Log.e("Error: ","el tamano de la data es "+data.size());
        for(int i=0; i<data.size(); i++){
            fechaEventosAux.add(new EventsControllers().getDataFecha(data.get(i).getStartTime()));
        }
        eliminarFechasRepetidos();
        this.itemLayput = itemLayput;

    }

    public void eliminarFechasRepetidos(){

        int index=1;
        int inicial =0;

        while(index<fechaEventosAux.size()){
            if(fechaEventosAux.get(index).getNumeroDia().equals(fechaEventosAux.get(inicial).getNumeroDia())){
                fechaEventosAux.get(index).setNumeroDia("");
                fechaEventosAux.get(index).setDia("");
                index++;
            }else {
                inicial=index;
                index=index+1;
                posiciones.add(inicial);
                espacio = 16;
            }
        }
       fechaEventos=fechaEventosAux;
    }


    @Override
    public EventosAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View  rootView = LayoutInflater.from(parent.getContext()).inflate(itemLayput, parent, false);
        return new ViewHolder(rootView);
    }

    @Override
    public void onBindViewHolder(EventosAdapter.ViewHolder holder, int position) {

        ImageLoader imageLoader = AppController.getInstance().getImageLoader();
        holder.nunDia.setText(dataEventos.get(position).getStartTime());
        holder.imgEvent.setImageUrl(dataEventos.get(position).getUrlImage1(),imageLoader);
        holder.nameEvent.setText(dataEventos.get(position).getTitle());
        holder.nunDia.setText(fechaEventos.get(position).getNumeroDia());
        holder.dia.setText(fechaEventos.get(position).getDia());
        holder.horaEvent.setText(fechaEventos.get(position).getHora()+":"+fechaEventos.get(position).getMinuto());
        holder.nameDisco.setText(dataEventos.get(position).getDiscotecas().getName());

    }

    @Override
    public int getItemCount() {
        return dataEventos.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView nunDia;
        TextView dia;
        NetworkImageView imgEvent;
        TextView nameEvent;
        TextView horaEvent;
        TextView nameDisco;
        LinearLayout content;


        public ViewHolder(View itemView) {
            super(itemView);
            nunDia = (TextView) itemView.findViewById(R.id.num_dia_event);
            dia = (TextView) itemView.findViewById(R.id.dia_event);
            imgEvent = (NetworkImageView) itemView.findViewById(R.id.imageEvent);
            nameEvent = (TextView) itemView.findViewById(R.id.nameEvent);
            horaEvent = (TextView) itemView.findViewById(R.id.hourEvent);
            nameDisco = (TextView) itemView.findViewById(R.id.nameDiscoteca);
            content = (LinearLayout) itemView.findViewById(R.id.content);
            itemView.setOnClickListener(this);
        }


        @Override
        public void onClick(View v) {
            //android.support.v4.app.FragmentManager fragmentManager = manager;
            //fragmentManager.beginTransaction().replace(R.id.container, FragmentPerfil.newInstance(1)).commit();
            context.startActivity(new Intent(context, DetallesEventoActivity.class));
        }

    }




}

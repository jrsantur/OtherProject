package com.startup.junior.otherproject.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.NetworkImageView;
import com.startup.junior.otherproject.DetallesDiscotecasActivity;
import com.startup.junior.otherproject.DetallesEventoActivity;
import com.startup.junior.otherproject.MainActivity;
import com.startup.junior.otherproject.Models.Discotecas;
import com.startup.junior.otherproject.Network.AppController;
import com.startup.junior.otherproject.R;

import java.util.ArrayList;

/**
 * Created by Junior on 28/01/2015.
 */
public class DiscotecasAdapter  extends RecyclerView.Adapter<DiscotecasAdapter.ViewHolder> {

    private  final int ALL_DAYS_EVENTS = 1;
    MainActivity mainActivity;
    private ArrayList<Discotecas> dataDiscoteca;
    private int itemLayput;
    private Context context;
    private android.support.v4.app.FragmentManager fragmentManager;

    public DiscotecasAdapter(MainActivity activity ,Context context, ArrayList<Discotecas> data  , int itemLayput ) {
        this.context=context;
        this.dataDiscoteca=data;
        this.itemLayput = itemLayput;
        mainActivity = activity ;
        fragmentManager = mainActivity.getSupportFragmentManager();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View rootView = LayoutInflater.from(parent.getContext()).inflate(itemLayput, parent, false);
        return new ViewHolder(rootView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        Discotecas discos = dataDiscoteca.get(position);
        ImageLoader imageLoader = AppController.getInstance().getImageLoader();
        imageLoader.get(discos.getLogo(), ImageLoader.getImageListener(holder.logo, R.drawable.no_image, R.drawable.error_image));
        holder.logo.setImageUrl(discos.getLogo(),imageLoader);
        holder.nombre.setText(discos.getName());
        //holder.descripcion.setText(discos.getWebsite());
        holder.direccion.setText(discos.getAddress());
        holder.ratingBar.setRating(3);

    }

    @Override
    public int getItemCount() {
        return dataDiscoteca.size();
    }

    public class ViewHolder extends  RecyclerView.ViewHolder implements View.OnClickListener{
        NetworkImageView logo;
        TextView nombre;
        //TextView descripcion;
        TextView direccion;
        RatingBar ratingBar;



        public ViewHolder(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            logo = (NetworkImageView)itemView.findViewById(R.id.logo_discoteca);
            nombre = (TextView)itemView.findViewById(R.id.nombreDiscoteca);
            //descripcion = (TextView)itemView.findViewById(R.id.descripcionDiscoteca);
            direccion = (TextView)itemView.findViewById(R.id.direccionDiscoteca);
            ratingBar = (RatingBar)itemView.findViewById(R.id.ratingDiscoteca);

        }

        @Override
        public void onClick(View v) {
            Toast.makeText(context, "Item posicion" + getPosition(), Toast.LENGTH_LONG);
            //fragmentManager.beginTransaction().replace(R.id.container, FragmentPerfil.newInstance(getPosition() + 1)).commit();
            context.startActivity(new Intent(context, DetallesDiscotecasActivity.class));


            //Log.e( "Accion","onClick " + getPosition() );
           //Log.e( "Accion","Prueba " + mainActivity.getApplication().getPackageCodePath() );

            //fragmentManager.beginTransaction().replace(R.id.all_days_event_fragment, AllDayEventFragment.newInstance()).commit();

           // mainActivity.showFragment(0, false);
           // FragmentTransaction transation = fragmentPadre.getFragmentManager().beginTransaction();
           // transation.replace(R.id.container, fragment );
           // transation.commit();

        }









    }
}

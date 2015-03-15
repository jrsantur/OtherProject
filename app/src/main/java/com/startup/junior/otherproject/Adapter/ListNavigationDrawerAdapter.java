package com.startup.junior.otherproject.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.startup.junior.otherproject.Models.ItemListNavigationDrawer;
import com.startup.junior.otherproject.R;

import java.util.ArrayList;

/**
 * Created by Junior on 11/11/2014.
 */
public class ListNavigationDrawerAdapter extends BaseAdapter{

    private static final int TYPE_HEADER = 0;  // Declaring Variable to Understand which View is being worked on
    // IF the view under inflation and population is header or Item
    private static final int TYPE_ITEM = 1;
    private Context context;
    private LayoutInflater inflater;
    private int[] selectedposition;
    private ArrayList<ItemListNavigationDrawer> mItemListNavigationDrawer;
    private String name;        //String Resource for header View Name
    private int profile;        //int Resource for header view profile picture
    private String email;       //String Resource for header view email


    public ListNavigationDrawerAdapter(Context context, ArrayList<ItemListNavigationDrawer> mItemListNavigationDrawer, int[] selectedposition) {
        super();
        this.context = context;
        this.mItemListNavigationDrawer = mItemListNavigationDrawer;
        this.inflater = LayoutInflater.from(this.context);
        this.selectedposition = selectedposition;
    }

    @Override

    public int getCount() {
        return mItemListNavigationDrawer.size();
    }

    @Override
    public Object getItem(int i) {
        return mItemListNavigationDrawer.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        Holder holder;
        View header;
        if(view==null){
            holder = new Holder();
            ItemListNavigationDrawer itm = mItemListNavigationDrawer.get(position);
            view = inflater.inflate(R.layout.row_list_navigation_drawer, null);
            //header = inflater.inflate(R.layout.header,null);

            holder.titleAction = (TextView)view.findViewById(R.id.title_item);
            holder.titleAction.setText(itm.getTitulo());
            holder.iconAction = (ImageView)view.findViewById(R.id.icon_item);
            holder.iconAction.setImageResource(itm.getIcono());

            view.setTag(holder);
        }else{
            holder= (Holder)view.getTag();
        }


       /* if(selectedposition[position]==position){
            view.setBackgroundColor(Color.WHITE);
            holder.titleAction.setTextColor(Color.BLUE);
        }else{
            view.setBackgroundColor(Color.TRANSPARENT);
            holder.titleAction.setTextColor(Color.WHITE);
        }
        */
        return view;
    }

    public static class Holder {
        TextView titleAction = null ;
        ImageView iconAction = null;
        ImageView profile;
        TextView Name;
        TextView email;
    }
}

package com.example.hp_user.intiadmin.classes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.hp_user.intiadmin.R;

import java.util.ArrayList;

public class csAdapter extends BaseAdapter {
    Context c;
    int rLayout;
    ArrayList<csCourse> ldata;

    public csAdapter(Context c, int rLayout, ArrayList<csCourse> ldata) {
        this.c = c;
        this.rLayout = rLayout;
        this.ldata = ldata;
    }
    @Override
    public int getCount()
        {
            return ldata.size();
        }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {
        convertView= LayoutInflater.from(c).inflate(rLayout,null);
        TextView t1=(TextView)convertView.findViewById(R.id.t1);
        TextView t2=(TextView)convertView.findViewById(R.id.t2);
        TextView t3=(TextView)convertView.findViewById(R.id.t3);
        TextView t4=(TextView)convertView.findViewById(R.id.t4);
        TextView t5=(TextView)convertView.findViewById(R.id.t5);

        t1.setText(ldata.get(position).get_id()+"");
        t2.setText(ldata.get(position).getCname()+"");
        t3.setText(ldata.get(position).getFee()+"");
        t4.setText(ldata.get(position).getDuration()+"");
        t5.setText(ldata.get(position).getAbout()+"");

        return convertView;
    }
}

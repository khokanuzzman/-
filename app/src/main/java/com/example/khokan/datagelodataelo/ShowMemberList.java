package com.example.khokan.datagelodataelo;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import static com.example.khokan.datagelodataelo.R.id.member_img;

/**
 * Created by USER on 8/5/2018.
 */

public class ShowMemberList  extends ArrayAdapter<String> {
    private int []showimage;
    private String [] shownames;
    private String [] showphone;
    private String [] showregistration;
    private Activity context;

    public ShowMemberList(@NonNull Context context, int[] image, String[] names, String[] registration, String[] phone) {
        super(context,  R.layout.sdmgap_layout,names);
        this.showimage = image;
        this.shownames = names;
        this.showphone = phone;
        this.showregistration = registration;
        this.context =(Activity)context;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;
        ViewHolder viewHolder = null;
        if (view == null){
            LayoutInflater layoutInflater =context.getLayoutInflater();
            view=layoutInflater.inflate(R.layout.sdmgap_layout,null,true);
            viewHolder = new ViewHolder(view);
            view.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) view.getTag();
        }
        try{
            viewHolder.m_image.setImageResource(showimage[position]);
            viewHolder.m_name.setText(shownames[position]);
            viewHolder.m_reg.setText(showregistration[position]);
            viewHolder.m_phone.setText(showphone[position]);
        }catch (Exception e){
            e.getCause();
        }

        return view;
    }

    class ViewHolder{
        TextView m_name,m_reg,m_phone,m_batch;
        ImageView m_image;
        ViewHolder (View v){
            m_image=v.findViewById(member_img);
            m_name = v.findViewById(R.id.member_namme_id);
            m_phone = v.findViewById(R.id.member_contact_id);
            m_reg = v.findViewById(R.id.member_registration_id);
            m_batch = v.findViewById(R.id.member_batch_id);
        }
    }
}

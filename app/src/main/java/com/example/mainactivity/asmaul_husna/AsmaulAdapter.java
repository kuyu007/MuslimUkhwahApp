package com.example.mainactivity.asmaul_husna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.mainactivity.R;

class AsmaulAdapter extends BaseAdapter {
    private Context mContext;
    private String[] indohusna;
    private String[] arabhusna;
    public AsmaulAdapter(Asmaul_Husna_Main asmaulHusnaMain, String[] indohusna, String[] arabhusna) {
        this.arabhusna = arabhusna;
        this.indohusna = indohusna;
        mContext = asmaulHusnaMain;

    }

    public AsmaulAdapter(String[] indohusna, String[] arabhusna) {
    }

    @Override    public int getCount() {
        return arabhusna.length;
    }

    @Override    public Object getItem(int position) {
        return null;
    }

    @Override    public long getItemId(int position) {
        return 0;
    }

    @Override    public View getView(int position, View convertView, ViewGroup parent) {
        View tampilan = LayoutInflater.from(mContext).inflate(R.layout.item,null);
        TextView txtarab = (TextView) tampilan.findViewById(R.id.txtarab);
        TextView txtindo = (TextView) tampilan.findViewById(R.id.txtindo);
        txtarab.setText(arabhusna[position]);
        txtindo.setText(indohusna[position]);
        return tampilan;
    }
}


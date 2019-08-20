package com.example.mainactivity.produk_halal;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.mainactivity.R;

import java.util.ArrayList;

public class List_Produk_Halal_Adapter extends RecyclerView.Adapter<List_Produk_Halal_Adapter.ProdukHolder> {
    private ArrayList<Data_Produk_Halal> listproduk;

    public List_Produk_Halal_Adapter (ArrayList<Data_Produk_Halal> listproduk){
        this.listproduk = listproduk;
    }


    @Override
    public ProdukHolder onCreateViewHolder(ViewGroup parent, int position) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return  new ProdukHolder(inflater.inflate(R.layout.item_produk_halal,parent,false));
    }

    @Override
    public void onBindViewHolder( ProdukHolder holder, int position) {
        holder.bind(listproduk.get(position));

    }

    @Override
    public int getItemCount() {
        return listproduk.size();
    }

    public  class ProdukHolder extends RecyclerView.ViewHolder {
        private TextView mProduk;
        private TextView mSertifikat;
        private TextView mProdusen;
        private TextView mBerlaku;

        public ProdukHolder( View itemView) {
            super(itemView);

            mProduk = (TextView)itemView.findViewById(R.id.tv_nama);
            mSertifikat = (TextView)itemView.findViewById(R.id.tv_no_sertifikat);
            mProdusen = (TextView)itemView.findViewById(R.id.tv_produsen);
            mBerlaku = (TextView)itemView.findViewById(R.id.tv_berlaku);
        }
        public void bind(Data_Produk_Halal data_produk_halal){
            mProduk.setText(data_produk_halal.nama);
            mSertifikat.setText(data_produk_halal.no_sertifikat);
            mProdusen.setText(data_produk_halal.produsen);
            mBerlaku.setText(data_produk_halal.berlaku);
        }
    }
}



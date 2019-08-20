package com.example.mainactivity.produk_halal;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.ProgressBar;
import android.widget.SearchView;

import com.example.mainactivity.R;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Produk_Halal extends AppCompatActivity {

    private List_Produk_Halal_Adapter mAdapter;
    private ArrayList<Data_Produk_Halal> mListProduk;
    private SearchView searchView;
    private RecyclerView recyclerView;
    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produk__halal);

        recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        searchView = (SearchView)findViewById(R.id.search_view);
        progressBar = (ProgressBar)findViewById(R.id.progress_bar);

        mListProduk = new ArrayList<Data_Produk_Halal>();
        mAdapter = new List_Produk_Halal_Adapter(mListProduk);

        LinearLayoutManager mLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this,
                mLayoutManager.getOrientation()));
        recyclerView.setAdapter(mAdapter);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                loadData(s);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                return false;
            }
        });
    }
    private void loadData(String kw) {
        Log.d("KW_DATA", kw);
        try {
            String url = "?menu=nama_produk&query="+kw;
            ClientAsyncTask_PH task = new ClientAsyncTask_PH(this, url, new
                    ClientAsyncTask_PH.OnPostExecuteListener() {
                        @Override
                        public void onPostExecute(String result) {
                            Log.d("HalalData", result);
                            try {
                                JSONObject jsonObject = new JSONObject(result);
                                JSONArray jsonArray = jsonObject.getJSONArray("data");

                                mListProduk.clear();
                                for (int i = 0; i < jsonArray.length(); i++) {
                                    JSONObject object = jsonArray.getJSONObject(i);
                                    Data_Produk_Halal produk = new Data_Produk_Halal();
                                    produk.nama = object.getString("nama_produk");
                                    produk.no_sertifikat = object.getString("nomor_sertifikat");
                                    produk.produsen = object.getString("nama_produsen");
                                    produk.berlaku = object.getString("berlaku_hingga");
                                    mListProduk.add(produk);
                                }
                                mAdapter.notifyDataSetChanged();
                            }catch (JSONException e){
                                e.printStackTrace();

                            }
                        }
                    });
            task.setmProgress(this.progressBar);
            task.execute();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}

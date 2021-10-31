package com.example.tugas4_recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BarangAdapter extends RecyclerView.Adapter<BarangAdapter.BarangViewHolder> {
    private ArrayList<Barang> dataList;
    public BarangAdapter(ArrayList<Barang> dataList){
        this.dataList = dataList;
    }

    public BarangAdapter.BarangViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_barang, parent, false);
        return new BarangViewHolder(view);
    }

    public void onBindViewHolder(BarangViewHolder holder, int position){
        holder.txt_NamaBarang.setText(dataList.get(position).getNama());
        holder.txt_Ukuran.setText(dataList.get(position).getUkuran());
        holder.txt_Harga.setText(dataList.get(position).getHarga());
        holder.foto.setImageResource(dataList.get(position).getFoto());
    }

    public int getItemCount(){
        return (dataList != null) ? dataList.size() : 0;
    }

    public class BarangViewHolder extends RecyclerView.ViewHolder{
        private TextView txt_NamaBarang, txt_Ukuran, txt_Harga;
        private ImageView foto;
        public BarangViewHolder(View itemView){
            super(itemView);
            txt_NamaBarang  = (TextView)itemView.findViewById(R.id.txt_namabarang);
            txt_Ukuran      = (TextView)itemView.findViewById(R.id.txt_ukuran);
            txt_Harga       = (TextView)itemView.findViewById(R.id.txt_harga);
            foto            = (ImageView) itemView.findViewById(R.id.foto);
        }
    }
}

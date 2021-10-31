package com.example.tugas4_recyclerview;

public class Barang {
    private String nama, ukuran, harga;
    private  int foto;

    public Barang(String nama, String ukuran, String harga, int foto){
        this.nama   = nama;
        this.ukuran = ukuran;
        this.harga  = harga;
        this.foto   = foto;
    }

    public String getNama() {return nama;}
    public void setNama(String nama) {this.nama = nama;}

    public String getUkuran() {return ukuran;}
    public void setUkuran(String ukuran) {this.ukuran = ukuran;}

    public String getHarga() {return harga;}
    public void setHarga(String harga) {this.harga = harga;}

    public int getFoto() {return foto;}
    public void setFoto(int foto) {this.foto = foto;}
}

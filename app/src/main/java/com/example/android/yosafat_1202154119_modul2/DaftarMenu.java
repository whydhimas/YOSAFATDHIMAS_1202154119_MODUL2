package com.example.android.yosafat_1202154119_modul2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class DaftarMenu extends AppCompatActivity {

    //membuat elemen private arraylist dan recyclerview
    private ArrayList<String> title_makanan;
    private ArrayList<Integer> gambar_makanan;
    private ArrayList<String> harga_makanan;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    //daftar nama makanan dibentuk sebagai array
    private String[] Makanan = {  "Ayam Goreng Ny. Suharti",
                                  "Gudeg Asli Mbah Lindu",
                                  "Ketoprak Jakarta",
                                  "Nasi Pecel Tumpang",
                                  "Soto Madura Asli Suramadu",
                                  "Soto Seger Mbok Giyem",
                                  "Tahu Kupat Khas Solo"  };

    //daftar gambar makanan dibentuk sebagai array
    private int[] Gambar = {R.drawable.ayam_bakar_suharti,
                            R.drawable.gudeg_yogya,
                            R.drawable.ketoprak_jakarta,
                            R.drawable.pecel_tumpang,
                            R.drawable.soto_madura,
                            R.drawable.soto_seger_mbok_giyem,
                            R.drawable.tahu_kupat_solo};

    //daftar harga makanan dibentuk sebagai array
    private String[] Harga = {  "Harga: Rp 30.000,-",
                                "Harga: Rp 25.000,-",
                                "Harga: Rp 15.000,-",
                                "Harga: Rp 6.000,-",
                                "Harga: Rp 17.000,-",
                                "Harga: Rp 6.000,-",
                                "Harga: Rp 11.000,-", };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_menu);

        //mengidentifikasi variabel pada array
        title_makanan = new ArrayList<>();
        gambar_makanan = new ArrayList<>();
        harga_makanan = new ArrayList<>();
        recyclerView = findViewById(R.id.recycler);
        daftar_menu();

        //membuat layout manager dan membuat list dengan vertical
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        adapter = new RecyclerViewAdapter(title_makanan, gambar_makanan, harga_makanan);

        //adapter dipasang dalam recyclerview
        recyclerView.setAdapter(adapter);
    }

    private void daftar_menu() {
        //membuat perulangan sesuai data yang diketahui
        for (int dm=0; dm<Makanan.length; dm++){
            gambar_makanan.add(Gambar[dm]);
            title_makanan.add(Makanan[dm]);
            harga_makanan.add(Harga[dm]);
        }
    }
}

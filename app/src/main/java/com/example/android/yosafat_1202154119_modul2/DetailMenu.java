package com.example.android.yosafat_1202154119_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class DetailMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu);

        //menghubungkan antara textview, dan image dengan beberapa variabel
        TextView nama_makanan = (TextView) findViewById(R.id.textview_detailmenu);
        TextView harga_makanan = (TextView) findViewById(R.id.textview_detailprice);
        ImageView image_makanan = (ImageView) findViewById(R.id.imageview_detailmenu);
        TextView komposisi_makanan = (TextView) findViewById(R.id.textview_isi_komposisi);

        //mengambil activity yang dikirim
        Intent getintent = getIntent();
        //berisi suatu data dari activity pengirim
        String namamakan = getintent.getStringExtra("namamakan");
        String hargamakan = getintent.getStringExtra("hargamakan");
        Integer gambarmakan = getintent.getIntExtra("gambarmakan",0);
        String komposisimakan = getintent.getStringExtra("komposisimakan");

        //menampilkan data dengan settext ke string dari intent extra
        nama_makanan.setText(namamakan);
        harga_makanan.setText(hargamakan);
        image_makanan.setImageResource(gambarmakan);
        komposisi_makanan.setText(komposisimakan);

    }
}

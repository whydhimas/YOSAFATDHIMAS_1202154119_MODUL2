package com.example.android.yosafat_1202154119_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class DineIn extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dine_in);

        // menghubungkan instance spinner dengan spinner_meja dan menerapkan OnItemSelectedListener diatas
        Spinner spin = (Spinner) findViewById(R.id.spinner_meja);

        //membuat arrayadapter menggunakan string array dan layout spinner default
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.tables_array, android.R.layout.simple_spinner_item);

        //menentukan tata letak yang akan digunakan pada saat daftar list muncul
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        //menerapkan adapter ke spinner
        if (spin != null) {
            spin.setAdapter(adapter);
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int position,long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {

    }

    public void onClickPilihPesanan(View view) {
        //ketika button diklik maka intent melakukan pengiriman pesan data ke class DaftarMenu
        Intent intent = new Intent(this,DaftarMenu.class);
        startActivity(intent);
    }
}
package com.example.android.yosafat_1202154119_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class TakeAway extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_away);
    }

    public void onClickPilihPesanan(View view) {
        //membuat perpindahan dengan intent ke class daftarmenu
        Intent intent = new Intent(this,DaftarMenu.class);
        startActivity(intent);
    }

    public void onClickDatePicker(View view) {

    }
}

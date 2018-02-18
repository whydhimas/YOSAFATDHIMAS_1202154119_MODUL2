package com.example.android.yosafat_1202154119_modul2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //menampilkan toast ketika masuk ke activity utama
        Toast.makeText(this,"YOSAFAT DHIMAS_1202154119",Toast.LENGTH_SHORT).show();
    }

    public void onClickPilihSekarang(View view) {
        //jika radio dipilih dan klik pada button maka memindahkan halaman ke class target sesuai intent
        if(((RadioButton)findViewById(R.id.radio_pilihmenu1)).isChecked()){
            Intent intent = new Intent(this, DineIn.class);
            Toast.makeText(this, "Dine In", Toast.LENGTH_SHORT).show();
            startActivity(intent);
        } else if (((RadioButton)findViewById(R.id.radio_pilihmenu2)).isChecked()){
            Intent intent = new Intent(this, TakeAway.class);
            Toast.makeText(this, "Take Away", Toast.LENGTH_SHORT).show();
            startActivity(intent);
        }else{
            //ketika radio tidak dipilih maka menampilkan toast seperti ini
            Toast.makeText(this,"Pilih salah satu terlebih dahulu",Toast.LENGTH_SHORT).show();
        }
    }
}

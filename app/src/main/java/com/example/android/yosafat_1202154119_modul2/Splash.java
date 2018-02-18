package com.example.android.yosafat_1202154119_modul2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;

/**
 * Created by Yosafat Dhimas on 17/02/2018.
 */

public class Splash extends Activity {
    //membuat ukuran waktu untuk tampilan splash
    private final int SPLASH_DISPLAY_LENGTH = 3000;

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.splash);

        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                //membuat intent yang akan menuju ke mainactivity
                startActivity(new Intent(Splash.this,MainActivity.class));
                finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }
}

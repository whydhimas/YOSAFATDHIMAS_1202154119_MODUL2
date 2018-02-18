package com.example.android.yosafat_1202154119_modul2;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;


public class TakeAway extends AppCompatActivity {

    //membuat elemen private
    private DatePickerDialog datePickerDialog;
    private SimpleDateFormat date_format;
    private TextView txtview_date_result;
    private Button btn_date_picker;

    private TimePickerDialog timePickerDialog;
    private TextView txtview_time_result;
    private Button btn_time_picker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_take_away);

        //format tanggal yang akan digunakan yaitu dd-mm-yyyy
        date_format = new SimpleDateFormat("dd-MM-yyyy", Locale.US);

        //menghubungkan variabel dengan textview dan button sehingga sinkron
        txtview_date_result = (TextView) findViewById(R.id.textview_datepicker);
        btn_date_picker = (Button) findViewById(R.id.button_datepicker);

        //membuat onclicklistener berdasarkan id dari button
        btn_date_picker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDateDialog();
            }
        });

        //menghubungkan variabel dengan textview
        txtview_time_result = (TextView) findViewById(R.id.textview_timepicker);
        btn_time_picker = (Button) findViewById(R.id.button_timepicker);

        //membuat onclicklistener berdasarkan id dari button
        btn_time_picker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showTimeDialog();
            }
        });
    }

    private void showDateDialog() {
        Calendar newCalendar = Calendar.getInstance();

        //menampilkan tampilan datepicker
        datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {

            //method ini digunakan ketika selesai memilih tanggal pada datepicker
            @Override
            public void onDateSet(android.widget.DatePicker view, int year, int monthOfYear, int dayOfMonth) {

                //melakukan set calendar untuk menampung tanggal yang dipilih
                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);

                //textview berubah menyesuaikan ketika sudah memilih tanggal
                txtview_date_result.setText("Date : "+date_format.format(newDate.getTime()));
            }
        },newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));
        datePickerDialog.show();
    }

    private void showTimeDialog() {
        Calendar calendar = Calendar.getInstance();

        //menampilkan tampilan timepicker
        timePickerDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {

                //method ini digunakan ketika setelah memilih waktu pada datepicker
                txtview_time_result.setText("Time : "+hourOfDay+":"+minute);
            }
        },
                //menampilkan waktu saat ini ketika timepicker diklik
                calendar.get(Calendar.HOUR_OF_DAY), calendar.get(Calendar.MINUTE),

                //mengecek format waktu sesuai format 24 jam
                DateFormat.is24HourFormat(this));
        timePickerDialog.show();
    }

    public void onClickPilihPesanan(View view) {
        //membuat perpindahan dengan intent ke class daftarmenu
        Intent intent = new Intent(this,DaftarMenu.class);
        startActivity(intent);
    }
}

package com.example.android.yosafat_1202154119_modul2;

/**
 * Created by Yosafat Dhimas on 18/02/2018.
 */

import android.content.Context;
import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

//berfungsi untuk mengatur data ketika akan ditampilkan pada class ini
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    private ArrayList<String> array_name; //untuk nama makanan
    private ArrayList<String> array_harga; //untuk harga makanan
    private ArrayList<Integer> menuList; //untuk gambar makanan

    private Context context;

    //membuat constructor di recyclerviewadapter
    RecyclerViewAdapter(ArrayList<String> array_name, ArrayList<Integer> menuList, ArrayList<String> array_harga){
        this.array_name = array_name;
        this.array_harga = array_harga;
        this.menuList = menuList;
    }

    //berfungsi untuk menyimpan referensi dari view yang digunakan
    class ViewHolder extends RecyclerView.ViewHolder{
        private TextView title_makanan, harga_makanan;
        private ImageView gambar_makanan;
        private RelativeLayout item_list;

        ViewHolder(View itemView) {
            super(itemView);
            context = itemView.getContext();

            //inisiasi view yang ada untuk digunakan pada recyclerview
            title_makanan = itemView.findViewById(R.id.textview_judulmakanan);
            harga_makanan = itemView.findViewById(R.id.textview_harga);
            gambar_makanan = itemView.findViewById(R.id.img_makanan);
            item_list = itemView.findViewById(R.id.item_list);

            item_list.setOnClickListener(new View.OnClickListener() {
                @Override
                //yang dilakukan ketika relativelayout diklik maka melakukan pengambilan keputusan dengan banyak alternatif pilihan
                public void onClick(View view) {
                    Intent intent = new Intent(context, DetailMenu.class);
                    switch (getAdapterPosition()){
                        case 0 :
                            intent.putExtra("namamakan",array_name.get(getAdapterPosition()));
                            intent.putExtra("hargamakan",array_harga.get(getAdapterPosition()));
                            intent.putExtra("gambarmakan",menuList.get(getAdapterPosition()));
                            String komposisi = "Rahasia";
                            intent.putExtra("komposisimakan",komposisi);
                            context.startActivity(intent);
                            break;

                        case 1 :
                            intent.putExtra("namamakan",array_name.get(getAdapterPosition()));
                            intent.putExtra("hargamakan",array_harga.get(getAdapterPosition()));
                            intent.putExtra("gambarmakan",menuList.get(getAdapterPosition()));
                            komposisi = "Apa hayooo";
                            intent.putExtra("komposisimakan",komposisi);
                            context.startActivity(intent);
                            break;

                        case 2 :
                            intent.putExtra("namamakan",array_name.get(getAdapterPosition()));
                            intent.putExtra("hargamakan",array_harga.get(getAdapterPosition()));
                            intent.putExtra("gambarmakan",menuList.get(getAdapterPosition()));
                            komposisi= "Makan dulu biar tahu rasanya";
                            intent.putExtra("komposisimakan",komposisi);
                            context.startActivity(intent);
                            break;

                        case 3 :
                            intent.putExtra("namamakan",array_name.get(getAdapterPosition()));
                            intent.putExtra("hargamakan",array_harga.get(getAdapterPosition()));
                            intent.putExtra("gambarmakan",menuList.get(getAdapterPosition()));
                            komposisi = "Dih kepoo";
                            intent.putExtra("komposisimakan",komposisi);
                            context.startActivity(intent);
                            break;

                        case 4 :
                            intent.putExtra("namamakan",array_name.get(getAdapterPosition()));
                            intent.putExtra("hargamakan",array_harga.get(getAdapterPosition()));
                            intent.putExtra("gambarmakan",menuList.get(getAdapterPosition()));
                            komposisi = "Waduhh apa hayooo";
                            intent.putExtra("komposisimakan",komposisi);
                            context.startActivity(intent);
                            break;

                        case 5 :
                            intent.putExtra("namamakan",array_name.get(getAdapterPosition()));
                            intent.putExtra("hargamakan",array_harga.get(getAdapterPosition()));
                            intent.putExtra("gambarmakan",menuList.get(getAdapterPosition()));
                            komposisi = "Mampir dulu lah sini";
                            intent.putExtra("komposisimakan", komposisi);
                            context.startActivity(intent);
                            break;

                        case 6 :
                            intent.putExtra("namamakan",array_name.get(getAdapterPosition()));
                            intent.putExtra("hargamakan",array_harga.get(getAdapterPosition()));
                            intent.putExtra("gambarmakan",menuList.get(getAdapterPosition()));
                            komposisi = "Resep terbaik dari asalnya tiada duanya";
                            intent.putExtra("komposisimakan",komposisi);
                            context.startActivity(intent);
                            break;
                    }
                }
            });
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        //membuat view sebagai persiapan dan memasang layout yang akan digunakan pada recyclerview
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_design, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, final int position) {

        //memanggil value pada view yang ada pada posisi tertentu
        final String Nama = array_name.get(position);//mengambil data sesuai dengan posisi yang telah ditentukan
        final String Harga = array_harga.get(position);//mengambil data sesuai dengan posisi yang telah ditentukan
        holder.title_makanan.setText(Nama);
        holder.harga_makanan.setText(Harga);
        holder.gambar_makanan.setImageResource(menuList.get(position)); //mengambil gambar sesuai posisi yang telah ditentukan
    }

    @Override
    public int getItemCount() {
        //menetukan pengukuran data yang akan ditampilkan pada recyclerview
        return array_name.size();
    }

}
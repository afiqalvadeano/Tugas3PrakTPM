package com.example.datamaskapai;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rcv;
    myadapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Maskapai Penerbangan Indonesia");
        rcv = (RecyclerView) findViewById(R.id.recview);
        adapter = new myadapter(dataqueue(),getApplicationContext());
        rcv.setAdapter(adapter);
        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,1);
        rcv.setLayoutManager(gridLayoutManager);
    }

    public ArrayList<Model> dataqueue()
    {
        ArrayList<Model> holder=new ArrayList<>();

        Model ob1=new Model();
        ob1.setHeader("1. Garuda Indonesia");
        ob1.setDesc("Garuda Indonesia merupakan salah satu maskapai terbaik dengan pelayanan penuh atau full service milik Indonesia. Garuda indonesia juga merupakan maskapai plat merah yang masuk kedalam jajaran maskapai terbaik dunia");
        ob1.setImgname(R.drawable.garuda);
        holder.add(ob1);

        Model ob2=new Model();
        ob2.setHeader("2. Citilink");
        ob2.setDesc("Citilink merupakan salah satu anak perusahaan dari Garuda Indonesia grup yang melayani penerbangan berbiaya murah atau LCC. Namun meskipun berbiaya rendah tapi pelayanan maskapai ini juga sangan memuaskan");
        ob2.setImgname(R.drawable.citilink);
        holder.add(ob2);

        Model ob3=new Model();
        ob3.setHeader("3. Sriwijaya Air");
        ob3.setDesc("Sriwijaya air menjadi maskapai penerbangan terbesar ketiga yang ada di Indonesia. Maskapai Sriwijaya pernah resmi bergabung dengan Garuda Indonesia bersama anak perusahaannya yaitu NAM air. Namun sekarang sudah kembali memisahkan diri");
        ob3.setImgname(R.drawable.sriwijaya);
        holder.add(ob3);

        Model ob4=new Model();
        ob4.setHeader("4. NAM Air");
        ob4.setDesc("NAM Air merupakan anak perusahaan dari Sriwijaya Air Maskapai ini didirikan pada tahun 2013 yang mengoperasikan pesawat Boeing 737-500 Winglet dengan konfigurasi 120 kursi dan pesawat ATR 72-600 dengan 72 kursi kelas ekonomi");
        ob4.setImgname(R.drawable.nam);
        holder.add(ob4);

        Model ob5=new Model();
        ob5.setHeader("5. Lion Air");
        ob5.setDesc("Lion Air merupakan maskapai yang memiliki paling banyak pesawat termasuk dengan anak perusahaanya yang juga ada di luar negri. Selain itu maskapai ini menawarkan harga yang paling terjangkau di banding maskapai lainya.");
        ob5.setImgname(R.drawable.lion);
        holder.add(ob5);

        Model ob6=new Model();
        ob6.setHeader("6. Batik Air");
        ob6.setDesc("Maskapai ini merupakan anak perusahaan dari lion air yang melayani penerbangan full service. Untuk pelayanan maskapai ini cukup memuaskan sesuai dengan standart maskapai full service");
        ob6.setImgname(R.drawable.batik);
        holder.add(ob6);

        Model ob7=new Model();
        ob7.setHeader("7. Wings Air\n");
        ob7.setDesc("Wings Air juga merupakan anak perusahaan dari lion air yang mengoperasikan pesawat kecil berjenis ATR untuk menjangkau daerah-daerah yang tidak bisa di darati oleh pesawat jet");
        ob7.setImgname(R.drawable.wings);
        holder.add(ob7);

        Model ob8=new Model();
        ob8.setHeader("8. Air Asia");
        ob8.setDesc("Sebenernya maskapai ini bukan berpusat di Indonesia, melainkan di Kuala Lumpur Malaysia. Namun maskapai Air Asia melayani penerbangan dari luar negeri ke dalam negeri dan sebaliknya.");
        ob8.setImgname(R.drawable.airasia);
        holder.add(ob8);

        Model ob9=new Model();
        ob9.setHeader("9. Kasltar Aviation");
        ob9.setDesc("Kalstar Aviation memfokuskan pada rute menuju bandara di daerah Kalimantan dan beberapa daerah di Sumatera. Namun sayangnya, maskapai ini masih belum membuka rute penerbangan menuju luar negeri.");
        ob9.setImgname(R.drawable.kalstar);
        holder.add(ob9);

        Model ob10=new Model();
        ob10.setHeader("10. Xpress Air");
        ob10.setDesc("Maskapai penerbangan yang satu ini berpusat di Makassar, Sulawesi Selatan dengan fokus penerbangan menuju wilayah timur di Indonesia. Namun sayang beberapa bulan yang lalu maskapai ini dinyatakan bangkrut dan sudah tidak aktif lagi");
        ob10.setImgname(R.drawable.xpress);
        holder.add(ob10);

        return holder;
    }
}
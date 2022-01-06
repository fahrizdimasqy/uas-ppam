package com.example.utspemrogramanandroid;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.Random;

public class DBHelper extends SQLiteOpenHelper {

    public DBHelper(@Nullable Context context) {
        super(context, "sekolah_db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onCreate(db);
    }
    public void tambah(SQLiteDatabase db) {
        String[] nama_sis = new String[] { "Gede", "Okky", "Untung", "Puji", "Willy", "Ayus" };
        String[] alamat_sis = new String[] { "Denpasar", "Banyuwangi", "Situbondo", "Rogojampi", "Purwoharjo", "Rogojampi" };
        int lanjut = new Random().nextInt(6);
        String nama_in = nama_sis[lanjut];
        String alamat_in = alamat_sis[lanjut];
        //db.execSQL("");
    }
}

package com.hotmail.antonioaren.museo.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;


public class DatabaseMuseoUtils extends SQLiteOpenHelper {


    public DatabaseMuseoUtils(
            Context ctx, String name, CursorFactory factory, int ver) {

        super(ctx, name, factory, ver);
    }

    @Override
    public void onOpen(SQLiteDatabase db) {
        super.onOpen(db);
        if (!db.isReadOnly()) {
            db.execSQL("PRAGMA foreign_keys=ON;");
        }
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        try {

            DetailTable detailTable = new DetailTable();
            detailTable.onCreate(db);

        } catch (Exception e) {
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVer, int newVer) {
        try {

            DetailTable detailTable = new DetailTable();
            detailTable.onUpgrade(db, oldVer, newVer);

        } catch (Exception e) {
        }

    }

}

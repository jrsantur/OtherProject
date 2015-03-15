package com.startup.junior.otherproject.SQlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Junior on 27/01/2015.
 */
public class MySQLiteHelper extends SQLiteOpenHelper{

    public static final String TABLE_SESSION ="sessions";
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_SESSION = "session";

    private static final String DATABASE_NAME = "session.db";
    private static final int DATABASE_VERSION = 1;

    private static final String DATABASE_CREATE = "create table if not exists "+ TABLE_SESSION +"( "
            +COLUMN_ID+" int primary key, "
            +COLUMN_SESSION+" int not null)";


    public MySQLiteHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(DATABASE_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        Log.w(MySQLiteHelper.class.getName(),
                "Upgrading database from version " + oldVersion + " to "
                        + newVersion + ", which will destroy all old data");
        db.execSQL("DROP TABLE IF EXISTS SESSION" );
        onCreate(db);
    }
}

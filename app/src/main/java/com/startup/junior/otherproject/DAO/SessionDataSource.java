package com.startup.junior.otherproject.DAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;


import com.startup.junior.otherproject.Models.Session;
import com.startup.junior.otherproject.SQlite.MySQLiteHelper;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Junior on 27/01/2015.
 */
public class SessionDataSource {

    private SQLiteDatabase db;
    private MySQLiteHelper dbHelper;
    private String[] allColumns = { MySQLiteHelper.COLUMN_ID,
            MySQLiteHelper.COLUMN_SESSION };

    public SessionDataSource(Context context){
        dbHelper = new MySQLiteHelper(context);
    }
    public void open() throws SQLiteException{
        db = dbHelper.getWritableDatabase();
    }
    public void close(){
        dbHelper.close();
    }
    public List<Session> getAllSession() {
        List<Session> sessions = new ArrayList<Session>();

        Cursor cursor = db.query(MySQLiteHelper.TABLE_SESSION,
                allColumns, null, null, null, null, null);

        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            Session comment = cursorToSession(cursor);
            sessions.add(comment);
            cursor.moveToNext();
        }
        // make sure to close the cursor
        cursor.close();
        return sessions;
    }
    public void createSession(int session){
        ContentValues values = new ContentValues();
        values.put(MySQLiteHelper.COLUMN_SESSION,session);
        long insertId = db.insert(MySQLiteHelper.TABLE_SESSION, null, values);
        Cursor cursor = db.query(MySQLiteHelper.TABLE_SESSION,
                                allColumns,
                                MySQLiteHelper.COLUMN_ID + " = " +insertId,
                                null,null,null,null);
        cursor.moveToFirst();
        //Session newSession = cursorToSession(cursor);
        cursor.close();
        //return newSession;
    }
    private Session cursorToSession(Cursor cursor) {
        Session session = new Session();
        session.setId(cursor.getInt(0));
        session.setSession(cursor.getInt(1));
        return session;
    }

}

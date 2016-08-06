package com.example.sistemascasa.tigie.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.widget.TextView;

import com.example.sistemascasa.tigie.R;
import com.example.sistemascasa.tigie.adapter.SubHeadingAdapter;
import com.example.sistemascasa.tigie.pojo.Chapters;
import com.example.sistemascasa.tigie.pojo.Fractions;
import com.example.sistemascasa.tigie.pojo.Headings;
import com.example.sistemascasa.tigie.pojo.Subheadings;

import java.util.ArrayList;

/**
 * Created by desarrolloweb on 12/07/16.
 */
public class ConstructorData {

    private Context context;
    public ConstructorData (Context context){
        this.context = context;
    }

    public ArrayList<Chapters> getChapters ()  {
        /*BaseDatos db = new BaseDatos(context);
        ChaptersData chad = new ChaptersData();
        chad.insertChaptersData(db);
        /*HeadingsData headingsData = new HeadingsData();
        headingsData.InsertHeadingsData(db);
        return db.getAllChapters();*/

        BaseDatos db = new BaseDatos(context);

        TestAdapter mDbHelper = new TestAdapter(context);
        mDbHelper.createDatabase();
        mDbHelper.open();

        Cursor testdata = mDbHelper.getTestData();

        mDbHelper.close();
        return db.getAllChapters();

    }

    public ArrayList<Headings> getHeadings (int idTariffChapterVista) {
        BaseDatos db1 = new BaseDatos(this.context);
        return db1.getHeadingsBD(idTariffChapterVista);
    }

    public ArrayList<Subheadings> getSubHeadings (int idTariffHeading) {
        BaseDatos db1 = new BaseDatos(this.context);
        return db1.getSubHeadingsBD(idTariffHeading);
    }

    public ArrayList<Fractions> getFractions (int idTariffSubheading) {
        BaseDatos db1 = new BaseDatos(this.context);
        return db1.getFractionsBD(idTariffSubheading);
    }

}

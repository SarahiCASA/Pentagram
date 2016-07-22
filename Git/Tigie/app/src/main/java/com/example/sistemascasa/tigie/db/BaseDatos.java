package com.example.sistemascasa.tigie.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.sistemascasa.tigie.R;
import com.example.sistemascasa.tigie.pojo.Chapters;
import com.example.sistemascasa.tigie.pojo.Fractions;
import com.example.sistemascasa.tigie.pojo.Headings;
import com.example.sistemascasa.tigie.pojo.Subheadings;

import java.util.ArrayList;

/**
 * Created by desarrolloweb on 14/07/16.
 */
public class BaseDatos extends SQLiteOpenHelper {

    private Context context;


    public BaseDatos(Context context) {
        super(context, ConstantesBaseDatos.DATABASE_NAME, null, ConstantesBaseDatos.DATABASE_VERSION);
        this.context = context;
    }

    public void open() throws SQLException {
        close();
        this.getWritableDatabase();
    }

    public void closeDB() {
        SQLiteDatabase db = this.getReadableDatabase();
        if (db != null && db.isOpen())
            db.close();
    }

    @Override
    /**
     * Se crea la estructura de la base de datos, todas las tablas (Create table)
     */
    public void onCreate(SQLiteDatabase db) {


        String queryCreateTableChapter = "CREATE TABLE " + ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS + "(" +
                ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID        +   " INTEGER, " +
                ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE      +   " TEXT, "  +
                ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP   +   " TEXT, "  +
                ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO     +   " INTEGER"    +
                ")";

        String queryCreateTableHeading = "CREATE TABLE " + ConstantesBaseDatos.TABLE_TARIFF_HEADINGS +  "(" +
                ConstantesBaseDatos.TABLE_TARIFF_HEADINGS_HEADINGS_ID + " INTEGER PRIMARY KEY, " +
                ConstantesBaseDatos.TABLE_TARIFF_HEADINGS_CHAPTERS_ID + " INTEGER, " +
                ConstantesBaseDatos.TABLE_TARIFF_HEADINGS_CODE        +  " TEXT, "   +
                ConstantesBaseDatos.TABLE_TARIFF_HEADINGS_DESCRIP     +  " TEXT, "   +
                ConstantesBaseDatos.TABLE_TARIFF_HEADINGS_ICONO       +  " INTEGER, "  +
                "FOREIGN KEY (" +  ConstantesBaseDatos.TABLE_TARIFF_HEADINGS_CHAPTERS_ID + ") " +
                "REFERENCES "   +  ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS + "(" + ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID + ")" +
                ")";

        String queryCreateTableSubheadings = "CREATE TABLE " + ConstantesBaseDatos.TABLE_TARIFF_SUBHEADINGS + "( " +
                ConstantesBaseDatos.TABLE_TARIFF_SUBHEADINGS_ID         +   " INTEGER PRIMARY KEY, " +
                ConstantesBaseDatos.TABLE_TARIFF_SUBHEADINGS_PRESUBHEADING_ID +  " INTEGER, "    +
                ConstantesBaseDatos.TABLE_TARIFF_SUBHEADINGS_HEADING_ID +   " INTEGER, "    +
                ConstantesBaseDatos.TABLE_TARIFF_SUBHEADINGS_CODE       +   " TEXT, "       +
                ConstantesBaseDatos.TABLE_TARIFF_SUBHEADINGS_DESCRIP    +   " TEXT, "       +
                ConstantesBaseDatos.TABLE_TARIFF_SUBHEADINGS_ICONO      +    " INTEGER, "   +
                "FOREIGN KEY (" + ConstantesBaseDatos.TABLE_TARIFF_SUBHEADINGS_HEADING_ID + ")" +
                "REFERENCES " + ConstantesBaseDatos.TABLE_TARIFF_HEADINGS + "(" + ConstantesBaseDatos.TABLE_TARIFF_HEADINGS_HEADINGS_ID + ")" +
                ")";

        String queryCreateTablePreSubheadings = "CREATE TABLE " + ConstantesBaseDatos.TABLE_TARIFF_PRESUBHEADINGS + "( " +
                ConstantesBaseDatos.TABLE_TARIFF_PRESUBHEADINGS_PRESUBHEADINGS_ID   + " INTEGER PRIMARY KEY, " +
                ConstantesBaseDatos.TABLE_TARIFF_PRESUBHEADINGS_CODE                + " TEXT, " +
                ConstantesBaseDatos.TABLE_TARIFF_PRESUBHEADINGS_DESCRIP             + " TEXT, " +
                ConstantesBaseDatos.TABLE_TARIFF_PRESUBHEADINGS_ICONO               + " INTEGER " +
                ")";

        String queryCreateTableFractions = "CREATE TABLE " + ConstantesBaseDatos.TABLE_TARIFF_FRACTIONS + "( " +
                ConstantesBaseDatos.TABLE_TARIFF_FRACTIONS_FRACTIONS_ID     +   " INTEGER PRIMARY KEY, " +
                ConstantesBaseDatos.TABLE_TARIFF_FRACTIONS_CHAPTERS_ID      + " INTEGER, "  +
                ConstantesBaseDatos.TABLE_TARIFF_FRACTIONS_HEADINGS_ID      + " INTEGER, "  +
                ConstantesBaseDatos.TABLE_TARIFF_FRACTIONS_SUBHEADINGS_ID   + " INTEGER, "  +
                ConstantesBaseDatos.TABLE_TARIFF_FRACTIONS_CODE             + " TEXT, "     +
                ConstantesBaseDatos.TABLE_TARIFF_FRACTIONS_DESCRIP          + " TEXT, "     +
                ConstantesBaseDatos.TABLE_TARIFF_FRACTIONS_WORDS            + " TEXT, "     +
                ConstantesBaseDatos.TABLE_TARIFF_FRACTIONS_ICONO            + " INTEGER, "  +
                "FOREIGN KEY (" + ConstantesBaseDatos.TABLE_TARIFF_FRACTIONS_CHAPTERS_ID + ")" +
                "REFERENCES " + ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS + "(" + ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID + ")" +
                "FOREIGN KEY (" + ConstantesBaseDatos.TABLE_TARIFF_HEADINGS_HEADINGS_ID + ")" +
                "REFERENCES " + ConstantesBaseDatos.TABLE_TARIFF_HEADINGS + "(" + ConstantesBaseDatos.TABLE_TARIFF_HEADINGS_HEADINGS_ID + ")" +
                "FOREIGN KEY (" + ConstantesBaseDatos.TABLE_TARIFF_FRACTIONS_SUBHEADINGS_ID + ")" +
                "REFERENCES " + ConstantesBaseDatos.TABLE_TARIFF_SUBHEADINGS + "(" + ConstantesBaseDatos.TABLE_TARIFF_SUBHEADINGS_ID + ")" +
                ")";

        db.execSQL(queryCreateTableChapter);
        db.execSQL(queryCreateTableHeading);
        db.execSQL(queryCreateTableSubheadings);
        db.execSQL(queryCreateTablePreSubheadings);
        db.execSQL(queryCreateTableFractions);

    }

    /*
    * Se ejecuta cuando se tiene que reestructurar la BD
     */
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXIST " + ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS);
        db.execSQL("DROP TABLE IF EXIST " + ConstantesBaseDatos.TABLE_TARIFF_HEADINGS);
        db.execSQL("DROP TABLE IF EXIST " + ConstantesBaseDatos.TABLE_TARIFF_SUBHEADINGS);
        db.execSQL("DROP TABLE IF EXIST " + ConstantesBaseDatos.TABLE_TARIFF_PRESUBHEADINGS);
        db.execSQL("DROP TABLE IF EXIST " + ConstantesBaseDatos.TABLE_TARIFF_FRACTIONS);
        onCreate(db);
    }

    public ArrayList<Chapters> getAllChapters() {
        ArrayList<Chapters> chapters = new ArrayList<>();

        String query = "SELECT * FROM " + ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS ;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor registros = db.rawQuery(query, null);   //Devolver coleccion de datos del query que consulto  "null" es para definir parametros
        int contador = 1;

        while (registros.moveToNext()) {

            if(contador <= 99) {
                Chapters chapterActual = new Chapters();

                chapterActual.setId(registros.getInt(0));
                chapterActual.setCodigo(registros.getString(1));
                chapterActual.setDescripcion(registros.getString(2));
                chapterActual.setIcono(registros.getInt(3));

                chapters.add(chapterActual);
            }
            contador ++;

        }

        db.close();

        return chapters;
    }

    public ArrayList<Headings> getHeadingsBD (int idTariffChapterVista) {
        ArrayList<Headings> headings = new ArrayList<>();
        String query = "SELECT * FROM " + ConstantesBaseDatos.TABLE_TARIFF_HEADINGS +
                        " WHERE "       + ConstantesBaseDatos.TABLE_TARIFF_HEADINGS_CHAPTERS_ID + " = " + idTariffChapterVista;

        SQLiteDatabase db = this.getWritableDatabase();
        Cursor registros = db.rawQuery(query, null);   //Devolver coleccion de datos del query que consulto  "null" es para definir parametros

        while (registros.moveToNext()  ) {
            Headings headingActual = new Headings();

                headingActual.setIdTariffHeading(registros.getInt(0));
                headingActual.setIdTariffChapter(registros.getInt(1));
                headingActual.setTariffHeadingCode(registros.getString(2));
                headingActual.setTariffHeadingDescription(registros.getString(3));
                headingActual.setTariffHeadingIcon(registros.getInt(4));
                headings.add(headingActual);
        }

        db.close();

        return headings;
    }

    public ArrayList<Subheadings> getSubHeadingsBD (int idTariffHeading) {
        ArrayList<Subheadings> subheadingses = new ArrayList<>();

        String query = "SELECT * FROM " + ConstantesBaseDatos.TABLE_TARIFF_SUBHEADINGS +
                        " WHERE "       + ConstantesBaseDatos.TABLE_TARIFF_SUBHEADINGS_HEADING_ID + " = " + idTariffHeading;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor registros = db.rawQuery(query, null);

        while (registros.moveToNext()) {
            Subheadings subheadingActual = new Subheadings();

            if( registros.getString(4) != null) {
                if(registros.getInt(1) != 1) {

                    String queryDescr = "SELECT " + ConstantesBaseDatos.TABLE_TARIFF_PRESUBHEADINGS_DESCRIP + " FROM " + ConstantesBaseDatos.TABLE_TARIFF_PRESUBHEADINGS +
                            " WHERE "     + ConstantesBaseDatos.TABLE_TARIFF_PRESUBHEADINGS_PRESUBHEADINGS_ID + " = " + registros.getInt(1);
                    Cursor registros2 = db.rawQuery(queryDescr, null);

                    while (registros2.moveToNext()) {
                        String descripcion = registros2.getString(0);
                        String descripSubheading = descripcion + " " + registros.getString(4);
                        subheadingActual.setTariffSubheadingDescription(descripSubheading);
                    }

                } else {
                    subheadingActual.setTariffSubheadingDescription(registros.getString(4));
                }

                subheadingActual.setIdTariffSubheading(registros.getInt(0));
                subheadingActual.setIdTariffPreSubheading(registros.getInt(1));
                subheadingActual.setIdTariffHeading(registros.getInt(2));
                subheadingActual.setTariffSubheadingCode(registros.getString(3));
                subheadingActual.setTariffSubheadingIcon(registros.getInt(5));
                subheadingses.add(subheadingActual);
            }

        }

        return subheadingses;
    }

    public ArrayList<Fractions> getFractionsBD(int idTariffSubheading) {
        ArrayList<Fractions> fractions = new ArrayList<>();

        String query =
                "SELECT "
                        + "FR."     + ConstantesBaseDatos.TABLE_TARIFF_FRACTIONS_FRACTIONS_ID       + ", "
                        + "FR."     + ConstantesBaseDatos.TABLE_TARIFF_FRACTIONS_CHAPTERS_ID        + ", "
                        + "FR."     + ConstantesBaseDatos.TABLE_TARIFF_FRACTIONS_HEADINGS_ID        + ", "
                        + "FR."     + ConstantesBaseDatos.TABLE_TARIFF_FRACTIONS_SUBHEADINGS_ID     + ", "
                        + "FR."     + ConstantesBaseDatos.TABLE_TARIFF_FRACTIONS_CODE               + ", "
                        + "FR."     + ConstantesBaseDatos.TABLE_TARIFF_FRACTIONS_DESCRIP            + ", "
                        + "FR."     + ConstantesBaseDatos.TABLE_TARIFF_FRACTIONS_WORDS              + ", "
                        + "FR."     + ConstantesBaseDatos.TABLE_TARIFF_FRACTIONS_ICONO              + ", "
                        + " SUB."   + ConstantesBaseDatos.TABLE_TARIFF_SUBHEADINGS_ID               + ", "
                        + " SUB."   + ConstantesBaseDatos.TABLE_TARIFF_SUBHEADINGS_CODE             + ", "
                        + " SUB."   + ConstantesBaseDatos.TABLE_TARIFF_SUBHEADINGS_DESCRIP          + ", "
                        + " HEAD."  + ConstantesBaseDatos.TABLE_TARIFF_HEADINGS_HEADINGS_ID         + ", "
                        + " HEAD."  + ConstantesBaseDatos.TABLE_TARIFF_HEADINGS_CODE                + ", "
                        + " HEAD."  + ConstantesBaseDatos.TABLE_TARIFF_HEADINGS_DESCRIP             + ", "
                        + " CHAP."  + ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID                  + ", "
                        + " CHAP."  + ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE                + ", "
                        + " CHAP."  + ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP             + " "
                + " FROM "
                        + ConstantesBaseDatos.TABLE_TARIFF_FRACTIONS
                + " FR INNER JOIN "
                        + ConstantesBaseDatos.TABLE_TARIFF_SUBHEADINGS  + " SUB ON " + "SUB."   + ConstantesBaseDatos.TABLE_TARIFF_SUBHEADINGS_ID       + " = FR."      + ConstantesBaseDatos.TABLE_TARIFF_FRACTIONS_SUBHEADINGS_ID
                + " INNER JOIN "
                        + ConstantesBaseDatos.TABLE_TARIFF_HEADINGS     + " HEAD ON " + "HEAD." + ConstantesBaseDatos.TABLE_TARIFF_HEADINGS_HEADINGS_ID + " = SUB."     + ConstantesBaseDatos.TABLE_TARIFF_SUBHEADINGS_HEADING_ID
                + " INNER JOIN "
                        + ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS     + " CHAP ON " + "CHAP." + ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID          + " = HEAD."    + ConstantesBaseDatos.TABLE_TARIFF_HEADINGS_CHAPTERS_ID
                + "  WHERE FR."
                        + ConstantesBaseDatos.TABLE_TARIFF_FRACTIONS_SUBHEADINGS_ID + " = " + idTariffSubheading;

       /* String query = "SELECT " + ConstantesBaseDatos.TABLE_TARIFF_FRACTIONS_FRACTIONS_ID + ", "
                + ConstantesBaseDatos.TABLE_TARIFF_FRACTIONS_CHAPTERS_ID + ", "
                + ConstantesBaseDatos.TABLE_TARIFF_FRACTIONS_HEADINGS_ID + ", "
                + ConstantesBaseDatos.TABLE_TARIFF_FRACTIONS_SUBHEADINGS_ID + ", "
                + ConstantesBaseDatos.TABLE_TARIFF_FRACTIONS_CODE + ", "
                + ConstantesBaseDatos.TABLE_TARIFF_FRACTIONS_DESCRIP + ", "
                + ConstantesBaseDatos.TABLE_TARIFF_FRACTIONS_WORDS + ", "
                + ConstantesBaseDatos.TABLE_TARIFF_FRACTIONS_ICONO
                + " FROM " + ConstantesBaseDatos.TABLE_TARIFF_FRACTIONS + " FR INNER JOIN "
                + ConstantesBaseDatos.TABLE_TARIFF_SUBHEADINGS + "SUB ON " + "SUB."+ ConstantesBaseDatos.TABLE_TARIFF_SUBHEADINGS_ID + " = " + ConstantesBaseDatos.TABLE_TARIFF_FRACTIONS_SUBHEADINGS_ID +
                "  WHERE FR."       + ConstantesBaseDatos.TABLE_TARIFF_FRACTIONS_SUBHEADINGS_ID + " = " + idTariffSubheading;*/

        System.out.println(query);
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor registros = db.rawQuery(query, null);

        while (registros.moveToNext()) {
            System.out.println("SUBHEADING");
            System.out.println(registros.getInt(8));
            System.out.println(registros.getString(9));
            System.out.println(registros.getString(10));


            System.out.println("HEADING");
            System.out.println(registros.getInt(11));
            System.out.println(registros.getString(12));
            System.out.println(registros.getString(13));


            System.out.println("CHAPTERS");
            System.out.println(registros.getInt(14));
            System.out.println(registros.getString(15));
            System.out.println(registros.getString(16));
            Fractions fractionActual = new Fractions();

            fractionActual.setIdTariffFraction(registros.getInt(0));
            fractionActual.setIdTariffChapter(registros.getInt(1));
            fractionActual.setIdTariffHeading(registros.getInt(2));
            fractionActual.setIdTariffSubheading(registros.getInt(3));
            fractionActual.setTariffFractionCode(registros.getString(4));
            fractionActual.setTariffFractionDescription(registros.getString(5));
            fractionActual.setTariffFractionIcon(registros.getInt(7));
            fractionActual.setTariffSubheadingCode(registros.getString(9));
            fractionActual.setTariffSubheadingDescription(registros.getString(10));
            fractionActual.setTariffHeadingCode(registros.getString(12));
            fractionActual.setTariffHeadingDescription(registros.getString(13));
            fractionActual.setTariffChapterCode(registros.getString(15));
            fractionActual.setTariffChapterDescription(registros.getString(16));
            fractions.add(fractionActual);

        }

        return fractions;
    }

    /*
    * Va a tener asociado el valor del campo con la tabla
    */
    public void insertAllChapters (ContentValues contentValues) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.insert(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS, null, contentValues);
        db.close();
    }

    public void insertHeadings(ContentValues contentValues2) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.insert(ConstantesBaseDatos.TABLE_TARIFF_HEADINGS, null, contentValues2);
        db.close();
    }



}

package com.example.sistemascasa.tigie.db;

import android.content.ContentValues;

import com.example.sistemascasa.tigie.R;

/**
 * Created by desarrolloweb on 18/07/16.
 */
public class HeadingsData {

    public HeadingsData() {

    }

    public void InsertHeadingsData(BaseDatos db) {
        ContentValues contentValuesHead = new ContentValues();
        /*contentValuesHead.put(ConstantesBaseDatos.TABLE_TARIFF_HEADINGS_HEADINGS_ID, 1);
        contentValuesHead.put(ConstantesBaseDatos.TABLE_TARIFF_HEADINGS_CHAPTERS_ID, 1);
        contentValuesHead.put(ConstantesBaseDatos.TABLE_TARIFF_HEADINGS_CODE, "0101");
        contentValuesHead.put(ConstantesBaseDatos.TABLE_TARIFF_HEADINGS_DESCRIP, "Caballos, asnos, mulos y burdéganos, vivos.");
        contentValuesHead.put(ConstantesBaseDatos.TABLE_TARIFF_HEADINGS_ICONO, R.drawable.add_property_52);

        db.insertHeadings(contentValuesHead);


        contentValuesHead.put(ConstantesBaseDatos.TABLE_TARIFF_HEADINGS_HEADINGS_ID, 2);
        contentValuesHead.put(ConstantesBaseDatos.TABLE_TARIFF_HEADINGS_CHAPTERS_ID, 1);
        contentValuesHead.put(ConstantesBaseDatos.TABLE_TARIFF_HEADINGS_CODE, "0102");
        contentValuesHead.put(ConstantesBaseDatos.TABLE_TARIFF_HEADINGS_DESCRIP, "Animales vivos de la especie bovina.");
        contentValuesHead.put(ConstantesBaseDatos.TABLE_TARIFF_HEADINGS_ICONO, R.drawable.add_property_52);

        db.insertHeadings(contentValuesHead);


        contentValuesHead.put(ConstantesBaseDatos.TABLE_TARIFF_HEADINGS_HEADINGS_ID, 3);
        contentValuesHead.put(ConstantesBaseDatos.TABLE_TARIFF_HEADINGS_CHAPTERS_ID, 1);
        contentValuesHead.put(ConstantesBaseDatos.TABLE_TARIFF_HEADINGS_CODE, "0103");
        contentValuesHead.put(ConstantesBaseDatos.TABLE_TARIFF_HEADINGS_DESCRIP, "Animales vivos de la especie porcina.");
        contentValuesHead.put(ConstantesBaseDatos.TABLE_TARIFF_HEADINGS_ICONO, R.drawable.add_property_52);

        db.insertHeadings(contentValuesHead);

        contentValuesHead.put(ConstantesBaseDatos.TABLE_TARIFF_HEADINGS_HEADINGS_ID, 4);
        contentValuesHead.put(ConstantesBaseDatos.TABLE_TARIFF_HEADINGS_CHAPTERS_ID, 1);
        contentValuesHead.put(ConstantesBaseDatos.TABLE_TARIFF_HEADINGS_CODE, "0104");
        contentValuesHead.put(ConstantesBaseDatos.TABLE_TARIFF_HEADINGS_DESCRIP, "Animales vivos de las especies ovina o caprina.");
        contentValuesHead.put(ConstantesBaseDatos.TABLE_TARIFF_HEADINGS_ICONO, R.drawable.add_property_52);

        db.insertHeadings(contentValuesHead);

        contentValuesHead.put(ConstantesBaseDatos.TABLE_TARIFF_HEADINGS_HEADINGS_ID, 5);
        contentValuesHead.put(ConstantesBaseDatos.TABLE_TARIFF_HEADINGS_CHAPTERS_ID, 1);
        contentValuesHead.put(ConstantesBaseDatos.TABLE_TARIFF_HEADINGS_CODE, "0105");
        contentValuesHead.put(ConstantesBaseDatos.TABLE_TARIFF_HEADINGS_DESCRIP, "Gallos, gallinas, patos, gansos, pavos (gallipavos) y pintadas, de las especies domésticas, vivos.");
        contentValuesHead.put(ConstantesBaseDatos.TABLE_TARIFF_HEADINGS_ICONO, R.drawable.add_property_52);

        db.insertHeadings(contentValuesHead);


        contentValuesHead.put(ConstantesBaseDatos.TABLE_TARIFF_HEADINGS_HEADINGS_ID, 6);
        contentValuesHead.put(ConstantesBaseDatos.TABLE_TARIFF_HEADINGS_CHAPTERS_ID, 1);
        contentValuesHead.put(ConstantesBaseDatos.TABLE_TARIFF_HEADINGS_CODE, "0106");
        contentValuesHead.put(ConstantesBaseDatos.TABLE_TARIFF_HEADINGS_DESCRIP, "Los demás animales vivos.");
        contentValuesHead.put(ConstantesBaseDatos.TABLE_TARIFF_HEADINGS_ICONO, R.drawable.add_property_52);

        db.insertHeadings(contentValuesHead);*/



        contentValuesHead.put(ConstantesBaseDatos.TABLE_TARIFF_HEADINGS_HEADINGS_ID, 7);
        contentValuesHead.put(ConstantesBaseDatos.TABLE_TARIFF_HEADINGS_CHAPTERS_ID, 2);
        contentValuesHead.put(ConstantesBaseDatos.TABLE_TARIFF_HEADINGS_CODE, "0104");
        contentValuesHead.put(ConstantesBaseDatos.TABLE_TARIFF_HEADINGS_DESCRIP, "Carne de animales de la especie bovina, fresca o refrigerada.");
        contentValuesHead.put(ConstantesBaseDatos.TABLE_TARIFF_HEADINGS_ICONO, R.drawable.add_property_52);

        db.insertHeadings(contentValuesHead);

        contentValuesHead.put(ConstantesBaseDatos.TABLE_TARIFF_HEADINGS_HEADINGS_ID, 8);
        contentValuesHead.put(ConstantesBaseDatos.TABLE_TARIFF_HEADINGS_CHAPTERS_ID, 2);
        contentValuesHead.put(ConstantesBaseDatos.TABLE_TARIFF_HEADINGS_CODE, "0105");
        contentValuesHead.put(ConstantesBaseDatos.TABLE_TARIFF_HEADINGS_DESCRIP, "Carne de animales de la especie bovina, congelada.");
        contentValuesHead.put(ConstantesBaseDatos.TABLE_TARIFF_HEADINGS_ICONO, R.drawable.add_property_52);

        db.insertHeadings(contentValuesHead);


        contentValuesHead.put(ConstantesBaseDatos.TABLE_TARIFF_HEADINGS_HEADINGS_ID, 9);
        contentValuesHead.put(ConstantesBaseDatos.TABLE_TARIFF_HEADINGS_CHAPTERS_ID, 2);
        contentValuesHead.put(ConstantesBaseDatos.TABLE_TARIFF_HEADINGS_CODE, "0106");
        contentValuesHead.put(ConstantesBaseDatos.TABLE_TARIFF_HEADINGS_DESCRIP, "Carne de animales de la especie porcina, fresca, refrigerada o congelada.");
        contentValuesHead.put(ConstantesBaseDatos.TABLE_TARIFF_HEADINGS_ICONO, R.drawable.add_property_52);

        db.insertHeadings(contentValuesHead);

        db.close();
    }
}

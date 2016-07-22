package com.example.sistemascasa.tigie.db;

import android.content.ContentValues;

import com.example.sistemascasa.tigie.R;

/**
 * Created by desarrolloweb on 14/07/16.
 */
public class ChaptersData {

    public ChaptersData () {

    }

    public void insertChaptersData (BaseDatos db) {

        ContentValues contentValues = new ContentValues();

        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 1);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "01");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Animales vivos");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_01);
        db.insertAllChapters(contentValues);

        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 2);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "02");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Carne y despojos comestibles");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_02);
        db.insertAllChapters(contentValues);

        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 3);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "03");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Pescados y crustáceos, moluscos y demás invertebrados acuáticos");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_03);
        db.insertAllChapters(contentValues);

        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 4);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "04");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Leche y productos lácteos; huevos de ave; miel natural; productos comestibles de origen animal, no expresados ni comprendidos en otra parte");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_04);
        db.insertAllChapters(contentValues);

        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 5);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "05");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Los demás productos de origen animal no expresados ni comprendidos en otra parte");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_05);
        db.insertAllChapters(contentValues);

        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 6);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "06");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Plantas vivas y productos de la floricultura");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_06);
        db.insertAllChapters(contentValues);

        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 7);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "07");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Hortalizas, plantas, raíces y tubérculos alimenticios");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_07);
        db.insertAllChapters(contentValues);

        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 8);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "08");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Frutas y frutos comestibles; cortezas de agrios (cítricos), melones o sandías");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_08);
        db.insertAllChapters(contentValues);

        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 9);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "09");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Café, té, yerba mate y especias");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_09);
        db.insertAllChapters(contentValues);

        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 10);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "10");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Cereales");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_10);
        db.insertAllChapters(contentValues);

        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 11);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "11");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Productos de la molinería; malta; almidón y fécula; inulina; gluten de trigo");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_11);
        db.insertAllChapters(contentValues);

        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 12);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "12");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Semillas y frutos oleaginosos; semillas y frutos diversos; plantas industriales o medicinales; paja y forraje");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_12);
        db.insertAllChapters(contentValues);

        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 13);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "13");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Gomas, resinas y demás jugos y extractos vegetales");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_13);
        db.insertAllChapters(contentValues);

        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 14);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "14");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Materias trenzables y demás productos de origen vegetal, no expresados ni comprendidos en otra parte");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_14);
        db.insertAllChapters(contentValues);

        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 15);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "15");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Grasas y aceites animales o vegetales; productos de su desdoblamiento; grasas alimenticias elaboradas; ceras de origen animal o vegetal");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_15);
        db.insertAllChapters(contentValues);

        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 16);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "16");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Preparaciones de carne, pescado o de crustáceos, moluscos o demás invertebrados acuáticos");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_16);
        db.insertAllChapters(contentValues);

        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 17);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "17");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Azúcares y artículos de confitería");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_17);
        db.insertAllChapters(contentValues);

        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 18);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "18");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Cacao y sus preparaciones");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_18);
        db.insertAllChapters(contentValues);

        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 19);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "19");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Preparaciones a base de cereales, harina, almidón, fécula o leche; productos de pastelería");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_19);
        db.insertAllChapters(contentValues);

        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 20);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "20");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Preparaciones de hortalizas, frutas u otros frutos o demás partes de plantas");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_20);
        db.insertAllChapters(contentValues);

        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 21);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "21");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Preparaciones alimenticias diversas");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_21);
        db.insertAllChapters(contentValues);

        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 22);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "22");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Bebidas, líquidos alcohólicos y vinagre");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_22);
        db.insertAllChapters(contentValues);

        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 23);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "23");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Residuos y desperdicios de las industrias alimentarias; alimentos preparados para animales");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_23);
        db.insertAllChapters(contentValues);

        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 24);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "24");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Tabaco y sucedáneos del tabaco elaborados");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_24);
        db.insertAllChapters(contentValues);

        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 25);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "25");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Sal; azufre; tierras y piedras; yesos, cales y cementos");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_25);
        db.insertAllChapters(contentValues);

        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 26);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "26");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Minerales metalíferos, escorias y cenizas");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_26);
        db.insertAllChapters(contentValues);

        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 27);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "27");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Combustibles minerales, aceites minerales y productos de su destilación; materias bituminosas; ceras minerales");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_27);
        db.insertAllChapters(contentValues);

        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 28);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "28");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Productos químicos inorgánicos; compuestos inorgánicos u orgánicos de metal precioso, de elementos radiactivos, de metales de las tierras raras o de isótopos");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_28);
        db.insertAllChapters(contentValues);

        //
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 29);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "29");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Productos químicos orgánicos");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_29);
        db.insertAllChapters(contentValues);

        //
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 30);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "30");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Productos farmacéuticos");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_30);
        db.insertAllChapters(contentValues);

        //
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 31);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "31");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Abonos");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_31);
        db.insertAllChapters(contentValues);

        //
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 32);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "32");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Extractos curtientes o tintóreos; taninos y sus derivados; pigmentos y demás materias colorantes; pinturas y barnices; mástiques; tintas");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_32);
        db.insertAllChapters(contentValues);
        //
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 33);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "33");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Aceites esenciales y resinoides; preparaciones de perfumería, de tocador o de cosmética");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_33);
        db.insertAllChapters(contentValues);

        //
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 34);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "34");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Jabón, agentes de superficie orgánicos, preparaciones para lavar, preparaciones lubricantes, ceras artificiales, ceras preparadas, productos de limpieza, velas y artículos similares, pastas para modelar, ceras para odontología y preparaciones para odontología a base de yeso fraguable");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_34);
        db.insertAllChapters(contentValues);

        //
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 35);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "35");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Materias albuminoideas; productos a base de almidón o de fécula modificados; colas; enzimas");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_35);
        db.insertAllChapters(contentValues);

        //
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 36);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "36");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Pólvora y explosivos; artículos de pirotecnia; fósforos (cerillas); aleaciones pirofóricas; materias inflamables");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_36);
        db.insertAllChapters(contentValues);

        //
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 37);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "37");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Productos fotográficos o cinematográficos");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_37);
        db.insertAllChapters(contentValues);

        //
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 38);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "38");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Productos diversos de las industrias químicas");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_38);
        db.insertAllChapters(contentValues);

        //
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 39);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "39");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Plástico y sus manufacturas");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_39);
        db.insertAllChapters(contentValues);

        //
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 40);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "40");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Caucho y sus manufacturas");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_40);
        db.insertAllChapters(contentValues);

        //
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 41);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "41");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Pieles (excepto la peletería) y cueros");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_41);
        db.insertAllChapters(contentValues);

        //
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 42);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "42");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Manufacturas de cuero; artículos de talabartería o guarnicionería; artículos de viaje, bolsos de mano (carteras) y continentes similares; manufacturas de tripa");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_42);
        db.insertAllChapters(contentValues);

        //
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 43);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "43");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Peletería y confecciones de peletería; peletería facticia o artificial");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_43);
        db.insertAllChapters(contentValues);

        //
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 44);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "44");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Madera, carbón vegetal y manufacturas de madera");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_44);
        db.insertAllChapters(contentValues);

        //
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 45);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "45");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Corcho y sus manufacturas");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_45);
        db.insertAllChapters(contentValues);

        //
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 46);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "46");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Manufacturas de espartería o cestería");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_46);
        db.insertAllChapters(contentValues);

        //
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 47);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "47");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Pasta de madera o de las demás materias fibrosas celulósicas; papel o cartón para reciclar (desperdicios y desechos)");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_47);
        db.insertAllChapters(contentValues);

        //
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 48);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "48");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Papel y cartón; manufacturas de pasta de celulosa, de papel o cartón");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_48);
        db.insertAllChapters(contentValues);

        //
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 49);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "49");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Productos editoriales, de la prensa y de las demás industrias gráficas; textos manuscritos o mecanografiados y planos");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_49);
        db.insertAllChapters(contentValues);

        //
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 50);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "50");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Seda");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_50);
        db.insertAllChapters(contentValues);

        //
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 51);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "51");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Lana y pelo fino u ordinario; hilados y tejidos de crin");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_51);
        db.insertAllChapters(contentValues);

        //
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 52);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "52");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Algodón");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_52);
        db.insertAllChapters(contentValues);

        //
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 53);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "53");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Las demás fibras textiles vegetales; hilados de papel y tejidos de hilados de papel");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_53);
        db.insertAllChapters(contentValues);

        //
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 54);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "54");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Filamentos sintéticos o artificiales; tiras y formas similares de materia textil sintética o artificial");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_54);
        db.insertAllChapters(contentValues);

        //
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 55);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "55");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Fibras sintéticas o artificiales discontinuas");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_55);
        db.insertAllChapters(contentValues);

        //
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 56);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "56");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Guata, fieltro y tela sin tejer; hilados especiales; cordeles, cuerdas y cordajes; artículos de cordelería");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_56);
        db.insertAllChapters(contentValues);
        //
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 57);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "57");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Alfombras y demás revestimientos para el suelo, de materia textil");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_57);
        db.insertAllChapters(contentValues);

        //
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 58);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "58");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Tejidos especiales; superficies textiles con mechón insertado; encajes; tapicería; pasamanería; bordados");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_58);
        db.insertAllChapters(contentValues);

        //
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 59);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "59");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Telas impregnadas, recubiertas, revestidas o estratificadas; artículos técnicos de materia textil");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_59);
        db.insertAllChapters(contentValues);

        //
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 60);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "60");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Tejidos de punto");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_60);
        db.insertAllChapters(contentValues);

        //
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 61);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "61");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Prendas y complementos (accesorios), de vestir, de punto");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_61);
        db.insertAllChapters(contentValues);

        //
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 62);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "62");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Prendas y complementos (accesorios), de vestir, excepto los de punto");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_62);
        db.insertAllChapters(contentValues);//

        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 63);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "63");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Los demás artículos textiles confeccionados; juegos; prendería y trapos");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_63);
        db.insertAllChapters(contentValues);

        //
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 64);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "64");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Calzado, polainas y artículos análogos; partes de estos artículos");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_64);
        db.insertAllChapters(contentValues);
        //
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 65);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "65");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Sombreros, demás tocados, y sus partes");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_65);
        db.insertAllChapters(contentValues);
        //
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 66);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "66");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Paraguas, sombrillas, quitasoles, bastones, bastones asiento, látigos, fustas, y sus partes");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_66);
        db.insertAllChapters(contentValues);//
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 67);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "67");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Plumas y plumón preparados y artículos de plumas o plumón; flores artificiales; manufacturas de cabello");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_67);
        db.insertAllChapters(contentValues);
        //
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 68);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "68");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Manufacturas de piedra, yeso fraguable, cemento, amianto (asbesto), mica o materias análogas");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_68);
        db.insertAllChapters(contentValues);
        //
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 69);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "69");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Productos cerámicos");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_69);
        db.insertAllChapters(contentValues);
        //
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 70);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "70");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Vidrio y sus manufacturas");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_70);
        db.insertAllChapters(contentValues);
        //
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 71);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "71");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Perlas naturales o cultivadas, piedras preciosas o semipreciosas, metales preciosos, chapados de metal precioso (plaqué) y manufacturas de estas materias; bisutería; monedas");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_71);
        db.insertAllChapters(contentValues);

        //
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 72);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "72");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Fundición, hierro y acero");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_72);
        db.insertAllChapters(contentValues);

        //
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 73);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "73");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Manufacturas de fundición, hierro o acero");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_73);
        db.insertAllChapters(contentValues);
        //
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 74);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "74");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Cobre y sus manufacturas");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_74);
        db.insertAllChapters(contentValues);
        //
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 75);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "75");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Níquel y sus manufacturas");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_75);
        db.insertAllChapters(contentValues);
        //
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 76);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "76");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Aluminio y sus manufacturas");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_76);
        db.insertAllChapters(contentValues);
        //
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 77);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "78");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Plomo y sus manufacturas");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_78);
        db.insertAllChapters(contentValues);
        //
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 78);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "79");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Cinc y sus manufacturas");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_79);
        db.insertAllChapters(contentValues);
        //
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 79);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "80");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Estaño y sus manufacturas");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_80);
        db.insertAllChapters(contentValues);
        //
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 81);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "81");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Los demás metales comunes; cermets; manufacturas de estas materias");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_81);
        db.insertAllChapters(contentValues);
        //
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 82);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "82");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Herramientas y útiles, artículos de cuchillería y cubiertos de mesa, de metal común; partes de estos artículos, de metal común");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_01);
        db.insertAllChapters(contentValues);
        //
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 83);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "83");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Manufacturas diversas de metal común");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_83);
        db.insertAllChapters(contentValues);
        //
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 84);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "84");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Reactores nucleares, calderas, máquinas, aparatos y artefactos mecánicos; partes de estas máquinas o aparatos");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_84);
        db.insertAllChapters(contentValues);

        //
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 85);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "85");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Máquinas, aparatos y material eléctrico, y sus partes; aparatos de grabación o reproducción de sonido, aparatos de grabación o reproducción de imagen y sonido en televisión, y las partes y accesorios de estos aparatos");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_85);
        db.insertAllChapters(contentValues);

        //
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 86);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "86");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Vehículos y material para vías férreas o similares, y sus partes; aparatos mecánicos (incluso electromecánicos) de señalización para vías de comunicación");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_86);
        db.insertAllChapters(contentValues);

        //
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 87);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "87");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Vehículos automóviles, tractores, velocípedos y demás vehículos terrestres; sus partes y accesorios");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_87);
        db.insertAllChapters(contentValues);

        //
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 88);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "88");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Aeronaves, vehículos espaciales, y sus partes");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_88);
        db.insertAllChapters(contentValues);

        //
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 89);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "89");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Barcos y demás artefactos flotantes");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_89);
        db.insertAllChapters(contentValues);

        //
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 90);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "90");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Instrumentos y aparatos de óptica, fotografía o cinematografía, de medida, control o precisión; instrumentos y aparatos medicoquirúrgicos; partes y accesorios de estos instrumentos o aparatos");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_90);
        db.insertAllChapters(contentValues);

        //
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 91);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "91");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Aparatos de relojería y sus partes");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_91);
        db.insertAllChapters(contentValues);

        //
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 92);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "92");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Instrumentos musicales; sus partes y accesorios");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_92);
        db.insertAllChapters(contentValues);

        //
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 93);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "93");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Armas, municiones, y sus partes y accesorios");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_93);
        db.insertAllChapters(contentValues);

        //
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 94);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "94");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Muebles; mobiliario medicoquirúrgico; artículos de cama y similares; aparatos de alumbrado no expresados ni comprendidos en otra parte; anuncios, letreros y placas indicadoras, luminosos y artículos similares; construcciones prefabricadas");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_94);
        db.insertAllChapters(contentValues);

        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 95);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "95");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Juguetes, juegos y artículos para recreo o deporte; sus partes y accesorios");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_95);
        db.insertAllChapters(contentValues);

        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 96);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "96");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Manufacturas diversas");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_96);
        db.insertAllChapters(contentValues);

        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 97);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "97");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Objetos de arte o colección y antigüedades");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_97);
        db.insertAllChapters(contentValues);

        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 98);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "98");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Operaciones especiales");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_98);
        db.insertAllChapters(contentValues);

        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 99);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "99");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Pequeña importación definitiva.");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_99);
        db.insertAllChapters(contentValues);

        db.close();
        /*
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ID, 100);
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_CODE, "00");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_DESCRIP, "Capitulo generico para operaciones de transito");
        contentValues.put(ConstantesBaseDatos.TABLE_TARIFF_CHAPTERS_ICONO, R.drawable.cap_01);
        db.insertAllChapters(contentValues);*/

    }

}

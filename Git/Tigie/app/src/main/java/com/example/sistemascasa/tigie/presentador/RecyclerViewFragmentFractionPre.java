package com.example.sistemascasa.tigie.presentador;

import android.content.Context;

import com.example.sistemascasa.tigie.R;
import com.example.sistemascasa.tigie.db.ConstructorData;
import com.example.sistemascasa.tigie.fragments.IRecyclerview_Fractions;
import com.example.sistemascasa.tigie.fragments.IRecyclerview_Heading;
import com.example.sistemascasa.tigie.pojo.Fractions;
import com.example.sistemascasa.tigie.pojo.Headings;
import com.example.sistemascasa.tigie.pojo.Subheadings;

import java.util.ArrayList;

/**
 * Created by desarrolloweb on 20/07/16.
 */
public class RecyclerViewFragmentFractionPre  implements IRecyclerViewFragmentFractionPre {

    private IRecyclerview_Fractions iRecyclerview_fractions;
    private Context context;
    private ConstructorData constructorData;
    private ArrayList<Fractions> fractions;

    public RecyclerViewFragmentFractionPre(IRecyclerview_Fractions iRecyclerview_fractions, Context context, int idTariffSubheading) {

        this.iRecyclerview_fractions = iRecyclerview_fractions;
        this.context = context;
        getFractionsBD(idTariffSubheading);

    }

    @Override
    public void getFractionsBD(int idTariffSubheading) {
        constructorData = new ConstructorData(context);
        fractions = constructorData.getFractions(idTariffSubheading);
        showFractionDataRV();
    }

    @Override
    public void showFractionDataRV() {
        iRecyclerview_fractions.inicializarAdaptadorRV(iRecyclerview_fractions.crearAdaptador(fractions));
        iRecyclerview_fractions.generarLinearLayoutVertical();
    }
}

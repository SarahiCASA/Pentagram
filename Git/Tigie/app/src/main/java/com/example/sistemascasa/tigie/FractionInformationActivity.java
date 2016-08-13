package com.example.sistemascasa.tigie;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.example.sistemascasa.tigie.adapter.PageAdapter;
import com.example.sistemascasa.tigie.pojo.InfFRaction;
import com.example.sistemascasa.tigie.rest.InfFractionService;

import java.util.ArrayList;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

public class FractionInformationActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fraction_information);

        toolbar = (Toolbar) findViewById(R.id.toolbar2);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);


        if(toolbar != null) {
            setSupportActionBar(toolbar);
        }
        setupViewPager();

    }

    private ArrayList<Fragment> agregarFragments() {
        ArrayList<Fragment> fragments = new ArrayList<>();

        fragments.add(new InformationFraccionFragment());
        fragments.add(new TlcFragmen());

        return fragments;
    }

    private void setupViewPager () { //Pasando soporte de fragemnets, y lista que queremos agregar al adapter fragments
        viewPager.setAdapter(new PageAdapter(getSupportFragmentManager(), agregarFragments()));
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_barco);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_world);
    }
}

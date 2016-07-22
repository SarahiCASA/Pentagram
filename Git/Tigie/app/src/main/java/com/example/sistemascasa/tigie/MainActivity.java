package com.example.sistemascasa.tigie;

import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.example.sistemascasa.tigie.adapter.PageAdapter;
import com.example.sistemascasa.tigie.fragments.Chapters_Fragment;
import com.example.sistemascasa.tigie.presentador.IRecyclerViewFragmentChapterPre;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Context context;
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private RecyclerView listChapters;
    private IRecyclerViewFragmentChapterPre presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar   = (Toolbar)   findViewById(R.id.toolbar);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);

        if(toolbar != null)
            setSupportActionBar(toolbar);

       // listChapters = (RecyclerView) findViewById(R.id.rvChapters);
       // presenter = new RecyclerViewFragmentChapterPre(this, context);

        setUpViewPager();

    }

    private ArrayList<Fragment> agregarFragments () {
        ArrayList<Fragment> fragments = new ArrayList<>();

        fragments.add(new Chapters_Fragment());

        return fragments;
    }

    //Poner en orbitra los grafments
    public void setUpViewPager(){
        viewPager.setAdapter(new PageAdapter(getSupportFragmentManager(), agregarFragments()));
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_world);
        //tabLayout.getTabAt(1).setIcon(R.drawable.ic_barco);
    }



}

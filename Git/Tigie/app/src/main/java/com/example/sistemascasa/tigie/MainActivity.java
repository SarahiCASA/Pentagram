package com.example.sistemascasa.tigie;

import android.content.Context;
import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

import com.example.sistemascasa.tigie.adapter.ChapterAdapter;
import com.example.sistemascasa.tigie.adapter.HeadingAdapter;
import com.example.sistemascasa.tigie.adapter.PageAdapter;
import com.example.sistemascasa.tigie.fragments.Chapters_Fragment;
import com.example.sistemascasa.tigie.fragments.IRecyclerview_Fragment;
import com.example.sistemascasa.tigie.fragments.IRecyclerview_Heading;
import com.example.sistemascasa.tigie.pojo.Chapters;
import com.example.sistemascasa.tigie.pojo.Headings;
import com.example.sistemascasa.tigie.presentador.IRecyclerViewFragmentChapterPre;
import com.example.sistemascasa.tigie.presentador.IRecyclerViewFragmentHeadingPre;
import com.example.sistemascasa.tigie.presentador.RecyclerViewFragmentChapterPre;
import com.example.sistemascasa.tigie.presentador.RecyclerViewFragmentHeadingPre;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements IRecyclerview_Fragment  {
    private Context context;
    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private RecyclerView listChapters;
    private IRecyclerViewFragmentChapterPre presenter;
    private RecyclerView listHeadings;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*toolbar   = (Toolbar)   findViewById(R.id.toolbar);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);*/

        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);

        if(toolbar != null)
            setSupportActionBar(toolbar);

        //listHeadings = (RecyclerView) findViewById(R.id.rvHeadings);
        //presenter    = new RecyclerViewFragmentHeadingPre(this,  getApplicationContext(), 8);
        listChapters = (RecyclerView) findViewById(R.id.rvChapters);
        presenter = new RecyclerViewFragmentChapterPre(this, getApplicationContext());

        //setUpViewPager();

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

        //tabLayout.getTabAt(0).setIcon(R.drawable.ic_world);
        //tabLayout.getTabAt(1).setIcon(R.drawable.ic_barco);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        MenuItem searchItem = menu.findItem(R.id.search);
        SearchView searchView = (SearchView) MenuItemCompat.getActionView(searchItem);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.search:
                Intent intent = new Intent(this, FractionInformationActivity.class);

                TextView fraccionCode = (EditText) findViewById(R.id.editText);
                intent.putExtra("fractionCode", fraccionCode.getText());
                startActivity(intent);
                break;
            case R.id.contacto_menu:
                //Intent intent2 = new Intent(this, ContactoActividad.class);
                //startActivity(intent2);
                break;
            case R.id.acerca_menu:
                //Intent intent3 = new Intent(this, AcercaActividad.class);
                //startActivity(intent3);
                break;
            case R.id.configurarCuenta:
                //Intent intent4 = new Intent(this, ConfigurarCuenta.class);
                //startActivity(intent4);
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    /*
    ** Se comporte como un Layout
    ** Seteamos la lista en un formato de lista vertical
     */
    public void generarLinearLayoutVertical() {
        LinearLayoutManager llm = new LinearLayoutManager(this);
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listChapters.setLayoutManager(llm);

    }

    @Override
    public ChapterAdapter crearAdaptador(ArrayList<Chapters> chapters) {
        ChapterAdapter adapter = new ChapterAdapter(chapters,this);
        return adapter;
    }

    @Override
    public void inicializarAdaptadorRV(ChapterAdapter adapter) {
        listChapters.setAdapter(adapter);

    }

    @Override
    public void generarGridLayout() {
        GridLayoutManager glm=new GridLayoutManager(this,2);
        listChapters.setLayoutManager(glm);
    }

}

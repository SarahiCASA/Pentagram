package com.example.desarrolloweb.materialdessign;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.desarrolloweb.materialdessign.adapter.MascotasAdaptador;
import com.example.desarrolloweb.materialdessign.adapter.PageAdapter;
import com.example.desarrolloweb.materialdessign.fragments.PerfilFragment;
import com.example.desarrolloweb.materialdessign.fragments.fragment_recycler;
import com.example.desarrolloweb.materialdessign.pojo.Mascotas;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar2);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);


        if(toolbar != null) {
            setSupportActionBar(toolbar);
        }
        setupViewPager();
        /*Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);

       */
        //siguiente();

        /*ArrayList<String> nombresMascotas = new ArrayList<>();
        for (Mascotas mascota: mascotas) {
            nombresMascotas.add(mascota.getNombre());
        }*/
    }

    private ArrayList<Fragment> agregarFragments() {
        ArrayList<Fragment> fragments = new ArrayList<>();

        fragments.add(new fragment_recycler());
        fragments.add(new PerfilFragment());

        return fragments;
    }

    private void setupViewPager () { //Pasando soporte de fragemnets, y lista que queremos agregar al adapter fragments
        viewPager.setAdapter(new PageAdapter(getSupportFragmentManager(), agregarFragments()));
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_perrito_blanco);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_corazon);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_opciones, menu);
        return true;
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){

            case R.id.mAbout:
                Intent intent = new Intent (this, about.class);
                startActivity(intent);
                break;

            case R.id.mDatos:
                Intent intent2 = new Intent (this, datos_usuario.class);
                startActivity(intent2);
                break;

            case R.id.mEnviarNotificaciones:
                Intent intent4 = new Intent (this, EnviarNotificaciones.class);
                startActivity(intent4);
                break;

            case R.id.mRefresh:
                Intent intent3   = new Intent(MainActivity.this, VisitadasMascotas.class);
                startActivity(intent3);
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    public void siguiente (){

        /*Button button1  = (Button) findViewById(R.id.btnSiguiente);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent   = new Intent(MainActivity.this, VisitadasMascotas.class);
                startActivity(intent);
            }

        });*/
        FloatingActionButton miFab = (FloatingActionButton) findViewById(R.id.btnSiguiente);
        miFab.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v){
                Intent intent   = new Intent(MainActivity.this, VisitadasMascotas.class);
                startActivity(intent);
                //Snackbar.make(v, "HOLAA: " , Snackbar.LENGTH_SHORT).show();
            }
        });
    }

}

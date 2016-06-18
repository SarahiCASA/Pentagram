package com.example.desarrolloweb.datosusuarioandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by desarrolloweb on 17/06/16.
 */
public class Usuarios_dato extends AppCompatActivity {
    TextView tvNombre;
    TextView tvEmail;
    TextView tvTelefono;
    TextView tvDescContacto;
    TextView nombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.datos_usuario);

        Bundle parametros   = getIntent().getExtras();
        String iNombre      = parametros.getString(getResources().getString(R.string.pNombre));
        String iEmail       = parametros.getString(getResources().getString(R.string.pEmail));
        String iTelefono    = parametros.getString(getResources().getString(R.string.pTelefono));
        String iDescContacto = parametros.getString(getResources().getString(R.string.pDescContacto));

        tvNombre        = (TextView) findViewById(R.id.textNombre);
        tvEmail         = (TextView) findViewById(R.id.textEmail);
        tvTelefono      = (TextView) findViewById(R.id.textTelefono);
        tvDescContacto  = (TextView) findViewById(R.id.textdescconatcto);

        tvNombre.setText(iNombre);
        tvEmail.setText(iEmail);
        tvTelefono.setText(iTelefono);
        tvDescContacto.setText(iDescContacto);

        Button buttonEditar  = (Button) findViewById(R.id.botonRegresar);
        Button buttonSalir  = (Button) findViewById(R.id.botonSalir);

        buttonEditar.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intentDatos   = new Intent(Usuarios_dato.this, MainActivity.class);
                intentDatos.putExtra(getResources().getString(R.string.pNombre), tvNombre.getText());
                intentDatos.putExtra(getResources().getString(R.string.pEmail), tvEmail.getText());
                intentDatos.putExtra(getResources().getString(R.string.pTelefono), tvTelefono.getText());
                intentDatos.putExtra(getResources().getString(R.string.pDescContacto), tvDescContacto.getText());
                startActivity(intentDatos);
            }
        });

        /*buttonSalir.setOnClickListener(new View.OnClickListener() {

           finish();
        });*/
    }



}

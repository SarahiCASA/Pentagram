package com.example.desarrolloweb.datosusuarioandroid;

import android.app.DialogFragment;
import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.lang.reflect.Field;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    EditText editNombre;
    EditText editEmail;
    EditText tetelefono;
    EditText tedesccontacto;
    DatePicker picker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        editNombre      = (EditText)findViewById(R.id.tenombre);
        editEmail       = (EditText)findViewById(R.id.teemail);
        tetelefono      = (EditText)findViewById(R.id.tetelefono);
        tedesccontacto  = (EditText)findViewById(R.id.tedesccontacto);
        picker          = (DatePicker)findViewById(R.id.thePicker);


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        siguiente ();

        Bundle parametros   = getIntent().getExtras();

        if (parametros != null) {
            String iNombre      = parametros.getString(getResources().getString(R.string.pNombre));
            String iEmail       = parametros.getString(getResources().getString(R.string.pEmail));
            String iTelefono    = parametros.getString(getResources().getString(R.string.pTelefono));
            String iDescContacto = parametros.getString(getResources().getString(R.string.pDescContacto));

            editNombre.setText(iNombre);
            editEmail.setText(iEmail);
            tetelefono.setText(iTelefono);
            tedesccontacto.setText(iDescContacto);

        }
    }

    public static java.util.Date getDateFromDatePicket(DatePicker datePicker){
        int day = datePicker.getDayOfMonth();
        int month = datePicker.getMonth();
        int year =  datePicker.getYear();

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day);

        return calendar.getTime();
    }


    public void siguiente() {
        Button button1  = (Button) findViewById(R.id.botonSiguiente);
        editNombre      = (EditText)findViewById(R.id.tenombre);
        editEmail       = (EditText)findViewById(R.id.teemail);
        tetelefono      = (EditText)findViewById(R.id.tetelefono);
        tedesccontacto  = (EditText)findViewById(R.id.tedesccontacto);

        button1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

                Intent intent   = new Intent(MainActivity.this, Usuarios_dato.class);
                String nombre   = editNombre.getText().toString();
                String email    = editEmail.getText().toString();
                String telefono = tetelefono.getText().toString();
                String desCont  = tedesccontacto.getText().toString();

                intent.putExtra(getResources().getString(R.string.pNombre), nombre);
                intent.putExtra(getResources().getString(R.string.pEmail), email);
                intent.putExtra(getResources().getString(R.string.pTelefono), telefono);
                intent.putExtra(getResources().getString(R.string.pDescContacto), desCont);
                startActivity(intent);
            }

        });



    }


}



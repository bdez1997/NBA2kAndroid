package com.practice.nba2k;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int iPosition;
    ImageView imgJugador;
    Spinner spnName;
    TextView txtNombreRes,txtNacionalidadRes,txtEquipoRes,txtPosicionRes,txtPesoRes,txtAlturaRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgJugador=(ImageView) findViewById(R.id.imgJugador);
        Spinner spnName=(Spinner) findViewById(R.id.spnName);
        txtNombreRes=(TextView) findViewById(R.id.txtNombreRes);
        txtNacionalidadRes=findViewById(R.id.txtNacionalidadRes);
        txtEquipoRes=findViewById(R.id.txtEquipoRes);
        txtPosicionRes=findViewById(R.id.txtPosicionRes);
        txtPesoRes=findViewById(R.id.txtPesoRes);
        txtAlturaRes=findViewById(R.id.txtAlturaRes);


        spnName.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {
                position=spnName.getSelectedItemPosition();
                if(position==0){
                    imgJugador.setVisibility(View.INVISIBLE);
                    imgJugador.setEnabled(false);
                    txtNombreRes.setText(null);
                    txtNacionalidadRes.setText(null);
                    txtEquipoRes.setText(null);
                    txtPosicionRes.setText(null);
                    txtPesoRes.setText(null);
                    txtAlturaRes.setText(null);
                }
                if(position==1){
                    imgJugador.setVisibility(View.VISIBLE);
                    imgJugador.setEnabled(true);
                    imgJugador.setImageResource(R.drawable.michaeljordan);
                    txtNombreRes.setText("Michael Jordan");
                    txtNacionalidadRes.setText("USA");
                    txtEquipoRes.setText("Chicago Bulls");
                    txtPosicionRes.setText("Escolta");
                    txtPesoRes.setText("88KG");
                    txtAlturaRes.setText("198Cm");
                }
                if(position==2){
                    imgJugador.setVisibility(View.VISIBLE);
                    imgJugador.setEnabled(true);
                    imgJugador.setImageResource(R.drawable.kobebryant);
                    txtNombreRes.setText("Kobe Bryant");
                    txtNacionalidadRes.setText("USA");
                    txtEquipoRes.setText("Angeles Lakers");
                    txtPosicionRes.setText("Escolta");
                    txtPesoRes.setText("96KG");
                    txtAlturaRes.setText("198Cm");
                }
                if(position==3){
                    imgJugador.setVisibility(View.VISIBLE);
                    imgJugador.setEnabled(true);
                    imgJugador.setImageResource(R.drawable.paugasol);
                    txtNombreRes.setText("Pau Gasol");
                    txtNacionalidadRes.setText("ESP");
                    txtEquipoRes.setText("Memphis Grizzlies");
                    txtPosicionRes.setText("Ala-pívot");
                    txtPesoRes.setText("113KG");
                    txtAlturaRes.setText("213Cm");
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });



    }


}
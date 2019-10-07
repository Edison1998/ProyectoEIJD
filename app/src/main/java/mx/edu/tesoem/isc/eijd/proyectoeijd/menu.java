package mx.edu.tesoem.isc.eijd.proyectoeijd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

public class menu extends AppCompatActivity implements View.OnClickListener{
//Botones
    Button btnAlgebra,btnCalcDif,btnCalcInt,btnEcuDif,btnGeo,btnGeoA,btnTrigo,btnAceDe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

//Algebra
        btnAlgebra=(Button)findViewById(R.id.algebraBoton);
        btnAlgebra.setOnClickListener(this);
//Calculo Diferencial
        btnCalcDif=(Button)findViewById(R.id.calcDifBoton);
        btnCalcDif.setOnClickListener(this);
//Calculo Integral
        btnCalcInt=(Button)findViewById(R.id.calcIntBoton);
        btnCalcInt.setOnClickListener(this);
//Ecuaciones Diferenciales
        btnEcuDif=(Button)findViewById(R.id.ecuDifBoton);
        btnEcuDif.setOnClickListener(this);
//Geometria
        btnGeo=(Button)findViewById(R.id.geoBoton);
        btnGeo.setOnClickListener(this);
//Geometria Analitica
        btnGeoA=(Button)findViewById(R.id.geoABoton);
        btnGeoA.setOnClickListener(this);
//Trigonometria
        btnTrigo=(Button)findViewById(R.id.trigoBoton);
        btnTrigo.setOnClickListener(this);
//Acerca De
        btnAceDe=(Button)findViewById(R.id.acercaBoton);
        btnAceDe.setOnClickListener(this);
    }
    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.algebraBoton:
                Intent
                        fAlgebra = new Intent(this, Algebra.class);
                startActivity(fAlgebra);
                finish();
                break;
            case R.id.calcDifBoton:
                Intent fCalcDif = new Intent(this, CalculoDiferencial.class);
                startActivity(fCalcDif);
                finish();
                break;
            case R.id.calcIntBoton:
                Intent fCalcInt = new Intent(this, CalculoIntegral.class);
                startActivity(fCalcInt);
                finish();
                break;
            case R.id.ecuDifBoton:
                Intent fEcuDif = new Intent(this, EcuacionesDiferenciales.class);
                startActivity(fEcuDif);
                finish();
                break;
            case R.id.geoBoton:
                Intent fGeome = new Intent(this, Geometria.class);
                startActivity(fGeome);
                finish();
                break;
            case R.id.geoABoton:
                Intent fGeoA = new Intent(this, GeometriaAnalitica.class);
                startActivity(fGeoA);
                finish();
                break;
            case R.id.trigoBoton:
                Intent fTrigo = new Intent(this, Trigonometria.class);
                startActivity(fTrigo);
                finish();
                break;
            case R.id.acercaBoton:
                Intent acercaDe = new Intent(this, Acerca.class);
                startActivity(acercaDe);
                finish();
                break;
        }
    }
}

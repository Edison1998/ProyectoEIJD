package mx.edu.tesoem.isc.eijd.proyectoeijd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Acerca extends AppCompatActivity implements View.OnClickListener {
Button volverMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acerca);
        volverMenu=(Button)findViewById(R.id.volver8);
        volverMenu.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent regresar = new Intent(this, menu.class);
        startActivity(regresar);
        finish();
    }
}

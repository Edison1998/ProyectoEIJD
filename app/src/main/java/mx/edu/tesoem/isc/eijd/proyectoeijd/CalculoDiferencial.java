package mx.edu.tesoem.isc.eijd.proyectoeijd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import uk.co.senab.photoview.PhotoViewAttacher;

public class CalculoDiferencial extends AppCompatActivity implements View.OnClickListener{
ImageView imageViewCalDif;
PhotoViewAttacher photoViewAttacherCalDif;
Button volverMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo_diferencial);

        imageViewCalDif=(ImageView)findViewById(R.id.formCalDif1);
        photoViewAttacherCalDif = new PhotoViewAttacher(imageViewCalDif);

        volverMenu=(Button)findViewById(R.id.volver2);
        volverMenu.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent regresar = new Intent(this,menu.class);
        startActivity(regresar);
        finish();
    }
}

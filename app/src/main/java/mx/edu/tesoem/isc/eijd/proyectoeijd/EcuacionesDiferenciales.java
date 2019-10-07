package mx.edu.tesoem.isc.eijd.proyectoeijd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import uk.co.senab.photoview.PhotoViewAttacher;

public class EcuacionesDiferenciales extends AppCompatActivity implements View.OnClickListener{
ImageView imageViewEcuDif1,imageViewEcuDif2,imageViewEcuDif3;
PhotoViewAttacher photoViewAttacherEcuDif1,photoViewAttacherEcuDif2,photoViewAttacherEcuDif3;
Button volverMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ecuaciones_diferenciales);
        imageViewEcuDif1=(ImageView)findViewById(R.id.ecuDif1);
        imageViewEcuDif2=(ImageView)findViewById(R.id.ecudif2);
        imageViewEcuDif3=(ImageView)findViewById(R.id.ecuDif3);
        photoViewAttacherEcuDif1 = new PhotoViewAttacher(imageViewEcuDif1);
        photoViewAttacherEcuDif2 = new PhotoViewAttacher(imageViewEcuDif2);
        photoViewAttacherEcuDif3 = new PhotoViewAttacher(imageViewEcuDif3);
        volverMenu=(Button)findViewById(R.id.volver4);
        volverMenu.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent regresar = new Intent(this, menu.class);
        startActivity(regresar);
        finish();
    }
}

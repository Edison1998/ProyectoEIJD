package mx.edu.tesoem.isc.eijd.proyectoeijd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import uk.co.senab.photoview.PhotoViewAttacher;

public class GeometriaAnalitica extends AppCompatActivity implements View.OnClickListener{
    ImageView imageViewGeoA1,imageViewGeoA2;
    PhotoViewAttacher photoViewAttacherGeoA1,photoViewAttacherGeoA2;
    Button volverMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geometria_analitica);
        imageViewGeoA1=(ImageView)findViewById(R.id.fGeoA1);
        imageViewGeoA2=(ImageView)findViewById(R.id.fGeoA2);
        photoViewAttacherGeoA1 = new PhotoViewAttacher(imageViewGeoA1);
        photoViewAttacherGeoA2 = new PhotoViewAttacher(imageViewGeoA2);
        volverMenu=(Button)findViewById(R.id.volver6);
        volverMenu.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent regresar = new Intent(this, menu.class);
        startActivity(regresar);
        finish();
    }
}

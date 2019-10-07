package mx.edu.tesoem.isc.eijd.proyectoeijd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import uk.co.senab.photoview.PhotoViewAttacher;

public class Trigonometria extends AppCompatActivity implements View.OnClickListener {
ImageView imageViewT1,imageViewT2;
PhotoViewAttacher photoViewAttacherT1,photoViewAttacherT2;
Button volveMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trigonometria);
        imageViewT1=(ImageView)findViewById(R.id.formTrigo1);
        imageViewT2=(ImageView)findViewById(R.id.formTrigo2);
        photoViewAttacherT1 = new PhotoViewAttacher(imageViewT1);
        photoViewAttacherT2 = new PhotoViewAttacher(imageViewT2);
        volveMenu=(Button)findViewById(R.id.volver7);
        volveMenu.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent regresar = new Intent(this, menu.class);
        startActivity(regresar);
        finish();
    }
}

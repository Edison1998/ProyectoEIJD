package mx.edu.tesoem.isc.eijd.proyectoeijd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import uk.co.senab.photoview.PhotoViewAttacher;

public class Algebra extends AppCompatActivity implements View.OnClickListener{
    ImageView imageViewAlgebra;
    PhotoViewAttacher photoViewAttacherAlgebra;
Button volverMenu1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algebra);
imageViewAlgebra=(ImageView)findViewById(R.id.formAlgebra1);
photoViewAttacherAlgebra = new PhotoViewAttacher(imageViewAlgebra);

        volverMenu1=(Button)findViewById(R.id.volver1);
        volverMenu1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent regresar = new Intent(this,menu.class);
        startActivity(regresar);
        finish();
    }
}

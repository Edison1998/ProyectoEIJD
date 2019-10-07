package mx.edu.tesoem.isc.eijd.proyectoeijd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import uk.co.senab.photoview.PhotoViewAttacher;

public class CalculoIntegral extends AppCompatActivity implements View.OnClickListener {
ImageView imageViewCalInt1;
ImageView imageViewCalInt2;
PhotoViewAttacher photoViewAttacherCalInt1;
PhotoViewAttacher photoViewAttacherCalInt2;
Button volverMenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo_integral);

        imageViewCalInt1=(ImageView)findViewById(R.id.formCalInt1);
        imageViewCalInt2=(ImageView)findViewById(R.id.formCalInt2);
        photoViewAttacherCalInt1 = new PhotoViewAttacher(imageViewCalInt1);
        photoViewAttacherCalInt2 = new PhotoViewAttacher(imageViewCalInt2);
        volverMenu=(Button)findViewById(R.id.volver3);
        volverMenu.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent regresar = new Intent(this,menu.class);
        startActivity(regresar);
        finish();
    }
}

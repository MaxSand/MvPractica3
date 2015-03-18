package app.com.dm.android.listviewlibros;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Max_Sandoval on 17/03/2015.
 */
public class Nueva extends ActionBarActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nueva);

        Bundle b = getIntent().getExtras();
        int position = b.getInt("posicion");
        ImageView image = (ImageView) findViewById(R.id.imagenLibro);
        TextView texto = (TextView) findViewById(R.id.textoLibro);

        switch (position) {
            case 0:
                image.setImageResource(R.drawable.l1);
                texto.setText("Desarrollo de aplicaciones moviles con Xamarin creado por Microsoft.");
                break;
            case 1:
                image.setImageResource(R.drawable.l2);
                texto.setText("Introduccion a la Programacion Multicore en tarjetas Nvidia.");
                break;
            case 2:
                image.setImageResource(R.drawable.l3);
                texto.setText("Probabilidad y estadistica para Ingenieros.");
                break;
            case 3:
                image.setImageResource(R.drawable.l4);
                texto.setText("Buenas practicas de desarrollo para la industria, ser un desarrollador comprendido.");
                break;
            case 4:
                image.setImageResource(R.drawable.l5);
                texto.setText("Introduccion al desarrollo de android en español.");
                break;
            case 5:
                image.setImageResource(R.drawable.l6);
                texto.setText("Programacion de Android avanzada para desarrolladores experimentados.");
                break;
            case 6:
                image.setImageResource(R.drawable.l7);
                texto.setText("Introduccion a la programacion en JAVA 7ma edicion, contiene varios ejemplos y actividades.");
                break;
            case 7:
                image.setImageResource(R.drawable.l8);
                texto.setText("Introduccion a la programacion en JAVA 9na edicion, contiene varios ejemplos y actividades.");
                break;
            case 8:
                image.setImageResource(R.drawable.l9);
                texto.setText("Establece como te persive la gente, la imagen publica dentro de una imagen cool y refrescante.");
                break;
            case 9:
                image.setImageResource(R.drawable.l10);
                texto.setText("Como programar en C++ con una gran variedad de ejemplos y actividades.");
                break;
        }
    }
}

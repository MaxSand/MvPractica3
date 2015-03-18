package app.com.dm.android.listviewlibros;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    ListView listView ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.list);
        String[] values = new String[] {"1.Mobile apps whit Xamarin",
                                        "2.CUDA by example",
                                        "3.Probabilidad y estadistica",
                                        "4.Libro negro del Programador",
                                        "5.El gran libro de Android",
                                        "6.Programacion avanzada Android",
                                        "7.Como Programar en JAVA 7ma",
                                        "8.Como Programar en JAVA 9na",
                                        "9.Imagen Cool",
                                        "10.Como Programar en C++ 7ma"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, android.R.id.text1, values);


        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,int position, long id) {
                int itemPosition     = position;
                String  itemValue    = (String) listView.getItemAtPosition(position);

                // Show Alert
                Toast.makeText(getApplicationContext(),"Posición :" + itemPosition + "  ListItem : " + itemValue, Toast.LENGTH_LONG).show();

                Intent myIntent = new Intent(MainActivity.this, Nueva.class);
                myIntent.putExtra("posicion",position);
                MainActivity.this.startActivity(myIntent);


            }
        });
    }
}


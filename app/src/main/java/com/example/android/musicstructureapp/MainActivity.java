package com.example.android.musicstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find the View that shows the dames category
        TextView dames = (TextView) findViewById(R.id.dames);

        // Set a click listener on that View
        dames.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the dames View is clicked on.
            @Override
            public void onClick(View view) {
                //Create a new intent to open the {@link DamesActivity}
                Intent damesIntent = new Intent(MainActivity.this,
                        DamesActivity.class);

                // Start the new activity
                startActivity(damesIntent);
            }

        });

        // Find the View that shows the sonidos category
        TextView sonidos = (TextView) findViewById(R.id.listado_sonidos);

        // Set a click listener on that View
        sonidos.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the sonidos View is clicked on.
            @Override
            public void onClick(View view) {
                Intent sonidosIntent = new Intent(MainActivity.this,
                        SonidosActivity.class);

                // Start the new activity
                startActivity(sonidosIntent);
            }
        });

        // Find the View that shows the proyecto category
        TextView proyecto = (TextView) findViewById(R.id.proyecto);

        // Set a click listener on that View
        proyecto.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the proyecto View is clicked on.
            @Override
            public void onClick(View view) {
                Intent proyectoIntent = new Intent(MainActivity.this,
                        ProyectoActivity.class);

                // Start the new activity
                startActivity(proyectoIntent);
            }
        });

        // Find the View that shows the bruforrellad category
        TextView bruforrellad = (TextView) findViewById(R.id.bruforrellad);

        // Set a click listener on that View
        bruforrellad.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the artistas View is clicked on.
            @Override
            public void onClick(View view) {
                Intent bruforrelladIntent = new Intent(MainActivity.this,
                        ArtistsActivity.class);

                // Start the new activity
                startActivity(bruforrelladIntent);
            }
        });

        // Find the View that shows the vidrieras category
        TextView vidrieras = (TextView) findViewById(R.id.vidrieras);

        // Set a click listener on that View
        vidrieras.setOnClickListener(new View.OnClickListener() {

            // The code in this method will be executed when the museo View is clicked on.
            @Override
            public void onClick(View view) {
                Intent vidrierasIntent = new Intent(MainActivity.this,
                        VidrierasActivity.class);

                // Start the new activity
                startActivity(vidrierasIntent);
            }
        });

    }
}

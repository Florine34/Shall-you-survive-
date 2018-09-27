package com.example.justine.shallyousurvive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import com.example.justine.shallyousurvive.Activities.ChoixPersoActivity;
import com.example.justine.shallyousurvive.Activities.ReglesActivity;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        final ImageButton buttonJ = findViewById(R.id.boutonJouer);
        buttonJ.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Log.i("DICJ","mainactivity.choixPerso");
                Intent intentAccueil = new Intent(MainActivity.this, ChoixPersoActivity.class);
                startActivity(intentAccueil);
                //finish();

            }
        });

        final ImageButton buttonR = findViewById(R.id.boutonRegles);
        buttonR.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intentAccueil = new Intent(MainActivity.this, ReglesActivity.class);
                startActivity(intentAccueil);
                //finish();
            }
        });

        final ImageButton buttonQ = findViewById(R.id.boutonQuitter);
        buttonQ.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //finish();
                System.exit(0);
            }
        });
    }

    //create the menu
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_goBack:
                Intent intentAccueil = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intentAccueil);
                finish();
                return true;

            case R.id.action_quit:
                finish();
                System.exit(0);
                return true;

            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);

        }
    }
}
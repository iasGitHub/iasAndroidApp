package sn.ias.iasandroidapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void button01Clicked(View view) {
        Intent profilActivity = new Intent(MainActivity.this, sn.ias.iasandroidapp.profilActivity.class);
        startActivity(profilActivity);
    }

    public void button02Clicked(View view) {
        Intent formationActivity = new Intent(MainActivity.this, sn.ias.iasandroidapp.formationActivity.class);
        startActivity(formationActivity);
    }

    public void button03Clicked(View view) {
        Intent competenceActivity = new Intent(MainActivity.this, sn.ias.iasandroidapp.competenceActivity.class);
        startActivity(competenceActivity);
    }

    public void button04Clicked(View view) {
        Intent experienceActivity = new Intent(MainActivity.this, sn.ias.iasandroidapp.experienceActivity.class);
        startActivity(experienceActivity);
    }

    public void button05Clicked(View view) {
        Intent qualiteActivity = new Intent(MainActivity.this, sn.ias.iasandroidapp.qualiteActivity.class);
        startActivity(qualiteActivity);
    }

    public void button06Clicked(View view) {
        Intent referenceActivity = new Intent(MainActivity.this, sn.ias.iasandroidapp.referenceActivity.class);
        startActivity(referenceActivity);
    }

    public void button07Clicked(View view) {
        Intent loisirsActivity = new Intent(MainActivity.this, sn.ias.iasandroidapp.loisirsActivity.class);
        startActivity(loisirsActivity);
    }
}
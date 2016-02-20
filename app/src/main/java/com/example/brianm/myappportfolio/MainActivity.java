package com.example.brianm.myappportfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

  Button spotifyStreamerButton, scoresAppButton, libraryApp, buildItBigger, xyzReader, capstone;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    setSupportActionBar(toolbar);

    spotifyStreamerButton = (Button) findViewById(R.id.spotifyStreamer);
    scoresAppButton = (Button) findViewById(R.id.scoresApp);
    libraryApp = (Button) findViewById(R.id.libraryApp);
    buildItBigger = (Button) findViewById(R.id.buildItBigger);
    xyzReader = (Button) findViewById(R.id.xyzReader);
    capstone = (Button) findViewById(R.id.capstone);

    spotifyStreamerButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Toast.makeText(MainActivity.this, "You clicked on the spotify button", Toast.LENGTH_LONG).show();
      }
    });

    scoresAppButton.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Toast.makeText(MainActivity.this, "You clicked on the scores app button", Toast.LENGTH_LONG).show();
      }
    });

    libraryApp.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Toast.makeText(MainActivity.this, "You clicked on the library app button", Toast.LENGTH_LONG).show();
      }
    });

    buildItBigger.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Toast.makeText(MainActivity.this, "You clicked on the build it bigger button", Toast.LENGTH_LONG).show();
      }
    });

    xyzReader.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Toast.makeText(MainActivity.this, "You clicked on the xyz reader button", Toast.LENGTH_LONG).show();
      }
    });

    capstone.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View v) {
        Toast.makeText(MainActivity.this, "You clicked on the capstone button", Toast.LENGTH_LONG).show();
      }
    });

  }

  @Override
  public boolean onCreateOptionsMenu(Menu menu) {
    // Inflate the menu; this adds items to the action bar if it is present.
    getMenuInflater().inflate(R.menu.menu_main, menu);
    return true;
  }

  @Override
  public boolean onOptionsItemSelected(MenuItem item) {
    // Handle action bar item clicks here. The action bar will
    // automatically handle clicks on the Home/Up button, so long
    // as you specify a parent activity in AndroidManifest.xml.
    int id = item.getItemId();

    //noinspection SimplifiableIfStatement
    if (id == R.id.action_settings) {
      return true;
    }

    return super.onOptionsItemSelected(item);
  }
}

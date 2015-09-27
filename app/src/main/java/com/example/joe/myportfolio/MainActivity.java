package com.example.joe.myportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
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
    @OnClick(R.id.spotifyButton)
    public void toastSpotifyApp(){
        Toast.makeText(this, "This will launch Spotify Streamer App", Toast.LENGTH_LONG).show();
    }
    @OnClick(R.id.scoreAppButton)
    public void toastScoreApp(){
        Toast.makeText(this, "This will launch Score App", Toast.LENGTH_SHORT).show();
    }
    @OnClick(R.id.libraryAppButton)
    public void toastLibraryApp(){
        Toast.makeText(this, "This will launch Library App", Toast.LENGTH_SHORT).show();
    }
    @OnClick(R.id.buildItBiggerButton)
    public void toastBuildItBiggerApp(){
        Toast.makeText(this, "This will launch Build it Bigger App", Toast.LENGTH_SHORT).show();
    }
    @OnClick(R.id.XYZReaderButton)
    public void toastXYZReaderApp(){
        Toast.makeText(this, "This will launch XYZ Reader App", Toast.LENGTH_SHORT).show();
    }
    @OnClick(R.id.myOwnAppButton)
    public void toastMyOwnApp(){
        Toast.makeText(this, "This will launch my Own App", Toast.LENGTH_SHORT).show();
    }
}

package com.example.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity
{
   /*We can get references for our two GUI components using a method called
   findViewById(). This method takes the ID of the GUI component as
   a parameter, and returns a View object. You then cast the return value
   to the*/
   private TrackExpert expert = new TrackExpert();
   //StringBuilder str;
   List<String> str;


   @Override
   protected void onCreate(Bundle savedInstanceState)
   {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);
   }

   public void onClickFindTracks(View view){

      TextView tracks = findViewById(R.id.textViewTop5Tracks);
      Spinner spinnerArtists = findViewById(R.id.rapper);
      String currentValue = String.valueOf(spinnerArtists.getSelectedItem());

      List<String> tracksArtist = expert.getTracks(currentValue);
      //str = new StringBuilder();
      str = new ArrayList<>();
      for(String track : tracksArtist)
      {
         str.add(track + '\n');
      }
      tracks.setText(str.toString());
   }

   public void onClickActivity(View view){
      Intent intent = new Intent(this,TracksActivity.class);
      startActivity(intent);
      intent.putExtra("values", str.toString());
   }
}

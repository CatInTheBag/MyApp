package com.example.myapp;

import java.util.ArrayList;
import java.util.List;

public class TrackExpert
{
   List<String> getTracks(String artist)
   {
      List<String> list = new ArrayList<>();
      if(artist.equals("2Pac"))
      {
         list.add("Changes");
         list.add("Bad Guy");
         list.add("Bad Guy 2");
         list.add("Black Cotton");
         list.add("Ready4Whatever");
      }
      else if(artist.equals("Drake"))
      {
         list.add("Sicko mode");
         list.add("0 to 100");
         list.add("Worst Behaviour");
         list.add("No Stylist");
         list.add("Nonstop");
      }

      return list;
   }
}

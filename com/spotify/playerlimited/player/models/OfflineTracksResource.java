package com.spotify.playerlimited.player.models.OfflineTracksResource;
import com.spotify.playerlimited.player.models.OfflineResource;
import java.lang.String;
import java.util.Iterator;
import java.lang.Iterable;
import java.lang.Object;
import java.lang.StringBuilder;
import p.hr7;

public final class OfflineTracksResource extends OfflineResource	// class@000b80 from classes.dex
{
    public List c;

    public void OfflineTracksResource(){
       super();
    }
    public static void getTracks$annotations(){
    }
    public final String toString(){
       OfflineTracksResource tc = this.c;
       String str = "";
       if (tc != null) {
          Iterator iterator = tc.iterator();
          String str1 = str;
          while (iterator.hasNext()) {
             OfflineResource offlineResou = iterator.next();
             str1 = hr7.a("".append(str1).append('[').append(offlineResou.a).append(" : "), offlineResou.b, ']');
          }
          if (str1 != null) {
             str = str1;
          }
       }
       return str;
    }
}

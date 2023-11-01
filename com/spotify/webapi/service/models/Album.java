package com.spotify.webapi.service.models.Album;
import com.spotify.webapi.service.models.AlbumSimple;

public final class Album extends AlbumSimple	// class@000c60 from classes.dex
{
    public List artists;
    public List copyrights;
    public Map external_ids;
    public List genres;
    public Integer popularity;
    public String release_date;
    public String release_date_precision;
    public Pager tracks;

    public void Album(){
       super();
    }
    public static void getArtists$annotations(){
    }
    public static void getCopyrights$annotations(){
    }
    public static void getExternal_ids$annotations(){
    }
    public static void getGenres$annotations(){
    }
    public static void getPopularity$annotations(){
    }
    public static void getRelease_date$annotations(){
    }
    public static void getRelease_date_precision$annotations(){
    }
    public static void getTracks$annotations(){
    }
}

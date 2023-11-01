package com.spotify.webapi.service.models.Artist;
import com.spotify.webapi.service.models.ArtistSimple;
import java.util.List;

public final class Artist extends ArtistSimple	// class@000c6a from classes.dex
{
    public Followers followers;
    public List genres;
    public List images;
    public Integer popularity;

    public void Artist(){
       super();
    }
    public static void getFollowers$annotations(){
    }
    public static void getGenres$annotations(){
    }
    public static void getImages$annotations(){
    }
    public static void getPopularity$annotations(){
    }
    public List images(){
       return this.images;
    }
    public boolean isPlayable(){
       return true;
    }
}

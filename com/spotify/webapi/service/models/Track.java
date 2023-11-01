package com.spotify.webapi.service.models.Track;
import com.spotify.webapi.service.models.TrackSimple;
import java.util.List;
import com.spotify.webapi.service.models.AlbumSimple;

public final class Track extends TrackSimple	// class@000cbf from classes.dex
{
    public AlbumSimple album;
    public Map external_ids;
    public Integer popularity;

    public void Track(){
       super();
    }
    public static void getAlbum$annotations(){
    }
    public static void getExternal_ids$annotations(){
    }
    public static void getPopularity$annotations(){
    }
    public List images(){
       Track talbum;
       AlbumSimple images = ((talbum = this.album) != null)? talbum.images: null;
       return images;
    }
}

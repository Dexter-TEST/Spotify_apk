package com.spotify.webapi.service.models.PlaylistSimple;
import com.spotify.webapi.service.models.PlaylistBase;
import java.lang.String;
import java.util.List;
import com.spotify.webapi.service.models.Entity;

public final class PlaylistSimple extends PlaylistBase	// class@000c9f from classes.dex
{
    public PlaylistTracksInformation tracks;

    public void PlaylistSimple(){
       super();
    }
    public void PlaylistSimple(String p0,List p1,String p2,String p3){
       super();
       this.uri = p0;
       this.images = p1;
       this.name = p2;
       this.type = p3;
    }
    public static void getTracks$annotations(){
    }
}

package com.spotify.webapi.service.models.ArtistSimple;
import com.spotify.webapi.service.models.Entity;
import java.lang.String;
import java.util.List;

public class ArtistSimple extends Entity	// class@000c6c from classes.dex
{
    public Map external_urls;
    public String href;
    public String id;
    public String name;
    public String uri;

    public void ArtistSimple(){
       super();
    }
    public static void getExternal_urls$annotations(){
    }
    public static void getHref$annotations(){
    }
    public static void getId$annotations(){
    }
    public static void getName$annotations(){
    }
    public static void getUri$annotations(){
    }
    public String href(){
       return this.href;
    }
    public String id(){
       return this.id;
    }
    public List images(){
       return null;
    }
    public String name(){
       return this.name;
    }
    public String uri(){
       return this.uri;
    }
}

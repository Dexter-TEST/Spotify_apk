package com.spotify.webapi.service.models.AlbumSimple;
import com.spotify.webapi.service.models.Entity;
import java.lang.String;
import java.util.List;

public class AlbumSimple extends Entity	// class@000c64 from classes.dex
{
    public String album_type;
    public List available_markets;
    public Map external_urls;
    public String href;
    public String id;
    public List images;
    public String name;
    public String uri;

    public void AlbumSimple(){
       super();
    }
    public static void getAlbum_type$annotations(){
    }
    public static void getAvailable_markets$annotations(){
    }
    public static void getExternal_urls$annotations(){
    }
    public static void getHref$annotations(){
    }
    public static void getId$annotations(){
    }
    public static void getImages$annotations(){
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
       return this.images;
    }
    public boolean isPlayable(){
       return true;
    }
    public String name(){
       return this.name;
    }
    public String uri(){
       return this.uri;
    }
}

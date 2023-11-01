package com.spotify.webapi.service.models.views.ViewsBestMatch;
import com.spotify.webapi.service.models.Entity;
import java.lang.String;
import java.util.List;

public final class ViewsBestMatch extends Entity	// class@000cd9 from classes.dex
{
    public String href;
    public String id;
    public List images;
    public String name;
    public String uri;

    public void ViewsBestMatch(){
       super();
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

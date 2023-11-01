package com.spotify.webapi.service.models.views.Station;
import com.spotify.webapi.service.models.Entity;
import java.lang.String;
import java.util.List;

public class Station extends Entity	// class@000cd5 from classes.dex
{
    public List images;
    public String name;
    public String subtitle;
    public String title;
    public String uri;

    public void Station(){
       super();
    }
    public static void getImages$annotations(){
    }
    public static void getName$annotations(){
    }
    public static void getSubtitle$annotations(){
    }
    public static void getTitle$annotations(){
    }
    public static void getUri$annotations(){
    }
    public String href(){
       return null;
    }
    public String id(){
       return null;
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

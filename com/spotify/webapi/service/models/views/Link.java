package com.spotify.webapi.service.models.views.Link;
import com.spotify.webapi.service.models.Entity;
import java.lang.String;
import java.util.List;

public class Link extends Entity	// class@000cd3 from classes.dex
{
    public String href;
    public List images;
    public String name;
    public String uri;

    public void Link(){
       super();
    }
    public void Link(String p0,List p1,String p2,String p3){
       super();
       this.href = p0;
       this.images = p1;
       this.name = p2;
       this.type = p3;
    }
    public static void getHref$annotations(){
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

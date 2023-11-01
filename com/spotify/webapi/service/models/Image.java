package com.spotify.webapi.service.models.Image;
import java.lang.Object;
import java.lang.Integer;
import java.lang.String;
import p.io2;
import java.util.Arrays;

public class Image	// class@000c90 from classes.dex
{
    public Integer height;
    public String url;
    public Integer width;

    public void Image(){
       super();
    }
    public void Image(Integer p0,Integer p1,String p2){
       super();
       this.width = p0;
       this.height = p1;
       this.url = p2;
    }
    public static void getHeight$annotations(){
    }
    public static void getUrl$annotations(){
    }
    public static void getWidth$annotations(){
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof Image) {
          return false;
       }
       if (!io2.j(this.width, p0.width) || (!io2.j(this.height, p0.height) || !io2.j(this.url, p0.url))) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       Object[] objArray = new Object[]{this.width,this.height,this.url};
       return Arrays.hashCode(objArray);
    }
}

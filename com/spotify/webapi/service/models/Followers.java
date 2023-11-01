package com.spotify.webapi.service.models.Followers;
import java.lang.Object;
import p.io2;
import java.util.Arrays;

public final class Followers	// class@000c8e from classes.dex
{
    public String href;
    public Integer total;

    public void Followers(){
       super();
    }
    public static void getHref$annotations(){
    }
    public static void getTotal$annotations(){
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof Followers) {
          return false;
       }
       if (!io2.j(this.href, p0.href) || !io2.j(this.total, p0.total)) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       Object[] objArray = new Object[]{this.href,this.total};
       return Arrays.hashCode(objArray);
    }
}

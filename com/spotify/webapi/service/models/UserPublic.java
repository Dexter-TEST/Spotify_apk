package com.spotify.webapi.service.models.UserPublic;
import java.lang.Object;
import p.io2;
import java.util.Arrays;

public class UserPublic	// class@000cd1 from classes.dex
{
    public String display_name;
    public Map external_urls;
    public Followers followers;
    public String href;
    public String id;
    public List images;
    public String type;
    public String uri;

    public void UserPublic(){
       super();
    }
    public static void getDisplay_name$annotations(){
    }
    public static void getExternal_urls$annotations(){
    }
    public static void getFollowers$annotations(){
    }
    public static void getHref$annotations(){
    }
    public static void getId$annotations(){
    }
    public static void getImages$annotations(){
    }
    public static void getType$annotations(){
    }
    public static void getUri$annotations(){
    }
    public boolean equals(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof UserPublic) {
          return false;
       }
       if (!io2.j(this.display_name, p0.display_name) || (!io2.j(this.external_urls, p0.external_urls) || (!io2.j(this.followers, p0.followers) || (!io2.j(this.href, p0.href) || (!io2.j(this.id, p0.id) || (!io2.j(this.images, p0.images) || (!io2.j(this.type, p0.type) || !io2.j(this.uri, p0.uri)))))))) {
          b = false;
       }
       return b;
    }
    public int hashCode(){
       Object[] objArray = new Object[]{this.display_name,this.external_urls,this.followers,this.href,this.id,this.images,this.type,this.uri};
       return Arrays.hashCode(objArray);
    }
}

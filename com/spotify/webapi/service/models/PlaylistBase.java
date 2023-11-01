package com.spotify.webapi.service.models.PlaylistBase;
import com.spotify.webapi.service.models.Entity;
import java.lang.String;
import java.util.List;

public class PlaylistBase extends Entity	// class@000c9a from classes.dex
{
    public Boolean collaborative;
    public String description;
    public Map external_urls;
    public String href;
    public String id;
    public List images;
    public Boolean is_public;
    public String name;
    public UserPublic owner;
    public String snapshot_id;
    public String uri;

    public void PlaylistBase(){
       super();
    }
    public static void getCollaborative$annotations(){
    }
    public static void getDescription$annotations(){
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
    public static void getOwner$annotations(){
    }
    public static void getSnapshot_id$annotations(){
    }
    public static void getUri$annotations(){
    }
    public static void is_public$annotations(){
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

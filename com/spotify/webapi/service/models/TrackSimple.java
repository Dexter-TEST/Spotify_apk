package com.spotify.webapi.service.models.TrackSimple;
import com.spotify.webapi.service.models.Entity;
import java.lang.String;
import java.util.List;
import java.lang.Object;
import p.co5;
import java.lang.Boolean;

public class TrackSimple extends Entity	// class@000cc1 from classes.dex
{
    public List artists;
    public List available_markets;
    public int disc_number;
    public long duration_ms;
    public Boolean explicit;
    public Map external_urls;
    public String href;
    public String id;
    public Boolean is_playable;
    public LinkedTrack linked_from;
    public String name;
    public String preview_url;
    public String[] tags;
    public int track_number;
    public String uri;

    public void TrackSimple(){
       super();
    }
    public static void getArtists$annotations(){
    }
    public static void getAvailable_markets$annotations(){
    }
    public static void getDisc_number$annotations(){
    }
    public static void getDuration_ms$annotations(){
    }
    public static void getExplicit$annotations(){
    }
    public static void getExternal_urls$annotations(){
    }
    public static void getHref$annotations(){
    }
    public static void getId$annotations(){
    }
    public static void getLinked_from$annotations(){
    }
    public static void getName$annotations(){
    }
    public static void getPreview_url$annotations(){
    }
    public static void getTags$annotations(){
    }
    public static void getTrack_number$annotations(){
    }
    public static void getUri$annotations(){
    }
    public static void is_playable$annotations(){
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
    public boolean isExplicit(){
       TrackSimple texplicit = this.explicit;
       co5.i(texplicit);
       return texplicit.booleanValue();
    }
    public boolean isPlayable(){
       TrackSimple tis_playable;
       boolean b;
       if ((tis_playable = this.is_playable) == null) {
          b = false;
       }else {
          co5.i(tis_playable);
          b = tis_playable.booleanValue();
       }
       return b;
    }
    public String name(){
       return this.name;
    }
    public String uri(){
       return this.uri;
    }
}

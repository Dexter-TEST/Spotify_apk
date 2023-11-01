package com.spotify.webapi.service.models.EpisodeSimple;
import com.spotify.webapi.service.models.Entity;
import java.lang.String;
import java.util.List;
import java.lang.Boolean;

public class EpisodeSimple extends Entity	// class@000c84 from classes.dex
{
    public String audioPreviewUrl;
    public String description;
    public int durationMs;
    public Boolean explicit;
    public String href;
    public String id;
    public List images;
    public Boolean is_playable;
    public String name;
    public String releaseDate;
    public ResumePoint resumePoint;
    public String uri;

    public void EpisodeSimple(){
       super();
    }
    public static void getAudioPreviewUrl$annotations(){
    }
    public static void getDescription$annotations(){
    }
    public static void getDurationMs$annotations(){
    }
    public static void getExplicit$annotations(){
    }
    public static void getHref$annotations(){
    }
    public static void getId$annotations(){
    }
    public static void getImages$annotations(){
    }
    public static void getName$annotations(){
    }
    public static void getReleaseDate$annotations(){
    }
    public static void getResumePoint$annotations(){
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
       return this.images;
    }
    public boolean isExplicit(){
       EpisodeSimple texplicit;
       boolean b = ((texplicit = this.explicit) != null)? texplicit.booleanValue(): false;
       return b;
    }
    public boolean isPlayable(){
       EpisodeSimple tis_playable;
       boolean b = ((tis_playable = this.is_playable) != null)? tis_playable.booleanValue(): false;
       return b;
    }
    public String name(){
       return this.name;
    }
    public String uri(){
       return this.uri;
    }
}

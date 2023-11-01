package com.spotify.webapi.service.models.ShowSimple;
import com.spotify.webapi.service.models.Entity;
import com.spotify.webapi.service.models.Pager;
import java.util.List;
import java.lang.String;
import java.lang.Boolean;

public final class ShowSimple extends Entity	// class@000cbb from classes.dex
{
    public String description;
    public Pager episodes;
    public Boolean explicit;
    public String href;
    public String id;
    public List images;
    public ShowSimple$MediaType mediaType;
    public String name;
    public String publisher;
    public String uri;

    public void ShowSimple(){
       super();
    }
    public static void getDescription$annotations(){
    }
    public static void getEpisodes$annotations(){
    }
    public static void getExplicit$annotations(){
    }
    public static void getHref$annotations(){
    }
    public static void getId$annotations(){
    }
    public static void getImages$annotations(){
    }
    public static void getMediaType$annotations(){
    }
    public static void getName$annotations(){
    }
    public static void getPublisher$annotations(){
    }
    public static void getUri$annotations(){
    }
    public Pager getChildren(){
       return this.episodes;
    }
    public boolean hasChildren(){
       Pager items;
       ShowSimple tepisodes = this.episodes;
       boolean b = false;
       if (tepisodes != null && ((items = tepisodes.items) != null && !items.isEmpty())) {
          b = true;
       }
       return b;
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
       ShowSimple texplicit;
       boolean b = ((texplicit = this.explicit) != null)? texplicit.booleanValue(): false;
       return b;
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

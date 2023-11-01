package com.spotify.webapi.service.models.views.View;
import com.spotify.webapi.service.models.Entity;
import com.spotify.webapi.service.models.Pager;
import java.util.List;
import java.lang.String;

public final class View extends Entity	// class@000cd7 from classes.dex
{
    public Pager content;
    public Map custom_fields;
    public Map external_urls;
    public String href;
    public String id;
    public List images;
    public String name;
    public String rendering;
    public String tag_line;

    public void View(){
       super();
    }
    public static void getContent$annotations(){
    }
    public static void getCustom_fields$annotations(){
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
    public static void getRendering$annotations(){
    }
    public static void getTag_line$annotations(){
    }
    public Pager getChildren(){
       return this.content;
    }
    public boolean hasChildren(){
       Pager items;
       View tcontent = this.content;
       boolean b = false;
       if (tcontent != null && ((items = tcontent.items) != null && !items.isEmpty())) {
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
    public boolean isPlayable(){
       return true;
    }
    public String name(){
       return this.name;
    }
    public String uri(){
       return null;
    }
}

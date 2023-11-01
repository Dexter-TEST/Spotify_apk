package com.spotify.webapi.service.models.Pager;
import com.spotify.webapi.service.models.Pager$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.Object;
import java.util.List;

public final class Pager	// class@000c97 from classes.dex
{
    public String href;
    public List items;
    public int limit;
    public String next;
    public int offset;
    public String previous;
    public int total;
    public static final Pager$Companion Companion;

    static {
       Pager.Companion = new Pager$Companion(null);
    }
    public void Pager(){
       super();
    }
    public static final Pager fromItems(List p0){
       return Pager.Companion.fromItems(p0);
    }
    public static void getHref$annotations(){
    }
    public static void getItems$annotations(){
    }
    public static void getLimit$annotations(){
    }
    public static void getNext$annotations(){
    }
    public static void getOffset$annotations(){
    }
    public static void getPrevious$annotations(){
    }
    public static void getTotal$annotations(){
    }
}

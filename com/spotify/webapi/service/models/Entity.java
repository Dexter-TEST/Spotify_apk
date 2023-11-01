package com.spotify.webapi.service.models.Entity;
import com.spotify.webapi.service.models.Entity$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.Object;
import com.squareup.moshi.adapters.PolymorphicJsonAdapterFactory;
import com.spotify.webapi.service.models.Pager;
import java.lang.String;
import java.util.List;
import java.lang.CharSequence;

public abstract class Entity	// class@000c81 from classes.dex
{
    public String type;
    public static final Entity$Companion Companion;

    static {
       Entity.Companion = new Entity$Companion(null);
    }
    public void Entity(){
       super();
    }
    public static final PolymorphicJsonAdapterFactory getPolymorphicAdapter(){
       return Entity.Companion.getPolymorphicAdapter();
    }
    public static void getType$annotations(){
    }
    public static final boolean isPresentValidAndPlayable(Entity p0){
       return Entity.Companion.isPresentValidAndPlayable(p0);
    }
    public Pager getChildren(){
       return null;
    }
    public boolean hasChildren(){
       return false;
    }
    public abstract String href();
    public abstract String id();
    public abstract List images();
    public boolean isExplicit(){
       return false;
    }
    public boolean isPlayable(){
       return false;
    }
    public final boolean isValid(){
       String str = this.name();
       boolean b = false;
       str = (str != null && str.length())? 0: 1;
       if (!str) {
          str = ((str = this.uri()) != null && str.length())? 0: 1;
          if (!str) {
             b = true;
          }
       }
       return b;
    }
    public final boolean isValidAndPlayable(){
       boolean b = (this.isPlayable() && this.isValid())? true: false;
       return b;
    }
    public abstract String name();
    public abstract String uri();
}

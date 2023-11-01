package com.spotify.webapi.service.models.Entity$Companion;
import java.lang.Object;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.squareup.moshi.adapters.PolymorphicJsonAdapterFactory;
import com.spotify.webapi.service.models.Entity;
import java.lang.Class;
import java.lang.String;
import com.spotify.webapi.service.models.views.View;
import com.spotify.webapi.service.models.views.Link;
import com.spotify.webapi.service.models.views.Station;
import com.spotify.webapi.service.models.PlaylistSimple;
import com.spotify.webapi.service.models.Artist;
import com.spotify.webapi.service.models.AlbumSimple;
import com.spotify.webapi.service.models.Track;
import com.spotify.webapi.service.models.ShowSimple;
import com.spotify.webapi.service.models.Episode;
import p.co5;

public final class Entity$Companion	// class@000c80 from classes.dex
{

    private void Entity$Companion(){
       super();
    }
    public void Entity$Companion(DefaultConstructorMarker p0){
       super();
    }
    public static void getPolymorphicAdapter$annotations(){
    }
    public final PolymorphicJsonAdapterFactory getPolymorphicAdapter(){
       PolymorphicJsonAdapterFactory polymorphicJ = PolymorphicJsonAdapterFactory.b(Entity.class, "type").c(View.class, "view").c(Link.class, "link").c(Station.class, "station").c(PlaylistSimple.class, "playlist").c(Artist.class, "artist").c(AlbumSimple.class, "album").c(Track.class, "track").c(ShowSimple.class, "show").c(Episode.class, "episode");
       co5.l(polymorphicJ, "of\(Entity::class.java, \"…ava, Search.Type.EPISODE\)");
       return polymorphicJ;
    }
    public final boolean isPresentValidAndPlayable(Entity p0){
       boolean b = (p0 != null && (p0.isPlayable() && p0.isValid()))? true: false;
       return b;
    }
}

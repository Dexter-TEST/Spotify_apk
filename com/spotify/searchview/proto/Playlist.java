package com.spotify.searchview.proto.Playlist;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.q04;
import p.tp2;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class Playlist extends c implements u74	// class@000c0f from classes.dex
{
    private int numberOfTracks_;
    private boolean ownedBySpotify_;
    private boolean personalized_;
    private static final Playlist DEFAULT_INSTANCE;
    public static final int NUMBER_OF_TRACKS_FIELD_NUMBER;
    public static final int OWNED_BY_SPOTIFY_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int PERSONALIZED_FIELD_NUMBER;

    static {
       Playlist playlist = new Playlist();
       Playlist.DEFAULT_INSTANCE = playlist;
       c.registerDefaultInstance(Playlist.class, playlist);
    }
    private void Playlist(){
       super();
    }
    public static Playlist e(){
       return Playlist.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Playlist.DEFAULT_INSTANCE.getParserForType();
    }
    public final Object dynamicMethod(li2 p0,Object p1,Object p2){
       r75 pARSER;
       byte b = 1;
       p2 = null;
       switch (p0.ordinal()){
           case 0:
             return Byte.valueOf(b);
           case 1:
             return p2;
           case 2:
             Object[] objArray = new Object[]{"personalized_","ownedBySpotify_","numberOfTracks_"};
             return c.newMessageInfo(Playlist.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x03\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x07\x02\x07\x03\x04", objArray);
           case 3:
             return new Playlist();
           case 4:
             return new q04(p2);
           case 5:
             return Playlist.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Playlist.PARSER) == null) {
                _monitor_enter(Playlist.class);
                if ((pARSER = Playlist.PARSER) == null) {
                   pARSER = new ii2(Playlist.DEFAULT_INSTANCE);
                   Playlist.PARSER = pARSER;
                }
                _monitor_exit(Playlist.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final s74 getDefaultInstanceForType(){
       return super.getDefaultInstanceForType();
    }
    public final r74 newBuilderForType(){
       return super.newBuilderForType();
    }
    public final r74 toBuilder(){
       return super.toBuilder();
    }
}

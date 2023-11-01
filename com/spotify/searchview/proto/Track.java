package com.spotify.searchview.proto.Track;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.bc3;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.q04;
import p.n04;
import com.spotify.searchview.proto.RelatedEntity;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class Track extends c implements u74	// class@000c16 from classes.dex
{
    private boolean explicit_;
    private boolean lyricsMatch_;
    private boolean mogef19_;
    private OnDemand onDemand_;
    private RelatedEntity trackAlbum_;
    private bc3 trackArtists_;
    private boolean windowed_;
    private static final Track DEFAULT_INSTANCE;
    public static final int EXPLICIT_FIELD_NUMBER;
    public static final int LYRICS_MATCH_FIELD_NUMBER;
    public static final int MOGEF19_FIELD_NUMBER;
    public static final int ON_DEMAND_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int TRACK_ALBUM_FIELD_NUMBER;
    public static final int TRACK_ARTISTS_FIELD_NUMBER;
    public static final int WINDOWED_FIELD_NUMBER;

    static {
       Track track = new Track();
       Track.DEFAULT_INSTANCE = track;
       c.registerDefaultInstance(Track.class, track);
    }
    private void Track(){
       super();
       this.trackArtists_ = c.emptyProtobufList();
    }
    public static Track e(){
       return Track.DEFAULT_INSTANCE;
    }
    public static Track f(){
       return Track.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Track.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"explicit_","windowed_","trackAlbum_","trackArtists_",RelatedEntity.class,"mogef19_","lyricsMatch_","onDemand_"};
             return c.newMessageInfo(Track.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x07\xff\x02\xff\x02\xff\x02\xff\x02\x01\b\x07\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x07\x02\x07\x03\t\x04\x1b\x06\x07\x07\x07\b\t", objArray);
           case 3:
             return new Track();
           case 4:
             return new q04(p2);
           case 5:
             return Track.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Track.PARSER) == null) {
                _monitor_enter(Track.class);
                if ((pARSER = Track.PARSER) == null) {
                   pARSER = new ii2(Track.DEFAULT_INSTANCE);
                   Track.PARSER = pARSER;
                }
                _monitor_exit(Track.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final bc3 g(){
       return this.trackArtists_;
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

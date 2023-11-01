package com.spotify.searchview.proto.Album;
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
import p.fq1;
import p.dq1;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class Album extends c implements u74	// class@000c01 from classes.dex
{
    private bc3 artistNames_;
    private Timestamp releaseTime_;
    private int releaseYear_;
    private int state_;
    private int type_;
    private String userCountryReleaseIsoTime_;
    public static final int ARTIST_NAMES_FIELD_NUMBER = 1;
    private static final Album DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int RELEASE_TIME_FIELD_NUMBER;
    public static final int RELEASE_YEAR_FIELD_NUMBER;
    public static final int STATE_FIELD_NUMBER;
    public static final int TYPE_FIELD_NUMBER;
    public static final int USER_COUNTRY_RELEASE_ISO_TIME_FIELD_NUMBER;

    static {
       Album uAlbum = new Album();
       Album.DEFAULT_INSTANCE = uAlbum;
       c.registerDefaultInstance(Album.class, uAlbum);
    }
    private void Album(){
       super();
       this.artistNames_ = c.emptyProtobufList();
       this.userCountryReleaseIsoTime_ = "";
    }
    public static Album e(){
       return Album.DEFAULT_INSTANCE;
    }
    public static Album g(){
       return Album.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Album.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"artistNames_","type_","releaseYear_","state_","releaseTime_","userCountryReleaseIsoTime_"};
             return c.newMessageInfo(Album.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x06\xff\x02\xff\x02\xff\x02\xff\x02\x01\x06\x06\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x02\x02\x02\f\x03\x04\x04\f\x05\t\x06\x02\x02", objArray);
           case 3:
             return new Album();
           case 4:
             return new fq1(p2);
           case 5:
             return Album.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Album.PARSER) == null) {
                _monitor_enter(Album.class);
                if ((pARSER = Album.PARSER) == null) {
                   pARSER = new ii2(Album.DEFAULT_INSTANCE);
                   Album.PARSER = pARSER;
                }
                _monitor_exit(Album.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final bc3 f(){
       return this.artistNames_;
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

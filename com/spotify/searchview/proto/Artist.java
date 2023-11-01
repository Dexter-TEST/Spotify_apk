package com.spotify.searchview.proto.Artist;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.fq1;
import p.xp1;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class Artist extends c implements u74	// class@000c02 from classes.dex
{
    private boolean verified_;
    private static final Artist DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int VERIFIED_FIELD_NUMBER;

    static {
       Artist uArtist = new Artist();
       Artist.DEFAULT_INSTANCE = uArtist;
       c.registerDefaultInstance(Artist.class, uArtist);
    }
    private void Artist(){
       super();
    }
    public static Artist e(){
       return Artist.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Artist.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[b];
             objArray[0] = "verified_";
             return c.newMessageInfo(Artist.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x07", objArray);
           case 3:
             return new Artist();
           case 4:
             return new fq1(p2);
           case 5:
             return Artist.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Artist.PARSER) == null) {
                _monitor_enter(Artist.class);
                if ((pARSER = Artist.PARSER) == null) {
                   pARSER = new ii2(Artist.DEFAULT_INSTANCE);
                   Artist.PARSER = pARSER;
                }
                _monitor_exit(Artist.class);
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

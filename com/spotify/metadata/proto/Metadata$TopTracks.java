package com.spotify.metadata.proto.Metadata$TopTracks;
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
import p.sq1;
import com.spotify.metadata.proto.Metadata$Track;
import p.s74;
import java.lang.String;
import java.lang.Byte;

public final class Metadata$TopTracks extends c implements u74	// class@000a75 from classes.dex
{
    private int bitField0_;
    private String country_;
    private bc3 track_;
    public static final int COUNTRY_FIELD_NUMBER = 1;
    private static final Metadata$TopTracks DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int TRACK_FIELD_NUMBER;

    static {
       Metadata$TopTracks topTracks = new Metadata$TopTracks();
       Metadata$TopTracks.DEFAULT_INSTANCE = topTracks;
       c.registerDefaultInstance(Metadata$TopTracks.class, topTracks);
    }
    private void Metadata$TopTracks(){
       super();
       this.country_ = "";
       this.track_ = c.emptyProtobufList();
    }
    public static Metadata$TopTracks e(){
       return Metadata$TopTracks.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Metadata$TopTracks.DEFAULT_INSTANCE.getParserForType();
    }
    public final Object dynamicMethod(li2 p0,Object p1,Object p2){
       r75 pARSER;
       byte b = 1;
       switch (p0.ordinal()){
           case 0:
             return Byte.valueOf(b);
           case 1:
             return null;
           case 2:
             Object[] objArray = new Object[]{"bitField0_","country_","track_",Metadata$Track.class};
             return c.newMessageInfo(Metadata$TopTracks.DEFAULT_INSTANCE, "\x01\x02\xff\x02\xff\x02\x01\x01\x02\x02\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x10\x02\xff\x02\xff\x02\x02\x1b", objArray);
           case 3:
             return new Metadata$TopTracks();
           case 4:
             return new sq1(13);
           case 5:
             return Metadata$TopTracks.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Metadata$TopTracks.PARSER) == null) {
                _monitor_enter(Metadata$TopTracks.class);
                if ((pARSER = Metadata$TopTracks.PARSER) == null) {
                   pARSER = new ii2(Metadata$TopTracks.DEFAULT_INSTANCE);
                   Metadata$TopTracks.PARSER = pARSER;
                }
                _monitor_exit(Metadata$TopTracks.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
}

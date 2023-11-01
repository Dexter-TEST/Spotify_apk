package com.spotify.metadata.proto.Metadata$ArtistWithRole;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.i80;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.h40;
import p.f40;
import p.f84;
import p.s74;
import java.lang.String;
import java.lang.Byte;

public final class Metadata$ArtistWithRole extends c implements u74	// class@000a64 from classes.dex
{
    private i80 artistGid_;
    private String artistName_;
    private int bitField0_;
    private int role_;
    public static final int ARTIST_GID_FIELD_NUMBER = 1;
    public static final int ARTIST_NAME_FIELD_NUMBER = 2;
    private static final Metadata$ArtistWithRole DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int ROLE_FIELD_NUMBER;

    static {
       Metadata$ArtistWithRole uArtistWithR = new Metadata$ArtistWithRole();
       Metadata$ArtistWithRole.DEFAULT_INSTANCE = uArtistWithR;
       c.registerDefaultInstance(Metadata$ArtistWithRole.class, uArtistWithR);
    }
    private void Metadata$ArtistWithRole(){
       super();
       this.artistGid_ = i80.b;
       this.artistName_ = "";
    }
    public static Metadata$ArtistWithRole e(){
       return Metadata$ArtistWithRole.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Metadata$ArtistWithRole.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"bitField0_","artistGid_","artistName_","role_",f84.a};
             return c.newMessageInfo(Metadata$ArtistWithRole.DEFAULT_INSTANCE, "\x01\x03\xff\x02\xff\x02\x01\x01\x03\x03\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x10\x02\xff\x02\xff\x02\x02\x10\x02\x01\x03\x10\x02\x02", objArray);
           case 3:
             return new Metadata$ArtistWithRole();
           case 4:
             return new h40(p2);
           case 5:
             return Metadata$ArtistWithRole.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Metadata$ArtistWithRole.PARSER) == null) {
                _monitor_enter(Metadata$ArtistWithRole.class);
                if ((pARSER = Metadata$ArtistWithRole.PARSER) == null) {
                   pARSER = new ii2(Metadata$ArtistWithRole.DEFAULT_INSTANCE);
                   Metadata$ArtistWithRole.PARSER = pARSER;
                }
                _monitor_exit(Metadata$ArtistWithRole.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
}

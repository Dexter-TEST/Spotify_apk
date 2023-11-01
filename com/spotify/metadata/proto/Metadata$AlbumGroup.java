package com.spotify.metadata.proto.Metadata$AlbumGroup;
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
import p.h40;
import p.t30;
import com.spotify.metadata.proto.Metadata$Album;
import p.s74;
import java.lang.String;
import java.lang.Byte;

public final class Metadata$AlbumGroup extends c implements u74	// class@000a62 from classes.dex
{
    private bc3 album_;
    public static final int ALBUM_FIELD_NUMBER = 1;
    private static final Metadata$AlbumGroup DEFAULT_INSTANCE;
    private static r75 PARSER;

    static {
       Metadata$AlbumGroup uAlbumGroup = new Metadata$AlbumGroup();
       Metadata$AlbumGroup.DEFAULT_INSTANCE = uAlbumGroup;
       c.registerDefaultInstance(Metadata$AlbumGroup.class, uAlbumGroup);
    }
    private void Metadata$AlbumGroup(){
       super();
       this.album_ = c.emptyProtobufList();
    }
    public static Metadata$AlbumGroup e(){
       return Metadata$AlbumGroup.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Metadata$AlbumGroup.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"album_",Metadata$Album.class};
             return c.newMessageInfo(Metadata$AlbumGroup.DEFAULT_INSTANCE, "\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x1b", objArray);
           case 3:
             return new Metadata$AlbumGroup();
           case 4:
             return new h40(p2);
           case 5:
             return Metadata$AlbumGroup.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Metadata$AlbumGroup.PARSER) == null) {
                _monitor_enter(Metadata$AlbumGroup.class);
                if ((pARSER = Metadata$AlbumGroup.PARSER) == null) {
                   pARSER = new ii2(Metadata$AlbumGroup.DEFAULT_INSTANCE);
                   Metadata$AlbumGroup.PARSER = pARSER;
                }
                _monitor_exit(Metadata$AlbumGroup.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
}

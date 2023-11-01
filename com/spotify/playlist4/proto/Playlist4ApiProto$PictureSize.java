package com.spotify.playlist4.proto.Playlist4ApiProto$PictureSize;
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
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class Playlist4ApiProto$PictureSize extends c implements u74	// class@000b9c from classes.dex
{
    private int bitField0_;
    private String targetName_;
    private String url_;
    private static final Playlist4ApiProto$PictureSize DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int TARGET_NAME_FIELD_NUMBER;
    public static final int URL_FIELD_NUMBER;

    static {
       Playlist4ApiProto$PictureSize pictureSize = new Playlist4ApiProto$PictureSize();
       Playlist4ApiProto$PictureSize.DEFAULT_INSTANCE = pictureSize;
       c.registerDefaultInstance(Playlist4ApiProto$PictureSize.class, pictureSize);
    }
    private void Playlist4ApiProto$PictureSize(){
       super();
       this.targetName_ = "";
       this.url_ = "";
    }
    public static Playlist4ApiProto$PictureSize e(){
       return Playlist4ApiProto$PictureSize.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Playlist4ApiProto$PictureSize.DEFAULT_INSTANCE.getParserForType();
    }
    public final Object dynamicMethod(li2 p0,Object p1,Object p2){
       r75 pARSER;
       int i = 0;
       byte b = 1;
       switch (p0.ordinal()){
           case 0:
             return Byte.valueOf(b);
           case 1:
             return null;
           case 2:
             Object[] objArray = new Object[]{"bitField0_","targetName_","url_"};
             return c.newMessageInfo(Playlist4ApiProto$PictureSize.DEFAULT_INSTANCE, "\x01\x02\xff\x02\xff\x02\x01\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x10\x02\xff\x02\xff\x02\x02\x10\x02\x01", objArray);
           case 3:
             return new Playlist4ApiProto$PictureSize();
           case 4:
             return new fq1(11, i);
           case 5:
             return Playlist4ApiProto$PictureSize.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Playlist4ApiProto$PictureSize.PARSER) == null) {
                _monitor_enter(Playlist4ApiProto$PictureSize.class);
                if ((pARSER = Playlist4ApiProto$PictureSize.PARSER) == null) {
                   pARSER = new ii2(Playlist4ApiProto$PictureSize.DEFAULT_INSTANCE);
                   Playlist4ApiProto$PictureSize.PARSER = pARSER;
                }
                _monitor_exit(Playlist4ApiProto$PictureSize.class);
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

package com.spotify.playlist4.proto.Playlist4ApiProto$ListAttributes;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.i80;
import p.bc3;
import java.lang.String;
import java.lang.Object;
import p.mg5;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import com.spotify.playlist4.proto.Playlist4ApiProto$FormatListAttribute;
import com.spotify.playlist4.proto.Playlist4ApiProto$PictureSize;
import p.s74;
import java.lang.Byte;
import p.r74;

public final class Playlist4ApiProto$ListAttributes extends c implements u74	// class@000b96 from classes.dex
{
    private int bitField0_;
    private String clientId_;
    private boolean collaborative_;
    private boolean deletedByOwner_;
    private String description_;
    private bc3 formatAttributes_;
    private String format_;
    private String name_;
    private bc3 pictureSize_;
    private i80 picture_;
    private String pl3Version_;
    public static final int CLIENT_ID_FIELD_NUMBER = 10;
    public static final int COLLABORATIVE_FIELD_NUMBER = 4;
    private static final Playlist4ApiProto$ListAttributes DEFAULT_INSTANCE;
    public static final int DELETED_BY_OWNER_FIELD_NUMBER;
    public static final int DESCRIPTION_FIELD_NUMBER;
    public static final int FORMAT_ATTRIBUTES_FIELD_NUMBER;
    public static final int FORMAT_FIELD_NUMBER;
    public static final int NAME_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int PICTURE_FIELD_NUMBER;
    public static final int PICTURE_SIZE_FIELD_NUMBER;
    public static final int PL3_VERSION_FIELD_NUMBER;

    static {
       Playlist4ApiProto$ListAttributes listAttribut = new Playlist4ApiProto$ListAttributes();
       Playlist4ApiProto$ListAttributes.DEFAULT_INSTANCE = listAttribut;
       c.registerDefaultInstance(Playlist4ApiProto$ListAttributes.class, listAttribut);
    }
    private void Playlist4ApiProto$ListAttributes(){
       super();
       this.name_ = "";
       this.description_ = "";
       this.picture_ = i80.b;
       this.pl3Version_ = "";
       this.clientId_ = "";
       this.format_ = "";
       this.formatAttributes_ = c.emptyProtobufList();
       this.pictureSize_ = c.emptyProtobufList();
    }
    public static Playlist4ApiProto$ListAttributes e(){
       return Playlist4ApiProto$ListAttributes.DEFAULT_INSTANCE;
    }
    public static void f(Playlist4ApiProto$ListAttributes p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x01;
       p0.name_ = p1;
    }
    public static mg5 g(){
       return Playlist4ApiProto$ListAttributes.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return Playlist4ApiProto$ListAttributes.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[13];
             objArray[0] = "bitField0_";
             objArray[b] = "name_";
             objArray[2] = "description_";
             objArray[3] = "picture_";
             objArray[4] = "collaborative_";
             objArray[5] = "pl3Version_";
             objArray[6] = "deletedByOwner_";
             objArray[7] = "clientId_";
             objArray[8] = "format_";
             objArray[9] = "formatAttributes_";
             objArray[10] = Playlist4ApiProto$FormatListAttribute.class;
             objArray[11] = "pictureSize_";
             objArray[12] = Playlist4ApiProto$PictureSize.class;
             return c.newMessageInfo(Playlist4ApiProto$ListAttributes.DEFAULT_INSTANCE, "\x01\n\xff\x02\xff\x02\x01\x01\r\n\xff\x02\xff\x02\x02\xff\x02\xff\x02\x01\x10\x02\xff\x02\xff\x02\x02\x10\x02\x01\x03\x10\x02\x02\x04\x10\x02\x03\x05\x10\x02\x04\x06\x10\x02\x05\n\x10\x02\x06\x0b\x10\x02\x07\f\x1b\r\x1b", objArray);
           case 3:
             return new Playlist4ApiProto$ListAttributes();
           case 4:
             return new mg5();
           case 5:
             return Playlist4ApiProto$ListAttributes.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Playlist4ApiProto$ListAttributes.PARSER) == null) {
                _monitor_enter(Playlist4ApiProto$ListAttributes.class);
                if ((pARSER = Playlist4ApiProto$ListAttributes.PARSER) == null) {
                   pARSER = new ii2(Playlist4ApiProto$ListAttributes.DEFAULT_INSTANCE);
                   Playlist4ApiProto$ListAttributes.PARSER = pARSER;
                }
                _monitor_exit(Playlist4ApiProto$ListAttributes.class);
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

package com.spotify.playlist4.proto.Playlist4ApiProto$ItemAttributes;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.bc3;
import p.i80;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.fq1;
import com.spotify.playlist4.proto.Playlist4ApiProto$FormatListAttribute;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class Playlist4ApiProto$ItemAttributes extends c implements u74	// class@000b94 from classes.dex
{
    private String addedBy_;
    private int bitField0_;
    private bc3 formatAttributes_;
    private i80 itemId_;
    private boolean public_;
    private long seenAt_;
    private long timestamp_;
    public static final int ADDED_BY_FIELD_NUMBER = 1;
    private static final Playlist4ApiProto$ItemAttributes DEFAULT_INSTANCE;
    public static final int FORMAT_ATTRIBUTES_FIELD_NUMBER;
    public static final int ITEM_ID_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int PUBLIC_FIELD_NUMBER;
    public static final int SEEN_AT_FIELD_NUMBER;
    public static final int TIMESTAMP_FIELD_NUMBER;

    static {
       Playlist4ApiProto$ItemAttributes itemAttribut = new Playlist4ApiProto$ItemAttributes();
       Playlist4ApiProto$ItemAttributes.DEFAULT_INSTANCE = itemAttribut;
       c.registerDefaultInstance(Playlist4ApiProto$ItemAttributes.class, itemAttribut);
    }
    private void Playlist4ApiProto$ItemAttributes(){
       super();
       this.addedBy_ = "";
       this.formatAttributes_ = c.emptyProtobufList();
       this.itemId_ = i80.b;
    }
    public static Playlist4ApiProto$ItemAttributes e(){
       return Playlist4ApiProto$ItemAttributes.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Playlist4ApiProto$ItemAttributes.DEFAULT_INSTANCE.getParserForType();
    }
    public final Object dynamicMethod(li2 p0,Object p1,Object p2){
       r75 pARSER;
       int i = 0;
       byte b = 1;
       int i1 = 8;
       switch (p0.ordinal()){
           case 0:
             return Byte.valueOf(b);
           case 1:
             return null;
           case 2:
             Object[] objArray = new Object[i1];
             objArray[i] = "bitField0_";
             objArray[b] = "addedBy_";
             objArray[2] = "timestamp_";
             objArray[3] = "seenAt_";
             objArray[4] = "public_";
             objArray[5] = "formatAttributes_";
             objArray[6] = Playlist4ApiProto$FormatListAttribute.class;
             objArray[7] = "itemId_";
             return c.newMessageInfo(Playlist4ApiProto$ItemAttributes.DEFAULT_INSTANCE, "\x01\x06\xff\x02\xff\x02\x01\x01\f\x06\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x10\x02\xff\x02\xff\x02\x02\x10\x02\x01\t\x10\x02\x02\n\x10\x02\x03\x0b\x1b\f\x10\x02\x04", objArray);
           case 3:
             return new Playlist4ApiProto$ItemAttributes();
           case 4:
             return new fq1(i1, i);
           case 5:
             return Playlist4ApiProto$ItemAttributes.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Playlist4ApiProto$ItemAttributes.PARSER) == null) {
                _monitor_enter(Playlist4ApiProto$ItemAttributes.class);
                if ((pARSER = Playlist4ApiProto$ItemAttributes.PARSER) == null) {
                   pARSER = new ii2(Playlist4ApiProto$ItemAttributes.DEFAULT_INSTANCE);
                   Playlist4ApiProto$ItemAttributes.PARSER = pARSER;
                }
                _monitor_exit(Playlist4ApiProto$ItemAttributes.class);
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

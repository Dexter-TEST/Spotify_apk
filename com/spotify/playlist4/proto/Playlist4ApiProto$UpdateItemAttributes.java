package com.spotify.playlist4.proto.Playlist4ApiProto$UpdateItemAttributes;
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

public final class Playlist4ApiProto$UpdateItemAttributes extends c implements u74	// class@000b9f from classes.dex
{
    private int bitField0_;
    private int index_;
    private byte memoizedIsInitialized;
    private Playlist4ApiProto$ItemAttributesPartialState newAttributes_;
    private Playlist4ApiProto$ItemAttributesPartialState oldAttributes_;
    private static final Playlist4ApiProto$UpdateItemAttributes DEFAULT_INSTANCE;
    public static final int INDEX_FIELD_NUMBER;
    public static final int NEW_ATTRIBUTES_FIELD_NUMBER;
    public static final int OLD_ATTRIBUTES_FIELD_NUMBER;
    private static r75 PARSER;

    static {
       Playlist4ApiProto$UpdateItemAttributes updateItemAt = new Playlist4ApiProto$UpdateItemAttributes();
       Playlist4ApiProto$UpdateItemAttributes.DEFAULT_INSTANCE = updateItemAt;
       c.registerDefaultInstance(Playlist4ApiProto$UpdateItemAttributes.class, updateItemAt);
    }
    private void Playlist4ApiProto$UpdateItemAttributes(){
       super();
       this.memoizedIsInitialized = 2;
    }
    public static Playlist4ApiProto$UpdateItemAttributes e(){
       return Playlist4ApiProto$UpdateItemAttributes.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Playlist4ApiProto$UpdateItemAttributes.DEFAULT_INSTANCE.getParserForType();
    }
    public final Object dynamicMethod(li2 p0,Object p1,Object p2){
       r75 pARSER;
       int i = 1;
       switch (p0.ordinal()){
           case 0:
             return Byte.valueOf(this.memoizedIsInitialized);
           case 1:
             if (p1 == null) {
                i = 0;
             }
             this.memoizedIsInitialized = (byte)i;
             return null;
             break;
           case 2:
             Object[] objArray = new Object[]{"bitField0_","index_","newAttributes_","oldAttributes_"};
             return c.newMessageInfo(Playlist4ApiProto$UpdateItemAttributes.DEFAULT_INSTANCE, "\x01\x03\xff\x02\xff\x02\x01\x01\x03\x03\xff\x02\xff\x02\xff\x02\xff\x02\x03\x01\x15\x02\xff\x02\xff\x02\x02\x15\x02\x01\x03\x14\x02\x02", objArray);
           case 3:
             return new Playlist4ApiProto$UpdateItemAttributes();
           case 4:
             return new fq1(12, 0);
           case 5:
             return Playlist4ApiProto$UpdateItemAttributes.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Playlist4ApiProto$UpdateItemAttributes.PARSER) == null) {
                _monitor_enter(Playlist4ApiProto$UpdateItemAttributes.class);
                if ((pARSER = Playlist4ApiProto$UpdateItemAttributes.PARSER) == null) {
                   pARSER = new ii2(Playlist4ApiProto$UpdateItemAttributes.DEFAULT_INSTANCE);
                   Playlist4ApiProto$UpdateItemAttributes.PARSER = pARSER;
                }
                _monitor_exit(Playlist4ApiProto$UpdateItemAttributes.class);
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

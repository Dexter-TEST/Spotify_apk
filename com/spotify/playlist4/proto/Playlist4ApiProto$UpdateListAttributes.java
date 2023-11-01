package com.spotify.playlist4.proto.Playlist4ApiProto$UpdateListAttributes;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import com.spotify.playlist4.proto.Playlist4ApiProto$ListAttributesPartialState;
import java.lang.Object;
import p.xg5;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;

public final class Playlist4ApiProto$UpdateListAttributes extends c implements u74	// class@000ba0 from classes.dex
{
    private int bitField0_;
    private byte memoizedIsInitialized;
    private Playlist4ApiProto$ListAttributesPartialState newAttributes_;
    private Playlist4ApiProto$ListAttributesPartialState oldAttributes_;
    private static final Playlist4ApiProto$UpdateListAttributes DEFAULT_INSTANCE;
    public static final int NEW_ATTRIBUTES_FIELD_NUMBER;
    public static final int OLD_ATTRIBUTES_FIELD_NUMBER;
    private static r75 PARSER;

    static {
       Playlist4ApiProto$UpdateListAttributes updateListAt = new Playlist4ApiProto$UpdateListAttributes();
       Playlist4ApiProto$UpdateListAttributes.DEFAULT_INSTANCE = updateListAt;
       c.registerDefaultInstance(Playlist4ApiProto$UpdateListAttributes.class, updateListAt);
    }
    private void Playlist4ApiProto$UpdateListAttributes(){
       super();
       this.memoizedIsInitialized = 2;
    }
    public static Playlist4ApiProto$UpdateListAttributes e(){
       return Playlist4ApiProto$UpdateListAttributes.DEFAULT_INSTANCE;
    }
    public static void f(Playlist4ApiProto$UpdateListAttributes p0,Playlist4ApiProto$ListAttributesPartialState p1){
       p0.getClass();
       p1.getClass();
       p0.newAttributes_ = p1;
       p0.bitField0_ = p0.bitField0_ | 0x01;
    }
    public static xg5 g(){
       return Playlist4ApiProto$UpdateListAttributes.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return Playlist4ApiProto$UpdateListAttributes.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"bitField0_","newAttributes_","oldAttributes_"};
             return c.newMessageInfo(Playlist4ApiProto$UpdateListAttributes.DEFAULT_INSTANCE, "\x01\x02\xff\x02\xff\x02\x01\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x02\x01\x15\x02\xff\x02\xff\x02\x02\x14\x02\x01", objArray);
           case 3:
             return new Playlist4ApiProto$UpdateListAttributes();
           case 4:
             return new xg5();
           case 5:
             return Playlist4ApiProto$UpdateListAttributes.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Playlist4ApiProto$UpdateListAttributes.PARSER) == null) {
                _monitor_enter(Playlist4ApiProto$UpdateListAttributes.class);
                if ((pARSER = Playlist4ApiProto$UpdateListAttributes.PARSER) == null) {
                   pARSER = new ii2(Playlist4ApiProto$UpdateListAttributes.DEFAULT_INSTANCE);
                   Playlist4ApiProto$UpdateListAttributes.PARSER = pARSER;
                }
                _monitor_exit(Playlist4ApiProto$UpdateListAttributes.class);
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

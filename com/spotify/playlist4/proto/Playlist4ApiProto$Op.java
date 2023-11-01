package com.spotify.playlist4.proto.Playlist4ApiProto$Op;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.rg5;
import java.lang.Object;
import com.spotify.playlist4.proto.Playlist4ApiProto$Add;
import com.spotify.playlist4.proto.Playlist4ApiProto$Rem;
import com.spotify.playlist4.proto.Playlist4ApiProto$UpdateListAttributes;
import p.pg5;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.qg5;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;

public final class Playlist4ApiProto$Op extends c implements u74	// class@000b9a from classes.dex
{
    private Playlist4ApiProto$Add add_;
    private int bitField0_;
    private int kind_;
    private byte memoizedIsInitialized;
    private Playlist4ApiProto$Mov mov_;
    private Playlist4ApiProto$Rem rem_;
    private Playlist4ApiProto$UpdateItemAttributes updateItemAttributes_;
    private Playlist4ApiProto$UpdateListAttributes updateListAttributes_;
    public static final int ADD_FIELD_NUMBER = 2;
    private static final Playlist4ApiProto$Op DEFAULT_INSTANCE;
    public static final int KIND_FIELD_NUMBER;
    public static final int MOV_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int REM_FIELD_NUMBER;
    public static final int UPDATE_ITEM_ATTRIBUTES_FIELD_NUMBER;
    public static final int UPDATE_LIST_ATTRIBUTES_FIELD_NUMBER;

    static {
       Playlist4ApiProto$Op op = new Playlist4ApiProto$Op();
       Playlist4ApiProto$Op.DEFAULT_INSTANCE = op;
       c.registerDefaultInstance(Playlist4ApiProto$Op.class, op);
    }
    private void Playlist4ApiProto$Op(){
       super();
       this.memoizedIsInitialized = 2;
    }
    public static Playlist4ApiProto$Op e(){
       return Playlist4ApiProto$Op.DEFAULT_INSTANCE;
    }
    public static void f(Playlist4ApiProto$Op p0,rg5 p1){
       p0.getClass();
       p0.kind_ = p1.a;
       p0.bitField0_ = p0.bitField0_ | 0x01;
    }
    public static void g(Playlist4ApiProto$Op p0,Playlist4ApiProto$Add p1){
       p0.getClass();
       p1.getClass();
       p0.add_ = p1;
       p0.bitField0_ = p0.bitField0_ | 0x02;
    }
    public static void h(Playlist4ApiProto$Op p0,Playlist4ApiProto$Rem p1){
       p0.getClass();
       p1.getClass();
       p0.rem_ = p1;
       p0.bitField0_ = p0.bitField0_ | 0x04;
    }
    public static void i(Playlist4ApiProto$Op p0,Playlist4ApiProto$UpdateListAttributes p1){
       p0.getClass();
       p1.getClass();
       p0.updateListAttributes_ = p1;
       p0.bitField0_ = p0.bitField0_ | 0x20;
    }
    public static pg5 j(){
       return Playlist4ApiProto$Op.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return Playlist4ApiProto$Op.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"bitField0_","kind_",qg5.a,"add_","rem_","mov_","updateItemAttributes_","updateListAttributes_"};
             return c.newMessageInfo(Playlist4ApiProto$Op.DEFAULT_INSTANCE, "\x01\x06\xff\x02\xff\x02\x01\x01\x06\x06\xff\x02\xff\x02\xff\x02\xff\x02\x06\x01\x15\x02\xff\x02\xff\x02\x02\x14\x02\x01\x03\x14\x02\x02\x04\x14\x02\x03\x05\x14\x02\x04\x06\x14\x02\x05", objArray);
           case 3:
             return new Playlist4ApiProto$Op();
           case 4:
             return new pg5();
           case 5:
             return Playlist4ApiProto$Op.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Playlist4ApiProto$Op.PARSER) == null) {
                _monitor_enter(Playlist4ApiProto$Op.class);
                if ((pARSER = Playlist4ApiProto$Op.PARSER) == null) {
                   pARSER = new ii2(Playlist4ApiProto$Op.DEFAULT_INSTANCE);
                   Playlist4ApiProto$Op.PARSER = pARSER;
                }
                _monitor_exit(Playlist4ApiProto$Op.class);
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

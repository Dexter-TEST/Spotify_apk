package com.spotify.playlist4.proto.Playlist4ApiProto$Rem;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.bc3;
import com.spotify.playlist4.proto.Playlist4ApiProto$Item;
import java.lang.Object;
import p.f2;
import java.util.List;
import p.tg5;
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

public final class Playlist4ApiProto$Rem extends c implements u74	// class@000b9d from classes.dex
{
    private int bitField0_;
    private int fromIndex_;
    private boolean itemsAsKey_;
    private bc3 items_;
    private int length_;
    private byte memoizedIsInitialized;
    private static final Playlist4ApiProto$Rem DEFAULT_INSTANCE;
    public static final int FROM_INDEX_FIELD_NUMBER;
    public static final int ITEMS_AS_KEY_FIELD_NUMBER;
    public static final int ITEMS_FIELD_NUMBER;
    public static final int LENGTH_FIELD_NUMBER;
    private static r75 PARSER;

    static {
       Playlist4ApiProto$Rem rem = new Playlist4ApiProto$Rem();
       Playlist4ApiProto$Rem.DEFAULT_INSTANCE = rem;
       c.registerDefaultInstance(Playlist4ApiProto$Rem.class, rem);
    }
    private void Playlist4ApiProto$Rem(){
       super();
       this.memoizedIsInitialized = 2;
       this.items_ = c.emptyProtobufList();
    }
    public static Playlist4ApiProto$Rem e(){
       return Playlist4ApiProto$Rem.DEFAULT_INSTANCE;
    }
    public static void f(Playlist4ApiProto$Rem p0,int p1){
       p0.bitField0_ = p0.bitField0_ | 0x01;
       p0.fromIndex_ = p1;
    }
    public static void g(Playlist4ApiProto$Rem p0,Playlist4ApiProto$Item p1){
       p0.getClass();
       p1.getClass();
       Playlist4ApiProto$Rem items_ = p0.items_;
       if (items_.a == null) {
          p0.items_ = c.mutableCopy(items_);
       }
       p0.items_.add(p1);
       return;
    }
    public static void h(Playlist4ApiProto$Rem p0){
       p0.bitField0_ = p0.bitField0_ | 0x04;
       p0.itemsAsKey_ = true;
    }
    public static tg5 i(){
       return Playlist4ApiProto$Rem.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return Playlist4ApiProto$Rem.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"bitField0_","fromIndex_","length_","items_",Playlist4ApiProto$Item.class,"itemsAsKey_"};
             return c.newMessageInfo(Playlist4ApiProto$Rem.DEFAULT_INSTANCE, "\x01\x04\xff\x02\xff\x02\x01\x01\x07\x04\xff\x02\xff\x02\x01\x01\x01\x10\x02\xff\x02\xff\x02\x02\x10\x02\x01\x03\x04\x02\x07\x10\x02\x02", objArray);
           case 3:
             return new Playlist4ApiProto$Rem();
           case 4:
             return new tg5();
           case 5:
             return Playlist4ApiProto$Rem.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Playlist4ApiProto$Rem.PARSER) == null) {
                _monitor_enter(Playlist4ApiProto$Rem.class);
                if ((pARSER = Playlist4ApiProto$Rem.PARSER) == null) {
                   pARSER = new ii2(Playlist4ApiProto$Rem.DEFAULT_INSTANCE);
                   Playlist4ApiProto$Rem.PARSER = pARSER;
                }
                _monitor_exit(Playlist4ApiProto$Rem.class);
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

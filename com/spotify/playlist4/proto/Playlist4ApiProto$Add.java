package com.spotify.playlist4.proto.Playlist4ApiProto$Add;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.bc3;
import com.spotify.playlist4.proto.Playlist4ApiProto$Item;
import java.lang.Object;
import p.f2;
import java.util.List;
import java.lang.Iterable;
import com.google.protobuf.a;
import p.eg5;
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

public final class Playlist4ApiProto$Add extends c implements u74	// class@000b8e from classes.dex
{
    private boolean addFirst_;
    private boolean addLast_;
    private int bitField0_;
    private int fromIndex_;
    private bc3 items_;
    private byte memoizedIsInitialized;
    public static final int ADD_FIRST_FIELD_NUMBER = 5;
    public static final int ADD_LAST_FIELD_NUMBER = 4;
    private static final Playlist4ApiProto$Add DEFAULT_INSTANCE;
    public static final int FROM_INDEX_FIELD_NUMBER;
    public static final int ITEMS_FIELD_NUMBER;
    private static r75 PARSER;

    static {
       Playlist4ApiProto$Add uAdd = new Playlist4ApiProto$Add();
       Playlist4ApiProto$Add.DEFAULT_INSTANCE = uAdd;
       c.registerDefaultInstance(Playlist4ApiProto$Add.class, uAdd);
    }
    private void Playlist4ApiProto$Add(){
       super();
       this.memoizedIsInitialized = 2;
       this.items_ = c.emptyProtobufList();
    }
    public static Playlist4ApiProto$Add e(){
       return Playlist4ApiProto$Add.DEFAULT_INSTANCE;
    }
    public static void f(Playlist4ApiProto$Add p0,int p1){
       p0.bitField0_ = p0.bitField0_ | 0x01;
       p0.fromIndex_ = p1;
    }
    public static void g(Playlist4ApiProto$Add p0,Playlist4ApiProto$Item p1){
       p0.getClass();
       p1.getClass();
       Playlist4ApiProto$Add items_ = p0.items_;
       if (items_.a == null) {
          p0.items_ = c.mutableCopy(items_);
       }
       p0.items_.add(p1);
       return;
    }
    public static void h(Playlist4ApiProto$Add p0,List p1){
       Playlist4ApiProto$Add items_ = p0.items_;
       if (items_.a == null) {
          p0.items_ = c.mutableCopy(items_);
       }
       a.addAll(p1, p0.items_);
       return;
    }
    public static void i(Playlist4ApiProto$Add p0){
       p0.bitField0_ = p0.bitField0_ | 0x04;
       p0.addFirst_ = true;
    }
    public static eg5 j(){
       return Playlist4ApiProto$Add.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return Playlist4ApiProto$Add.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"bitField0_","fromIndex_","items_",Playlist4ApiProto$Item.class,"addLast_","addFirst_"};
             return c.newMessageInfo(Playlist4ApiProto$Add.DEFAULT_INSTANCE, "\x01\x04\xff\x02\xff\x02\x01\x01\x05\x04\xff\x02\xff\x02\x01\x01\x01\x10\x02\xff\x02\xff\x02\x02\x04\x02\x04\x10\x02\x01\x05\x10\x02\x02", objArray);
           case 3:
             return new Playlist4ApiProto$Add();
           case 4:
             return new eg5();
           case 5:
             return Playlist4ApiProto$Add.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Playlist4ApiProto$Add.PARSER) == null) {
                _monitor_enter(Playlist4ApiProto$Add.class);
                if ((pARSER = Playlist4ApiProto$Add.PARSER) == null) {
                   pARSER = new ii2(Playlist4ApiProto$Add.DEFAULT_INSTANCE);
                   Playlist4ApiProto$Add.PARSER = pARSER;
                }
                _monitor_exit(Playlist4ApiProto$Add.class);
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

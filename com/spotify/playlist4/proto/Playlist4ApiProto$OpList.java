package com.spotify.playlist4.proto.Playlist4ApiProto$OpList;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.bc3;
import com.spotify.playlist4.proto.Playlist4ApiProto$Op;
import java.lang.Object;
import p.f2;
import java.util.List;
import p.sg5;
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

public final class Playlist4ApiProto$OpList extends c implements u74	// class@000b9b from classes.dex
{
    private byte memoizedIsInitialized;
    private bc3 ops_;
    private static final Playlist4ApiProto$OpList DEFAULT_INSTANCE;
    public static final int OPS_FIELD_NUMBER;
    private static r75 PARSER;

    static {
       Playlist4ApiProto$OpList opList = new Playlist4ApiProto$OpList();
       Playlist4ApiProto$OpList.DEFAULT_INSTANCE = opList;
       c.registerDefaultInstance(Playlist4ApiProto$OpList.class, opList);
    }
    private void Playlist4ApiProto$OpList(){
       super();
       this.memoizedIsInitialized = 2;
       this.ops_ = c.emptyProtobufList();
    }
    public static Playlist4ApiProto$OpList e(){
       return Playlist4ApiProto$OpList.DEFAULT_INSTANCE;
    }
    public static void f(Playlist4ApiProto$OpList p0,Playlist4ApiProto$Op p1){
       p0.getClass();
       p1.getClass();
       Playlist4ApiProto$OpList ops_ = p0.ops_;
       if (ops_.a == null) {
          p0.ops_ = c.mutableCopy(ops_);
       }
       p0.ops_.add(p1);
       return;
    }
    public static sg5 g(){
       return Playlist4ApiProto$OpList.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return Playlist4ApiProto$OpList.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"ops_",Playlist4ApiProto$Op.class};
             return c.newMessageInfo(Playlist4ApiProto$OpList.DEFAULT_INSTANCE, "\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\x01\x01\x01\x04\x02", objArray);
           case 3:
             return new Playlist4ApiProto$OpList();
           case 4:
             return new sg5();
           case 5:
             return Playlist4ApiProto$OpList.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Playlist4ApiProto$OpList.PARSER) == null) {
                _monitor_enter(Playlist4ApiProto$OpList.class);
                if ((pARSER = Playlist4ApiProto$OpList.PARSER) == null) {
                   pARSER = new ii2(Playlist4ApiProto$OpList.DEFAULT_INSTANCE);
                   Playlist4ApiProto$OpList.PARSER = pARSER;
                }
                _monitor_exit(Playlist4ApiProto$OpList.class);
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

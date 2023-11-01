package com.spotify.playlist4.proto.Playlist4ApiProto$Delta;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.i80;
import p.bc3;
import com.spotify.playlist4.proto.Playlist4ApiProto$Op;
import java.lang.Object;
import p.f2;
import java.util.List;
import com.spotify.playlist4.proto.Playlist4ApiProto$ChangeInfo;
import p.gg5;
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

public final class Playlist4ApiProto$Delta extends c implements u74	// class@000b91 from classes.dex
{
    private i80 baseVersion_;
    private int bitField0_;
    private Playlist4ApiProto$ChangeInfo info_;
    private byte memoizedIsInitialized;
    private bc3 ops_;
    public static final int BASE_VERSION_FIELD_NUMBER = 1;
    private static final Playlist4ApiProto$Delta DEFAULT_INSTANCE;
    public static final int INFO_FIELD_NUMBER;
    public static final int OPS_FIELD_NUMBER;
    private static r75 PARSER;

    static {
       Playlist4ApiProto$Delta uDelta = new Playlist4ApiProto$Delta();
       Playlist4ApiProto$Delta.DEFAULT_INSTANCE = uDelta;
       c.registerDefaultInstance(Playlist4ApiProto$Delta.class, uDelta);
    }
    private void Playlist4ApiProto$Delta(){
       super();
       this.memoizedIsInitialized = 2;
       this.baseVersion_ = i80.b;
       this.ops_ = c.emptyProtobufList();
    }
    public static Playlist4ApiProto$Delta e(){
       return Playlist4ApiProto$Delta.DEFAULT_INSTANCE;
    }
    public static void f(Playlist4ApiProto$Delta p0,Playlist4ApiProto$Op p1){
       p0.getClass();
       p1.getClass();
       Playlist4ApiProto$Delta ops_ = p0.ops_;
       if (ops_.a == null) {
          p0.ops_ = c.mutableCopy(ops_);
       }
       p0.ops_.add(p1);
       return;
    }
    public static void g(Playlist4ApiProto$Delta p0,Playlist4ApiProto$ChangeInfo p1){
       p0.getClass();
       p1.getClass();
       p0.info_ = p1;
       p0.bitField0_ = p0.bitField0_ | 0x02;
    }
    public static gg5 h(){
       return Playlist4ApiProto$Delta.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return Playlist4ApiProto$Delta.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"bitField0_","baseVersion_","ops_",Playlist4ApiProto$Op.class,"info_"};
             return c.newMessageInfo(Playlist4ApiProto$Delta.DEFAULT_INSTANCE, "\x01\x03\xff\x02\xff\x02\x01\x01\x04\x03\xff\x02\xff\x02\x01\x01\x01\x10\x02\xff\x02\xff\x02\x02\x04\x02\x04\x10\x02\x01", objArray);
           case 3:
             return new Playlist4ApiProto$Delta();
           case 4:
             return new gg5();
           case 5:
             return Playlist4ApiProto$Delta.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Playlist4ApiProto$Delta.PARSER) == null) {
                _monitor_enter(Playlist4ApiProto$Delta.class);
                if ((pARSER = Playlist4ApiProto$Delta.PARSER) == null) {
                   pARSER = new ii2(Playlist4ApiProto$Delta.DEFAULT_INSTANCE);
                   Playlist4ApiProto$Delta.PARSER = pARSER;
                }
                _monitor_exit(Playlist4ApiProto$Delta.class);
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

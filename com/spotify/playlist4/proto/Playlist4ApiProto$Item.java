package com.spotify.playlist4.proto.Playlist4ApiProto$Item;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import p.hg5;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.Byte;
import p.r74;

public final class Playlist4ApiProto$Item extends c implements u74	// class@000b93 from classes.dex
{
    private Playlist4ApiProto$ItemAttributes attributes_;
    private int bitField0_;
    private byte memoizedIsInitialized;
    private String uri_;
    public static final int ATTRIBUTES_FIELD_NUMBER = 2;
    private static final Playlist4ApiProto$Item DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int URI_FIELD_NUMBER;

    static {
       Playlist4ApiProto$Item item = new Playlist4ApiProto$Item();
       Playlist4ApiProto$Item.DEFAULT_INSTANCE = item;
       c.registerDefaultInstance(Playlist4ApiProto$Item.class, item);
    }
    private void Playlist4ApiProto$Item(){
       super();
       this.memoizedIsInitialized = 2;
       this.uri_ = "";
    }
    public static Playlist4ApiProto$Item e(){
       return Playlist4ApiProto$Item.DEFAULT_INSTANCE;
    }
    public static void f(Playlist4ApiProto$Item p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x01;
       p0.uri_ = p1;
    }
    public static hg5 g(){
       return Playlist4ApiProto$Item.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return Playlist4ApiProto$Item.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"bitField0_","uri_","attributes_"};
             return c.newMessageInfo(Playlist4ApiProto$Item.DEFAULT_INSTANCE, "\x01\x02\xff\x02\xff\x02\x01\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x15\x02\xff\x02\xff\x02\x02\x10\x02\x01", objArray);
           case 3:
             return new Playlist4ApiProto$Item();
           case 4:
             return new hg5();
           case 5:
             return Playlist4ApiProto$Item.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Playlist4ApiProto$Item.PARSER) == null) {
                _monitor_enter(Playlist4ApiProto$Item.class);
                if ((pARSER = Playlist4ApiProto$Item.PARSER) == null) {
                   pARSER = new ii2(Playlist4ApiProto$Item.DEFAULT_INSTANCE);
                   Playlist4ApiProto$Item.PARSER = pARSER;
                }
                _monitor_exit(Playlist4ApiProto$Item.class);
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

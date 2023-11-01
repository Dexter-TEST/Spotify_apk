package com.spotify.playlist4.proto.Playlist4ApiProto$CreateListReply;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.i80;
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

public final class Playlist4ApiProto$CreateListReply extends c implements u74	// class@000b90 from classes.dex
{
    private int bitField0_;
    private byte memoizedIsInitialized;
    private i80 revision_;
    private i80 uri_;
    private static final Playlist4ApiProto$CreateListReply DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int REVISION_FIELD_NUMBER;
    public static final int URI_FIELD_NUMBER;

    static {
       Playlist4ApiProto$CreateListReply uCreateListR = new Playlist4ApiProto$CreateListReply();
       Playlist4ApiProto$CreateListReply.DEFAULT_INSTANCE = uCreateListR;
       c.registerDefaultInstance(Playlist4ApiProto$CreateListReply.class, uCreateListR);
    }
    private void Playlist4ApiProto$CreateListReply(){
       super();
       this.memoizedIsInitialized = 2;
       h80 b = i80.b;
       this.uri_ = b;
       this.revision_ = b;
    }
    public static Playlist4ApiProto$CreateListReply e(){
       return Playlist4ApiProto$CreateListReply.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Playlist4ApiProto$CreateListReply.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"bitField0_","uri_","revision_"};
             return c.newMessageInfo(Playlist4ApiProto$CreateListReply.DEFAULT_INSTANCE, "\x01\x02\xff\x02\xff\x02\x01\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x15\x02\xff\x02\xff\x02\x02\x10\x02\x01", objArray);
           case 3:
             return new Playlist4ApiProto$CreateListReply();
           case 4:
             return new fq1(6, 0);
           case 5:
             return Playlist4ApiProto$CreateListReply.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Playlist4ApiProto$CreateListReply.PARSER) == null) {
                _monitor_enter(Playlist4ApiProto$CreateListReply.class);
                if ((pARSER = Playlist4ApiProto$CreateListReply.PARSER) == null) {
                   pARSER = new ii2(Playlist4ApiProto$CreateListReply.DEFAULT_INSTANCE);
                   Playlist4ApiProto$CreateListReply.PARSER = pARSER;
                }
                _monitor_exit(Playlist4ApiProto$CreateListReply.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final i80 f(){
       return this.uri_;
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

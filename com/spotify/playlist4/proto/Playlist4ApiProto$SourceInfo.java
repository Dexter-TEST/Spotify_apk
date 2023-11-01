package com.spotify.playlist4.proto.Playlist4ApiProto$SourceInfo;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import p.ug5;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.vg5;
import p.s74;
import java.lang.Byte;
import p.r74;

public final class Playlist4ApiProto$SourceInfo extends c implements u74	// class@000b9e from classes.dex
{
    private String app_;
    private int bitField0_;
    private int client_;
    private String source_;
    private String version_;
    public static final int APP_FIELD_NUMBER = 3;
    public static final int CLIENT_FIELD_NUMBER = 1;
    private static final Playlist4ApiProto$SourceInfo DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int SOURCE_FIELD_NUMBER;
    public static final int VERSION_FIELD_NUMBER;

    static {
       Playlist4ApiProto$SourceInfo sourceInfo = new Playlist4ApiProto$SourceInfo();
       Playlist4ApiProto$SourceInfo.DEFAULT_INSTANCE = sourceInfo;
       c.registerDefaultInstance(Playlist4ApiProto$SourceInfo.class, sourceInfo);
    }
    private void Playlist4ApiProto$SourceInfo(){
       super();
       this.app_ = "";
       this.source_ = "";
       this.version_ = "";
    }
    public static Playlist4ApiProto$SourceInfo e(){
       return Playlist4ApiProto$SourceInfo.DEFAULT_INSTANCE;
    }
    public static void f(Playlist4ApiProto$SourceInfo p0){
       p0.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x02;
       p0.app_ = "lite";
    }
    public static void g(Playlist4ApiProto$SourceInfo p0){
       p0.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x04;
       p0.source_ = "android";
    }
    public static void h(Playlist4ApiProto$SourceInfo p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x08;
       p0.version_ = p1;
    }
    public static ug5 i(){
       return Playlist4ApiProto$SourceInfo.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return Playlist4ApiProto$SourceInfo.DEFAULT_INSTANCE.getParserForType();
    }
    public final Object dynamicMethod(li2 p0,Object p1,Object p2){
       r75 pARSER;
       byte b = 1;
       switch (p0.ordinal()){
           case 0:
             return Byte.valueOf(b);
           case 1:
             return null;
           case 2:
             Object[] objArray = new Object[]{"bitField0_","client_",vg5.a,"app_","source_","version_"};
             return c.newMessageInfo(Playlist4ApiProto$SourceInfo.DEFAULT_INSTANCE, "\x01\x04\xff\x02\xff\x02\x01\x01\x05\x04\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x10\x02\xff\x02\xff\x02\x03\x10\x02\x01\x04\x10\x02\x02\x05\x10\x02\x03", objArray);
           case 3:
             return new Playlist4ApiProto$SourceInfo();
           case 4:
             return new ug5();
           case 5:
             return Playlist4ApiProto$SourceInfo.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Playlist4ApiProto$SourceInfo.PARSER) == null) {
                _monitor_enter(Playlist4ApiProto$SourceInfo.class);
                if ((pARSER = Playlist4ApiProto$SourceInfo.PARSER) == null) {
                   pARSER = new ii2(Playlist4ApiProto$SourceInfo.DEFAULT_INSTANCE);
                   Playlist4ApiProto$SourceInfo.PARSER = pARSER;
                }
                _monitor_exit(Playlist4ApiProto$SourceInfo.class);
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

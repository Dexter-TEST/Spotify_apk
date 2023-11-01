package com.spotify.playlist4.proto.Playlist4ApiProto$Mov;
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

public final class Playlist4ApiProto$Mov extends c implements u74	// class@000b99 from classes.dex
{
    private int bitField0_;
    private int fromIndex_;
    private int length_;
    private byte memoizedIsInitialized;
    private int toIndex_;
    private static final Playlist4ApiProto$Mov DEFAULT_INSTANCE;
    public static final int FROM_INDEX_FIELD_NUMBER;
    public static final int LENGTH_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int TO_INDEX_FIELD_NUMBER;

    static {
       Playlist4ApiProto$Mov mov = new Playlist4ApiProto$Mov();
       Playlist4ApiProto$Mov.DEFAULT_INSTANCE = mov;
       c.registerDefaultInstance(Playlist4ApiProto$Mov.class, mov);
    }
    private void Playlist4ApiProto$Mov(){
       super();
       this.memoizedIsInitialized = 2;
    }
    public static Playlist4ApiProto$Mov e(){
       return Playlist4ApiProto$Mov.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Playlist4ApiProto$Mov.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"bitField0_","fromIndex_","length_","toIndex_"};
             return c.newMessageInfo(Playlist4ApiProto$Mov.DEFAULT_INSTANCE, "\x01\x03\xff\x02\xff\x02\x01\x01\x03\x03\xff\x02\xff\x02\xff\x02\xff\x02\x03\x01\x15\x02\xff\x02\xff\x02\x02\x15\x02\x01\x03\x15\x02\x02", objArray);
           case 3:
             return new Playlist4ApiProto$Mov();
           case 4:
             return new fq1(10, 0);
           case 5:
             return Playlist4ApiProto$Mov.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Playlist4ApiProto$Mov.PARSER) == null) {
                _monitor_enter(Playlist4ApiProto$Mov.class);
                if ((pARSER = Playlist4ApiProto$Mov.PARSER) == null) {
                   pARSER = new ii2(Playlist4ApiProto$Mov.DEFAULT_INSTANCE);
                   Playlist4ApiProto$Mov.PARSER = pARSER;
                }
                _monitor_exit(Playlist4ApiProto$Mov.class);
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

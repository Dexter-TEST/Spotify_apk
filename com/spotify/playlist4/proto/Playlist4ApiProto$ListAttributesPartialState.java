package com.spotify.playlist4.proto.Playlist4ApiProto$ListAttributesPartialState;
import p.u74;
import com.google.protobuf.c;
import p.dr0;
import java.lang.Class;
import p.xb3;
import com.spotify.playlist4.proto.Playlist4ApiProto$ListAttributes;
import java.lang.Object;
import p.ng5;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.kg5;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;

public final class Playlist4ApiProto$ListAttributesPartialState extends c implements u74	// class@000b97 from classes.dex
{
    private int bitField0_;
    private byte memoizedIsInitialized;
    private xb3 noValue_;
    private Playlist4ApiProto$ListAttributes values_;
    private static final Playlist4ApiProto$ListAttributesPartialState DEFAULT_INSTANCE;
    public static final int NO_VALUE_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int VALUES_FIELD_NUMBER;
    private static final yb3 noValue_converter_;

    static {
       Playlist4ApiProto$ListAttributesPartialState.noValue_converter_ = new dr0(5);
       Playlist4ApiProto$ListAttributesPartialState listAttribut = new Playlist4ApiProto$ListAttributesPartialState();
       Playlist4ApiProto$ListAttributesPartialState.DEFAULT_INSTANCE = listAttribut;
       c.registerDefaultInstance(Playlist4ApiProto$ListAttributesPartialState.class, listAttribut);
    }
    private void Playlist4ApiProto$ListAttributesPartialState(){
       super();
       this.memoizedIsInitialized = 2;
       this.noValue_ = c.emptyIntList();
    }
    public static Playlist4ApiProto$ListAttributesPartialState e(){
       return Playlist4ApiProto$ListAttributesPartialState.DEFAULT_INSTANCE;
    }
    public static void f(Playlist4ApiProto$ListAttributesPartialState p0,Playlist4ApiProto$ListAttributes p1){
       p0.getClass();
       p1.getClass();
       p0.values_ = p1;
       p0.bitField0_ = p0.bitField0_ | 0x01;
    }
    public static ng5 g(){
       return Playlist4ApiProto$ListAttributesPartialState.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return Playlist4ApiProto$ListAttributesPartialState.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"bitField0_","values_","noValue_",kg5.a};
             return c.newMessageInfo(Playlist4ApiProto$ListAttributesPartialState.DEFAULT_INSTANCE, "\x01\x02\xff\x02\xff\x02\x01\x01\x02\x02\xff\x02\xff\x02\x01\x01\x01\x15\x02\xff\x02\xff\x02\x02\x1e", objArray);
           case 3:
             return new Playlist4ApiProto$ListAttributesPartialState();
           case 4:
             return new ng5();
           case 5:
             return Playlist4ApiProto$ListAttributesPartialState.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Playlist4ApiProto$ListAttributesPartialState.PARSER) == null) {
                _monitor_enter(Playlist4ApiProto$ListAttributesPartialState.class);
                if ((pARSER = Playlist4ApiProto$ListAttributesPartialState.PARSER) == null) {
                   pARSER = new ii2(Playlist4ApiProto$ListAttributesPartialState.DEFAULT_INSTANCE);
                   Playlist4ApiProto$ListAttributesPartialState.PARSER = pARSER;
                }
                _monitor_exit(Playlist4ApiProto$ListAttributesPartialState.class);
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

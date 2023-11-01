package com.spotify.playlist4.proto.Playlist4ApiProto$ItemAttributesPartialState;
import p.u74;
import com.google.protobuf.c;
import p.dr0;
import java.lang.Class;
import p.xb3;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.fq1;
import p.ig5;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class Playlist4ApiProto$ItemAttributesPartialState extends c implements u74	// class@000b95 from classes.dex
{
    private int bitField0_;
    private byte memoizedIsInitialized;
    private xb3 noValue_;
    private Playlist4ApiProto$ItemAttributes values_;
    private static final Playlist4ApiProto$ItemAttributesPartialState DEFAULT_INSTANCE;
    public static final int NO_VALUE_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int VALUES_FIELD_NUMBER;
    private static final yb3 noValue_converter_;

    static {
       Playlist4ApiProto$ItemAttributesPartialState.noValue_converter_ = new dr0(3);
       Playlist4ApiProto$ItemAttributesPartialState itemAttribut = new Playlist4ApiProto$ItemAttributesPartialState();
       Playlist4ApiProto$ItemAttributesPartialState.DEFAULT_INSTANCE = itemAttribut;
       c.registerDefaultInstance(Playlist4ApiProto$ItemAttributesPartialState.class, itemAttribut);
    }
    private void Playlist4ApiProto$ItemAttributesPartialState(){
       super();
       this.memoizedIsInitialized = 2;
       this.noValue_ = c.emptyIntList();
    }
    public static Playlist4ApiProto$ItemAttributesPartialState e(){
       return Playlist4ApiProto$ItemAttributesPartialState.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Playlist4ApiProto$ItemAttributesPartialState.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"bitField0_","values_","noValue_",ig5.a};
             return c.newMessageInfo(Playlist4ApiProto$ItemAttributesPartialState.DEFAULT_INSTANCE, "\x01\x02\xff\x02\xff\x02\x01\x01\x02\x02\xff\x02\xff\x02\x01\x01\x01\x15\x02\xff\x02\xff\x02\x02\x1e", objArray);
           case 3:
             return new Playlist4ApiProto$ItemAttributesPartialState();
           case 4:
             return new fq1(9, 0);
           case 5:
             return Playlist4ApiProto$ItemAttributesPartialState.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Playlist4ApiProto$ItemAttributesPartialState.PARSER) == null) {
                _monitor_enter(Playlist4ApiProto$ItemAttributesPartialState.class);
                if ((pARSER = Playlist4ApiProto$ItemAttributesPartialState.PARSER) == null) {
                   pARSER = new ii2(Playlist4ApiProto$ItemAttributesPartialState.DEFAULT_INSTANCE);
                   Playlist4ApiProto$ItemAttributesPartialState.PARSER = pARSER;
                }
                _monitor_exit(Playlist4ApiProto$ItemAttributesPartialState.class);
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

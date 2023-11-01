package com.spotify.player.esperanto.proto.EsContextPlayerOptions$ContextPlayerOptionOverrides;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import com.spotify.player.esperanto.proto.EsOptional$OptionalBoolean;
import java.lang.Object;
import p.dp1;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.String;
import java.lang.Byte;

public final class EsContextPlayerOptions$ContextPlayerOptionOverrides extends c implements u74	// class@000af1 from classes.dex
{
    private int bitField0_;
    private float playbackSpeed_;
    private EsOptional$OptionalBoolean repeatingContext_;
    private EsOptional$OptionalBoolean repeatingTrack_;
    private EsOptional$OptionalBoolean shufflingContext_;
    private static final EsContextPlayerOptions$ContextPlayerOptionOverrides DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int PLAYBACK_SPEED_FIELD_NUMBER;
    public static final int REPEATING_CONTEXT_FIELD_NUMBER;
    public static final int REPEATING_TRACK_FIELD_NUMBER;
    public static final int SHUFFLING_CONTEXT_FIELD_NUMBER;

    static {
       EsContextPlayerOptions$ContextPlayerOptionOverrides uContextPlay = new EsContextPlayerOptions$ContextPlayerOptionOverrides();
       EsContextPlayerOptions$ContextPlayerOptionOverrides.DEFAULT_INSTANCE = uContextPlay;
       c.registerDefaultInstance(EsContextPlayerOptions$ContextPlayerOptionOverrides.class, uContextPlay);
    }
    private void EsContextPlayerOptions$ContextPlayerOptionOverrides(){
       super();
    }
    public static void e(EsContextPlayerOptions$ContextPlayerOptionOverrides p0,EsOptional$OptionalBoolean p1){
       p0.getClass();
       p1.getClass();
       p0.repeatingContext_ = p1;
    }
    public static void f(EsContextPlayerOptions$ContextPlayerOptionOverrides p0,EsOptional$OptionalBoolean p1){
       p0.getClass();
       p1.getClass();
       p0.repeatingTrack_ = p1;
    }
    public static void g(EsContextPlayerOptions$ContextPlayerOptionOverrides p0,EsOptional$OptionalBoolean p1){
       p0.getClass();
       p1.getClass();
       p0.shufflingContext_ = p1;
    }
    public static EsContextPlayerOptions$ContextPlayerOptionOverrides h(){
       return EsContextPlayerOptions$ContextPlayerOptionOverrides.DEFAULT_INSTANCE;
    }
    public static dp1 i(){
       return EsContextPlayerOptions$ContextPlayerOptionOverrides.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return EsContextPlayerOptions$ContextPlayerOptionOverrides.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"bitField0_","shufflingContext_","repeatingContext_","repeatingTrack_","playbackSpeed_"};
             return c.newMessageInfo(EsContextPlayerOptions$ContextPlayerOptionOverrides.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x04\xff\x02\xff\x02\x01\x01\x04\x04\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\t\x02\t\x03\t\x04\x10\x02\xff\x02\xff\x02", objArray);
           case 3:
             return new EsContextPlayerOptions$ContextPlayerOptionOverrides();
           case 4:
             return new dp1();
           case 5:
             return EsContextPlayerOptions$ContextPlayerOptionOverrides.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EsContextPlayerOptions$ContextPlayerOptionOverrides.PARSER) == null) {
                _monitor_enter(EsContextPlayerOptions$ContextPlayerOptionOverrides.class);
                if ((pARSER = EsContextPlayerOptions$ContextPlayerOptionOverrides.PARSER) == null) {
                   pARSER = new ii2(EsContextPlayerOptions$ContextPlayerOptionOverrides.DEFAULT_INSTANCE);
                   EsContextPlayerOptions$ContextPlayerOptionOverrides.PARSER = pARSER;
                }
                _monitor_exit(EsContextPlayerOptions$ContextPlayerOptionOverrides.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
}

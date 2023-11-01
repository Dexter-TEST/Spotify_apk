package com.spotify.player.esperanto.proto.EsContextPlayerOptions$ContextPlayerOptions;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.sq1;
import p.s74;
import java.lang.String;
import java.lang.Byte;

public final class EsContextPlayerOptions$ContextPlayerOptions extends c implements u74	// class@000af2 from classes.dex
{
    private int bitField0_;
    private float playbackSpeed_;
    private boolean repeatingContext_;
    private boolean repeatingTrack_;
    private boolean shufflingContext_;
    private static final EsContextPlayerOptions$ContextPlayerOptions DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int PLAYBACK_SPEED_FIELD_NUMBER;
    public static final int REPEATING_CONTEXT_FIELD_NUMBER;
    public static final int REPEATING_TRACK_FIELD_NUMBER;
    public static final int SHUFFLING_CONTEXT_FIELD_NUMBER;

    static {
       EsContextPlayerOptions$ContextPlayerOptions uContextPlay = new EsContextPlayerOptions$ContextPlayerOptions();
       EsContextPlayerOptions$ContextPlayerOptions.DEFAULT_INSTANCE = uContextPlay;
       c.registerDefaultInstance(EsContextPlayerOptions$ContextPlayerOptions.class, uContextPlay);
    }
    private void EsContextPlayerOptions$ContextPlayerOptions(){
       super();
    }
    public static EsContextPlayerOptions$ContextPlayerOptions e(){
       return EsContextPlayerOptions$ContextPlayerOptions.DEFAULT_INSTANCE;
    }
    public static EsContextPlayerOptions$ContextPlayerOptions f(){
       return EsContextPlayerOptions$ContextPlayerOptions.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return EsContextPlayerOptions$ContextPlayerOptions.DEFAULT_INSTANCE.getParserForType();
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
             return c.newMessageInfo(EsContextPlayerOptions$ContextPlayerOptions.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x04\xff\x02\xff\x02\x01\x01\x04\x04\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x07\x02\x07\x03\x07\x04\x10\x02\xff\x02\xff\x02", objArray);
           case 3:
             return new EsContextPlayerOptions$ContextPlayerOptions();
           case 4:
             return new sq1(26);
           case 5:
             return EsContextPlayerOptions$ContextPlayerOptions.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EsContextPlayerOptions$ContextPlayerOptions.PARSER) == null) {
                _monitor_enter(EsContextPlayerOptions$ContextPlayerOptions.class);
                if ((pARSER = EsContextPlayerOptions$ContextPlayerOptions.PARSER) == null) {
                   pARSER = new ii2(EsContextPlayerOptions$ContextPlayerOptions.DEFAULT_INSTANCE);
                   EsContextPlayerOptions$ContextPlayerOptions.PARSER = pARSER;
                }
                _monitor_exit(EsContextPlayerOptions$ContextPlayerOptions.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final boolean g(){
       return this.repeatingContext_;
    }
    public final boolean h(){
       return this.repeatingTrack_;
    }
    public final boolean i(){
       return this.shufflingContext_;
    }
}

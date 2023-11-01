package com.spotify.player.esperanto.proto.EsCommandOptions$CommandOptions;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.i80;
import p.h80;
import java.lang.Object;
import p.wo1;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.String;
import java.lang.Byte;

public final class EsCommandOptions$CommandOptions extends c implements u74	// class@000aed from classes.dex
{
    private boolean onlyForLocalDevice_;
    private i80 onlyForPlaybackId_;
    private boolean overrideRestrictions_;
    private boolean systemInitiated_;
    private static final EsCommandOptions$CommandOptions DEFAULT_INSTANCE;
    public static final int ONLY_FOR_LOCAL_DEVICE_FIELD_NUMBER;
    public static final int ONLY_FOR_PLAYBACK_ID_FIELD_NUMBER;
    public static final int OVERRIDE_RESTRICTIONS_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int SYSTEM_INITIATED_FIELD_NUMBER;

    static {
       EsCommandOptions$CommandOptions uCommandOpti = new EsCommandOptions$CommandOptions();
       EsCommandOptions$CommandOptions.DEFAULT_INSTANCE = uCommandOpti;
       c.registerDefaultInstance(EsCommandOptions$CommandOptions.class, uCommandOpti);
    }
    private void EsCommandOptions$CommandOptions(){
       super();
       this.onlyForPlaybackId_ = i80.b;
    }
    public static void e(EsCommandOptions$CommandOptions p0,boolean p1){
       p0.onlyForLocalDevice_ = p1;
    }
    public static void f(EsCommandOptions$CommandOptions p0,h80 p1){
       p0.getClass();
       p0.onlyForPlaybackId_ = p1;
    }
    public static void g(EsCommandOptions$CommandOptions p0,boolean p1){
       p0.overrideRestrictions_ = p1;
    }
    public static void h(EsCommandOptions$CommandOptions p0,boolean p1){
       p0.systemInitiated_ = p1;
    }
    public static EsCommandOptions$CommandOptions i(){
       return EsCommandOptions$CommandOptions.DEFAULT_INSTANCE;
    }
    public static wo1 j(){
       return EsCommandOptions$CommandOptions.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return EsCommandOptions$CommandOptions.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"overrideRestrictions_","onlyForLocalDevice_","systemInitiated_","onlyForPlaybackId_"};
             return c.newMessageInfo(EsCommandOptions$CommandOptions.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x04\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x04\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x07\x02\x07\x03\x07\x04\n", objArray);
           case 3:
             return new EsCommandOptions$CommandOptions();
           case 4:
             return new wo1();
           case 5:
             return EsCommandOptions$CommandOptions.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EsCommandOptions$CommandOptions.PARSER) == null) {
                _monitor_enter(EsCommandOptions$CommandOptions.class);
                if ((pARSER = EsCommandOptions$CommandOptions.PARSER) == null) {
                   pARSER = new ii2(EsCommandOptions$CommandOptions.DEFAULT_INSTANCE);
                   EsCommandOptions$CommandOptions.PARSER = pARSER;
                }
                _monitor_exit(EsCommandOptions$CommandOptions.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
}

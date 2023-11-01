package com.spotify.player.esperanto.proto.EsSeekTo$SeekToRequest;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams;
import java.lang.Object;
import com.spotify.player.esperanto.proto.EsCommandOptions$CommandOptions;
import p.kr1;
import p.jr1;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.String;
import java.lang.Byte;

public final class EsSeekTo$SeekToRequest extends c implements u74	// class@000b0a from classes.dex
{
    private EsLoggingParams$LoggingParams loggingParams_;
    private EsCommandOptions$CommandOptions options_;
    private long position_;
    private int relative_;
    private static final EsSeekTo$SeekToRequest DEFAULT_INSTANCE;
    public static final int LOGGING_PARAMS_FIELD_NUMBER;
    public static final int OPTIONS_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int POSITION_FIELD_NUMBER;
    public static final int RELATIVE_FIELD_NUMBER;

    static {
       EsSeekTo$SeekToRequest seekToReques = new EsSeekTo$SeekToRequest();
       EsSeekTo$SeekToRequest.DEFAULT_INSTANCE = seekToReques;
       c.registerDefaultInstance(EsSeekTo$SeekToRequest.class, seekToReques);
    }
    private void EsSeekTo$SeekToRequest(){
       super();
    }
    public static void e(EsSeekTo$SeekToRequest p0,EsLoggingParams$LoggingParams p1){
       p0.getClass();
       p0.loggingParams_ = p1;
    }
    public static void f(EsSeekTo$SeekToRequest p0,EsCommandOptions$CommandOptions p1){
       p0.getClass();
       p0.options_ = p1;
    }
    public static void g(EsSeekTo$SeekToRequest p0,long p1){
       p0.position_ = p1;
    }
    public static void h(EsSeekTo$SeekToRequest p0,kr1 p1){
       p0.getClass();
       p0.relative_ = p1.getNumber();
    }
    public static EsSeekTo$SeekToRequest i(){
       return EsSeekTo$SeekToRequest.DEFAULT_INSTANCE;
    }
    public static jr1 j(){
       return EsSeekTo$SeekToRequest.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return EsSeekTo$SeekToRequest.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"options_","loggingParams_","position_","relative_"};
             return c.newMessageInfo(EsSeekTo$SeekToRequest.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x04\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x04\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\t\x02\t\x03\x02\x04\f", objArray);
           case 3:
             return new EsSeekTo$SeekToRequest();
           case 4:
             return new jr1();
           case 5:
             return EsSeekTo$SeekToRequest.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EsSeekTo$SeekToRequest.PARSER) == null) {
                _monitor_enter(EsSeekTo$SeekToRequest.class);
                if ((pARSER = EsSeekTo$SeekToRequest.PARSER) == null) {
                   pARSER = new ii2(EsSeekTo$SeekToRequest.DEFAULT_INSTANCE);
                   EsSeekTo$SeekToRequest.PARSER = pARSER;
                }
                _monitor_exit(EsSeekTo$SeekToRequest.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
}

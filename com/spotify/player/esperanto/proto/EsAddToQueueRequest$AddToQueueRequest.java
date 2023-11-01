package com.spotify.player.esperanto.proto.EsAddToQueueRequest$AddToQueueRequest;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams;
import java.lang.Object;
import com.spotify.player.esperanto.proto.EsCommandOptions$CommandOptions;
import com.spotify.player.esperanto.proto.EsContextTrack$ContextTrack;
import p.vo1;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.String;
import java.lang.Byte;

public final class EsAddToQueueRequest$AddToQueueRequest extends c implements u74	// class@000aec from classes.dex
{
    private EsLoggingParams$LoggingParams loggingParams_;
    private EsCommandOptions$CommandOptions options_;
    private EsContextTrack$ContextTrack track_;
    private static final EsAddToQueueRequest$AddToQueueRequest DEFAULT_INSTANCE;
    public static final int LOGGING_PARAMS_FIELD_NUMBER;
    public static final int OPTIONS_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int TRACK_FIELD_NUMBER;

    static {
       EsAddToQueueRequest$AddToQueueRequest uAddToQueueR = new EsAddToQueueRequest$AddToQueueRequest();
       EsAddToQueueRequest$AddToQueueRequest.DEFAULT_INSTANCE = uAddToQueueR;
       c.registerDefaultInstance(EsAddToQueueRequest$AddToQueueRequest.class, uAddToQueueR);
    }
    private void EsAddToQueueRequest$AddToQueueRequest(){
       super();
    }
    public static void e(EsAddToQueueRequest$AddToQueueRequest p0,EsLoggingParams$LoggingParams p1){
       p0.getClass();
       p0.loggingParams_ = p1;
    }
    public static void f(EsAddToQueueRequest$AddToQueueRequest p0,EsCommandOptions$CommandOptions p1){
       p0.getClass();
       p0.options_ = p1;
    }
    public static void g(EsAddToQueueRequest$AddToQueueRequest p0,EsContextTrack$ContextTrack p1){
       p0.getClass();
       p0.track_ = p1;
    }
    public static EsAddToQueueRequest$AddToQueueRequest h(){
       return EsAddToQueueRequest$AddToQueueRequest.DEFAULT_INSTANCE;
    }
    public static vo1 i(){
       return EsAddToQueueRequest$AddToQueueRequest.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return EsAddToQueueRequest$AddToQueueRequest.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"track_","options_","loggingParams_"};
             return c.newMessageInfo(EsAddToQueueRequest$AddToQueueRequest.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x03\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\t\x02\t\x03\t", objArray);
           case 3:
             return new EsAddToQueueRequest$AddToQueueRequest();
           case 4:
             return new vo1();
           case 5:
             return EsAddToQueueRequest$AddToQueueRequest.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EsAddToQueueRequest$AddToQueueRequest.PARSER) == null) {
                _monitor_enter(EsAddToQueueRequest$AddToQueueRequest.class);
                if ((pARSER = EsAddToQueueRequest$AddToQueueRequest.PARSER) == null) {
                   pARSER = new ii2(EsAddToQueueRequest$AddToQueueRequest.DEFAULT_INSTANCE);
                   EsAddToQueueRequest$AddToQueueRequest.PARSER = pARSER;
                }
                _monitor_exit(EsAddToQueueRequest$AddToQueueRequest.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
}

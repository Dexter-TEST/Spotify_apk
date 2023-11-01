package com.spotify.player.esperanto.proto.EsPause$PauseRequest;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams;
import java.lang.Object;
import com.spotify.player.esperanto.proto.EsCommandOptions$CommandOptions;
import com.spotify.player.esperanto.proto.EsPauseresumeOrigin$PauseResumeOrigin;
import p.pq1;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.String;
import java.lang.Byte;

public final class EsPause$PauseRequest extends c implements u74	// class@000afe from classes.dex
{
    private EsLoggingParams$LoggingParams loggingParams_;
    private EsCommandOptions$CommandOptions options_;
    private EsPauseresumeOrigin$PauseResumeOrigin pauseOrigin_;
    private static final EsPause$PauseRequest DEFAULT_INSTANCE;
    public static final int LOGGING_PARAMS_FIELD_NUMBER;
    public static final int OPTIONS_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int PAUSE_ORIGIN_FIELD_NUMBER;

    static {
       EsPause$PauseRequest pauseRequest = new EsPause$PauseRequest();
       EsPause$PauseRequest.DEFAULT_INSTANCE = pauseRequest;
       c.registerDefaultInstance(EsPause$PauseRequest.class, pauseRequest);
    }
    private void EsPause$PauseRequest(){
       super();
    }
    public static void e(EsPause$PauseRequest p0,EsLoggingParams$LoggingParams p1){
       p0.getClass();
       p0.loggingParams_ = p1;
    }
    public static void f(EsPause$PauseRequest p0,EsCommandOptions$CommandOptions p1){
       p0.getClass();
       p0.options_ = p1;
    }
    public static void g(EsPause$PauseRequest p0,EsPauseresumeOrigin$PauseResumeOrigin p1){
       p0.getClass();
       p0.pauseOrigin_ = p1;
    }
    public static EsPause$PauseRequest h(){
       return EsPause$PauseRequest.DEFAULT_INSTANCE;
    }
    public static pq1 i(){
       return EsPause$PauseRequest.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return EsPause$PauseRequest.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"options_","loggingParams_","pauseOrigin_"};
             return c.newMessageInfo(EsPause$PauseRequest.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x03\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\t\x02\t\x03\t", objArray);
           case 3:
             return new EsPause$PauseRequest();
           case 4:
             return new pq1();
           case 5:
             return EsPause$PauseRequest.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EsPause$PauseRequest.PARSER) == null) {
                _monitor_enter(EsPause$PauseRequest.class);
                if ((pARSER = EsPause$PauseRequest.PARSER) == null) {
                   pARSER = new ii2(EsPause$PauseRequest.DEFAULT_INSTANCE);
                   EsPause$PauseRequest.PARSER = pARSER;
                }
                _monitor_exit(EsPause$PauseRequest.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
}

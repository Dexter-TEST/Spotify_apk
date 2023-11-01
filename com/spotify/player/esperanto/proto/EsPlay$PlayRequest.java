package com.spotify.player.esperanto.proto.EsPlay$PlayRequest;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams;
import java.lang.Object;
import com.spotify.player.esperanto.proto.EsPreparePlay$PreparePlayRequest;
import p.rq1;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.String;
import java.lang.Byte;

public final class EsPlay$PlayRequest extends c implements u74	// class@000b00 from classes.dex
{
    private EsLoggingParams$LoggingParams loggingParams_;
    private EsCommandOptions$CommandOptions options_;
    private EsPlayOptions$PlayOptions playOptions_;
    private EsPreparePlay$PreparePlayRequest preparePlayRequest_;
    private static final EsPlay$PlayRequest DEFAULT_INSTANCE;
    public static final int LOGGING_PARAMS_FIELD_NUMBER;
    public static final int OPTIONS_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int PLAY_OPTIONS_FIELD_NUMBER;
    public static final int PREPARE_PLAY_REQUEST_FIELD_NUMBER;

    static {
       EsPlay$PlayRequest playRequest = new EsPlay$PlayRequest();
       EsPlay$PlayRequest.DEFAULT_INSTANCE = playRequest;
       c.registerDefaultInstance(EsPlay$PlayRequest.class, playRequest);
    }
    private void EsPlay$PlayRequest(){
       super();
    }
    public static void e(EsPlay$PlayRequest p0,EsLoggingParams$LoggingParams p1){
       p0.getClass();
       p0.loggingParams_ = p1;
    }
    public static void f(EsPlay$PlayRequest p0,EsPreparePlay$PreparePlayRequest p1){
       p0.getClass();
       p1.getClass();
       p0.preparePlayRequest_ = p1;
    }
    public static EsPlay$PlayRequest g(){
       return EsPlay$PlayRequest.DEFAULT_INSTANCE;
    }
    public static rq1 h(){
       return EsPlay$PlayRequest.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return EsPlay$PlayRequest.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"preparePlayRequest_","playOptions_","options_","loggingParams_"};
             return c.newMessageInfo(EsPlay$PlayRequest.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x04\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x04\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\t\x02\t\x03\t\x04\t", objArray);
           case 3:
             return new EsPlay$PlayRequest();
           case 4:
             return new rq1();
           case 5:
             return EsPlay$PlayRequest.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EsPlay$PlayRequest.PARSER) == null) {
                _monitor_enter(EsPlay$PlayRequest.class);
                if ((pARSER = EsPlay$PlayRequest.PARSER) == null) {
                   pARSER = new ii2(EsPlay$PlayRequest.DEFAULT_INSTANCE);
                   EsPlay$PlayRequest.PARSER = pARSER;
                }
                _monitor_exit(EsPlay$PlayRequest.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
}

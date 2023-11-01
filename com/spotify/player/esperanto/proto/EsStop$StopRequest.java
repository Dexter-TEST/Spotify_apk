package com.spotify.player.esperanto.proto.EsStop$StopRequest;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams;
import java.lang.Object;
import p.sr1;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.String;
import java.lang.Byte;

public final class EsStop$StopRequest extends c implements u74	// class@000b11 from classes.dex
{
    private EsLoggingParams$LoggingParams loggingParams_;
    private EsCommandOptions$CommandOptions options_;
    private int reason_;
    private static final EsStop$StopRequest DEFAULT_INSTANCE;
    public static final int LOGGING_PARAMS_FIELD_NUMBER;
    public static final int OPTIONS_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int REASON_FIELD_NUMBER;

    static {
       EsStop$StopRequest stopRequest = new EsStop$StopRequest();
       EsStop$StopRequest.DEFAULT_INSTANCE = stopRequest;
       c.registerDefaultInstance(EsStop$StopRequest.class, stopRequest);
    }
    private void EsStop$StopRequest(){
       super();
    }
    public static void e(EsStop$StopRequest p0,EsLoggingParams$LoggingParams p1){
       p0.getClass();
       p0.loggingParams_ = p1;
    }
    public static EsStop$StopRequest f(){
       return EsStop$StopRequest.DEFAULT_INSTANCE;
    }
    public static sr1 g(){
       return EsStop$StopRequest.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return EsStop$StopRequest.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"options_","reason_","loggingParams_"};
             return c.newMessageInfo(EsStop$StopRequest.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x03\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\t\x02\f\x03\t", objArray);
           case 3:
             return new EsStop$StopRequest();
           case 4:
             return new sr1();
           case 5:
             return EsStop$StopRequest.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EsStop$StopRequest.PARSER) == null) {
                _monitor_enter(EsStop$StopRequest.class);
                if ((pARSER = EsStop$StopRequest.PARSER) == null) {
                   pARSER = new ii2(EsStop$StopRequest.DEFAULT_INSTANCE);
                   EsStop$StopRequest.PARSER = pARSER;
                }
                _monitor_exit(EsStop$StopRequest.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
}

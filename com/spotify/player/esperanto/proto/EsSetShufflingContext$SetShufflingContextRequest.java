package com.spotify.player.esperanto.proto.EsSetShufflingContext$SetShufflingContextRequest;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams;
import java.lang.Object;
import com.spotify.player.esperanto.proto.EsCommandOptions$CommandOptions;
import p.nr1;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.String;
import java.lang.Byte;

public final class EsSetShufflingContext$SetShufflingContextRequest extends c implements u74	// class@000b0d from classes.dex
{
    private EsLoggingParams$LoggingParams loggingParams_;
    private EsCommandOptions$CommandOptions options_;
    private boolean shufflingContext_;
    private static final EsSetShufflingContext$SetShufflingContextRequest DEFAULT_INSTANCE;
    public static final int LOGGING_PARAMS_FIELD_NUMBER;
    public static final int OPTIONS_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int SHUFFLING_CONTEXT_FIELD_NUMBER;

    static {
       EsSetShufflingContext$SetShufflingContextRequest setShuffling = new EsSetShufflingContext$SetShufflingContextRequest();
       EsSetShufflingContext$SetShufflingContextRequest.DEFAULT_INSTANCE = setShuffling;
       c.registerDefaultInstance(EsSetShufflingContext$SetShufflingContextRequest.class, setShuffling);
    }
    private void EsSetShufflingContext$SetShufflingContextRequest(){
       super();
    }
    public static void e(EsSetShufflingContext$SetShufflingContextRequest p0,EsLoggingParams$LoggingParams p1){
       p0.getClass();
       p0.loggingParams_ = p1;
    }
    public static void f(EsSetShufflingContext$SetShufflingContextRequest p0,EsCommandOptions$CommandOptions p1){
       p0.getClass();
       p0.options_ = p1;
    }
    public static void g(EsSetShufflingContext$SetShufflingContextRequest p0,boolean p1){
       p0.shufflingContext_ = p1;
    }
    public static EsSetShufflingContext$SetShufflingContextRequest h(){
       return EsSetShufflingContext$SetShufflingContextRequest.DEFAULT_INSTANCE;
    }
    public static nr1 i(){
       return EsSetShufflingContext$SetShufflingContextRequest.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return EsSetShufflingContext$SetShufflingContextRequest.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"shufflingContext_","options_","loggingParams_"};
             return c.newMessageInfo(EsSetShufflingContext$SetShufflingContextRequest.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x03\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x07\x02\t\x03\t", objArray);
           case 3:
             return new EsSetShufflingContext$SetShufflingContextRequest();
           case 4:
             return new nr1();
           case 5:
             return EsSetShufflingContext$SetShufflingContextRequest.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EsSetShufflingContext$SetShufflingContextRequest.PARSER) == null) {
                _monitor_enter(EsSetShufflingContext$SetShufflingContextRequest.class);
                if ((pARSER = EsSetShufflingContext$SetShufflingContextRequest.PARSER) == null) {
                   pARSER = new ii2(EsSetShufflingContext$SetShufflingContextRequest.DEFAULT_INSTANCE);
                   EsSetShufflingContext$SetShufflingContextRequest.PARSER = pARSER;
                }
                _monitor_exit(EsSetShufflingContext$SetShufflingContextRequest.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
}

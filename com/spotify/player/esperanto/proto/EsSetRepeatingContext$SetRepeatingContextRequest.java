package com.spotify.player.esperanto.proto.EsSetRepeatingContext$SetRepeatingContextRequest;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams;
import java.lang.Object;
import com.spotify.player.esperanto.proto.EsCommandOptions$CommandOptions;
import p.lr1;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.String;
import java.lang.Byte;

public final class EsSetRepeatingContext$SetRepeatingContextRequest extends c implements u74	// class@000b0b from classes.dex
{
    private EsLoggingParams$LoggingParams loggingParams_;
    private EsCommandOptions$CommandOptions options_;
    private boolean repeatingContext_;
    private static final EsSetRepeatingContext$SetRepeatingContextRequest DEFAULT_INSTANCE;
    public static final int LOGGING_PARAMS_FIELD_NUMBER;
    public static final int OPTIONS_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int REPEATING_CONTEXT_FIELD_NUMBER;

    static {
       EsSetRepeatingContext$SetRepeatingContextRequest setRepeating = new EsSetRepeatingContext$SetRepeatingContextRequest();
       EsSetRepeatingContext$SetRepeatingContextRequest.DEFAULT_INSTANCE = setRepeating;
       c.registerDefaultInstance(EsSetRepeatingContext$SetRepeatingContextRequest.class, setRepeating);
    }
    private void EsSetRepeatingContext$SetRepeatingContextRequest(){
       super();
    }
    public static void e(EsSetRepeatingContext$SetRepeatingContextRequest p0,EsLoggingParams$LoggingParams p1){
       p0.getClass();
       p0.loggingParams_ = p1;
    }
    public static void f(EsSetRepeatingContext$SetRepeatingContextRequest p0,EsCommandOptions$CommandOptions p1){
       p0.getClass();
       p0.options_ = p1;
    }
    public static void g(EsSetRepeatingContext$SetRepeatingContextRequest p0,boolean p1){
       p0.repeatingContext_ = p1;
    }
    public static EsSetRepeatingContext$SetRepeatingContextRequest h(){
       return EsSetRepeatingContext$SetRepeatingContextRequest.DEFAULT_INSTANCE;
    }
    public static lr1 i(){
       return EsSetRepeatingContext$SetRepeatingContextRequest.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return EsSetRepeatingContext$SetRepeatingContextRequest.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"repeatingContext_","options_","loggingParams_"};
             return c.newMessageInfo(EsSetRepeatingContext$SetRepeatingContextRequest.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x03\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x07\x02\t\x03\t", objArray);
           case 3:
             return new EsSetRepeatingContext$SetRepeatingContextRequest();
           case 4:
             return new lr1();
           case 5:
             return EsSetRepeatingContext$SetRepeatingContextRequest.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EsSetRepeatingContext$SetRepeatingContextRequest.PARSER) == null) {
                _monitor_enter(EsSetRepeatingContext$SetRepeatingContextRequest.class);
                if ((pARSER = EsSetRepeatingContext$SetRepeatingContextRequest.PARSER) == null) {
                   pARSER = new ii2(EsSetRepeatingContext$SetRepeatingContextRequest.DEFAULT_INSTANCE);
                   EsSetRepeatingContext$SetRepeatingContextRequest.PARSER = pARSER;
                }
                _monitor_exit(EsSetRepeatingContext$SetRepeatingContextRequest.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
}

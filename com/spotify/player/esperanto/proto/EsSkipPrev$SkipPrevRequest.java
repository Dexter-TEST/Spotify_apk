package com.spotify.player.esperanto.proto.EsSkipPrev$SkipPrevRequest;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams;
import java.lang.Object;
import com.spotify.player.esperanto.proto.EsCommandOptions$CommandOptions;
import com.spotify.player.esperanto.proto.EsContextTrack$ContextTrack;
import p.qr1;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.String;
import java.lang.Byte;

public final class EsSkipPrev$SkipPrevRequest extends c implements u74	// class@000b0f from classes.dex
{
    private boolean allowSeeking_;
    private EsLoggingParams$LoggingParams loggingParams_;
    private EsCommandOptions$CommandOptions options_;
    private EsContextTrack$ContextTrack track_;
    public static final int ALLOW_SEEKING_FIELD_NUMBER = 2;
    private static final EsSkipPrev$SkipPrevRequest DEFAULT_INSTANCE;
    public static final int LOGGING_PARAMS_FIELD_NUMBER;
    public static final int OPTIONS_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int TRACK_FIELD_NUMBER;

    static {
       EsSkipPrev$SkipPrevRequest skipPrevRequ = new EsSkipPrev$SkipPrevRequest();
       EsSkipPrev$SkipPrevRequest.DEFAULT_INSTANCE = skipPrevRequ;
       c.registerDefaultInstance(EsSkipPrev$SkipPrevRequest.class, skipPrevRequ);
    }
    private void EsSkipPrev$SkipPrevRequest(){
       super();
    }
    public static void e(EsSkipPrev$SkipPrevRequest p0,boolean p1){
       p0.allowSeeking_ = p1;
    }
    public static void f(EsSkipPrev$SkipPrevRequest p0,EsLoggingParams$LoggingParams p1){
       p0.getClass();
       p0.loggingParams_ = p1;
    }
    public static void g(EsSkipPrev$SkipPrevRequest p0,EsCommandOptions$CommandOptions p1){
       p0.getClass();
       p0.options_ = p1;
    }
    public static void h(EsSkipPrev$SkipPrevRequest p0,EsContextTrack$ContextTrack p1){
       p0.getClass();
       p0.track_ = p1;
    }
    public static EsSkipPrev$SkipPrevRequest i(){
       return EsSkipPrev$SkipPrevRequest.DEFAULT_INSTANCE;
    }
    public static qr1 j(){
       return EsSkipPrev$SkipPrevRequest.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return EsSkipPrev$SkipPrevRequest.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"options_","allowSeeking_","loggingParams_","track_"};
             return c.newMessageInfo(EsSkipPrev$SkipPrevRequest.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x04\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x04\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\t\x02\x07\x03\t\x04\t", objArray);
           case 3:
             return new EsSkipPrev$SkipPrevRequest();
           case 4:
             return new qr1();
           case 5:
             return EsSkipPrev$SkipPrevRequest.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EsSkipPrev$SkipPrevRequest.PARSER) == null) {
                _monitor_enter(EsSkipPrev$SkipPrevRequest.class);
                if ((pARSER = EsSkipPrev$SkipPrevRequest.PARSER) == null) {
                   pARSER = new ii2(EsSkipPrev$SkipPrevRequest.DEFAULT_INSTANCE);
                   EsSkipPrev$SkipPrevRequest.PARSER = pARSER;
                }
                _monitor_exit(EsSkipPrev$SkipPrevRequest.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
}

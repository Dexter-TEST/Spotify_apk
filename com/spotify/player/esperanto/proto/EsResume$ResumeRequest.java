package com.spotify.player.esperanto.proto.EsResume$ResumeRequest;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams;
import java.lang.Object;
import com.spotify.player.esperanto.proto.EsCommandOptions$CommandOptions;
import com.spotify.player.esperanto.proto.EsPauseresumeOrigin$PauseResumeOrigin;
import p.ir1;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.String;
import java.lang.Byte;

public final class EsResume$ResumeRequest extends c implements u74	// class@000b09 from classes.dex
{
    private EsLoggingParams$LoggingParams loggingParams_;
    private EsCommandOptions$CommandOptions options_;
    private EsPauseresumeOrigin$PauseResumeOrigin resumeOrigin_;
    private static final EsResume$ResumeRequest DEFAULT_INSTANCE;
    public static final int LOGGING_PARAMS_FIELD_NUMBER;
    public static final int OPTIONS_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int RESUME_ORIGIN_FIELD_NUMBER;

    static {
       EsResume$ResumeRequest resumeReques = new EsResume$ResumeRequest();
       EsResume$ResumeRequest.DEFAULT_INSTANCE = resumeReques;
       c.registerDefaultInstance(EsResume$ResumeRequest.class, resumeReques);
    }
    private void EsResume$ResumeRequest(){
       super();
    }
    public static void e(EsResume$ResumeRequest p0,EsLoggingParams$LoggingParams p1){
       p0.getClass();
       p0.loggingParams_ = p1;
    }
    public static void f(EsResume$ResumeRequest p0,EsCommandOptions$CommandOptions p1){
       p0.getClass();
       p0.options_ = p1;
    }
    public static void g(EsResume$ResumeRequest p0,EsPauseresumeOrigin$PauseResumeOrigin p1){
       p0.getClass();
       p0.resumeOrigin_ = p1;
    }
    public static EsResume$ResumeRequest h(){
       return EsResume$ResumeRequest.DEFAULT_INSTANCE;
    }
    public static ir1 i(){
       return EsResume$ResumeRequest.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return EsResume$ResumeRequest.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"options_","loggingParams_","resumeOrigin_"};
             return c.newMessageInfo(EsResume$ResumeRequest.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x03\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\t\x02\t\x03\t", objArray);
           case 3:
             return new EsResume$ResumeRequest();
           case 4:
             return new ir1();
           case 5:
             return EsResume$ResumeRequest.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EsResume$ResumeRequest.PARSER) == null) {
                _monitor_enter(EsResume$ResumeRequest.class);
                if ((pARSER = EsResume$ResumeRequest.PARSER) == null) {
                   pARSER = new ii2(EsResume$ResumeRequest.DEFAULT_INSTANCE);
                   EsResume$ResumeRequest.PARSER = pARSER;
                }
                _monitor_exit(EsResume$ResumeRequest.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
}

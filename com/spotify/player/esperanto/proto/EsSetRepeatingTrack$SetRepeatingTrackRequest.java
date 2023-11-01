package com.spotify.player.esperanto.proto.EsSetRepeatingTrack$SetRepeatingTrackRequest;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams;
import java.lang.Object;
import com.spotify.player.esperanto.proto.EsCommandOptions$CommandOptions;
import p.mr1;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.String;
import java.lang.Byte;

public final class EsSetRepeatingTrack$SetRepeatingTrackRequest extends c implements u74	// class@000b0c from classes.dex
{
    private EsLoggingParams$LoggingParams loggingParams_;
    private EsCommandOptions$CommandOptions options_;
    private boolean repeatingTrack_;
    private static final EsSetRepeatingTrack$SetRepeatingTrackRequest DEFAULT_INSTANCE;
    public static final int LOGGING_PARAMS_FIELD_NUMBER;
    public static final int OPTIONS_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int REPEATING_TRACK_FIELD_NUMBER;

    static {
       EsSetRepeatingTrack$SetRepeatingTrackRequest setRepeating = new EsSetRepeatingTrack$SetRepeatingTrackRequest();
       EsSetRepeatingTrack$SetRepeatingTrackRequest.DEFAULT_INSTANCE = setRepeating;
       c.registerDefaultInstance(EsSetRepeatingTrack$SetRepeatingTrackRequest.class, setRepeating);
    }
    private void EsSetRepeatingTrack$SetRepeatingTrackRequest(){
       super();
    }
    public static void e(EsSetRepeatingTrack$SetRepeatingTrackRequest p0,EsLoggingParams$LoggingParams p1){
       p0.getClass();
       p0.loggingParams_ = p1;
    }
    public static void f(EsSetRepeatingTrack$SetRepeatingTrackRequest p0,EsCommandOptions$CommandOptions p1){
       p0.getClass();
       p0.options_ = p1;
    }
    public static void g(EsSetRepeatingTrack$SetRepeatingTrackRequest p0,boolean p1){
       p0.repeatingTrack_ = p1;
    }
    public static EsSetRepeatingTrack$SetRepeatingTrackRequest h(){
       return EsSetRepeatingTrack$SetRepeatingTrackRequest.DEFAULT_INSTANCE;
    }
    public static mr1 i(){
       return EsSetRepeatingTrack$SetRepeatingTrackRequest.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return EsSetRepeatingTrack$SetRepeatingTrackRequest.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"repeatingTrack_","options_","loggingParams_"};
             return c.newMessageInfo(EsSetRepeatingTrack$SetRepeatingTrackRequest.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x03\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x07\x02\t\x03\t", objArray);
           case 3:
             return new EsSetRepeatingTrack$SetRepeatingTrackRequest();
           case 4:
             return new mr1();
           case 5:
             return EsSetRepeatingTrack$SetRepeatingTrackRequest.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EsSetRepeatingTrack$SetRepeatingTrackRequest.PARSER) == null) {
                _monitor_enter(EsSetRepeatingTrack$SetRepeatingTrackRequest.class);
                if ((pARSER = EsSetRepeatingTrack$SetRepeatingTrackRequest.PARSER) == null) {
                   pARSER = new ii2(EsSetRepeatingTrack$SetRepeatingTrackRequest.DEFAULT_INSTANCE);
                   EsSetRepeatingTrack$SetRepeatingTrackRequest.PARSER = pARSER;
                }
                _monitor_exit(EsSetRepeatingTrack$SetRepeatingTrackRequest.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
}

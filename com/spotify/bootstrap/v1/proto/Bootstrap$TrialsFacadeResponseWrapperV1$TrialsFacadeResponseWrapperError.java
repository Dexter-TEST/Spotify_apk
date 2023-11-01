package com.spotify.bootstrap.v1.proto.Bootstrap$TrialsFacadeResponseWrapperV1$TrialsFacadeResponseWrapperError;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import com.spotify.bootstrap.v1.proto.b;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import p.r74;
import com.google.protobuf.b;

public final class Bootstrap$TrialsFacadeResponseWrapperV1$TrialsFacadeResponseWrapperError extends c implements u74	// class@00053c from classes.dex
{
    private int errorCode_;
    private String logId_;
    private String message_;
    private static final Bootstrap$TrialsFacadeResponseWrapperV1$TrialsFacadeResponseWrapperError DEFAULT_INSTANCE;
    public static final int ERROR_CODE_FIELD_NUMBER;
    public static final int LOG_ID_FIELD_NUMBER;
    public static final int MESSAGE_FIELD_NUMBER;
    private static r75 PARSER;

    static {
       Bootstrap$TrialsFacadeResponseWrapperV1$TrialsFacadeResponseWrapperError trialsFacade = new Bootstrap$TrialsFacadeResponseWrapperV1$TrialsFacadeResponseWrapperError();
       Bootstrap$TrialsFacadeResponseWrapperV1$TrialsFacadeResponseWrapperError.DEFAULT_INSTANCE = trialsFacade;
       c.registerDefaultInstance(Bootstrap$TrialsFacadeResponseWrapperV1$TrialsFacadeResponseWrapperError.class, trialsFacade);
    }
    private void Bootstrap$TrialsFacadeResponseWrapperV1$TrialsFacadeResponseWrapperError(){
       super();
       this.message_ = "";
       this.logId_ = "";
    }
    public static Bootstrap$TrialsFacadeResponseWrapperV1$TrialsFacadeResponseWrapperError e(){
       return Bootstrap$TrialsFacadeResponseWrapperV1$TrialsFacadeResponseWrapperError.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return Bootstrap$TrialsFacadeResponseWrapperV1$TrialsFacadeResponseWrapperError.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"errorCode_","message_","logId_"};
             return c.newMessageInfo(Bootstrap$TrialsFacadeResponseWrapperV1$TrialsFacadeResponseWrapperError.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x03\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x04\x02\x02\x02\x03\x02\x02", objArray);
           case 3:
             return new Bootstrap$TrialsFacadeResponseWrapperV1$TrialsFacadeResponseWrapperError();
           case 4:
             return new b();
           case 5:
             return Bootstrap$TrialsFacadeResponseWrapperV1$TrialsFacadeResponseWrapperError.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = Bootstrap$TrialsFacadeResponseWrapperV1$TrialsFacadeResponseWrapperError.PARSER) == null) {
                _monitor_enter(Bootstrap$TrialsFacadeResponseWrapperV1$TrialsFacadeResponseWrapperError.class);
                if ((pARSER = Bootstrap$TrialsFacadeResponseWrapperV1$TrialsFacadeResponseWrapperError.PARSER) == null) {
                   pARSER = new ii2(Bootstrap$TrialsFacadeResponseWrapperV1$TrialsFacadeResponseWrapperError.DEFAULT_INSTANCE);
                   Bootstrap$TrialsFacadeResponseWrapperV1$TrialsFacadeResponseWrapperError.PARSER = pARSER;
                }
                _monitor_exit(Bootstrap$TrialsFacadeResponseWrapperV1$TrialsFacadeResponseWrapperError.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public final s74 getDefaultInstanceForType(){
       return super.getDefaultInstanceForType();
    }
    public final r74 newBuilderForType(){
       return super.newBuilderForType();
    }
    public final r74 toBuilder(){
       return super.toBuilder();
    }
}

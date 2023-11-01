package com.spotify.player.esperanto.proto.EsLoggingParams$LoggingParams;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.bc3;
import java.lang.String;
import java.lang.Object;
import p.f2;
import java.util.List;
import com.spotify.player.esperanto.proto.EsOptional$OptionalInt64;
import p.hq1;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.Byte;

public final class EsLoggingParams$LoggingParams extends c implements u74	// class@000afa from classes.dex
{
    private EsOptional$OptionalInt64 commandInitiatedTime_;
    private EsOptional$OptionalInt64 commandReceivedTime_;
    private String deviceIdentifier_;
    private bc3 interactionIds_;
    private bc3 pageInstanceIds_;
    public static final int COMMAND_INITIATED_TIME_FIELD_NUMBER = 1;
    public static final int COMMAND_RECEIVED_TIME_FIELD_NUMBER = 2;
    private static final EsLoggingParams$LoggingParams DEFAULT_INSTANCE;
    public static final int DEVICE_IDENTIFIER_FIELD_NUMBER;
    public static final int INTERACTION_IDS_FIELD_NUMBER;
    public static final int PAGE_INSTANCE_IDS_FIELD_NUMBER;
    private static r75 PARSER;

    static {
       EsLoggingParams$LoggingParams loggingParam = new EsLoggingParams$LoggingParams();
       EsLoggingParams$LoggingParams.DEFAULT_INSTANCE = loggingParam;
       c.registerDefaultInstance(EsLoggingParams$LoggingParams.class, loggingParam);
    }
    private void EsLoggingParams$LoggingParams(){
       super();
       this.pageInstanceIds_ = c.emptyProtobufList();
       this.interactionIds_ = c.emptyProtobufList();
       this.deviceIdentifier_ = "";
    }
    public static void e(EsLoggingParams$LoggingParams p0,String p1){
       p0.getClass();
       p1.getClass();
       EsLoggingParams$LoggingParams interactionI = p0.interactionIds_;
       if (interactionI.a == null) {
          p0.interactionIds_ = c.mutableCopy(interactionI);
       }
       p0.interactionIds_.add(p1);
       return;
    }
    public static void f(EsLoggingParams$LoggingParams p0,String p1){
       p0.getClass();
       p1.getClass();
       EsLoggingParams$LoggingParams pageInstance = p0.pageInstanceIds_;
       if (pageInstance.a == null) {
          p0.pageInstanceIds_ = c.mutableCopy(pageInstance);
       }
       p0.pageInstanceIds_.add(p1);
       return;
    }
    public static void g(EsLoggingParams$LoggingParams p0,EsOptional$OptionalInt64 p1){
       p0.getClass();
       p1.getClass();
       p0.commandInitiatedTime_ = p1;
    }
    public static EsLoggingParams$LoggingParams h(){
       return EsLoggingParams$LoggingParams.DEFAULT_INSTANCE;
    }
    public static hq1 i(){
       return EsLoggingParams$LoggingParams.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return EsLoggingParams$LoggingParams.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"commandInitiatedTime_","commandReceivedTime_","pageInstanceIds_","interactionIds_","deviceIdentifier_"};
             return c.newMessageInfo(EsLoggingParams$LoggingParams.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x05\xff\x02\xff\x02\xff\x02\xff\x02\x01\x05\x05\xff\x02\xff\x02\x02\xff\x02\xff\x02\x01\t\x02\t\x03\x02\x02\x04\x02\x02\x05\x02\x02", objArray);
           case 3:
             return new EsLoggingParams$LoggingParams();
           case 4:
             return new hq1();
           case 5:
             return EsLoggingParams$LoggingParams.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EsLoggingParams$LoggingParams.PARSER) == null) {
                _monitor_enter(EsLoggingParams$LoggingParams.class);
                if ((pARSER = EsLoggingParams$LoggingParams.PARSER) == null) {
                   pARSER = new ii2(EsLoggingParams$LoggingParams.DEFAULT_INSTANCE);
                   EsLoggingParams$LoggingParams.PARSER = pARSER;
                }
                _monitor_exit(EsLoggingParams$LoggingParams.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
}

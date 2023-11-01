package com.spotify.connect.esperanto.proto.CommonMessages$LoggingParams;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.bc3;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.h40;
import p.s74;
import java.lang.String;
import java.lang.Byte;

public final class CommonMessages$LoggingParams extends c implements u74	// class@00059b from classes.dex
{
    private int bitField0_;
    private long commandInitiatedTime_;
    private long commandReceivedTime_;
    private bc3 interactionIds_;
    private bc3 pageInstanceIds_;
    public static final int COMMAND_INITIATED_TIME_FIELD_NUMBER = 1;
    public static final int COMMAND_RECEIVED_TIME_FIELD_NUMBER = 2;
    private static final CommonMessages$LoggingParams DEFAULT_INSTANCE;
    public static final int INTERACTION_IDS_FIELD_NUMBER;
    public static final int PAGE_INSTANCE_IDS_FIELD_NUMBER;
    private static r75 PARSER;

    static {
       CommonMessages$LoggingParams loggingParam = new CommonMessages$LoggingParams();
       CommonMessages$LoggingParams.DEFAULT_INSTANCE = loggingParam;
       c.registerDefaultInstance(CommonMessages$LoggingParams.class, loggingParam);
    }
    private void CommonMessages$LoggingParams(){
       super();
       this.pageInstanceIds_ = c.emptyProtobufList();
       this.interactionIds_ = c.emptyProtobufList();
    }
    public static CommonMessages$LoggingParams e(){
       return CommonMessages$LoggingParams.DEFAULT_INSTANCE;
    }
    public static r75 parser(){
       return CommonMessages$LoggingParams.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"bitField0_","commandInitiatedTime_","commandReceivedTime_","pageInstanceIds_","interactionIds_"};
             return c.newMessageInfo(CommonMessages$LoggingParams.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x04\xff\x02\xff\x02\x01\x01\x04\x04\xff\x02\xff\x02\x02\xff\x02\xff\x02\x01\x10\x02\xff\x02\xff\x02\x02\x10\x02\x01\x03\x02\x02\x04\x02\x02", objArray);
           case 3:
             return new CommonMessages$LoggingParams();
           case 4:
             return new h40();
           case 5:
             return CommonMessages$LoggingParams.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = CommonMessages$LoggingParams.PARSER) == null) {
                _monitor_enter(CommonMessages$LoggingParams.class);
                if ((pARSER = CommonMessages$LoggingParams.PARSER) == null) {
                   pARSER = new ii2(CommonMessages$LoggingParams.DEFAULT_INSTANCE);
                   CommonMessages$LoggingParams.PARSER = pARSER;
                }
                _monitor_exit(CommonMessages$LoggingParams.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
}

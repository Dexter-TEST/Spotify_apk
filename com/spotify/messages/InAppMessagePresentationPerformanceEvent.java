package com.spotify.messages.InAppMessagePresentationPerformanceEvent;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import p.b83;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.Byte;
import p.r74;

public final class InAppMessagePresentationPerformanceEvent extends c implements u74	// class@000a06 from classes.dex
{
    private int bitField0_;
    private String creativeId_;
    private String duration_;
    private String messageFormat_;
    public static final int CREATIVE_ID_FIELD_NUMBER = 1;
    private static final InAppMessagePresentationPerformanceEvent DEFAULT_INSTANCE;
    public static final int DURATION_FIELD_NUMBER;
    public static final int MESSAGE_FORMAT_FIELD_NUMBER;
    private static r75 PARSER;

    static {
       InAppMessagePresentationPerformanceEvent inAppMessage = new InAppMessagePresentationPerformanceEvent();
       InAppMessagePresentationPerformanceEvent.DEFAULT_INSTANCE = inAppMessage;
       c.registerDefaultInstance(InAppMessagePresentationPerformanceEvent.class, inAppMessage);
    }
    private void InAppMessagePresentationPerformanceEvent(){
       super();
       this.creativeId_ = "";
       this.duration_ = "";
       this.messageFormat_ = "";
    }
    public static InAppMessagePresentationPerformanceEvent e(){
       return InAppMessagePresentationPerformanceEvent.DEFAULT_INSTANCE;
    }
    public static void f(InAppMessagePresentationPerformanceEvent p0,String p1){
       p0.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x01;
       p0.creativeId_ = p1;
    }
    public static void g(InAppMessagePresentationPerformanceEvent p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x02;
       p0.duration_ = p1;
    }
    public static void h(InAppMessagePresentationPerformanceEvent p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x04;
       p0.messageFormat_ = p1;
    }
    public static b83 i(){
       return InAppMessagePresentationPerformanceEvent.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return InAppMessagePresentationPerformanceEvent.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"bitField0_","creativeId_","duration_","messageFormat_"};
             return c.newMessageInfo(InAppMessagePresentationPerformanceEvent.DEFAULT_INSTANCE, "\x01\x03\xff\x02\xff\x02\x01\x01\x03\x03\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x10\x02\xff\x02\xff\x02\x02\x10\x02\x01\x03\x10\x02\x02", objArray);
           case 3:
             return new InAppMessagePresentationPerformanceEvent();
           case 4:
             return new b83();
           case 5:
             return InAppMessagePresentationPerformanceEvent.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = InAppMessagePresentationPerformanceEvent.PARSER) == null) {
                _monitor_enter(InAppMessagePresentationPerformanceEvent.class);
                if ((pARSER = InAppMessagePresentationPerformanceEvent.PARSER) == null) {
                   pARSER = new ii2(InAppMessagePresentationPerformanceEvent.DEFAULT_INSTANCE);
                   InAppMessagePresentationPerformanceEvent.PARSER = pARSER;
                }
                _monitor_exit(InAppMessagePresentationPerformanceEvent.class);
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

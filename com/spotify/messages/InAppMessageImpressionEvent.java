package com.spotify.messages.InAppMessageImpressionEvent;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import p.z73;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.Byte;
import p.r74;

public final class InAppMessageImpressionEvent extends c implements u74	// class@000a04 from classes.dex
{
    private int bitField0_;
    private long clientTimestamp_;
    private String messageFormat_;
    private String uuid_;
    public static final int CLIENT_TIMESTAMP_FIELD_NUMBER = 3;
    private static final InAppMessageImpressionEvent DEFAULT_INSTANCE;
    public static final int MESSAGE_FORMAT_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int UUID_FIELD_NUMBER;

    static {
       InAppMessageImpressionEvent inAppMessage = new InAppMessageImpressionEvent();
       InAppMessageImpressionEvent.DEFAULT_INSTANCE = inAppMessage;
       c.registerDefaultInstance(InAppMessageImpressionEvent.class, inAppMessage);
    }
    private void InAppMessageImpressionEvent(){
       super();
       this.messageFormat_ = "";
       this.uuid_ = "";
    }
    public static InAppMessageImpressionEvent e(){
       return InAppMessageImpressionEvent.DEFAULT_INSTANCE;
    }
    public static void f(InAppMessageImpressionEvent p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x01;
       p0.messageFormat_ = p1;
    }
    public static void g(InAppMessageImpressionEvent p0,String p1){
       p0.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x02;
       p0.uuid_ = p1;
    }
    public static z73 h(){
       return InAppMessageImpressionEvent.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return InAppMessageImpressionEvent.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"bitField0_","messageFormat_","uuid_","clientTimestamp_"};
             return c.newMessageInfo(InAppMessageImpressionEvent.DEFAULT_INSTANCE, "\x01\x03\xff\x02\xff\x02\x01\x01\x03\x03\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x10\x02\xff\x02\xff\x02\x02\x10\x02\x01\x03\x10\x02\x02", objArray);
           case 3:
             return new InAppMessageImpressionEvent();
           case 4:
             return new z73();
           case 5:
             return InAppMessageImpressionEvent.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = InAppMessageImpressionEvent.PARSER) == null) {
                _monitor_enter(InAppMessageImpressionEvent.class);
                if ((pARSER = InAppMessageImpressionEvent.PARSER) == null) {
                   pARSER = new ii2(InAppMessageImpressionEvent.DEFAULT_INSTANCE);
                   InAppMessageImpressionEvent.PARSER = pARSER;
                }
                _monitor_exit(InAppMessageImpressionEvent.class);
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

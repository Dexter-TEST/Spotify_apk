package com.spotify.messages.InAppMessageDiscardedEvent;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import p.x73;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.Byte;
import p.r74;

public final class InAppMessageDiscardedEvent extends c implements u74	// class@000a02 from classes.dex
{
    private int bitField0_;
    private String creativeId_;
    private String messageFormat_;
    private String reason_;
    private String triggerPattern_;
    private String triggerType_;
    private String uuid_;
    public static final int CREATIVE_ID_FIELD_NUMBER = 2;
    private static final InAppMessageDiscardedEvent DEFAULT_INSTANCE;
    public static final int MESSAGE_FORMAT_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int REASON_FIELD_NUMBER;
    public static final int TRIGGER_PATTERN_FIELD_NUMBER;
    public static final int TRIGGER_TYPE_FIELD_NUMBER;
    public static final int UUID_FIELD_NUMBER;

    static {
       InAppMessageDiscardedEvent inAppMessage = new InAppMessageDiscardedEvent();
       InAppMessageDiscardedEvent.DEFAULT_INSTANCE = inAppMessage;
       c.registerDefaultInstance(InAppMessageDiscardedEvent.class, inAppMessage);
    }
    private void InAppMessageDiscardedEvent(){
       super();
       this.reason_ = "";
       this.creativeId_ = "";
       this.uuid_ = "";
       this.messageFormat_ = "";
       this.triggerType_ = "";
       this.triggerPattern_ = "";
    }
    public static InAppMessageDiscardedEvent e(){
       return InAppMessageDiscardedEvent.DEFAULT_INSTANCE;
    }
    public static void f(InAppMessageDiscardedEvent p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x01;
       p0.reason_ = p1;
    }
    public static void g(InAppMessageDiscardedEvent p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x08;
       p0.messageFormat_ = p1;
    }
    public static void h(InAppMessageDiscardedEvent p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x10;
       p0.triggerType_ = p1;
    }
    public static void i(InAppMessageDiscardedEvent p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x20;
       p0.triggerPattern_ = p1;
    }
    public static void j(InAppMessageDiscardedEvent p0,String p1){
       p0.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x02;
       p0.creativeId_ = p1;
    }
    public static void k(InAppMessageDiscardedEvent p0,String p1){
       p0.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x04;
       p0.uuid_ = p1;
    }
    public static x73 l(){
       return InAppMessageDiscardedEvent.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return InAppMessageDiscardedEvent.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"bitField0_","reason_","creativeId_","uuid_","messageFormat_","triggerType_","triggerPattern_"};
             return c.newMessageInfo(InAppMessageDiscardedEvent.DEFAULT_INSTANCE, "\x01\x06\xff\x02\xff\x02\x01\x01\x06\x06\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x10\x02\xff\x02\xff\x02\x02\x10\x02\x01\x03\x10\x02\x02\x04\x10\x02\x03\x05\x10\x02\x04\x06\x10\x02\x05", objArray);
           case 3:
             return new InAppMessageDiscardedEvent();
           case 4:
             return new x73();
           case 5:
             return InAppMessageDiscardedEvent.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = InAppMessageDiscardedEvent.PARSER) == null) {
                _monitor_enter(InAppMessageDiscardedEvent.class);
                if ((pARSER = InAppMessageDiscardedEvent.PARSER) == null) {
                   pARSER = new ii2(InAppMessageDiscardedEvent.DEFAULT_INSTANCE);
                   InAppMessageDiscardedEvent.PARSER = pARSER;
                }
                _monitor_exit(InAppMessageDiscardedEvent.class);
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

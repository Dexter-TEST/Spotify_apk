package com.spotify.messages.InAppMessageDismissEvent;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import p.y73;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.Byte;
import p.r74;

public final class InAppMessageDismissEvent extends c implements u74	// class@000a03 from classes.dex
{
    private int bitField0_;
    private long clientTimestamp_;
    private String creativeId_;
    private String dismissType_;
    private String uuid_;
    public static final int CLIENT_TIMESTAMP_FIELD_NUMBER = 4;
    public static final int CREATIVE_ID_FIELD_NUMBER = 1;
    private static final InAppMessageDismissEvent DEFAULT_INSTANCE;
    public static final int DISMISS_TYPE_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int UUID_FIELD_NUMBER;

    static {
       InAppMessageDismissEvent inAppMessage = new InAppMessageDismissEvent();
       InAppMessageDismissEvent.DEFAULT_INSTANCE = inAppMessage;
       c.registerDefaultInstance(InAppMessageDismissEvent.class, inAppMessage);
    }
    private void InAppMessageDismissEvent(){
       super();
       this.creativeId_ = "";
       this.uuid_ = "";
       this.dismissType_ = "";
    }
    public static InAppMessageDismissEvent e(){
       return InAppMessageDismissEvent.DEFAULT_INSTANCE;
    }
    public static void f(InAppMessageDismissEvent p0,String p1){
       p0.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x01;
       p0.creativeId_ = p1;
    }
    public static void g(InAppMessageDismissEvent p0,long p1){
       p0.bitField0_ = p0.bitField0_ | 0x08;
       p0.clientTimestamp_ = p1;
    }
    public static void h(InAppMessageDismissEvent p0,String p1){
       p0.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x02;
       p0.uuid_ = p1;
    }
    public static void i(InAppMessageDismissEvent p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x04;
       p0.dismissType_ = p1;
    }
    public static y73 j(){
       return InAppMessageDismissEvent.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return InAppMessageDismissEvent.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"bitField0_","creativeId_","uuid_","dismissType_","clientTimestamp_"};
             return c.newMessageInfo(InAppMessageDismissEvent.DEFAULT_INSTANCE, "\x01\x04\xff\x02\xff\x02\x01\x01\x04\x04\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x10\x02\xff\x02\xff\x02\x02\x10\x02\x01\x03\x10\x02\x02\x04\x10\x02\x03", objArray);
           case 3:
             return new InAppMessageDismissEvent();
           case 4:
             return new y73();
           case 5:
             return InAppMessageDismissEvent.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = InAppMessageDismissEvent.PARSER) == null) {
                _monitor_enter(InAppMessageDismissEvent.class);
                if ((pARSER = InAppMessageDismissEvent.PARSER) == null) {
                   pARSER = new ii2(InAppMessageDismissEvent.DEFAULT_INSTANCE);
                   InAppMessageDismissEvent.PARSER = pARSER;
                }
                _monitor_exit(InAppMessageDismissEvent.class);
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

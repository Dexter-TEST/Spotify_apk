package com.spotify.messages.InAppMessageInteractionEvent;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import p.a83;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.Byte;
import p.r74;

public final class InAppMessageInteractionEvent extends c implements u74	// class@000a05 from classes.dex
{
    private String actionType_;
    private int bitField0_;
    private long clientTimestamp_;
    private String uuid_;
    public static final int ACTION_TYPE_FIELD_NUMBER = 1;
    public static final int CLIENT_TIMESTAMP_FIELD_NUMBER = 3;
    private static final InAppMessageInteractionEvent DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int UUID_FIELD_NUMBER;

    static {
       InAppMessageInteractionEvent inAppMessage = new InAppMessageInteractionEvent();
       InAppMessageInteractionEvent.DEFAULT_INSTANCE = inAppMessage;
       c.registerDefaultInstance(InAppMessageInteractionEvent.class, inAppMessage);
    }
    private void InAppMessageInteractionEvent(){
       super();
       this.actionType_ = "";
       this.uuid_ = "";
    }
    public static InAppMessageInteractionEvent e(){
       return InAppMessageInteractionEvent.DEFAULT_INSTANCE;
    }
    public static void f(InAppMessageInteractionEvent p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x01;
       p0.actionType_ = p1;
    }
    public static void g(InAppMessageInteractionEvent p0,String p1){
       p0.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x02;
       p0.uuid_ = p1;
    }
    public static a83 h(){
       return InAppMessageInteractionEvent.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return InAppMessageInteractionEvent.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"bitField0_","actionType_","uuid_","clientTimestamp_"};
             return c.newMessageInfo(InAppMessageInteractionEvent.DEFAULT_INSTANCE, "\x01\x03\xff\x02\xff\x02\x01\x01\x03\x03\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x10\x02\xff\x02\xff\x02\x02\x10\x02\x01\x03\x10\x02\x02", objArray);
           case 3:
             return new InAppMessageInteractionEvent();
           case 4:
             return new a83();
           case 5:
             return InAppMessageInteractionEvent.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = InAppMessageInteractionEvent.PARSER) == null) {
                _monitor_enter(InAppMessageInteractionEvent.class);
                if ((pARSER = InAppMessageInteractionEvent.PARSER) == null) {
                   pARSER = new ii2(InAppMessageInteractionEvent.DEFAULT_INSTANCE);
                   InAppMessageInteractionEvent.PARSER = pARSER;
                }
                _monitor_exit(InAppMessageInteractionEvent.class);
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

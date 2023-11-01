package com.spotify.messages.InAppMessageCreativeRequestEvent;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import p.w73;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.Byte;
import p.r74;

public final class InAppMessageCreativeRequestEvent extends c implements u74	// class@000a01 from classes.dex
{
    private int bitField0_;
    private String triggerPattern_;
    private String triggerType_;
    private String uuid_;
    private static final InAppMessageCreativeRequestEvent DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int TRIGGER_PATTERN_FIELD_NUMBER;
    public static final int TRIGGER_TYPE_FIELD_NUMBER;
    public static final int UUID_FIELD_NUMBER;

    static {
       InAppMessageCreativeRequestEvent inAppMessage = new InAppMessageCreativeRequestEvent();
       InAppMessageCreativeRequestEvent.DEFAULT_INSTANCE = inAppMessage;
       c.registerDefaultInstance(InAppMessageCreativeRequestEvent.class, inAppMessage);
    }
    private void InAppMessageCreativeRequestEvent(){
       super();
       this.triggerPattern_ = "";
       this.triggerType_ = "";
       this.uuid_ = "";
    }
    public static InAppMessageCreativeRequestEvent e(){
       return InAppMessageCreativeRequestEvent.DEFAULT_INSTANCE;
    }
    public static void f(InAppMessageCreativeRequestEvent p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x01;
       p0.triggerPattern_ = p1;
    }
    public static w73 g(){
       return InAppMessageCreativeRequestEvent.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return InAppMessageCreativeRequestEvent.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"bitField0_","triggerPattern_","triggerType_","uuid_"};
             return c.newMessageInfo(InAppMessageCreativeRequestEvent.DEFAULT_INSTANCE, "\x01\x03\xff\x02\xff\x02\x01\x01\x03\x03\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x10\x02\xff\x02\xff\x02\x02\x10\x02\x01\x03\x10\x02\x02", objArray);
           case 3:
             return new InAppMessageCreativeRequestEvent();
           case 4:
             return new w73();
           case 5:
             return InAppMessageCreativeRequestEvent.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = InAppMessageCreativeRequestEvent.PARSER) == null) {
                _monitor_enter(InAppMessageCreativeRequestEvent.class);
                if ((pARSER = InAppMessageCreativeRequestEvent.PARSER) == null) {
                   pARSER = new ii2(InAppMessageCreativeRequestEvent.DEFAULT_INSTANCE);
                   InAppMessageCreativeRequestEvent.PARSER = pARSER;
                }
                _monitor_exit(InAppMessageCreativeRequestEvent.class);
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

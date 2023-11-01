package com.spotify.messages.EventSenderInternalErrorNonAuth;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import p.av1;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.Byte;
import p.r74;

public final class EventSenderInternalErrorNonAuth extends c implements u74	// class@0009fe from classes.dex
{
    private int bitField0_;
    private int errorCode_;
    private String errorContext_;
    private String errorMessage_;
    private String errorType_;
    private static final EventSenderInternalErrorNonAuth DEFAULT_INSTANCE;
    public static final int ERROR_CODE_FIELD_NUMBER;
    public static final int ERROR_CONTEXT_FIELD_NUMBER;
    public static final int ERROR_MESSAGE_FIELD_NUMBER;
    public static final int ERROR_TYPE_FIELD_NUMBER;
    private static r75 PARSER;

    static {
       EventSenderInternalErrorNonAuth uEventSender = new EventSenderInternalErrorNonAuth();
       EventSenderInternalErrorNonAuth.DEFAULT_INSTANCE = uEventSender;
       c.registerDefaultInstance(EventSenderInternalErrorNonAuth.class, uEventSender);
    }
    private void EventSenderInternalErrorNonAuth(){
       super();
       this.errorMessage_ = "";
       this.errorType_ = "";
       this.errorContext_ = "";
    }
    public static EventSenderInternalErrorNonAuth e(){
       return EventSenderInternalErrorNonAuth.DEFAULT_INSTANCE;
    }
    public static void f(EventSenderInternalErrorNonAuth p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x01;
       p0.errorMessage_ = p1;
    }
    public static void g(EventSenderInternalErrorNonAuth p0){
       p0.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x02;
       p0.errorType_ = "TOO_MANY_CLONED_EVENTS";
    }
    public static void h(EventSenderInternalErrorNonAuth p0){
       p0.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x04;
       p0.errorContext_ = "ANDROID_EVENT_SENDER";
    }
    public static av1 i(){
       return EventSenderInternalErrorNonAuth.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return EventSenderInternalErrorNonAuth.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"bitField0_","errorMessage_","errorType_","errorContext_","errorCode_"};
             return c.newMessageInfo(EventSenderInternalErrorNonAuth.DEFAULT_INSTANCE, "\x01\x04\xff\x02\xff\x02\x01\x01\x04\x04\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x10\x02\xff\x02\xff\x02\x02\x10\x02\x01\x03\x10\x02\x02\x04\x10\x02\x03", objArray);
           case 3:
             return new EventSenderInternalErrorNonAuth();
           case 4:
             return new av1();
           case 5:
             return EventSenderInternalErrorNonAuth.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EventSenderInternalErrorNonAuth.PARSER) == null) {
                _monitor_enter(EventSenderInternalErrorNonAuth.class);
                if ((pARSER = EventSenderInternalErrorNonAuth.PARSER) == null) {
                   pARSER = new ii2(EventSenderInternalErrorNonAuth.DEFAULT_INSTANCE);
                   EventSenderInternalErrorNonAuth.PARSER = pARSER;
                }
                _monitor_exit(EventSenderInternalErrorNonAuth.class);
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

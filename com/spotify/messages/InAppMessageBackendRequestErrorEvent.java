package com.spotify.messages.InAppMessageBackendRequestErrorEvent;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import p.v73;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.Byte;
import p.r74;

public final class InAppMessageBackendRequestErrorEvent extends c implements u74	// class@000a00 from classes.dex
{
    private int bitField0_;
    private String description_;
    private String requestUri_;
    private int statusCode_;
    private String type_;
    private String uuid_;
    private static final InAppMessageBackendRequestErrorEvent DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int REQUEST_URI_FIELD_NUMBER;
    public static final int STATUS_CODE_FIELD_NUMBER;
    public static final int TYPE_FIELD_NUMBER;
    public static final int UUID_FIELD_NUMBER;

    static {
       InAppMessageBackendRequestErrorEvent inAppMessage = new InAppMessageBackendRequestErrorEvent();
       InAppMessageBackendRequestErrorEvent.DEFAULT_INSTANCE = inAppMessage;
       c.registerDefaultInstance(InAppMessageBackendRequestErrorEvent.class, inAppMessage);
    }
    private void InAppMessageBackendRequestErrorEvent(){
       super();
       this.requestUri_ = "";
       this.description_ = "";
       this.type_ = "";
       this.uuid_ = "";
    }
    public static InAppMessageBackendRequestErrorEvent e(){
       return InAppMessageBackendRequestErrorEvent.DEFAULT_INSTANCE;
    }
    public static void f(InAppMessageBackendRequestErrorEvent p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x01;
       p0.requestUri_ = p1;
    }
    public static void g(InAppMessageBackendRequestErrorEvent p0,int p1){
       p0.bitField0_ = p0.bitField0_ | 0x02;
       p0.statusCode_ = p1;
    }
    public static void h(InAppMessageBackendRequestErrorEvent p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x04;
       p0.description_ = p1;
    }
    public static void i(InAppMessageBackendRequestErrorEvent p0,String p1){
       p0.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x08;
       p0.type_ = p1;
    }
    public static v73 j(){
       return InAppMessageBackendRequestErrorEvent.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return InAppMessageBackendRequestErrorEvent.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[]{"bitField0_","requestUri_","statusCode_","description_","type_","uuid_"};
             return c.newMessageInfo(InAppMessageBackendRequestErrorEvent.DEFAULT_INSTANCE, "\x01\x05\xff\x02\xff\x02\x01\x01\x05\x05\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x10\x02\xff\x02\xff\x02\x02\x10\x02\x01\x03\x10\x02\x02\x04\x10\x02\x03\x05\x10\x02\x04", objArray);
           case 3:
             return new InAppMessageBackendRequestErrorEvent();
           case 4:
             return new v73();
           case 5:
             return InAppMessageBackendRequestErrorEvent.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = InAppMessageBackendRequestErrorEvent.PARSER) == null) {
                _monitor_enter(InAppMessageBackendRequestErrorEvent.class);
                if ((pARSER = InAppMessageBackendRequestErrorEvent.PARSER) == null) {
                   pARSER = new ii2(InAppMessageBackendRequestErrorEvent.DEFAULT_INSTANCE);
                   InAppMessageBackendRequestErrorEvent.PARSER = pARSER;
                }
                _monitor_exit(InAppMessageBackendRequestErrorEvent.class);
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

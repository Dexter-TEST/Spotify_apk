package com.spotify.messages.BootstrapRequestNonAuth;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import p.g14;
import java.lang.String;
import java.lang.Object;
import p.x40;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.y40;
import p.s74;
import java.lang.Byte;
import p.r74;

public final class BootstrapRequestNonAuth extends c implements u74	// class@0009f7 from classes.dex
{
    private int bitField0_;
    private String errorMessage_;
    private String errorReason_;
    private String fetchedReason_;
    private g14 identifiers_;
    private String installationId_;
    private long latency_;
    private long payloadSize_;
    private String responsePayload_;
    private int statusCode_;
    private static final BootstrapRequestNonAuth DEFAULT_INSTANCE;
    public static final int ERROR_MESSAGE_FIELD_NUMBER;
    public static final int ERROR_REASON_FIELD_NUMBER;
    public static final int FETCHED_REASON_FIELD_NUMBER;
    public static final int IDENTIFIERS_FIELD_NUMBER;
    public static final int INSTALLATION_ID_FIELD_NUMBER;
    public static final int LATENCY_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int PAYLOAD_SIZE_FIELD_NUMBER;
    public static final int RESPONSE_PAYLOAD_FIELD_NUMBER;
    public static final int STATUS_CODE_FIELD_NUMBER;

    static {
       BootstrapRequestNonAuth uBootstrapRe = new BootstrapRequestNonAuth();
       BootstrapRequestNonAuth.DEFAULT_INSTANCE = uBootstrapRe;
       c.registerDefaultInstance(BootstrapRequestNonAuth.class, uBootstrapRe);
    }
    private void BootstrapRequestNonAuth(){
       super();
       this.identifiers_ = g14.b;
       this.errorReason_ = "";
       this.errorMessage_ = "";
       this.installationId_ = "";
       this.responsePayload_ = "";
       this.fetchedReason_ = "";
    }
    public static BootstrapRequestNonAuth e(){
       return BootstrapRequestNonAuth.DEFAULT_INSTANCE;
    }
    public static void f(BootstrapRequestNonAuth p0,long p1){
       p0.bitField0_ = p0.bitField0_ | 0x01;
       p0.latency_ = p1;
    }
    public static void g(BootstrapRequestNonAuth p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x10;
       p0.errorMessage_ = p1;
    }
    public static void h(BootstrapRequestNonAuth p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x40;
       p0.responsePayload_ = p1;
    }
    public static void i(BootstrapRequestNonAuth p0,String p1){
       p0.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x0080;
       p0.fetchedReason_ = p1;
    }
    public static g14 j(BootstrapRequestNonAuth p0){
       BootstrapRequestNonAuth identifiers_ = p0.identifiers_;
       if (identifiers_.a == null) {
          p0.identifiers_ = identifiers_.d();
       }
       return p0.identifiers_;
    }
    public static void k(BootstrapRequestNonAuth p0,long p1){
       p0.bitField0_ = p0.bitField0_ | 0x02;
       p0.payloadSize_ = p1;
    }
    public static void l(BootstrapRequestNonAuth p0,int p1){
       p0.bitField0_ = p0.bitField0_ | 0x04;
       p0.statusCode_ = p1;
    }
    public static void m(BootstrapRequestNonAuth p0,String p1){
       p0.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x08;
       p0.errorReason_ = p1;
    }
    public static x40 n(){
       return BootstrapRequestNonAuth.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return BootstrapRequestNonAuth.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[11];
             objArray[0] = "bitField0_";
             objArray[b] = "latency_";
             objArray[2] = "payloadSize_";
             objArray[3] = "statusCode_";
             objArray[4] = "errorReason_";
             objArray[5] = "errorMessage_";
             objArray[6] = "installationId_";
             objArray[7] = "responsePayload_";
             objArray[8] = "fetchedReason_";
             objArray[9] = "identifiers_";
             objArray[10] = y40.a;
             return c.newMessageInfo(BootstrapRequestNonAuth.DEFAULT_INSTANCE, "\x01\t\xff\x02\xff\x02\x01\x01\t\t\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x10\x02\xff\x02\xff\x02\x02\x10\x02\x01\x03\x10\x02\x02\x04\x10\x02\x03\x05\x10\x02\x04\x06\x10\x02\x05\x07\x10\x02\x06\b\x10\x02\x07\t2", objArray);
           case 3:
             return new BootstrapRequestNonAuth();
           case 4:
             return new x40();
           case 5:
             return BootstrapRequestNonAuth.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = BootstrapRequestNonAuth.PARSER) == null) {
                _monitor_enter(BootstrapRequestNonAuth.class);
                if ((pARSER = BootstrapRequestNonAuth.PARSER) == null) {
                   pARSER = new ii2(BootstrapRequestNonAuth.DEFAULT_INSTANCE);
                   BootstrapRequestNonAuth.PARSER = pARSER;
                }
                _monitor_exit(BootstrapRequestNonAuth.class);
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

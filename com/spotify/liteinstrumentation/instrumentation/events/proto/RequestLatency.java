package com.spotify.liteinstrumentation.instrumentation.events.proto.RequestLatency;
import p.u74;
import com.google.protobuf.c;
import java.lang.Class;
import java.lang.String;
import java.lang.Object;
import p.nv5;
import com.google.protobuf.b;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.Byte;
import p.r74;

public final class RequestLatency extends c implements u74	// class@000934 from classes.dex
{
    private int bitField0_;
    private boolean error_;
    private int latencyFirstByte_;
    private int latencyLastByte_;
    private String protocol_;
    private float samplingProbability_;
    private int sizeReceived_;
    private int sizeSent_;
    private String url_;
    private String verb_;
    private static final RequestLatency DEFAULT_INSTANCE;
    public static final int ERROR_FIELD_NUMBER;
    public static final int LATENCY_FIRST_BYTE_FIELD_NUMBER;
    public static final int LATENCY_LAST_BYTE_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int PROTOCOL_FIELD_NUMBER;
    public static final int SAMPLING_PROBABILITY_FIELD_NUMBER;
    public static final int SIZE_RECEIVED_FIELD_NUMBER;
    public static final int SIZE_SENT_FIELD_NUMBER;
    public static final int URL_FIELD_NUMBER;
    public static final int VERB_FIELD_NUMBER;

    static {
       RequestLatency requestLaten = new RequestLatency();
       RequestLatency.DEFAULT_INSTANCE = requestLaten;
       c.registerDefaultInstance(RequestLatency.class, requestLaten);
    }
    private void RequestLatency(){
       super();
       this.url_ = "";
       this.verb_ = "";
       this.protocol_ = "";
    }
    public static RequestLatency e(){
       return RequestLatency.DEFAULT_INSTANCE;
    }
    public static void f(RequestLatency p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x01;
       p0.url_ = p1;
    }
    public static void g(RequestLatency p0,boolean p1){
       p0.bitField0_ = p0.bitField0_ | 0x08;
       p0.error_ = p1;
    }
    public static void h(RequestLatency p0,int p1){
       p0.bitField0_ = p0.bitField0_ | 0x10;
       p0.latencyFirstByte_ = p1;
    }
    public static void i(RequestLatency p0,int p1){
       p0.bitField0_ = p0.bitField0_ | 0x20;
       p0.latencyLastByte_ = p1;
    }
    public static void j(RequestLatency p0,int p1){
       p0.bitField0_ = p0.bitField0_ | 0x40;
       p0.sizeReceived_ = p1;
    }
    public static void k(RequestLatency p0,int p1){
       p0.bitField0_ = p0.bitField0_ | 0x0080;
       p0.sizeSent_ = p1;
    }
    public static void l(RequestLatency p0,float p1){
       p0.bitField0_ = p0.bitField0_ | 0x0100;
       p0.samplingProbability_ = p1;
    }
    public static void m(RequestLatency p0,String p1){
       p0.getClass();
       p1.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x02;
       p0.verb_ = p1;
    }
    public static void n(RequestLatency p0,String p1){
       p0.getClass();
       p0.bitField0_ = p0.bitField0_ | 0x04;
       p0.protocol_ = p1;
    }
    public static nv5 o(){
       return RequestLatency.DEFAULT_INSTANCE.createBuilder();
    }
    public static r75 parser(){
       return RequestLatency.DEFAULT_INSTANCE.getParserForType();
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
             Object[] objArray = new Object[10];
             objArray[0] = "bitField0_";
             objArray[b] = "url_";
             objArray[2] = "verb_";
             objArray[3] = "protocol_";
             objArray[4] = "error_";
             objArray[5] = "latencyFirstByte_";
             objArray[6] = "latencyLastByte_";
             objArray[7] = "sizeReceived_";
             objArray[8] = "sizeSent_";
             objArray[9] = "samplingProbability_";
             return c.newMessageInfo(RequestLatency.DEFAULT_INSTANCE, "\x01\t\xff\x02\xff\x02\x01\x01\t\t\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x10\x02\xff\x02\xff\x02\x02\x10\x02\x01\x03\x10\x02\x02\x04\x10\x02\x03\x05\x10\x02\x04\x06\x10\x02\x05\x07\x10\x02\x06\b\x10\x02\x07\t\x10\x02\b", objArray);
           case 3:
             return new RequestLatency();
           case 4:
             return new nv5();
           case 5:
             return RequestLatency.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = RequestLatency.PARSER) == null) {
                _monitor_enter(RequestLatency.class);
                if ((pARSER = RequestLatency.PARSER) == null) {
                   pARSER = new ii2(RequestLatency.DEFAULT_INSTANCE);
                   RequestLatency.PARSER = pARSER;
                }
                _monitor_exit(RequestLatency.class);
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

package com.spotify.connectivity.product_state.esperanto.proto.PutValuesResponse;
import com.spotify.connectivity.product_state.esperanto.proto.PutValuesResponseOrBuilder;
import com.google.protobuf.c;
import java.lang.Class;
import com.spotify.connectivity.product_state.esperanto.proto.PutValuesResponse$Builder;
import com.google.protobuf.b;
import java.io.InputStream;
import p.yx1;
import java.nio.ByteBuffer;
import p.i80;
import p.sh0;
import p.r75;
import p.li2;
import java.lang.Object;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.String;
import java.lang.Byte;

public final class PutValuesResponse extends c implements PutValuesResponseOrBuilder	// class@0007cd from classes.dex
{
    private static final PutValuesResponse DEFAULT_INSTANCE;
    private static r75 PARSER;

    static {
       PutValuesResponse putValuesRes = new PutValuesResponse();
       PutValuesResponse.DEFAULT_INSTANCE = putValuesRes;
       c.registerDefaultInstance(PutValuesResponse.class, putValuesRes);
    }
    private void PutValuesResponse(){
       super();
    }
    public static PutValuesResponse e(){
       return PutValuesResponse.DEFAULT_INSTANCE;
    }
    public static PutValuesResponse getDefaultInstance(){
       return PutValuesResponse.DEFAULT_INSTANCE;
    }
    public static PutValuesResponse$Builder newBuilder(){
       return PutValuesResponse.DEFAULT_INSTANCE.createBuilder();
    }
    public static PutValuesResponse$Builder newBuilder(PutValuesResponse p0){
       return PutValuesResponse.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static PutValuesResponse parseDelimitedFrom(InputStream p0){
       return c.parseDelimitedFrom(PutValuesResponse.DEFAULT_INSTANCE, p0);
    }
    public static PutValuesResponse parseDelimitedFrom(InputStream p0,yx1 p1){
       return c.parseDelimitedFrom(PutValuesResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static PutValuesResponse parseFrom(InputStream p0){
       return c.parseFrom(PutValuesResponse.DEFAULT_INSTANCE, p0);
    }
    public static PutValuesResponse parseFrom(InputStream p0,yx1 p1){
       return c.parseFrom(PutValuesResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static PutValuesResponse parseFrom(ByteBuffer p0){
       return c.parseFrom(PutValuesResponse.DEFAULT_INSTANCE, p0);
    }
    public static PutValuesResponse parseFrom(ByteBuffer p0,yx1 p1){
       return c.parseFrom(PutValuesResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static PutValuesResponse parseFrom(i80 p0){
       return c.parseFrom(PutValuesResponse.DEFAULT_INSTANCE, p0);
    }
    public static PutValuesResponse parseFrom(i80 p0,yx1 p1){
       return c.parseFrom(PutValuesResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static PutValuesResponse parseFrom(sh0 p0){
       return c.parseFrom(PutValuesResponse.DEFAULT_INSTANCE, p0);
    }
    public static PutValuesResponse parseFrom(sh0 p0,yx1 p1){
       return c.parseFrom(PutValuesResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static PutValuesResponse parseFrom(byte[] p0){
       return c.parseFrom(PutValuesResponse.DEFAULT_INSTANCE, p0);
    }
    public static PutValuesResponse parseFrom(byte[] p0,yx1 p1){
       return c.parseFrom(PutValuesResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static r75 parser(){
       return PutValuesResponse.DEFAULT_INSTANCE.getParserForType();
    }
    public final Object dynamicMethod(li2 p0,Object p1,Object p2){
       r75 pARSER;
       p1 = null;
       switch (p0.ordinal()){
           case 0:
             return Byte.valueOf(1);
           case 1:
             return p1;
           case 2:
             return c.newMessageInfo(PutValuesResponse.DEFAULT_INSTANCE, "\xff\x02\xff\x02\xff\x02\xff\x02", p1);
           case 3:
             return new PutValuesResponse();
           case 4:
             return new PutValuesResponse$Builder(0);
           case 5:
             return PutValuesResponse.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = PutValuesResponse.PARSER) == null) {
                _monitor_enter(PutValuesResponse.class);
                if ((pARSER = PutValuesResponse.PARSER) == null) {
                   pARSER = new ii2(PutValuesResponse.DEFAULT_INSTANCE);
                   PutValuesResponse.PARSER = pARSER;
                }
                _monitor_exit(PutValuesResponse.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
}

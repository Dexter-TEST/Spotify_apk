package com.spotify.connectivity.product_state.esperanto.proto.PutOverridesValuesResponse;
import com.spotify.connectivity.product_state.esperanto.proto.PutOverridesValuesResponseOrBuilder;
import com.google.protobuf.c;
import java.lang.Class;
import com.spotify.connectivity.product_state.esperanto.proto.PutOverridesValuesResponse$Builder;
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

public final class PutOverridesValuesResponse extends c implements PutOverridesValuesResponseOrBuilder	// class@0007c4 from classes.dex
{
    private static final PutOverridesValuesResponse DEFAULT_INSTANCE;
    private static r75 PARSER;

    static {
       PutOverridesValuesResponse putOverrides = new PutOverridesValuesResponse();
       PutOverridesValuesResponse.DEFAULT_INSTANCE = putOverrides;
       c.registerDefaultInstance(PutOverridesValuesResponse.class, putOverrides);
    }
    private void PutOverridesValuesResponse(){
       super();
    }
    public static PutOverridesValuesResponse e(){
       return PutOverridesValuesResponse.DEFAULT_INSTANCE;
    }
    public static PutOverridesValuesResponse getDefaultInstance(){
       return PutOverridesValuesResponse.DEFAULT_INSTANCE;
    }
    public static PutOverridesValuesResponse$Builder newBuilder(){
       return PutOverridesValuesResponse.DEFAULT_INSTANCE.createBuilder();
    }
    public static PutOverridesValuesResponse$Builder newBuilder(PutOverridesValuesResponse p0){
       return PutOverridesValuesResponse.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static PutOverridesValuesResponse parseDelimitedFrom(InputStream p0){
       return c.parseDelimitedFrom(PutOverridesValuesResponse.DEFAULT_INSTANCE, p0);
    }
    public static PutOverridesValuesResponse parseDelimitedFrom(InputStream p0,yx1 p1){
       return c.parseDelimitedFrom(PutOverridesValuesResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static PutOverridesValuesResponse parseFrom(InputStream p0){
       return c.parseFrom(PutOverridesValuesResponse.DEFAULT_INSTANCE, p0);
    }
    public static PutOverridesValuesResponse parseFrom(InputStream p0,yx1 p1){
       return c.parseFrom(PutOverridesValuesResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static PutOverridesValuesResponse parseFrom(ByteBuffer p0){
       return c.parseFrom(PutOverridesValuesResponse.DEFAULT_INSTANCE, p0);
    }
    public static PutOverridesValuesResponse parseFrom(ByteBuffer p0,yx1 p1){
       return c.parseFrom(PutOverridesValuesResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static PutOverridesValuesResponse parseFrom(i80 p0){
       return c.parseFrom(PutOverridesValuesResponse.DEFAULT_INSTANCE, p0);
    }
    public static PutOverridesValuesResponse parseFrom(i80 p0,yx1 p1){
       return c.parseFrom(PutOverridesValuesResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static PutOverridesValuesResponse parseFrom(sh0 p0){
       return c.parseFrom(PutOverridesValuesResponse.DEFAULT_INSTANCE, p0);
    }
    public static PutOverridesValuesResponse parseFrom(sh0 p0,yx1 p1){
       return c.parseFrom(PutOverridesValuesResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static PutOverridesValuesResponse parseFrom(byte[] p0){
       return c.parseFrom(PutOverridesValuesResponse.DEFAULT_INSTANCE, p0);
    }
    public static PutOverridesValuesResponse parseFrom(byte[] p0,yx1 p1){
       return c.parseFrom(PutOverridesValuesResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static r75 parser(){
       return PutOverridesValuesResponse.DEFAULT_INSTANCE.getParserForType();
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
             return c.newMessageInfo(PutOverridesValuesResponse.DEFAULT_INSTANCE, "\xff\x02\xff\x02\xff\x02\xff\x02", p1);
           case 3:
             return new PutOverridesValuesResponse();
           case 4:
             return new PutOverridesValuesResponse$Builder(0);
           case 5:
             return PutOverridesValuesResponse.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = PutOverridesValuesResponse.PARSER) == null) {
                _monitor_enter(PutOverridesValuesResponse.class);
                if ((pARSER = PutOverridesValuesResponse.PARSER) == null) {
                   pARSER = new ii2(PutOverridesValuesResponse.DEFAULT_INSTANCE);
                   PutOverridesValuesResponse.PARSER = pARSER;
                }
                _monitor_exit(PutOverridesValuesResponse.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
}

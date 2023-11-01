package com.spotify.connectivity.product_state.esperanto.proto.DelOverridesValuesResponse;
import com.spotify.connectivity.product_state.esperanto.proto.DelOverridesValuesResponseOrBuilder;
import com.google.protobuf.c;
import java.lang.Class;
import com.spotify.connectivity.product_state.esperanto.proto.DelOverridesValuesResponse$Builder;
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

public final class DelOverridesValuesResponse extends c implements DelOverridesValuesResponseOrBuilder	// class@0007aa from classes.dex
{
    private static final DelOverridesValuesResponse DEFAULT_INSTANCE;
    private static r75 PARSER;

    static {
       DelOverridesValuesResponse uDelOverride = new DelOverridesValuesResponse();
       DelOverridesValuesResponse.DEFAULT_INSTANCE = uDelOverride;
       c.registerDefaultInstance(DelOverridesValuesResponse.class, uDelOverride);
    }
    private void DelOverridesValuesResponse(){
       super();
    }
    public static DelOverridesValuesResponse e(){
       return DelOverridesValuesResponse.DEFAULT_INSTANCE;
    }
    public static DelOverridesValuesResponse getDefaultInstance(){
       return DelOverridesValuesResponse.DEFAULT_INSTANCE;
    }
    public static DelOverridesValuesResponse$Builder newBuilder(){
       return DelOverridesValuesResponse.DEFAULT_INSTANCE.createBuilder();
    }
    public static DelOverridesValuesResponse$Builder newBuilder(DelOverridesValuesResponse p0){
       return DelOverridesValuesResponse.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static DelOverridesValuesResponse parseDelimitedFrom(InputStream p0){
       return c.parseDelimitedFrom(DelOverridesValuesResponse.DEFAULT_INSTANCE, p0);
    }
    public static DelOverridesValuesResponse parseDelimitedFrom(InputStream p0,yx1 p1){
       return c.parseDelimitedFrom(DelOverridesValuesResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static DelOverridesValuesResponse parseFrom(InputStream p0){
       return c.parseFrom(DelOverridesValuesResponse.DEFAULT_INSTANCE, p0);
    }
    public static DelOverridesValuesResponse parseFrom(InputStream p0,yx1 p1){
       return c.parseFrom(DelOverridesValuesResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static DelOverridesValuesResponse parseFrom(ByteBuffer p0){
       return c.parseFrom(DelOverridesValuesResponse.DEFAULT_INSTANCE, p0);
    }
    public static DelOverridesValuesResponse parseFrom(ByteBuffer p0,yx1 p1){
       return c.parseFrom(DelOverridesValuesResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static DelOverridesValuesResponse parseFrom(i80 p0){
       return c.parseFrom(DelOverridesValuesResponse.DEFAULT_INSTANCE, p0);
    }
    public static DelOverridesValuesResponse parseFrom(i80 p0,yx1 p1){
       return c.parseFrom(DelOverridesValuesResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static DelOverridesValuesResponse parseFrom(sh0 p0){
       return c.parseFrom(DelOverridesValuesResponse.DEFAULT_INSTANCE, p0);
    }
    public static DelOverridesValuesResponse parseFrom(sh0 p0,yx1 p1){
       return c.parseFrom(DelOverridesValuesResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static DelOverridesValuesResponse parseFrom(byte[] p0){
       return c.parseFrom(DelOverridesValuesResponse.DEFAULT_INSTANCE, p0);
    }
    public static DelOverridesValuesResponse parseFrom(byte[] p0,yx1 p1){
       return c.parseFrom(DelOverridesValuesResponse.DEFAULT_INSTANCE, p0, p1);
    }
    public static r75 parser(){
       return DelOverridesValuesResponse.DEFAULT_INSTANCE.getParserForType();
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
             return c.newMessageInfo(DelOverridesValuesResponse.DEFAULT_INSTANCE, "\xff\x02\xff\x02\xff\x02\xff\x02", p1);
           case 3:
             return new DelOverridesValuesResponse();
           case 4:
             return new DelOverridesValuesResponse$Builder(0);
           case 5:
             return DelOverridesValuesResponse.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = DelOverridesValuesResponse.PARSER) == null) {
                _monitor_enter(DelOverridesValuesResponse.class);
                if ((pARSER = DelOverridesValuesResponse.PARSER) == null) {
                   pARSER = new ii2(DelOverridesValuesResponse.DEFAULT_INSTANCE);
                   DelOverridesValuesResponse.PARSER = pARSER;
                }
                _monitor_exit(DelOverridesValuesResponse.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
}

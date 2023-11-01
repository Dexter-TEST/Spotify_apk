package com.spotify.connectivity.auth.esperanto.proto.EsSession$ProductStateMap;
import com.spotify.connectivity.auth.esperanto.proto.EsSession$ProductStateMapOrBuilder;
import com.google.protobuf.c;
import java.lang.Class;
import p.g14;
import java.util.Map;
import com.spotify.connectivity.auth.esperanto.proto.EsSession$ProductStateMap$Builder;
import com.google.protobuf.b;
import java.io.InputStream;
import p.yx1;
import java.nio.ByteBuffer;
import p.i80;
import p.sh0;
import p.r75;
import java.lang.String;
import java.lang.Object;
import java.util.AbstractMap;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import com.spotify.connectivity.auth.esperanto.proto.EsSession$ProductStateMap$ProductStateMapDefaultEntryHolder;
import p.s74;
import java.lang.Byte;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.lang.IllegalArgumentException;

public final class EsSession$ProductStateMap extends c implements EsSession$ProductStateMapOrBuilder	// class@00062a from classes.dex
{
    private g14 productStateMap_;
    private static final EsSession$ProductStateMap DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int PRODUCT_STATE_MAP_FIELD_NUMBER;

    static {
       EsSession$ProductStateMap productState = new EsSession$ProductStateMap();
       EsSession$ProductStateMap.DEFAULT_INSTANCE = productState;
       c.registerDefaultInstance(EsSession$ProductStateMap.class, productState);
    }
    private void EsSession$ProductStateMap(){
       super();
       this.productStateMap_ = g14.b;
    }
    public static Map e(EsSession$ProductStateMap p0){
       return p0.getMutableProductStateMapMap();
    }
    public static EsSession$ProductStateMap f(){
       return EsSession$ProductStateMap.DEFAULT_INSTANCE;
    }
    public static EsSession$ProductStateMap getDefaultInstance(){
       return EsSession$ProductStateMap.DEFAULT_INSTANCE;
    }
    private Map getMutableProductStateMapMap(){
       return this.internalGetMutableProductStateMap();
    }
    private g14 internalGetMutableProductStateMap(){
       EsSession$ProductStateMap tproductStat = this.productStateMap_;
       if (tproductStat.a == null) {
          this.productStateMap_ = tproductStat.d();
       }
       return this.productStateMap_;
    }
    private g14 internalGetProductStateMap(){
       return this.productStateMap_;
    }
    public static EsSession$ProductStateMap$Builder newBuilder(){
       return EsSession$ProductStateMap.DEFAULT_INSTANCE.createBuilder();
    }
    public static EsSession$ProductStateMap$Builder newBuilder(EsSession$ProductStateMap p0){
       return EsSession$ProductStateMap.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static EsSession$ProductStateMap parseDelimitedFrom(InputStream p0){
       return c.parseDelimitedFrom(EsSession$ProductStateMap.DEFAULT_INSTANCE, p0);
    }
    public static EsSession$ProductStateMap parseDelimitedFrom(InputStream p0,yx1 p1){
       return c.parseDelimitedFrom(EsSession$ProductStateMap.DEFAULT_INSTANCE, p0, p1);
    }
    public static EsSession$ProductStateMap parseFrom(InputStream p0){
       return c.parseFrom(EsSession$ProductStateMap.DEFAULT_INSTANCE, p0);
    }
    public static EsSession$ProductStateMap parseFrom(InputStream p0,yx1 p1){
       return c.parseFrom(EsSession$ProductStateMap.DEFAULT_INSTANCE, p0, p1);
    }
    public static EsSession$ProductStateMap parseFrom(ByteBuffer p0){
       return c.parseFrom(EsSession$ProductStateMap.DEFAULT_INSTANCE, p0);
    }
    public static EsSession$ProductStateMap parseFrom(ByteBuffer p0,yx1 p1){
       return c.parseFrom(EsSession$ProductStateMap.DEFAULT_INSTANCE, p0, p1);
    }
    public static EsSession$ProductStateMap parseFrom(i80 p0){
       return c.parseFrom(EsSession$ProductStateMap.DEFAULT_INSTANCE, p0);
    }
    public static EsSession$ProductStateMap parseFrom(i80 p0,yx1 p1){
       return c.parseFrom(EsSession$ProductStateMap.DEFAULT_INSTANCE, p0, p1);
    }
    public static EsSession$ProductStateMap parseFrom(sh0 p0){
       return c.parseFrom(EsSession$ProductStateMap.DEFAULT_INSTANCE, p0);
    }
    public static EsSession$ProductStateMap parseFrom(sh0 p0,yx1 p1){
       return c.parseFrom(EsSession$ProductStateMap.DEFAULT_INSTANCE, p0, p1);
    }
    public static EsSession$ProductStateMap parseFrom(byte[] p0){
       return c.parseFrom(EsSession$ProductStateMap.DEFAULT_INSTANCE, p0);
    }
    public static EsSession$ProductStateMap parseFrom(byte[] p0,yx1 p1){
       return c.parseFrom(EsSession$ProductStateMap.DEFAULT_INSTANCE, p0, p1);
    }
    public static r75 parser(){
       return EsSession$ProductStateMap.DEFAULT_INSTANCE.getParserForType();
    }
    public boolean containsProductStateMap(String p0){
       p0.getClass();
       return this.internalGetProductStateMap().containsKey(p0);
    }
    public final Object dynamicMethod(li2 p0,Object p1,Object p2){
       r75 pARSER;
       int i = 0;
       byte b = 1;
       switch (p0.ordinal()){
           case 0:
             return Byte.valueOf(b);
           case 1:
             return null;
           case 2:
             Object[] objArray = new Object[]{"productStateMap_",EsSession$ProductStateMap$ProductStateMapDefaultEntryHolder.defaultEntry};
             return c.newMessageInfo(EsSession$ProductStateMap.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\x012", objArray);
           case 3:
             return new EsSession$ProductStateMap();
           case 4:
             return new EsSession$ProductStateMap$Builder(i);
           case 5:
             return EsSession$ProductStateMap.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EsSession$ProductStateMap.PARSER) == null) {
                _monitor_enter(EsSession$ProductStateMap.class);
                if ((pARSER = EsSession$ProductStateMap.PARSER) == null) {
                   pARSER = new ii2(EsSession$ProductStateMap.DEFAULT_INSTANCE);
                   EsSession$ProductStateMap.PARSER = pARSER;
                }
                _monitor_exit(EsSession$ProductStateMap.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public Map getProductStateMap(){
       return this.getProductStateMapMap();
    }
    public int getProductStateMapCount(){
       return this.internalGetProductStateMap().size();
    }
    public Map getProductStateMapMap(){
       return Collections.unmodifiableMap(this.internalGetProductStateMap());
    }
    public String getProductStateMapOrDefault(String p0,String p1){
       p0.getClass();
       g14 og14 = this.internalGetProductStateMap();
       if (og14.containsKey(p0)) {
          p1 = og14.get(p0);
       }
       return p1;
    }
    public String getProductStateMapOrThrow(String p0){
       p0.getClass();
       g14 og14 = this.internalGetProductStateMap();
       if (og14.containsKey(p0)) {
          return og14.get(p0);
       }
       throw new IllegalArgumentException();
    }
}

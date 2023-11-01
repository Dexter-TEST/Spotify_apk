package com.spotify.connectivity.product_state.esperanto.proto.PutOverridesValuesRequest;
import com.spotify.connectivity.product_state.esperanto.proto.PutOverridesValuesRequestOrBuilder;
import com.google.protobuf.c;
import java.lang.Class;
import p.g14;
import java.util.Map;
import com.spotify.connectivity.product_state.esperanto.proto.PutOverridesValuesRequest$Builder;
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
import com.spotify.connectivity.product_state.esperanto.proto.PutOverridesValuesRequest$PairsDefaultEntryHolder;
import p.s74;
import java.lang.Byte;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.lang.IllegalArgumentException;

public final class PutOverridesValuesRequest extends c implements PutOverridesValuesRequestOrBuilder	// class@0007c0 from classes.dex
{
    private g14 pairs_;
    private static final PutOverridesValuesRequest DEFAULT_INSTANCE;
    public static final int PAIRS_FIELD_NUMBER;
    private static r75 PARSER;

    static {
       PutOverridesValuesRequest putOverrides = new PutOverridesValuesRequest();
       PutOverridesValuesRequest.DEFAULT_INSTANCE = putOverrides;
       c.registerDefaultInstance(PutOverridesValuesRequest.class, putOverrides);
    }
    private void PutOverridesValuesRequest(){
       super();
       this.pairs_ = g14.b;
    }
    public static Map e(PutOverridesValuesRequest p0){
       return p0.getMutablePairsMap();
    }
    public static PutOverridesValuesRequest f(){
       return PutOverridesValuesRequest.DEFAULT_INSTANCE;
    }
    public static PutOverridesValuesRequest getDefaultInstance(){
       return PutOverridesValuesRequest.DEFAULT_INSTANCE;
    }
    private Map getMutablePairsMap(){
       return this.internalGetMutablePairs();
    }
    private g14 internalGetMutablePairs(){
       PutOverridesValuesRequest tpairs_ = this.pairs_;
       if (tpairs_.a == null) {
          this.pairs_ = tpairs_.d();
       }
       return this.pairs_;
    }
    private g14 internalGetPairs(){
       return this.pairs_;
    }
    public static PutOverridesValuesRequest$Builder newBuilder(){
       return PutOverridesValuesRequest.DEFAULT_INSTANCE.createBuilder();
    }
    public static PutOverridesValuesRequest$Builder newBuilder(PutOverridesValuesRequest p0){
       return PutOverridesValuesRequest.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static PutOverridesValuesRequest parseDelimitedFrom(InputStream p0){
       return c.parseDelimitedFrom(PutOverridesValuesRequest.DEFAULT_INSTANCE, p0);
    }
    public static PutOverridesValuesRequest parseDelimitedFrom(InputStream p0,yx1 p1){
       return c.parseDelimitedFrom(PutOverridesValuesRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static PutOverridesValuesRequest parseFrom(InputStream p0){
       return c.parseFrom(PutOverridesValuesRequest.DEFAULT_INSTANCE, p0);
    }
    public static PutOverridesValuesRequest parseFrom(InputStream p0,yx1 p1){
       return c.parseFrom(PutOverridesValuesRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static PutOverridesValuesRequest parseFrom(ByteBuffer p0){
       return c.parseFrom(PutOverridesValuesRequest.DEFAULT_INSTANCE, p0);
    }
    public static PutOverridesValuesRequest parseFrom(ByteBuffer p0,yx1 p1){
       return c.parseFrom(PutOverridesValuesRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static PutOverridesValuesRequest parseFrom(i80 p0){
       return c.parseFrom(PutOverridesValuesRequest.DEFAULT_INSTANCE, p0);
    }
    public static PutOverridesValuesRequest parseFrom(i80 p0,yx1 p1){
       return c.parseFrom(PutOverridesValuesRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static PutOverridesValuesRequest parseFrom(sh0 p0){
       return c.parseFrom(PutOverridesValuesRequest.DEFAULT_INSTANCE, p0);
    }
    public static PutOverridesValuesRequest parseFrom(sh0 p0,yx1 p1){
       return c.parseFrom(PutOverridesValuesRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static PutOverridesValuesRequest parseFrom(byte[] p0){
       return c.parseFrom(PutOverridesValuesRequest.DEFAULT_INSTANCE, p0);
    }
    public static PutOverridesValuesRequest parseFrom(byte[] p0,yx1 p1){
       return c.parseFrom(PutOverridesValuesRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static r75 parser(){
       return PutOverridesValuesRequest.DEFAULT_INSTANCE.getParserForType();
    }
    public boolean containsPairs(String p0){
       p0.getClass();
       return this.internalGetPairs().containsKey(p0);
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
             Object[] objArray = new Object[]{"pairs_",PutOverridesValuesRequest$PairsDefaultEntryHolder.defaultEntry};
             return c.newMessageInfo(PutOverridesValuesRequest.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\x012", objArray);
           case 3:
             return new PutOverridesValuesRequest();
           case 4:
             return new PutOverridesValuesRequest$Builder(i);
           case 5:
             return PutOverridesValuesRequest.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = PutOverridesValuesRequest.PARSER) == null) {
                _monitor_enter(PutOverridesValuesRequest.class);
                if ((pARSER = PutOverridesValuesRequest.PARSER) == null) {
                   pARSER = new ii2(PutOverridesValuesRequest.DEFAULT_INSTANCE);
                   PutOverridesValuesRequest.PARSER = pARSER;
                }
                _monitor_exit(PutOverridesValuesRequest.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public Map getPairs(){
       return this.getPairsMap();
    }
    public int getPairsCount(){
       return this.internalGetPairs().size();
    }
    public Map getPairsMap(){
       return Collections.unmodifiableMap(this.internalGetPairs());
    }
    public String getPairsOrDefault(String p0,String p1){
       p0.getClass();
       g14 og14 = this.internalGetPairs();
       if (og14.containsKey(p0)) {
          p1 = og14.get(p0);
       }
       return p1;
    }
    public String getPairsOrThrow(String p0){
       p0.getClass();
       g14 og14 = this.internalGetPairs();
       if (og14.containsKey(p0)) {
          return og14.get(p0);
       }
       throw new IllegalArgumentException();
    }
}

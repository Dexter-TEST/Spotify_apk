package com.spotify.connectivity.product_state.esperanto.proto.DelOverridesValuesRequest;
import com.spotify.connectivity.product_state.esperanto.proto.DelOverridesValuesRequestOrBuilder;
import com.google.protobuf.c;
import java.lang.Class;
import p.bc3;
import java.lang.Iterable;
import java.util.List;
import com.google.protobuf.a;
import java.lang.String;
import java.lang.Object;
import p.i80;
import p.f2;
import com.spotify.connectivity.product_state.esperanto.proto.DelOverridesValuesRequest$Builder;
import com.google.protobuf.b;
import java.io.InputStream;
import p.yx1;
import java.nio.ByteBuffer;
import p.sh0;
import p.r75;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.Byte;
import p.h80;

public final class DelOverridesValuesRequest extends c implements DelOverridesValuesRequestOrBuilder	// class@0007a6 from classes.dex
{
    private bc3 keys_;
    private static final DelOverridesValuesRequest DEFAULT_INSTANCE;
    public static final int KEYS_FIELD_NUMBER;
    private static r75 PARSER;

    static {
       DelOverridesValuesRequest uDelOverride = new DelOverridesValuesRequest();
       DelOverridesValuesRequest.DEFAULT_INSTANCE = uDelOverride;
       c.registerDefaultInstance(DelOverridesValuesRequest.class, uDelOverride);
    }
    private void DelOverridesValuesRequest(){
       super();
       this.keys_ = c.emptyProtobufList();
    }
    private void addAllKeys(Iterable p0){
       this.ensureKeysIsMutable();
       a.addAll(p0, this.keys_);
    }
    private void addKeys(String p0){
       p0.getClass();
       this.ensureKeysIsMutable();
       this.keys_.add(p0);
    }
    private void addKeysBytes(i80 p0){
       a.checkByteStringIsUtf8(p0);
       this.ensureKeysIsMutable();
       this.keys_.add(p0.r());
    }
    private void clearKeys(){
       this.keys_ = c.emptyProtobufList();
    }
    public static void e(DelOverridesValuesRequest p0,Iterable p1){
       p0.addAllKeys(p1);
    }
    private void ensureKeysIsMutable(){
       DelOverridesValuesRequest tkeys_ = this.keys_;
       if (tkeys_.a == null) {
          this.keys_ = c.mutableCopy(tkeys_);
       }
       return;
    }
    public static void f(DelOverridesValuesRequest p0,String p1){
       p0.addKeys(p1);
    }
    public static void g(DelOverridesValuesRequest p0,i80 p1){
       p0.addKeysBytes(p1);
    }
    public static DelOverridesValuesRequest getDefaultInstance(){
       return DelOverridesValuesRequest.DEFAULT_INSTANCE;
    }
    public static void h(DelOverridesValuesRequest p0){
       p0.clearKeys();
    }
    public static void i(DelOverridesValuesRequest p0,int p1,String p2){
       p0.setKeys(p1, p2);
    }
    public static DelOverridesValuesRequest j(){
       return DelOverridesValuesRequest.DEFAULT_INSTANCE;
    }
    public static DelOverridesValuesRequest$Builder newBuilder(){
       return DelOverridesValuesRequest.DEFAULT_INSTANCE.createBuilder();
    }
    public static DelOverridesValuesRequest$Builder newBuilder(DelOverridesValuesRequest p0){
       return DelOverridesValuesRequest.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static DelOverridesValuesRequest parseDelimitedFrom(InputStream p0){
       return c.parseDelimitedFrom(DelOverridesValuesRequest.DEFAULT_INSTANCE, p0);
    }
    public static DelOverridesValuesRequest parseDelimitedFrom(InputStream p0,yx1 p1){
       return c.parseDelimitedFrom(DelOverridesValuesRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static DelOverridesValuesRequest parseFrom(InputStream p0){
       return c.parseFrom(DelOverridesValuesRequest.DEFAULT_INSTANCE, p0);
    }
    public static DelOverridesValuesRequest parseFrom(InputStream p0,yx1 p1){
       return c.parseFrom(DelOverridesValuesRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static DelOverridesValuesRequest parseFrom(ByteBuffer p0){
       return c.parseFrom(DelOverridesValuesRequest.DEFAULT_INSTANCE, p0);
    }
    public static DelOverridesValuesRequest parseFrom(ByteBuffer p0,yx1 p1){
       return c.parseFrom(DelOverridesValuesRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static DelOverridesValuesRequest parseFrom(i80 p0){
       return c.parseFrom(DelOverridesValuesRequest.DEFAULT_INSTANCE, p0);
    }
    public static DelOverridesValuesRequest parseFrom(i80 p0,yx1 p1){
       return c.parseFrom(DelOverridesValuesRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static DelOverridesValuesRequest parseFrom(sh0 p0){
       return c.parseFrom(DelOverridesValuesRequest.DEFAULT_INSTANCE, p0);
    }
    public static DelOverridesValuesRequest parseFrom(sh0 p0,yx1 p1){
       return c.parseFrom(DelOverridesValuesRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static DelOverridesValuesRequest parseFrom(byte[] p0){
       return c.parseFrom(DelOverridesValuesRequest.DEFAULT_INSTANCE, p0);
    }
    public static DelOverridesValuesRequest parseFrom(byte[] p0,yx1 p1){
       return c.parseFrom(DelOverridesValuesRequest.DEFAULT_INSTANCE, p0, p1);
    }
    public static r75 parser(){
       return DelOverridesValuesRequest.DEFAULT_INSTANCE.getParserForType();
    }
    private void setKeys(int p0,String p1){
       p1.getClass();
       this.ensureKeysIsMutable();
       this.keys_.set(p0, p1);
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
             Object[] objArray = new Object[b];
             objArray[i] = "keys_";
             return c.newMessageInfo(DelOverridesValuesRequest.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\x01\xff\x02\xff\x02\x01\x02\x02", objArray);
           case 3:
             return new DelOverridesValuesRequest();
           case 4:
             return new DelOverridesValuesRequest$Builder(i);
           case 5:
             return DelOverridesValuesRequest.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = DelOverridesValuesRequest.PARSER) == null) {
                _monitor_enter(DelOverridesValuesRequest.class);
                if ((pARSER = DelOverridesValuesRequest.PARSER) == null) {
                   pARSER = new ii2(DelOverridesValuesRequest.DEFAULT_INSTANCE);
                   DelOverridesValuesRequest.PARSER = pARSER;
                }
                _monitor_exit(DelOverridesValuesRequest.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public String getKeys(int p0){
       return this.keys_.get(p0);
    }
    public i80 getKeysBytes(int p0){
       return i80.d(this.keys_.get(p0));
    }
    public int getKeysCount(){
       return this.keys_.size();
    }
    public List getKeysList(){
       return this.keys_;
    }
}

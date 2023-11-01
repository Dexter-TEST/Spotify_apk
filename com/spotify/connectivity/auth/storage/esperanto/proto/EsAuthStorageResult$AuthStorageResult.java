package com.spotify.connectivity.auth.storage.esperanto.proto.EsAuthStorageResult$AuthStorageResult;
import com.spotify.connectivity.auth.storage.esperanto.proto.EsAuthStorageResult$AuthStorageResultOrBuilder;
import com.google.protobuf.c;
import java.lang.Class;
import com.spotify.connectivity.auth.storage.esperanto.proto.EsAuthStorageResult$AuthStorageResult$Result;
import com.spotify.connectivity.auth.storage.esperanto.proto.EsAuthStorageResult$AuthStorageResult$Builder;
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

public final class EsAuthStorageResult$AuthStorageResult extends c implements EsAuthStorageResult$AuthStorageResultOrBuilder	// class@000654 from classes.dex
{
    private int result_;
    private static final EsAuthStorageResult$AuthStorageResult DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int RESULT_FIELD_NUMBER;

    static {
       EsAuthStorageResult$AuthStorageResult uAuthStorage = new EsAuthStorageResult$AuthStorageResult();
       EsAuthStorageResult$AuthStorageResult.DEFAULT_INSTANCE = uAuthStorage;
       c.registerDefaultInstance(EsAuthStorageResult$AuthStorageResult.class, uAuthStorage);
    }
    private void EsAuthStorageResult$AuthStorageResult(){
       super();
    }
    private void clearResult(){
       this.result_ = 0;
    }
    public static void e(EsAuthStorageResult$AuthStorageResult p0){
       p0.clearResult();
    }
    public static void f(EsAuthStorageResult$AuthStorageResult p0,EsAuthStorageResult$AuthStorageResult$Result p1){
       p0.setResult(p1);
    }
    public static void g(EsAuthStorageResult$AuthStorageResult p0,int p1){
       p0.setResultValue(p1);
    }
    public static EsAuthStorageResult$AuthStorageResult getDefaultInstance(){
       return EsAuthStorageResult$AuthStorageResult.DEFAULT_INSTANCE;
    }
    public static EsAuthStorageResult$AuthStorageResult h(){
       return EsAuthStorageResult$AuthStorageResult.DEFAULT_INSTANCE;
    }
    public static EsAuthStorageResult$AuthStorageResult$Builder newBuilder(){
       return EsAuthStorageResult$AuthStorageResult.DEFAULT_INSTANCE.createBuilder();
    }
    public static EsAuthStorageResult$AuthStorageResult$Builder newBuilder(EsAuthStorageResult$AuthStorageResult p0){
       return EsAuthStorageResult$AuthStorageResult.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static EsAuthStorageResult$AuthStorageResult parseDelimitedFrom(InputStream p0){
       return c.parseDelimitedFrom(EsAuthStorageResult$AuthStorageResult.DEFAULT_INSTANCE, p0);
    }
    public static EsAuthStorageResult$AuthStorageResult parseDelimitedFrom(InputStream p0,yx1 p1){
       return c.parseDelimitedFrom(EsAuthStorageResult$AuthStorageResult.DEFAULT_INSTANCE, p0, p1);
    }
    public static EsAuthStorageResult$AuthStorageResult parseFrom(InputStream p0){
       return c.parseFrom(EsAuthStorageResult$AuthStorageResult.DEFAULT_INSTANCE, p0);
    }
    public static EsAuthStorageResult$AuthStorageResult parseFrom(InputStream p0,yx1 p1){
       return c.parseFrom(EsAuthStorageResult$AuthStorageResult.DEFAULT_INSTANCE, p0, p1);
    }
    public static EsAuthStorageResult$AuthStorageResult parseFrom(ByteBuffer p0){
       return c.parseFrom(EsAuthStorageResult$AuthStorageResult.DEFAULT_INSTANCE, p0);
    }
    public static EsAuthStorageResult$AuthStorageResult parseFrom(ByteBuffer p0,yx1 p1){
       return c.parseFrom(EsAuthStorageResult$AuthStorageResult.DEFAULT_INSTANCE, p0, p1);
    }
    public static EsAuthStorageResult$AuthStorageResult parseFrom(i80 p0){
       return c.parseFrom(EsAuthStorageResult$AuthStorageResult.DEFAULT_INSTANCE, p0);
    }
    public static EsAuthStorageResult$AuthStorageResult parseFrom(i80 p0,yx1 p1){
       return c.parseFrom(EsAuthStorageResult$AuthStorageResult.DEFAULT_INSTANCE, p0, p1);
    }
    public static EsAuthStorageResult$AuthStorageResult parseFrom(sh0 p0){
       return c.parseFrom(EsAuthStorageResult$AuthStorageResult.DEFAULT_INSTANCE, p0);
    }
    public static EsAuthStorageResult$AuthStorageResult parseFrom(sh0 p0,yx1 p1){
       return c.parseFrom(EsAuthStorageResult$AuthStorageResult.DEFAULT_INSTANCE, p0, p1);
    }
    public static EsAuthStorageResult$AuthStorageResult parseFrom(byte[] p0){
       return c.parseFrom(EsAuthStorageResult$AuthStorageResult.DEFAULT_INSTANCE, p0);
    }
    public static EsAuthStorageResult$AuthStorageResult parseFrom(byte[] p0,yx1 p1){
       return c.parseFrom(EsAuthStorageResult$AuthStorageResult.DEFAULT_INSTANCE, p0, p1);
    }
    public static r75 parser(){
       return EsAuthStorageResult$AuthStorageResult.DEFAULT_INSTANCE.getParserForType();
    }
    private void setResult(EsAuthStorageResult$AuthStorageResult$Result p0){
       this.result_ = p0.getNumber();
    }
    private void setResultValue(int p0){
       this.result_ = p0;
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
             objArray[i] = "result_";
             return c.newMessageInfo(EsAuthStorageResult$AuthStorageResult.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x01\xff\x02\xff\x02\xff\x02\xff\x02\x01\x01\x01\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\f", objArray);
           case 3:
             return new EsAuthStorageResult$AuthStorageResult();
           case 4:
             return new EsAuthStorageResult$AuthStorageResult$Builder(i);
           case 5:
             return EsAuthStorageResult$AuthStorageResult.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EsAuthStorageResult$AuthStorageResult.PARSER) == null) {
                _monitor_enter(EsAuthStorageResult$AuthStorageResult.class);
                if ((pARSER = EsAuthStorageResult$AuthStorageResult.PARSER) == null) {
                   pARSER = new ii2(EsAuthStorageResult$AuthStorageResult.DEFAULT_INSTANCE);
                   EsAuthStorageResult$AuthStorageResult.PARSER = pARSER;
                }
                _monitor_exit(EsAuthStorageResult$AuthStorageResult.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public EsAuthStorageResult$AuthStorageResult$Result getResult(){
       EsAuthStorageResult$AuthStorageResult$Result uAuthStorage;
       if ((uAuthStorage = EsAuthStorageResult$AuthStorageResult$Result.forNumber(this.result_)) == null) {
          uAuthStorage = EsAuthStorageResult$AuthStorageResult$Result.UNRECOGNIZED;
       }
       return uAuthStorage;
    }
    public int getResultValue(){
       return this.result_;
    }
}

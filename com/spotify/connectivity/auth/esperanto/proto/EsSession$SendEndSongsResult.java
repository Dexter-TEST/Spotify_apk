package com.spotify.connectivity.auth.esperanto.proto.EsSession$SendEndSongsResult;
import com.spotify.connectivity.auth.esperanto.proto.EsSession$SendEndSongsResultOrBuilder;
import com.google.protobuf.c;
import java.lang.Class;
import java.lang.String;
import p.i80;
import com.spotify.connectivity.auth.esperanto.proto.EsSession$SendEndSongsResult$Builder;
import com.google.protobuf.b;
import java.io.InputStream;
import p.yx1;
import java.nio.ByteBuffer;
import p.sh0;
import p.r75;
import java.lang.Object;
import com.google.protobuf.a;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.Byte;
import p.h80;

public final class EsSession$SendEndSongsResult extends c implements EsSession$SendEndSongsResultOrBuilder	// class@00062d from classes.dex
{
    private int errorCode_;
    private String errorDescription_;
    private boolean success_;
    private static final EsSession$SendEndSongsResult DEFAULT_INSTANCE;
    public static final int ERROR_CODE_FIELD_NUMBER;
    public static final int ERROR_DESCRIPTION_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int SUCCESS_FIELD_NUMBER;

    static {
       EsSession$SendEndSongsResult sendEndSongs = new EsSession$SendEndSongsResult();
       EsSession$SendEndSongsResult.DEFAULT_INSTANCE = sendEndSongs;
       c.registerDefaultInstance(EsSession$SendEndSongsResult.class, sendEndSongs);
    }
    private void EsSession$SendEndSongsResult(){
       super();
       this.errorDescription_ = "";
    }
    private void clearErrorCode(){
       this.errorCode_ = 0;
    }
    private void clearErrorDescription(){
       this.errorDescription_ = EsSession$SendEndSongsResult.getDefaultInstance().getErrorDescription();
    }
    private void clearSuccess(){
       this.success_ = false;
    }
    public static void e(EsSession$SendEndSongsResult p0){
       p0.clearErrorCode();
    }
    public static void f(EsSession$SendEndSongsResult p0){
       p0.clearErrorDescription();
    }
    public static void g(EsSession$SendEndSongsResult p0){
       p0.clearSuccess();
    }
    public static EsSession$SendEndSongsResult getDefaultInstance(){
       return EsSession$SendEndSongsResult.DEFAULT_INSTANCE;
    }
    public static void h(EsSession$SendEndSongsResult p0,int p1){
       p0.setErrorCode(p1);
    }
    public static void i(EsSession$SendEndSongsResult p0,String p1){
       p0.setErrorDescription(p1);
    }
    public static void j(EsSession$SendEndSongsResult p0,i80 p1){
       p0.setErrorDescriptionBytes(p1);
    }
    public static void k(EsSession$SendEndSongsResult p0,boolean p1){
       p0.setSuccess(p1);
    }
    public static EsSession$SendEndSongsResult l(){
       return EsSession$SendEndSongsResult.DEFAULT_INSTANCE;
    }
    public static EsSession$SendEndSongsResult$Builder newBuilder(){
       return EsSession$SendEndSongsResult.DEFAULT_INSTANCE.createBuilder();
    }
    public static EsSession$SendEndSongsResult$Builder newBuilder(EsSession$SendEndSongsResult p0){
       return EsSession$SendEndSongsResult.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static EsSession$SendEndSongsResult parseDelimitedFrom(InputStream p0){
       return c.parseDelimitedFrom(EsSession$SendEndSongsResult.DEFAULT_INSTANCE, p0);
    }
    public static EsSession$SendEndSongsResult parseDelimitedFrom(InputStream p0,yx1 p1){
       return c.parseDelimitedFrom(EsSession$SendEndSongsResult.DEFAULT_INSTANCE, p0, p1);
    }
    public static EsSession$SendEndSongsResult parseFrom(InputStream p0){
       return c.parseFrom(EsSession$SendEndSongsResult.DEFAULT_INSTANCE, p0);
    }
    public static EsSession$SendEndSongsResult parseFrom(InputStream p0,yx1 p1){
       return c.parseFrom(EsSession$SendEndSongsResult.DEFAULT_INSTANCE, p0, p1);
    }
    public static EsSession$SendEndSongsResult parseFrom(ByteBuffer p0){
       return c.parseFrom(EsSession$SendEndSongsResult.DEFAULT_INSTANCE, p0);
    }
    public static EsSession$SendEndSongsResult parseFrom(ByteBuffer p0,yx1 p1){
       return c.parseFrom(EsSession$SendEndSongsResult.DEFAULT_INSTANCE, p0, p1);
    }
    public static EsSession$SendEndSongsResult parseFrom(i80 p0){
       return c.parseFrom(EsSession$SendEndSongsResult.DEFAULT_INSTANCE, p0);
    }
    public static EsSession$SendEndSongsResult parseFrom(i80 p0,yx1 p1){
       return c.parseFrom(EsSession$SendEndSongsResult.DEFAULT_INSTANCE, p0, p1);
    }
    public static EsSession$SendEndSongsResult parseFrom(sh0 p0){
       return c.parseFrom(EsSession$SendEndSongsResult.DEFAULT_INSTANCE, p0);
    }
    public static EsSession$SendEndSongsResult parseFrom(sh0 p0,yx1 p1){
       return c.parseFrom(EsSession$SendEndSongsResult.DEFAULT_INSTANCE, p0, p1);
    }
    public static EsSession$SendEndSongsResult parseFrom(byte[] p0){
       return c.parseFrom(EsSession$SendEndSongsResult.DEFAULT_INSTANCE, p0);
    }
    public static EsSession$SendEndSongsResult parseFrom(byte[] p0,yx1 p1){
       return c.parseFrom(EsSession$SendEndSongsResult.DEFAULT_INSTANCE, p0, p1);
    }
    public static r75 parser(){
       return EsSession$SendEndSongsResult.DEFAULT_INSTANCE.getParserForType();
    }
    private void setErrorCode(int p0){
       this.errorCode_ = p0;
    }
    private void setErrorDescription(String p0){
       p0.getClass();
       this.errorDescription_ = p0;
    }
    private void setErrorDescriptionBytes(i80 p0){
       a.checkByteStringIsUtf8(p0);
       this.errorDescription_ = p0.r();
    }
    private void setSuccess(boolean p0){
       this.success_ = p0;
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
             Object[] objArray = new Object[]{"success_","errorCode_","errorDescription_"};
             return c.newMessageInfo(EsSession$SendEndSongsResult.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x03\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x07\x02\x04\x03\x02\x02", objArray);
           case 3:
             return new EsSession$SendEndSongsResult();
           case 4:
             return new EsSession$SendEndSongsResult$Builder(i);
           case 5:
             return EsSession$SendEndSongsResult.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EsSession$SendEndSongsResult.PARSER) == null) {
                _monitor_enter(EsSession$SendEndSongsResult.class);
                if ((pARSER = EsSession$SendEndSongsResult.PARSER) == null) {
                   pARSER = new ii2(EsSession$SendEndSongsResult.DEFAULT_INSTANCE);
                   EsSession$SendEndSongsResult.PARSER = pARSER;
                }
                _monitor_exit(EsSession$SendEndSongsResult.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public int getErrorCode(){
       return this.errorCode_;
    }
    public String getErrorDescription(){
       return this.errorDescription_;
    }
    public i80 getErrorDescriptionBytes(){
       return i80.d(this.errorDescription_);
    }
    public boolean getSuccess(){
       return this.success_;
    }
}

package com.spotify.connectivity.auth.storage.esperanto.proto.EsStoredUserInfo$StoredUserInfo;
import com.spotify.connectivity.auth.storage.esperanto.proto.EsStoredUserInfo$StoredUserInfoOrBuilder;
import com.google.protobuf.c;
import java.lang.Class;
import java.lang.String;
import com.spotify.connectivity.auth.common.esperanto.proto.EsAuthBlob$AuthBlob;
import p.i80;
import java.lang.Object;
import com.spotify.connectivity.auth.common.esperanto.proto.EsAuthBlob$AuthBlob$Builder;
import com.google.protobuf.b;
import com.spotify.connectivity.auth.storage.esperanto.proto.EsStoredUserInfo$StoredUserInfo$Builder;
import java.io.InputStream;
import p.yx1;
import java.nio.ByteBuffer;
import p.sh0;
import p.r75;
import com.google.protobuf.a;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.Byte;
import p.h80;

public final class EsStoredUserInfo$StoredUserInfo extends c implements EsStoredUserInfo$StoredUserInfoOrBuilder	// class@00065d from classes.dex
{
    private EsAuthBlob$AuthBlob authBlob_;
    private String username_;
    public static final int AUTH_BLOB_FIELD_NUMBER = 2;
    private static final EsStoredUserInfo$StoredUserInfo DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int USERNAME_FIELD_NUMBER;

    static {
       EsStoredUserInfo$StoredUserInfo storedUserIn = new EsStoredUserInfo$StoredUserInfo();
       EsStoredUserInfo$StoredUserInfo.DEFAULT_INSTANCE = storedUserIn;
       c.registerDefaultInstance(EsStoredUserInfo$StoredUserInfo.class, storedUserIn);
    }
    private void EsStoredUserInfo$StoredUserInfo(){
       super();
       this.username_ = "";
    }
    private void clearAuthBlob(){
       this.authBlob_ = null;
    }
    private void clearUsername(){
       this.username_ = EsStoredUserInfo$StoredUserInfo.getDefaultInstance().getUsername();
    }
    public static void e(EsStoredUserInfo$StoredUserInfo p0){
       p0.clearAuthBlob();
    }
    public static void f(EsStoredUserInfo$StoredUserInfo p0){
       p0.clearUsername();
    }
    public static void g(EsStoredUserInfo$StoredUserInfo p0,EsAuthBlob$AuthBlob p1){
       p0.mergeAuthBlob(p1);
    }
    public static EsStoredUserInfo$StoredUserInfo getDefaultInstance(){
       return EsStoredUserInfo$StoredUserInfo.DEFAULT_INSTANCE;
    }
    public static void h(EsStoredUserInfo$StoredUserInfo p0,EsAuthBlob$AuthBlob p1){
       p0.setAuthBlob(p1);
    }
    public static void i(EsStoredUserInfo$StoredUserInfo p0,String p1){
       p0.setUsername(p1);
    }
    public static void j(EsStoredUserInfo$StoredUserInfo p0,i80 p1){
       p0.setUsernameBytes(p1);
    }
    public static EsStoredUserInfo$StoredUserInfo k(){
       return EsStoredUserInfo$StoredUserInfo.DEFAULT_INSTANCE;
    }
    private void mergeAuthBlob(EsAuthBlob$AuthBlob p0){
       EsStoredUserInfo$StoredUserInfo tauthBlob_;
       p0.getClass();
       this.authBlob_ = ((tauthBlob_ = this.authBlob_) != null && tauthBlob_ != EsAuthBlob$AuthBlob.getDefaultInstance())? EsAuthBlob$AuthBlob.newBuilder(this.authBlob_).mergeFrom(p0).buildPartial(): p0;
       return;
    }
    public static EsStoredUserInfo$StoredUserInfo$Builder newBuilder(){
       return EsStoredUserInfo$StoredUserInfo.DEFAULT_INSTANCE.createBuilder();
    }
    public static EsStoredUserInfo$StoredUserInfo$Builder newBuilder(EsStoredUserInfo$StoredUserInfo p0){
       return EsStoredUserInfo$StoredUserInfo.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static EsStoredUserInfo$StoredUserInfo parseDelimitedFrom(InputStream p0){
       return c.parseDelimitedFrom(EsStoredUserInfo$StoredUserInfo.DEFAULT_INSTANCE, p0);
    }
    public static EsStoredUserInfo$StoredUserInfo parseDelimitedFrom(InputStream p0,yx1 p1){
       return c.parseDelimitedFrom(EsStoredUserInfo$StoredUserInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static EsStoredUserInfo$StoredUserInfo parseFrom(InputStream p0){
       return c.parseFrom(EsStoredUserInfo$StoredUserInfo.DEFAULT_INSTANCE, p0);
    }
    public static EsStoredUserInfo$StoredUserInfo parseFrom(InputStream p0,yx1 p1){
       return c.parseFrom(EsStoredUserInfo$StoredUserInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static EsStoredUserInfo$StoredUserInfo parseFrom(ByteBuffer p0){
       return c.parseFrom(EsStoredUserInfo$StoredUserInfo.DEFAULT_INSTANCE, p0);
    }
    public static EsStoredUserInfo$StoredUserInfo parseFrom(ByteBuffer p0,yx1 p1){
       return c.parseFrom(EsStoredUserInfo$StoredUserInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static EsStoredUserInfo$StoredUserInfo parseFrom(i80 p0){
       return c.parseFrom(EsStoredUserInfo$StoredUserInfo.DEFAULT_INSTANCE, p0);
    }
    public static EsStoredUserInfo$StoredUserInfo parseFrom(i80 p0,yx1 p1){
       return c.parseFrom(EsStoredUserInfo$StoredUserInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static EsStoredUserInfo$StoredUserInfo parseFrom(sh0 p0){
       return c.parseFrom(EsStoredUserInfo$StoredUserInfo.DEFAULT_INSTANCE, p0);
    }
    public static EsStoredUserInfo$StoredUserInfo parseFrom(sh0 p0,yx1 p1){
       return c.parseFrom(EsStoredUserInfo$StoredUserInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static EsStoredUserInfo$StoredUserInfo parseFrom(byte[] p0){
       return c.parseFrom(EsStoredUserInfo$StoredUserInfo.DEFAULT_INSTANCE, p0);
    }
    public static EsStoredUserInfo$StoredUserInfo parseFrom(byte[] p0,yx1 p1){
       return c.parseFrom(EsStoredUserInfo$StoredUserInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static r75 parser(){
       return EsStoredUserInfo$StoredUserInfo.DEFAULT_INSTANCE.getParserForType();
    }
    private void setAuthBlob(EsAuthBlob$AuthBlob p0){
       p0.getClass();
       this.authBlob_ = p0;
    }
    private void setUsername(String p0){
       p0.getClass();
       this.username_ = p0;
    }
    private void setUsernameBytes(i80 p0){
       a.checkByteStringIsUtf8(p0);
       this.username_ = p0.r();
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
             Object[] objArray = new Object[]{"username_","authBlob_"};
             return c.newMessageInfo(EsStoredUserInfo$StoredUserInfo.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\t", objArray);
           case 3:
             return new EsStoredUserInfo$StoredUserInfo();
           case 4:
             return new EsStoredUserInfo$StoredUserInfo$Builder(i);
           case 5:
             return EsStoredUserInfo$StoredUserInfo.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EsStoredUserInfo$StoredUserInfo.PARSER) == null) {
                _monitor_enter(EsStoredUserInfo$StoredUserInfo.class);
                if ((pARSER = EsStoredUserInfo$StoredUserInfo.PARSER) == null) {
                   pARSER = new ii2(EsStoredUserInfo$StoredUserInfo.DEFAULT_INSTANCE);
                   EsStoredUserInfo$StoredUserInfo.PARSER = pARSER;
                }
                _monitor_exit(EsStoredUserInfo$StoredUserInfo.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public EsAuthBlob$AuthBlob getAuthBlob(){
       EsStoredUserInfo$StoredUserInfo tauthBlob_;
       if ((tauthBlob_ = this.authBlob_) == null) {
          tauthBlob_ = EsAuthBlob$AuthBlob.getDefaultInstance();
       }
       return tauthBlob_;
    }
    public String getUsername(){
       return this.username_;
    }
    public i80 getUsernameBytes(){
       return i80.d(this.username_);
    }
    public boolean hasAuthBlob(){
       boolean b = (this.authBlob_ != null)? true: false;
       return b;
    }
}

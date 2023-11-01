package com.spotify.connectivity.auth.common.esperanto.proto.EsEncryptedStoredCredentials$EncryptedStoredCredentials;
import com.spotify.connectivity.auth.common.esperanto.proto.EsEncryptedStoredCredentials$EncryptedStoredCredentialsOrBuilder;
import com.google.protobuf.c;
import java.lang.Class;
import p.i80;
import java.lang.String;
import com.spotify.connectivity.auth.common.esperanto.proto.EsEncryptedStoredCredentials$EncryptedStoredCredentials$Builder;
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

public final class EsEncryptedStoredCredentials$EncryptedStoredCredentials extends c implements EsEncryptedStoredCredentials$EncryptedStoredCredentialsOrBuilder	// class@00061e from classes.dex
{
    private i80 authBlob_;
    private String deviceId_;
    private String username_;
    public static final int AUTH_BLOB_FIELD_NUMBER = 2;
    private static final EsEncryptedStoredCredentials$EncryptedStoredCredentials DEFAULT_INSTANCE;
    public static final int DEVICE_ID_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int USERNAME_FIELD_NUMBER;

    static {
       EsEncryptedStoredCredentials$EncryptedStoredCredentials uEncryptedSt = new EsEncryptedStoredCredentials$EncryptedStoredCredentials();
       EsEncryptedStoredCredentials$EncryptedStoredCredentials.DEFAULT_INSTANCE = uEncryptedSt;
       c.registerDefaultInstance(EsEncryptedStoredCredentials$EncryptedStoredCredentials.class, uEncryptedSt);
    }
    private void EsEncryptedStoredCredentials$EncryptedStoredCredentials(){
       super();
       this.username_ = "";
       this.authBlob_ = i80.b;
       this.deviceId_ = "";
    }
    private void clearAuthBlob(){
       this.authBlob_ = EsEncryptedStoredCredentials$EncryptedStoredCredentials.getDefaultInstance().getAuthBlob();
    }
    private void clearDeviceId(){
       this.deviceId_ = EsEncryptedStoredCredentials$EncryptedStoredCredentials.getDefaultInstance().getDeviceId();
    }
    private void clearUsername(){
       this.username_ = EsEncryptedStoredCredentials$EncryptedStoredCredentials.getDefaultInstance().getUsername();
    }
    public static void e(EsEncryptedStoredCredentials$EncryptedStoredCredentials p0){
       p0.clearAuthBlob();
    }
    public static void f(EsEncryptedStoredCredentials$EncryptedStoredCredentials p0){
       p0.clearDeviceId();
    }
    public static void g(EsEncryptedStoredCredentials$EncryptedStoredCredentials p0){
       p0.clearUsername();
    }
    public static EsEncryptedStoredCredentials$EncryptedStoredCredentials getDefaultInstance(){
       return EsEncryptedStoredCredentials$EncryptedStoredCredentials.DEFAULT_INSTANCE;
    }
    public static void h(EsEncryptedStoredCredentials$EncryptedStoredCredentials p0,i80 p1){
       p0.setAuthBlob(p1);
    }
    public static void i(EsEncryptedStoredCredentials$EncryptedStoredCredentials p0,String p1){
       p0.setDeviceId(p1);
    }
    public static void j(EsEncryptedStoredCredentials$EncryptedStoredCredentials p0,i80 p1){
       p0.setDeviceIdBytes(p1);
    }
    public static void k(EsEncryptedStoredCredentials$EncryptedStoredCredentials p0,String p1){
       p0.setUsername(p1);
    }
    public static void l(EsEncryptedStoredCredentials$EncryptedStoredCredentials p0,i80 p1){
       p0.setUsernameBytes(p1);
    }
    public static EsEncryptedStoredCredentials$EncryptedStoredCredentials m(){
       return EsEncryptedStoredCredentials$EncryptedStoredCredentials.DEFAULT_INSTANCE;
    }
    public static EsEncryptedStoredCredentials$EncryptedStoredCredentials$Builder newBuilder(){
       return EsEncryptedStoredCredentials$EncryptedStoredCredentials.DEFAULT_INSTANCE.createBuilder();
    }
    public static EsEncryptedStoredCredentials$EncryptedStoredCredentials$Builder newBuilder(EsEncryptedStoredCredentials$EncryptedStoredCredentials p0){
       return EsEncryptedStoredCredentials$EncryptedStoredCredentials.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static EsEncryptedStoredCredentials$EncryptedStoredCredentials parseDelimitedFrom(InputStream p0){
       return c.parseDelimitedFrom(EsEncryptedStoredCredentials$EncryptedStoredCredentials.DEFAULT_INSTANCE, p0);
    }
    public static EsEncryptedStoredCredentials$EncryptedStoredCredentials parseDelimitedFrom(InputStream p0,yx1 p1){
       return c.parseDelimitedFrom(EsEncryptedStoredCredentials$EncryptedStoredCredentials.DEFAULT_INSTANCE, p0, p1);
    }
    public static EsEncryptedStoredCredentials$EncryptedStoredCredentials parseFrom(InputStream p0){
       return c.parseFrom(EsEncryptedStoredCredentials$EncryptedStoredCredentials.DEFAULT_INSTANCE, p0);
    }
    public static EsEncryptedStoredCredentials$EncryptedStoredCredentials parseFrom(InputStream p0,yx1 p1){
       return c.parseFrom(EsEncryptedStoredCredentials$EncryptedStoredCredentials.DEFAULT_INSTANCE, p0, p1);
    }
    public static EsEncryptedStoredCredentials$EncryptedStoredCredentials parseFrom(ByteBuffer p0){
       return c.parseFrom(EsEncryptedStoredCredentials$EncryptedStoredCredentials.DEFAULT_INSTANCE, p0);
    }
    public static EsEncryptedStoredCredentials$EncryptedStoredCredentials parseFrom(ByteBuffer p0,yx1 p1){
       return c.parseFrom(EsEncryptedStoredCredentials$EncryptedStoredCredentials.DEFAULT_INSTANCE, p0, p1);
    }
    public static EsEncryptedStoredCredentials$EncryptedStoredCredentials parseFrom(i80 p0){
       return c.parseFrom(EsEncryptedStoredCredentials$EncryptedStoredCredentials.DEFAULT_INSTANCE, p0);
    }
    public static EsEncryptedStoredCredentials$EncryptedStoredCredentials parseFrom(i80 p0,yx1 p1){
       return c.parseFrom(EsEncryptedStoredCredentials$EncryptedStoredCredentials.DEFAULT_INSTANCE, p0, p1);
    }
    public static EsEncryptedStoredCredentials$EncryptedStoredCredentials parseFrom(sh0 p0){
       return c.parseFrom(EsEncryptedStoredCredentials$EncryptedStoredCredentials.DEFAULT_INSTANCE, p0);
    }
    public static EsEncryptedStoredCredentials$EncryptedStoredCredentials parseFrom(sh0 p0,yx1 p1){
       return c.parseFrom(EsEncryptedStoredCredentials$EncryptedStoredCredentials.DEFAULT_INSTANCE, p0, p1);
    }
    public static EsEncryptedStoredCredentials$EncryptedStoredCredentials parseFrom(byte[] p0){
       return c.parseFrom(EsEncryptedStoredCredentials$EncryptedStoredCredentials.DEFAULT_INSTANCE, p0);
    }
    public static EsEncryptedStoredCredentials$EncryptedStoredCredentials parseFrom(byte[] p0,yx1 p1){
       return c.parseFrom(EsEncryptedStoredCredentials$EncryptedStoredCredentials.DEFAULT_INSTANCE, p0, p1);
    }
    public static r75 parser(){
       return EsEncryptedStoredCredentials$EncryptedStoredCredentials.DEFAULT_INSTANCE.getParserForType();
    }
    private void setAuthBlob(i80 p0){
       p0.getClass();
       this.authBlob_ = p0;
    }
    private void setDeviceId(String p0){
       p0.getClass();
       this.deviceId_ = p0;
    }
    private void setDeviceIdBytes(i80 p0){
       a.checkByteStringIsUtf8(p0);
       this.deviceId_ = p0.r();
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
             Object[] objArray = new Object[]{"username_","authBlob_","deviceId_"};
             return c.newMessageInfo(EsEncryptedStoredCredentials$EncryptedStoredCredentials.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x03\xff\x02\xff\x02\xff\x02\xff\x02\x01\x03\x03\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\n\x03\x02\x02", objArray);
           case 3:
             return new EsEncryptedStoredCredentials$EncryptedStoredCredentials();
           case 4:
             return new EsEncryptedStoredCredentials$EncryptedStoredCredentials$Builder(i);
           case 5:
             return EsEncryptedStoredCredentials$EncryptedStoredCredentials.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EsEncryptedStoredCredentials$EncryptedStoredCredentials.PARSER) == null) {
                _monitor_enter(EsEncryptedStoredCredentials$EncryptedStoredCredentials.class);
                if ((pARSER = EsEncryptedStoredCredentials$EncryptedStoredCredentials.PARSER) == null) {
                   pARSER = new ii2(EsEncryptedStoredCredentials$EncryptedStoredCredentials.DEFAULT_INSTANCE);
                   EsEncryptedStoredCredentials$EncryptedStoredCredentials.PARSER = pARSER;
                }
                _monitor_exit(EsEncryptedStoredCredentials$EncryptedStoredCredentials.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public i80 getAuthBlob(){
       return this.authBlob_;
    }
    public String getDeviceId(){
       return this.deviceId_;
    }
    public i80 getDeviceIdBytes(){
       return i80.d(this.deviceId_);
    }
    public String getUsername(){
       return this.username_;
    }
    public i80 getUsernameBytes(){
       return i80.d(this.username_);
    }
}

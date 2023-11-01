package com.spotify.connectivity.auth.common.esperanto.proto.EsUnencryptedStoredCredentials$UnencryptedStoredCredentials;
import com.spotify.connectivity.auth.common.esperanto.proto.EsUnencryptedStoredCredentials$UnencryptedStoredCredentialsOrBuilder;
import com.google.protobuf.c;
import java.lang.Class;
import p.i80;
import java.lang.String;
import com.spotify.connectivity.auth.common.esperanto.proto.EsUnencryptedStoredCredentials$UnencryptedStoredCredentials$Builder;
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

public final class EsUnencryptedStoredCredentials$UnencryptedStoredCredentials extends c implements EsUnencryptedStoredCredentials$UnencryptedStoredCredentialsOrBuilder	// class@000623 from classes.dex
{
    private i80 storedCredentials_;
    private String username_;
    private static final EsUnencryptedStoredCredentials$UnencryptedStoredCredentials DEFAULT_INSTANCE;
    private static r75 PARSER;
    public static final int STOREDCREDENTIALS_FIELD_NUMBER;
    public static final int USERNAME_FIELD_NUMBER;

    static {
       EsUnencryptedStoredCredentials$UnencryptedStoredCredentials unencryptedS = new EsUnencryptedStoredCredentials$UnencryptedStoredCredentials();
       EsUnencryptedStoredCredentials$UnencryptedStoredCredentials.DEFAULT_INSTANCE = unencryptedS;
       c.registerDefaultInstance(EsUnencryptedStoredCredentials$UnencryptedStoredCredentials.class, unencryptedS);
    }
    private void EsUnencryptedStoredCredentials$UnencryptedStoredCredentials(){
       super();
       this.username_ = "";
       this.storedCredentials_ = i80.b;
    }
    private void clearStoredCredentials(){
       this.storedCredentials_ = EsUnencryptedStoredCredentials$UnencryptedStoredCredentials.getDefaultInstance().getStoredCredentials();
    }
    private void clearUsername(){
       this.username_ = EsUnencryptedStoredCredentials$UnencryptedStoredCredentials.getDefaultInstance().getUsername();
    }
    public static void e(EsUnencryptedStoredCredentials$UnencryptedStoredCredentials p0){
       p0.clearStoredCredentials();
    }
    public static void f(EsUnencryptedStoredCredentials$UnencryptedStoredCredentials p0){
       p0.clearUsername();
    }
    public static void g(EsUnencryptedStoredCredentials$UnencryptedStoredCredentials p0,i80 p1){
       p0.setStoredCredentials(p1);
    }
    public static EsUnencryptedStoredCredentials$UnencryptedStoredCredentials getDefaultInstance(){
       return EsUnencryptedStoredCredentials$UnencryptedStoredCredentials.DEFAULT_INSTANCE;
    }
    public static void h(EsUnencryptedStoredCredentials$UnencryptedStoredCredentials p0,String p1){
       p0.setUsername(p1);
    }
    public static void i(EsUnencryptedStoredCredentials$UnencryptedStoredCredentials p0,i80 p1){
       p0.setUsernameBytes(p1);
    }
    public static EsUnencryptedStoredCredentials$UnencryptedStoredCredentials j(){
       return EsUnencryptedStoredCredentials$UnencryptedStoredCredentials.DEFAULT_INSTANCE;
    }
    public static EsUnencryptedStoredCredentials$UnencryptedStoredCredentials$Builder newBuilder(){
       return EsUnencryptedStoredCredentials$UnencryptedStoredCredentials.DEFAULT_INSTANCE.createBuilder();
    }
    public static EsUnencryptedStoredCredentials$UnencryptedStoredCredentials$Builder newBuilder(EsUnencryptedStoredCredentials$UnencryptedStoredCredentials p0){
       return EsUnencryptedStoredCredentials$UnencryptedStoredCredentials.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static EsUnencryptedStoredCredentials$UnencryptedStoredCredentials parseDelimitedFrom(InputStream p0){
       return c.parseDelimitedFrom(EsUnencryptedStoredCredentials$UnencryptedStoredCredentials.DEFAULT_INSTANCE, p0);
    }
    public static EsUnencryptedStoredCredentials$UnencryptedStoredCredentials parseDelimitedFrom(InputStream p0,yx1 p1){
       return c.parseDelimitedFrom(EsUnencryptedStoredCredentials$UnencryptedStoredCredentials.DEFAULT_INSTANCE, p0, p1);
    }
    public static EsUnencryptedStoredCredentials$UnencryptedStoredCredentials parseFrom(InputStream p0){
       return c.parseFrom(EsUnencryptedStoredCredentials$UnencryptedStoredCredentials.DEFAULT_INSTANCE, p0);
    }
    public static EsUnencryptedStoredCredentials$UnencryptedStoredCredentials parseFrom(InputStream p0,yx1 p1){
       return c.parseFrom(EsUnencryptedStoredCredentials$UnencryptedStoredCredentials.DEFAULT_INSTANCE, p0, p1);
    }
    public static EsUnencryptedStoredCredentials$UnencryptedStoredCredentials parseFrom(ByteBuffer p0){
       return c.parseFrom(EsUnencryptedStoredCredentials$UnencryptedStoredCredentials.DEFAULT_INSTANCE, p0);
    }
    public static EsUnencryptedStoredCredentials$UnencryptedStoredCredentials parseFrom(ByteBuffer p0,yx1 p1){
       return c.parseFrom(EsUnencryptedStoredCredentials$UnencryptedStoredCredentials.DEFAULT_INSTANCE, p0, p1);
    }
    public static EsUnencryptedStoredCredentials$UnencryptedStoredCredentials parseFrom(i80 p0){
       return c.parseFrom(EsUnencryptedStoredCredentials$UnencryptedStoredCredentials.DEFAULT_INSTANCE, p0);
    }
    public static EsUnencryptedStoredCredentials$UnencryptedStoredCredentials parseFrom(i80 p0,yx1 p1){
       return c.parseFrom(EsUnencryptedStoredCredentials$UnencryptedStoredCredentials.DEFAULT_INSTANCE, p0, p1);
    }
    public static EsUnencryptedStoredCredentials$UnencryptedStoredCredentials parseFrom(sh0 p0){
       return c.parseFrom(EsUnencryptedStoredCredentials$UnencryptedStoredCredentials.DEFAULT_INSTANCE, p0);
    }
    public static EsUnencryptedStoredCredentials$UnencryptedStoredCredentials parseFrom(sh0 p0,yx1 p1){
       return c.parseFrom(EsUnencryptedStoredCredentials$UnencryptedStoredCredentials.DEFAULT_INSTANCE, p0, p1);
    }
    public static EsUnencryptedStoredCredentials$UnencryptedStoredCredentials parseFrom(byte[] p0){
       return c.parseFrom(EsUnencryptedStoredCredentials$UnencryptedStoredCredentials.DEFAULT_INSTANCE, p0);
    }
    public static EsUnencryptedStoredCredentials$UnencryptedStoredCredentials parseFrom(byte[] p0,yx1 p1){
       return c.parseFrom(EsUnencryptedStoredCredentials$UnencryptedStoredCredentials.DEFAULT_INSTANCE, p0, p1);
    }
    public static r75 parser(){
       return EsUnencryptedStoredCredentials$UnencryptedStoredCredentials.DEFAULT_INSTANCE.getParserForType();
    }
    private void setStoredCredentials(i80 p0){
       p0.getClass();
       this.storedCredentials_ = p0;
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
             Object[] objArray = new Object[]{"username_","storedCredentials_"};
             return c.newMessageInfo(EsUnencryptedStoredCredentials$UnencryptedStoredCredentials.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x02\x02\x02\n", objArray);
           case 3:
             return new EsUnencryptedStoredCredentials$UnencryptedStoredCredentials();
           case 4:
             return new EsUnencryptedStoredCredentials$UnencryptedStoredCredentials$Builder(i);
           case 5:
             return EsUnencryptedStoredCredentials$UnencryptedStoredCredentials.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EsUnencryptedStoredCredentials$UnencryptedStoredCredentials.PARSER) == null) {
                _monitor_enter(EsUnencryptedStoredCredentials$UnencryptedStoredCredentials.class);
                if ((pARSER = EsUnencryptedStoredCredentials$UnencryptedStoredCredentials.PARSER) == null) {
                   pARSER = new ii2(EsUnencryptedStoredCredentials$UnencryptedStoredCredentials.DEFAULT_INSTANCE);
                   EsUnencryptedStoredCredentials$UnencryptedStoredCredentials.PARSER = pARSER;
                }
                _monitor_exit(EsUnencryptedStoredCredentials$UnencryptedStoredCredentials.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public i80 getStoredCredentials(){
       return this.storedCredentials_;
    }
    public String getUsername(){
       return this.username_;
    }
    public i80 getUsernameBytes(){
       return i80.d(this.username_);
    }
}

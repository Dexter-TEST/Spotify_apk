package com.spotify.connectivity.auth.storage.esperanto.proto.EsStoredUserInfo$NullableStoredUserInfo;
import com.spotify.connectivity.auth.storage.esperanto.proto.EsStoredUserInfo$NullableStoredUserInfoOrBuilder;
import com.google.protobuf.c;
import java.lang.Class;
import com.spotify.connectivity.auth.storage.esperanto.proto.EsStoredUserInfo$StoredUserInfo;
import p.un4;
import java.lang.Object;
import com.spotify.connectivity.auth.storage.esperanto.proto.EsStoredUserInfo$StoredUserInfo$Builder;
import com.google.protobuf.b;
import com.spotify.connectivity.auth.storage.esperanto.proto.EsStoredUserInfo$NullableStoredUserInfo$Builder;
import java.io.InputStream;
import p.yx1;
import java.nio.ByteBuffer;
import p.i80;
import p.sh0;
import p.r75;
import java.lang.Integer;
import p.li2;
import java.lang.Enum;
import java.lang.UnsupportedOperationException;
import p.ii2;
import p.s74;
import java.lang.String;
import java.lang.Byte;
import com.spotify.connectivity.auth.storage.esperanto.proto.EsStoredUserInfo$NullableStoredUserInfo$UserInfoCase;

public final class EsStoredUserInfo$NullableStoredUserInfo extends c implements EsStoredUserInfo$NullableStoredUserInfoOrBuilder	// class@00065a from classes.dex
{
    private int userInfoCase_;
    private Object userInfo_;
    private static final EsStoredUserInfo$NullableStoredUserInfo DEFAULT_INSTANCE;
    public static final int NULL_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int STORED_USER_INFO_FIELD_NUMBER;

    static {
       EsStoredUserInfo$NullableStoredUserInfo nullableStor = new EsStoredUserInfo$NullableStoredUserInfo();
       EsStoredUserInfo$NullableStoredUserInfo.DEFAULT_INSTANCE = nullableStor;
       c.registerDefaultInstance(EsStoredUserInfo$NullableStoredUserInfo.class, nullableStor);
    }
    private void EsStoredUserInfo$NullableStoredUserInfo(){
       super();
       this.userInfoCase_ = 0;
    }
    private void clearNull(){
       if (this.userInfoCase_ == 2) {
          this.userInfoCase_ = 0;
          this.userInfo_ = null;
       }
       return;
    }
    private void clearStoredUserInfo(){
       if (this.userInfoCase_ == 1) {
          this.userInfoCase_ = 0;
          this.userInfo_ = null;
       }
       return;
    }
    private void clearUserInfo(){
       this.userInfoCase_ = 0;
       this.userInfo_ = null;
    }
    public static void e(EsStoredUserInfo$NullableStoredUserInfo p0){
       p0.clearNull();
    }
    public static void f(EsStoredUserInfo$NullableStoredUserInfo p0){
       p0.clearStoredUserInfo();
    }
    public static void g(EsStoredUserInfo$NullableStoredUserInfo p0){
       p0.clearUserInfo();
    }
    public static EsStoredUserInfo$NullableStoredUserInfo getDefaultInstance(){
       return EsStoredUserInfo$NullableStoredUserInfo.DEFAULT_INSTANCE;
    }
    public static void h(EsStoredUserInfo$NullableStoredUserInfo p0,EsStoredUserInfo$StoredUserInfo p1){
       p0.mergeStoredUserInfo(p1);
    }
    public static void i(EsStoredUserInfo$NullableStoredUserInfo p0,un4 p1){
       p0.setNull(p1);
    }
    public static void j(EsStoredUserInfo$NullableStoredUserInfo p0,int p1){
       p0.setNullValue(p1);
    }
    public static void k(EsStoredUserInfo$NullableStoredUserInfo p0,EsStoredUserInfo$StoredUserInfo p1){
       p0.setStoredUserInfo(p1);
    }
    public static EsStoredUserInfo$NullableStoredUserInfo l(){
       return EsStoredUserInfo$NullableStoredUserInfo.DEFAULT_INSTANCE;
    }
    private void mergeStoredUserInfo(EsStoredUserInfo$StoredUserInfo p0){
       p0.getClass();
       this.userInfo_ = (this.userInfoCase_ == 1 && this.userInfo_ != EsStoredUserInfo$StoredUserInfo.getDefaultInstance())? EsStoredUserInfo$StoredUserInfo.newBuilder(this.userInfo_).mergeFrom(p0).buildPartial(): p0;
       this.userInfoCase_ = 1;
       return;
    }
    public static EsStoredUserInfo$NullableStoredUserInfo$Builder newBuilder(){
       return EsStoredUserInfo$NullableStoredUserInfo.DEFAULT_INSTANCE.createBuilder();
    }
    public static EsStoredUserInfo$NullableStoredUserInfo$Builder newBuilder(EsStoredUserInfo$NullableStoredUserInfo p0){
       return EsStoredUserInfo$NullableStoredUserInfo.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static EsStoredUserInfo$NullableStoredUserInfo parseDelimitedFrom(InputStream p0){
       return c.parseDelimitedFrom(EsStoredUserInfo$NullableStoredUserInfo.DEFAULT_INSTANCE, p0);
    }
    public static EsStoredUserInfo$NullableStoredUserInfo parseDelimitedFrom(InputStream p0,yx1 p1){
       return c.parseDelimitedFrom(EsStoredUserInfo$NullableStoredUserInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static EsStoredUserInfo$NullableStoredUserInfo parseFrom(InputStream p0){
       return c.parseFrom(EsStoredUserInfo$NullableStoredUserInfo.DEFAULT_INSTANCE, p0);
    }
    public static EsStoredUserInfo$NullableStoredUserInfo parseFrom(InputStream p0,yx1 p1){
       return c.parseFrom(EsStoredUserInfo$NullableStoredUserInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static EsStoredUserInfo$NullableStoredUserInfo parseFrom(ByteBuffer p0){
       return c.parseFrom(EsStoredUserInfo$NullableStoredUserInfo.DEFAULT_INSTANCE, p0);
    }
    public static EsStoredUserInfo$NullableStoredUserInfo parseFrom(ByteBuffer p0,yx1 p1){
       return c.parseFrom(EsStoredUserInfo$NullableStoredUserInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static EsStoredUserInfo$NullableStoredUserInfo parseFrom(i80 p0){
       return c.parseFrom(EsStoredUserInfo$NullableStoredUserInfo.DEFAULT_INSTANCE, p0);
    }
    public static EsStoredUserInfo$NullableStoredUserInfo parseFrom(i80 p0,yx1 p1){
       return c.parseFrom(EsStoredUserInfo$NullableStoredUserInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static EsStoredUserInfo$NullableStoredUserInfo parseFrom(sh0 p0){
       return c.parseFrom(EsStoredUserInfo$NullableStoredUserInfo.DEFAULT_INSTANCE, p0);
    }
    public static EsStoredUserInfo$NullableStoredUserInfo parseFrom(sh0 p0,yx1 p1){
       return c.parseFrom(EsStoredUserInfo$NullableStoredUserInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static EsStoredUserInfo$NullableStoredUserInfo parseFrom(byte[] p0){
       return c.parseFrom(EsStoredUserInfo$NullableStoredUserInfo.DEFAULT_INSTANCE, p0);
    }
    public static EsStoredUserInfo$NullableStoredUserInfo parseFrom(byte[] p0,yx1 p1){
       return c.parseFrom(EsStoredUserInfo$NullableStoredUserInfo.DEFAULT_INSTANCE, p0, p1);
    }
    public static r75 parser(){
       return EsStoredUserInfo$NullableStoredUserInfo.DEFAULT_INSTANCE.getParserForType();
    }
    private void setNull(un4 p0){
       this.userInfo_ = Integer.valueOf(p0.getNumber());
       this.userInfoCase_ = 2;
    }
    private void setNullValue(int p0){
       this.userInfoCase_ = 2;
       this.userInfo_ = Integer.valueOf(p0);
    }
    private void setStoredUserInfo(EsStoredUserInfo$StoredUserInfo p0){
       p0.getClass();
       this.userInfo_ = p0;
       this.userInfoCase_ = 1;
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
             Object[] objArray = new Object[]{"userInfo_","userInfoCase_",EsStoredUserInfo$StoredUserInfo.class};
             return c.newMessageInfo(EsStoredUserInfo$NullableStoredUserInfo.DEFAULT_INSTANCE, "\xff\x02\xff\x02\x02\x01\xff\x02\xff\x02\x01\x02\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01<\xff\x02\xff\x02\x02?\xff\x02\xff\x02", objArray);
           case 3:
             return new EsStoredUserInfo$NullableStoredUserInfo();
           case 4:
             return new EsStoredUserInfo$NullableStoredUserInfo$Builder(i);
           case 5:
             return EsStoredUserInfo$NullableStoredUserInfo.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = EsStoredUserInfo$NullableStoredUserInfo.PARSER) == null) {
                _monitor_enter(EsStoredUserInfo$NullableStoredUserInfo.class);
                if ((pARSER = EsStoredUserInfo$NullableStoredUserInfo.PARSER) == null) {
                   pARSER = new ii2(EsStoredUserInfo$NullableStoredUserInfo.DEFAULT_INSTANCE);
                   EsStoredUserInfo$NullableStoredUserInfo.PARSER = pARSER;
                }
                _monitor_exit(EsStoredUserInfo$NullableStoredUserInfo.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public un4 getNull(){
       un4 b = un4.b;
       if (this.userInfoCase_ == 2) {
          if (this.userInfo_.intValue()) {
             b = null;
          }
          if (b == null) {
             b = un4.c;
          }
       }
       return b;
    }
    public int getNullValue(){
       if (this.userInfoCase_ == 2) {
          return this.userInfo_.intValue();
       }
       return 0;
    }
    public EsStoredUserInfo$StoredUserInfo getStoredUserInfo(){
       if (this.userInfoCase_ == 1) {
          return this.userInfo_;
       }
       return EsStoredUserInfo$StoredUserInfo.getDefaultInstance();
    }
    public EsStoredUserInfo$NullableStoredUserInfo$UserInfoCase getUserInfoCase(){
       return EsStoredUserInfo$NullableStoredUserInfo$UserInfoCase.forNumber(this.userInfoCase_);
    }
    public boolean hasNull(){
       boolean b = (this.userInfoCase_ == 2)? true: false;
       return b;
    }
    public boolean hasStoredUserInfo(){
       boolean b = true;
       if (this.userInfoCase_ == b) {
       }else {
          b = false;
       }
       return b;
    }
}

package com.spotify.connectivity.auth.esperanto.proto.GetStateResult;
import com.spotify.connectivity.auth.esperanto.proto.GetStateResultOrBuilder;
import com.google.protobuf.c;
import java.lang.Class;
import java.lang.String;
import com.spotify.connectivity.auth.esperanto.proto.GetStateResult$Builder;
import com.google.protobuf.b;
import java.io.InputStream;
import p.yx1;
import java.nio.ByteBuffer;
import p.i80;
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

public final class GetStateResult extends c implements GetStateResultOrBuilder	// class@000639 from classes.dex
{
    private boolean canStream_;
    private boolean connected_;
    private String countryCode_;
    private String currentUser_;
    private boolean loggedIn_;
    private boolean loggingIn_;
    private boolean loggingOut_;
    private String paymentState_;
    private String productType_;
    public static final int CAN_STREAM_FIELD_NUMBER = 8;
    public static final int CONNECTED_FIELD_NUMBER = 5;
    public static final int COUNTRY_CODE_FIELD_NUMBER = 9;
    public static final int CURRENT_USER_FIELD_NUMBER = 4;
    private static final GetStateResult DEFAULT_INSTANCE;
    public static final int LOGGED_IN_FIELD_NUMBER;
    public static final int LOGGING_IN_FIELD_NUMBER;
    public static final int LOGGING_OUT_FIELD_NUMBER;
    private static r75 PARSER;
    public static final int PAYMENT_STATE_FIELD_NUMBER;
    public static final int PRODUCT_TYPE_FIELD_NUMBER;

    static {
       GetStateResult getStateResu = new GetStateResult();
       GetStateResult.DEFAULT_INSTANCE = getStateResu;
       c.registerDefaultInstance(GetStateResult.class, getStateResu);
    }
    private void GetStateResult(){
       super();
       this.currentUser_ = "";
       this.paymentState_ = "";
       this.productType_ = "";
       this.countryCode_ = "";
    }
    public static GetStateResult A(){
       return GetStateResult.DEFAULT_INSTANCE;
    }
    private void clearCanStream(){
       this.canStream_ = false;
    }
    private void clearConnected(){
       this.connected_ = false;
    }
    private void clearCountryCode(){
       this.countryCode_ = GetStateResult.getDefaultInstance().getCountryCode();
    }
    private void clearCurrentUser(){
       this.currentUser_ = GetStateResult.getDefaultInstance().getCurrentUser();
    }
    private void clearLoggedIn(){
       this.loggedIn_ = false;
    }
    private void clearLoggingIn(){
       this.loggingIn_ = false;
    }
    private void clearLoggingOut(){
       this.loggingOut_ = false;
    }
    private void clearPaymentState(){
       this.paymentState_ = GetStateResult.getDefaultInstance().getPaymentState();
    }
    private void clearProductType(){
       this.productType_ = GetStateResult.getDefaultInstance().getProductType();
    }
    public static void e(GetStateResult p0){
       p0.clearCanStream();
    }
    public static void f(GetStateResult p0){
       p0.clearConnected();
    }
    public static void g(GetStateResult p0){
       p0.clearCountryCode();
    }
    public static GetStateResult getDefaultInstance(){
       return GetStateResult.DEFAULT_INSTANCE;
    }
    public static void h(GetStateResult p0){
       p0.clearCurrentUser();
    }
    public static void i(GetStateResult p0){
       p0.clearLoggedIn();
    }
    public static void j(GetStateResult p0){
       p0.clearLoggingIn();
    }
    public static void k(GetStateResult p0){
       p0.clearLoggingOut();
    }
    public static void l(GetStateResult p0){
       p0.clearPaymentState();
    }
    public static void m(GetStateResult p0){
       p0.clearProductType();
    }
    public static void n(GetStateResult p0,boolean p1){
       p0.setCanStream(p1);
    }
    public static GetStateResult$Builder newBuilder(){
       return GetStateResult.DEFAULT_INSTANCE.createBuilder();
    }
    public static GetStateResult$Builder newBuilder(GetStateResult p0){
       return GetStateResult.DEFAULT_INSTANCE.createBuilder(p0);
    }
    public static void o(GetStateResult p0,boolean p1){
       p0.setConnected(p1);
    }
    public static void p(GetStateResult p0,String p1){
       p0.setCountryCode(p1);
    }
    public static GetStateResult parseDelimitedFrom(InputStream p0){
       return c.parseDelimitedFrom(GetStateResult.DEFAULT_INSTANCE, p0);
    }
    public static GetStateResult parseDelimitedFrom(InputStream p0,yx1 p1){
       return c.parseDelimitedFrom(GetStateResult.DEFAULT_INSTANCE, p0, p1);
    }
    public static GetStateResult parseFrom(InputStream p0){
       return c.parseFrom(GetStateResult.DEFAULT_INSTANCE, p0);
    }
    public static GetStateResult parseFrom(InputStream p0,yx1 p1){
       return c.parseFrom(GetStateResult.DEFAULT_INSTANCE, p0, p1);
    }
    public static GetStateResult parseFrom(ByteBuffer p0){
       return c.parseFrom(GetStateResult.DEFAULT_INSTANCE, p0);
    }
    public static GetStateResult parseFrom(ByteBuffer p0,yx1 p1){
       return c.parseFrom(GetStateResult.DEFAULT_INSTANCE, p0, p1);
    }
    public static GetStateResult parseFrom(i80 p0){
       return c.parseFrom(GetStateResult.DEFAULT_INSTANCE, p0);
    }
    public static GetStateResult parseFrom(i80 p0,yx1 p1){
       return c.parseFrom(GetStateResult.DEFAULT_INSTANCE, p0, p1);
    }
    public static GetStateResult parseFrom(sh0 p0){
       return c.parseFrom(GetStateResult.DEFAULT_INSTANCE, p0);
    }
    public static GetStateResult parseFrom(sh0 p0,yx1 p1){
       return c.parseFrom(GetStateResult.DEFAULT_INSTANCE, p0, p1);
    }
    public static GetStateResult parseFrom(byte[] p0){
       return c.parseFrom(GetStateResult.DEFAULT_INSTANCE, p0);
    }
    public static GetStateResult parseFrom(byte[] p0,yx1 p1){
       return c.parseFrom(GetStateResult.DEFAULT_INSTANCE, p0, p1);
    }
    public static r75 parser(){
       return GetStateResult.DEFAULT_INSTANCE.getParserForType();
    }
    public static void q(GetStateResult p0,i80 p1){
       p0.setCountryCodeBytes(p1);
    }
    public static void r(GetStateResult p0,String p1){
       p0.setCurrentUser(p1);
    }
    public static void s(GetStateResult p0,i80 p1){
       p0.setCurrentUserBytes(p1);
    }
    private void setCanStream(boolean p0){
       this.canStream_ = p0;
    }
    private void setConnected(boolean p0){
       this.connected_ = p0;
    }
    private void setCountryCode(String p0){
       p0.getClass();
       this.countryCode_ = p0;
    }
    private void setCountryCodeBytes(i80 p0){
       a.checkByteStringIsUtf8(p0);
       this.countryCode_ = p0.r();
    }
    private void setCurrentUser(String p0){
       p0.getClass();
       this.currentUser_ = p0;
    }
    private void setCurrentUserBytes(i80 p0){
       a.checkByteStringIsUtf8(p0);
       this.currentUser_ = p0.r();
    }
    private void setLoggedIn(boolean p0){
       this.loggedIn_ = p0;
    }
    private void setLoggingIn(boolean p0){
       this.loggingIn_ = p0;
    }
    private void setLoggingOut(boolean p0){
       this.loggingOut_ = p0;
    }
    private void setPaymentState(String p0){
       p0.getClass();
       this.paymentState_ = p0;
    }
    private void setPaymentStateBytes(i80 p0){
       a.checkByteStringIsUtf8(p0);
       this.paymentState_ = p0.r();
    }
    private void setProductType(String p0){
       p0.getClass();
       this.productType_ = p0;
    }
    private void setProductTypeBytes(i80 p0){
       a.checkByteStringIsUtf8(p0);
       this.productType_ = p0.r();
    }
    public static void t(GetStateResult p0,boolean p1){
       p0.setLoggedIn(p1);
    }
    public static void u(GetStateResult p0,boolean p1){
       p0.setLoggingIn(p1);
    }
    public static void v(GetStateResult p0,boolean p1){
       p0.setLoggingOut(p1);
    }
    public static void w(GetStateResult p0,String p1){
       p0.setPaymentState(p1);
    }
    public static void x(GetStateResult p0,i80 p1){
       p0.setPaymentStateBytes(p1);
    }
    public static void y(GetStateResult p0,String p1){
       p0.setProductType(p1);
    }
    public static void z(GetStateResult p0,i80 p1){
       p0.setProductTypeBytes(p1);
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
             Object[] objArray = new Object[9];
             objArray[i] = "loggedIn_";
             objArray[b] = "loggingIn_";
             objArray[2] = "loggingOut_";
             objArray[3] = "currentUser_";
             objArray[4] = "connected_";
             objArray[5] = "paymentState_";
             objArray[6] = "productType_";
             objArray[7] = "canStream_";
             objArray[8] = "countryCode_";
             return c.newMessageInfo(GetStateResult.DEFAULT_INSTANCE, "\xff\x02\xff\x02\t\xff\x02\xff\x02\xff\x02\xff\x02\x01\t\t\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\xff\x02\x01\x07\x02\x07\x03\x07\x04\x02\x02\x05\x07\x06\x02\x02\x07\x02\x02\b\x07\t\x02\x02", objArray);
           case 3:
             return new GetStateResult();
           case 4:
             return new GetStateResult$Builder(i);
           case 5:
             return GetStateResult.DEFAULT_INSTANCE;
           case 6:
             if ((pARSER = GetStateResult.PARSER) == null) {
                _monitor_enter(GetStateResult.class);
                if ((pARSER = GetStateResult.PARSER) == null) {
                   pARSER = new ii2(GetStateResult.DEFAULT_INSTANCE);
                   GetStateResult.PARSER = pARSER;
                }
                _monitor_exit(GetStateResult.class);
             }
             return pARSER;
             break;
           default:
             throw new UnsupportedOperationException();
       }
    }
    public boolean getCanStream(){
       return this.canStream_;
    }
    public boolean getConnected(){
       return this.connected_;
    }
    public String getCountryCode(){
       return this.countryCode_;
    }
    public i80 getCountryCodeBytes(){
       return i80.d(this.countryCode_);
    }
    public String getCurrentUser(){
       return this.currentUser_;
    }
    public i80 getCurrentUserBytes(){
       return i80.d(this.currentUser_);
    }
    public boolean getLoggedIn(){
       return this.loggedIn_;
    }
    public boolean getLoggingIn(){
       return this.loggingIn_;
    }
    public boolean getLoggingOut(){
       return this.loggingOut_;
    }
    public String getPaymentState(){
       return this.paymentState_;
    }
    public i80 getPaymentStateBytes(){
       return i80.d(this.paymentState_);
    }
    public String getProductType(){
       return this.productType_;
    }
    public i80 getProductTypeBytes(){
       return i80.d(this.productType_);
    }
}

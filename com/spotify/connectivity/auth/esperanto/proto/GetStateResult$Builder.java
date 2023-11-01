package com.spotify.connectivity.auth.esperanto.proto.GetStateResult$Builder;
import com.spotify.connectivity.auth.esperanto.proto.GetStateResultOrBuilder;
import com.google.protobuf.b;
import com.spotify.connectivity.auth.esperanto.proto.GetStateResult;
import com.google.protobuf.c;
import java.lang.String;
import p.i80;

public final class GetStateResult$Builder extends b implements GetStateResultOrBuilder	// class@000638 from classes.dex
{

    private void GetStateResult$Builder(){
       super(GetStateResult.A());
    }
    public void GetStateResult$Builder(int p0){
       super();
    }
    public GetStateResult$Builder clearCanStream(){
       this.copyOnWrite();
       GetStateResult.e(this.instance);
       return this;
    }
    public GetStateResult$Builder clearConnected(){
       this.copyOnWrite();
       GetStateResult.f(this.instance);
       return this;
    }
    public GetStateResult$Builder clearCountryCode(){
       this.copyOnWrite();
       GetStateResult.g(this.instance);
       return this;
    }
    public GetStateResult$Builder clearCurrentUser(){
       this.copyOnWrite();
       GetStateResult.h(this.instance);
       return this;
    }
    public GetStateResult$Builder clearLoggedIn(){
       this.copyOnWrite();
       GetStateResult.i(this.instance);
       return this;
    }
    public GetStateResult$Builder clearLoggingIn(){
       this.copyOnWrite();
       GetStateResult.j(this.instance);
       return this;
    }
    public GetStateResult$Builder clearLoggingOut(){
       this.copyOnWrite();
       GetStateResult.k(this.instance);
       return this;
    }
    public GetStateResult$Builder clearPaymentState(){
       this.copyOnWrite();
       GetStateResult.l(this.instance);
       return this;
    }
    public GetStateResult$Builder clearProductType(){
       this.copyOnWrite();
       GetStateResult.m(this.instance);
       return this;
    }
    public boolean getCanStream(){
       return this.instance.getCanStream();
    }
    public boolean getConnected(){
       return this.instance.getConnected();
    }
    public String getCountryCode(){
       return this.instance.getCountryCode();
    }
    public i80 getCountryCodeBytes(){
       return this.instance.getCountryCodeBytes();
    }
    public String getCurrentUser(){
       return this.instance.getCurrentUser();
    }
    public i80 getCurrentUserBytes(){
       return this.instance.getCurrentUserBytes();
    }
    public boolean getLoggedIn(){
       return this.instance.getLoggedIn();
    }
    public boolean getLoggingIn(){
       return this.instance.getLoggingIn();
    }
    public boolean getLoggingOut(){
       return this.instance.getLoggingOut();
    }
    public String getPaymentState(){
       return this.instance.getPaymentState();
    }
    public i80 getPaymentStateBytes(){
       return this.instance.getPaymentStateBytes();
    }
    public String getProductType(){
       return this.instance.getProductType();
    }
    public i80 getProductTypeBytes(){
       return this.instance.getProductTypeBytes();
    }
    public GetStateResult$Builder setCanStream(boolean p0){
       this.copyOnWrite();
       GetStateResult.n(this.instance, p0);
       return this;
    }
    public GetStateResult$Builder setConnected(boolean p0){
       this.copyOnWrite();
       GetStateResult.o(this.instance, p0);
       return this;
    }
    public GetStateResult$Builder setCountryCode(String p0){
       this.copyOnWrite();
       GetStateResult.p(this.instance, p0);
       return this;
    }
    public GetStateResult$Builder setCountryCodeBytes(i80 p0){
       this.copyOnWrite();
       GetStateResult.q(this.instance, p0);
       return this;
    }
    public GetStateResult$Builder setCurrentUser(String p0){
       this.copyOnWrite();
       GetStateResult.r(this.instance, p0);
       return this;
    }
    public GetStateResult$Builder setCurrentUserBytes(i80 p0){
       this.copyOnWrite();
       GetStateResult.s(this.instance, p0);
       return this;
    }
    public GetStateResult$Builder setLoggedIn(boolean p0){
       this.copyOnWrite();
       GetStateResult.t(this.instance, p0);
       return this;
    }
    public GetStateResult$Builder setLoggingIn(boolean p0){
       this.copyOnWrite();
       GetStateResult.u(this.instance, p0);
       return this;
    }
    public GetStateResult$Builder setLoggingOut(boolean p0){
       this.copyOnWrite();
       GetStateResult.v(this.instance, p0);
       return this;
    }
    public GetStateResult$Builder setPaymentState(String p0){
       this.copyOnWrite();
       GetStateResult.w(this.instance, p0);
       return this;
    }
    public GetStateResult$Builder setPaymentStateBytes(i80 p0){
       this.copyOnWrite();
       GetStateResult.x(this.instance, p0);
       return this;
    }
    public GetStateResult$Builder setProductType(String p0){
       this.copyOnWrite();
       GetStateResult.y(this.instance, p0);
       return this;
    }
    public GetStateResult$Builder setProductTypeBytes(i80 p0){
       this.copyOnWrite();
       GetStateResult.z(this.instance, p0);
       return this;
    }
}

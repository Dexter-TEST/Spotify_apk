package com.spotify.connectivity.auth.storage.esperanto.proto.EsStoredUserInfo$NullableStoredUserInfo$Builder;
import com.spotify.connectivity.auth.storage.esperanto.proto.EsStoredUserInfo$NullableStoredUserInfoOrBuilder;
import com.google.protobuf.b;
import com.spotify.connectivity.auth.storage.esperanto.proto.EsStoredUserInfo$NullableStoredUserInfo;
import com.google.protobuf.c;
import p.un4;
import com.spotify.connectivity.auth.storage.esperanto.proto.EsStoredUserInfo$StoredUserInfo;
import com.spotify.connectivity.auth.storage.esperanto.proto.EsStoredUserInfo$NullableStoredUserInfo$UserInfoCase;
import com.spotify.connectivity.auth.storage.esperanto.proto.EsStoredUserInfo$StoredUserInfo$Builder;

public final class EsStoredUserInfo$NullableStoredUserInfo$Builder extends b implements EsStoredUserInfo$NullableStoredUserInfoOrBuilder	// class@000658 from classes.dex
{

    private void EsStoredUserInfo$NullableStoredUserInfo$Builder(){
       super(EsStoredUserInfo$NullableStoredUserInfo.l());
    }
    public void EsStoredUserInfo$NullableStoredUserInfo$Builder(int p0){
       super();
    }
    public EsStoredUserInfo$NullableStoredUserInfo$Builder clearNull(){
       this.copyOnWrite();
       EsStoredUserInfo$NullableStoredUserInfo.e(this.instance);
       return this;
    }
    public EsStoredUserInfo$NullableStoredUserInfo$Builder clearStoredUserInfo(){
       this.copyOnWrite();
       EsStoredUserInfo$NullableStoredUserInfo.f(this.instance);
       return this;
    }
    public EsStoredUserInfo$NullableStoredUserInfo$Builder clearUserInfo(){
       this.copyOnWrite();
       EsStoredUserInfo$NullableStoredUserInfo.g(this.instance);
       return this;
    }
    public un4 getNull(){
       return this.instance.getNull();
    }
    public int getNullValue(){
       return this.instance.getNullValue();
    }
    public EsStoredUserInfo$StoredUserInfo getStoredUserInfo(){
       return this.instance.getStoredUserInfo();
    }
    public EsStoredUserInfo$NullableStoredUserInfo$UserInfoCase getUserInfoCase(){
       return this.instance.getUserInfoCase();
    }
    public boolean hasNull(){
       return this.instance.hasNull();
    }
    public boolean hasStoredUserInfo(){
       return this.instance.hasStoredUserInfo();
    }
    public EsStoredUserInfo$NullableStoredUserInfo$Builder mergeStoredUserInfo(EsStoredUserInfo$StoredUserInfo p0){
       this.copyOnWrite();
       EsStoredUserInfo$NullableStoredUserInfo.h(this.instance, p0);
       return this;
    }
    public EsStoredUserInfo$NullableStoredUserInfo$Builder setNull(un4 p0){
       this.copyOnWrite();
       EsStoredUserInfo$NullableStoredUserInfo.i(this.instance, p0);
       return this;
    }
    public EsStoredUserInfo$NullableStoredUserInfo$Builder setNullValue(int p0){
       this.copyOnWrite();
       EsStoredUserInfo$NullableStoredUserInfo.j(this.instance, p0);
       return this;
    }
    public EsStoredUserInfo$NullableStoredUserInfo$Builder setStoredUserInfo(EsStoredUserInfo$StoredUserInfo$Builder p0){
       this.copyOnWrite();
       EsStoredUserInfo$NullableStoredUserInfo.k(this.instance, p0.build());
       return this;
    }
    public EsStoredUserInfo$NullableStoredUserInfo$Builder setStoredUserInfo(EsStoredUserInfo$StoredUserInfo p0){
       this.copyOnWrite();
       EsStoredUserInfo$NullableStoredUserInfo.k(this.instance, p0);
       return this;
    }
}

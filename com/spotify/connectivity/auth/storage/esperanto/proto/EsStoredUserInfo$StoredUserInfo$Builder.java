package com.spotify.connectivity.auth.storage.esperanto.proto.EsStoredUserInfo$StoredUserInfo$Builder;
import com.spotify.connectivity.auth.storage.esperanto.proto.EsStoredUserInfo$StoredUserInfoOrBuilder;
import com.google.protobuf.b;
import com.spotify.connectivity.auth.storage.esperanto.proto.EsStoredUserInfo$StoredUserInfo;
import com.google.protobuf.c;
import com.spotify.connectivity.auth.common.esperanto.proto.EsAuthBlob$AuthBlob;
import java.lang.String;
import p.i80;
import com.spotify.connectivity.auth.common.esperanto.proto.EsAuthBlob$AuthBlob$Builder;

public final class EsStoredUserInfo$StoredUserInfo$Builder extends b implements EsStoredUserInfo$StoredUserInfoOrBuilder	// class@00065c from classes.dex
{

    private void EsStoredUserInfo$StoredUserInfo$Builder(){
       super(EsStoredUserInfo$StoredUserInfo.k());
    }
    public void EsStoredUserInfo$StoredUserInfo$Builder(int p0){
       super();
    }
    public EsStoredUserInfo$StoredUserInfo$Builder clearAuthBlob(){
       this.copyOnWrite();
       EsStoredUserInfo$StoredUserInfo.e(this.instance);
       return this;
    }
    public EsStoredUserInfo$StoredUserInfo$Builder clearUsername(){
       this.copyOnWrite();
       EsStoredUserInfo$StoredUserInfo.f(this.instance);
       return this;
    }
    public EsAuthBlob$AuthBlob getAuthBlob(){
       return this.instance.getAuthBlob();
    }
    public String getUsername(){
       return this.instance.getUsername();
    }
    public i80 getUsernameBytes(){
       return this.instance.getUsernameBytes();
    }
    public boolean hasAuthBlob(){
       return this.instance.hasAuthBlob();
    }
    public EsStoredUserInfo$StoredUserInfo$Builder mergeAuthBlob(EsAuthBlob$AuthBlob p0){
       this.copyOnWrite();
       EsStoredUserInfo$StoredUserInfo.g(this.instance, p0);
       return this;
    }
    public EsStoredUserInfo$StoredUserInfo$Builder setAuthBlob(EsAuthBlob$AuthBlob$Builder p0){
       this.copyOnWrite();
       EsStoredUserInfo$StoredUserInfo.h(this.instance, p0.build());
       return this;
    }
    public EsStoredUserInfo$StoredUserInfo$Builder setAuthBlob(EsAuthBlob$AuthBlob p0){
       this.copyOnWrite();
       EsStoredUserInfo$StoredUserInfo.h(this.instance, p0);
       return this;
    }
    public EsStoredUserInfo$StoredUserInfo$Builder setUsername(String p0){
       this.copyOnWrite();
       EsStoredUserInfo$StoredUserInfo.i(this.instance, p0);
       return this;
    }
    public EsStoredUserInfo$StoredUserInfo$Builder setUsernameBytes(i80 p0){
       this.copyOnWrite();
       EsStoredUserInfo$StoredUserInfo.j(this.instance, p0);
       return this;
    }
}

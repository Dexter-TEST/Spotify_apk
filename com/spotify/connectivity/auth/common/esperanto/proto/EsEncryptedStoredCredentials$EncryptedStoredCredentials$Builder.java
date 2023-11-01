package com.spotify.connectivity.auth.common.esperanto.proto.EsEncryptedStoredCredentials$EncryptedStoredCredentials$Builder;
import com.spotify.connectivity.auth.common.esperanto.proto.EsEncryptedStoredCredentials$EncryptedStoredCredentialsOrBuilder;
import com.google.protobuf.b;
import com.spotify.connectivity.auth.common.esperanto.proto.EsEncryptedStoredCredentials$EncryptedStoredCredentials;
import com.google.protobuf.c;
import p.i80;
import java.lang.String;

public final class EsEncryptedStoredCredentials$EncryptedStoredCredentials$Builder extends b implements EsEncryptedStoredCredentials$EncryptedStoredCredentialsOrBuilder	// class@00061d from classes.dex
{

    private void EsEncryptedStoredCredentials$EncryptedStoredCredentials$Builder(){
       super(EsEncryptedStoredCredentials$EncryptedStoredCredentials.m());
    }
    public void EsEncryptedStoredCredentials$EncryptedStoredCredentials$Builder(int p0){
       super();
    }
    public EsEncryptedStoredCredentials$EncryptedStoredCredentials$Builder clearAuthBlob(){
       this.copyOnWrite();
       EsEncryptedStoredCredentials$EncryptedStoredCredentials.e(this.instance);
       return this;
    }
    public EsEncryptedStoredCredentials$EncryptedStoredCredentials$Builder clearDeviceId(){
       this.copyOnWrite();
       EsEncryptedStoredCredentials$EncryptedStoredCredentials.f(this.instance);
       return this;
    }
    public EsEncryptedStoredCredentials$EncryptedStoredCredentials$Builder clearUsername(){
       this.copyOnWrite();
       EsEncryptedStoredCredentials$EncryptedStoredCredentials.g(this.instance);
       return this;
    }
    public i80 getAuthBlob(){
       return this.instance.getAuthBlob();
    }
    public String getDeviceId(){
       return this.instance.getDeviceId();
    }
    public i80 getDeviceIdBytes(){
       return this.instance.getDeviceIdBytes();
    }
    public String getUsername(){
       return this.instance.getUsername();
    }
    public i80 getUsernameBytes(){
       return this.instance.getUsernameBytes();
    }
    public EsEncryptedStoredCredentials$EncryptedStoredCredentials$Builder setAuthBlob(i80 p0){
       this.copyOnWrite();
       EsEncryptedStoredCredentials$EncryptedStoredCredentials.h(this.instance, p0);
       return this;
    }
    public EsEncryptedStoredCredentials$EncryptedStoredCredentials$Builder setDeviceId(String p0){
       this.copyOnWrite();
       EsEncryptedStoredCredentials$EncryptedStoredCredentials.i(this.instance, p0);
       return this;
    }
    public EsEncryptedStoredCredentials$EncryptedStoredCredentials$Builder setDeviceIdBytes(i80 p0){
       this.copyOnWrite();
       EsEncryptedStoredCredentials$EncryptedStoredCredentials.j(this.instance, p0);
       return this;
    }
    public EsEncryptedStoredCredentials$EncryptedStoredCredentials$Builder setUsername(String p0){
       this.copyOnWrite();
       EsEncryptedStoredCredentials$EncryptedStoredCredentials.k(this.instance, p0);
       return this;
    }
    public EsEncryptedStoredCredentials$EncryptedStoredCredentials$Builder setUsernameBytes(i80 p0){
       this.copyOnWrite();
       EsEncryptedStoredCredentials$EncryptedStoredCredentials.l(this.instance, p0);
       return this;
    }
}

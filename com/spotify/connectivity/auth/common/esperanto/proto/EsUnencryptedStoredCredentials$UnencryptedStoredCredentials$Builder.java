package com.spotify.connectivity.auth.common.esperanto.proto.EsUnencryptedStoredCredentials$UnencryptedStoredCredentials$Builder;
import com.spotify.connectivity.auth.common.esperanto.proto.EsUnencryptedStoredCredentials$UnencryptedStoredCredentialsOrBuilder;
import com.google.protobuf.b;
import com.spotify.connectivity.auth.common.esperanto.proto.EsUnencryptedStoredCredentials$UnencryptedStoredCredentials;
import com.google.protobuf.c;
import p.i80;
import java.lang.String;

public final class EsUnencryptedStoredCredentials$UnencryptedStoredCredentials$Builder extends b implements EsUnencryptedStoredCredentials$UnencryptedStoredCredentialsOrBuilder	// class@000622 from classes.dex
{

    private void EsUnencryptedStoredCredentials$UnencryptedStoredCredentials$Builder(){
       super(EsUnencryptedStoredCredentials$UnencryptedStoredCredentials.j());
    }
    public void EsUnencryptedStoredCredentials$UnencryptedStoredCredentials$Builder(int p0){
       super();
    }
    public EsUnencryptedStoredCredentials$UnencryptedStoredCredentials$Builder clearStoredCredentials(){
       this.copyOnWrite();
       EsUnencryptedStoredCredentials$UnencryptedStoredCredentials.e(this.instance);
       return this;
    }
    public EsUnencryptedStoredCredentials$UnencryptedStoredCredentials$Builder clearUsername(){
       this.copyOnWrite();
       EsUnencryptedStoredCredentials$UnencryptedStoredCredentials.f(this.instance);
       return this;
    }
    public i80 getStoredCredentials(){
       return this.instance.getStoredCredentials();
    }
    public String getUsername(){
       return this.instance.getUsername();
    }
    public i80 getUsernameBytes(){
       return this.instance.getUsernameBytes();
    }
    public EsUnencryptedStoredCredentials$UnencryptedStoredCredentials$Builder setStoredCredentials(i80 p0){
       this.copyOnWrite();
       EsUnencryptedStoredCredentials$UnencryptedStoredCredentials.g(this.instance, p0);
       return this;
    }
    public EsUnencryptedStoredCredentials$UnencryptedStoredCredentials$Builder setUsername(String p0){
       this.copyOnWrite();
       EsUnencryptedStoredCredentials$UnencryptedStoredCredentials.h(this.instance, p0);
       return this;
    }
    public EsUnencryptedStoredCredentials$UnencryptedStoredCredentials$Builder setUsernameBytes(i80 p0){
       this.copyOnWrite();
       EsUnencryptedStoredCredentials$UnencryptedStoredCredentials.i(this.instance, p0);
       return this;
    }
}

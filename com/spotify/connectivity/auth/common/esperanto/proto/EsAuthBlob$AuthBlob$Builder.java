package com.spotify.connectivity.auth.common.esperanto.proto.EsAuthBlob$AuthBlob$Builder;
import com.spotify.connectivity.auth.common.esperanto.proto.EsAuthBlob$AuthBlobOrBuilder;
import com.google.protobuf.b;
import com.spotify.connectivity.auth.common.esperanto.proto.EsAuthBlob$AuthBlob;
import com.google.protobuf.c;
import com.spotify.connectivity.auth.common.esperanto.proto.EsAuthBlob$AuthBlob$BlobCase;
import com.spotify.connectivity.auth.common.esperanto.proto.EsEncryptedStoredCredentials$EncryptedStoredCredentials;
import com.spotify.connectivity.auth.common.esperanto.proto.EsUnencryptedStoredCredentials$UnencryptedStoredCredentials;
import com.spotify.connectivity.auth.common.esperanto.proto.EsEncryptedStoredCredentials$EncryptedStoredCredentials$Builder;
import com.spotify.connectivity.auth.common.esperanto.proto.EsUnencryptedStoredCredentials$UnencryptedStoredCredentials$Builder;

public final class EsAuthBlob$AuthBlob$Builder extends b implements EsAuthBlob$AuthBlobOrBuilder	// class@000618 from classes.dex
{

    private void EsAuthBlob$AuthBlob$Builder(){
       super(EsAuthBlob$AuthBlob.l());
    }
    public void EsAuthBlob$AuthBlob$Builder(int p0){
       super();
    }
    public EsAuthBlob$AuthBlob$Builder clearBlob(){
       this.copyOnWrite();
       EsAuthBlob$AuthBlob.e(this.instance);
       return this;
    }
    public EsAuthBlob$AuthBlob$Builder clearStoredCredentials(){
       this.copyOnWrite();
       EsAuthBlob$AuthBlob.f(this.instance);
       return this;
    }
    public EsAuthBlob$AuthBlob$Builder clearUnencryptedStoredCredentials(){
       this.copyOnWrite();
       EsAuthBlob$AuthBlob.g(this.instance);
       return this;
    }
    public EsAuthBlob$AuthBlob$BlobCase getBlobCase(){
       return this.instance.getBlobCase();
    }
    public EsEncryptedStoredCredentials$EncryptedStoredCredentials getStoredCredentials(){
       return this.instance.getStoredCredentials();
    }
    public EsUnencryptedStoredCredentials$UnencryptedStoredCredentials getUnencryptedStoredCredentials(){
       return this.instance.getUnencryptedStoredCredentials();
    }
    public boolean hasStoredCredentials(){
       return this.instance.hasStoredCredentials();
    }
    public boolean hasUnencryptedStoredCredentials(){
       return this.instance.hasUnencryptedStoredCredentials();
    }
    public EsAuthBlob$AuthBlob$Builder mergeStoredCredentials(EsEncryptedStoredCredentials$EncryptedStoredCredentials p0){
       this.copyOnWrite();
       EsAuthBlob$AuthBlob.h(this.instance, p0);
       return this;
    }
    public EsAuthBlob$AuthBlob$Builder mergeUnencryptedStoredCredentials(EsUnencryptedStoredCredentials$UnencryptedStoredCredentials p0){
       this.copyOnWrite();
       EsAuthBlob$AuthBlob.i(this.instance, p0);
       return this;
    }
    public EsAuthBlob$AuthBlob$Builder setStoredCredentials(EsEncryptedStoredCredentials$EncryptedStoredCredentials$Builder p0){
       this.copyOnWrite();
       EsAuthBlob$AuthBlob.j(this.instance, p0.build());
       return this;
    }
    public EsAuthBlob$AuthBlob$Builder setStoredCredentials(EsEncryptedStoredCredentials$EncryptedStoredCredentials p0){
       this.copyOnWrite();
       EsAuthBlob$AuthBlob.j(this.instance, p0);
       return this;
    }
    public EsAuthBlob$AuthBlob$Builder setUnencryptedStoredCredentials(EsUnencryptedStoredCredentials$UnencryptedStoredCredentials$Builder p0){
       this.copyOnWrite();
       EsAuthBlob$AuthBlob.k(this.instance, p0.build());
       return this;
    }
    public EsAuthBlob$AuthBlob$Builder setUnencryptedStoredCredentials(EsUnencryptedStoredCredentials$UnencryptedStoredCredentials p0){
       this.copyOnWrite();
       EsAuthBlob$AuthBlob.k(this.instance, p0);
       return this;
    }
}

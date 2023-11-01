package com.spotify.connectivity.auth.storage.esperanto.proto.EsAuthStorageResult$AuthStorageResult$Builder;
import com.spotify.connectivity.auth.storage.esperanto.proto.EsAuthStorageResult$AuthStorageResultOrBuilder;
import com.google.protobuf.b;
import com.spotify.connectivity.auth.storage.esperanto.proto.EsAuthStorageResult$AuthStorageResult;
import com.google.protobuf.c;
import com.spotify.connectivity.auth.storage.esperanto.proto.EsAuthStorageResult$AuthStorageResult$Result;

public final class EsAuthStorageResult$AuthStorageResult$Builder extends b implements EsAuthStorageResult$AuthStorageResultOrBuilder	// class@000650 from classes.dex
{

    private void EsAuthStorageResult$AuthStorageResult$Builder(){
       super(EsAuthStorageResult$AuthStorageResult.h());
    }
    public void EsAuthStorageResult$AuthStorageResult$Builder(int p0){
       super();
    }
    public EsAuthStorageResult$AuthStorageResult$Builder clearResult(){
       this.copyOnWrite();
       EsAuthStorageResult$AuthStorageResult.e(this.instance);
       return this;
    }
    public EsAuthStorageResult$AuthStorageResult$Result getResult(){
       return this.instance.getResult();
    }
    public int getResultValue(){
       return this.instance.getResultValue();
    }
    public EsAuthStorageResult$AuthStorageResult$Builder setResult(EsAuthStorageResult$AuthStorageResult$Result p0){
       this.copyOnWrite();
       EsAuthStorageResult$AuthStorageResult.f(this.instance, p0);
       return this;
    }
    public EsAuthStorageResult$AuthStorageResult$Builder setResultValue(int p0){
       this.copyOnWrite();
       EsAuthStorageResult$AuthStorageResult.g(this.instance, p0);
       return this;
    }
}

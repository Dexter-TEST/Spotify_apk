package com.spotify.connectivity.auth.storage.esperanto.proto.EsAuthStorageResult$AuthStorageResult$Result$ResultVerifier;
import p.vb3;
import java.lang.Object;
import com.spotify.connectivity.auth.storage.esperanto.proto.EsAuthStorageResult$AuthStorageResult$Result;

final class EsAuthStorageResult$AuthStorageResult$Result$ResultVerifier implements vb3	// class@000652 from classes.dex
{
    static final vb3 INSTANCE;

    static {
       EsAuthStorageResult$AuthStorageResult$Result$ResultVerifier.INSTANCE = new EsAuthStorageResult$AuthStorageResult$Result$ResultVerifier();
    }
    private void EsAuthStorageResult$AuthStorageResult$Result$ResultVerifier(){
       super();
    }
    public boolean isInRange(int p0){
       boolean b = (EsAuthStorageResult$AuthStorageResult$Result.forNumber(p0) != null)? true: false;
       return b;
    }
}

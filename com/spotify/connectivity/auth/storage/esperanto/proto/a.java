package com.spotify.connectivity.auth.storage.esperanto.proto.a;
import p.yf2;
import java.lang.Object;
import com.spotify.connectivity.auth.storage.esperanto.proto.EsAuthStorageResult$AuthStorageResult;
import com.spotify.connectivity.auth.storage.esperanto.proto.AuthStorageClientService;
import com.spotify.connectivity.auth.storage.esperanto.proto.EsStoredUserInfo$NullableStoredUserInfo;
import com.spotify.connectivity.auth.storage.esperanto.proto.AuthStorageClientClientImpl;

public final class a implements yf2	// class@000660 from classes.dex
{
    public final int a;

    public void a(int p0){
       this.a = p0;
       super();
    }
    public final Object apply(Object p0){
       switch (this.a){
           case 0:
             return AuthStorageClientClientImpl.d(p0);
           case 1:
             return AuthStorageClientClientImpl.b(p0);
           case 2:
             return AuthStorageClientClientImpl.a(p0);
           case 3:
             return AuthStorageClientClientImpl.c(p0);
           case 4:
             return AuthStorageClientService.d(p0);
           case 5:
             return AuthStorageClientService.c(p0);
           case 6:
             return AuthStorageClientService.b(p0);
           default:
             return AuthStorageClientService.a(p0);
       }
    }
}

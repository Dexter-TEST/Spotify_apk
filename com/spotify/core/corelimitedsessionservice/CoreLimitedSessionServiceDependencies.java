package com.spotify.core.corelimitedsessionservice.CoreLimitedSessionServiceDependencies;
import io.reactivex.rxjava3.core.Observable;
import com.spotify.connectivity.connectivityapi.ConnectivityApi;
import com.spotify.connectivity.connectivitysessionapi.ConnectivitySessionApi;
import com.spotify.core.coreapi.CoreApi;
import p.pw0;
import p.sw0;
import com.spotify.clientfoundations.core.corelimitedimpl.LimitedAuthenticatedScopeConfiguration;
import p.lt5;
import com.spotify.connectivity.sessionapi.SessionApi;
import p.re6;
import p.fe7;

public interface abstract CoreLimitedSessionServiceDependencies	// class@00084f from classes.dex
{

    Observable getAppForegroundObservable();
    ConnectivityApi getConnectivityApi();
    ConnectivitySessionApi getConnectivitySessionApi();
    CoreApi getCoreApi();
    pw0 getCorePreferencesApi();
    sw0 getCoreThreadingApi();
    LimitedAuthenticatedScopeConfiguration getLimitedAuthenticatedScopeConfiguration();
    lt5 getRemoteConfigurationApi();
    SessionApi getSessionApi();
    re6 getSharedCosmosRouterApi();
    fe7 getUserDirectoryApi();
}

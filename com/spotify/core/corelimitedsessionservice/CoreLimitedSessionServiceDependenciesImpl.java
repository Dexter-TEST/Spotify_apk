package com.spotify.core.corelimitedsessionservice.CoreLimitedSessionServiceDependenciesImpl;
import com.spotify.core.corelimitedsessionservice.CoreLimitedSessionServiceDependencies;
import p.sw0;
import p.re6;
import p.pw0;
import p.lt5;
import com.spotify.connectivity.connectivityapi.ConnectivityApi;
import com.spotify.connectivity.sessionapi.SessionApi;
import com.spotify.core.coreapi.CoreApi;
import com.spotify.connectivity.connectivitysessionapi.ConnectivitySessionApi;
import p.fe7;
import com.spotify.clientfoundations.core.corelimitedimpl.LimitedAuthenticatedScopeConfiguration;
import io.reactivex.rxjava3.core.Observable;
import java.lang.Object;
import java.lang.String;
import p.co5;

public final class CoreLimitedSessionServiceDependenciesImpl implements CoreLimitedSessionServiceDependencies	// class@000850 from classes.dex
{
    private final Observable appForegroundObservable;
    private final ConnectivityApi connectivityApi;
    private final ConnectivitySessionApi connectivitySessionApi;
    private final CoreApi coreApi;
    private final pw0 corePreferencesApi;
    private final sw0 coreThreadingApi;
    private final LimitedAuthenticatedScopeConfiguration limitedAuthenticatedScopeConfiguration;
    private final lt5 remoteConfigurationApi;
    private final SessionApi sessionApi;
    private final re6 sharedCosmosRouterApi;
    private final fe7 userDirectoryApi;

    public void CoreLimitedSessionServiceDependenciesImpl(sw0 p0,re6 p1,pw0 p2,lt5 p3,ConnectivityApi p4,SessionApi p5,CoreApi p6,ConnectivitySessionApi p7,fe7 p8,LimitedAuthenticatedScopeConfiguration p9,Observable p10){
       co5.o(p0, "coreThreadingApi");
       co5.o(p1, "sharedCosmosRouterApi");
       co5.o(p2, "corePreferencesApi");
       co5.o(p3, "remoteConfigurationApi");
       co5.o(p4, "connectivityApi");
       co5.o(p5, "sessionApi");
       co5.o(p6, "coreApi");
       co5.o(p7, "connectivitySessionApi");
       co5.o(p8, "userDirectoryApi");
       co5.o(p9, "limitedAuthenticatedScopeConfiguration");
       co5.o(p10, "appForegroundObservable");
       super();
       this.coreThreadingApi = p0;
       this.sharedCosmosRouterApi = p1;
       this.corePreferencesApi = p2;
       this.remoteConfigurationApi = p3;
       this.connectivityApi = p4;
       this.sessionApi = p5;
       this.coreApi = p6;
       this.connectivitySessionApi = p7;
       this.userDirectoryApi = p8;
       this.limitedAuthenticatedScopeConfiguration = p9;
       this.appForegroundObservable = p10;
    }
    public Observable getAppForegroundObservable(){
       return this.appForegroundObservable;
    }
    public ConnectivityApi getConnectivityApi(){
       return this.connectivityApi;
    }
    public ConnectivitySessionApi getConnectivitySessionApi(){
       return this.connectivitySessionApi;
    }
    public CoreApi getCoreApi(){
       return this.coreApi;
    }
    public pw0 getCorePreferencesApi(){
       return this.corePreferencesApi;
    }
    public sw0 getCoreThreadingApi(){
       return this.coreThreadingApi;
    }
    public LimitedAuthenticatedScopeConfiguration getLimitedAuthenticatedScopeConfiguration(){
       return this.limitedAuthenticatedScopeConfiguration;
    }
    public lt5 getRemoteConfigurationApi(){
       return this.remoteConfigurationApi;
    }
    public SessionApi getSessionApi(){
       return this.sessionApi;
    }
    public re6 getSharedCosmosRouterApi(){
       return this.sharedCosmosRouterApi;
    }
    public fe7 getUserDirectoryApi(){
       return this.userDirectoryApi;
    }
}

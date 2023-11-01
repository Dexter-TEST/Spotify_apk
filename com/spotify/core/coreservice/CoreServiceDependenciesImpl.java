package com.spotify.core.coreservice.CoreServiceDependenciesImpl;
import com.spotify.core.coreservice.CoreServiceDependencies;
import p.sw0;
import p.pw0;
import com.spotify.clientfoundations.core.coreimpl.ApplicationScopeConfiguration;
import com.spotify.connectivity.connectivityapi.ConnectivityApi;
import p.re6;
import com.spotify.eventsender.api.EventSenderCoreBridge;
import java.lang.Object;
import java.lang.String;
import p.co5;

public final class CoreServiceDependenciesImpl implements CoreServiceDependencies	// class@000861 from classes.dex
{
    private final ConnectivityApi connectivityApi;
    private final ApplicationScopeConfiguration coreApplicationScopeConfiguration;
    private final pw0 corePreferencesApi;
    private final sw0 coreThreadingApi;
    private final EventSenderCoreBridge eventSenderCoreBridge;
    private final re6 sharedCosmosRouterApi;

    public void CoreServiceDependenciesImpl(sw0 p0,pw0 p1,ApplicationScopeConfiguration p2,ConnectivityApi p3,re6 p4,EventSenderCoreBridge p5){
       co5.o(p0, "coreThreadingApi");
       co5.o(p1, "corePreferencesApi");
       co5.o(p2, "coreApplicationScopeConfiguration");
       co5.o(p3, "connectivityApi");
       co5.o(p4, "sharedCosmosRouterApi");
       co5.o(p5, "eventSenderCoreBridge");
       super();
       this.coreThreadingApi = p0;
       this.corePreferencesApi = p1;
       this.coreApplicationScopeConfiguration = p2;
       this.connectivityApi = p3;
       this.sharedCosmosRouterApi = p4;
       this.eventSenderCoreBridge = p5;
    }
    public ConnectivityApi getConnectivityApi(){
       return this.connectivityApi;
    }
    public ApplicationScopeConfiguration getCoreApplicationScopeConfiguration(){
       return this.coreApplicationScopeConfiguration;
    }
    public pw0 getCorePreferencesApi(){
       return this.corePreferencesApi;
    }
    public sw0 getCoreThreadingApi(){
       return this.coreThreadingApi;
    }
    public EventSenderCoreBridge getEventSenderCoreBridge(){
       return this.eventSenderCoreBridge;
    }
    public re6 getSharedCosmosRouterApi(){
       return this.sharedCosmosRouterApi;
    }
}

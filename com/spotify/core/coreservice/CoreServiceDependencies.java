package com.spotify.core.coreservice.CoreServiceDependencies;
import com.spotify.connectivity.connectivityapi.ConnectivityApi;
import com.spotify.clientfoundations.core.coreimpl.ApplicationScopeConfiguration;
import p.pw0;
import p.sw0;
import com.spotify.eventsender.api.EventSenderCoreBridge;
import p.re6;

public interface abstract CoreServiceDependencies	// class@000860 from classes.dex
{

    ConnectivityApi getConnectivityApi();
    ApplicationScopeConfiguration getCoreApplicationScopeConfiguration();
    pw0 getCorePreferencesApi();
    sw0 getCoreThreadingApi();
    EventSenderCoreBridge getEventSenderCoreBridge();
    re6 getSharedCosmosRouterApi();
}

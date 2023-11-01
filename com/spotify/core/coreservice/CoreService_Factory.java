package com.spotify.core.coreservice.CoreService_Factory;
import p.a02;
import p.tm5;
import java.lang.Object;
import p.sw0;
import p.pw0;
import com.spotify.clientfoundations.core.coreimpl.ApplicationScopeConfiguration;
import com.spotify.connectivity.connectivityapi.ConnectivityApi;
import p.re6;
import com.spotify.eventsender.api.EventSenderCoreBridge;
import com.spotify.core.coreservice.CoreService;

public final class CoreService_Factory implements a02	// class@000869 from classes.dex
{
    private final tm5 applicationScopeConfigurationProvider;
    private final tm5 connectivityApiProvider;
    private final tm5 corePreferencesApiProvider;
    private final tm5 coreThreadingApiProvider;
    private final tm5 eventSenderCoreBridgeProvider;
    private final tm5 sharedCosmosRouterApiProvider;

    public void CoreService_Factory(tm5 p0,tm5 p1,tm5 p2,tm5 p3,tm5 p4,tm5 p5){
       super();
       this.coreThreadingApiProvider = p0;
       this.corePreferencesApiProvider = p1;
       this.applicationScopeConfigurationProvider = p2;
       this.connectivityApiProvider = p3;
       this.sharedCosmosRouterApiProvider = p4;
       this.eventSenderCoreBridgeProvider = p5;
    }
    public static CoreService_Factory create(tm5 p0,tm5 p1,tm5 p2,tm5 p3,tm5 p4,tm5 p5){
       CoreService_Factory v7 = new CoreService_Factory(p0, p1, p2, p3, p4, p5);
       return v7;
    }
    public static CoreService newInstance(sw0 p0,pw0 p1,ApplicationScopeConfiguration p2,ConnectivityApi p3,re6 p4,EventSenderCoreBridge p5){
       CoreService v7 = new CoreService(p0, p1, p2, p3, p4, p5);
       return v7;
    }
    public CoreService get(){
       return CoreService_Factory.newInstance(this.coreThreadingApiProvider.get(), this.corePreferencesApiProvider.get(), this.applicationScopeConfigurationProvider.get(), this.connectivityApiProvider.get(), this.sharedCosmosRouterApiProvider.get(), this.eventSenderCoreBridgeProvider.get());
    }
    public Object get(){
       return this.get();
    }
}

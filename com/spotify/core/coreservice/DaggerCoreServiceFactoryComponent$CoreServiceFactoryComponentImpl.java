package com.spotify.core.coreservice.DaggerCoreServiceFactoryComponent$CoreServiceFactoryComponentImpl;
import com.spotify.core.coreservice.CoreServiceFactoryComponent;
import com.spotify.core.coreservice.CoreServiceDependencies;
import java.lang.Object;
import com.spotify.core.coreservice.DaggerCoreServiceFactoryComponent$1;
import com.spotify.core.coreservice.CoreService;
import p.sw0;
import p.co5;
import p.pw0;
import com.spotify.clientfoundations.core.coreimpl.ApplicationScopeConfiguration;
import com.spotify.connectivity.connectivityapi.ConnectivityApi;
import p.re6;
import com.spotify.eventsender.api.EventSenderCoreBridge;

final class DaggerCoreServiceFactoryComponent$CoreServiceFactoryComponentImpl implements CoreServiceFactoryComponent	// class@00086b from classes.dex
{
    private final CoreServiceDependencies coreServiceDependencies;
    private final DaggerCoreServiceFactoryComponent$CoreServiceFactoryComponentImpl coreServiceFactoryComponentImpl;

    private void DaggerCoreServiceFactoryComponent$CoreServiceFactoryComponentImpl(CoreServiceDependencies p0){
       super();
       this.coreServiceFactoryComponentImpl = this;
       this.coreServiceDependencies = p0;
    }
    public void DaggerCoreServiceFactoryComponent$CoreServiceFactoryComponentImpl(CoreServiceDependencies p0,DaggerCoreServiceFactoryComponent$1 p1){
       super(p0);
    }
    public CoreService coreService(){
       sw0 coreThreadin = this.coreServiceDependencies.getCoreThreadingApi();
       co5.m(coreThreadin);
       pw0 corePreferen = this.coreServiceDependencies.getCorePreferencesApi();
       co5.m(corePreferen);
       ApplicationScopeConfiguration coreApplicat = this.coreServiceDependencies.getCoreApplicationScopeConfiguration();
       co5.m(coreApplicat);
       ConnectivityApi connectivity = this.coreServiceDependencies.getConnectivityApi();
       co5.m(connectivity);
       re6 sharedCosmos = this.coreServiceDependencies.getSharedCosmosRouterApi();
       co5.m(sharedCosmos);
       EventSenderCoreBridge eventSenderC = this.coreServiceDependencies.getEventSenderCoreBridge();
       co5.m(eventSenderC);
       CoreService v7 = new CoreService(coreThreadin, corePreferen, coreApplicat, connectivity, sharedCosmos, eventSenderC);
       return v7;
    }
}

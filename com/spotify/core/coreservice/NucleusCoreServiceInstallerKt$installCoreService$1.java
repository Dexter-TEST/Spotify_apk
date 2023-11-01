package com.spotify.core.coreservice.NucleusCoreServiceInstallerKt$installCoreService$1;
import p.wf2;
import p.gi3;
import java.lang.Object;
import p.tb6;
import com.spotify.core.coreservice.CoreService;
import p.sw0;
import p.pw0;
import com.spotify.clientfoundations.core.coreimpl.ApplicationScopeConfiguration;
import com.spotify.connectivity.connectivityapi.ConnectivityApi;
import p.re6;
import com.spotify.eventsender.api.EventSenderCoreBridge;

final class NucleusCoreServiceInstallerKt$installCoreService$1 extends gi3 implements wf2	// class@00086e from classes.dex
{
    final wf2 $applicationScopeConfiguration;
    final wf2 $connectivityApi;
    final wf2 $corePreferencesApi;
    final wf2 $coreThreadingApi;
    final wf2 $eventSenderCoreBridge;
    final wf2 $sharedCosmosRouterApi;

    public void NucleusCoreServiceInstallerKt$installCoreService$1(wf2 p0,wf2 p1,wf2 p2,wf2 p3,wf2 p4,wf2 p5){
       this.$coreThreadingApi = p0;
       this.$corePreferencesApi = p1;
       this.$applicationScopeConfiguration = p2;
       this.$connectivityApi = p3;
       this.$sharedCosmosRouterApi = p4;
       this.$eventSenderCoreBridge = p5;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final tb6 invoke(){
       CoreService v7 = new CoreService(this.$coreThreadingApi.invoke(), this.$corePreferencesApi.invoke(), this.$applicationScopeConfiguration.invoke(), this.$connectivityApi.invoke(), this.$sharedCosmosRouterApi.invoke(), this.$eventSenderCoreBridge.invoke());
       return v7;
    }
}

package com.spotify.connectivity.connectivitysessionservice.NucleusConnectivitySessionServiceInstallerKt$installConnectivitySessionService$1;
import p.wf2;
import p.gi3;
import java.lang.Object;
import p.tb6;
import com.spotify.connectivity.connectivitysessionservice.ConnectivitySessionService;
import p.sw0;
import p.re6;
import com.spotify.connectivity.connectivityapi.ConnectivityApi;
import com.spotify.connectivity.AnalyticsDelegate;
import com.spotify.connectivity.AuthenticatedScopeConfiguration;
import com.spotify.connectivity.sessionapi.SessionApi;
import com.spotify.connectivity.logoutanalyticsdelegate.AuthAnalyticsDelegate;
import com.spotify.connectivity.pubsub.PubSubClient;
import p.r45;

final class NucleusConnectivitySessionServiceInstallerKt$installConnectivitySessionService$1 extends gi3 implements wf2	// class@0006f1 from classes.dex
{
    final wf2 $analyticsDelegate;
    final wf2 $authAnalyticsDelegate;
    final wf2 $authenticatedScopeConfiguration;
    final wf2 $connectivityApi;
    final wf2 $coreThreadingApi;
    final wf2 $pubSubClient;
    final wf2 $sessionApi;
    final wf2 $sharedCosmosRouterApi;
    final wf2 $snapshotIdResolver;

    public void NucleusConnectivitySessionServiceInstallerKt$installConnectivitySessionService$1(wf2 p0,wf2 p1,wf2 p2,wf2 p3,wf2 p4,wf2 p5,wf2 p6,wf2 p7,wf2 p8){
       this.$coreThreadingApi = p0;
       this.$sharedCosmosRouterApi = p1;
       this.$connectivityApi = p2;
       this.$analyticsDelegate = p3;
       this.$authenticatedScopeConfiguration = p4;
       this.$sessionApi = p5;
       this.$authAnalyticsDelegate = p6;
       this.$pubSubClient = p7;
       this.$snapshotIdResolver = p8;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final tb6 invoke(){
       ConnectivitySessionService v10 = new ConnectivitySessionService(this.$coreThreadingApi.invoke(), this.$sharedCosmosRouterApi.invoke(), this.$connectivityApi.invoke(), this.$analyticsDelegate.invoke(), this.$authenticatedScopeConfiguration.invoke(), this.$sessionApi.invoke(), this.$authAnalyticsDelegate.invoke(), this.$pubSubClient.invoke(), this.$snapshotIdResolver.invoke());
       return v10;
    }
}

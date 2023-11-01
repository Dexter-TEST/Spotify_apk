package com.spotify.connectivity.sessionservice.NucleusSessionServiceInstallerKt$installSessionService$1;
import p.wf2;
import p.gi3;
import java.lang.Object;
import p.tb6;
import com.spotify.connectivity.sessionservice.SessionService;
import com.spotify.connectivity.sessionservice.TemporarySessionLoginFlowDependencies;
import p.sw0;
import com.spotify.connectivity.AnalyticsDelegate;
import com.spotify.connectivity.connectivityapi.ConnectivityApi;
import com.spotify.core.coreapi.CoreApi;
import com.spotify.connectivity.auth.NativeLoginControllerConfiguration;
import p.vg0;

final class NucleusSessionServiceInstallerKt$installSessionService$1 extends gi3 implements wf2	// class@00081a from classes.dex
{
    final wf2 $analyticsDelegate;
    final wf2 $clientInfo;
    final wf2 $connectivityApi;
    final wf2 $coreApi;
    final wf2 $coreThreadingApi;
    final wf2 $loginControllerConfiguration;
    final wf2 $temporarySessionLoginFlowDependencies;

    public void NucleusSessionServiceInstallerKt$installSessionService$1(wf2 p0,wf2 p1,wf2 p2,wf2 p3,wf2 p4,wf2 p5,wf2 p6){
       this.$temporarySessionLoginFlowDependencies = p0;
       this.$coreThreadingApi = p1;
       this.$analyticsDelegate = p2;
       this.$connectivityApi = p3;
       this.$coreApi = p4;
       this.$loginControllerConfiguration = p5;
       this.$clientInfo = p6;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final tb6 invoke(){
       SessionService v8 = new SessionService(this.$temporarySessionLoginFlowDependencies.invoke(), this.$coreThreadingApi.invoke(), this.$analyticsDelegate.invoke(), this.$connectivityApi.invoke(), this.$coreApi.invoke(), this.$loginControllerConfiguration.invoke(), this.$clientInfo.invoke());
       return v8;
    }
}

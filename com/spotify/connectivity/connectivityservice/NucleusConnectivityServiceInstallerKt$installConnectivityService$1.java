package com.spotify.connectivity.connectivityservice.NucleusConnectivityServiceInstallerKt$installConnectivityService$1;
import p.wf2;
import p.gi3;
import java.lang.Object;
import p.tb6;
import com.spotify.connectivity.connectivityservice.ConnectivityService;
import com.spotify.connectivity.AnalyticsDelegate;
import p.sw0;
import p.pw0;
import com.spotify.connectivity.ApplicationScopeConfiguration;
import com.spotify.connectivity.MobileDeviceInfo;
import p.re6;
import android.content.Context;
import p.g15;
import io.reactivex.rxjava3.core.Observable;

final class NucleusConnectivityServiceInstallerKt$installConnectivityService$1 extends gi3 implements wf2	// class@0006e5 from classes.dex
{
    final wf2 $analyticsDelegate;
    final wf2 $connectionTypeObservable;
    final wf2 $connectivityApplicationScopeConfiguration;
    final wf2 $context;
    final wf2 $corePreferencesApi;
    final wf2 $coreThreadingApi;
    final wf2 $mobileDeviceInfo;
    final wf2 $okHttpClient;
    final wf2 $sharedCosmosRouterApi;

    public void NucleusConnectivityServiceInstallerKt$installConnectivityService$1(wf2 p0,wf2 p1,wf2 p2,wf2 p3,wf2 p4,wf2 p5,wf2 p6,wf2 p7,wf2 p8){
       this.$analyticsDelegate = p0;
       this.$coreThreadingApi = p1;
       this.$corePreferencesApi = p2;
       this.$connectivityApplicationScopeConfiguration = p3;
       this.$mobileDeviceInfo = p4;
       this.$sharedCosmosRouterApi = p5;
       this.$context = p6;
       this.$okHttpClient = p7;
       this.$connectionTypeObservable = p8;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final tb6 invoke(){
       ConnectivityService v10 = new ConnectivityService(this.$analyticsDelegate.invoke(), this.$coreThreadingApi.invoke(), this.$corePreferencesApi.invoke(), this.$connectivityApplicationScopeConfiguration.invoke(), this.$mobileDeviceInfo.invoke(), this.$sharedCosmosRouterApi.invoke(), this.$context.invoke(), this.$okHttpClient.invoke(), this.$connectionTypeObservable.invoke());
       return v10;
    }
}

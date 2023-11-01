package com.spotify.connectivity.connectivityservice.DaggerConnectivityServiceFactoryComponent$ConnectivityServiceFactoryComponentImpl;
import com.spotify.connectivity.connectivityservice.ConnectivityServiceFactoryComponent;
import com.spotify.connectivity.connectivityservice.ConnectivityServiceDependencies;
import java.lang.Object;
import com.spotify.connectivity.connectivityservice.DaggerConnectivityServiceFactoryComponent$1;
import com.spotify.connectivity.connectivityservice.ConnectivityService;
import com.spotify.connectivity.AnalyticsDelegate;
import p.co5;
import p.sw0;
import p.pw0;
import com.spotify.connectivity.ApplicationScopeConfiguration;
import com.spotify.connectivity.MobileDeviceInfo;
import p.re6;
import android.content.Context;
import p.g15;
import io.reactivex.rxjava3.core.Observable;

final class DaggerConnectivityServiceFactoryComponent$ConnectivityServiceFactoryComponentImpl implements ConnectivityServiceFactoryComponent	// class@0006df from classes.dex
{
    private final ConnectivityServiceDependencies connectivityServiceDependencies;
    private final DaggerConnectivityServiceFactoryComponent$ConnectivityServiceFactoryComponentImpl connectivityServiceFactoryComponentImpl;

    private void DaggerConnectivityServiceFactoryComponent$ConnectivityServiceFactoryComponentImpl(ConnectivityServiceDependencies p0){
       super();
       this.connectivityServiceFactoryComponentImpl = this;
       this.connectivityServiceDependencies = p0;
    }
    public void DaggerConnectivityServiceFactoryComponent$ConnectivityServiceFactoryComponentImpl(ConnectivityServiceDependencies p0,DaggerConnectivityServiceFactoryComponent$1 p1){
       super(p0);
    }
    public ConnectivityService connectivityService(){
       AnalyticsDelegate analyticsDel = this.connectivityServiceDependencies.getAnalyticsDelegate();
       co5.m(analyticsDel);
       sw0 coreThreadin = this.connectivityServiceDependencies.getCoreThreadingApi();
       co5.m(coreThreadin);
       pw0 corePreferen = this.connectivityServiceDependencies.getCorePreferencesApi();
       co5.m(corePreferen);
       ApplicationScopeConfiguration connectivity = this.connectivityServiceDependencies.getConnectivityApplicationScopeConfiguration();
       co5.m(connectivity);
       MobileDeviceInfo mobileDevice = this.connectivityServiceDependencies.getMobileDeviceInfo();
       co5.m(mobileDevice);
       re6 sharedCosmos = this.connectivityServiceDependencies.getSharedCosmosRouterApi();
       co5.m(sharedCosmos);
       Context context = this.connectivityServiceDependencies.getContext();
       co5.m(context);
       g15 okHttpClient = this.connectivityServiceDependencies.getOkHttpClient();
       co5.m(okHttpClient);
       Observable connectionTy = this.connectivityServiceDependencies.getConnectionTypeObservable();
       co5.m(connectionTy);
       ConnectivityService v10 = new ConnectivityService(analyticsDel, coreThreadin, corePreferen, connectivity, mobileDevice, sharedCosmos, context, okHttpClient, connectionTy);
       return v10;
    }
}

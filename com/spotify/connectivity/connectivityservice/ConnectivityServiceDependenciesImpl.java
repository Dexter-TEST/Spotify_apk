package com.spotify.connectivity.connectivityservice.ConnectivityServiceDependenciesImpl;
import com.spotify.connectivity.connectivityservice.ConnectivityServiceDependencies;
import com.spotify.connectivity.AnalyticsDelegate;
import p.sw0;
import p.pw0;
import com.spotify.connectivity.ApplicationScopeConfiguration;
import com.spotify.connectivity.MobileDeviceInfo;
import p.re6;
import android.content.Context;
import p.g15;
import io.reactivex.rxjava3.core.Observable;
import java.lang.Object;
import java.lang.String;
import p.co5;

public final class ConnectivityServiceDependenciesImpl implements ConnectivityServiceDependencies	// class@0006d5 from classes.dex
{
    private final AnalyticsDelegate analyticsDelegate;
    private final Observable connectionTypeObservable;
    private final ApplicationScopeConfiguration connectivityApplicationScopeConfiguration;
    private final Context context;
    private final pw0 corePreferencesApi;
    private final sw0 coreThreadingApi;
    private final MobileDeviceInfo mobileDeviceInfo;
    private final g15 okHttpClient;
    private final re6 sharedCosmosRouterApi;

    public void ConnectivityServiceDependenciesImpl(AnalyticsDelegate p0,sw0 p1,pw0 p2,ApplicationScopeConfiguration p3,MobileDeviceInfo p4,re6 p5,Context p6,g15 p7,Observable p8){
       co5.o(p0, "analyticsDelegate");
       co5.o(p1, "coreThreadingApi");
       co5.o(p2, "corePreferencesApi");
       co5.o(p3, "connectivityApplicationScopeConfiguration");
       co5.o(p4, "mobileDeviceInfo");
       co5.o(p5, "sharedCosmosRouterApi");
       co5.o(p6, "context");
       co5.o(p7, "okHttpClient");
       co5.o(p8, "connectionTypeObservable");
       super();
       this.analyticsDelegate = p0;
       this.coreThreadingApi = p1;
       this.corePreferencesApi = p2;
       this.connectivityApplicationScopeConfiguration = p3;
       this.mobileDeviceInfo = p4;
       this.sharedCosmosRouterApi = p5;
       this.context = p6;
       this.okHttpClient = p7;
       this.connectionTypeObservable = p8;
    }
    public AnalyticsDelegate getAnalyticsDelegate(){
       return this.analyticsDelegate;
    }
    public Observable getConnectionTypeObservable(){
       return this.connectionTypeObservable;
    }
    public ApplicationScopeConfiguration getConnectivityApplicationScopeConfiguration(){
       return this.connectivityApplicationScopeConfiguration;
    }
    public Context getContext(){
       return this.context;
    }
    public pw0 getCorePreferencesApi(){
       return this.corePreferencesApi;
    }
    public sw0 getCoreThreadingApi(){
       return this.coreThreadingApi;
    }
    public MobileDeviceInfo getMobileDeviceInfo(){
       return this.mobileDeviceInfo;
    }
    public g15 getOkHttpClient(){
       return this.okHttpClient;
    }
    public re6 getSharedCosmosRouterApi(){
       return this.sharedCosmosRouterApi;
    }
}

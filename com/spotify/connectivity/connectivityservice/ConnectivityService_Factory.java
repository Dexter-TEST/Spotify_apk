package com.spotify.connectivity.connectivityservice.ConnectivityService_Factory;
import p.a02;
import p.tm5;
import java.lang.Object;
import com.spotify.connectivity.AnalyticsDelegate;
import p.sw0;
import p.pw0;
import com.spotify.connectivity.ApplicationScopeConfiguration;
import com.spotify.connectivity.MobileDeviceInfo;
import p.re6;
import android.content.Context;
import p.g15;
import io.reactivex.rxjava3.core.Observable;
import com.spotify.connectivity.connectivityservice.ConnectivityService;

public final class ConnectivityService_Factory implements a02	// class@0006dd from classes.dex
{
    private final tm5 analyticsDelegateProvider;
    private final tm5 connectionTypeObservableProvider;
    private final tm5 connectivityApplicationScopeConfigurationProvider;
    private final tm5 contextProvider;
    private final tm5 corePreferencesApiProvider;
    private final tm5 coreThreadingApiProvider;
    private final tm5 mobileDeviceInfoProvider;
    private final tm5 okHttpClientProvider;
    private final tm5 sharedCosmosRouterApiProvider;

    public void ConnectivityService_Factory(tm5 p0,tm5 p1,tm5 p2,tm5 p3,tm5 p4,tm5 p5,tm5 p6,tm5 p7,tm5 p8){
       super();
       this.analyticsDelegateProvider = p0;
       this.coreThreadingApiProvider = p1;
       this.corePreferencesApiProvider = p2;
       this.connectivityApplicationScopeConfigurationProvider = p3;
       this.mobileDeviceInfoProvider = p4;
       this.sharedCosmosRouterApiProvider = p5;
       this.contextProvider = p6;
       this.okHttpClientProvider = p7;
       this.connectionTypeObservableProvider = p8;
    }
    public static ConnectivityService_Factory create(tm5 p0,tm5 p1,tm5 p2,tm5 p3,tm5 p4,tm5 p5,tm5 p6,tm5 p7,tm5 p8){
       ConnectivityService_Factory v10 = new ConnectivityService_Factory(p0, p1, p2, p3, p4, p5, p6, p7, p8);
       return v10;
    }
    public static ConnectivityService newInstance(AnalyticsDelegate p0,sw0 p1,pw0 p2,ApplicationScopeConfiguration p3,MobileDeviceInfo p4,re6 p5,Context p6,g15 p7,Observable p8){
       ConnectivityService v10 = new ConnectivityService(p0, p1, p2, p3, p4, p5, p6, p7, p8);
       return v10;
    }
    public ConnectivityService get(){
       return ConnectivityService_Factory.newInstance(this.analyticsDelegateProvider.get(), this.coreThreadingApiProvider.get(), this.corePreferencesApiProvider.get(), this.connectivityApplicationScopeConfigurationProvider.get(), this.mobileDeviceInfoProvider.get(), this.sharedCosmosRouterApiProvider.get(), this.contextProvider.get(), this.okHttpClientProvider.get(), this.connectionTypeObservableProvider.get());
    }
    public Object get(){
       return this.get();
    }
}

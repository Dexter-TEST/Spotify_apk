package com.spotify.connectivity.connectivityservice.LegacyConnectivityServiceModule_ProvideConnectivityServiceFactory;
import p.a02;
import p.tm5;
import java.lang.Object;
import android.app.Application;
import p.af4;
import com.spotify.eventsender.api.EventSenderCoreBridge;
import p.g15;
import p.sw0;
import p.pw0;
import p.re6;
import com.spotify.connectivity.MobileDeviceInfo;
import io.reactivex.rxjava3.core.Observable;
import com.spotify.connectivity.ApplicationScopeConfiguration;
import com.spotify.connectivity.connectivityservice.ConnectivityService;
import com.spotify.connectivity.connectivityservice.LegacyConnectivityServiceModule;
import p.co5;
import p.tp2;

public final class LegacyConnectivityServiceModule_ProvideConnectivityServiceFactory implements a02	// class@0006e4 from classes.dex
{
    private final tm5 applicationProvider;
    private final tm5 connectionTypeObservableProvider;
    private final tm5 connectivityApplicationScopeConfigurationProvider;
    private final tm5 corePreferencesApiProvider;
    private final tm5 coreThreadingApiProvider;
    private final tm5 eventSenderCoreBridgeProvider;
    private final tm5 mobileDeviceInfoProvider;
    private final tm5 nativeLibraryProvider;
    private final tm5 okHttpClientProvider;
    private final tm5 sharedCosmosRouterApiProvider;

    public void LegacyConnectivityServiceModule_ProvideConnectivityServiceFactory(tm5 p0,tm5 p1,tm5 p2,tm5 p3,tm5 p4,tm5 p5,tm5 p6,tm5 p7,tm5 p8,tm5 p9){
       super();
       this.applicationProvider = p0;
       this.nativeLibraryProvider = p1;
       this.eventSenderCoreBridgeProvider = p2;
       this.okHttpClientProvider = p3;
       this.coreThreadingApiProvider = p4;
       this.corePreferencesApiProvider = p5;
       this.sharedCosmosRouterApiProvider = p6;
       this.mobileDeviceInfoProvider = p7;
       this.connectionTypeObservableProvider = p8;
       this.connectivityApplicationScopeConfigurationProvider = p9;
    }
    public static LegacyConnectivityServiceModule_ProvideConnectivityServiceFactory create(tm5 p0,tm5 p1,tm5 p2,tm5 p3,tm5 p4,tm5 p5,tm5 p6,tm5 p7,tm5 p8,tm5 p9){
       LegacyConnectivityServiceModule_ProvideConnectivityServiceFactory v11 = new LegacyConnectivityServiceModule_ProvideConnectivityServiceFactory(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
       return v11;
    }
    public static ConnectivityService provideConnectivityService(Application p0,af4 p1,EventSenderCoreBridge p2,g15 p3,sw0 p4,pw0 p5,re6 p6,MobileDeviceInfo p7,Observable p8,ApplicationScopeConfiguration p9){
       ConnectivityService uConnectivit = LegacyConnectivityServiceModule.INSTANCE.provideConnectivityService(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
       co5.n(uConnectivit);
       return uConnectivit;
    }
    public ConnectivityService get(){
       tp2.v(this.nativeLibraryProvider.get());
       return LegacyConnectivityServiceModule_ProvideConnectivityServiceFactory.provideConnectivityService(this.applicationProvider.get(), null, this.eventSenderCoreBridgeProvider.get(), this.okHttpClientProvider.get(), this.coreThreadingApiProvider.get(), this.corePreferencesApiProvider.get(), this.sharedCosmosRouterApiProvider.get(), this.mobileDeviceInfoProvider.get(), this.connectionTypeObservableProvider.get(), this.connectivityApplicationScopeConfigurationProvider.get());
    }
    public Object get(){
       return this.get();
    }
}

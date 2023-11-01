package com.spotify.connectivity.connectivityservice.ConnectivityServiceDependencies;
import com.spotify.connectivity.AnalyticsDelegate;
import io.reactivex.rxjava3.core.Observable;
import com.spotify.connectivity.ApplicationScopeConfiguration;
import android.content.Context;
import p.pw0;
import p.sw0;
import com.spotify.connectivity.MobileDeviceInfo;
import p.g15;
import p.re6;

public interface abstract ConnectivityServiceDependencies	// class@0006d4 from classes.dex
{

    AnalyticsDelegate getAnalyticsDelegate();
    Observable getConnectionTypeObservable();
    ApplicationScopeConfiguration getConnectivityApplicationScopeConfiguration();
    Context getContext();
    pw0 getCorePreferencesApi();
    sw0 getCoreThreadingApi();
    MobileDeviceInfo getMobileDeviceInfo();
    g15 getOkHttpClient();
    re6 getSharedCosmosRouterApi();
}

package com.spotify.core.corelimitedsessionservice.CoreLimitedSessionService_Factory;
import p.a02;
import p.tm5;
import java.lang.Object;
import p.sw0;
import p.re6;
import p.pw0;
import p.lt5;
import com.spotify.connectivity.connectivityapi.ConnectivityApi;
import com.spotify.core.coreapi.CoreApi;
import com.spotify.connectivity.connectivitysessionapi.ConnectivitySessionApi;
import com.spotify.connectivity.sessionapi.SessionApi;
import p.fe7;
import com.spotify.clientfoundations.core.corelimitedimpl.LimitedAuthenticatedScopeConfiguration;
import io.reactivex.rxjava3.core.Observable;
import com.spotify.core.corelimitedsessionservice.CoreLimitedSessionService;

public final class CoreLimitedSessionService_Factory implements a02	// class@000858 from classes.dex
{
    private final tm5 connectivityApiProvider;
    private final tm5 connectivitySessionApiProvider;
    private final tm5 coreApiProvider;
    private final tm5 corePreferencesApiProvider;
    private final tm5 coreThreadingApiProvider;
    private final tm5 foregroundProvider;
    private final tm5 limitedAuthenticatedScopeConfigurationProvider;
    private final tm5 remoteConfigurationApiProvider;
    private final tm5 sessionApiProvider;
    private final tm5 sharedCosmosRouterApiProvider;
    private final tm5 userDirectoryApiProvider;

    public void CoreLimitedSessionService_Factory(tm5 p0,tm5 p1,tm5 p2,tm5 p3,tm5 p4,tm5 p5,tm5 p6,tm5 p7,tm5 p8,tm5 p9,tm5 p10){
       super();
       this.coreThreadingApiProvider = p0;
       this.sharedCosmosRouterApiProvider = p1;
       this.corePreferencesApiProvider = p2;
       this.remoteConfigurationApiProvider = p3;
       this.connectivityApiProvider = p4;
       this.coreApiProvider = p5;
       this.connectivitySessionApiProvider = p6;
       this.sessionApiProvider = p7;
       this.userDirectoryApiProvider = p8;
       this.limitedAuthenticatedScopeConfigurationProvider = p9;
       this.foregroundProvider = p10;
    }
    public static CoreLimitedSessionService_Factory create(tm5 p0,tm5 p1,tm5 p2,tm5 p3,tm5 p4,tm5 p5,tm5 p6,tm5 p7,tm5 p8,tm5 p9,tm5 p10){
       CoreLimitedSessionService_Factory v12 = new CoreLimitedSessionService_Factory(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);
       return v12;
    }
    public static CoreLimitedSessionService newInstance(sw0 p0,re6 p1,pw0 p2,lt5 p3,ConnectivityApi p4,CoreApi p5,ConnectivitySessionApi p6,SessionApi p7,fe7 p8,LimitedAuthenticatedScopeConfiguration p9,Observable p10){
       CoreLimitedSessionService v12 = new CoreLimitedSessionService(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);
       return v12;
    }
    public CoreLimitedSessionService get(){
       return CoreLimitedSessionService_Factory.newInstance(this.coreThreadingApiProvider.get(), this.sharedCosmosRouterApiProvider.get(), this.corePreferencesApiProvider.get(), this.remoteConfigurationApiProvider.get(), this.connectivityApiProvider.get(), this.coreApiProvider.get(), this.connectivitySessionApiProvider.get(), this.sessionApiProvider.get(), this.userDirectoryApiProvider.get(), this.limitedAuthenticatedScopeConfigurationProvider.get(), this.foregroundProvider.get());
    }
    public Object get(){
       return this.get();
    }
}

package com.spotify.core.corelimitedsessionservice.DaggerCoreLimitedSessionServiceFactoryComponent$CoreLimitedSessionServiceFactoryComponentImpl;
import com.spotify.core.corelimitedsessionservice.CoreLimitedSessionServiceFactoryComponent;
import com.spotify.core.corelimitedsessionservice.CoreLimitedSessionServiceDependencies;
import java.lang.Object;
import com.spotify.core.corelimitedsessionservice.DaggerCoreLimitedSessionServiceFactoryComponent$1;
import com.spotify.core.corelimitedsessionservice.CoreLimitedSessionService;
import p.sw0;
import p.co5;
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

final class DaggerCoreLimitedSessionServiceFactoryComponent$CoreLimitedSessionServiceFactoryComponentImpl implements CoreLimitedSessionServiceFactoryComponent	// class@00085a from classes.dex
{
    private final CoreLimitedSessionServiceDependencies coreLimitedSessionServiceDependencies;
    private final DaggerCoreLimitedSessionServiceFactoryComponent$CoreLimitedSessionServiceFactoryComponentImpl coreLimitedSessionServiceFactoryComponentImpl;

    private void DaggerCoreLimitedSessionServiceFactoryComponent$CoreLimitedSessionServiceFactoryComponentImpl(CoreLimitedSessionServiceDependencies p0){
       super();
       this.coreLimitedSessionServiceFactoryComponentImpl = this;
       this.coreLimitedSessionServiceDependencies = p0;
    }
    public void DaggerCoreLimitedSessionServiceFactoryComponent$CoreLimitedSessionServiceFactoryComponentImpl(CoreLimitedSessionServiceDependencies p0,DaggerCoreLimitedSessionServiceFactoryComponent$1 p1){
       super(p0);
    }
    public CoreLimitedSessionService coreLimitedSessionService(){
       sw0 coreThreadin = this.coreLimitedSessionServiceDependencies.getCoreThreadingApi();
       co5.m(coreThreadin);
       re6 sharedCosmos = this.coreLimitedSessionServiceDependencies.getSharedCosmosRouterApi();
       co5.m(sharedCosmos);
       pw0 corePreferen = this.coreLimitedSessionServiceDependencies.getCorePreferencesApi();
       co5.m(corePreferen);
       lt5 remoteConfig = this.coreLimitedSessionServiceDependencies.getRemoteConfigurationApi();
       co5.m(remoteConfig);
       ConnectivityApi connectivity = this.coreLimitedSessionServiceDependencies.getConnectivityApi();
       co5.m(connectivity);
       CoreApi coreApi = this.coreLimitedSessionServiceDependencies.getCoreApi();
       co5.m(coreApi);
       ConnectivitySessionApi connectivity1 = this.coreLimitedSessionServiceDependencies.getConnectivitySessionApi();
       co5.m(connectivity1);
       SessionApi sessionApi = this.coreLimitedSessionServiceDependencies.getSessionApi();
       co5.m(sessionApi);
       fe7 userDirector = this.coreLimitedSessionServiceDependencies.getUserDirectoryApi();
       co5.m(userDirector);
       LimitedAuthenticatedScopeConfiguration limitedAuthe = this.coreLimitedSessionServiceDependencies.getLimitedAuthenticatedScopeConfiguration();
       co5.m(limitedAuthe);
       Observable appForegroun = this.coreLimitedSessionServiceDependencies.getAppForegroundObservable();
       co5.m(appForegroun);
       CoreLimitedSessionService v12 = new CoreLimitedSessionService(coreThreadin, sharedCosmos, corePreferen, remoteConfig, connectivity, coreApi, connectivity1, sessionApi, userDirector, limitedAuthe, appForegroun);
       return v12;
    }
}

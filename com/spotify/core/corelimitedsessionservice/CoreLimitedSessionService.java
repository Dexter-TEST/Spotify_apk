package com.spotify.core.corelimitedsessionservice.CoreLimitedSessionService;
import com.spotify.core.corelimitedsessionapi.CoreLimitedSessionApi;
import p.tb6;
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
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.tw0;
import com.spotify.clientfoundations.concurrency.async.Scheduler;
import com.spotify.core.corelimitedsessionservice.CoreLimitedSessionService$CoreThreadPolicy;
import com.spotify.core.corelimitedsessionservice.CoreLimitedSessionService$WhenMappings;
import java.lang.Enum;
import com.spotify.clientfoundations.core.corelimitedimpl.NativeLimitedAuthenticatedScopeImpl;
import com.spotify.core.corelimitedsessionservice.CoreLimitedSessionService$1;
import java.lang.Runnable;
import com.spotify.clientfoundations.core.corelimited.NativeLimitedAuthenticatedScope;
import p.se6;
import p.qw0;
import p.mt5;
import com.spotify.clientfoundations.connectivity.connectivitysdkpolicyimpl.NativeConnectivityManager;
import com.spotify.connectivity.NativeApplicationScope;
import com.spotify.connectivity.auth.NativeSession;
import com.spotify.connectivity.NativeAuthenticatedScope;
import com.spotify.clientfoundations.core.core.NativeApplicationScope;
import p.he7;
import com.spotify.offline.NativeForegroundProvider;
import com.spotify.core.corelimitedsessionservice.CoreLimitedSessionService$initInternal$localAuthenticatedScopeImpl$1;
import p.s36;
import p.vw1;
import java.util.concurrent.Executor;
import io.reactivex.rxjava3.core.Scheduler;
import com.spotify.clientfoundations.concurrency.async.NativeTimerManagerThread;
import com.spotify.clientfoundations.cosmos.cosmosimpl.NativeRouter;
import com.spotify.clientfoundations.prefs.prefsimpl.NativePrefs;
import com.spotify.remoteconfig.NativeRemoteConfig;
import com.spotify.clientfoundations.appstorage.userdirectory.NativeUserDirectoryManager;
import com.spotify.clientfoundations.core.corelimitedimpl.NativeLimitedAuthenticatedScopeImpl$Companion;
import com.spotify.core.corelimitedsessionservice.CoreLimitedSessionService$shutdown$1;

public final class CoreLimitedSessionService implements CoreLimitedSessionApi, tb6	// class@00084e from classes.dex
{
    private NativeLimitedAuthenticatedScopeImpl authenticatedScopeImpl;
    private final ConnectivityApi connectivityApi;
    private final ConnectivitySessionApi connectivitySessionApi;
    private final CoreApi coreApi;
    private final pw0 corePreferencesApi;
    private final CoreLimitedSessionService$CoreThreadPolicy coreThreadPolicy;
    private final sw0 coreThreadingApi;
    private final Observable foreground;
    private final LimitedAuthenticatedScopeConfiguration limitedAuthenticatedScopeConfiguration;
    private final lt5 remoteConfigurationApi;
    private final SessionApi sessionApi;
    private final re6 sharedCosmosRouterApi;
    private final fe7 userDirectoryApi;

    public void CoreLimitedSessionService(sw0 p0,re6 p1,pw0 p2,lt5 p3,ConnectivityApi p4,CoreApi p5,ConnectivitySessionApi p6,SessionApi p7,fe7 p8,LimitedAuthenticatedScopeConfiguration p9,Observable p10){
       int i;
       co5.o(p0, "coreThreadingApi");
       co5.o(p1, "sharedCosmosRouterApi");
       co5.o(p2, "corePreferencesApi");
       co5.o(p3, "remoteConfigurationApi");
       co5.o(p4, "connectivityApi");
       co5.o(p5, "coreApi");
       co5.o(p6, "connectivitySessionApi");
       co5.o(p7, "sessionApi");
       co5.o(p8, "userDirectoryApi");
       co5.o(p9, "limitedAuthenticatedScopeConfiguration");
       co5.o(p10, "foreground");
       super();
       this.coreThreadingApi = p0;
       this.sharedCosmosRouterApi = p1;
       this.corePreferencesApi = p2;
       this.remoteConfigurationApi = p3;
       this.connectivityApi = p4;
       this.coreApi = p5;
       this.connectivitySessionApi = p6;
       this.sessionApi = p7;
       this.userDirectoryApi = p8;
       this.limitedAuthenticatedScopeConfiguration = p9;
       this.foreground = p10;
       CoreLimitedSessionService$CoreThreadPolicy dO_NOT_RUN_O = (p0.a.isCurrentThread())? CoreLimitedSessionService$CoreThreadPolicy.DO_NOT_RUN_ON_CORE_THREAD: CoreLimitedSessionService$CoreThreadPolicy.RUN_ON_CORE_THREAD;
       this.coreThreadPolicy = dO_NOT_RUN_O;
       if ((i = CoreLimitedSessionService$WhenMappings.$EnumSwitchMapping$0[dO_NOT_RUN_O.ordinal()]) != 1) {
          if (i == 2) {
             this.authenticatedScopeImpl = this.initInternal$src_main_java_com_spotify_core_corelimitedsessionservice_corelimitedsessionservice();
          }
       }else {
          p0.a.runBlocking(new CoreLimitedSessionService$1(this));
       }
       return;
    }
    public static final sw0 access$getCoreThreadingApi$p(CoreLimitedSessionService p0){
       return p0.coreThreadingApi;
    }
    public static final void access$setAuthenticatedScopeImpl$p(CoreLimitedSessionService p0,NativeLimitedAuthenticatedScopeImpl p1){
       p0.authenticatedScopeImpl = p1;
    }
    public CoreLimitedSessionApi getApi(){
       return this;
    }
    public Object getApi(){
       return this.getApi();
    }
    public NativeLimitedAuthenticatedScope getAuthenticatedScope(){
       CoreLimitedSessionService tauthenticat;
       if ((tauthenticat = this.authenticatedScopeImpl) != null) {
          return tauthenticat;
       }
       co5.N("authenticatedScopeImpl");
       throw null;
    }
    public final NativeLimitedAuthenticatedScopeImpl initInternal$src_main_java_com_spotify_core_corelimitedsessionservice_corelimitedsessionservice(){
       CoreLimitedSessionService uCoreLimited = this;
       CoreLimitedSessionService$initInternal$localAuthenticatedScopeImpl$1 oinitInterna = new CoreLimitedSessionService$initInternal$localAuthenticatedScopeImpl$1(uCoreLimited);
       Observable observable = uCoreLimited.foreground.observeOn(new vw1(oinitInterna, false, false));
       co5.l(observable, "internal fun initInterna…henticatedScopeImpl\n    }");
       this.sharedCosmosRouterApi.a();
       return NativeLimitedAuthenticatedScopeImpl.Companion.create(uCoreLimited.coreThreadingApi.a, uCoreLimited.sharedCosmosRouterApi.c, uCoreLimited.corePreferencesApi.a, uCoreLimited.remoteConfigurationApi.a, uCoreLimited.connectivityApi.getNativeConnectivityManager(), uCoreLimited.connectivityApi.getNativeConnectivityApplicationScope(), uCoreLimited.sessionApi.getNativeSession(), uCoreLimited.connectivitySessionApi.getAuthenticatedScope(), uCoreLimited.coreApi.getNativeCoreApplicationScope(), uCoreLimited.userDirectoryApi.a, uCoreLimited.limitedAuthenticatedScopeConfiguration, new NativeForegroundProvider(observable));
    }
    public void shutdown(){
       int i;
       if ((i = CoreLimitedSessionService$WhenMappings.$EnumSwitchMapping$0[this.coreThreadPolicy.ordinal()]) != 1) {
          if (i == 2) {
             this.shutdownInternal$src_main_java_com_spotify_core_corelimitedsessionservice_corelimitedsessionservice();
          }
       }else {
          this.coreThreadingApi.a.runBlocking(new CoreLimitedSessionService$shutdown$1(this));
       }
       return;
    }
    public final void shutdownInternal$src_main_java_com_spotify_core_corelimitedsessionservice_corelimitedsessionservice(){
       CoreLimitedSessionService tauthenticat;
       if ((tauthenticat = this.authenticatedScopeImpl) != null) {
          tauthenticat.prepareForShutdown();
          if ((tauthenticat = this.authenticatedScopeImpl) != null) {
             tauthenticat.flushCaches();
             if ((tauthenticat = this.authenticatedScopeImpl) != null) {
                tauthenticat.destroy();
                return;
             }else {
                co5.N("authenticatedScopeImpl");
                throw null;
             }
          }else {
             co5.N("authenticatedScopeImpl");
             throw null;
          }
       }else {
          co5.N("authenticatedScopeImpl");
          throw null;
       }
    }
}

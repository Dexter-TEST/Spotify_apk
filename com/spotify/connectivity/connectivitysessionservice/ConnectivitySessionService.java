package com.spotify.connectivity.connectivitysessionservice.ConnectivitySessionService;
import com.spotify.connectivity.connectivitysessionapi.ConnectivitySessionApi;
import p.tb6;
import p.sw0;
import p.re6;
import com.spotify.connectivity.connectivityapi.ConnectivityApi;
import com.spotify.connectivity.AnalyticsDelegate;
import com.spotify.connectivity.AuthenticatedScopeConfiguration;
import com.spotify.connectivity.sessionapi.SessionApi;
import com.spotify.connectivity.logoutanalyticsdelegate.AuthAnalyticsDelegate;
import com.spotify.connectivity.pubsub.PubSubClient;
import p.r45;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.spotify.connectivity.connectivitysessionservice.ConnectivitySessionService$rcsSnapshotIdProvider$1;
import p.tw0;
import com.spotify.clientfoundations.concurrency.async.Scheduler;
import com.spotify.connectivity.connectivitysessionservice.ConnectivitySessionService$CoreThreadPolicy;
import com.spotify.connectivity.connectivitysessionservice.ConnectivitySessionService$WhenMappings;
import java.lang.Enum;
import com.spotify.connectivity.NativeAuthenticatedScope;
import com.spotify.connectivity.connectivitysessionservice.ConnectivitySessionService$1;
import java.lang.Runnable;
import com.spotify.connectivity.connectivitysessionservice.ConnectivitySessionService$InternalLoginControllerAnalyticsDelegate;
import com.spotify.connectivity.auth.NativeLoginController;
import com.spotify.connectivity.auth.LoginControllerAnalyticsDelegate;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p.se6;
import com.spotify.connectivity.NativeApplicationScope;
import com.spotify.connectivity.auth.NativeSession;
import com.spotify.clientfoundations.concurrency.async.NativeTimerManagerThread;
import com.spotify.clientfoundations.cosmos.cosmosimpl.NativeRouter;
import com.spotify.connectivity.RCSSnapshotIdProvider;
import com.spotify.connectivity.NativeAuthenticatedScope$Companion;
import com.spotify.connectivity.connectivitysessionservice.ConnectivitySessionService$shutdown$1;

public final class ConnectivitySessionService implements ConnectivitySessionApi, tb6	// class@0006f0 from classes.dex
{
    private final AnalyticsDelegate analyticsDelegate;
    private final AuthAnalyticsDelegate authAnalyticsDelegate;
    public NativeAuthenticatedScope authenticatedScope;
    private final AuthenticatedScopeConfiguration authenticatedScopeConfiguration;
    private final ConnectivityApi connectivityApi;
    private final ConnectivitySessionService$CoreThreadPolicy coreThreadPolicy;
    private final sw0 coreThreadingApi;
    private final ConnectivitySessionService$InternalLoginControllerAnalyticsDelegate loginControllerAnalyticsDelegate;
    private final PubSubClient pubSubClient;
    private final ConnectivitySessionService$rcsSnapshotIdProvider$1 rcsSnapshotIdProvider;
    private final SessionApi sessionApi;
    private final re6 sharedCosmosRouterApi;

    public void ConnectivitySessionService(sw0 p0,re6 p1,ConnectivityApi p2,AnalyticsDelegate p3,AuthenticatedScopeConfiguration p4,SessionApi p5,AuthAnalyticsDelegate p6,PubSubClient p7,r45 p8){
       int i;
       co5.o(p0, "coreThreadingApi");
       co5.o(p1, "sharedCosmosRouterApi");
       co5.o(p2, "connectivityApi");
       co5.o(p3, "analyticsDelegate");
       co5.o(p4, "authenticatedScopeConfiguration");
       co5.o(p5, "sessionApi");
       co5.o(p8, "snapshotIdResolver");
       super();
       this.coreThreadingApi = p0;
       this.sharedCosmosRouterApi = p1;
       this.connectivityApi = p2;
       this.analyticsDelegate = p3;
       this.authenticatedScopeConfiguration = p4;
       this.sessionApi = p5;
       this.authAnalyticsDelegate = p6;
       this.pubSubClient = p7;
       this.rcsSnapshotIdProvider = new ConnectivitySessionService$rcsSnapshotIdProvider$1(p8);
       ConnectivitySessionService$CoreThreadPolicy dO_NOT_RUN_O = (p0.a.isCurrentThread())? ConnectivitySessionService$CoreThreadPolicy.DO_NOT_RUN_ON_CORE_THREAD: ConnectivitySessionService$CoreThreadPolicy.RUN_ON_CORE_THREAD;
       this.coreThreadPolicy = dO_NOT_RUN_O;
       if ((i = ConnectivitySessionService$WhenMappings.$EnumSwitchMapping$0[dO_NOT_RUN_O.ordinal()]) != 1) {
          if (i == 2) {
             this.setAuthenticatedScope(this.initInternal$src_main_java_com_spotify_connectivity_connectivitysessionservice_connectivitysessionservice_kt());
          }
       }else {
          p0.a.runBlocking(new ConnectivitySessionService$1(this));
       }
       ConnectivitySessionService$InternalLoginControllerAnalyticsDelegate internalLogi = new ConnectivitySessionService$InternalLoginControllerAnalyticsDelegate(p6);
       this.loginControllerAnalyticsDelegate = internalLogi;
       p2.getNativeLoginController().setAnalyticsDelegate(internalLogi);
       if (p7 != null) {
          p7.onSessionLogin();
       }
       return;
    }
    public void ConnectivitySessionService(sw0 p0,re6 p1,ConnectivityApi p2,AnalyticsDelegate p3,AuthenticatedScopeConfiguration p4,SessionApi p5,AuthAnalyticsDelegate p6,PubSubClient p7,r45 p8,int p9,DefaultConstructorMarker p10){
       int i = p9;
       AuthAnalyticsDelegate uAuthAnalyti = ((i & 0x40))? null: p6;
       PubSubClient pubSubClient = ((i & 0x0080))? null: p7;
       super(p0, p1, p2, p3, p4, p5, uAuthAnalyti, pubSubClient, p8);
       return;
    }
    public ConnectivitySessionApi getApi(){
       return this;
    }
    public Object getApi(){
       return this.getApi();
    }
    public NativeAuthenticatedScope getAuthenticatedScope(){
       ConnectivitySessionService tauthenticat;
       if ((tauthenticat = this.authenticatedScope) != null) {
          return tauthenticat;
       }
       co5.N("authenticatedScope");
       throw null;
    }
    public final NativeAuthenticatedScope initInternal$src_main_java_com_spotify_connectivity_connectivitysessionservice_connectivitysessionservice_kt(){
       return NativeAuthenticatedScope.Companion.create(this.coreThreadingApi.a, this.sharedCosmosRouterApi.c, this.connectivityApi.getNativeConnectivityApplicationScope(), this.sessionApi.getNativeSession(), this.analyticsDelegate, this.rcsSnapshotIdProvider, this.authenticatedScopeConfiguration);
    }
    public void setAuthenticatedScope(NativeAuthenticatedScope p0){
       co5.o(p0, "<set-?>");
       this.authenticatedScope = p0;
    }
    public void shutdown(){
       ConnectivitySessionService tpubSubClien;
       int i;
       if ((tpubSubClien = this.pubSubClient) != null) {
          tpubSubClien.onSessionLogout();
       }
       if ((i = ConnectivitySessionService$WhenMappings.$EnumSwitchMapping$0[this.coreThreadPolicy.ordinal()]) != 1) {
          if (i == 2) {
             this.shutdownInternal$src_main_java_com_spotify_connectivity_connectivitysessionservice_connectivitysessionservice_kt();
          }
       }else {
          this.coreThreadingApi.a.runBlocking(new ConnectivitySessionService$shutdown$1(this));
       }
       return;
    }
    public final void shutdownInternal$src_main_java_com_spotify_connectivity_connectivitysessionservice_connectivitysessionservice_kt(){
       this.getAuthenticatedScope().prepareForShutdown();
       this.getAuthenticatedScope().destroy();
    }
}

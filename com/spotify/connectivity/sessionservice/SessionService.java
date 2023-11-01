package com.spotify.connectivity.sessionservice.SessionService;
import com.spotify.connectivity.sessionapi.SessionApi;
import p.tb6;
import com.spotify.connectivity.sessionservice.TemporarySessionLoginFlowDependencies;
import p.sw0;
import com.spotify.connectivity.AnalyticsDelegate;
import com.spotify.connectivity.connectivityapi.ConnectivityApi;
import com.spotify.core.coreapi.CoreApi;
import com.spotify.connectivity.auth.NativeLoginControllerConfiguration;
import p.vg0;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.spotify.connectivity.sessionservice.TemporarySessionLoginFlowDependencies$LegacyFlow;
import com.spotify.connectivity.sessionapi.SharedNativeSession;
import com.spotify.connectivity.auth.NativeSession;
import com.spotify.connectivity.sessionservice.TemporarySessionLoginFlowDependencies$NewFlow;
import p.tw0;
import com.spotify.connectivity.sessionservice.SessionService$1;
import java.lang.Runnable;
import com.spotify.clientfoundations.concurrency.async.Scheduler;
import com.spotify.connectivity.auth.AuthUserInfo;
import com.spotify.connectivity.auth.AccessToken;
import com.spotify.connectivity.sessionesperanto.SessionClientEsperanto;
import com.spotify.clientfoundations.esperanto.esperanto.Transport;
import com.spotify.connectivity.auth.esperanto.proto.SessionClient;
import com.spotify.connectivity.auth.esperanto.proto.EsSessionEsperantoKt;
import java.util.Map;
import io.reactivex.rxjava3.core.Single;
import com.spotify.connectivity.sessionservice.SessionService$shutdownSession$1;

public final class SessionService implements SessionApi, tb6	// class@00081f from classes.dex
{
    private final AnalyticsDelegate analyticsDelegate;
    private final vg0 clientInfo;
    private final ConnectivityApi connectivityApi;
    private final CoreApi coreApi;
    private final sw0 coreThreadingApi;
    private final NativeLoginControllerConfiguration loginControllerConfiguration;
    public NativeSession nativeSession;
    private final TemporarySessionLoginFlowDependencies temporarySessionLoginFlowDependencies;

    public void SessionService(TemporarySessionLoginFlowDependencies p0,sw0 p1,AnalyticsDelegate p2,ConnectivityApi p3,CoreApi p4,NativeLoginControllerConfiguration p5,vg0 p6){
       co5.o(p0, "temporarySessionLoginFlowDependencies");
       co5.o(p1, "coreThreadingApi");
       co5.o(p2, "analyticsDelegate");
       co5.o(p3, "connectivityApi");
       co5.o(p4, "coreApi");
       co5.o(p5, "loginControllerConfiguration");
       co5.o(p6, "clientInfo");
       super();
       this.temporarySessionLoginFlowDependencies = p0;
       this.coreThreadingApi = p1;
       this.analyticsDelegate = p2;
       this.connectivityApi = p3;
       this.coreApi = p4;
       this.loginControllerConfiguration = p5;
       this.clientInfo = p6;
       if (p0 instanceof TemporarySessionLoginFlowDependencies$LegacyFlow) {
          this.setNativeSession(p0.getSharedNativeSession().acquire());
       }else if(p0 instanceof TemporarySessionLoginFlowDependencies$NewFlow){
          p1.a.runBlocking(new SessionService$1(this));
          if (p0.getAuthUserInfo().getAccessToken() != null) {
             new SessionClientEsperanto(EsSessionEsperantoKt.createSessionClient(this.getNativeSession().getInternalTransportToNative())).writeProductStateToLegacyStorage(p0.getProductState()).blockingGet();
          }
       }
       return;
    }
    public static final AnalyticsDelegate access$getAnalyticsDelegate$p(SessionService p0){
       return p0.analyticsDelegate;
    }
    public static final vg0 access$getClientInfo$p(SessionService p0){
       return p0.clientInfo;
    }
    public static final ConnectivityApi access$getConnectivityApi$p(SessionService p0){
       return p0.connectivityApi;
    }
    public static final CoreApi access$getCoreApi$p(SessionService p0){
       return p0.coreApi;
    }
    public static final sw0 access$getCoreThreadingApi$p(SessionService p0){
       return p0.coreThreadingApi;
    }
    public static final NativeLoginControllerConfiguration access$getLoginControllerConfiguration$p(SessionService p0){
       return p0.loginControllerConfiguration;
    }
    public static final TemporarySessionLoginFlowDependencies access$getTemporarySessionLoginFlowDependencies$p(SessionService p0){
       return p0.temporarySessionLoginFlowDependencies;
    }
    private final void shutdownSession(){
       this.getNativeSession().blockingLogout();
       this.coreThreadingApi.a.runBlocking(new SessionService$shutdownSession$1(this));
    }
    public SessionApi getApi(){
       return this;
    }
    public Object getApi(){
       return this.getApi();
    }
    public NativeSession getNativeSession(){
       SessionService tnativeSessi;
       if ((tnativeSessi = this.nativeSession) != null) {
          return tnativeSessi;
       }
       co5.N("nativeSession");
       throw null;
    }
    public void setNativeSession(NativeSession p0){
       co5.o(p0, "<set-?>");
       this.nativeSession = p0;
    }
    public void shutdown(){
       SessionService ttemporarySe = this.temporarySessionLoginFlowDependencies;
       if (ttemporarySe instanceof TemporarySessionLoginFlowDependencies$LegacyFlow) {
          ttemporarySe.getSharedNativeSession().release();
       }else if(ttemporarySe instanceof TemporarySessionLoginFlowDependencies$NewFlow){
          this.shutdownSession();
       }
       return;
    }
}

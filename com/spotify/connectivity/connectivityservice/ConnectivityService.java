package com.spotify.connectivity.connectivityservice.ConnectivityService;
import com.spotify.connectivity.connectivityapi.ConnectivityApi;
import p.tb6;
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
import com.spotify.core.http.NativeHttpConnection;
import com.spotify.connectivity.httpconnection.HttpConnectionFactoryImpl;
import com.spotify.core.http.HttpConnectionFactory;
import com.spotify.core.http.NativeHttpConnection$Companion;
import com.spotify.connectivity.ConnectivitySdk;
import com.spotify.connectivity.ConnectivitySdk$Companion;
import p.tw0;
import com.spotify.connectivity.connectivityservice.ConnectivityService$1;
import java.lang.Runnable;
import com.spotify.clientfoundations.concurrency.async.Scheduler;
import com.spotify.connectivity.connectivityservice.ServiceConnectivityObserver;
import com.spotify.connectivity.auth.NativeLoginController;
import com.spotify.clientfoundations.connectivity.connectivitysdkpolicyimpl.NativeConnectivityManager;
import com.spotify.connectivity.auth.LoginController;
import com.spotify.clientfoundations.connectivity.connectivitysdkpolicy.ConnectivityManager;
import com.spotify.connectivity.connectivityservice.ConnectivityService$2;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;
import p.sk5;
import android.os.Handler;
import android.os.Looper;
import com.spotify.connectivity.connectivityservice.ConnectivityService$3;
import com.spotify.connectivity.connectivityservice.ConnectivityService$4;
import com.spotify.connectivity.connectivityservice.ConnectivityService$InternalLoginControllerDelegate;
import p.vj3;
import p.dk3;
import com.spotify.connectivity.auth.NativeSession;
import com.spotify.connectivity.NativeConnectionTypeProvider;
import com.spotify.connectivity.NativeApplicationScope;
import com.spotify.connectivity.NativeConnectivityPolicyProvider;
import com.spotify.connectivity.auth.NativeCredentialsStorage;
import com.spotify.connectivity.auth.LoginControllerDelegate;
import p.wf2;
import com.spotify.connectivity.connectivityservice.ConnectivityService$shutdown$1;
import com.spotify.connectivity.connectivityservice.ConnectivityService$shutdown$2;
import io.reactivex.rxjava3.core.Single;
import com.spotify.connectivity.connectivityservice.ConnectivityService$storedCredentials$1;
import io.reactivex.rxjava3.core.SingleOnSubscribe;

public final class ConnectivityService implements ConnectivityApi, tb6	// class@0006d3 from classes.dex
{
    private final AnalyticsDelegate analyticsDelegate;
    private final Disposable connectionTypeDisposable;
    private final Observable connectionTypeObservable;
    private final ApplicationScopeConfiguration connectivityApplicationScopeConfiguration;
    private final ServiceConnectivityObserver connectivityObserver;
    private final Context context;
    private final pw0 corePreferencesApi;
    private final sw0 coreThreadingApi;
    private ConnectivityService$InternalLoginControllerDelegate loginControllerDelegate;
    private final Handler mainLooperHandler;
    public NativeConnectionTypeProvider nativeConnectionTypeProvider;
    public NativeApplicationScope nativeConnectivityApplicationScope;
    public NativeConnectivityManager nativeConnectivityManager;
    public NativeConnectivityPolicyProvider nativeConnectivityPolicyProvider;
    public NativeCredentialsStorage nativeCredentialsStorage;
    public NativeLoginController nativeLoginController;
    private final g15 okHttpClient;
    private wf2 preShutdownHook;
    private final vj3 processLifecycle;
    private final dk3 reconnectObserver;
    private boolean shouldTryReconnectNow;

    public void ConnectivityService(AnalyticsDelegate p0,sw0 p1,pw0 p2,ApplicationScopeConfiguration p3,MobileDeviceInfo p4,re6 p5,Context p6,g15 p7,Observable p8){
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
       this.context = p6;
       this.okHttpClient = p7;
       this.connectionTypeObservable = p8;
       this.shouldTryReconnectNow = true;
       NativeHttpConnection.Companion.initialize(new HttpConnectionFactoryImpl(p7));
       ConnectivitySdk.Companion.setMobileDeviceInfo(p4);
       p1.a.runBlocking(new ConnectivityService$1(p5, this));
       this.connectivityObserver = new ServiceConnectivityObserver(this.getNativeLoginController(), this.getNativeConnectivityManager(), p6);
       Disposable uDisposable = p8.subscribe(new ConnectivityService$2(this));
       co5.l(uDisposable, "connectionTypeObservable…ctivityType\(it\)\n        }");
       this.connectionTypeDisposable = uDisposable;
       this.processLifecycle = sk5.z.w;
       Handler handler = new Handler(Looper.getMainLooper());
       this.mainLooperHandler = handler;
       this.reconnectObserver = new ConnectivityService$3(this);
       handler.post(new ConnectivityService$4(this));
    }
    public static final AnalyticsDelegate access$getAnalyticsDelegate$p(ConnectivityService p0){
       return p0.analyticsDelegate;
    }
    public static final ApplicationScopeConfiguration access$getConnectivityApplicationScopeConfiguration$p(ConnectivityService p0){
       return p0.connectivityApplicationScopeConfiguration;
    }
    public static final ServiceConnectivityObserver access$getConnectivityObserver$p(ConnectivityService p0){
       return p0.connectivityObserver;
    }
    public static final Context access$getContext$p(ConnectivityService p0){
       return p0.context;
    }
    public static final pw0 access$getCorePreferencesApi$p(ConnectivityService p0){
       return p0.corePreferencesApi;
    }
    public static final sw0 access$getCoreThreadingApi$p(ConnectivityService p0){
       return p0.coreThreadingApi;
    }
    public static final ConnectivityService$InternalLoginControllerDelegate access$getLoginControllerDelegate$p(ConnectivityService p0){
       return p0.loginControllerDelegate;
    }
    public static final vj3 access$getProcessLifecycle$p(ConnectivityService p0){
       return p0.processLifecycle;
    }
    public static final dk3 access$getReconnectObserver$p(ConnectivityService p0){
       return p0.reconnectObserver;
    }
    public static final boolean access$getShouldTryReconnectNow$p(ConnectivityService p0){
       return p0.shouldTryReconnectNow;
    }
    public static final void access$setLoginControllerDelegate$p(ConnectivityService p0,ConnectivityService$InternalLoginControllerDelegate p1){
       p0.loginControllerDelegate = p1;
    }
    public NativeSession adoptNativeSession(){
       ConnectivityService tloginContro;
       if ((tloginContro = this.loginControllerDelegate) != null) {
          return tloginContro.adoptNativeSession();
       }
       co5.N("loginControllerDelegate");
       throw null;
    }
    public void blockingLogout(){
       this.getNativeLoginController().blockingLogout();
    }
    public ConnectivityApi getApi(){
       return this;
    }
    public Object getApi(){
       return this.getApi();
    }
    public NativeConnectionTypeProvider getNativeConnectionTypeProvider(){
       ConnectivityService tnativeConne;
       if ((tnativeConne = this.nativeConnectionTypeProvider) != null) {
          return tnativeConne;
       }
       co5.N("nativeConnectionTypeProvider");
       throw null;
    }
    public NativeApplicationScope getNativeConnectivityApplicationScope(){
       ConnectivityService tnativeConne;
       if ((tnativeConne = this.nativeConnectivityApplicationScope) != null) {
          return tnativeConne;
       }
       co5.N("nativeConnectivityApplicationScope");
       throw null;
    }
    public NativeConnectivityManager getNativeConnectivityManager(){
       ConnectivityService tnativeConne;
       if ((tnativeConne = this.nativeConnectivityManager) != null) {
          return tnativeConne;
       }
       co5.N("nativeConnectivityManager");
       throw null;
    }
    public NativeConnectivityPolicyProvider getNativeConnectivityPolicyProvider(){
       ConnectivityService tnativeConne;
       if ((tnativeConne = this.nativeConnectivityPolicyProvider) != null) {
          return tnativeConne;
       }
       co5.N("nativeConnectivityPolicyProvider");
       throw null;
    }
    public NativeCredentialsStorage getNativeCredentialsStorage(){
       ConnectivityService tnativeCrede;
       if ((tnativeCrede = this.nativeCredentialsStorage) != null) {
          return tnativeCrede;
       }
       co5.N("nativeCredentialsStorage");
       throw null;
    }
    public NativeLoginController getNativeLoginController(){
       ConnectivityService tnativeLogin;
       if ((tnativeLogin = this.nativeLoginController) != null) {
          return tnativeLogin;
       }
       co5.N("nativeLoginController");
       throw null;
    }
    public final g15 getOkHttpClient(){
       return this.okHttpClient;
    }
    public void setLoginControllerDelegate(LoginControllerDelegate p0){
       ConnectivityService tloginContro;
       co5.o(p0, "delegate");
       if ((tloginContro = this.loginControllerDelegate) != null) {
          tloginContro.setExternalLoginControllerDelegate(p0);
          return;
       }else {
          co5.N("loginControllerDelegate");
          throw null;
       }
    }
    public void setNativeConnectionTypeProvider(NativeConnectionTypeProvider p0){
       co5.o(p0, "<set-?>");
       this.nativeConnectionTypeProvider = p0;
    }
    public void setNativeConnectivityApplicationScope(NativeApplicationScope p0){
       co5.o(p0, "<set-?>");
       this.nativeConnectivityApplicationScope = p0;
    }
    public void setNativeConnectivityManager(NativeConnectivityManager p0){
       co5.o(p0, "<set-?>");
       this.nativeConnectivityManager = p0;
    }
    public void setNativeConnectivityPolicyProvider(NativeConnectivityPolicyProvider p0){
       co5.o(p0, "<set-?>");
       this.nativeConnectivityPolicyProvider = p0;
    }
    public void setNativeCredentialsStorage(NativeCredentialsStorage p0){
       co5.o(p0, "<set-?>");
       this.nativeCredentialsStorage = p0;
    }
    public void setNativeLoginController(NativeLoginController p0){
       co5.o(p0, "<set-?>");
       this.nativeLoginController = p0;
    }
    public void setPreShutdownHook(wf2 p0){
       co5.o(p0, "hook");
       this.preShutdownHook = p0;
    }
    public void shutdown(){
       ConnectivityService tpreShutdown;
       this.shouldTryReconnectNow = false;
       this.mainLooperHandler.post(new ConnectivityService$shutdown$1(this));
       this.connectivityObserver.destroy();
       this.connectionTypeDisposable.dispose();
       if ((tpreShutdown = this.preShutdownHook) != null) {
          tpreShutdown.invoke();
       }
       this.coreThreadingApi.a.runBlocking(new ConnectivityService$shutdown$2(this));
       return;
    }
    public Single storedCredentials(){
       Single single = Single.create(new ConnectivityService$storedCredentials$1(this));
       co5.l(single, "override fun storedCrede…        }\n        }\n    }");
       return single;
    }
}

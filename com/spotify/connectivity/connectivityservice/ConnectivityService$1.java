package com.spotify.connectivity.connectivityservice.ConnectivityService$1;
import java.lang.Runnable;
import p.re6;
import com.spotify.connectivity.connectivityservice.ConnectivityService;
import java.lang.Object;
import com.spotify.clientfoundations.connectivity.connectivitysdkpolicyimpl.NativeConnectivityManager;
import p.se6;
import com.spotify.connectivity.TimerManagerThreadScheduler;
import p.sw0;
import p.tw0;
import com.spotify.clientfoundations.concurrency.async.Scheduler;
import com.spotify.connectivity.AnalyticsDelegate;
import com.spotify.clientfoundations.cosmos.cosmosimpl.NativeRouter;
import com.spotify.connectivity.Scheduler;
import com.spotify.clientfoundations.connectivity.connectivitysdkpolicyimpl.NativeConnectivityManager$Companion;
import com.spotify.clientfoundations.connectivity.connectivitysdkcredentialsstorage.PrefsCredentialsStorage;
import p.pw0;
import p.qw0;
import com.spotify.connectivity.ApplicationScopeConfiguration;
import java.lang.String;
import com.spotify.clientfoundations.prefs.prefs.Prefs;
import com.spotify.connectivity.auth.NativeCredentialsStorage;
import com.spotify.clientfoundations.connectivity.connectivitysdkcredentialsstorage.PrefsCredentialsStorage$Companion;
import com.spotify.clientfoundations.connectivity.connectivitysdkpolicyimpl.DefaultConnectionTypeProvider;
import com.spotify.connectivity.NativeConnectionTypeProvider;
import com.spotify.clientfoundations.connectivity.connectivitysdkpolicyimpl.DefaultConnectionTypeProvider$Companion;
import com.spotify.clientfoundations.connectivity.connectivitysdkpolicyimpl.DefaultConnectivityPolicyProvider;
import com.spotify.connectivity.NativeConnectivityPolicyProvider;
import com.spotify.clientfoundations.connectivity.connectivitysdkpolicyimpl.DefaultConnectivityPolicyProvider$Companion;
import com.spotify.connectivity.NativeApplicationScope;
import com.spotify.clientfoundations.concurrency.async.NativeTimerManagerThread;
import com.spotify.connectivity.ConnectionTypeProvider;
import com.spotify.connectivity.ConnectivityPolicyProvider;
import com.spotify.connectivity.auth.CredentialsStorage;
import com.spotify.connectivity.NativeApplicationScope$Companion;
import android.content.Context;
import com.spotify.connectivity.auth.NativeLoginController;
import com.spotify.connectivity.connectivityservice.ConnectivityService$InternalLoginControllerDelegate;
import com.spotify.connectivity.auth.LoginControllerDelegate;
import java.lang.IllegalStateException;

final class ConnectivityService$1 implements Runnable	// class@0006c9 from classes.dex
{
    final re6 $sharedCosmosRouterApi;
    final ConnectivityService this$0;

    public void ConnectivityService$1(re6 p0,ConnectivityService p1){
       this.$sharedCosmosRouterApi = p0;
       this.this$0 = p1;
       super();
    }
    public final void run(){
       String deviceId;
       NativeConnectivityManager nativeConnec = NativeConnectivityManager.Companion.create(this.$sharedCosmosRouterApi.c, new TimerManagerThreadScheduler(ConnectivityService.access$getCoreThreadingApi$p(this.this$0).a), ConnectivityService.access$getAnalyticsDelegate$p(this.this$0), true);
       PrefsCredentialsStorage$Companion companion = PrefsCredentialsStorage.Companion;
       qw0 a = ConnectivityService.access$getCorePreferencesApi$p(this.this$0).a;
       if ((deviceId = ConnectivityService.access$getConnectivityApplicationScopeConfiguration$p(this.this$0).getDeviceId()) == null) {
          throw new IllegalStateException("Required value was null.".toString());
       }
       NativeCredentialsStorage nativeCreden = companion.create(a, deviceId);
       NativeConnectionTypeProvider nativeConnec1 = DefaultConnectionTypeProvider.Companion.create(nativeConnec);
       NativeConnectivityPolicyProvider nativeConnec2 = DefaultConnectivityPolicyProvider.Companion.create(nativeConnec);
       NativeApplicationScope nativeApplic = NativeApplicationScope.Companion.create(ConnectivityService.access$getCoreThreadingApi$p(this.this$0).a, this.$sharedCosmosRouterApi.c, ConnectivityService.access$getAnalyticsDelegate$p(this.this$0), nativeConnec1, nativeConnec2, nativeCreden, ConnectivityService.access$getConnectivityApplicationScopeConfiguration$p(this.this$0));
       NativeLoginController nativeLoginC = nativeApplic.createLoginController(ConnectivityService.access$getCoreThreadingApi$p(this.this$0).a, this.$sharedCosmosRouterApi.c, ConnectivityService.access$getContext$p(this.this$0));
       ConnectivityService$InternalLoginControllerDelegate internalLogi = new ConnectivityService$InternalLoginControllerDelegate(nativeLoginC);
       nativeLoginC.setDelegate(internalLogi);
       this.this$0.setNativeConnectivityManager(nativeConnec);
       this.this$0.setNativeCredentialsStorage(nativeCreden);
       this.this$0.setNativeConnectionTypeProvider(nativeConnec1);
       this.this$0.setNativeConnectivityPolicyProvider(nativeConnec2);
       this.this$0.setNativeConnectivityApplicationScope(nativeApplic);
       this.this$0.setNativeLoginController(nativeLoginC);
       ConnectivityService.access$setLoginControllerDelegate$p(this.this$0, internalLogi);
       return;
    }
}

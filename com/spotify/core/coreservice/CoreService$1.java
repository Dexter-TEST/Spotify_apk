package com.spotify.core.coreservice.CoreService$1;
import java.lang.Runnable;
import com.spotify.core.coreservice.CoreService;
import p.re6;
import java.lang.Object;
import com.spotify.clientfoundations.core.coreimpl.NativeApplicationScopeImpl;
import p.sw0;
import p.tw0;
import p.se6;
import p.pw0;
import p.qw0;
import com.spotify.clientfoundations.core.coreimpl.ApplicationScopeConfiguration;
import com.spotify.connectivity.connectivityapi.ConnectivityApi;
import com.spotify.connectivity.auth.NativeLoginController;
import com.spotify.eventsender.api.EventSenderCoreBridge;
import com.spotify.clientfoundations.concurrency.async.NativeTimerManagerThread;
import com.spotify.clientfoundations.cosmos.cosmosimpl.NativeRouter;
import com.spotify.clientfoundations.prefs.prefsimpl.NativePrefs;
import com.spotify.clientfoundations.core.coreimpl.NativeApplicationScopeImpl$Companion;

final class CoreService$1 implements Runnable	// class@00085d from classes.dex
{
    final re6 $sharedCosmosRouterApi;
    final CoreService this$0;

    public void CoreService$1(CoreService p0,re6 p1){
       this.this$0 = p0;
       this.$sharedCosmosRouterApi = p1;
       super();
    }
    public final void run(){
       CoreService$1 tthis$0 = this.this$0;
       CoreService.access$setNativeCoreApplicationScopeImpl$p(tthis$0, NativeApplicationScopeImpl.Companion.create(CoreService.access$getCoreThreadingApi$p(tthis$0).a, this.$sharedCosmosRouterApi.c, CoreService.access$getCorePreferencesApi$p(this.this$0).a, CoreService.access$getApplicationScopeConfiguration$p(this.this$0), CoreService.access$getConnectivityApi$p(this.this$0).getNativeLoginController(), CoreService.access$getEventSenderCoreBridge$p(this.this$0)));
    }
}

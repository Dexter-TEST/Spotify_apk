package com.spotify.core.coreservice.CoreService;
import com.spotify.core.coreapi.CoreApi;
import p.tb6;
import p.sw0;
import p.pw0;
import com.spotify.clientfoundations.core.coreimpl.ApplicationScopeConfiguration;
import com.spotify.connectivity.connectivityapi.ConnectivityApi;
import p.re6;
import com.spotify.eventsender.api.EventSenderCoreBridge;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.tw0;
import com.spotify.core.coreservice.CoreService$1;
import java.lang.Runnable;
import com.spotify.clientfoundations.concurrency.async.Scheduler;
import com.spotify.clientfoundations.core.coreimpl.NativeApplicationScopeImpl;
import com.spotify.clientfoundations.core.core.NativeApplicationScope;
import com.spotify.core.coreservice.CoreService$shutdown$1;

public final class CoreService implements CoreApi, tb6	// class@00085f from classes.dex
{
    private final ApplicationScopeConfiguration applicationScopeConfiguration;
    private final ConnectivityApi connectivityApi;
    private final pw0 corePreferencesApi;
    private final sw0 coreThreadingApi;
    private final EventSenderCoreBridge eventSenderCoreBridge;
    private NativeApplicationScopeImpl nativeCoreApplicationScopeImpl;

    public void CoreService(sw0 p0,pw0 p1,ApplicationScopeConfiguration p2,ConnectivityApi p3,re6 p4,EventSenderCoreBridge p5){
       co5.o(p0, "coreThreadingApi");
       co5.o(p1, "corePreferencesApi");
       co5.o(p2, "applicationScopeConfiguration");
       co5.o(p3, "connectivityApi");
       co5.o(p4, "sharedCosmosRouterApi");
       co5.o(p5, "eventSenderCoreBridge");
       super();
       this.coreThreadingApi = p0;
       this.corePreferencesApi = p1;
       this.applicationScopeConfiguration = p2;
       this.connectivityApi = p3;
       this.eventSenderCoreBridge = p5;
       p0.a.runBlocking(new CoreService$1(this, p4));
    }
    public static final ApplicationScopeConfiguration access$getApplicationScopeConfiguration$p(CoreService p0){
       return p0.applicationScopeConfiguration;
    }
    public static final ConnectivityApi access$getConnectivityApi$p(CoreService p0){
       return p0.connectivityApi;
    }
    public static final pw0 access$getCorePreferencesApi$p(CoreService p0){
       return p0.corePreferencesApi;
    }
    public static final sw0 access$getCoreThreadingApi$p(CoreService p0){
       return p0.coreThreadingApi;
    }
    public static final EventSenderCoreBridge access$getEventSenderCoreBridge$p(CoreService p0){
       return p0.eventSenderCoreBridge;
    }
    public static final NativeApplicationScopeImpl access$getNativeCoreApplicationScopeImpl$p(CoreService p0){
       return p0.nativeCoreApplicationScopeImpl;
    }
    public static final void access$setNativeCoreApplicationScopeImpl$p(CoreService p0,NativeApplicationScopeImpl p1){
       p0.nativeCoreApplicationScopeImpl = p1;
    }
    public CoreApi getApi(){
       return this;
    }
    public Object getApi(){
       return this.getApi();
    }
    public NativeApplicationScope getNativeCoreApplicationScope(){
       CoreService tnativeCoreA;
       if ((tnativeCoreA = this.nativeCoreApplicationScopeImpl) != null) {
          return tnativeCoreA;
       }
       co5.N("nativeCoreApplicationScopeImpl");
       throw null;
    }
    public void shutdown(){
       this.coreThreadingApi.a.runBlocking(new CoreService$shutdown$1(this));
    }
}

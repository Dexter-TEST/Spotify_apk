package com.spotify.core.corefullsessionservice.NucleusCoreFullSessionServiceInstallerKt$installCoreFullSessionService$1;
import p.wf2;
import p.gi3;
import java.lang.Object;
import p.tb6;
import com.spotify.core.corefullsessionservice.CoreFullSessionService;
import p.sw0;
import p.re6;
import p.pw0;
import p.lt5;
import p.cf6;
import com.spotify.connectivity.connectivityapi.ConnectivityApi;
import com.spotify.core.coreapi.CoreApi;
import com.spotify.connectivity.connectivitysessionapi.ConnectivitySessionApi;
import com.spotify.connectivity.sessionapi.SessionApi;
import p.tc6;
import p.xq3;
import p.fe7;
import com.spotify.clientfoundations.core.corefullimpl.FullAuthenticatedScopeConfiguration;
import p.gh5;
import io.reactivex.rxjava3.core.Observable;

final class NucleusCoreFullSessionServiceInstallerKt$installCoreFullSessionService$1 extends gi3 implements wf2	// class@000846 from classes.dex
{
    final wf2 $connectivityApi;
    final wf2 $connectivitySessionApi;
    final wf2 $coreApi;
    final wf2 $corePreferencesApi;
    final wf2 $coreThreadingApi;
    final wf2 $foreground;
    final wf2 $fullAuthenticatedScopeConfiguration;
    final wf2 $localFilesApi;
    final wf2 $offlinePluginSupportApi;
    final wf2 $remoteConfigurationApi;
    final wf2 $sessionApi;
    final wf2 $settingsApi;
    final wf2 $sharedCosmosRouterApi;
    final wf2 $shorelineCoreApi;
    final wf2 $userDirectoryApi;

    public void NucleusCoreFullSessionServiceInstallerKt$installCoreFullSessionService$1(wf2 p0,wf2 p1,wf2 p2,wf2 p3,wf2 p4,wf2 p5,wf2 p6,wf2 p7,wf2 p8,wf2 p9,wf2 p10,wf2 p11,wf2 p12,wf2 p13,wf2 p14){
       this.$coreThreadingApi = p0;
       this.$sharedCosmosRouterApi = p1;
       this.$corePreferencesApi = p2;
       this.$remoteConfigurationApi = p3;
       this.$shorelineCoreApi = p4;
       this.$connectivityApi = p5;
       this.$coreApi = p6;
       this.$connectivitySessionApi = p7;
       this.$sessionApi = p8;
       this.$settingsApi = p9;
       this.$localFilesApi = p10;
       this.$userDirectoryApi = p11;
       this.$fullAuthenticatedScopeConfiguration = p12;
       this.$offlinePluginSupportApi = p13;
       this.$foreground = p14;
       super(0);
    }
    public Object invoke(){
       return this.invoke();
    }
    public final tb6 invoke(){
       NucleusCoreFullSessionServiceInstallerKt$installCoreFullSessionService$1 oinstallCore = this;
       CoreFullSessionService v17 = new CoreFullSessionService(oinstallCore.$coreThreadingApi.invoke(), oinstallCore.$sharedCosmosRouterApi.invoke(), oinstallCore.$corePreferencesApi.invoke(), oinstallCore.$remoteConfigurationApi.invoke(), oinstallCore.$shorelineCoreApi.invoke(), oinstallCore.$connectivityApi.invoke(), oinstallCore.$coreApi.invoke(), oinstallCore.$connectivitySessionApi.invoke(), oinstallCore.$sessionApi.invoke(), oinstallCore.$settingsApi.invoke(), oinstallCore.$localFilesApi.invoke(), oinstallCore.$userDirectoryApi.invoke(), oinstallCore.$fullAuthenticatedScopeConfiguration.invoke(), oinstallCore.$offlinePluginSupportApi.invoke(), oinstallCore.$foreground.invoke());
       return v17;
    }
}

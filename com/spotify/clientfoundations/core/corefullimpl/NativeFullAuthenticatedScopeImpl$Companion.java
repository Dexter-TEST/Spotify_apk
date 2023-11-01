package com.spotify.clientfoundations.core.corefullimpl.NativeFullAuthenticatedScopeImpl$Companion;
import java.lang.Object;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.spotify.clientfoundations.concurrency.async.NativeTimerManagerThread;
import com.spotify.clientfoundations.cosmos.cosmosimpl.NativeRouter;
import com.spotify.clientfoundations.prefs.prefsimpl.NativePrefs;
import com.spotify.remoteconfig.NativeRemoteConfig;
import com.spotify.shoreline.esperanto.java.api.NativeShorelineLogger;
import com.spotify.clientfoundations.connectivity.connectivitysdkpolicyimpl.NativeConnectivityManager;
import com.spotify.connectivity.NativeApplicationScope;
import com.spotify.connectivity.auth.NativeSession;
import com.spotify.connectivity.NativeAuthenticatedScope;
import com.spotify.clientfoundations.core.core.NativeApplicationScope;
import com.spotify.playback.localfiles.localfilesimpl.NativeLocalFilesDelegate;
import com.spotify.clientfoundations.appstorage.userdirectory.NativeUserDirectoryManager;
import com.spotify.clientfoundations.core.corefullimpl.FullAuthenticatedScopeConfiguration;
import com.spotify.offline.NativeOfflinePluginRegistry;
import com.spotify.offline.NativeForegroundProvider;
import com.spotify.clientfoundations.core.corefullimpl.NativeFullAuthenticatedScopeImpl;

public final class NativeFullAuthenticatedScopeImpl$Companion	// class@00055f from classes.dex
{

    private void NativeFullAuthenticatedScopeImpl$Companion(){
       super();
    }
    public void NativeFullAuthenticatedScopeImpl$Companion(DefaultConstructorMarker p0){
       super();
    }
    public final NativeFullAuthenticatedScopeImpl create(NativeTimerManagerThread p0,NativeRouter p1,NativePrefs p2,NativeRemoteConfig p3,NativeShorelineLogger p4,NativeConnectivityManager p5,NativeApplicationScope p6,NativeSession p7,NativeAuthenticatedScope p8,NativeApplicationScope p9,NativeLocalFilesDelegate p10,NativeUserDirectoryManager p11,FullAuthenticatedScopeConfiguration p12,NativeOfflinePluginRegistry p13,NativeForegroundProvider p14){
       return NativeFullAuthenticatedScopeImpl.create(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14);
    }
}

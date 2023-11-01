package com.spotify.clientfoundations.core.corefullimpl.NativeFullAuthenticatedScopeImpl;
import com.spotify.clientfoundations.core.corefull.NativeFullAuthenticatedScope;
import com.spotify.clientfoundations.core.corefull.FullAuthenticatedScope;
import com.spotify.clientfoundations.core.corefullimpl.NativeFullAuthenticatedScopeImpl$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.Object;
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

public final class NativeFullAuthenticatedScopeImpl implements NativeFullAuthenticatedScope, FullAuthenticatedScope	// class@000560 from classes.dex
{
    private long nThis;
    public static final NativeFullAuthenticatedScopeImpl$Companion Companion;

    static {
       NativeFullAuthenticatedScopeImpl.Companion = new NativeFullAuthenticatedScopeImpl$Companion(null);
    }
    private void NativeFullAuthenticatedScopeImpl(){
       super();
    }
    public static native final NativeFullAuthenticatedScopeImpl create(NativeTimerManagerThread p0,NativeRouter p1,NativePrefs p2,NativeRemoteConfig p3,NativeShorelineLogger p4,NativeConnectivityManager p5,NativeApplicationScope p6,NativeSession p7,NativeAuthenticatedScope p8,NativeApplicationScope p9,NativeLocalFilesDelegate p10,NativeUserDirectoryManager p11,FullAuthenticatedScopeConfiguration p12,NativeOfflinePluginRegistry p13,NativeForegroundProvider p14);
    public native void destroy();
    public native final void flushCaches();
    public long getNThis(){
       return this.nThis;
    }
    public native final void prepareForShutdown();
}

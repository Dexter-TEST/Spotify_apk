package com.spotify.clientfoundations.core.corelimitedimpl.NativeLimitedAuthenticatedScopeImpl;
import com.spotify.clientfoundations.core.corelimited.NativeLimitedAuthenticatedScope;
import com.spotify.clientfoundations.core.corelimited.LimitedAuthenticatedScope;
import com.spotify.clientfoundations.core.corelimitedimpl.NativeLimitedAuthenticatedScopeImpl$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.Object;
import com.spotify.clientfoundations.concurrency.async.NativeTimerManagerThread;
import com.spotify.clientfoundations.cosmos.cosmosimpl.NativeRouter;
import com.spotify.clientfoundations.prefs.prefsimpl.NativePrefs;
import com.spotify.remoteconfig.NativeRemoteConfig;
import com.spotify.clientfoundations.connectivity.connectivitysdkpolicyimpl.NativeConnectivityManager;
import com.spotify.connectivity.NativeApplicationScope;
import com.spotify.connectivity.auth.NativeSession;
import com.spotify.connectivity.NativeAuthenticatedScope;
import com.spotify.clientfoundations.core.core.NativeApplicationScope;
import com.spotify.clientfoundations.appstorage.userdirectory.NativeUserDirectoryManager;
import com.spotify.clientfoundations.core.corelimitedimpl.LimitedAuthenticatedScopeConfiguration;
import com.spotify.offline.NativeForegroundProvider;

public final class NativeLimitedAuthenticatedScopeImpl implements NativeLimitedAuthenticatedScope, LimitedAuthenticatedScope	// class@000568 from classes.dex
{
    private long nThis;
    public static final NativeLimitedAuthenticatedScopeImpl$Companion Companion;

    static {
       NativeLimitedAuthenticatedScopeImpl.Companion = new NativeLimitedAuthenticatedScopeImpl$Companion(null);
    }
    private void NativeLimitedAuthenticatedScopeImpl(){
       super();
    }
    public static native final NativeLimitedAuthenticatedScopeImpl create(NativeTimerManagerThread p0,NativeRouter p1,NativePrefs p2,NativeRemoteConfig p3,NativeConnectivityManager p4,NativeApplicationScope p5,NativeSession p6,NativeAuthenticatedScope p7,NativeApplicationScope p8,NativeUserDirectoryManager p9,LimitedAuthenticatedScopeConfiguration p10,NativeForegroundProvider p11);
    public native void destroy();
    public native final void flushCaches();
    public long getNThis(){
       return this.nThis;
    }
    public native final void prepareForShutdown();
}

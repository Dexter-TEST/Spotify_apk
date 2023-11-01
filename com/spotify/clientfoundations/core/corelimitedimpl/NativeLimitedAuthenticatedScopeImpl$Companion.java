package com.spotify.clientfoundations.core.corelimitedimpl.NativeLimitedAuthenticatedScopeImpl$Companion;
import java.lang.Object;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
import com.spotify.clientfoundations.core.corelimitedimpl.NativeLimitedAuthenticatedScopeImpl;

public final class NativeLimitedAuthenticatedScopeImpl$Companion	// class@000567 from classes.dex
{

    private void NativeLimitedAuthenticatedScopeImpl$Companion(){
       super();
    }
    public void NativeLimitedAuthenticatedScopeImpl$Companion(DefaultConstructorMarker p0){
       super();
    }
    public final NativeLimitedAuthenticatedScopeImpl create(NativeTimerManagerThread p0,NativeRouter p1,NativePrefs p2,NativeRemoteConfig p3,NativeConnectivityManager p4,NativeApplicationScope p5,NativeSession p6,NativeAuthenticatedScope p7,NativeApplicationScope p8,NativeUserDirectoryManager p9,LimitedAuthenticatedScopeConfiguration p10,NativeForegroundProvider p11){
       return NativeLimitedAuthenticatedScopeImpl.create(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11);
    }
}

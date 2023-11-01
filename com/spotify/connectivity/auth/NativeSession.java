package com.spotify.connectivity.auth.NativeSession;
import com.spotify.connectivity.auth.Session;
import com.spotify.connectivity.auth.NativeSession$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.Object;
import com.spotify.connectivity.auth.NativeLoginControllerConfiguration;
import com.spotify.clientfoundations.concurrency.async.NativeTimerManagerThread;
import com.spotify.connectivity.NativeApplicationScope;
import com.spotify.connectivity.AnalyticsDelegate;
import com.spotify.connectivity.ConnectivityPolicyProvider;
import com.spotify.connectivity.ConnectionTypeProvider;
import com.spotify.connectivity.auth.CredentialsStorage;
import com.spotify.connectivity.auth.oauth.NativeAccessToken;
import com.spotify.connectivity.auth.UnencryptedCredentials;
import java.util.Map;
import com.spotify.connectivity.auth.NativeLoginOptions;
import java.lang.String;
import com.spotify.clientfoundations.esperanto.esperanto.Transport;

public final class NativeSession implements Session	// class@000602 from classes.dex
{
    private final String canonicalUsername;
    private final Transport internalTransportToNative;
    private long nThis;
    public static final NativeSession$Companion Companion;

    static {
       NativeSession.Companion = new NativeSession$Companion(null);
    }
    private void NativeSession(){
       super();
    }
    public static native final NativeSession createSession(NativeLoginControllerConfiguration p0,NativeTimerManagerThread p1,NativeApplicationScope p2,AnalyticsDelegate p3,ConnectivityPolicyProvider p4,ConnectionTypeProvider p5,CredentialsStorage p6,NativeAccessToken p7,UnencryptedCredentials p8,Map p9,NativeLoginOptions p10,String p11);
    public native final void blockingLogout();
    public native final void destroy();
    public native final String getCanonicalUsername();
    public native final Transport getInternalTransportToNative();
    public native final void prepareForShutdown();
    public native void tryReconnectNow(boolean p0);
}

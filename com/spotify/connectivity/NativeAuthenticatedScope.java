package com.spotify.connectivity.NativeAuthenticatedScope;
import com.spotify.connectivity.AuthenticatedScope;
import com.spotify.connectivity.NativeAuthenticatedScope$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.Object;
import com.spotify.clientfoundations.concurrency.async.NativeTimerManagerThread;
import com.spotify.clientfoundations.cosmos.cosmosimpl.NativeRouter;
import com.spotify.connectivity.NativeApplicationScope;
import com.spotify.connectivity.auth.NativeSession;
import com.spotify.connectivity.AnalyticsDelegate;
import com.spotify.connectivity.RCSSnapshotIdProvider;
import com.spotify.connectivity.AuthenticatedScopeConfiguration;

public final class NativeAuthenticatedScope implements AuthenticatedScope	// class@0005bc from classes.dex
{
    private long nThis;
    public static final NativeAuthenticatedScope$Companion Companion;

    static {
       NativeAuthenticatedScope.Companion = new NativeAuthenticatedScope$Companion(null);
    }
    private void NativeAuthenticatedScope(){
       super();
    }
    public static native final NativeAuthenticatedScope create(NativeTimerManagerThread p0,NativeRouter p1,NativeApplicationScope p2,NativeSession p3,AnalyticsDelegate p4,RCSSnapshotIdProvider p5,AuthenticatedScopeConfiguration p6);
    public native final void destroy();
    public native void prepareForShutdown();
}

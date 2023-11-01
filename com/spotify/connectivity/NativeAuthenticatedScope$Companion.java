package com.spotify.connectivity.NativeAuthenticatedScope$Companion;
import java.lang.Object;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.spotify.clientfoundations.concurrency.async.NativeTimerManagerThread;
import com.spotify.clientfoundations.cosmos.cosmosimpl.NativeRouter;
import com.spotify.connectivity.NativeApplicationScope;
import com.spotify.connectivity.auth.NativeSession;
import com.spotify.connectivity.AnalyticsDelegate;
import com.spotify.connectivity.RCSSnapshotIdProvider;
import com.spotify.connectivity.AuthenticatedScopeConfiguration;
import com.spotify.connectivity.NativeAuthenticatedScope;

public final class NativeAuthenticatedScope$Companion	// class@0005bb from classes.dex
{

    private void NativeAuthenticatedScope$Companion(){
       super();
    }
    public void NativeAuthenticatedScope$Companion(DefaultConstructorMarker p0){
       super();
    }
    public final NativeAuthenticatedScope create(NativeTimerManagerThread p0,NativeRouter p1,NativeApplicationScope p2,NativeSession p3,AnalyticsDelegate p4,RCSSnapshotIdProvider p5,AuthenticatedScopeConfiguration p6){
       return NativeAuthenticatedScope.create(p0, p1, p2, p3, p4, p5, p6);
    }
}

package com.spotify.connectivity.NativeApplicationScope$Companion;
import java.lang.Object;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.spotify.clientfoundations.concurrency.async.NativeTimerManagerThread;
import com.spotify.clientfoundations.cosmos.cosmosimpl.NativeRouter;
import com.spotify.connectivity.AnalyticsDelegate;
import com.spotify.connectivity.ConnectionTypeProvider;
import com.spotify.connectivity.ConnectivityPolicyProvider;
import com.spotify.connectivity.auth.CredentialsStorage;
import com.spotify.connectivity.ApplicationScopeConfiguration;
import com.spotify.connectivity.NativeApplicationScope;

public final class NativeApplicationScope$Companion	// class@0005b9 from classes.dex
{

    private void NativeApplicationScope$Companion(){
       super();
    }
    public void NativeApplicationScope$Companion(DefaultConstructorMarker p0){
       super();
    }
    public final NativeApplicationScope create(NativeTimerManagerThread p0,NativeRouter p1,AnalyticsDelegate p2,ConnectionTypeProvider p3,ConnectivityPolicyProvider p4,CredentialsStorage p5,ApplicationScopeConfiguration p6){
       return NativeApplicationScope.create(p0, p1, p2, p3, p4, p5, p6);
    }
}

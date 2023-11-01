package com.spotify.connectivity.auth.NativeSession$Companion;
import java.lang.Object;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
import com.spotify.connectivity.auth.NativeSession;

public final class NativeSession$Companion	// class@000601 from classes.dex
{

    private void NativeSession$Companion(){
       super();
    }
    public void NativeSession$Companion(DefaultConstructorMarker p0){
       super();
    }
    public final NativeSession createSession(NativeLoginControllerConfiguration p0,NativeTimerManagerThread p1,NativeApplicationScope p2,AnalyticsDelegate p3,ConnectivityPolicyProvider p4,ConnectionTypeProvider p5,CredentialsStorage p6,NativeAccessToken p7,UnencryptedCredentials p8,Map p9,NativeLoginOptions p10,String p11){
       return NativeSession.createSession(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11);
    }
}

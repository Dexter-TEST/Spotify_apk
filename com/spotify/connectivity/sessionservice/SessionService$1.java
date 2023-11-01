package com.spotify.connectivity.sessionservice.SessionService$1;
import java.lang.Runnable;
import com.spotify.connectivity.sessionservice.SessionService;
import java.lang.Object;
import com.spotify.connectivity.auth.NativeSession;
import com.spotify.connectivity.auth.NativeLoginControllerConfiguration;
import p.sw0;
import p.tw0;
import com.spotify.connectivity.connectivityapi.ConnectivityApi;
import com.spotify.connectivity.NativeApplicationScope;
import com.spotify.connectivity.AnalyticsDelegate;
import com.spotify.connectivity.NativeConnectivityPolicyProvider;
import com.spotify.connectivity.NativeConnectionTypeProvider;
import com.spotify.connectivity.auth.NativeCredentialsStorage;
import com.spotify.connectivity.auth.oauth.NativeAccessToken;
import java.lang.String;
import com.spotify.connectivity.sessionservice.TemporarySessionLoginFlowDependencies;
import com.spotify.connectivity.sessionservice.TemporarySessionLoginFlowDependencies$NewFlow;
import com.spotify.connectivity.auth.AuthUserInfo;
import com.spotify.connectivity.auth.AccessToken;
import java.util.Date;
import com.spotify.connectivity.auth.UnencryptedCredentials;
import com.spotify.connectivity.auth.AuthBlob;
import p.co5;
import com.spotify.connectivity.auth.AuthBlob$StoredCredentials;
import java.util.Map;
import com.spotify.connectivity.auth.NativeLoginOptions;
import com.spotify.core.coreapi.CoreApi;
import com.spotify.clientfoundations.core.core.NativeApplicationScope;
import p.vg0;
import p.nm3;
import com.spotify.clientfoundations.concurrency.async.NativeTimerManagerThread;
import com.spotify.connectivity.ConnectivityPolicyProvider;
import com.spotify.connectivity.ConnectionTypeProvider;
import com.spotify.connectivity.auth.CredentialsStorage;
import com.spotify.connectivity.auth.NativeSession$Companion;

final class SessionService$1 implements Runnable	// class@00081d from classes.dex
{
    final SessionService this$0;

    public void SessionService$1(SessionService p0){
       this.this$0 = p0;
       super();
    }
    public final void run(){
       AccessToken accessToken;
       String token;
       AccessToken accessToken1;
       Date expiresAt;
       SessionService$1 tthis$0 = this.this$0;
       NativeSession$Companion companion = NativeSession.Companion;
       NativeLoginControllerConfiguration nativeLoginC = SessionService.access$getLoginControllerConfiguration$p(tthis$0);
       tw0 a = SessionService.access$getCoreThreadingApi$p(this.this$0).a;
       NativeApplicationScope nativeConnec = SessionService.access$getConnectivityApi$p(this.this$0).getNativeConnectivityApplicationScope();
       AnalyticsDelegate uAnalyticsDe = SessionService.access$getAnalyticsDelegate$p(this.this$0);
       NativeConnectivityPolicyProvider nativeConnec1 = SessionService.access$getConnectivityApi$p(this.this$0).getNativeConnectivityPolicyProvider();
       NativeConnectionTypeProvider nativeConnec2 = SessionService.access$getConnectivityApi$p(this.this$0).getNativeConnectionTypeProvider();
       NativeCredentialsStorage nativeCreden = SessionService.access$getConnectivityApi$p(this.this$0).getNativeCredentialsStorage();
       NativeAccessToken nativeAccess = new NativeAccessToken();
       SessionService$1 tthis$01 = this.this$0;
       nativeAccess.setTokenType("Bearer");
       if ((accessToken = SessionService.access$getTemporarySessionLoginFlowDependencies$p(tthis$01).getAuthUserInfo().getAccessToken()) == null || (token = accessToken.getToken()) == null) {
          token = "";
       }
       nativeAccess.setAccessToken(token);
       long time = ((accessToken1 = SessionService.access$getTemporarySessionLoginFlowDependencies$p(tthis$01).getAuthUserInfo().getAccessToken()) != null && (expiresAt = accessToken1.getExpiresAt()) != null)? expiresAt.getTime(): 0;
       nativeAccess.setExpiresAt((time / 1000));
       AuthBlob authBlob = SessionService.access$getTemporarySessionLoginFlowDependencies$p(this.this$0).getAuthUserInfo().getAuthBlob();
       co5.j(authBlob, "null cannot be cast to non-null type com.spotify.connectivity.auth.AuthBlob.StoredCredentials");
       NativeLoginOptions nativeLoginO = new NativeLoginOptions();
       SessionService$1 tthis$02 = this.this$0;
       nativeLoginO.setCacheId(SessionService.access$getCoreApi$p(tthis$02).getNativeCoreApplicationScope().getCacheId());
       nativeLoginO.setCacheSalt(SessionService.access$getCoreApi$p(tthis$02).getNativeCoreApplicationScope().getCacheSalt());
       nativeLoginO.setProxyOption(1);
       nativeLoginO.setMaintainPersistentApConnection(1);
       nm3 d = SessionService.access$getClientInfo$p(this.this$0).d;
       co5.l(d, "clientInfo.deviceId");
       tthis$0.setNativeSession(companion.createSession(nativeLoginC, a, nativeConnec, uAnalyticsDe, nativeConnec1, nativeConnec2, nativeCreden, nativeAccess, new UnencryptedCredentials(SessionService.access$getTemporarySessionLoginFlowDependencies$p(this.this$0).getAuthUserInfo().getUsername(), authBlob.getStoredCredentials()), SessionService.access$getTemporarySessionLoginFlowDependencies$p(this.this$0).getProductState(), nativeLoginO, d));
       return;
    }
}

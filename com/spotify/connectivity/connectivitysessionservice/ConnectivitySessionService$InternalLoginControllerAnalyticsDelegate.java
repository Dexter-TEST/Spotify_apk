package com.spotify.connectivity.connectivitysessionservice.ConnectivitySessionService$InternalLoginControllerAnalyticsDelegate;
import com.spotify.connectivity.auth.LoginControllerAnalyticsDelegate;
import com.spotify.connectivity.logoutanalyticsdelegate.AuthAnalyticsDelegate;
import java.lang.Object;
import com.spotify.connectivity.logoutanalyticsdelegate.LogoutEvent$WillLogout;
import com.spotify.connectivity.authapi.AuthLogoutReason;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.spotify.connectivity.logoutanalyticsdelegate.LogoutEvent;
import com.spotify.connectivity.logoutanalyticsdelegate.LogoutEvent$DidLogout;
import com.spotify.connectivity.logoutanalyticsdelegate.LogoutEvent$OfflineUserRemoved;
import com.spotify.connectivity.logoutanalyticsdelegate.LogoutEvent$StoredCredentialsRemoved;

public final class ConnectivitySessionService$InternalLoginControllerAnalyticsDelegate implements LoginControllerAnalyticsDelegate	// class@0006ec from classes.dex
{
    private final AuthAnalyticsDelegate authAnalyticsDelegate;

    public void ConnectivitySessionService$InternalLoginControllerAnalyticsDelegate(AuthAnalyticsDelegate p0){
       super();
       this.authAnalyticsDelegate = p0;
    }
    public void onBeforeLogout(){
       ConnectivitySessionService$InternalLoginControllerAnalyticsDelegate tauthAnalyti;
       if ((tauthAnalyti = this.authAnalyticsDelegate) != null) {
          tauthAnalyti.logEvent(new LogoutEvent$WillLogout(AuthLogoutReason.USER_INITIATED, false, 2, null));
       }
       return;
    }
    public void onBeforeLogoutForced(){
       ConnectivitySessionService$InternalLoginControllerAnalyticsDelegate tauthAnalyti;
       if ((tauthAnalyti = this.authAnalyticsDelegate) != null) {
          tauthAnalyti.logEvent(new LogoutEvent$WillLogout(AuthLogoutReason.FORCED_LOGOUT, false, 2, null));
       }
       return;
    }
    public void onBeforeLogoutRemote(){
       ConnectivitySessionService$InternalLoginControllerAnalyticsDelegate tauthAnalyti;
       if ((tauthAnalyti = this.authAnalyticsDelegate) != null) {
          tauthAnalyti.logEvent(new LogoutEvent$WillLogout(AuthLogoutReason.REMOTE_LOGOUT, false, 2, null));
       }
       return;
    }
    public void onLogoutDone(){
       ConnectivitySessionService$InternalLoginControllerAnalyticsDelegate tauthAnalyti;
       if ((tauthAnalyti = this.authAnalyticsDelegate) != null) {
          tauthAnalyti.logEvent(LogoutEvent$DidLogout.INSTANCE);
       }
       return;
    }
    public void onOfflineUserRemoved(){
       ConnectivitySessionService$InternalLoginControllerAnalyticsDelegate tauthAnalyti;
       if ((tauthAnalyti = this.authAnalyticsDelegate) != null) {
          tauthAnalyti.logEvent(LogoutEvent$OfflineUserRemoved.INSTANCE);
       }
       return;
    }
    public void onStoredCredentialsRemoved(){
       ConnectivitySessionService$InternalLoginControllerAnalyticsDelegate tauthAnalyti;
       if ((tauthAnalyti = this.authAnalyticsDelegate) != null) {
          tauthAnalyti.logEvent(LogoutEvent$StoredCredentialsRemoved.INSTANCE);
       }
       return;
    }
}

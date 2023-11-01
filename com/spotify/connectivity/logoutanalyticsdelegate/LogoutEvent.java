package com.spotify.connectivity.logoutanalyticsdelegate.LogoutEvent;
import java.lang.Object;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.String;
import com.spotify.connectivity.logoutanalyticsdelegate.LogoutEvent$WillLogout;
import com.spotify.connectivity.logoutanalyticsdelegate.LogoutEvent$StoredCredentialsRemoved;
import com.spotify.connectivity.logoutanalyticsdelegate.LogoutEvent$OfflineUserRemoved;
import com.spotify.connectivity.logoutanalyticsdelegate.LogoutEvent$DidLogout;
import p.cd2;

public abstract class LogoutEvent	// class@00075a from classes.dex
{

    private void LogoutEvent(){
       super();
    }
    public void LogoutEvent(DefaultConstructorMarker p0){
       super();
    }
    public final String message(){
       String str;
       if (this instanceof LogoutEvent$WillLogout) {
          str = "auth.will_logout";
       }else if(this instanceof LogoutEvent$StoredCredentialsRemoved){
          str = "auth.stored_credentials_removed";
       }else if(this instanceof LogoutEvent$OfflineUserRemoved){
          str = "auth.offline_user_removed";
       }else if(this instanceof LogoutEvent$DidLogout){
          str = "auth.did_logout";
       }else {
          throw new cd2(10);
       }
       return str;
    }
}

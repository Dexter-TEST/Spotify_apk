package com.spotify.connectivity.authapi.AuthenticationStatus;
import java.lang.Object;
import kotlin.jvm.internal.DefaultConstructorMarker;
import com.spotify.connectivity.authapi.AuthenticationStatus$Unauthenticated;
import com.spotify.connectivity.authapi.AuthLogoutReason;

public abstract class AuthenticationStatus	// class@000669 from classes.dex
{

    private void AuthenticationStatus(){
       super();
    }
    public void AuthenticationStatus(DefaultConstructorMarker p0){
       super();
    }
    public final boolean isExplicitlyLoggedOut(){
       boolean b = false;
       if (this.isLoggedOut() && this instanceof AuthenticationStatus$Unauthenticated) {
          AuthenticationStatus$Unauthenticated unauthentica = this;
          if (unauthentica.getLogoutReason() == AuthLogoutReason.USER_INITIATED || (unauthentica.getLogoutReason() == AuthLogoutReason.FORCED_LOGOUT || unauthentica.getLogoutReason() == AuthLogoutReason.REMOTE_LOGOUT)) {
             b = true;
          }
       }
       return b;
    }
    public final boolean isLoggedOut(){
       if (this instanceof AuthenticationStatus$Unauthenticated) {
          AuthenticationStatus$Unauthenticated unauthentica = this;
          if (unauthentica.getLogoutReason() != AuthLogoutReason.APP_SHUTDOWN && (unauthentica.getLogoutReason() != AuthLogoutReason.ATTEMPTING_AUTOLOGIN && unauthentica.getLogoutReason() != AuthLogoutReason.UNDEFINED)) {
             return true;
          }
       }
       return false;
    }
}

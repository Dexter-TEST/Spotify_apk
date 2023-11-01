package com.spotify.connectivity.logoutanalyticsdelegate.LogoutEvent$WillLogout;
import com.spotify.connectivity.logoutanalyticsdelegate.LogoutEvent;
import com.spotify.connectivity.authapi.AuthLogoutReason;
import java.lang.Object;
import java.lang.String;
import p.co5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import java.lang.StringBuilder;
import p.kg4;

public final class LogoutEvent$WillLogout extends LogoutEvent	// class@000759 from classes.dex
{
    private final boolean newLoginFlow;
    private final AuthLogoutReason reason;

    public void LogoutEvent$WillLogout(AuthLogoutReason p0,boolean p1){
       co5.o(p0, "reason");
       super(null);
       this.reason = p0;
       this.newLoginFlow = p1;
    }
    public void LogoutEvent$WillLogout(AuthLogoutReason p0,boolean p1,int p2,DefaultConstructorMarker p3){
       if ((p2 & 0x02)) {
          p1 = false;
       }
       super(p0, p1);
       return;
    }
    public static LogoutEvent$WillLogout copy$default(LogoutEvent$WillLogout p0,AuthLogoutReason p1,boolean p2,int p3,Object p4){
       LogoutEvent$WillLogout reason;
       LogoutEvent$WillLogout newLoginFlow;
       if ((p3 & 0x01)) {
          reason = p0.reason;
       }
       if ((p3 & 0x02)) {
          newLoginFlow = p0.newLoginFlow;
       }
       return p0.copy(reason, newLoginFlow);
    }
    public final AuthLogoutReason component1(){
       return this.reason;
    }
    public final boolean component2(){
       return this.newLoginFlow;
    }
    public final LogoutEvent$WillLogout copy(AuthLogoutReason p0,boolean p1){
       co5.o(p0, "reason");
       return new LogoutEvent$WillLogout(p0, p1);
    }
    public boolean equals(Object p0){
       if (this == p0) {
          return true;
       }
       if (!p0 instanceof LogoutEvent$WillLogout) {
          return false;
       }
       if (this.reason != p0.reason) {
          return false;
       }
       if (this.newLoginFlow != p0.newLoginFlow) {
          return false;
       }
       return true;
    }
    public final boolean getNewLoginFlow(){
       return this.newLoginFlow;
    }
    public final AuthLogoutReason getReason(){
       return this.reason;
    }
    public int hashCode(){
       LogoutEvent$WillLogout tnewLoginFlo;
       int i = this.reason.hashCode() * 31;
       if ((tnewLoginFlo = this.newLoginFlow) != null) {
          tnewLoginFlo = 1;
       }
       return (i + tnewLoginFlo);
    }
    public String toString(){
       return kg4.p("WillLogout\(reason="+this.reason+", newLoginFlow=", this.newLoginFlow, ')');
    }
}

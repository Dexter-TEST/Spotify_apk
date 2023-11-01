package com.spotify.connectivity.logoutanalyticsdelegate.LogoutAnalyticsDelegate;
import com.spotify.connectivity.logoutanalyticsdelegate.AuthAnalyticsDelegate;
import p.tu1;
import p.y37;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.util.LinkedHashMap;
import java.security.SecureRandom;
import java.util.Random;
import com.spotify.connectivity.logoutanalyticsdelegate.LogoutEvent$WillLogout;
import com.spotify.connectivity.authapi.AuthLogoutReason;
import com.spotify.connectivity.logoutanalyticsdelegate.LogoutAnalyticsDelegate$TimeMeasurementCategory;
import p.jl;
import p.iv3;
import com.spotify.libs.connect.events.proto.LogoutNonAuth;
import java.lang.Enum;
import com.google.protobuf.c;
import com.google.protobuf.b;
import java.util.Map;
import p.ld;
import p.md;
import p.b47;
import p.a47;
import com.spotify.connectivity.logoutanalyticsdelegate.LogoutEvent;
import com.spotify.connectivity.logoutanalyticsdelegate.LogoutEvent$StoredCredentialsRemoved;
import com.spotify.connectivity.logoutanalyticsdelegate.LogoutEvent$OfflineUserRemoved;
import com.spotify.connectivity.logoutanalyticsdelegate.LogoutEvent$DidLogout;

public final class LogoutAnalyticsDelegate implements AuthAnalyticsDelegate	// class@000753 from classes.dex
{
    private final tu1 eventPublisher;
    private boolean isEnabled;
    private boolean isQuasarLogoutFlow;
    private AuthLogoutReason logoutReason;
    private boolean offlineUserRemoved;
    private boolean shouldSendEventAlways;
    private boolean storedCredentialsRemoved;
    private final y37 timeKeeper;
    private final Map timeMeasurementBuilders;

    public void LogoutAnalyticsDelegate(tu1 p0,y37 p1){
       co5.o(p0, "eventPublisher");
       co5.o(p1, "timeKeeper");
       super();
       this.eventPublisher = p0;
       this.timeKeeper = p1;
       this.timeMeasurementBuilders = new LinkedHashMap();
    }
    private final boolean getShouldSendEvent(){
       boolean b = true;
       if (this.shouldSendEventAlways != null) {
          return b;
       }
       if (((double)new SecureRandom().nextInt(Integer.MAX_VALUE) - 0x41747ae147851eb8) >= 0) {
          b = false;
       }
       return b;
    }
    public static void getShouldSendEventAlways$annotations(){
    }
    private final void initializeEvent(LogoutEvent$WillLogout p0){
       this.logoutReason = p0.getReason();
       this.isQuasarLogoutFlow = p0.getNewLoginFlow();
       this.startTrackingTime(LogoutAnalyticsDelegate$TimeMeasurementCategory.TOTAL_LOGOUT_DURATION);
    }
    private final void sendEvent(){
       LogoutAnalyticsDelegate tlogoutReaso;
       if ((tlogoutReaso = this.logoutReason) == null) {
          jl.d("Trying to send a logout event that has not been initialized");
          return;
       }else if(this.getShouldSendEvent()){
          LogoutAnalyticsDelegate teventPublis = this.eventPublisher;
          iv3 oiv3 = LogoutNonAuth.j();
          String str = (this.isQuasarLogoutFlow != null)? "v2": "v1";
          oiv3.e(str);
          oiv3.c(tlogoutReaso.name());
          oiv3.f(this.storedCredentialsRemoved);
          oiv3.d(this.offlineUserRemoved);
          c uoc = oiv3.build();
          co5.l(uoc, "newBuilder\(\)\n           …                 .build\(\)");
          teventPublis.a(uoc);
          this.stopTrackingTime(LogoutAnalyticsDelegate$TimeMeasurementCategory.TOTAL_LOGOUT_DURATION);
       }
       this.logoutReason = null;
       this.offlineUserRemoved = false;
       this.storedCredentialsRemoved = false;
       this.timeMeasurementBuilders.clear();
       return;
    }
    private final void startTrackingTime(LogoutAnalyticsDelegate$TimeMeasurementCategory p0){
       if (this.timeMeasurementBuilders.get(p0) != null) {
          jl.e("Trying to start a logout measurement %s that has been initialized", p0.getRaw());
          return;
       }else {
          md omd = this.timeKeeper.a(p0.getRaw());
          omd.h = "android-feature-connectivity";
          omd.g(p0.getRaw());
          this.timeMeasurementBuilders.put(p0, omd);
          return;
       }
    }
    private final void stopTrackingTime(LogoutAnalyticsDelegate$TimeMeasurementCategory p0){
       b47 uob47;
       if ((uob47 = this.timeMeasurementBuilders.get(p0)) == null) {
          jl.e("Trying to complete logout measurement %s that has not been initialized", p0.getRaw());
          return;
       }else {
          uob47.c(p0.getRaw());
          this.timeKeeper.b(uob47.b());
          this.timeMeasurementBuilders.remove(p0);
          return;
       }
    }
    public final boolean getShouldSendEventAlways(){
       return this.shouldSendEventAlways;
    }
    public final boolean isEnabled(){
       return this.isEnabled;
    }
    public final boolean isQuasarLogoutFlow(){
       return this.isQuasarLogoutFlow;
    }
    public void logEvent(LogoutEvent p0){
       co5.o(p0, "event");
       if (this.isEnabled == null) {
          return;
       }
       if (p0 instanceof LogoutEvent$WillLogout) {
          this.initializeEvent(p0);
       }else if(p0 instanceof LogoutEvent$StoredCredentialsRemoved){
          this.storedCredentialsRemoved = true;
       }else if(p0 instanceof LogoutEvent$OfflineUserRemoved){
          this.offlineUserRemoved = true;
       }else if(p0 instanceof LogoutEvent$DidLogout){
          this.sendEvent();
       }
       return;
    }
    public final void setEnabled(boolean p0){
       this.isEnabled = p0;
    }
    public final void setQuasarLogoutFlow(boolean p0){
       this.isQuasarLogoutFlow = p0;
    }
    public final void setShouldSendEventAlways(boolean p0){
       this.shouldSendEventAlways = p0;
    }
}

package com.spotify.connectivity.platformconnectiontype.InternetMonitorImpl;
import com.spotify.connectivity.connectiontype.InternetMonitor;
import com.spotify.connectivity.platformconnectiontype.ConnectivityMonitorImpl;
import com.spotify.connectivity.connectiontype.FlightModeEnabledMonitor;
import com.spotify.connectivity.connectiontype.MobileDataDisabledMonitor;
import java.lang.Object;
import p.fc3;
import p.zv6;
import io.reactivex.rxjava3.core.Observable;
import com.spotify.connectivity.connectiontype.ConnectionType;
import java.lang.Boolean;
import com.spotify.connectivity.connectiontype.InternetState;
import io.reactivex.rxjava3.core.ObservableSource;
import com.spotify.connectivity.connectiontype.InternetState$Builder;
import p.gr7;
import p.pg2;
import p.e16;
import p.yf2;
import io.reactivex.rxjava3.core.Single;

public class InternetMonitorImpl implements InternetMonitor	// class@000798 from classes.dex
{
    private final ConnectivityMonitorImpl mConnectivityMonitor;
    private final Observable mObservable;

    public void InternetMonitorImpl(ConnectivityMonitorImpl p0,FlightModeEnabledMonitor p1,MobileDataDisabledMonitor p2){
       super();
       this.mConnectivityMonitor = p0;
       this.mObservable = Observable.defer(new fc3(this, p1, p2));
    }
    public static InternetState a(ConnectionType p0,Boolean p1,Boolean p2){
       return InternetMonitorImpl.lambda$observeInternetState$1(p0, p1, p2);
    }
    public static Boolean b(InternetMonitorImpl p0,InternetState p1){
       return p0.lambda$getPermanentOfflineState$2(p1);
    }
    public static ObservableSource c(InternetMonitorImpl p0,FlightModeEnabledMonitor p1,MobileDataDisabledMonitor p2){
       return p0.lambda$new$0(p1, p2);
    }
    private Boolean lambda$getPermanentOfflineState$2(InternetState p0){
       return Boolean.valueOf(this.isPermanentOffline(p0.connectionType(), p0.mobileDataDisabled(), p0.flightModeEnabled()));
    }
    private ObservableSource lambda$new$0(FlightModeEnabledMonitor p0,MobileDataDisabledMonitor p1){
       return InternetMonitorImpl.observeInternetState(this.mConnectivityMonitor, p0, p1);
    }
    private static InternetState lambda$observeInternetState$1(ConnectionType p0,Boolean p1,Boolean p2){
       return InternetState.builder().connectionType(p0).flightModeEnabled(p1.booleanValue()).mobileDataDisabled(p2.booleanValue()).build();
    }
    private static Observable observeInternetState(ConnectivityMonitorImpl p0,FlightModeEnabledMonitor p1,MobileDataDisabledMonitor p2){
       return Observable.combineLatest(p0.getConnectionTypes(), p1.isFlightModeEnabled(), p2.isMobileDataDisabled(), new gr7(18));
    }
    public Observable getInternetState(){
       return this.mObservable;
    }
    public Observable getPermanentOfflineState(){
       return this.getInternetState().map(new e16(5, this));
    }
    public boolean isPermanentOffline(ConnectionType p0,boolean p1,boolean p2){
       boolean b = false;
       int i = (p0 != ConnectionType.CONNECTION_TYPE_UNKNOWN && p0.isOffline())? 0: 1;
       int i1 = (!p1 && !p2)? 0: 1;
       if (!i && i1) {
          b = true;
       }
       return b;
    }
    public Single isPermanentlyOffline(){
       return this.getPermanentOfflineState().firstOrError();
    }
}

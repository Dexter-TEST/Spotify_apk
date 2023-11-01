package com.spotify.connectivity.platformconnectiontype.ConnectionStateObservable;
import java.lang.Object;
import com.spotify.connectivity.connectiontype.OfflineState$State;
import com.spotify.connectivity.connectiontype.ConnectionState;
import io.reactivex.rxjava3.core.Observable;
import p.bm;
import io.reactivex.rxjava3.core.ObservableSource;
import p.w00;
import com.spotify.connectivity.connectiontype.OfflineReason;
import com.spotify.connectivity.platformconnectiontype.ConnectionStateObservable$1;
import java.lang.Enum;

public final class ConnectionStateObservable	// class@000771 from classes.dex
{

    private void ConnectionStateObservable(){
       super();
    }
    public static ConnectionState a(OfflineState$State p0,boolean p1){
       return ConnectionStateObservable.toConnectionState(p0, p1);
    }
    public static Observable create(Observable p0,Observable p1){
       return Observable.combineLatest(p0, p1, new bm(2)).distinctUntilChanged();
    }
    private static ConnectionState toConnectionState(OfflineState$State p0,boolean p1){
       int i;
       if (p0 == OfflineState$State.FORCED_OFFLINE) {
          return ConnectionState.offline(OfflineReason.FORCED_OFFLINE);
       }
       if (!p1) {
          return ConnectionState.offline(OfflineReason.NO_INTERNET);
       }
       if ((i = ConnectionStateObservable$1.$SwitchMap$com$spotify$connectivity$connectiontype$OfflineState$State[p0.ordinal()]) == 1) {
          return ConnectionState.offline(OfflineReason.AP_CONNECTION_PROBLEM);
       }
       if (i != 2) {
          return ConnectionState.connecting();
       }
       return ConnectionState.online();
    }
}

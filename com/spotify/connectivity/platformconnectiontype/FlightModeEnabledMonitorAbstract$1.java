package com.spotify.connectivity.platformconnectiontype.FlightModeEnabledMonitorAbstract$1;
import p.zv6;
import com.spotify.connectivity.platformconnectiontype.FlightModeEnabledMonitorAbstract;
import android.content.IntentFilter;
import java.lang.Object;
import io.reactivex.rxjava3.core.ObservableSource;
import android.content.Context;
import p.t60;
import p.xe7;
import com.spotify.connectivity.platformconnectiontype.FlightModeEnabledMonitorAbstract$1$1;
import p.yf2;
import io.reactivex.rxjava3.core.Observable;
import com.spotify.connectivity.platformconnectiontype.FlightModeEnabledMonitorAbstract$1$2;
import java.util.concurrent.Callable;

final class FlightModeEnabledMonitorAbstract$1 implements zv6	// class@000792 from classes.dex
{
    final IntentFilter $filter;
    final FlightModeEnabledMonitorAbstract this$0;

    public void FlightModeEnabledMonitorAbstract$1(FlightModeEnabledMonitorAbstract p0,IntentFilter p1){
       this.this$0 = p0;
       this.$filter = p1;
       super();
    }
    public final ObservableSource get(){
       return xe7.v(this.this$0.getAppContext$src_main_java_com_spotify_connectivity_platformconnectiontype_platformconnectiontype_kt(), this.$filter).map(new FlightModeEnabledMonitorAbstract$1$1(this.this$0)).startWith(Observable.fromCallable(new FlightModeEnabledMonitorAbstract$1$2(this.this$0))).distinctUntilChanged();
    }
    public Object get(){
       return this.get();
    }
}

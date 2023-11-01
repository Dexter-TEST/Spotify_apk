package com.spotify.connectivity.platformconnectiontype.InternetConnectivityObservableImpl;
import com.spotify.connectivity.connectiontype.ConnectivityListener;
import java.lang.Object;
import io.reactivex.rxjava3.core.ObservableEmitter;
import com.spotify.connectivity.connectiontype.ConnectionType;
import java.lang.Boolean;
import com.spotify.connectivity.connectiontype.ConnectivityObserver;
import p.sp0;
import p.tp0;
import p.tb0;
import io.reactivex.rxjava3.core.Observable;
import p.pp;
import p.yf2;
import p.up0;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.core.Scheduler;
import p.id;

public final class InternetConnectivityObservableImpl	// class@000797 from classes.dex
{
    private final ConnectivityListener mConnectivityListener;

    public void InternetConnectivityObservableImpl(ConnectivityListener p0){
       super();
       this.mConnectivityListener = p0;
    }
    public static void a(InternetConnectivityObservableImpl p0,ObservableEmitter p1){
       p0.lambda$createConnectionType$3(p1);
    }
    public static Boolean b(ConnectionType p0){
       return InternetConnectivityObservableImpl.lambda$create$0(p0);
    }
    public static void c(ObservableEmitter p0,ConnectionType p1,boolean p2){
       InternetConnectivityObservableImpl.lambda$createConnectionType$1(p0, p1, p2);
    }
    public static void d(InternetConnectivityObservableImpl p0,ConnectivityObserver p1){
       p0.lambda$createConnectionType$2(p1);
    }
    private static Boolean lambda$create$0(ConnectionType p0){
       boolean b = (p0 != ConnectionType.CONNECTION_TYPE_NONE)? true: false;
       return Boolean.valueOf(b);
    }
    private static void lambda$createConnectionType$1(ObservableEmitter p0,ConnectionType p1,boolean p2){
       if (!p0.isDisposed()) {
          p0.onNext(p1);
       }
       return;
    }
    private void lambda$createConnectionType$2(ConnectivityObserver p0){
       this.mConnectivityListener.unregisterConnectivityObserver(p0);
    }
    private void lambda$createConnectionType$3(ObservableEmitter p0){
       sp0 osp0 = new sp0(p0, 1);
       p0.setCancellable(new tp0(this, osp0, 1));
       p0.onNext(this.mConnectivityListener.getConnectionType());
       this.mConnectivityListener.registerConnectivityObserver(osp0);
    }
    public Observable create(){
       return this.createConnectionType().map(new pp(9)).distinctUntilChanged();
    }
    public Observable createConnectionType(){
       return Observable.create(new up0(1, this)).distinctUntilChanged().subscribeOn(id.a());
    }
    public ConnectionType getNetworkConnectivity(){
       return this.mConnectivityListener.getConnectionType();
    }
    public boolean isConnected(){
       boolean b = (this.getNetworkConnectivity() != ConnectionType.CONNECTION_TYPE_NONE)? true: false;
       return b;
    }
}

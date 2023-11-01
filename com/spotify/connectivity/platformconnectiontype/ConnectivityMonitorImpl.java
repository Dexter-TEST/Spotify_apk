package com.spotify.connectivity.platformconnectiontype.ConnectivityMonitorImpl;
import com.spotify.connectivity.connectiontype.ConnectivityListener;
import java.lang.Object;
import io.reactivex.rxjava3.core.ObservableEmitter;
import com.spotify.connectivity.connectiontype.ConnectionType;
import com.spotify.connectivity.connectiontype.ConnectivityObserver;
import p.sp0;
import p.tp0;
import p.tb0;
import io.reactivex.rxjava3.core.Observable;
import p.up0;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import io.reactivex.rxjava3.core.Scheduler;
import p.id;

public class ConnectivityMonitorImpl	// class@00078b from classes.dex
{
    private final ConnectivityListener mConnectivityListener;

    public void ConnectivityMonitorImpl(ConnectivityListener p0){
       super();
       this.mConnectivityListener = p0;
    }
    public static void a(ObservableEmitter p0,ConnectionType p1,boolean p2){
       ConnectivityMonitorImpl.lambda$getConnectionTypes$0(p0, p1, p2);
    }
    public static void b(ConnectivityMonitorImpl p0,ConnectivityObserver p1){
       p0.lambda$getConnectionTypes$1(p1);
    }
    public static void c(ConnectivityMonitorImpl p0,ObservableEmitter p1){
       p0.lambda$getConnectionTypes$2(p1);
    }
    private static void lambda$getConnectionTypes$0(ObservableEmitter p0,ConnectionType p1,boolean p2){
       if (!p0.isDisposed()) {
          p0.onNext(p1);
       }
       return;
    }
    private void lambda$getConnectionTypes$1(ConnectivityObserver p0){
       this.mConnectivityListener.unregisterConnectivityObserver(p0);
    }
    private void lambda$getConnectionTypes$2(ObservableEmitter p0){
       sp0 osp0 = new sp0(p0, 0);
       this.mConnectivityListener.registerConnectivityObserver(osp0);
       p0.setCancellable(new tp0(this, osp0, 0));
       p0.onNext(this.mConnectivityListener.getConnectionType());
    }
    public ConnectionType getConnectionType(){
       return this.mConnectivityListener.getConnectionType();
    }
    public Observable getConnectionTypes(){
       return Observable.create(new up0(0, this)).subscribeOn(id.a());
    }
}

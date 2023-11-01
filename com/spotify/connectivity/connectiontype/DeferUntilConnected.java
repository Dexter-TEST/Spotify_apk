package com.spotify.connectivity.connectiontype.DeferUntilConnected;
import io.reactivex.rxjava3.core.ObservableTransformer;
import com.spotify.connectivity.connectiontype.ConnectionApis;
import java.lang.Object;
import io.reactivex.rxjava3.core.Observable;
import java.lang.Boolean;
import io.reactivex.rxjava3.core.ObservableSource;
import com.spotify.connectivity.connectiontype.ConnectionType;
import p.pp;
import p.yf2;
import p.bm;
import p.bi5;
import p.t81;
import p.s81;

public class DeferUntilConnected implements ObservableTransformer	// class@000697 from classes.dex
{
    private final ConnectionApis mConnectionApis;

    public void DeferUntilConnected(ConnectionApis p0){
       super();
       this.mConnectionApis = p0;
    }
    public static ObservableSource a(Observable p0,Boolean p1){
       return DeferUntilConnected.lambda$apply$2(p0, p1);
    }
    public static ObservableSource b(DeferUntilConnected p0,Observable p1){
       return p0.lambda$apply$3(p1);
    }
    public static Boolean c(ConnectionType p0){
       return DeferUntilConnected.lambda$apply$0(p0);
    }
    public static boolean d(Boolean p0){
       return DeferUntilConnected.lambda$apply$1(p0);
    }
    private static Boolean lambda$apply$0(ConnectionType p0){
       return Boolean.valueOf((p0.isOffline() ^ 0x01));
    }
    private static boolean lambda$apply$1(Boolean p0){
       return p0.booleanValue();
    }
    private static ObservableSource lambda$apply$2(Observable p0,Boolean p1){
       if (p1.booleanValue()) {
       }else {
          p0 = Observable.empty();
       }
       return p0;
    }
    private ObservableSource lambda$apply$3(Observable p0){
       return this.mConnectionApis.getConnectionTypeObservable().map(new pp(6)).filter(new bm(0)).take(1).switchMap(new t81(p0, 0));
    }
    public ObservableSource apply(Observable p0){
       return p0.compose(new s81(0, this));
    }
}

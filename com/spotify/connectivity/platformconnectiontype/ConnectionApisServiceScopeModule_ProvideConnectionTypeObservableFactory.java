package com.spotify.connectivity.platformconnectiontype.ConnectionApisServiceScopeModule_ProvideConnectionTypeObservableFactory;
import p.a02;
import p.tm5;
import java.lang.Object;
import com.spotify.connectivity.connectiontype.ConnectionApis;
import io.reactivex.rxjava3.core.Observable;
import p.cp0;
import p.co5;

public final class ConnectionApisServiceScopeModule_ProvideConnectionTypeObservableFactory implements a02	// class@00076b from classes.dex
{
    private final tm5 connectionApisProvider;

    public void ConnectionApisServiceScopeModule_ProvideConnectionTypeObservableFactory(tm5 p0){
       super();
       this.connectionApisProvider = p0;
    }
    public static ConnectionApisServiceScopeModule_ProvideConnectionTypeObservableFactory create(tm5 p0){
       return new ConnectionApisServiceScopeModule_ProvideConnectionTypeObservableFactory(p0);
    }
    public static Observable provideConnectionTypeObservable(ConnectionApis p0){
       Observable observable = cp0.a(p0);
       co5.n(observable);
       return observable;
    }
    public Observable get(){
       return ConnectionApisServiceScopeModule_ProvideConnectionTypeObservableFactory.provideConnectionTypeObservable(this.connectionApisProvider.get());
    }
    public Object get(){
       return this.get();
    }
}

package com.spotify.connectivity.platformconnectiontype.ConnectionStateModule_ProvideConnectionStateFactory;
import p.a02;
import p.tm5;
import java.lang.Object;
import com.spotify.connectivity.connectiontype.CoreConnectionState;
import com.spotify.connectivity.connectiontype.ConnectionApis;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Observable;
import com.spotify.connectivity.platformconnectiontype.ConnectionStateModule;
import p.co5;

public final class ConnectionStateModule_ProvideConnectionStateFactory implements a02	// class@00076e from classes.dex
{
    private final tm5 connectionApisProvider;
    private final tm5 endpointProvider;
    private final tm5 ioSchedulerProvider;

    public void ConnectionStateModule_ProvideConnectionStateFactory(tm5 p0,tm5 p1,tm5 p2){
       super();
       this.endpointProvider = p0;
       this.connectionApisProvider = p1;
       this.ioSchedulerProvider = p2;
    }
    public static ConnectionStateModule_ProvideConnectionStateFactory create(tm5 p0,tm5 p1,tm5 p2){
       return new ConnectionStateModule_ProvideConnectionStateFactory(p0, p1, p2);
    }
    public static Observable provideConnectionState(CoreConnectionState p0,ConnectionApis p1,Scheduler p2){
       Observable observable = ConnectionStateModule.provideConnectionState(p0, p1, p2);
       co5.n(observable);
       return observable;
    }
    public Observable get(){
       return ConnectionStateModule_ProvideConnectionStateFactory.provideConnectionState(this.endpointProvider.get(), this.connectionApisProvider.get(), this.ioSchedulerProvider.get());
    }
    public Object get(){
       return this.get();
    }
}

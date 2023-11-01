package com.spotify.connectivity.platformconnectiontype.ConnectionStateModule;
import java.lang.Object;
import com.spotify.connectivity.connectiontype.CoreConnectionState;
import com.spotify.connectivity.connectiontype.ConnectionApis;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Observable;
import p.pp;
import p.yf2;
import com.spotify.connectivity.platformconnectiontype.ConnectionStateObservable;
import p.zo0;
import java.lang.Class;
import p.tv4;
import com.spotify.cosmos.cosmonaut.Cosmonaut;

public final class ConnectionStateModule	// class@00076d from classes.dex
{

    public void ConnectionStateModule(){
       super();
    }
    public static Observable provideConnectionState(CoreConnectionState p0,ConnectionApis p1,Scheduler p2){
       zo0 ozo0 = ConnectionStateObservable.create(p0.connection().map(new pp(8)), p1.isConnectedObservable()).observeOn(p2).replay(1);
       ozo0.getClass();
       return new tv4(ozo0);
    }
    public static CoreConnectionState provideCoreConnectionStateEndpoint(Cosmonaut p0){
       return p0.createCosmosService(CoreConnectionState.class);
    }
}

package com.spotify.connectivity.connectiontype.RxConnectionState_Factory;
import p.a02;
import p.tm5;
import java.lang.Object;
import io.reactivex.rxjava3.core.Observable;
import com.spotify.connectivity.connectiontype.RxConnectionState;

public final class RxConnectionState_Factory implements a02	// class@0006ae from classes.dex
{
    private final tm5 connectionStateProvider;

    public void RxConnectionState_Factory(tm5 p0){
       super();
       this.connectionStateProvider = p0;
    }
    public static RxConnectionState_Factory create(tm5 p0){
       return new RxConnectionState_Factory(p0);
    }
    public static RxConnectionState newInstance(Observable p0){
       return new RxConnectionState(p0);
    }
    public RxConnectionState get(){
       return RxConnectionState_Factory.newInstance(this.connectionStateProvider.get());
    }
    public Object get(){
       return this.get();
    }
}

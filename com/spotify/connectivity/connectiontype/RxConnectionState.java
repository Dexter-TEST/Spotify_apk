package com.spotify.connectivity.connectiontype.RxConnectionState;
import io.reactivex.rxjava3.core.Observable;
import java.lang.Object;
import p.pp;
import p.yf2;

public class RxConnectionState	// class@0006ad from classes.dex
{
    private final Observable mConnectionState;

    public void RxConnectionState(Observable p0){
       super();
       this.mConnectionState = p0;
    }
    public Observable getConnectionState(){
       return this.mConnectionState;
    }
    public Observable isOnline(){
       return this.getConnectionState().map(new pp(7)).distinctUntilChanged();
    }
}

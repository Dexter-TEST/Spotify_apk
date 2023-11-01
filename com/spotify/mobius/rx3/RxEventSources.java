package com.spotify.mobius.rx3.RxEventSources;
import io.reactivex.rxjava3.core.ObservableSource;
import p.nv1;
import io.reactivex.rxjava3.core.Observable;
import com.spotify.mobius.rx3.RxEventSources$1;

public abstract class RxEventSources	// class@000a89 from classes.dex
{

    public static nv1 a(ObservableSource[] p0){
       return new RxEventSources$1(Observable.mergeArray(p0));
    }
}

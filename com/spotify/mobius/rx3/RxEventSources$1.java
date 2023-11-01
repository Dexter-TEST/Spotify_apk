package com.spotify.mobius.rx3.RxEventSources$1;
import p.nv1;
import io.reactivex.rxjava3.core.Observable;
import java.lang.Object;
import p.hr0;
import p.vc1;
import java.util.concurrent.atomic.AtomicBoolean;
import p.s06;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;
import p.t06;

class RxEventSources$1 implements nv1	// class@000a88 from classes.dex
{
    public final Observable a;

    public void RxEventSources$1(Observable p0){
       this.a = p0;
       super();
    }
    public final vc1 a(hr0 p0){
       AtomicBoolean uAtomicBoole = new AtomicBoolean();
       return new t06(uAtomicBoole, this.a.subscribe(new s06(uAtomicBoole, p0)));
    }
}

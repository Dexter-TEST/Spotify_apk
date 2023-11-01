package com.spotify.mobius.rx3.RxConnectables$1$2;
import p.ap0;
import p.an5;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.Object;

class RxConnectables$1$2 implements ap0	// class@000a85 from classes.dex
{
    public final an5 a;
    public final Disposable b;

    public void RxConnectables$1$2(an5 p0,Disposable p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void accept(Object p0){
       this.a.onNext(p0);
    }
    public final void dispose(){
       this.b.dispose();
    }
}

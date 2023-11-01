package com.spotify.mobius.rx3.Transformers$3$1;
import p.yf2;
import com.spotify.mobius.rx3.Transformers$3;
import java.lang.Object;
import com.spotify.mobius.rx3.Transformers$3$1$1;
import p.zv6;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;

class Transformers$3$1 implements yf2	// class@000a94 from classes.dex
{
    public final Transformers$3 a;

    public void Transformers$3$1(Transformers$3 p0){
       this.a = p0;
       super();
    }
    public final Object apply(Object p0){
       Transformers$3 b;
       p0 = Observable.fromSupplier(new Transformers$3$1$1(this, p0));
       if ((b = this.a.b) == null) {
       }else {
          p0 = p0.subscribeOn(b);
       }
       return p0;
    }
}

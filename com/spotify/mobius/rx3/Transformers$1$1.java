package com.spotify.mobius.rx3.Transformers$1$1;
import p.yf2;
import com.spotify.mobius.rx3.Transformers$1;
import java.lang.Object;
import p.b5;
import p.ok0;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Scheduler;
import p.rk0;

class Transformers$1$1 implements yf2	// class@000a8e from classes.dex
{
    public final Transformers$1 a;

    public void Transformers$1$1(Transformers$1 p0){
       this.a = p0;
       super();
    }
    public final Object apply(Object p0){
       p0 = this.a;
       Transformers$1 b = p0.b;
       p0 = (p0.a == null)? Completable.i(b): Completable.i(b).p(p0.a);
       return p0;
    }
}

package com.spotify.mobius.rx3.Transformers$2;
import io.reactivex.rxjava3.core.ObservableTransformer;
import p.ir0;
import io.reactivex.rxjava3.core.Scheduler;
import java.lang.Object;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import com.spotify.mobius.rx3.Transformers$2$1;
import p.yf2;
import io.reactivex.rxjava3.core.Completable;

class Transformers$2 implements ObservableTransformer	// class@000a92 from classes.dex
{
    public final ir0 a;
    public final Scheduler b;

    public void Transformers$2(ir0 p0,Scheduler p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final ObservableSource apply(Observable p0){
       return p0.flatMapCompletable(new Transformers$2$1(this)).s();
    }
}

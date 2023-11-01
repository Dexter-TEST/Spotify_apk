package com.spotify.mobius.rx3.Transformers$1;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Scheduler;
import p.b5;
import java.lang.Object;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import com.spotify.mobius.rx3.Transformers$1$1;
import p.yf2;
import io.reactivex.rxjava3.core.Completable;

class Transformers$1 implements ObservableTransformer	// class@000a8f from classes.dex
{
    public final Scheduler a;
    public final b5 b;

    public void Transformers$1(Scheduler p0,b5 p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final ObservableSource apply(Observable p0){
       return p0.flatMapCompletable(new Transformers$1$1(this)).s();
    }
}

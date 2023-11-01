package com.spotify.mobius.rx3.Transformers$3;
import io.reactivex.rxjava3.core.ObservableTransformer;
import p.yf2;
import io.reactivex.rxjava3.core.Scheduler;
import java.lang.Object;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import com.spotify.mobius.rx3.Transformers$3$1;

class Transformers$3 implements ObservableTransformer	// class@000a95 from classes.dex
{
    public final yf2 a;
    public final Scheduler b;

    public void Transformers$3(yf2 p0,Scheduler p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final ObservableSource apply(Observable p0){
       return p0.flatMap(new Transformers$3$1(this));
    }
}

package com.spotify.connectivity.productstateesperanto.AccumulatedProductStateClient$get$1;
import p.yf2;
import com.spotify.connectivity.productstateesperanto.AccumulatedProductStateClient;
import java.lang.Object;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Single;
import com.spotify.connectivity.productstateesperanto.AccumulatedProductStateClient$get$1$1;
import p.ir0;
import com.spotify.connectivity.productstateesperanto.AccumulatedProductStateClient$get$1$2;
import com.spotify.connectivity.productstateesperanto.AccumulatedProductStateClient$get$1$3;

final class AccumulatedProductStateClient$get$1 implements yf2	// class@0007e2 from classes.dex
{
    final AccumulatedProductStateClient this$0;

    public void AccumulatedProductStateClient$get$1(AccumulatedProductStateClient p0){
       this.this$0 = p0;
       super();
    }
    public final ObservableSource apply(Observable p0){
       return p0.take(1).singleOrError().doOnSubscribe(new AccumulatedProductStateClient$get$1$1(this.this$0)).doOnSuccess(new AccumulatedProductStateClient$get$1$2(this.this$0)).flatMapObservable(new AccumulatedProductStateClient$get$1$3(p0));
    }
    public Object apply(Object p0){
       return this.apply(p0);
    }
}

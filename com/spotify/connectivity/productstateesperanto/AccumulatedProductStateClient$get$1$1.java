package com.spotify.connectivity.productstateesperanto.AccumulatedProductStateClient$get$1$1;
import p.ir0;
import com.spotify.connectivity.productstateesperanto.AccumulatedProductStateClient;
import java.lang.Object;
import io.reactivex.rxjava3.disposables.Disposable;
import p.mi0;
import p.jc;
import java.lang.String;

final class AccumulatedProductStateClient$get$1$1 implements ir0	// class@0007df from classes.dex
{
    final AccumulatedProductStateClient this$0;

    public void AccumulatedProductStateClient$get$1$1(AccumulatedProductStateClient p0){
       this.this$0 = p0;
       super();
    }
    public final void accept(Disposable p0){
       AccumulatedProductStateClient.access$getColdStartupTimeKeeper$p(this.this$0).b("product_state_load");
    }
    public void accept(Object p0){
       this.accept(p0);
    }
}

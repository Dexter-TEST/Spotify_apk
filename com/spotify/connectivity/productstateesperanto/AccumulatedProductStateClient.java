package com.spotify.connectivity.productstateesperanto.AccumulatedProductStateClient;
import com.spotify.connectivity.productstateesperanto.ProductStateMethods;
import p.mi0;
import io.reactivex.rxjava3.core.ObservableTransformer;
import java.lang.Object;
import java.lang.String;
import p.co5;
import io.reactivex.rxjava3.core.Observable;
import com.spotify.connectivity.productstateesperanto.AccumulatedProductStateClient$get$1;
import p.yf2;
import com.spotify.connectivity.productstateesperanto.AccumulatedProductStateClient$get$2;

public final class AccumulatedProductStateClient	// class@0007e4 from classes.dex
{
    private final ObservableTransformer accumulator;
    private final mi0 coldStartupTimeKeeper;
    private final ProductStateMethods productStateMethods;

    public void AccumulatedProductStateClient(ProductStateMethods p0,mi0 p1,ObservableTransformer p2){
       co5.o(p0, "productStateMethods");
       co5.o(p1, "coldStartupTimeKeeper");
       co5.o(p2, "accumulator");
       super();
       this.productStateMethods = p0;
       this.coldStartupTimeKeeper = p1;
       this.accumulator = p2;
    }
    public static final mi0 access$getColdStartupTimeKeeper$p(AccumulatedProductStateClient p0){
       return p0.coldStartupTimeKeeper;
    }
    public final Observable get(){
       Observable observable = this.productStateMethods.values().publish(new AccumulatedProductStateClient$get$1(this)).map(AccumulatedProductStateClient$get$2.INSTANCE).compose(this.accumulator);
       co5.l(observable, "fun get\(\): Observable<Ma…    .compose\(accumulator\)");
       return observable;
    }
}

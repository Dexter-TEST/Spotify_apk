package com.spotify.connectivity.productstateesperanto.AccumulatedProductStateClient$get$1$3;
import p.yf2;
import io.reactivex.rxjava3.core.Observable;
import java.lang.Object;
import java.util.Map;

final class AccumulatedProductStateClient$get$1$3 implements yf2	// class@0007e1 from classes.dex
{
    final Observable $tmp0;

    public void AccumulatedProductStateClient$get$1$3(Observable p0){
       this.$tmp0 = p0;
       super();
    }
    public final Observable apply(Map p0){
       return this.$tmp0.startWithItem(p0);
    }
    public Object apply(Object p0){
       return this.apply(p0);
    }
}

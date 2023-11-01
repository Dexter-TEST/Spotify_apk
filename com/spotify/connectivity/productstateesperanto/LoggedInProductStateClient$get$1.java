package com.spotify.connectivity.productstateesperanto.LoggedInProductStateClient$get$1;
import p.yf2;
import com.spotify.connectivity.productstateesperanto.LoggedInProductStateClient;
import java.lang.Object;
import java.lang.Boolean;
import io.reactivex.rxjava3.core.ObservableSource;
import java.lang.String;
import p.co5;
import com.spotify.connectivity.productstateesperanto.AccumulatedProductStateClient;
import io.reactivex.rxjava3.core.Observable;
import p.dt5;

final class LoggedInProductStateClient$get$1 implements yf2	// class@0007e6 from classes.dex
{
    final LoggedInProductStateClient this$0;

    public void LoggedInProductStateClient$get$1(LoggedInProductStateClient p0){
       this.this$0 = p0;
       super();
    }
    public final ObservableSource apply(Boolean p0){
       co5.l(p0, "loggedIn");
       Observable observable = (p0.booleanValue())? LoggedInProductStateClient.access$getAccumulatedProductStateClient$p(this.this$0).get(): Observable.just(dt5.x);
       return observable;
    }
    public Object apply(Object p0){
       return this.apply(p0);
    }
}

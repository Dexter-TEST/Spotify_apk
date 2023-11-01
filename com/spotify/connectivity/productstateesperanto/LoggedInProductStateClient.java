package com.spotify.connectivity.productstateesperanto.LoggedInProductStateClient;
import io.reactivex.rxjava3.core.Observable;
import com.spotify.connectivity.productstateesperanto.AccumulatedProductStateClient;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.spotify.connectivity.productstateesperanto.LoggedInProductStateClient$get$1;
import p.yf2;

public final class LoggedInProductStateClient	// class@0007e7 from classes.dex
{
    private final AccumulatedProductStateClient accumulatedProductStateClient;
    private final Observable isLoggedIn;

    public void LoggedInProductStateClient(Observable p0,AccumulatedProductStateClient p1){
       co5.o(p0, "isLoggedIn");
       co5.o(p1, "accumulatedProductStateClient");
       super();
       this.isLoggedIn = p0;
       this.accumulatedProductStateClient = p1;
    }
    public static final AccumulatedProductStateClient access$getAccumulatedProductStateClient$p(LoggedInProductStateClient p0){
       return p0.accumulatedProductStateClient;
    }
    public final Observable get(){
       Observable observable = this.isLoggedIn.distinctUntilChanged().switchMap(new LoggedInProductStateClient$get$1(this));
       co5.l(observable, "fun get\(\): Observable<Ma…          }\n            }");
       return observable;
    }
}

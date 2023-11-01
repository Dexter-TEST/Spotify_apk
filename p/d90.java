package p.d90;
import java.lang.String;
import java.lang.Object;
import p.dt5;
import p.m73;
import p.b90;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.ObservableSource;

public abstract class d90	// class@0012ff from classes.dex
{
    public static final dt5 a;

    static {
       m73.h("Cache-Control", "no-cache");
       d90.a = m73.h("Cache-Control", "public, only-if-cached, max-stale=3153600");
       m73.h("Cache-Control", "public, max-stale=3153600");
    }
    public static Observable a(b90 p0){
       Observable observable = p0.a(dt5.x).toObservable();
       return p0.a(d90.a).toObservable().concatWith(observable.onErrorResumeWith(Observable.empty())).onErrorResumeWith(observable).distinctUntilChanged();
    }
}

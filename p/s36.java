package p.s36;
import p.mh2;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.n77;

public abstract class s36	// class@0025b1 from classes.dex
{
    public static final Scheduler a;
    public static final Scheduler b;
    public static final Scheduler c;
    public static final n77 d;

    static {
       s36.a = RxJavaPlugins.b(new mh2(5));
       s36.b = RxJavaPlugins.b(new mh2(2));
       s36.c = RxJavaPlugins.b(new mh2(3));
       s36.d = n77.c;
       RxJavaPlugins.b(new mh2(4));
    }
}

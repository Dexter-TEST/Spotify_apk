package p.eq3;
import p.mt6;
import java.lang.String;
import p.rn6;
import p.p80;
import p.n80;
import android.content.Context;
import p.l32;
import p.we6;
import p.bq3;
import p.tn6;
import java.lang.Object;
import p.an5;
import p.tv;
import java.lang.Math;
import io.reactivex.rxjava3.core.Single;
import p.s53;
import java.util.concurrent.Callable;
import p.s36;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.Objects;
import p.dq3;
import p.yf2;
import p.v05;
import p.ir0;
import p.bm;
import io.reactivex.rxjava3.core.SingleSource;
import p.w00;
import p.fx6;
import io.reactivex.rxjava3.core.Flowable;
import android.content.IntentFilter;
import p.t60;
import p.xe7;
import java.lang.Class;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.BackpressureStrategy;

public final class eq3 implements mt6	// class@0014d9 from classes.dex
{
    public final an5 a;
    public final Context b;
    public final l32 c;
    public final we6 d;
    public final bq3 e;
    public final tn6 f;
    public static final rn6 g;
    public static final rn6 h;
    public static final rn6 i;
    public static final long j;
    public static final long k;
    public static final long l;

    static {
       eq3.g = rn6.a("STORAGE_LOCATION_ORIGIN");
       eq3.h = rn6.a("STORAGE_LOCATION_DESTINATION");
       eq3.i = rn6.a("STORAGE_APP_INTERNAL");
       n80 c = p80.c;
       eq3.j = c.c(75);
       eq3.k = c.c(25);
       eq3.l = c.c(100);
    }
    public void eq3(Context p0,l32 p1,we6 p2,bq3 p3,tn6 p4){
       super();
       this.a = new an5();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       this.f = p4;
    }
    public static long a(tv p0){
       long j;
       if (p0.h != null) {
          j = (p0.f != null)? eq3.j: eq3.k;
       }else {
          j = eq3.l;
       }
       return Math.min(j, ((p0.e + p0.c) / 4));
    }
    public final Single b(){
       Scheduler c = s36.c;
       Single single = Single.fromCallable(new s53(6, this)).subscribeOn(c).observeOn(c);
       eq3 te = this.e;
       Objects.requireNonNull(te);
       return single.map(new dq3(te, 0)).doOnSuccess(new v05(3));
    }
    public final Single c(){
       eq3 te = this.e;
       Objects.requireNonNull(te);
       Objects.requireNonNull(te);
       return Single.zip(Single.fromCallable(new s53(7, te)).subscribeOn(s36.c), this.b(), new bm(5)).map(new dq3(te, 2)).map(new fx6(20));
    }
    public final Flowable d(){
       IntentFilter intentFilter = new IntentFilter("android.intent.action.MEDIA_MOUNTED");
       intentFilter.addAction("android.intent.action.MEDIA_REMOVED");
       intentFilter.addAction("android.intent.action.MEDIA_EJECT");
       intentFilter.addAction("android.intent.action.MEDIA_BAD_REMOVAL");
       intentFilter.addDataScheme("file");
       return xe7.v(this.b, intentFilter).cast(Object.class).mergeWith(this.a).toFlowable(BackpressureStrategy.c);
    }
}

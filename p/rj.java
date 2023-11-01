package p.rj;
import p.pj;
import androidx.fragment.app.Fragment;
import p.fn0;
import android.content.Context;
import p.ej4;
import android.os.Bundle;
import p.tj;
import p.ej7;
import java.lang.Class;
import p.vi7;
import p.g54;
import p.rn6;
import p.tn6;
import p.a34;
import p.tk0;
import p.ic;
import java.lang.Object;
import java.lang.System;
import p.wn6;
import p.jg1;
import java.lang.Runnable;
import p.ok0;
import io.reactivex.rxjava3.core.Completable;
import p.s36;
import io.reactivex.rxjava3.core.Scheduler;
import p.rk0;
import p.p54;
import io.reactivex.rxjava3.core.Observable;
import p.id;
import p.ab0;
import p.bi5;
import p.sd5;
import p.yf2;
import java.lang.Integer;
import p.bm;
import p.w00;
import p.mg1;
import p.ir0;
import p.sj;
import io.reactivex.rxjava3.core.Maybe;
import java.lang.String;
import java.util.Objects;
import p.z24;
import p.t34;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.disposables.Disposable;

public class rj extends Fragment implements pj	// class@002500 from classes.dex
{
    public g54 a;
    public ac b;
    public tj c;
    public final fn0 t;
    public static final int v;

    public void rj(){
       super();
       this.t = new fn0();
    }
    public final void onAttach(Context p0){
       ej4.T(this);
       super.onAttach(p0);
    }
    public final void onCreate(Bundle p0){
       super.onCreate(p0);
       this.c = this.a.r(this, tj.class);
    }
    public final void onStart(){
       a34 a;
       super.onStart();
       rj tc = this.c;
       tj w = tc.w;
       if (w.d(tj.y, false)) {
          a = a34.a;
       }else {
          rn6 z = tj.z;
          long l = 0;
          long l1 = w.b(z, l);
          tk0 a1 = tk0.a;
          if (!(l1 - l)) {
             tc.v.getClass();
             l1 = System.currentTimeMillis();
             wn6 own6 = w.edit();
             own6.b(z, l1);
             a1 = Completable.j(new jg1(4, own6)).p(s36.c);
          }
          Maybe maybe = tc.t.e().subscribeOn(id.a()).filter(new ab0(6)).map(new sd5(3)).distinctUntilChanged().map(new sd5(4)).scan(Integer.valueOf(w.f(tj.A, false)), new bm(20)).doOnNext(new mg1(14, tc)).skipWhile(new sj(tc, (l1 + tj.x))).map(new sd5(5)).firstElement();
          a1.getClass();
          Objects.requireNonNull(maybe, "next is null");
          a = new z24(maybe, false, a1);
       }
       a.getClass();
       this.t.c(new t34(a, id.a(), false).subscribe(new mg1(13, this)));
       return;
    }
    public final void onStop(){
       this.t.e();
       super.onStop();
    }
}

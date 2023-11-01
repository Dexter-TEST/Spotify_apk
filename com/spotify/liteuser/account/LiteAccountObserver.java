package com.spotify.liteuser.account.LiteAccountObserver;
import p.zj3;
import android.content.Context;
import p.km3;
import io.reactivex.rxjava3.core.Scheduler;
import java.lang.Object;
import p.fn0;
import p.gr6;
import p.t00;
import p.ek3;
import p.kj3;
import p.mm3;
import java.lang.Enum;
import p.ab0;
import p.bi5;
import io.reactivex.rxjava3.core.Observable;
import p.mg1;
import p.ir0;
import io.reactivex.rxjava3.disposables.Disposable;
import p.l94;
import p.yf2;
import p.bm;
import p.w00;
import io.reactivex.rxjava3.core.Observer;

public class LiteAccountObserver implements zj3	// class@000974 from classes.dex
{
    public final fn0 a;
    public final t00 b;
    public final Context c;
    public final km3 t;
    public final Scheduler v;

    public void LiteAccountObserver(Context p0,km3 p1,Scheduler p2){
       super();
       this.a = new fn0();
       this.b = t00.b(new gr6());
       this.c = p0;
       this.t = p1;
       this.v = p2;
    }
    public final void a(ek3 p0,kj3 p1){
       int i = mm3.a[p1.ordinal()];
       LiteAccountObserver tb = this.b;
       if (i != 1) {
          LiteAccountObserver ta = this.a;
          if (i != 2) {
             if (i == 3) {
                ta.e();
             }
          }else {
             ta.c(tb.filter(new ab0(28)).observeOn(this.v).subscribe(new mg1(17, this)));
          }
       }else {
          this.t.a().map(new l94(18)).scan(new gr6(), new bm(23)).distinctUntilChanged().subscribe(tb);
       }
       return;
    }
}

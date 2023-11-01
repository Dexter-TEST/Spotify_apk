package p.km3;
import p.mp;
import p.ti3;
import p.wn3;
import p.we6;
import p.w12;
import p.ti4;
import p.np3;
import p.fq3;
import p.jq3;
import p.mp3;
import p.me5;
import java.lang.Object;
import io.reactivex.rxjava3.core.Observable;
import p.vp;
import p.bt3;
import p.pp;
import p.yf2;
import p.s36;
import io.reactivex.rxjava3.core.Scheduler;
import p.ab0;
import p.bi5;
import p.l94;
import p.jk0;
import io.reactivex.rxjava3.core.CompletableSource;
import p.jg1;
import java.lang.Runnable;
import p.ok0;
import io.reactivex.rxjava3.core.Completable;
import p.rk0;
import p.ew0;
import p.tk0;
import p.rf5;
import p.p54;
import p.vn3;
import java.util.Objects;
import p.ha5;
import p.b5;
import p.wp3;
import java.lang.Class;
import p.co3;
import p.am0;
import p.ne5;
import p.v05;
import p.ir0;
import p.fl0;

public final class km3	// class@001c3f from classes.dex
{
    public final mp a;
    public final ti3 b;
    public final wn3 c;
    public final we6 d;
    public final w12 e;
    public final ti4 f;
    public final np3 g;
    public final fq3 h;
    public final jq3 i;
    public final mp3 j;
    public final me5 k;
    public final ti3 l;
    public final ti3 m;
    public final ti3 n;

    public void km3(mp p0,ti3 p1,wn3 p2,we6 p3,w12 p4,ti4 p5,np3 p6,fq3 p7,jq3 p8,mp3 p9,me5 p10,ti3 p11,ti3 p12,ti3 p13){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = p4;
       this.f = p5;
       this.g = p6;
       this.h = p7;
       this.i = p8;
       this.j = p9;
       this.k = p10;
       this.l = p11;
       this.m = p12;
       this.n = p13;
    }
    public final Observable a(){
       return this.a.c.c().map(new pp(1)).map(new pp(0)).distinctUntilChanged().subscribeOn(s36.c);
    }
    public final Observable b(){
       return this.a.c.c().map(new pp(2)).filter(new ab0(26)).map(new l94(15)).distinctUntilChanged().subscribeOn(s36.c);
    }
    public final jk0 c(boolean p0){
       int i = 13;
       CompletableSource[] uCompletable = new CompletableSource[i];
       int i1 = 6;
       Scheduler c = s36.c;
       uCompletable[0] = Completable.j(new jg1(i1, this)).p(c);
       uCompletable[1] = this.m.get().b();
       tk0 a = (p0)? tk0.a: this.n.get().b();
       uCompletable[2] = a;
       vn3 b = this.c.a.b;
       Objects.requireNonNull(b);
       uCompletable[3] = Completable.i(new ha5(14, b)).p(c);
       km3 td = this.d;
       td.getClass();
       uCompletable[4] = Completable.i(new ha5(i, td)).p(c);
       td = this.e;
       td.getClass();
       uCompletable[5] = Completable.j(new am0(22, td)).p(c);
       uCompletable[i1] = this.f.clear();
       uCompletable[7] = this.g.a();
       fq3 a1 = this.h.a;
       Objects.requireNonNull(a1);
       uCompletable[8] = Completable.i(new ha5(7, a1)).p(c);
       jq3 a2 = this.i.a;
       Objects.requireNonNull(a2);
       uCompletable[9] = Completable.i(new ha5(8, a2)).p(c);
       mp3 a3 = this.j.a;
       Objects.requireNonNull(a3);
       uCompletable[10] = Completable.i(new ha5(5, a3)).p(c);
       td = this.k;
       td.getClass();
       uCompletable[11] = Completable.i(new ha5(16, td)).p(c);
       uCompletable[12] = Completable.i(new ha5(25, this)).p(c);
       km3 ta = this.a;
       Objects.requireNonNull(ta);
       return Completable.l(uCompletable).f(new v05(17)).c(Completable.i(new ha5(26, ta)).p(c));
    }
}

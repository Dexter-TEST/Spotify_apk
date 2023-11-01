package p.bt3;
import p.dq;
import p.yu5;
import java.lang.Object;
import p.an5;
import p.wn6;
import p.tn6;
import p.rn6;
import p.c0;
import p.r45;
import java.lang.String;
import p.xp;
import p.jj5;
import io.reactivex.rxjava3.core.Observable;
import p.s53;
import java.util.concurrent.Callable;
import io.reactivex.rxjava3.core.ObservableSource;

public final class bt3 implements dq	// class@00112f from classes.dex
{
    public final tn6 a;
    public final rn6 b;
    public final rn6 c;
    public final rn6 d;
    public final an5 e;

    public void bt3(yu5 p0){
       super();
       this.e = new an5();
       this.a = p0.P;
       this.b = p0.Q;
       this.c = p0.R;
       this.d = p0.S;
    }
    public final void a(){
       wn6 own6 = this.a.edit();
       own6.d(this.b);
       own6.d(this.c);
       own6.d(this.d);
       own6.e();
       this.e.onNext(c0.a);
    }
    public final r45 b(){
       String str1;
       bt3 ta = this.a;
       String str = "";
       if ((str1 = ta.g(this.b, str)) != null && !str1.isEmpty()) {
          return new jj5(new xp(str1, ta.a(this.c), ta.g(this.d, str)));
       }
       return c0.a;
    }
    public final Observable c(){
       return this.e.startWith(Observable.fromCallable(new s53(2, this)));
    }
    public final void d(xp p0){
       wn6 own6 = this.a.edit();
       own6.c(this.b, p0.a);
       own6.c(this.c, p0.b);
       own6.c(this.d, p0.c);
       own6.e();
       this.e.onNext(new jj5(p0));
    }
}

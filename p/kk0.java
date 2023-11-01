package p.kk0;
import io.reactivex.rxjava3.core.CompletableObserver;
import java.lang.Object;
import p.pl0;
import io.reactivex.rxjava3.core.SingleObserver;
import p.zv6;
import java.lang.Throwable;
import p.co5;
import java.lang.NullPointerException;
import java.lang.String;
import p.jk0;
import p.bi5;
import p.hn0;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;
import p.cd1;

public final class kk0 implements CompletableObserver	// class@001c2a from classes.dex
{
    public final int a;
    public final Object b;
    public final Object c;

    public void kk0(Object p0,CompletableObserver p1,int p2){
       this.a = p2;
       this.c = p0;
       this.b = p1;
       super();
    }
    public void kk0(pl0 p0,SingleObserver p1){
       this.a = 2;
       this.b = p0;
       super();
       this.c = p1;
    }
    public final void onComplete(){
       kk0 tb = this.b;
       switch (this.a){
           case 0:
             tb.onComplete();
             return;
           case 1:
             tb.onComplete();
             return;
           default:
             kk0 okk0 = tb;
             kk0 tc = this.c;
             pl0 opl0 = (okk0.t != null)? tb.t.get(): okk0.b;
             if (opl0 == null) {
                tc.onError(new NullPointerException("The value supplied is null"));
             }else {
                tc.onSuccess(opl0);
             }
             return;
       }
    }
    public final void onError(Throwable p0){
       kk0 tc = this.c;
       kk0 tb = this.b;
       switch (this.a){
           case 0:
           case 1:
             if (tc.c.test(p0)) {
                tb.onComplete();
             }else {
                tb.onError(p0);
             }
             return;
             break;
           default:
             tc.onError(p0);
             return;
       }
       tb.onError(p0);
       return;
    }
    public final void onSubscribe(Disposable p0){
       kk0 tc = this.c;
       switch (this.a){
           case 0:
             cd1.c(tc, p0);
             return;
           case 1:
             this.b.onSubscribe(p0);
             return;
           default:
             tc.onSubscribe(p0);
             return;
       }
    }
}

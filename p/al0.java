package p.al0;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.CompletableObserver;
import p.fn0;
import java.util.concurrent.atomic.AtomicBoolean;
import p.zk0;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.NullPointerException;
import java.lang.String;
import java.lang.Throwable;
import java.util.concurrent.atomic.AtomicInteger;
import p.rn;
import p.bl0;
import p.ik0;

public final class al0 extends Completable	// class@000fa2 from classes.dex
{
    public final int a;
    public final CompletableSource[] b;

    public void al0(CompletableSource[] p0,int p1){
       this.a = p1;
       this.b = p0;
    }
    public final void o(CompletableObserver p0){
       fn0 uofn0;
       int i = 0;
       al0 tb = this.b;
       switch (this.a){
           case 0:
             uofn0 = new fn0();
             zk0 ozk0 = new zk0(p0, new AtomicBoolean(), uofn0, (tb.length + 1));
             p0.onSubscribe(ozk0);
             int len = tb.length;
             while (true) {
                if (i < len) {
                   object oobject = tb[i];
                   if (!uofn0.isDisposed()) {
                      if (oobject == null) {
                         uofn0.dispose();
                         ozk0.onError(new NullPointerException("A completable source is null"));
                         break ;
                      }else {
                         oobject.subscribe(ozk0);
                         i = i + 1;
                      }
                   }
                }else {
                   ozk0.onComplete();
                   break ;
                }
             }
             break;
           default:
             uofn0 = new fn0();
             AtomicInteger uAtomicInteg = new AtomicInteger((tb.length + 1));
             rn orn = new rn();
             uofn0.c(new bl0(orn));
             p0.onSubscribe(uofn0);
             int len1 = tb.length;
             while (true) {
                if (i < len1) {
                   object oobject1 = tb[i];
                   if (uofn0.isDisposed()) {
                      break ;
                   }else if(oobject1 == null){
                      orn.a(new NullPointerException("A completable source is null"));
                      uAtomicInteg.decrementAndGet();
                   }else {
                      oobject1.subscribe(new ik0(p0, uofn0, orn, uAtomicInteg));
                   }
                   i = i + 1;
                }else if(!uAtomicInteg.decrementAndGet()){
                   orn.c(p0);
                   break ;
                }else {
                   break ;
                }
             }
             return;
       }
       return;
    }
}

package p.jk0;
import io.reactivex.rxjava3.core.Completable;
import java.lang.Object;
import io.reactivex.rxjava3.core.CompletableObserver;
import p.e34;
import p.yf2;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.core.MaybeObserver;
import p.gl0;
import io.reactivex.rxjava3.core.CompletableSource;
import p.kk0;
import p.sk0;
import p.b5;
import p.lk0;
import p.jl1;
import java.lang.Iterable;
import java.util.Iterator;
import java.lang.NullPointerException;
import java.lang.String;
import java.lang.Throwable;
import java.lang.System;
import p.co5;
import p.fn0;
import java.util.concurrent.atomic.AtomicBoolean;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.ik0;
import p.hj6;
import io.reactivex.rxjava3.core.SingleSource;
import io.reactivex.rxjava3.core.SingleObserver;

public final class jk0 extends Completable	// class@001aef from classes.dex
{
    public final int a;
    public final Object b;
    public final Object c;

    public void jk0(Object p0,int p1,Object p2){
       this.a = p1;
       super();
       this.b = p0;
       this.c = p2;
    }
    public final void o(CompletableObserver p0){
       int i;
       CompletableSource uCompletable;
       int i1;
       boolean b = true;
       jk0 tc = this.c;
       jk0 tb = this.b;
       switch (this.a){
           case 0:
             jl1 a = jl1.a;
             if (tb == null) {
                tb = new CompletableSource[8];
                Iterator iterator = tc.iterator();
                i = 0;
                while (true) {
                   if (iterator.hasNext()) {
                      if ((uCompletable = iterator.next()) == null) {
                         p0.onSubscribe(a);
                         p0.onError(new NullPointerException("One of the sources is null"));
                         break ;
                      }else if(i == tb.length){
                         i1 = i >> 2;
                         i1 = i1 + i;
                         CompletableSource[] uCompletable1 = new CompletableSource[i1];
                         System.arraycopy(tb, 0, uCompletable1, 0, i);
                         tb = uCompletable1;
                      }
                      i1 = i + 1;
                      tb[i] = uCompletable;
                      i = i1;
                   }else {
                   label_009d :
                      fn0 uofn0 = new fn0();
                      p0.onSubscribe(uofn0);
                      AtomicBoolean uAtomicBoole = new AtomicBoolean();
                      int i2 = 0;
                   label_00ab :
                      if (i2 < i) {
                         object oobject = tb[i2];
                         if (!uofn0.isDisposed()) {
                            if (oobject == null) {
                               NullPointerException nullPointerE = new NullPointerException("One of the sources is null");
                               if (uAtomicBoole.compareAndSet(0, b)) {
                                  uofn0.dispose();
                                  p0.onError(nullPointerE);
                                  break ;
                               }else {
                                  RxJavaPlugins.c(nullPointerE);
                                  break ;
                               }
                            }else {
                               oobject.subscribe(new ik0(p0, uofn0, uAtomicBoole));
                               i2 = i2 + 1;
                               goto label_00ab ;
                            }
                         }
                      }else if(!i){
                         p0.onComplete();
                         break ;
                      }
                   }
                }
             }else {
                i = tb.length;
                goto label_009d ;
             }
             return;
             break;
           case 1:
             tb.subscribe(new lk0(p0, tc));
             return;
           case 2:
             tb.subscribe(new sk0(p0, tc));
             return;
           case 3:
             tb.subscribe(new kk0(this, p0, b));
             return;
           case 4:
             gl0 ogl0 = new gl0(p0, tc);
             p0.onSubscribe(ogl0);
             tb.subscribe(ogl0);
             return;
           case 5:
             e34 uoe34 = new e34(p0, tc);
             p0.onSubscribe(uoe34);
             tb.subscribe(uoe34);
             return;
           default:
             hj6 ohj6 = new hj6(p0, tc);
             p0.onSubscribe(ohj6);
             tb.subscribe(ohj6);
             return;
       }
    }
}

package p.f37;
import io.reactivex.rxjava3.core.Observable;
import android.widget.TextView;
import p.zf2;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.ec7;
import java.util.concurrent.atomic.AtomicBoolean;
import io.reactivex.rxjava3.core.Observer;
import p.jl1;
import p.yf2;
import java.util.Objects;
import io.reactivex.rxjava3.core.ObservableSource;
import p.zv6;
import io.reactivex.rxjava3.disposables.Disposable;
import p.ww4;
import java.lang.Throwable;
import p.kg4;
import p.zo0;
import p.zz4;
import p.hs0;
import p.ir0;
import p.ra6;
import p.xr4;
import java.lang.Iterable;
import java.util.Iterator;
import java.lang.NullPointerException;
import java.lang.System;
import p.fp4;
import p.f34;
import io.reactivex.rxjava3.core.MaybeSource;
import io.reactivex.rxjava3.core.MaybeObserver;
import p.mk0;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.CompletableObserver;
import io.reactivex.rxjava3.core.Single;
import p.m34;
import io.reactivex.rxjava3.core.SingleObserver;
import java.util.stream.Collector;
import java.util.function.Supplier;
import p.zo4;
import java.util.function.BiConsumer;
import java.util.function.Function;
import p.fq4;
import p.tu6;
import p.e37;
import android.widget.TextView$OnEditorActionListener;
import p.hv6;

public final class f37 extends Observable	// class@001552 from classes.dex
{
    public final int a;
    public final Object b;
    public final Object c;

    public void f37(TextView p0,zf2 p1){
       this.a = 0;
       co5.q(p0, "view");
       co5.q(p1, "handled");
       super();
       this.b = p0;
       this.c = p1;
    }
    public void f37(Object p0,int p1,Object p2){
       this.a = p1;
       super();
       this.b = p0;
       this.c = p2;
    }
    public void f37(ec7 p0){
       this.a = 9;
       super();
       this.b = p0;
       this.c = new AtomicBoolean();
    }
    public final boolean a(){
       f37 tc = this.c;
       boolean b = false;
       if (!tc.get() && tc.compareAndSet(b, true)) {
          b = true;
       }
       return b;
    }
    public final void subscribeActual(Observer p0){
       int i1;
       ObservableSource observableSo;
       int i2;
       Object obj;
       jl1 a = jl1.a;
       boolean b = true;
       f37 tb = this.b;
       f37 tc = this.c;
       switch (this.a){
           case 0:
             co5.q(p0, "observer");
             if (tu6.i(p0)) {
                e37 uoe37 = new e37(tb, p0, tc);
                p0.onSubscribe(uoe37);
                tb.setOnEditorActionListener(uoe37);
             }
             return;
             break;
           case 1:
             tb.subscribe(new fq4(p0, zo4.k(zo4.o(tc)), zo4.m(tc), zo4.n(tc)));
             return;
             break;
           case 2:
             tb.subscribe(new m34(p0, tc));
             return;
           case 3:
             mk0 omk0 = new mk0(tc, p0);
             p0.onSubscribe(omk0);
             tb.subscribe(omk0);
             return;
           case 4:
             f34 uof34 = new f34(p0, tc);
             p0.onSubscribe(uof34);
             tb.subscribe(uof34);
             return;
           case 5:
             int i = 0;
             if (tb == null) {
                tb = new ObservableSource[8];
                Iterator iterator = tc.iterator();
                i1 = 0;
                while (true) {
                   if (iterator.hasNext()) {
                      if ((observableSo = iterator.next()) == null) {
                         p0.onSubscribe(a);
                         p0.onError(new NullPointerException("One of the sources is null"));
                         break ;
                      }else if(i1 == tb.length){
                         i2 = i1 >> 2;
                         i2 = i2 + i1;
                         ObservableSource[] observableSo1 = new ObservableSource[i2];
                         System.arraycopy(tb, i, observableSo1, i, i1);
                         tb = observableSo1;
                      }
                      i2 = i1 + 1;
                      tb[i1] = observableSo;
                      i1 = i2;
                   }else if(!i1){
                      p0.onSubscribe(a);
                      p0.onComplete();
                      break ;
                   }else if(i1 == b){
                      tb[i].subscribe(p0);
                      break ;
                   }else {
                      new fp4(p0, i1).subscribe(tb);
                      break ;
                   }
                }
             }else {
                i1 = tb.length;
             }
             return;
             break;
           case 6:
             ra6 ora6 = new ra6();
             p0.onSubscribe(ora6);
             tc.subscribe(new xr4(this, ora6, p0));
             return;
           case 7:
             obj = tb.get();
             Objects.requireNonNull(obj, "The connectableFactory returned a null ConnectableObservable");
             Object obj1 = tc.apply(obj);
             Objects.requireNonNull(obj1, "The selector returned a null ObservableSource");
             zz4 ozz4 = new zz4(p0);
             obj1.subscribe(ozz4);
             obj.a(new hs0(15, ozz4));
             return;
             break;
           case 8:
             obj = tc.apply(tb);
             Objects.requireNonNull(obj, "The mapper returned a null ObservableSource");
             if (obj instanceof zv6) {
                if ((obj = obj.get()) == null) {
                   p0.onSubscribe(a);
                   p0.onComplete();
                }else {
                   ww4 oww4 = new ww4(p0, obj);
                   p0.onSubscribe(oww4);
                   oww4.run();
                }
             }else {
                obj.subscribe(p0);
             }
             return;
             break;
           default:
             tb.subscribe(p0);
             tc.set(b);
             return;
       }
    }
}

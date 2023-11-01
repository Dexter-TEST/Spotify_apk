package p.a44;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleSource;
import java.lang.Object;
import io.reactivex.rxjava3.core.SingleObserver;
import p.jl1;
import p.h34;
import p.mf1;
import p.bl6;
import p.yf2;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.NullPointerException;
import java.lang.String;
import java.lang.Throwable;
import p.tp2;
import p.co5;
import io.reactivex.rxjava3.core.ObservableSource;
import p.mi6;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.core.CompletableSource;
import p.li6;
import io.reactivex.rxjava3.core.CompletableObserver;
import java.lang.Iterable;
import java.util.Iterator;
import java.lang.System;
import java.util.concurrent.atomic.AtomicBoolean;
import p.fn0;
import io.reactivex.rxjava3.plugins.RxJavaPlugins;
import p.di6;
import io.reactivex.rxjava3.core.MaybeSource;
import p.d44;
import io.reactivex.rxjava3.core.MaybeObserver;
import p.z34;
import java.util.Arrays;
import java.util.NoSuchElementException;

public final class a44 extends Single	// class@000f0f from classes.dex
{
    public final int a;
    public final Object b;
    public final Object c;

    public void a44(SingleSource p0,Object p1,int p2){
       this.a = p2;
       super();
       this.c = p0;
       this.b = p1;
    }
    public void a44(Object p0,int p1,Object p2){
       this.a = p1;
       super();
       this.b = p0;
       this.c = p2;
    }
    public final void subscribeActual(SingleObserver p0){
       SingleSource[] singleSource;
       int i3;
       SingleSource singleSource1;
       int i4;
       int len;
       object oobject1;
       SingleSource singleSource3;
       int i6;
       jl1 a = jl1.a;
       int i = 6;
       int i1 = 8;
       String str = "One of the sources is null";
       int i2 = 0;
       a44 tc = this.c;
       a44 tb = this.b;
       switch (this.a){
           case 0:
             tb.subscribe(new z34(p0, tc));
             return;
           case 1:
             tb.subscribe(new d44(p0, tc));
             return;
           case 2:
             if (tb == null) {
                singleSource = new SingleSource[i1];
                Iterator iterator = tc.iterator();
                tb = singleSource;
                i3 = 0;
                while (true) {
                   if (iterator.hasNext()) {
                      if ((singleSource1 = iterator.next()) == null) {
                         p0.onSubscribe(a);
                         p0.onError(new NullPointerException(str));
                         break ;
                      }else if(i3 == tb.length){
                         i4 = i3 >> 2;
                         i4 = i4 + i3;
                         SingleSource[] singleSource2 = new SingleSource[i4];
                         System.arraycopy(tb, i2, singleSource2, i2, i3);
                         tb = singleSource2;
                      }
                      i4 = i3 + 1;
                      tb[i3] = singleSource1;
                      i3 = i4;
                   }else {
                   label_00d2 :
                      AtomicBoolean uAtomicBoole = new AtomicBoolean();
                      fn0 uofn0 = new fn0();
                      p0.onSubscribe(uofn0);
                      for (i1 = 0; i1 < i3; i1 = i1 + 1) {
                         object oobject = tb[i1];
                         if (!uofn0.isDisposed()) {
                            if (oobject == null) {
                               uofn0.dispose();
                               NullPointerException nullPointerE = new NullPointerException(str);
                               if (uAtomicBoole.compareAndSet(i2, true)) {
                                  p0.onError(nullPointerE);
                                  break ;
                               }else {
                                  RxJavaPlugins.c(nullPointerE);
                                  break ;
                               }
                            }
                         }
                         oobject.subscribe(new di6(p0, uofn0, uAtomicBoole));
                      }
                   }
                }
             }else {
                i3 = tb.length;
                goto label_00d2 ;
             }
             return;
             break;
           case 3:
             tb.subscribe(new li6(p0, tc));
             return;
           case 4:
             tb.subscribe(new mi6(p0, tc));
             return;
           case 5:
             tc.subscribe(new h34(this, p0, 3));
             return;
           case 6:
             tp2.v(tb);
             throw null;
           case 7:
             if ((len = tb.length) == 1) {
                tb[i2].subscribe(new h34(p0, i, new mf1(26, this)));
             }else {
                bl6 uobl6 = new bl6(p0, len, tc);
                p0.onSubscribe(uobl6);
                for (; i2 < len && !uobl6.isDisposed(); i2 = i2 + 1) {
                   if ((oobject1 = tb[i2]) == null) {
                      uobl6.a(i2, new NullPointerException(str));
                      break ;
                   }
                   oobject1.subscribe(uobl6.c[i2]);
                }
             }
             return;
             break;
           default:
             singleSource = new SingleSource[i1];
             Iterator iterator1 = tb.iterator();
             int i5 = 0;
             while (true) {
                if (iterator1.hasNext()) {
                   if ((singleSource3 = iterator1.next()) == null) {
                      p0.onSubscribe(a);
                      p0.onError(new NullPointerException(str));
                      break ;
                   }else if(i5 == singleSource.length){
                      i6 = i5 >> 2;
                      i6 = i6 + i5;
                      singleSource = Arrays.copyOf(singleSource, i6);
                   }
                   i6 = i5 + 1;
                   singleSource[i5] = singleSource3;
                   i5 = i6;
                }else if(!i5){
                   p0.onSubscribe(a);
                   p0.onError(new NoSuchElementException());
                   break ;
                }else if(i5 == 1){
                   singleSource[i2].subscribe(new h34(p0, i, new mf1(27, this)));
                   break ;
                }else {
                   bl6 uobl61 = new bl6(p0, i5, tc);
                   p0.onSubscribe(uobl61);
                   for (; i2 < i5 && !uobl61.isDisposed(); i2 = i2 + 1) {
                      singleSource[i2].subscribe(uobl61.c[i2]);
                   }
                   return;
                }
             }
       }
    }
}

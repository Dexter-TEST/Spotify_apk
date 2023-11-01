package p.kq4;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import java.lang.Iterable;
import p.yf2;
import io.reactivex.rxjava3.core.Observer;
import p.jl1;
import java.util.Iterator;
import java.lang.Object;
import java.lang.System;
import java.lang.String;
import java.util.Objects;
import java.lang.Throwable;
import p.kg4;
import io.reactivex.rxjava3.disposables.Disposable;
import p.jq4;
import p.uz4;

public final class kq4 extends Observable	// class@001c63 from classes.dex
{
    public final int a;
    public final ObservableSource[] b;
    public final Iterable c;
    public final yf2 t;
    public final int v;
    public final boolean w;

    public void kq4(ObservableSource[] p0,Iterable p1,yf2 p2,int p3,boolean p4,int p5){
       this.a = p5;
       super();
       this.b = p0;
       this.c = p1;
       this.t = p2;
       this.v = p3;
       this.w = p4;
    }
    public final void subscribeActual(Observer p0){
       ObservableSource[] observableSo;
       Iterator iterator;
       ObservableSource observableSo1;
       int i2;
       ObservableSource[] observableSo2;
       jl1 a = jl1.a;
       kq4 tc = this.c;
       int i = 8;
       kq4 tb = this.b;
       int i1 = 0;
       switch (this.a){
           case 0:
             if (tb == null) {
                observableSo = new ObservableSource[i];
                iterator = tc.iterator();
                i = 0;
                tb = observableSo;
                while (iterator.hasNext()) {
                   observableSo1 = iterator.next();
                   if (i == tb.length) {
                      i2 = i >> 2;
                      i2 = i2 + i;
                      observableSo2 = new ObservableSource[i2];
                      System.arraycopy(tb, i1, observableSo2, i1, i);
                      tb = observableSo2;
                   }
                   i2 = i + 1;
                   Objects.requireNonNull(observableSo1, "The Iterator returned a null ObservableSource");
                   tb[i] = observableSo1;
                   i = i2;
                }
             }else {
                i = tb.length;
             }
             if (!(i2 = i)) {
                p0.onSubscribe(a);
                p0.onComplete();
             }else {
                jq4 a1 = new jq4(i2, this.v, p0, this.t, this.w);
                a.subscribe(tb);
             }
             break;
           default:
             if (tb == null) {
                observableSo = new ObservableSource[i];
                iterator = tc.iterator();
                i = 0;
                tb = observableSo;
                while (iterator.hasNext()) {
                   observableSo1 = iterator.next();
                   if (i == tb.length) {
                      i2 = i >> 2;
                      i2 = i2 + i;
                      observableSo2 = new ObservableSource[i2];
                      System.arraycopy(tb, i1, observableSo2, i1, i);
                      tb = observableSo2;
                   }
                   i2 = i + 1;
                   tb[i] = observableSo1;
                   i = i2;
                }
             }else {
                i = tb.length;
             }
             if (!i) {
                p0.onSubscribe(a);
                p0.onComplete();
             }else {
                new uz4(p0, this.t, i, this.w).subscribe(tb, this.v);
             }
             return;
       }
       return;
    }
}

package p.g62;
import io.reactivex.rxjava3.core.Flowable;
import p.mf1;
import p.bn5;
import p.iv6;
import p.rl1;
import java.util.Iterator;
import java.lang.Iterable;
import java.lang.Object;
import java.lang.System;
import java.lang.String;
import java.util.Objects;
import java.lang.Throwable;
import p.co5;
import p.kv6;
import p.q82;
import p.yf2;
import p.e62;
import p.xa2;

public final class g62 extends Flowable	// class@0016a9 from classes.dex
{
    public final int b;
    public final bn5[] c;
    public final Iterable t;
    public final yf2 v;
    public final int w;
    public final boolean x;

    public void g62(int p0,mf1 p1,bn5[] p2){
       this.b = 0;
       super();
       this.c = p2;
       this.t = null;
       this.v = p1;
       this.w = p0;
       this.x = false;
    }
    public void g62(bn5[] p0,mf1 p1,int p2){
       this.b = 1;
       super();
       this.c = p0;
       this.t = null;
       this.v = p1;
       this.w = p2;
       this.x = false;
    }
    public final void u(iv6 p0){
       bn5[] uobn5Array;
       Iterator iterator;
       int i2;
       bn5 uobn5;
       int i3;
       bn5[] uobn5Array1;
       rl1 a = rl1.a;
       g62 tt = this.t;
       int i = 8;
       g62 tc = this.c;
       int i1 = 0;
       switch (this.b){
           case 0:
             if (tc == null) {
                uobn5Array = new bn5[i];
                iterator = tt.iterator();
                tc = uobn5Array;
                i2 = 0;
                while (iterator.hasNext()) {
                   uobn5 = iterator.next();
                   if (i2 == tc.length) {
                      i3 = i2 >> 2;
                      i3 = i3 + i2;
                      uobn5Array1 = new bn5[i3];
                      System.arraycopy(tc, i1, uobn5Array1, i1, i2);
                      tc = uobn5Array1;
                   }
                   i3 = i2 + 1;
                   Objects.requireNonNull(uobn5, "The Iterator returned a null Publisher");
                   tc[i2] = uobn5;
                   i2 = i3;
                }
             }else {
                i2 = tc.length;
             }
             if (!i2) {
                p0.onSubscribe(a);
                p0.onComplete();
             }else if(i2 == 1){
                tc[i1].subscribe(new q82(p0, new mf1(24, this)));
             }else {
                e62 a1 = new e62(p0, this.v, this.x, i2, this.w);
                p0.onSubscribe(a);
                a.subscribe(tc, i2);
             }
             break;
           default:
             if (tc == null) {
                uobn5Array = new bn5[i];
                iterator = tt.iterator();
                tc = uobn5Array;
                i2 = 0;
                while (iterator.hasNext()) {
                   uobn5 = iterator.next();
                   if (i2 == tc.length) {
                      i3 = i2 >> 2;
                      i3 = i3 + i2;
                      uobn5Array1 = new bn5[i3];
                      System.arraycopy(tc, i1, uobn5Array1, i1, i2);
                      tc = uobn5Array1;
                   }
                   i3 = i2 + 1;
                   tc[i2] = uobn5;
                   i2 = i3;
                }
             }else {
                i2 = tc.length;
             }
             if (!i2) {
                p0.onSubscribe(a);
                p0.onComplete();
             }else {
                xa2 a2 = new xa2(p0, this.v, this.x, i2, this.w);
                p0.onSubscribe(a);
                a.subscribe(tc, i2);
             }
             return;
       }
       return;
    }
}

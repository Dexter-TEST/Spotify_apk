package p.cn2;
import p.k36;
import p.eq7;
import p.nw1;
import java.lang.String;
import p.es3;
import android.content.Context;
import p.bo0;
import p.zq7;
import p.uq7;
import java.lang.Object;
import java.util.HashSet;
import p.n91;
import p.fq7;
import p.e91;
import p.vf;
import p.uk5;
import java.lang.Boolean;
import java.lang.Class;
import p.wk5;
import java.util.HashMap;
import java.lang.Runnable;
import android.os.Handler;
import java.util.List;
import java.util.Iterator;
import p.xq6;
import p.ns6;
import p.ce7;
import p.qq7;
import p.jr7;
import p.ap5;
import java.util.Objects;
import java.util.Collection;
import java.util.ArrayList;
import p.nq5;
import java.lang.System;
import p.rq7;
import p.t5;
import android.os.Build$VERSION;
import p.zq0;
import java.lang.CharSequence;
import java.lang.Iterable;
import android.text.TextUtils;
import java.util.Set;

public final class cn2 implements k36, eq7, nw1	// class@00123d from classes.dex
{
    public final Context a;
    public final uq7 b;
    public final fq7 c;
    public final HashSet t;
    public final e91 v;
    public boolean w;
    public final Object x;
    public final n91 y;
    public Boolean z;

    static {
       es3.d("GreedyScheduler");
    }
    public void cn2(Context p0,bo0 p1,zq7 p2,uq7 p3){
       super();
       this.t = new HashSet();
       this.y = new n91(2, null);
       this.a = p0;
       this.b = p3;
       this.c = new fq7(p2, this);
       this.v = new e91(this, p1.e);
       this.x = new Object();
    }
    public final void a(String p0){
       cn2 tv;
       Runnable runnable;
       cn2 tb = this.b;
       if (this.z == null) {
          this.z = Boolean.valueOf(uk5.a(this.a, tb.B));
       }
       if (!this.z.booleanValue()) {
          es3.c().getClass();
          return;
       }else if(this.w == null){
          tb.F.a(this);
          this.w = true;
       }
       es3.c().getClass();
       if ((tv = this.v) != null && (runnable = tv.c.remove(p0)) != null) {
          tv.b.b.removeCallbacks(runnable);
       }
       Iterator iterator = this.y.g(p0).iterator();
       while (iterator.hasNext()) {
          tb.D.j(new ns6(tb, iterator.next(), false));
       }
       return;
    }
    public final void b(qq7 p0,boolean p1){
       this.y.h(p0);
       cn2 tx = this.x;
       _monitor_enter(tx);
       Iterator iterator = this.t.iterator();
       while (iterator.hasNext()) {
          jr7 ojr7 = iterator.next();
          if (ap5.o(ojr7).equals(p0)) {
             Objects.toString(p0);
             es3.c().getClass();
             this.t.remove(ojr7);
             this.c.c(this.t);
             break ;
          }
       }
       _monitor_exit(tx);
       return;
    }
    public final void c(ArrayList p0){
       xq6 oxq6;
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          qq7 oqq7 = ap5.o(iterator.next());
          oqq7.toString();
          es3.c().getClass();
          if ((oxq6 = this.y.h(oqq7)) != null) {
             cn2 tb = this.b;
             tb.D.j(new ns6(tb, oxq6, false));
          }
       }
       return;
    }
    public final void d(List p0){
       Iterator iterator = p0.iterator();
       while (iterator.hasNext()) {
          qq7 oqq7 = ap5.o(iterator.next());
          cn2 ty = this.y;
          if (!ty.b(oqq7)) {
             oqq7.toString();
             es3.c().getClass();
             this.b.B(ty.i(oqq7), null);
          }
       }
       return;
    }
    public final boolean e(){
       return false;
    }
    public final void f(jr7[] p0){
       cn2 tv;
       int sDK_INT;
       if (this.z == null) {
          this.z = Boolean.valueOf(uk5.a(this.a, this.b.B));
       }
       if (!this.z.booleanValue()) {
          es3.c().getClass();
          return;
       }else {
          boolean b = true;
          if (this.w == null) {
             this.b.F.a(this);
             this.w = b;
          }
          HashSet hashSet = new HashSet();
          HashSet hashSet1 = new HashSet();
          int len = p0.length;
          int i = 0;
          while (i < len) {
             object oobject = p0[i];
             if (!this.y.b(ap5.o(oobject))) {
                long l = oobject.a();
                long l1 = System.currentTimeMillis();
                if (oobject.b == rq7.a) {
                   if ((l1 - l) < 0) {
                      if ((tv = this.v) != null) {
                         e91 c = tv.c;
                         Runnable runnable = c.remove(oobject.a);
                         e91 b1 = tv.b;
                         if (runnable != null) {
                            b1.b.removeCallbacks(runnable);
                         }
                         t5 ot5 = new t5(tv, 8, oobject);
                         c.put(oobject.a, ot5);
                         long l2 = oobject.a() - System.currentTimeMillis();
                         b1.b.postDelayed(ot5, l2);
                      }
                   }else if(oobject.b()){
                      if ((sDK_INT = Build$VERSION.SDK_INT) >= 23 && oobject.j.c != null) {
                         oobject.toString();
                         es3.c().getClass();
                      }else if(sDK_INT >= 24 && (sDK_INT = oobject.j.h.isEmpty() ^ b)){
                         oobject.toString();
                         es3.c().getClass();
                      }else {
                         hashSet.add(oobject);
                         hashSet1.add(oobject.a);
                      }
                   }else if(!this.y.b(ap5.o(oobject))){
                      es3.c().getClass();
                      cn2 ty = this.y;
                      ty.getClass();
                      xq6 oxq6 = ty.i(ap5.o(oobject));
                      this.b.B(oxq6, null);
                   }
                }
             }
             i = i + 1;
          }
          cn2 tx = this.x;
          _monitor_enter(tx);
          if (!hashSet.isEmpty()) {
             TextUtils.join(",", hashSet1);
             es3.c().getClass();
             this.t.addAll(hashSet);
             this.c.c(this.t);
          }
          _monitor_exit(tx);
          return;
       }
    }
}

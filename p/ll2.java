package p.ll2;
import p.jl2;
import p.kl2;
import p.ol2;
import p.fl2;
import java.lang.Object;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.ArrayList;
import android.os.Looper;
import android.os.Handler;
import p.ob2;
import p.yg0;
import p.ko1;
import p.ye7;
import p.w51;
import android.content.Context;
import p.re;
import p.bl2;
import p.si4;
import p.se;
import p.ut7;
import p.nu7;
import java.lang.Class;
import java.lang.StringBuilder;
import java.lang.String;
import com.google.android.gms.common.api.Status;
import android.os.Message;
import p.oe7;
import android.util.SparseIntArray;
import java.util.Collection;
import java.util.Iterator;
import p.tp2;
import java.lang.RuntimeException;
import p.lt7;
import java.lang.IllegalArgumentException;
import p.fp0;
import p.lu7;
import p.we;
import java.util.Set;
import p.gm3;
import p.du7;
import p.m07;
import p.uv1;
import p.em0;
import java.lang.Runnable;
import p.zj7;
import p.sk;
import p.ju7;
import p.su7;
import java.util.concurrent.atomic.AtomicReference;
import p.t5;
import p.yt7;
import p.q12;
import p.qx7;
import p.pk;
import java.lang.Long;
import p.wh6;
import p.ml2;
import android.app.PendingIntent;
import p.hd7;
import java.lang.IllegalStateException;
import java.lang.Throwable;
import p.nl2;
import java.lang.System;
import java.lang.Integer;
import p.zt7;
import p.lf6;
import p.dy;
import android.os.IInterface;

public final class ll2 implements jl2, kl2	// class@001d76 from classes.dex
{
    public final LinkedList a;
    public final bl2 b;
    public final we c;
    public final si4 d;
    public final HashSet e;
    public final HashMap f;
    public final int g;
    public final ut7 h;
    public boolean i;
    public final ArrayList j;
    public fp0 k;
    public final ol2 l;

    public void ll2(ol2 p0,fl2 p1){
       fl2 b;
       this.l = p0;
       super();
       this.a = new LinkedList();
       this.e = new HashSet();
       this.f = new HashMap();
       this.j = new ArrayList();
       fp0 uofp0 = null;
       this.k = uofp0;
       ko1 oko1 = p1.c.b;
       w51.k(oko1);
       bl2 uobl2 = oko1.h(p1.a, p0.n.getLooper(), p1.a().b(), p1.d, this, this);
       if ((b = p1.b) != null) {
          uobl2.r = b;
       }
       this.b = uobl2;
       this.c = p1.e;
       this.d = new si4(4);
       this.g = p1.g;
       if (uobl2.b()) {
          this.h = new ut7(p0.e, p0.n, p1.a().b());
          return;
       }else {
          this.h = uofp0;
          return;
       }
    }
    public final void a(int p0){
       w51.g(this.l.n);
       this.k = null;
       boolean b = true;
       this.i = b;
       ll2 td = this.d;
       bl2 a = this.b.a;
       td.getClass();
       String str = "The connection to Google Play services was lost";
       if (p0 == b) {
          str = str+" due to service disconnection.";
       }else if(p0 == 3){
          str = str+" due to dead object exception.";
       }
       if (a != null) {
          str = str+" Last reason for disconnect: "+a;
       }
       td.g(b, new Status(20, str, 0));
       ol2 n = this.l.n;
       this.l.getClass();
       n.sendMessageDelayed(Message.obtain(n, 9, this.c), 5000);
       n = this.l.n;
       this.l.getClass();
       n.sendMessageDelayed(Message.obtain(n, 11, this.c), 0x1d4c0);
       this.l.g.a.clear();
       Iterator iterator = this.f.values().iterator();
       if (!iterator.hasNext()) {
          return;
       }else {
          tp2.v(iterator.next());
          throw null;
       }
    }
    public final void b(Status p0){
       w51.g(this.l.n);
       this.c(p0, null, false);
    }
    public final void c(Status p0,RuntimeException p1,boolean p2){
       w51.g(this.l.n);
       int i = 0;
       int i1 = (p0 == null)? 1: 0;
       if (p1 == null) {
          i = 1;
       }
       if (i1 != i) {
          Iterator iterator = this.a.iterator();
          while (iterator.hasNext()) {
             lt7 olt7 = iterator.next();
             if (p2 && olt7.a != 2) {
                continue ;
             }else if(p0 != null){
                olt7.b(p0);
             }else {
                olt7.c(p1);
             }
             iterator.remove();
          }
          return;
       }else {
          throw new IllegalArgumentException("Status XOR exception should be null");
       }
    }
    public final void d(fp0 p0,RuntimeException p1){
       ll2 th;
       ut7 f;
       w51.g(this.l.n);
       if ((th = this.h) != null && (f = th.f) != null) {
          f.d();
       }
       w51.g(this.l.n);
       fp0 uofp0 = null;
       this.k = uofp0;
       this.l.g.a.clear();
       this.j(p0);
       if (this.b instanceof lu7) {
          ll2 tl = this.l;
          tl.b = true;
          ol2 n = tl.n;
          n.sendMessageDelayed(n.obtainMessage(19), 0x493e0);
       }
       if (p0.b == 4) {
          this.b(ol2.q);
          return;
       }else if(this.a.isEmpty()){
          this.k = p0;
          return;
       }else if(p1 != null){
          w51.g(this.l.n);
          this.c(uofp0, p1, false);
          return;
       }else if(this.l.o == null){
          this.b(ol2.d(this.c, p0));
          return;
       }else {
          this.c(ol2.d(this.c, p0), uofp0, true);
          if (this.a.isEmpty()) {
             return;
          }else if(this.h(p0)){
             return;
          }else if(!this.l.c(p0, this.g)){
             if (p0.b == 18) {
                this.i = true;
             }
             if (this.i != null) {
                ol2 n1 = this.l.n;
                this.l.getClass();
                n1.sendMessageDelayed(Message.obtain(n1, 9, this.c), 5000);
                return;
             }else {
                this.b(ol2.d(this.c, p0));
             }
          }
          return;
       }
    }
    public final void e(lt7 p0){
       ll2 tk;
       w51.g(this.l.n);
       ll2 ta = this.a;
       if (this.b.m()) {
          if (this.i(p0)) {
             this.q();
             return;
          }else {
             ta.add(p0);
             return;
          }
       }else {
          ta.add(p0);
          if ((tk = this.k) != null) {
             int i = (tk.b != null && tk.c != null)? 1: 0;
             if (i) {
                this.d(tk, null);
                return;
             }
          }
          this.m();
          return;
       }
    }
    public final void f(){
       w51.g(this.l.n);
       Status p = ol2.p;
       this.b(p);
       ll2 td = this.d;
       td.getClass();
       boolean b = false;
       td.g(b, p);
       gm3[] ogm3Array = new gm3[b];
       gm3[] ogm3Array1 = this.f.keySet().toArray(ogm3Array);
       int len = ogm3Array1.length;
       for (; b < len; b = b + 1) {
          this.e(new du7(new m07()));
       }
       this.j(new fp0(4));
       ll2 tb = this.b;
       if (tb.m()) {
          uv1 ouv1 = new uv1(14, this);
          tb.getClass();
          ouv1.b.l.n.post(new em0(14, ouv1));
       }
       return;
    }
    public final void g(int p0){
       ll2 tl = this.l;
       if (Looper.myLooper() == tl.n.getLooper()) {
          this.a(p0);
          return;
       }else {
          tl.n.post(new zj7(p0, 2, this));
          return;
       }
    }
    public final boolean h(fp0 p0){
       Object r = ol2.r;
       _monitor_enter(r);
       ll2 tl = this.l;
       boolean b = false;
       if (tl.k != null && tl.l.contains(this.c)) {
          ol2 k = this.l.k;
          k.getClass();
          ju7 oju7 = new ju7(p0, this.g);
          su7 c = k.c;
          while (true) {
             if (c.compareAndSet(null, oju7)) {
                b = 1;
             }else {
                if (c.get() == null) {
                   continue ;
                }
             }
             if (b) {
                k.t.post(new t5(k, 15, oju7));
                break ;
             }
             break ;
          }
          _monitor_exit(r);
          return true;
       }else {
          _monitor_exit(r);
          return b;
       }
    }
    public final boolean i(lt7 p0){
       object oobject;
       StringBuilder str;
       ol2 n;
       bl2 u;
       Long orDefault;
       boolean b = true;
       if (!p0 instanceof yt7) {
          this.l(p0);
          return b;
       }else {
          yt7 oyt7 = p0;
          q12[] oq12Array = oyt7.f(this);
          PendingIntent pendingInten = null;
          if (oq12Array != null && oq12Array.length) {
             PendingIntent pendingInten1 = ((u = this.b.u) == null)? pendingInten: u.b;
             if (pendingInten1 == null) {
                pendingInten1 = new q12[false];
             }
             pk opk = new pk(pendingInten1.length);
             int len = pendingInten1.length;
             for (int i2 = 0; i2 < len; i2 = i2 + 1) {
                object oobject1 = pendingInten1[i2];
                opk.put(oobject1.a, Long.valueOf(oobject1.b()));
             }
             int i1 = oq12Array.length;
             len = 0;
             while (true) {
                if (len < i1) {
                   oobject = oq12Array[len];
                   if ((orDefault = opk.getOrDefault(oobject.a, pendingInten)) != null && (orDefault.longValue() - oobject.b()) >= 0) {
                      len = len + 1;
                   }else if(oobject == null){
                      this.l(p0);
                      return b;
                   }else if((str = new StringBuilder((String.valueOf(oobject.a).length() + (this.b.getClass().getName().length() + 77)))) != null && oyt7.g(this)){
                      ml2 oml2 = new ml2(this.c, oobject);
                      int i = this.j.indexOf(oml2);
                      long l = 5000;
                      i1 = 15;
                      if (i >= 0) {
                         oml2 = this.j.get(i);
                         this.l.n.removeMessages(i1, oml2);
                         n = this.l.n;
                         this.l.getClass();
                         n.sendMessageDelayed(Message.obtain(n, i1, oml2), l);
                      }else {
                         this.j.add(oml2);
                         n = this.l.n;
                         this.l.getClass();
                         n.sendMessageDelayed(Message.obtain(n, i1, oml2), l);
                         n = this.l.n;
                         this.l.getClass();
                         n.sendMessageDelayed(Message.obtain(n, 16, oml2), 0x1d4c0);
                         fp0 uofp0 = new fp0(2, pendingInten);
                         if (!this.h(uofp0)) {
                            this.l.c(uofp0, this.g);
                         }
                      }
                      return false;
                   }else {
                      oyt7.c(new hd7(oobject));
                      return b;
                   }
                }
             }
          }
          oobject = pendingInten;
       }
    }
    public final void j(fp0 p0){
       ll2 te = this.e;
       Iterator iterator = te.iterator();
       if (iterator.hasNext()) {
          tp2.v(iterator.next());
          if (ye7.x(p0, fp0.v)) {
             ll2 tb = this.b;
             if (!tb.m() || tb.b == null) {
                throw new RuntimeException("Failed to connect when checking package");
             }
          }
          throw null;
       }else {
          te.clear();
          return;
       }
    }
    public final void k(){
       ll2 tl = this.l;
       if (Looper.myLooper() == tl.n.getLooper()) {
          this.o();
          return;
       }else {
          tl.n.post(new em0(13, this));
          return;
       }
    }
    public final void l(lt7 p0){
       int i;
       p0.e(this.d, this.b.b());
       try{
          i = 1;
          p0.d(this);
          return;
       }catch(android.os.DeadObjectException e0){
          this.g(i);
          e0.e("DeadObjectException thrown while running ApiCallRunner.");
          return;
       }
    }
    public final void m(){
       int i;
       int i1;
       StringBuilder i1;
       ut7 f;
       try{
          ll2 tl = this.l;
          w51.g(tl.n);
          ll2 tb = this.b;
          if (!tb.m() && !tb.n()) {
             i = 10;
             if (i1 = tl.g.q(tl.e, tb)) {
                fp0 uofp0 = new fp0(i1, null);
                i1 = new StringBuilder(((tb.getClass().getName().length() + 35) + String.valueOf(uofp0).length()));
                this.d(uofp0, null);
                return;
             }else {
                nl2 onl2 = new nl2(tl, tb, this.c);
                if (tb.b()) {
                   tl = this.h;
                   w51.k(tl);
                   if ((f = tl.f) != null) {
                      f.d();
                   }
                   ut7 e = tl.e;
                   e.h = Integer.valueOf(System.identityHashCode(tl));
                   ut7 b = tl.b;
                   tl.f = tl.c.h(tl.a, b.getLooper(), e, e.g, tl, tl);
                   tl.g = onl2;
                   if ((f = tl.d) != null && !f.isEmpty()) {
                      ut7 f1 = tl.f;
                      f1.getClass();
                      f1.i = new dy(f1);
                      f1.o(2, null);
                   }else {
                      b.post(new em0(15, tl));
                   }
                }
                try{
                   tb.i = onl2;
                   tb.o(2, null);
                   return;
                }catch(java.lang.SecurityException e0){
                   this.d(new fp0(i), e0);
                   return;
                }
             }
          }
       }catch(java.lang.IllegalStateException e0){
          this.d(new fp0(i), e0);
       }
       return;
    }
    public final void n(fp0 p0){
       this.d(p0, null);
    }
    public final void o(){
       ll2 tl = this.l;
       w51.g(tl.n);
       this.k = null;
       this.j(fp0.v);
       if (this.i != null) {
          ll2 tc = this.c;
          tl.n.removeMessages(11, tc);
          tl.n.removeMessages(9, tc);
          this.i = false;
       }
       Iterator iterator = this.f.values().iterator();
       if (!iterator.hasNext()) {
          this.p();
          this.q();
          return;
       }else {
          tp2.v(iterator.next());
          throw null;
       }
    }
    public final void p(){
       ll2 ta = this.a;
       ArrayList uArrayList = new ArrayList(ta);
       int i = uArrayList.size();
       int i1 = 0;
       while (i1 < i) {
          Object obj = uArrayList.get(i1);
          i1 = i1 + 1;
          if (this.b.m()) {
             if (this.i(obj)) {
                ta.remove(obj);
             }
          }else {
             break ;
          }
       }
       return;
    }
    public final void q(){
       ll2 tl = this.l;
       ll2 tc = this.c;
       tl.n.removeMessages(12, tc);
       ol2 n = tl.n;
       Message message = n.obtainMessage(12, tc);
       n.sendMessageDelayed(message, tl.a);
    }
}

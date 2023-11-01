package p.lp5;
import p.t90;
import p.g15;
import p.bv5;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.i40;
import p.op5;
import p.up0;
import p.i70;
import p.we7;
import p.kp5;
import java.util.concurrent.TimeUnit;
import p.b57;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.StringBuilder;
import p.os2;
import p.ps2;
import p.gg1;
import p.np5;
import p.jp5;
import java.util.ArrayList;
import java.lang.IllegalStateException;
import p.l67;
import p.lw1;
import java.net.Socket;
import java.lang.Class;
import java.io.IOException;
import p.pn;
import java.io.InterruptedIOException;
import java.lang.Throwable;
import p.da0;
import p.re5;
import p.ip5;
import p.kc1;
import java.util.ArrayDeque;
import java.util.Iterator;
import p.cx5;
import java.lang.Iterable;
import java.util.AbstractCollection;
import p.cj0;
import p.ey5;
import p.fq;
import p.vu0;
import p.f90;
import p.a90;
import p.to0;
import p.z90;
import p.yp5;
import java.util.List;
import java.io.Closeable;
import java.lang.NullPointerException;
import java.lang.ref.Reference;
import java.lang.System;
import p.r07;
import p.zb1;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class lp5 implements t90	// class@0002a4 from classes2.dex
{
    public np5 A;
    public boolean B;
    public l67 C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public l67 H;
    public np5 I;
    public final g15 a;
    public final bv5 b;
    public final boolean c;
    public final op5 t;
    public final i70 v;
    public final kp5 w;
    public final AtomicBoolean x;
    public Object y;
    public mw1 z;

    public void lp5(g15 p0,bv5 p1,boolean p2){
       co5.o(p0, "client");
       co5.o(p1, "originalRequest");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p0.b.a;
       up0 b = p0.v.b;
       co5.o(b, "$this_asFactory");
       this.v = b;
       kp5 okp5 = new kp5(this);
       okp5.g((long)p0.O, TimeUnit.MILLISECONDS);
       this.w = okp5;
       this.x = new AtomicBoolean();
       this.F = true;
    }
    public static final String a(lp5 p0){
       StringBuilder str = "";
       String str1 = (p0.G != null)? "canceled ": "";
       str = str+str1;
       str1 = (p0.c != null)? "web socket": "call";
       os2 oos2 = p0.b.a.g("/...");
       co5.i(oos2);
       oos2.b = gg1.i("", 0, 0, " \"\':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
       oos2.c = gg1.i("", 0, false, " \"\':;<=>@[]^`{}|/\\?#", 0, 0, 0, 0, 251);
       return str+str1+" to "+oos2.b().i;
    }
    public final void c(np5 p0){
       int i = (this.A == null)? 1: 0;
       if (i) {
          this.A = p0;
          p0.p.add(new jp5(this, this.y));
          return;
       }else {
          throw new IllegalStateException("Check failed.".toString());
       }
    }
    public final void cancel(){
       lp5 tH;
       np5 c;
       if (this.G != null) {
          return;
       }
       this.G = true;
       if ((tH = this.H) != null) {
          tH.e.cancel();
       }
       if ((tH = this.I) != null && (c = tH.c) != null) {
          we7.e(c);
       }
       this.v.getClass();
       return;
    }
    public final Object clone(){
       return new lp5(this.a, this.b, this.c);
    }
    public final IOException d(IOException p0){
       lp5 tA;
       InterruptedIOException interruptedI;
       if ((tA = this.A) != null) {
          _monitor_enter(tA);
          Socket socket = this.k();
          _monitor_exit(tA);
          if (this.A == null) {
             if (socket != null) {
                we7.e(socket);
             }
             this.v.getClass();
          }else if(socket == null){
             interruptedI = 1;
          }else {
             interruptedI = 0;
          }
          if (!interruptedI) {
             throw new IllegalStateException("Check failed.".toString());
          }
       }
       if (this.B != null || !this.w.i()) {
          interruptedI = p0;
       }else {
          interruptedI = new InterruptedIOException("timeout");
          if (p0 != null) {
             interruptedI.initCause(p0);
          }
       }
       if (p0 != null) {
          co5.i(interruptedI);
          this.v.getClass();
       }else {
          this.v.getClass();
       }
       return interruptedI;
    }
    public final void e(da0 p0){
       ip5 oip51;
       if (!this.x.compareAndSet(false, true)) {
          throw new IllegalStateException("Already Executed".toString());
       }
       this.y = re5.a.g();
       this.v.getClass();
       g15 a = this.a.a;
       ip5 oip5 = new ip5(this, p0);
       a.getClass();
       _monitor_enter(a);
       a.b.add(oip5);
       ip5 c = oip5.c;
       if (c.c == null) {
          ps2 d = c.b.a.d;
          Iterator iterator = a.c.iterator();
          do {
             if (iterator.hasNext()) {
             }else {
                iterator = a.b.iterator();
                do {
                   if (iterator.hasNext()) {
                   }else {
                      oip51 = null;
                      break ;
                   }
                   oip51 = iterator.next();
                } while (co5.c(oip51.c.b.a.d, d));
             }
             break ;
             oip51 = iterator.next();
          } while (co5.c(oip51.c.b.a.d, d));
          if (oip51 != null) {
             oip5.b = oip51.b;
          }
       }
       _monitor_exit(a);
       a.h();
       return;
    }
    public final cx5 f(){
       if (!this.x.compareAndSet(false, true)) {
          throw new IllegalStateException("Already Executed".toString());
       }
       this.w.h();
       this.y = re5.a.g();
       this.v.getClass();
       g15 a = this.a.a;
       _monitor_enter(a);
       a.d.add(this);
       _monitor_exit(a);
       this.a.a.d(this);
       return this.h();
    }
    public final void g(boolean p0){
       lp5 tH;
       _monitor_enter(this);
       if (this.F == null) {
          throw new IllegalStateException("released".toString());
       }
       _monitor_exit(this);
       if (p0 && (tH = this.H) != null) {
          tH.e.cancel();
          tH.b.i(tH, true, true, null);
       }
       this.C = null;
       return;
    }
    public final cx5 h(){
       IOException uocx51;
       ArrayList uArrayList = new ArrayList();
       cj0.c0(this.a.c, uArrayList);
       uArrayList.add(new ey5(this.a));
       uArrayList.add(new fq(this.a.A));
       uArrayList.add(new f90(this.a.B));
       uArrayList.add(to0.a);
       if (this.c == null) {
          cj0.c0(this.a.t, uArrayList);
       }
       uArrayList.add(new z90(this.c));
       lp5 ta = this.a;
       yp5 v9 = new yp5(this, uArrayList, 0, null, this.b, ta.P, ta.Q, ta.R);
       try{
          v9 = 0;
          cx5 uocx5 = v9.b(this.b);
          if (this.G == null) {
             this.j(v9);
             return uocx5;
          }else {
             we7.d(uocx5);
             throw new IOException("Canceled");
          }
       }catch(java.io.IOException e1){
          if ((uocx51 = this.j(e1)) == null) {
             throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
          }else {
             throw uocx51;
          }
       }
    }
    public final IOException i(l67 p0,boolean p1,boolean p2,IOException p3){
       lp5 tD;
       lp5 tA;
       co5.o(p0, "exchange");
       if (!co5.c(p0, this.H)) {
          return p3;
       }
       _monitor_enter(this);
       boolean b = false;
       if (p1 && (this.D != null || (p2 && this.E != null))) {
          if (p1) {
             this.D = b;
          }
          if (p2) {
             this.E = b;
          }
          int i = ((tD = this.D) == null && this.E == null)? 1: 0;
          if (tD == null && (this.E == null && this.F == null)) {
             b = 1;
          }
          tD = b;
          b = i;
       }else {
          p1 = false;
       }
       _monitor_exit(this);
       if (b) {
          this.H = null;
          if ((tA = this.A) != null) {
             tA.h();
          }
       }
       if (tD) {
          return this.d(p3);
       }else {
          return p3;
       }
    }
    public final IOException j(IOException p0){
       _monitor_enter(this);
       boolean b = false;
       if (this.F != null) {
          this.F = b;
          if (this.D == null && this.E == null) {
             b = true;
          }
       }
       _monitor_exit(this);
       if (b) {
          p0 = this.d(p0);
       }
       return p0;
    }
    public final Socket k(){
       lp5 tA = this.A;
       co5.i(tA);
       np5 p = tA.p;
       Iterator iterator = p.iterator();
       int i = 0;
       int i1 = 0;
       while (true) {
          int i2 = -1;
          if (iterator.hasNext()) {
             if (co5.c(iterator.next().get(), this)) {
             label_002b :
                int i3 = (i1 != i2)? 1: 0;
                if (i3) {
                   p.remove(i1);
                   this.A = null;
                   if (p.isEmpty()) {
                      tA.q = System.nanoTime();
                      lp5 tt = this.t;
                      tt.getClass();
                      op5 c = tt.c;
                      if (tA.j == null && tt.a != null) {
                         r07.d(c, tt.d);
                      }else {
                         tA.j = true;
                         op5 e = tt.e;
                         e.remove(tA);
                         if (e.isEmpty()) {
                            c.a();
                         }
                         i = 1;
                      }
                      if (i) {
                         np5 d = tA.d;
                         co5.i(d);
                         return d;
                      }
                   }
                   break ;
                }else {
                   throw new IllegalStateException("Check failed.".toString());
                }
             }else {
                i1 = i1 + 1;
             }
          }else {
             i1 = -1;
             goto label_002b ;
          }
       }
       return null;
    }
}

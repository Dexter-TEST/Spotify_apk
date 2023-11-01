package p.tr2;
import java.io.Closeable;
import p.qc6;
import p.gr2;
import java.lang.Object;
import java.util.LinkedHashMap;
import p.r07;
import p.u07;
import p.as2;
import p.f70;
import p.nr2;
import p.wr2;
import p.g70;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import java.lang.String;
import p.co5;
import p.rr2;
import p.i07;
import p.zr2;
import java.lang.Integer;
import java.util.Map;
import p.mo1;
import p.we7;
import java.io.IOException;
import java.util.Collection;
import java.lang.NullPointerException;
import java.net.Socket;
import p.e70;
import java.lang.Math;
import java.lang.Thread;
import java.io.InterruptedIOException;
import java.lang.StringBuilder;
import p.qr2;
import p.sr2;

public final class tr2 implements Closeable	// class@000354 from classes2.dex
{
    public final r07 A;
    public final r07 B;
    public final fv1 C;
    public long D;
    public long E;
    public long F;
    public long G;
    public long H;
    public final qc6 I;
    public qc6 J;
    public long K;
    public long L;
    public long M;
    public long N;
    public final Socket O;
    public final as2 P;
    public final nr2 Q;
    public final LinkedHashSet R;
    public final boolean a;
    public final jr2 b;
    public final LinkedHashMap c;
    public final String t;
    public int v;
    public int w;
    public boolean x;
    public final u07 y;
    public final r07 z;
    public static final qc6 S;

    static {
       qc6 oqc6 = new qc6();
       oqc6.c(7, 0xffff);
       oqc6.c(5, 0x4000);
       tr2.S = oqc6;
    }
    public void tr2(gr2 p0){
       gr2 f;
       gr2 e;
       super();
       gr2 a = p0.a;
       this.a = a;
       this.b = p0.g;
       this.c = new LinkedHashMap();
       gr2 d = p0.d;
       void ovoid = null;
       if (d != null) {
          this.t = d;
          int i = (a != null)? 3: 2;
          this.w = i;
          gr2 b = p0.b;
          this.y = b;
          r07 or07 = b.f();
          this.z = or07;
          this.A = b.f();
          this.B = b.f();
          this.C = p0.h;
          qc6 oqc6 = new qc6();
          if (a != null) {
             oqc6.c(7, 0x1000000);
          }
          this.I = oqc6;
          oqc6 = tr2.S;
          this.J = oqc6;
          this.N = (long)oqc6.a();
          if ((b = p0.c) != null) {
             this.O = b;
             if ((f = p0.f) != null) {
                this.P = new as2(f, a);
                if ((e = p0.e) != null) {
                   this.Q = new nr2(this, new wr2(e, a));
                   this.R = new LinkedHashSet();
                   if ((p0 = p0.i) != null) {
                      long l = TimeUnit.MILLISECONDS.toNanos((long)p0);
                      or07.c(new rr2(co5.K(" ping", d), this, l), l);
                   }
                   return;
                }else {
                   co5.N("source");
                   throw ovoid;
                }
             }else {
                co5.N("sink");
                throw ovoid;
             }
          }else {
             co5.N("socket");
             throw ovoid;
          }
       }else {
          co5.N("connectionName");
          throw ovoid;
       }
    }
    public synchronized final zr2 J(int p0){
       this.notifyAll();
       return this.c.remove(Integer.valueOf(p0));
    }
    public final void T(mo1 p0){
       tr2 tP = this.P;
       _monitor_enter(tP);
       _monitor_enter(this);
       if (this.x != null) {
          _monitor_exit(this);
          _monitor_exit(tP);
          return;
       }else {
          this.x = true;
          _monitor_exit(this);
          this.P.y(this.v, p0, we7.a);
          _monitor_exit(tP);
          return;
       }
    }
    public final void b(mo1 p0,mo1 p1,IOException p2){
       Object[] objArray;
       byte[] a = we7.a;
       try{
          this.T(p0);
          _monitor_enter(this);
          int i = 0;
          if ((this.c.isEmpty() ^ 0x01)) {
             zr2[] ozr2Array = new zr2[i];
             if ((objArray = this.c.values().toArray(ozr2Array)) != null) {
                this.c.clear();
             }else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
             }
          }else {
             objArray = null;
          }
          _monitor_exit(this);
          if (objArray != null) {
             int len = objArray.length;
             while (i < len) {
                object oobject = objArray[i];
                try{
                   oobject.c(p1, p2);
                   i = e0 + 1;
                }catch(java.io.IOException e0){
                }
             }
          }
          try{
             this.P.close();
             try{
                this.O.close();
                this.z.f();
                this.A.f();
                this.B.f();
                return;
             }catch(java.io.IOException e0){
             }
          }catch(java.io.IOException e0){
          }
       }catch(java.io.IOException e0){
       }
    }
    public final void close(){
       this.b(mo1.b, mo1.x, null);
    }
    public final void f(IOException p0){
       this.b(mo1.c, mo1.c, p0);
    }
    public final void flush(){
       this.P.flush();
    }
    public synchronized final void g0(long p0){
       long l = this.K + p0;
       this.K = l;
       l = l - this.L;
       if ((l - (long)(this.I.a() / 2)) >= 0) {
          this.j0(0, l);
          this.L = this.L + l;
       }
       return;
    }
    public final void h0(int p0,boolean p1,e70 p2,long p3){
       if (!(p3)) {
          this.P.f(p1, p0, p2, 0);
          return;
       }else {
          while (true) {
             if ((p3) <= 0) {
                return;
             }
             _monitor_enter(this);
             try{
                while (true) {
                   tr2 tM = this.M;
                   tr2 tN = this.N;
                   if ((tM - tN) >= 0) {
                      if (this.c.containsKey(Integer.valueOf(p0))) {
                         this.wait();
                      }else {
                         break ;
                      }
                   }else {
                      long l = tN - tM;
                      int i = Math.min((int)Math.min(p3, l), this.P.t);
                      long l1 = (long)i;
                      long l2 = this.M + l1;
                      this.M = l2;
                      _monitor_exit(this);
                      p3 = p3 - l1;
                      tr2 tP = this.P;
                      boolean b = (p1 && !(p3))? true: false;
                      tP.f(b, p0, p2, i);
                   }
                }
                throw new IOException("stream closed");
             }catch(java.lang.InterruptedException e0){
                Thread.currentThread().interrupt();
                throw new InterruptedIOException();
             }
          }
       }
    }
    public final void i0(int p0,mo1 p1){
       qr2 v0 = new qr2(this.t+'['+p0+"] writeSynReset", this, p0, p1, 1);
       this.z.c(v0, 0);
    }
    public final void j0(int p0,long p1){
       sr2 v0 = new sr2(this.t+'['+p0+"] windowUpdate", this, p0, p1);
       this.z.c(v0, 0);
    }
    public synchronized final zr2 x(int p0){
       return this.c.get(Integer.valueOf(p0));
    }
    public synchronized final boolean y(long p0){
       if (this.x != null) {
          return false;
       }
       if ((this.G - this.F) < 0 && (p0 - this.H) >= 0) {
          return false;
       }
       return true;
    }
}

package p.rq3;
import p.pq3;
import p.ne4;
import p.av7;
import p.mn;
import java.lang.IllegalStateException;
import java.lang.String;
import java.util.concurrent.Semaphore;
import p.ln;
import p.xz4;
import androidx.lifecycle.b;
import java.lang.Object;
import p.ek3;
import java.lang.StringBuilder;
import java.lang.System;
import java.lang.Integer;
import p.w51;

public final class rq3 extends ne4 implements pq3	// class@00253a from classes.dex
{
    public final int l;
    public final Bundle m;
    public final mn n;
    public ek3 o;
    public sq3 p;
    public mn q;

    public void rq3(av7 p0){
       super();
       int i = 0;
       this.l = i;
       this.m = null;
       this.n = p0;
       this.q = null;
       if (p0.b != null) {
          throw new IllegalStateException("There is already a listener registered");
       }
       p0.b = this;
       p0.a = i;
       return;
    }
    public final void h(){
       rq3 tn = this.n;
       tn.c = true;
       tn.e = false;
       tn.d = false;
       tn.j.drainPermits();
       tn.a();
       tn.h = new ln(tn);
       tn.b();
    }
    public final void i(){
       this.n.c = false;
    }
    public final void j(xz4 p0){
       super.j(p0);
       this.o = null;
       this.p = null;
    }
    public final void k(Object p0){
       super.k(p0);
       if ((p0 = this.q) != null) {
          p0.e = true;
          p0.c = false;
          p0.d = false;
          p0.f = false;
          this.q = null;
       }
       return;
    }
    public final void m(){
       rq3 to = this.o;
       rq3 tp = this.p;
       if (to != null && tp != null) {
          super.j(tp);
          this.f(to, tp);
       }
       return;
    }
    public final String toString(){
       StringBuilder str = new StringBuilder(64)+"LoaderInfo{"+Integer.toHexString(System.identityHashCode(this))+" #"+this.l+" : ";
       w51.a(this.n, str);
       return str+"}}";
    }
}

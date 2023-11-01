package p.zr2;
import p.tr2;
import p.mp2;
import java.lang.Object;
import p.qc6;
import java.util.ArrayDeque;
import p.yr2;
import p.xr2;
import p.kp5;
import java.lang.IllegalStateException;
import java.lang.String;
import p.we7;
import p.mo1;
import java.io.IOException;
import p.ou6;
import p.co5;
import java.lang.Class;
import p.as2;
import java.util.Collection;
import java.lang.Thread;
import java.io.InterruptedIOException;

public final class zr2	// class@0003fb from classes2.dex
{
    public final int a;
    public final tr2 b;
    public long c;
    public long d;
    public long e;
    public long f;
    public final ArrayDeque g;
    public boolean h;
    public final yr2 i;
    public final xr2 j;
    public final kp5 k;
    public final kp5 l;
    public mo1 m;
    public IOException n;

    public void zr2(int p0,tr2 p1,boolean p2,boolean p3,mp2 p4){
       super();
       this.a = p0;
       this.b = p1;
       this.f = (long)p1.J.a();
       ArrayDeque uArrayDeque = new ArrayDeque();
       this.g = uArrayDeque;
       this.i = new yr2(this, (long)p1.I.a(), p3);
       this.j = new xr2(this, p2);
       this.k = new kp5(this);
       this.l = new kp5(this);
       if (p4 != null) {
          if ((this.h() ^ 0x01)) {
             uArrayDeque.add(p4);
          }else {
             throw new IllegalStateException("locally-initiated streams shouldn\'t have headers yet".toString());
          }
       }else if(this.h()){
          throw new IllegalStateException("remotely-initiated streams should have headers".toString());
       }
       return;
    }
    public final void a(){
       _monitor_enter(this);
       zr2 ti = this.i;
       if (ti.b == null && ti.v != null) {
          ti = this.j;
          if (ti.a != null || ti.c != null) {
             ti = 1;
          label_001a :
             boolean b = this.i();
             _monitor_exit(this);
             if (ti) {
                this.c(mo1.x, null);
             }else if(!b){
                this.b.J(this.a);
             }
             return;
          }
       }
       ti = 0;
       goto label_001a ;
    }
    public final void b(){
       ou6 oou6;
       zr2 tj = this.j;
       if (tj.c != null) {
          throw new IOException("stream closed");
       }
       if (tj.a != null) {
          throw new IOException("stream finished");
       }
       if (this.m == null) {
          return;
       }
       if ((tj = this.n) == null) {
          zr2 tm = this.m;
          co5.i(tm);
          oou6 = new ou6(tm);
       }
       throw oou6;
    }
    public final void c(mo1 p0,IOException p1){
       if (!this.d(p0, p1)) {
          return;
       }
       zr2 tb = this.b;
       tb.getClass();
       tb.P.g0(this.a, p0);
       return;
    }
    public final boolean d(mo1 p0,IOException p1){
       _monitor_enter(this);
       if (this.f() != null) {
          _monitor_exit(this);
          return false;
       }else if(this.i.b != null && this.j.a != null){
          _monitor_exit(this);
          return false;
       }else {
          this.m = p0;
          this.n = p1;
          this.notifyAll();
          _monitor_exit(this);
          this.b.J(this.a);
          return true;
       }
    }
    public final void e(mo1 p0){
       if (!this.d(p0, null)) {
          return;
       }
       this.b.i0(this.a, p0);
       return;
    }
    public synchronized final mo1 f(){
       return this.m;
    }
    public final xr2 g(){
       _monitor_enter(this);
       int i = (this.h == null && !this.h())? 0: 1;
       if (i) {
          _monitor_exit(this);
          return this.j;
       }else {
          throw new IllegalStateException("reply before requesting the sink".toString());
       }
    }
    public final boolean h(){
       int i = 1;
       int i1 = (((this.a & i)) == i)? 1: 0;
       if (this.b.a != i1) {
          i = false;
       }
       return i;
    }
    public synchronized final boolean i(){
       if (this.m != null) {
          return false;
       }
       zr2 ti = this.i;
       if (ti.b != null || ti.v != null) {
          ti = this.j;
          if (ti.a != null || (ti.c != null && this.h != null)) {
             return false;
          }
       }
       return true;
    }
    public final void j(mp2 p0,boolean p1){
       co5.o(p0, "headers");
       _monitor_enter(this);
       if (this.h != null && p1) {
          this.i.getClass();
       }else {
          this.h = true;
          this.g.add(p0);
       }
       if (p1) {
          p0.b = true;
       }
       this.notifyAll();
       _monitor_exit(this);
       if (!this.i()) {
          this.b.J(this.a);
       }
       return;
    }
    public synchronized final void k(mo1 p0){
       if (this.m == null) {
          this.m = p0;
          this.notifyAll();
       }
       return;
    }
    public final void l(){
       try{
          this.wait();
          return;
       }catch(java.lang.InterruptedException e0){
          Thread.currentThread().interrupt();
          throw new InterruptedIOException();
       }
    }
}

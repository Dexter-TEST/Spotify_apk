package p.jn2;
import p.wq0;
import java.util.ArrayList;
import java.lang.Object;
import p.vk3;
import java.lang.Class;
import p.cq0;
import p.xq0;
import p.bq0;
import p.fn6;
import p.rk;
import p.qk;
import java.lang.Enum;

public final class jn2 extends wq0	// class@001b0c from classes.dex
{
    public float q0;
    public int r0;
    public int s0;
    public cq0 t0;
    public int u0;
    public boolean v0;

    public void jn2(){
       super();
       this.q0 = 0xbf800000;
       this.r0 = -1;
       this.s0 = -1;
       this.t0 = this.J;
       int i = 0;
       this.u0 = i;
       this.R.clear();
       this.R.add(this.t0);
       int len = this.Q.length;
       for (; i < len; i = i + 1) {
          this.Q[i] = this.t0;
       }
       return;
    }
    public final boolean B(){
       return this.v0;
    }
    public final boolean C(){
       return this.v0;
    }
    public final void Q(vk3 p0,boolean p1){
       if (this.U == null) {
          return;
       }
       p0.getClass();
       int i = vk3.n(this.t0);
       if (this.u0 == 1) {
          this.Z = i;
          this.a0 = 0;
          this.L(this.U.l());
          this.O(0);
       }else {
          this.Z = 0;
          this.a0 = i;
          this.O(this.U.r());
          this.L(0);
       }
       return;
    }
    public final void R(int p0){
       this.t0.l(p0);
       this.v0 = true;
    }
    public final void S(int p0){
       if (this.u0 == p0) {
          return;
       }
       this.u0 = p0;
       wq0 tR = this.R;
       tR.clear();
       this.t0 = (this.u0 == 1)? this.I: this.J;
       tR.add(this.t0);
       tR = this.Q;
       int len = tR.length;
       for (int i = 0; i < len; i = i + 1) {
          tR[i] = this.t0;
       }
       return;
    }
    public final void c(vk3 p0,boolean p1){
       wq0 tU;
       int i3;
       fn6 uofn6;
       rk ork;
       if ((tU = this.U) == null) {
          return;
       }
       cq0 uocq0 = tU.j(bq0.a);
       cq0 uocq01 = tU.j(bq0.c);
       wq0 tU1 = this.U;
       int i = 1;
       int i1 = 0;
       int i2 = 2;
       tU1 = (tU1 != null && tU1.T[i1] == i2)? 1: 0;
       if (this.u0 == null) {
          uocq0 = tU.j(bq0.b);
          uocq01 = tU.j(bq0.t);
          if ((tU = this.U) == null || tU.T[i] != i2) {
             ork = 0;
          }
          i3 = i;
       }
       i = -1;
       if (this.v0 != null) {
          jn2 tt0 = this.t0;
          if (tt0.c != null) {
             uofn6 = p0.k(tt0);
             p0.d(uofn6, this.t0.d());
             if (this.r0 != i) {
                if (i3) {
                   p0.f(p0.k(uocq01), uofn6, i1, 5);
                }
             }else if(this.s0 != i && i3){
                p0.f(uofn6, p0.k(uocq0), i1, 5);
                p0.f(p0.k(uocq01), uofn6, i1, 5);
             }
             this.v0 = i1;
             return;
          }
       }
       if (this.r0 != i) {
          uofn6 = p0.k(this.t0);
          p0.e(uofn6, p0.k(uocq0), this.r0, 8);
          if (i3) {
             p0.f(p0.k(uocq01), uofn6, i1, 5);
          }
       }else if(this.s0 != i){
          uofn6 = p0.k(this.t0);
          fn6 uofn61 = p0.k(uocq01);
          p0.e(uofn6, uofn61, (- this.s0), 8);
          if (i3) {
             p0.f(uofn6, p0.k(uocq0), i1, 5);
             p0.f(uofn61, uofn6, i1, 5);
          }
       }else if(0xbf800000 - this.q0){
          ork = p0.l();
          ork.d.d(p0.k(this.t0), 0xbf800000);
          ork.d.d(p0.k(uocq01), this.q0);
          p0.c(ork);
       }
       return;
    }
    public final boolean d(){
       return true;
    }
    public final cq0 j(bq0 p0){
       int i = p0.ordinal();
       int i1 = 1;
       if (i != i1) {
          if (i != 2) {
             if (i != 3) {
                if (i == 4) {
                }
             }else if(this.u0 == i1){
                return this.t0;
             }
          }else if(this.u0 == null){
             return this.t0;
          }
       }else {
       }
       return null;
    }
}

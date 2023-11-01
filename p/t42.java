package p.t42;
import p.fg3;
import p.eg3;
import p.w57;
import p.x57;
import p.qg3;
import p.ng3;
import p.cg3;
import java.lang.String;
import java.math.BigInteger;
import p.ne;
import java.math.BigDecimal;
import java.lang.Object;
import p.dg3;
import java.lang.Number;

public final class t42 extends fg3	// class@0026f8 from classes.dex
{
    public final boolean b;
    public qg3 c;
    public x57 t;
    public x57 v;
    public w57 w;
    public int x;

    public void t42(eg3 p0,w57 p1){
       super(p0);
       this.w = p1;
       this.t = new x57(0, null, p1, true);
       this.b = false;
    }
    public final qg3 C0(){
       t42 tc;
       qg3 oqg31;
       qg3 oqg33;
       qg3 c;
       t42 tw;
       w57 ow57;
       t42 tt1;
       x57 g;
       x57 d;
       x57 d1;
       x57 ox57;
       w57 a = w57.a;
       qg3 oqg3 = null;
       if (this.b == null && ((tc = this.c) != null && (this.v == null && (tc.w != null && (this.t.h == null && this.w == a))))) {
          this.c = oqg3;
          return oqg3;
       }else if((tc = this.v) != null){
          while (true) {
             if ((oqg31 = tc.k()) != null) {
                this.c = oqg31;
                return oqg31;
             }else {
                t42 tt = this.t;
                if (tc == tt) {
                   this.v = oqg3;
                   if (tc.d()) {
                      qg3 oqg32 = this.a.j0();
                      this.c = oqg32;
                      return oqg32;
                   }else if((oqg33 = this.a.x()) != qg3.B){
                      this.c = oqg33;
                      return oqg33;
                   }
                }else if((d = tt.d) == tc){
                   tc = tt;
                }else {
                   while (true) {
                      if (d != null) {
                         if ((d1 = d.d) == tc) {
                            ox57 = d;
                         }else {
                            d = d1;
                         }
                      }else {
                         ox57 = oqg3;
                      }
                   }
                }
                this.v = tc;
                if (tc != null) {
                }else {
                   throw new cg3(this, "Unexpected problem: chain of filtered context broken");
                }
             }
          }
       }
       if ((oqg33 = this.a.C0()) == null) {
          this.c = oqg33;
          return oqg33;
       }else if((c = oqg33.c) != true){
          if (c != 2) {
             if (c != 3) {
                if (c != 4) {
                   if (c != 5) {
                      if ((tw = this.w) == a) {
                         this.c = oqg33;
                         return oqg33;
                      }else if(tw != null && ((ow57 = this.t.h(tw)) == a && (ow57 == null || !this.F0()))){
                         this.c = oqg33;
                         return oqg33;
                      }
                   }else {
                      tt1 = this.t;
                      tt1.f = this.a.i0();
                      tt1.i = true;
                      if ((g = tt1.g) == a) {
                         this.w = g;
                         this.c = oqg33;
                         return oqg33;
                      }else if(g == null){
                         this.a.C0();
                         this.a.E0();
                      }else {
                         this.w = g;
                         if (g == a && !this.F0()) {
                            this.a.C0();
                            this.a.E0();
                         }
                      }
                   }
                }
             }else if((tw = this.w) == a){
                this.t = this.t.i(tw, true);
                this.c = oqg33;
                return oqg33;
             }else if(tw == null){
                this.a.E0();
             }else if((ow57 = this.t.h(tw)) == null){
                this.a.E0();
             }else {
                this.w = ow57;
                if (ow57 == a) {
                   this.t = this.t.i(ow57, true);
                   this.c = oqg33;
                   return oqg33;
                }else {
                   this.t = this.t.i(ow57, false);
                }
             }
          }
          tw = this.t;
          g = tw.d;
          this.t = g;
          this.w = g.g;
          if (tw.h != null) {
             this.c = oqg33;
             return oqg33;
          }
       }else if((tw = this.w) == a){
          this.t = this.t.j(tw, true);
          this.c = oqg33;
          return oqg33;
       }else if(tw == null){
          this.a.E0();
       }else if((ow57 = this.t.h(tw)) == null){
          this.a.E0();
       }else {
          this.w = ow57;
          if (ow57 == a) {
             this.t = this.t.j(ow57, true);
             this.c = oqg33;
             return oqg33;
          }else {
             this.t = this.t.j(ow57, false);
          }
       }
       while (true) {
          if ((oqg33 = this.a.C0()) == null) {
             this.c = oqg33;
             break ;
          }else if((c = oqg33.c) != true){
             if (c != 2) {
                if (c != 3) {
                   if (c != 4) {
                      if (c != 5) {
                         if ((tw = this.w) == a) {
                            this.c = oqg33;
                            break ;
                         }else {
                            if (tw != null && ((ow57 = this.t.h(tw)) == a && (ow57 == null || !this.F0()))) {
                               this.c = oqg33;
                               break ;
                            }else {
                               continue ;
                            }
                         }
                      }else {
                         tt1 = this.t;
                         tt1.f = this.a.i0();
                         tt1.i = true;
                         if ((g = tt1.g) == a) {
                            this.w = g;
                            this.c = oqg33;
                            break ;
                         }else if(g == null){
                            this.a.C0();
                            this.a.E0();
                            continue ;
                         }else {
                            this.w = g;
                            if (g == a && !this.F0()) {
                               this.a.C0();
                               this.a.E0();
                               continue ;
                            }else {
                               continue ;
                            }
                         }
                      }
                   }
                }else if((tw = this.w) == a){
                   this.t = this.t.i(tw, true);
                   this.c = oqg33;
                   break ;
                }else if(tw == null){
                   this.a.E0();
                   continue ;
                }else if((ow57 = this.t.h(tw)) == null){
                   this.a.E0();
                   continue ;
                }else {
                   this.w = ow57;
                   if (ow57 == a) {
                      this.t = this.t.i(ow57, true);
                      this.c = oqg33;
                      break ;
                   }else {
                      this.t = this.t.i(ow57, false);
                      continue ;
                   }
                }
             }
             tw = this.t;
             g = tw.d;
             this.t = g;
             this.w = g.g;
             if (tw.h != null) {
                this.c = oqg33;
                break ;
             }else {
                continue ;
             }
          }else if((tw = this.w) == a){
             this.t = this.t.j(tw, true);
             this.c = oqg33;
             break ;
          }else if(tw == null){
             this.a.E0();
             continue ;
          }else if((ow57 = this.t.h(tw)) == null){
             this.a.E0();
             continue ;
          }else {
             this.w = ow57;
             if (ow57 == a) {
                this.t = this.t.j(ow57, true);
                this.c = oqg33;
                break ;
             }else {
                this.t = this.t.j(ow57, false);
                continue ;
             }
          }
       }
       return oqg33;
    }
    public final qg3 D0(){
       qg3 oqg3;
       if ((oqg3 = this.C0()) == qg3.B) {
          oqg3 = this.C0();
       }
       return oqg3;
    }
    public final eg3 E0(){
       t42 tc;
       qg3 oqg3;
       if ((tc = this.c) != qg3.x && tc != qg3.z) {
          return this;
       }
       int i = 1;
       while (true) {
          if ((oqg3 = this.C0()) == null) {
             return this;
          }
          if (oqg3.t != null) {
             i = i + 1;
          }else if(oqg3.v != null && !(i = i - 1)){
             break ;
          }
       }
       return this;
    }
    public final boolean F0(){
       t42 tx;
       if ((tx = this.x) != null && this.b == null) {
          return false;
       }
       this.x = tx + 1;
       return 1;
    }
    public final BigInteger J(){
       return this.a.J();
    }
    public final byte T(){
       return this.a.T();
    }
    public final void b(){
       if (this.c != null) {
          this.c = null;
       }
       return;
    }
    public final String f(){
       t42 tv;
       t42 tc;
       x57 d;
       String str;
       if ((tv = this.v) != null) {
       }else {
          tv = this.t;
       }
       if ((tc = this.c) != qg3.x && tc != qg3.z) {
          return tv.f;
       }else if((d = tv.d) == null){
          str = null;
       }else {
          str = d.f;
       }
       return str;
    }
    public final ne h0(){
       return this.a.h0();
    }
    public final String i0(){
       t42 tv;
       t42 tc;
       x57 d;
       String str;
       if ((tv = this.v) != null) {
       }else {
          tv = this.t;
       }
       if ((tc = this.c) != qg3.x && tc != qg3.z) {
          return tv.f;
       }else if((d = tv.d) == null){
          str = null;
       }else {
          str = d.f;
       }
       return str;
    }
    public final qg3 j0(){
       return this.c;
    }
    public final BigDecimal k0(){
       return this.a.k0();
    }
    public final double l0(){
       return this.a.l0();
    }
    public final Object m0(){
       return this.a.m0();
    }
    public final float n0(){
       return this.a.n0();
    }
    public final int o0(){
       return this.a.o0();
    }
    public final long p0(){
       return this.a.p0();
    }
    public final dg3 q0(){
       return this.a.q0();
    }
    public final Number r0(){
       return this.a.r0();
    }
    public final short t0(){
       return this.a.t0();
    }
    public final String u0(){
       if (this.c == qg3.B) {
          return this.f();
       }
       return this.a.u0();
    }
    public final ne v0(){
       return this.a.v0();
    }
    public final int w0(){
       return this.a.w0();
    }
    public final qg3 x(){
       return this.c;
    }
    public final long x0(){
       return this.a.x0();
    }
    public final int y(){
       t42 tc;
       int i = ((tc = this.c) == null)? 0: tc.c;
       return i;
    }
    public final String y0(){
       if (this.c == qg3.B) {
          return this.f();
       }
       return this.a.y0();
    }
    public final boolean z0(qg3 p0){
       boolean b = (this.c == p0)? true: false;
       return b;
    }
}

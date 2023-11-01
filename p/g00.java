package p.g00;
import p.xl3;
import java.lang.Object;
import java.lang.Math;

public final class g00 implements xl3	// class@00166f from classes.dex
{
    public final xl3 a;
    public int b;
    public int c;
    public int t;
    public Object v;

    public void g00(xl3 p0){
       super();
       this.b = 0;
       this.c = -1;
       this.t = -1;
       this.v = null;
       this.a = p0;
    }
    public final void a(){
       g00 tb;
       if ((tb = this.b) == null) {
          return;
       }
       g00 ta = this.a;
       if (tb != 1) {
          if (tb != 2) {
             if (tb == 3) {
                ta.l(this.c, this.t, this.v);
             }
          }else {
             ta.d(this.c, this.t);
          }
       }else {
          ta.k(this.c, this.t);
       }
       this.v = null;
       this.b = 0;
       return;
    }
    public final void d(int p0,int p1){
       g00 tc;
       if (this.b == 2 && ((tc = this.c) >= p0 && tc <= (p0 + p1))) {
          this.t = this.t + p1;
          this.c = p0;
          return;
       }else {
          this.a();
          this.c = p0;
          this.t = p1;
          this.b = 2;
          return;
       }
    }
    public final void f(int p0,int p1){
       this.a();
       this.a.f(p0, p1);
    }
    public final void k(int p0,int p1){
       if (this.b == 1) {
          g00 tc = this.c;
          if (p0 >= tc) {
             g00 tt = this.t;
             if (p0 <= (tc + tt)) {
                this.t = tt + p1;
                this.c = Math.min(p0, tc);
                return;
             }
          }
       }
       this.a();
       this.c = p0;
       this.t = p1;
       this.b = 1;
       return;
    }
    public final void l(int p0,int p1,Object p2){
       int i;
       if (this.b == 3) {
          g00 tc = this.c;
          g00 tt = this.t;
          if (p0 <= (tc + tt) && ((i = p0 + p1) >= tc && this.v == p2)) {
             this.c = Math.min(p0, tc);
             this.t = Math.max((tt + tc), i) - this.c;
             return;
          }
       }
       this.a();
       this.c = p0;
       this.t = p1;
       this.v = p2;
       this.b = 3;
       return;
    }
}

package p.r5;
import p.v64;
import p.w5;
import android.content.Context;
import p.e64;
import p.v5;
import android.view.View;
import p.b74;
import p.c74;
import p.ev6;
import p.l64;

public final class r5 extends v64	// class@002481 from classes.dex
{
    public final int m;
    public final w5 n;

    public void r5(w5 p0,Context p1,e64 p2,v5 p3){
       v64 tj;
       this.m = 1;
       this.n = p0;
       super(p1, p2, p3, 1);
       this.g = 0x800005;
       p0 = p0.N;
       this.i = p0;
       if ((tj = this.j) != null) {
          tj.j(p0);
       }
       return;
    }
    public void r5(w5 p0,Context p1,ev6 p2,View p3){
       w5 z;
       v64 tj;
       this.m = 0;
       this.n = p0;
       super(p1, p2, p3, 0);
       if (!p2.A.g()) {
          if ((z = p0.z) == null) {
             z = p0.y;
          }
          this.f = z;
       }
       p0 = p0.N;
       this.i = p0;
       if ((tj = this.j) != null) {
          tj.j(p0);
       }
       return;
    }
    public final void c(){
       w5 c;
       r5 tn = this.n;
       switch (this.m){
           case 0:
           default:
             if ((c = tn.c) != null) {
                c.c(true);
             }
             tn.J = null;
             super.c();
             return;
       }
       tn.K = null;
       super.c();
       return;
    }
}

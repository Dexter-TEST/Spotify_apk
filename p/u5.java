package p.u5;
import p.uc2;
import android.view.View;
import java.lang.Object;
import p.if6;
import p.v5;
import p.w5;
import p.s64;
import p.v64;
import p.jh;
import p.mh;
import p.lh;
import p.dh;

public final class u5 extends uc2	// class@00284b from classes.dex
{
    public final int A;
    public final Object B;
    public final View C;

    public void u5(View p0,View p1,Object p2,int p3){
       this.A = p3;
       this.C = p0;
       this.B = p2;
       super(p1);
    }
    public final if6 b(){
       w5 j;
       switch (this.A){
           case 0:
             break;
           default:
             return this.B;
       }
       if6 oif6 = ((j = this.C.t.J) == null)? null: j.a();
       return oif6;
    }
    public final boolean c(){
       u5 tC = this.C;
       switch (this.A){
           case 0:
           default:
             if (!tC.getInternalPopup().a()) {
                tC.w.k(dh.b(tC), dh.a(tC));
             }
             return true;
       }
       tC.t.l();
       return true;
    }
    public final boolean d(){
       boolean b = true;
       switch (this.A){
           case 0:
             v5 t = this.C.t;
             if (t.L != null) {
                b = false;
             }else {
                t.c();
             }
             break;
           default:
             super.d();
             return b;
       }
       return b;
    }
}

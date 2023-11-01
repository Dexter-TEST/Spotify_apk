package p.x70;
import p.js6;
import java.lang.Class;
import p.tf3;
import p.he3;
import p.qo5;
import java.lang.Object;
import p.tp2;
import p.sf3;
import p.gb6;
import p.mg3;
import p.vf3;
import java.lang.String;
import p.wa6;
import p.ka7;
import p.qg3;
import p.ds7;

public abstract class x70 extends js6	// class@002c1e from classes.dex
{
    public final int c;

    public void x70(int p0,Class p1){
       this.c = p0;
       super(p1, 0);
    }
    public final void acceptJsonFormatVisitor(tf3 p0,he3 p1){
       switch (this.c){
           case 0:
             p0.getClass();
             return;
           case 1:
             p0.getClass();
             return;
           case 2:
             p0.getClass();
             return;
           case 5:
             tp2.v(p0.b);
             return;
           default:
             p0.getClass();
             return;
       }
    }
    public final boolean isEmpty(gb6 p0,Object p1){
       boolean b = false;
       switch (this.c){
           case 0:
             if (!p1.length) {
                b = true;
             }
             return b;
             break;
           case 2:
             if (!p1.length) {
                b = true;
             }
             return b;
             break;
           case 5:
           default:
             return super.isEmpty(p0, p1);
       }
       return true;
    }
    public void serialize(Object p0,vf3 p1,gb6 p2){
       int i = 0;
       switch (this.c){
           case 0:
             p2.getClass();
             throw null;
           case 1:
             p1.t0(p0.toString());
             return;
           case 2:
             if (p2.w(wa6.v)) {
                p1.u0(p0);
                int len = p0.length;
                for (; i < len; i = i + 1) {
                   p1.y0(p0, i, 1);
                }
                p1.g0();
             }else {
                p1.y0(p0, i, p0.length);
             }
             return;
             break;
           case 3:
             p1.i0(p0.toString());
             return;
           case 4:
             p1.i0(p0);
             return;
           default:
             p1.w0(p0);
             p1.h0();
             return;
       }
    }
    public void serializeWithType(Object p0,vf3 p1,gb6 p2,ka7 p3){
       ds7 uods7;
       int i = 0;
       switch (this.c){
           case 0:
             p3.c(p1, p3.b(qg3.C, p0));
             p2.getClass();
             throw null;
           case 1:
             this.serialize(p0, p1, p2);
             p3.d(p1, p3.c(p1, p3.b(qg3.C, p0)));
             return;
           case 2:
             if (p2.w(wa6.v)) {
                uods7 = p3.c(p1, p3.b(qg3.z, p0));
                int len = p0.length;
                for (; i < len; i = i + 1) {
                   p1.y0(p0, i, 1);
                }
             }else {
                uods7 = p3.c(p1, p3.b(qg3.D, p0));
                p1.y0(p0, i, p0.length);
             }
             p3.d(p1, uods7);
             return;
             break;
           case 5:
             p3.d(p1, p3.c(p1, p3.b(qg3.x, p0)));
             return;
           default:
             super.serializeWithType(p0, p1, p2, p3);
             return;
       }
    }
}

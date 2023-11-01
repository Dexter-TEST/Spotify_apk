package p.nu3;
import p.qg2;
import p.f;
import java.lang.Object;
import p.ou3;
import p.tt3;
import java.lang.Class;
import p.i77;
import p.st;
import p.pt3;
import java.util.HashSet;
import p.vv7;
import p.xt;
import java.util.Set;
import p.co5;
import p.yt3;
import p.qt3;
import p.wt3;
import p.vt3;
import java.lang.Boolean;
import p.xt3;
import p.nt3;
import java.lang.String;
import p.bu3;
import p.mt3;
import p.zt3;
import java.lang.NullPointerException;
import p.cu3;
import p.ut3;
import p.ot3;

public final class nu3 implements qg2	// class@00204e from classes.dex
{
    public final int a;
    public final f b;

    public void nu3(f p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       i77 oi77;
       Object[] objArray;
       ou3 a = ou3.a;
       boolean b = true;
       nu3 tb = this.b;
       switch (this.a){
           case 0:
             tb.getClass();
             oi77 = new i77(tb);
             if ((p0 = p0.a) != null) {
                oi77.b = p0;
                if (p0.isEmpty() || tb.c.isEmpty()) {
                   b = false;
                }
                oi77.d = Boolean.valueOf(b);
                oi77.e = Boolean.FALSE;
                return xt.d(oi77.j());
             }else {
                throw new NullPointerException("Null username");
             }
             break;
           case 1:
             tb.getClass();
             oi77 = new i77(tb);
             if ((p0 = p0.a) != null) {
                oi77.c = p0;
                if (tb.b.isEmpty() || p0.isEmpty()) {
                   b = false;
                }
                oi77.d = Boolean.valueOf(b);
                oi77.e = Boolean.FALSE;
                return xt.d(oi77.j());
             }else {
                throw new NullPointerException("Null password");
             }
             break;
           case 2:
             tb.getClass();
             p0 = new i77(tb);
             p0.a = ou3.b;
             objArray = new Object[b];
             objArray[0] = new mt3(tb.b, tb.c);
             return new xt(p0.j(), co5.B(vv7.p(objArray)));
           case 3:
             p0 = new Object[b];
             p0[0] = new nt3(tb.b, tb.c);
             return xt.a(vv7.p(p0));
           case 4:
             tb.getClass();
             p0 = new i77(tb);
             p0.a = a;
             p0.e = Boolean.TRUE;
             return xt.d(p0.j());
           case 5:
             tb.getClass();
             p0 = new i77(tb);
             p0.a = ou3.c;
             return xt.d(p0.j());
           case 6:
             tb.getClass();
             p0 = new i77(tb);
             p0.a = a;
             objArray = new Object[b];
             objArray[0] = new qt3();
             return new xt(p0.j(), co5.B(vv7.p(objArray)));
           case 7:
             tb.getClass();
             p0 = new i77(tb);
             p0.a = a;
             objArray = new Object[b];
             objArray[0] = new pt3();
             return new xt(p0.j(), co5.B(vv7.p(objArray)));
           default:
             if (tb.a != a) {
                p0 = xt.e();
             }else {
                objArray = new Object[b];
                objArray[0] = new ot3(p0.a);
                p0 = xt.a(vv7.p(objArray));
             }
             return p0;
       }
    }
}

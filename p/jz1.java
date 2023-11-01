package p.jz1;
import p.qg2;
import p.d;
import java.lang.Object;
import p.gz1;
import p.wy1;
import java.util.HashSet;
import p.vv7;
import java.util.Set;
import p.xt;
import p.hz1;
import java.lang.Class;
import p.pv;
import p.ht;
import p.xy1;
import p.c;
import java.lang.String;
import p.co5;
import p.ez1;
import p.ty1;
import p.fz1;
import p.uy1;

public final class jz1 implements qg2	// class@001b72 from classes.dex
{
    public final int a;
    public final d b;

    public void jz1(d p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       pv opv;
       Object[] objArray;
       int i = 0;
       int i1 = 1;
       jz1 tb = this.b;
       switch (this.a){
           case 0:
             p0 = p0.a;
             tb.getClass();
             opv = new pv(tb);
             opv.b = p0;
             objArray = new Object[i1];
             objArray[i] = new ty1(p0);
             return new xt(opv.a(), co5.B(vv7.p(objArray)));
           case 1:
             tb.getClass();
             opv = new pv(tb);
             opv.d = p0.a;
             p0 = opv.a();
             d b = p0.b;
             b.getClass();
             objArray = new Object[i1];
             objArray[i] = new xy1(b.c);
             return new xt(p0, co5.B(vv7.p(objArray)));
           case 2:
             if (p0.a != null && (tb.v == null && tb.c == null)) {
                p0 = new Object[i1];
                p0[i] = new wy1();
                p0 = xt.a(vv7.p(p0));
             }else {
                p0 = new Object[i1];
                p0[i] = new wy1();
                p0 = xt.a(vv7.p(p0));
             }
             return p0;
             break;
           default:
             p0 = tb.b;
             p0.getClass();
             Object[] objArray1 = new Object[i1];
             objArray1[i] = new uy1(p0.b, tb.v);
             return xt.a(vv7.p(objArray1));
       }
    }
}

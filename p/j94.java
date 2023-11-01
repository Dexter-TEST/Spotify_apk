package p.j94;
import p.qg2;
import p.vt;
import java.lang.Object;
import p.tt1;
import java.lang.Class;
import p.as;
import java.lang.Boolean;
import p.xt;
import p.et1;
import p.r45;
import p.jj5;
import p.qs1;
import p.ss1;
import p.ot1;
import p.sv;
import p.gt1;
import p.gh1;
import p.aq6;
import p.hh1;
import java.util.HashSet;
import p.vv7;
import java.util.Set;
import p.co5;
import p.rs1;
import p.ts1;
import p.do5;
import p.zh1;
import p.st1;
import java.lang.StringBuilder;
import java.lang.String;
import p.jl;

public final class j94 implements qg2	// class@001a90 from classes.dex
{
    public final int a;
    public final vt b;

    public void j94(vt p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       as uoas;
       boolean b;
       xt oxt;
       int i = 1;
       int i1 = 0;
       j94 tb = this.b;
       switch (this.a){
           case 0:
             p0 = p0.a;
             do5[] uodo5Array = new do5[i1];
             HashSet hashSet = vv7.p(uodo5Array);
             if (!tb.b.c()) {
                hashSet.add(new zh1());
             }
             as i2 = new as(tb);
             p0.getClass();
             i2.c = new jj5(p0);
             return new xt(i2.b(), co5.B(hashSet));
             break;
           case 1:
             p0 = p0.a;
             tb.getClass();
             uoas = new as(tb);
             p0.getClass();
             uoas.d = new jj5(p0);
             return xt.d(uoas.b());
           case 2:
             p0 = p0.a;
             boolean b1 = (!(b = tb.e.e(Boolean.FALSE).booleanValue()) && p0 != null)? true: false;
             if (tb.k == null) {
                as uoas1 = new as(tb);
                uoas1.h = r45.d(Boolean.valueOf(b1));
                uoas1.k = Boolean.TRUE;
                vt ovt = uoas1.b();
                Object[] objArray = new Object[i];
                vt a = tb.a;
                b1 = (!b && !b1)? new gh1(a): new hh1(a);
                objArray[i1] = b1;
                oxt = new xt(ovt, co5.B(vv7.p(objArray)));
             }else {
                uoas = new as(tb);
                uoas.h = r45.d(Boolean.valueOf(b1));
                oxt = xt.d(uoas.b());
             }
             return oxt;
             break;
           case 3:
             tb.getClass();
             uoas = new as(tb);
             uoas.g = r45.d(Boolean.valueOf(p0.a.e));
             p0 = p0.a;
             uoas.f = r45.d(Boolean.valueOf(p0.a));
             if (p0.a != null || !tb.g.e(Boolean.FALSE).booleanValue()) {
                i = false;
             }
             uoas.h = r45.d(Boolean.valueOf(i));
             return xt.d(uoas.b());
             break;
           case 4:
             p0 = p0.a;
             tb.getClass();
             uoas = new as(tb);
             p0.getClass();
             uoas.e = new jj5(p0);
             return xt.d(uoas.b());
           case 5:
             tb.getClass();
             uoas = new as(tb);
             uoas.i = r45.d(Boolean.valueOf(p0.a));
             return xt.d(uoas.b());
           case 6:
             p0 = p0.a;
             if (p0.equals(tb.i.f())) {
                p0 = xt.e();
             }else {
                uoas = new as(tb);
                uoas.j = new jj5(p0);
                p0 = xt.d(uoas.b());
             }
             return p0;
             break;
           case 7:
             tb.getClass();
             p0 = new as(tb);
             p0.a = Boolean.TRUE;
             return xt.d(p0.b());
           default:
             if (tb.a()) {
                jl.p("Taking too long to load body, "+tb);
             }
             return xt.e();
       }
    }
}

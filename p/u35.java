package p.u35;
import p.qg2;
import p.g;
import java.lang.Object;
import p.k35;
import java.lang.Class;
import p.es;
import p.eu;
import p.xt;
import p.j35;
import p.v35;
import java.lang.String;
import p.p35;
import p.e35;
import java.lang.Long;
import p.na5;
import p.b35;
import java.util.HashSet;
import p.vv7;
import java.util.Set;
import p.co5;
import p.o35;
import p.pd5;
import p.c35;
import p.g35;
import p.h35;
import p.io2;
import p.d35;
import p.v25;

public final class u35 implements qg2	// class@002836 from classes.dex
{
    public final int a;
    public final g b;

    public void u35(g p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       es uoes;
       g c;
       Object[] objArray;
       g c1;
       String str;
       int i = 1;
       e35 obj = null;
       u35 tb = this.b;
       switch (this.a){
           case 0:
             tb.getClass();
             uoes = new es(tb);
             uoes.d = p0.a;
             return xt.d(uoes.b());
           case 1:
             if ((c = tb.c) == null) {
                p0 = xt.e();
             }else if((p0 = pd5.a(c.d, p0.a)) != null){
                objArray = new Object[i];
                objArray[0] = new c35(p0, i);
                p0 = xt.a(vv7.p(objArray));
             }else {
                p0 = xt.e();
             }
             return p0;
             break;
           case 2:
             tb.getClass();
             uoes = new es(tb);
             uoes.d = obj;
             uoes.b = p0.d;
             uoes.c = obj;
             uoes.e = obj;
             uoes.e(0);
             e35 e = p0.e;
             uoes.g = Long.valueOf((0x7530 + e));
             obj = p0.d;
             uoes.h = Long.valueOf((((long)obj.c * 1000) + e));
             uoes.a = new v35(p0.a, p0.b, p0.c);
             objArray = new Object[i];
             objArray[0] = new b35(obj, ((long)obj.c * 1000));
             return new xt(uoes.b(), co5.B(vv7.p(objArray)));
           case 3:
             tb.getClass();
             uoes = new es(tb);
             uoes.e(0);
             uoes.e = obj;
             uoes.c = p0.a;
             return xt.d(uoes.b());
           case 4:
             tb.getClass();
             p0 = new es(tb);
             p0.e(0);
             p0.a = new v35(obj, obj, obj);
             p0.c = obj;
             p0.e = obj;
             return xt.d(p0.b());
           case 5:
             tb.getClass();
             uoes = new es(tb);
             uoes.e(0);
             uoes.e = p0.a;
             return xt.d(uoes.b());
           default:
             p0 = p0.a;
             if (io2.j(tb.w, p0)) {
                p0 = xt.e();
             }else {
                d35[] uod35Array = new d35[0];
                HashSet hashSet = vv7.p(uod35Array);
                if ((c1 = tb.c) != null && (tb.t == null && (str = pd5.a(c1.d, p0)) != null)) {
                   hashSet.add(new v25(str));
                }
                es str1 = new es(tb);
                str1.f = p0;
                p0 = new xt(str1.b(), co5.B(hashSet));
             }
             return p0;
       }
    }
}

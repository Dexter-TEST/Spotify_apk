package p.xc5;
import p.qg2;
import java.lang.Object;
import p.l97;
import p.d97;
import java.util.HashSet;
import p.vv7;
import java.util.Set;
import p.xt;
import p.st3;
import p.jt3;
import p.au3;
import p.kt3;
import p.ws1;
import p.kc5;
import p.oa5;
import p.qb5;
import com.google.common.collect.d;
import p.dl6;
import p.op;
import java.lang.Enum;
import p.pb5;
import p.hb5;
import p.ob5;
import p.nb5;
import java.io.IOException;
import p.jb5;
import p.mc5;
import p.kb5;
import p.hc5;
import p.ra0;
import p.xa5;
import p.sa0;
import p.ec5;
import p.na0;
import java.lang.String;
import p.fc5;
import p.xp;
import p.fb5;
import p.oc5;
import p.lb5;
import java.util.Map;
import p.pc5;
import p.ab5;
import p.f35;
import p.t25;
import p.na5;
import p.l35;
import p.y25;
import p.w25;
import p.i35;
import p.x25;
import p.m35;
import p.z25;
import p.n35;
import p.c35;
import p.ya0;
import p.qa0;
import p.wa0;
import p.oa0;
import io.reactivex.rxjava3.core.Observable;
import p.id5;
import p.ra5;
import p.p35;
import p.jc5;
import p.q35;
import p.ac5;
import p.pa5;
import p.qa5;
import p.j97;
import p.z87;
import p.u65;

public final class xc5 implements qg2	// class@002c4e from classes.dex
{
    public final int a;

    public void xc5(int p0){
       this.a = p0;
       super();
    }
    public final Object apply(Object p0){
       Object[] objArray;
       int i2;
       int i = 2;
       boolean b = false;
       int i1 = 1;
       switch (this.a){
           case 0:
             return Observable.just(new fc5(p0.a, b));
           case 1:
             return Observable.just(new jc5(new p35(p0)), new ac5());
           case 2:
             return id5.a(p0);
           case 3:
             return Observable.empty();
           case 4:
             return Observable.empty();
           case 5:
             return Observable.empty();
           case 6:
             return id5.a(p0);
           case 7:
             return Observable.empty();
           case 8:
             return Observable.just(new fc5(p0.a, b));
           case 9:
             return Observable.just(new jc5(new p35(p0)), new ac5());
           case 10:
             return id5.a(p0);
           case 11:
             p0 = new Object[i1];
             p0[b] = new oa0();
             return xt.a(vv7.p(p0));
           case 12:
             objArray = new Object[i1];
             objArray[b] = new qa0(p0.a);
             return xt.a(vv7.p(objArray));
           case 13:
             objArray = new Object[i1];
             objArray[b] = new c35(p0.a, b);
             return xt.a(vv7.p(objArray));
           case 14:
             p0 = new Object[i1];
             p0[b] = new z25();
             return xt.a(vv7.p(p0));
           case 15:
             p0 = new Object[i];
             p0[b] = new x25();
             p0[i1] = new w25();
             return xt.a(vv7.p(p0));
           case 16:
             p0 = new Object[i];
             p0[b] = new y25();
             p0[i1] = new w25();
             return xt.a(vv7.p(p0));
           case 17:
             objArray = new Object[i1];
             objArray[b] = new t25(p0.a);
             return xt.a(vv7.p(objArray));
           case 18:
             objArray = new Object[i1];
             objArray[b] = new ab5(p0.a, p0.b);
             return xt.a(vv7.p(objArray));
           case 19:
             objArray = new Object[i1];
             objArray[b] = new lb5(p0.b);
             return xt.a(vv7.p(objArray));
           case 20:
             objArray = new Object[i1];
             objArray[b] = new fb5(p0.a.a, p0.b);
             return xt.a(vv7.p(objArray));
           case 21:
             objArray = new Object[i1];
             objArray[b] = new xa5(new na0(p0.a));
             return xt.a(vv7.p(objArray));
           case 22:
             p0 = new Object[i1];
             p0[b] = new xa5(new ra0());
             return xt.a(vv7.p(p0));
           case 23:
             p0 = new Object[i1];
             p0[b] = new kb5();
             return xt.a(vv7.p(p0));
           case 24:
             p0 = p0.a.a;
             dl6 uodl6 = new dl6(new qb5());
             if (p0 instanceof op) {
                if ((i2 = p0.a.ordinal()) != 4) {
                   if (i2 != 6) {
                      if (i2 != 7) {
                         if (i2 == 8) {
                            uodl6 = new dl6(new pb5());
                         }
                      }else {
                         uodl6 = new dl6(new hb5());
                      }
                   }else {
                      uodl6 = new dl6(new ob5());
                   }
                }else {
                   uodl6 = new dl6(new nb5());
                }
             }
             if (p0 instanceof IOException) {
                uodl6 = new dl6(new jb5());
             }
             return xt.a(uodl6);
             break;
           case 25:
             return xt.e();
           case 26:
             p0 = new Object[i1];
             p0[b] = new kt3();
             return xt.a(vv7.p(p0));
           case 27:
             p0 = new Object[i1];
             p0[b] = new jt3();
             return xt.a(vv7.p(p0));
           case 28:
             p0 = new Object[i1];
             p0[b] = new d97();
             return xt.a(vv7.p(p0));
           default:
             objArray = new Object[i1];
             objArray[b] = new z87(p0.a);
             return xt.a(vv7.p(objArray));
       }
    }
}

package p.kl4;
import p.qg2;
import java.lang.Object;
import p.c0;
import p.l66;
import p.s56;
import java.util.HashSet;
import p.vv7;
import java.util.Set;
import p.xt;
import p.k66;
import p.r56;
import java.lang.String;
import p.x66;
import p.z56;
import p.o66;
import p.y56;
import p.b66;
import p.mq5;
import p.p66;
import p.aq6;
import p.m66;
import p.t56;
import p.xm4;
import p.yl4;
import p.um4;
import java.lang.Math;
import p.dn4;
import p.fm4;
import p.fn4;
import p.ul4;
import p.zm4;
import p.sl4;
import p.pm4;
import p.pl4;
import p.wm4;
import p.sm4;
import p.jj5;
import p.r45;
import p.an4;
import p.nm4;
import p.vm4;
import p.km4;
import p.lm4;
import p.cn4;
import p.im4;
import p.jm4;
import p.om4;
import p.tm4;
import p.bn4;
import p.rm4;
import p.mm4;
import p.qa5;
import io.reactivex.rxjava3.core.Observable;

public final class kl4 implements qg2	// class@001c37 from classes.dex
{
    public final int a;

    public void kl4(int p0){
       this.a = p0;
       super();
    }
    public final Object apply(Object p0){
       Object[] objArray;
       c0 a = c0.a;
       switch (this.a){
           case 0:
             return r45.d(p0.a);
           case 1:
             return a;
           case 2:
             return a;
           case 3:
             return a;
           case 4:
             return a;
           case 5:
             return a;
           case 6:
             return a;
           case 7:
             return r45.d(p0.a);
           case 8:
             return a;
           case 9:
             return a;
           case 10:
             return r45.d(p0.a);
           case 11:
             return r45.d(p0.a);
           case 12:
             return r45.d(p0.a);
           case 13:
             return r45.d(p0.a);
           case 14:
             return r45.d(p0.a);
           case 15:
             return a;
           case 16:
             return a;
           case 17:
             p0 = new Object[]{new pl4()};
             return xt.a(vv7.p(p0));
           case 18:
             p0 = new Object[]{new sl4()};
             return xt.a(vv7.p(p0));
           case 19:
             p0 = new Object[]{new ul4()};
             return xt.a(vv7.p(p0));
           case 20:
             p0 = new Object[]{new fm4()};
             return xt.a(vv7.p(p0));
           case 21:
             objArray = new Object[]{new yl4(Math.max((p0.b - 15000), 0))};
             return xt.a(vv7.p(objArray));
           case 22:
             objArray = new Object[]{new yl4(p0.a)};
             return xt.a(vv7.p(objArray));
           case 23:
             p0 = new Object[]{new t56()};
             return xt.a(vv7.p(p0));
           case 24:
             try{
                p0 = new Object[]{new y56(new aq6(p0.a).toString())};
                p0 = xt.a(vv7.p(p0));
             }catch(p.cq6 e0){
                p0 = xt.e();
             }
             return p0;
             break;
           case 25:
             o66 b = p0.b;
             p0 = p0.a;
             if (b == null) {
                objArray = new Object[]{new y56(p0)};
                p0 = xt.a(vv7.p(objArray));
             }else {
                Object[] objArray1 = new Object[]{new y56(p0),new b66(b)};
                p0 = xt.a(vv7.p(objArray1));
             }
             return p0;
             break;
           case 26:
             objArray = new Object[]{new z56(p0.a)};
             return xt.a(vv7.p(objArray));
           case 27:
             objArray = new Object[]{new r56(p0.a)};
             return xt.a(vv7.p(objArray));
           case 28:
             p0 = new Object[]{new s56()};
             return xt.a(vv7.p(p0));
           default:
             return Observable.empty();
       }
    }
}

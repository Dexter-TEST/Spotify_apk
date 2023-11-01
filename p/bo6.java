package p.bo6;
import p.ng2;
import p.gi3;
import p.vw0;
import p.xw0;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.ww0;
import p.il1;
import p.fv1;
import p.eu0;
import p.oj0;
import p.tp2;
import java.lang.Boolean;
import java.lang.StringBuilder;
import p.tn6;
import p.rn6;
import p.co6;
import com.google.common.collect.g;
import java.util.Set;
import p.q37;

public final class bo6 extends gi3 implements ng2	// class@001106 from classes.dex
{
    public final int a;
    public static final bo6 A;
    public static final bo6 b;
    public static final bo6 c;
    public static final bo6 t;
    public static final bo6 v;
    public static final bo6 w;
    public static final bo6 x;
    public static final bo6 y;
    public static final bo6 z;

    static {
       bo6.b = new bo6(0);
       bo6.c = new bo6(1);
       bo6.t = new bo6(2);
       bo6.v = new bo6(3);
       bo6.w = new bo6(4);
       bo6.x = new bo6(5);
       bo6.y = new bo6(6);
       bo6.z = new bo6(7);
       bo6.A = new bo6(8);
    }
    public void bo6(int p0){
       this.a = p0;
       super(2);
    }
    public final xw0 a(vw0 p0,xw0 p1){
       eu0 uoeu0;
       oj0 ooj0;
       oj0 ooj01;
       switch (this.a){
           case 3:
             break;
           default:
             return p1.T(p0);
       }
       co5.o(p1, "acc");
       co5.o(p0, "element");
       p1 = p1.y(p0.getKey());
       il1 a = il1.a;
       if (p1 != a) {
          fv1 t = fv1.t;
          if ((uoeu0 = p1.f(t)) == null) {
             ooj0 = new oj0(p0, p1);
          }else if((p1 = p1.y(t)) == a){
             ooj01 = new oj0(uoeu0, p0);
          }else {
             ooj0 = new oj0(uoeu0, new oj0(p0, p1));
          }
          ooj01 = ooj0;
       }
       return p0;
    }
    public final Object b(Object p0,Object p1){
       switch (this.a){
           case 0:
             co5.o(p0, "prefs");
             co5.o(p1, "k");
             return p0.a(p1);
           case 1:
             co5.o(p0, "prefs");
             co5.o(p1, "k");
             p0.j(p1);
             return p0.c(p1, null);
           case 2:
             co5.o(p0, "acc");
             co5.o(p1, "element");
             int i = (!p0.length())? 1: 0;
             p0 = (i)? p1.toString(): p0+", "+p1;
             return p0;
             break;
           case 3:
             return this.a(p1, p0);
           case 4:
             return this.a(p1, p0);
           case 5:
             return Boolean.valueOf(p0.booleanValue());
           case 6:
             return p0;
           case 7:
             tp2.v(p0);
             return null;
           default:
             return p0;
       }
    }
}

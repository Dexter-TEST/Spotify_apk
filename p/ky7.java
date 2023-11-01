package p.ky7;
import p.wy7;
import p.xy7;
import java.lang.Object;
import p.uy7;
import p.ty7;
import java.lang.String;
import java.io.File;
import p.dx7;
import p.dy7;
import java.lang.Integer;

public final class ky7 implements wy7	// class@001cab from classes.dex
{
    public final int a;
    public final xy7 b;
    public final int c;

    public void ky7(xy7 p0,int p1){
       this.a = 0;
       super();
       this.b = p0;
       this.c = p1;
    }
    public void ky7(xy7 p0,int p1,int p2){
       this.a = 1;
       super();
       this.b = p0;
       this.c = p1;
    }
    public final Object c(){
       xy7 a;
       ty7 d1;
       Object[] obj = null;
       int i = 5;
       ky7 tc = this.c;
       ky7 tb = this.b;
       switch (this.a){
           case 0:
             break;
           default:
             tb.b(tc).c.d = i;
             return obj;
       }
       uy7 ouy7 = tb.b(tc);
       uy7 c = ouy7.c;
       ty7 d = c.d;
       int i1 = 1;
       d = (d != i && (d != 6 && d != 4))? 0: 1;
       if (d) {
          a = tb.a;
          ouy7 = ouy7.b;
          d = c.b;
          ty7 a1 = c.a;
          if (a.c(ouy7, d, a1).exists()) {
             dx7.g(a.c(ouy7, d, a1));
          }
          if ((d1 = c.d) == i || (d1 == 6 && a.j(ouy7, d, a1).exists())) {
             dx7.g(a.j(ouy7, d, a1));
          }
          return obj;
       }else {
          obj = new Object[i1];
          obj[0] = Integer.valueOf(tc);
          throw new dy7(String.format("Could not safely delete session %d because it is not in a terminal state.", obj), tc);
       }
    }
}

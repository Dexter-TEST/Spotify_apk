package p.hn;
import p.do5;
import p.in;
import java.util.List;
import java.lang.Object;
import p.kn;
import p.xe0;
import p.ry7;
import p.a07;
import p.j46;
import p.co5;
import p.he5;
import p.je5;
import p.b86;
import java.lang.AssertionError;
import p.de5;
import java.lang.String;
import p.ee5;
import p.fe5;
import p.ge5;
import p.cd2;
import java.lang.Class;

public final class hn extends do5	// class@00188b from classes.dex
{
    public final in F;

    public void hn(in p0){
       this.F = p0;
       super();
    }
    public final int A(){
       return this.F.a.size();
    }
    public final boolean b(int p0,int p1){
       boolean b;
       hn tF = this.F;
       Object obj = tF.a.get(p0);
       Object obj1 = tF.b.get(p1);
       if (obj != null && obj1 != null) {
          switch (tF.v.b.d.M){
              case 0:
                b = co5.c(obj, obj1);
                break;
              case 1:
                b = co5.c(obj, obj1);
                break;
              case 2:
                b = co5.c(obj, obj1);
                break;
              default:
                b = co5.c(obj, obj1);
          }
          return b;
       }else if(obj == null && obj1 == null){
          return true;
       }else {
          throw new AssertionError();
       }
    }
    public final boolean c(int p0,int p1){
       boolean b1;
       hn tF = this.F;
       Object obj = tF.a.get(p0);
       Object obj1 = tF.b.get(p1);
       boolean b = true;
       if (obj != null && obj1 != null) {
          switch (tF.v.b.d.M){
              case 0:
                b1 = co5.c(obj.b, obj1.b);
                break;
              case 1:
                if (obj instanceof de5) {
                   if (obj1 instanceof de5) {
                      b = co5.c(obj.b(), obj1.b());
                   }else {
                   label_005b :
                      b = 0;
                   }
                }else if(obj instanceof ee5){
                   if (obj1 instanceof ee5) {
                      b = co5.c(obj, obj1);
                   }else {
                      goto label_005b ;
                   }
                }else if(obj instanceof fe5){
                   b1 = 1;
                }else {
                   obj = obj instanceof ge5;
                }
                if (!b1) {
                   throw new cd2(10);
                }
                b1 = b;
                break;
              case 2:
                b1 = co5.c(obj.b, obj1.b);
                break;
              default:
                b1 = co5.c(obj.c, obj1.c);
          }
          return b1;
       }else if(obj == null && obj1 == null){
          b = false;
       }
       return b;
    }
    public final void u(int p0,int p1){
       hn tF = this.F;
       Object obj = tF.b.get(p1);
       if (tF.a.get(p0) == null || obj == null) {
          throw new AssertionError();
       }
       tF.v.b.d.getClass();
       return;
    }
    public final int z(){
       return this.F.b.size();
    }
}

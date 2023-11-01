package p.is6;
import p.js6;
import java.lang.Class;
import p.tf3;
import p.he3;
import java.lang.Object;
import java.lang.String;
import p.gb6;
import p.mg3;
import p.vf3;
import p.ka7;
import p.qg3;
import p.ds7;

public abstract class is6 extends js6	// class@0019f8 from classes.dex
{
    public final int c;

    public void is6(int p0,Class p1){
       this.c = p0;
       if (p0 != 1) {
          super(p1);
          return;
       }else {
          super(p1, 0);
          return;
       }
    }
    public void is6(Class p0){
       this.c = 0;
       super(p0);
    }
    public void acceptJsonFormatVisitor(tf3 p0,he3 p1){
       switch (this.c){
           case 0:
           default:
             p0.getClass();
             return;
       }
       p0.getClass();
       return;
    }
    public abstract String d(Object p0);
    public boolean isEmpty(gb6 p0,Object p1){
       switch (this.c){
           case 1:
           default:
             return super.isEmpty(p0, p1);
       }
       return this.d(p1).isEmpty();
    }
    public void serialize(Object p0,vf3 p1,gb6 p2){
       p1.x0(this.d(p0));
    }
    public void serializeWithType(Object p0,vf3 p1,gb6 p2,ka7 p3){
       switch (this.c){
           case 0:
           default:
             this.serialize(p0, p1, p2);
             p3.d(p1, p3.c(p1, p3.b(qg3.D, p0)));
             return;
       }
       this.serialize(p0, p1, p2);
       p3.d(p1, p3.c(p1, p3.b(qg3.D, p0)));
       return;
    }
}

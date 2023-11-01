package p.sp2;
import p.qp2;
import p.wq0;
import p.bp7;
import java.util.ArrayList;
import java.lang.Object;
import p.w51;

public abstract class sp2 extends wq0 implements qp2	// class@002672 from classes.dex
{
    public wq0[] q0;
    public int r0;

    public void sp2(){
       super();
       wq0[] owq0Array = new wq0[4];
       this.q0 = owq0Array;
       this.r0 = 0;
    }
    public final void R(int p0,bp7 p1,ArrayList p2){
       int i = 0;
       int i1 = 0;
       while (i1 < this.r0) {
          object oobject = this.q0[i1];
          bp7 a = p1.a;
          if (!a.contains(oobject)) {
             a.add(oobject);
          }
          i1 = i1 + 1;
       }
       for (; i < this.r0; i = i + 1) {
          w51.r(this.q0[i], p0, p2, p1);
       }
       return;
    }
    public void a(){
    }
}

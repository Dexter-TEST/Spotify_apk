package p.qc2;
import p.fv5;
import p.u54;
import java.lang.String;
import p.gg1;
import java.util.ArrayList;
import java.lang.Object;
import p.co5;
import java.util.List;
import p.we7;
import p.f70;
import p.e70;

public final class qc2 extends fv5	// class@002373 from classes.dex
{
    public final List a;
    public final List b;
    public static final u54 c;

    static {
       qc2.c = gg1.C("application/x-www-form-urlencoded");
    }
    public void qc2(ArrayList p0,ArrayList p1){
       co5.o(p0, "encodedNames");
       co5.o(p1, "encodedValues");
       super();
       this.a = we7.x(p0);
       this.b = we7.x(p1);
    }
    public final long a(){
       return this.e(null, true);
    }
    public final u54 b(){
       return qc2.c;
    }
    public final void d(f70 p0){
       this.e(p0, false);
    }
    public final long e(f70 p0,boolean p1){
       e70 uoe70;
       e70 b;
       if (p1) {
          uoe70 = new e70();
       }else {
          co5.i(p0);
          uoe70 = p0.c();
       }
       qc2 ta = this.a;
       int i = ta.size();
       for (int i1 = 0; i1 < i; i1 = i2) {
          int i2 = i1 + 1;
          if (i1 > 0) {
             uoe70.v0(38);
          }
          uoe70.B0(ta.get(i1));
          uoe70.v0(61);
          uoe70.B0(this.b.get(i1));
       }
       if (p1) {
          b = uoe70.b;
          uoe70.f();
       }else {
          b = 0;
       }
       return b;
    }
}

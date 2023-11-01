package p.zw0;
import p.eu0;
import p.j0;
import p.yw0;
import p.fv1;
import p.ww0;
import p.vw0;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.k0;
import p.zf2;
import p.xw0;
import java.lang.Runnable;
import p.xb7;
import p.xe7;
import p.ik3;
import java.lang.StringBuilder;
import java.lang.Class;
import p.w51;
import p.il1;

public abstract class zw0 extends j0 implements eu0	// class@002f78 from classes.dex
{
    public static final yw0 b;

    static {
       zw0.b = new yw0(0);
    }
    public void zw0(){
       super(fv1.t);
    }
    public final vw0 f(ww0 p0){
       vw0 ovw0;
       String str = "key";
       co5.o(p0, str);
       if (p0 instanceof k0) {
          j0 ta = this.a;
          co5.o(ta, str);
          str = (ta != p0 && p0.b != ta)? 0: 1;
          if (str) {
             ovw0 = p0.a.invoke(this);
             if (ovw0 instanceof vw0) {
             label_0030 :
                return ovw0;
             }
          }
       }else if(fv1.t == p0){
          ovw0 = this;
          goto label_0030 ;
       }
       ovw0 = null;
       goto label_0030 ;
    }
    public abstract void g0(xw0 p0,Runnable p1);
    public boolean h0(){
       return (this instanceof xb7 ^ 0x01);
    }
    public zw0 i0(int p0){
       xe7.i(p0);
       return new ik3(this, p0);
    }
    public String toString(){
       return this.getClass().getSimpleName()+'@'+w51.x(this);
    }
    public final xw0 y(ww0 p0){
       String str = "key";
       co5.o(p0, str);
       il1 a = il1.a;
       if (p0 instanceof k0) {
          j0 ta = this.a;
          co5.o(ta, str);
          str = (ta != p0 && p0.b != ta)? 0: 1;
          if (!str || p0.a.invoke(this) == null) {
             a = this;
          }
       }else if(fv1.t == p0){
       }
       return a;
    }
}

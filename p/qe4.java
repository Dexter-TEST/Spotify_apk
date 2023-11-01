package p.qe4;
import p.gh3;
import p.re4;
import java.lang.Class;
import java.lang.String;
import p.aa0;
import java.lang.Object;
import p.zg3;
import p.ns5;
import p.lm5;
import p.hh3;
import p.xh3;
import java.lang.UnsupportedOperationException;

public class qe4 extends re4 implements gh3	// class@002386 from classes.dex
{

    public void qe4(Class p0,String p1,String p2){
       super(aa0.a, p0, p1, p2);
    }
    public final zg3 a(){
       ns5.a.getClass();
       return this;
    }
    public final void e(){
       zg3 ozg3;
       if (this.x != null) {
          throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties");
       }
       if ((ozg3 = this.d()) == this) {
          throw new xh3();
       }
       ozg3.e();
       return;
    }
    public Object get(Object p0){
       this.e();
       throw null;
    }
    public final Object invoke(Object p0){
       return this.get(p0);
    }
}

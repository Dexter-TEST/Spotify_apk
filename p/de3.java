package p.de3;
import p.su0;
import p.u54;
import java.lang.String;
import p.gg1;
import p.xo4;
import java.lang.Object;
import java.lang.Class;
import p.t70;
import java.io.IOException;
import p.yf3;

public final class de3 implements su0	// class@0001b5 from classes2.dex
{
    public final xo4 a;
    public static final u54 b;

    static {
       de3.b = gg1.C("application/json; charset=UTF-8");
    }
    public void de3(xo4 p0){
       super();
       this.a = p0;
    }
    public final Object a(Object p0){
       p0 = this.a;
       try{
          p0.getClass();
          throw null;
       }catch(p.hg3 e1){
          throw e1;
       }catch(java.io.IOException e1){
          throw yf3.d(e1);
       }
    }
}

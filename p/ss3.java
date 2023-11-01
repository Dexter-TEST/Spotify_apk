package p.ss3;
import p.kd7;
import p.qb4;
import java.lang.Object;
import java.lang.Class;
import p.xt;
import java.lang.Exception;
import java.lang.RuntimeException;
import java.lang.Throwable;

public final class ss3 implements kd7	// class@00268d from classes.dex
{
    public final kd7 a;
    public final qb4 b;

    public void ss3(kd7 p0,qb4 p1){
       super();
       p0.getClass();
       this.a = p0;
       p1.getClass();
       this.b = p1;
    }
    public final xt e(Object p0,Object p1){
       ss3 tb = this.b;
       try{
          tb.a(p0, p1);
          xt oxt = this.a.e(p0, p1);
          tb.f(p0, p1, oxt);
          return oxt;
       }catch(java.lang.Exception e1){
          tb.c(p0, p1, e1);
          if (e1 instanceof RuntimeException) {
             throw e1;
          }
          throw new RuntimeException(e1);
       }
    }
}

package p.os3;
import p.j93;
import p.qb4;
import java.lang.Object;
import java.lang.Class;
import p.jt;
import java.lang.Exception;
import java.lang.RuntimeException;
import java.lang.Throwable;

public final class os3 implements j93	// class@00217e from classes.dex
{
    public final j93 a;
    public final qb4 b;

    public void os3(j93 p0,qb4 p1){
       super();
       p0.getClass();
       this.a = p0;
       p1.getClass();
       this.b = p1;
    }
    public final jt c(Object p0){
       os3 tb = this.b;
       try{
          tb.d(p0);
          jt ojt = this.a.c(p0);
          tb.b(p0, ojt);
          return ojt;
       }catch(java.lang.Exception e1){
          tb.e(p0, e1);
          if (e1 instanceof RuntimeException) {
             throw e1;
          }
          throw new RuntimeException(e1);
       }
    }
}

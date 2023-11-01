package p.r83;
import java.lang.reflect.InvocationHandler;
import java.lang.Object;
import java.lang.reflect.Method;
import java.lang.String;
import p.co5;
import p.t83;
import java.util.concurrent.atomic.AtomicBoolean;
import p.av6;

public final class r83 implements InvocationHandler	// class@002497 from classes.dex
{
    public final int a;

    public void r83(int p0){
       this.a = p0;
       super();
    }
    public final Object invoke(Object p0,Method p1,Object[] p2){
       switch (this.a){
           case 0:
             break;
           default:
             co5.o(p0, "proxy");
             co5.o(p1, "m");
             return null;
       }
       co5.o(p0, "proxy");
       co5.o(p1, "m");
       if (co5.c(p1.getName(), "onBillingSetupFinished")) {
          t83.v.set(true);
       }else {
          p0 = p1.getName();
          co5.l(p0, "m.name");
          if (av6.g0(p0, "onBillingServiceDisconnected", false)) {
             t83.v.set(false);
          }
       }
       return null;
    }
}

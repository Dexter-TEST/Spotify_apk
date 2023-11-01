package p.h16;
import java.lang.Object;
import p.xy5;
import java.lang.String;
import java.util.concurrent.Callable;
import p.v72;
import p.co5;
import p.s36;
import p.vw1;
import java.util.concurrent.Executor;
import p.n34;
import p.f16;
import io.reactivex.rxjava3.core.Flowable;
import p.b72;
import io.reactivex.rxjava3.core.FlowableOnSubscribe;
import io.reactivex.rxjava3.core.Scheduler;
import p.la2;
import p.u82;
import p.y82;
import p.e16;
import p.ap5;
import p.yf2;

public abstract class h16	// class@0017c1 from classes.dex
{
    public static final Object a;

    static {
       h16.a = new Object();
    }
    public static v72 a(xy5 p0,boolean p1,String[] p2,Callable p3){
       xy5 c;
       v72 "maxConcurrency";
       v72 ov72 = null;
       if (p1) {
          if ((c = p0.c) == null) {
             co5.N("internalTransactionExecutor");
             throw ov72;
          }
       }else if((c = p0.b) != null){
          co5.N("internalQueryExecutor");
          throw ov72;
       }
       vw1 ovw1 = new vw1(c, false, false);
       ap5.E(Integer.MAX_VALUE, "maxConcurrency");
       "maxConcurrency" = new v72(new b72(new f16(p0, p2)).v(ovw1).y(ovw1).q(ovw1), new e16(false, new n34(p3)), false, Integer.MAX_VALUE, 0);
       return "maxConcurrency";
    }
}

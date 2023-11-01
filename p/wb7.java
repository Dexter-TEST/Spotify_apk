package p.wb7;
import p.eq;
import p.qp;
import java.lang.Object;
import p.mz5;
import p.cx5;
import p.bv5;
import java.lang.String;
import p.mp2;
import p.aw6;
import io.reactivex.rxjava3.core.Completable;
import java.lang.Boolean;
import p.pl0;
import java.util.concurrent.TimeUnit;
import p.s36;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.SingleSource;
import p.r45;
import p.xe7;

public final class wb7 implements eq	// class@002b06 from classes.dex
{
    public final aw6 a;
    public final aw6 b;

    public void wb7(qp p0,qp p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final bv5 d(mz5 p0,cx5 p1){
       Boolean fALSE;
       int i = 1;
       cx5 uocx5 = p1;
       while (uocx5.A != null) {
          i++;
       }
       if (i >= 3) {
          return null;
       }
       if (p1.a.c.a("Authorization") != null && (fALSE = Boolean.FALSE)) {
          r45 or45 = this.b.get();
          if (or45.c()) {
             return xe7.a(p1.a, or45.b());
          }
       }
       return null;
    }
}

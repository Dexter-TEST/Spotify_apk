package p.p05;
import p.pb3;
import p.u71;
import p.ob3;
import p.cx5;
import p.yp5;
import p.bv5;
import java.lang.String;
import p.mp2;
import java.lang.Boolean;
import p.c90;
import p.zu5;
import p.ax5;
import p.sm2;
import java.lang.Throwable;
import java.lang.Object;
import com.spotify.base.java.logging.Logger;

public final class p05 extends u71 implements pb3	// class@0021c7 from classes.dex
{
    public boolean b;

    public void p05(){
       super();
    }
    public final cx5 intercept(ob3 p0){
       yp5 e = p0.e;
       if (Boolean.valueOf(e.c.a("X-Allow-Offline-Mode")).booleanValue() || (this.b == null || e.a().j != null)) {
          return p0.b(e);
       }
       zu5 ozu5 = new zu5(e);
       ozu5.c(c90.o);
       cx5 uocx5 = p0.b(ozu5.b());
       if (uocx5.t == 504) {
          ax5 uoax5 = new ax5(uocx5);
          uoax5.f.b("X-Rejected-Offline-Mode", "true");
          uocx5 = uoax5.a();
       }
       return uocx5;
    }
    public final void onComplete(){
    }
    public final void onError(Throwable p0){
       Object[] objArray = new Object[0];
       Logger.c(p0, "Error observing offline mode", objArray);
    }
    public final void onNext(Object p0){
       this.b = p0.booleanValue();
    }
}

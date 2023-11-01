package p.zl;
import p.b90;
import p.vi7;
import java.lang.String;
import java.io.Serializable;
import java.lang.Object;
import p.dt5;
import io.reactivex.rxjava3.core.Single;
import p.cm;
import java.lang.Class;
import java.util.Map;
import p.zp3;
import p.wm;
import p.c96;
import io.reactivex.rxjava3.core.SingleTransformer;

public final class zl implements b90	// class@002f21 from classes.dex
{
    public final int a;
    public final vi7 b;
    public final String c;
    public final Object t;

    public void zl(vi7 p0,String p1,Serializable p2,int p3){
       this.a = p3;
       this.b = p0;
       this.c = p1;
       this.t = p2;
       super();
    }
    public final Single a(dt5 p0){
       zl tc = this.c;
       zl tt = this.t;
       zl tb = this.b;
       switch (this.a){
           case 0:
             tb.getClass();
             return tb.w.c(cm.e(tc), tt, p0);
           case 1:
             tb.getClass();
             return tb.w.b(cm.e(tc), tt, p0);
           case 2:
             tb.getClass();
             return tb.w.f(cm.e(tc), tt, p0);
           default:
             return tb.v.b(tc, tt, p0).compose(tb.y);
       }
    }
}

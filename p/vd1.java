package p.vd1;
import p.yf2;
import p.zd1;
import java.lang.Object;
import p.ug1;
import java.lang.Class;
import java.lang.String;
import p.aq6;
import p.td7;
import p.yp6;
import p.ew0;
import p.jk0;
import p.cw0;
import io.reactivex.rxjava3.core.Completable;
import p.wn3;
import java.lang.IllegalArgumentException;
import java.lang.Exception;
import p.ok0;
import p.cv2;
import p.so3;
import io.reactivex.rxjava3.core.Single;
import p.lh1;
import p.p54;

public final class vd1 implements yf2	// class@0029cc from classes.dex
{
    public final int a;
    public final zd1 b;

    public void vd1(zd1 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       aq6 uoaq6;
       vd1 tb = this.b;
       switch (this.a){
           case 0:
           case 1:
             tb.getClass();
             p0 = ((uoaq6 = td7.d(p0.F)) != null && uoaq6.b == yp6.m0)? tb.v.a.y(uoaq6).c(tb.t.d(uoaq6, false)): Completable.h(new IllegalArgumentException(p0.F));
             return p0;
             break;
           default:
             tb.getClass();
             uoaq6 = td7.d(p0.F);
             p0 = p0.F;
             p0 = (uoaq6 != null && uoaq6.b == yp6.m0)? tb.y.k(p0): Completable.h(new IllegalArgumentException(p0));
             return p0;
       }
       return tb.x.a(p0).ignoreElement();
    }
}

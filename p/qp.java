package p.qp;
import p.aw6;
import p.vp;
import java.lang.Object;
import io.reactivex.rxjava3.core.Completable;
import p.bt3;
import p.r45;
import p.rp;
import p.jg2;

public final class qp implements aw6	// class@0023f0 from classes.dex
{
    public final int a;
    public final vp b;

    public void qp(vp p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object get(){
       int i = 0;
       qp tb = this.b;
       switch (this.a){
           case 0:
             return tb.c.b().g(new rp(i));
           case 1:
             return tb.b();
           default:
             return tb.c.b().g(new rp(i));
       }
    }
}

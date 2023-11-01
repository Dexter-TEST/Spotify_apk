package p.u20;
import p.u71;
import java.lang.Object;
import p.ak4;
import java.lang.Throwable;
import p.yj4;

public final class u20 extends u71	// class@002828 from classes.dex
{
    public Object b;

    public void u20(Object p0){
       super();
       this.b = p0;
    }
    public final void onComplete(){
       this.b = ak4.a;
    }
    public final void onError(Throwable p0){
       this.b = new yj4(p0);
    }
    public final void onNext(Object p0){
       this.b = p0;
    }
}

package p.vt0;
import p.vi7;
import p.o46;
import p.ll1;
import java.util.List;
import p.m26;
import p.kf6;
import p.x12;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.ne4;
import p.fd1;
import p.sa6;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.rxjava3.disposables.Disposable;
import p.cd1;

public final class vt0 extends vi7	// class@002a5c from classes.dex
{
    public final m26 t;
    public final kf6 v;
    public final x12 w;
    public final ne4 x;
    public final ne4 y;
    public final fd1 z;
    public static final o46 A;

    static {
       vt0.A = new o46(ll1.a, true, false);
    }
    public void vt0(m26 p0,kf6 p1,x12 p2){
       co5.o(p0, "savedStateHandle");
       co5.o(p1, "setQuickPlayConfiguration");
       co5.o(p2, "configurationProvider");
       super();
       this.t = p0;
       this.v = p1;
       this.w = p2;
       ne4 one4 = new ne4(vt0.A);
       this.x = one4;
       this.y = one4;
       this.z = new fd1();
    }
    public final void b(){
       cd1.d(this.z.a.a, null);
    }
}

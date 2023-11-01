package p.q06;
import io.reactivex.rxjava3.core.ObservableOnSubscribe;
import p.pb4;
import io.reactivex.rxjava3.core.Observable;
import java.lang.Object;
import io.reactivex.rxjava3.core.ObservableEmitter;
import p.zl7;
import p.tb0;
import p.r06;
import p.sb4;
import p.xo0;

public final class q06 implements ObservableOnSubscribe	// class@00230a from classes.dex
{
    public final pb4 a;
    public final Observable b;

    public void q06(pb4 p0,Observable p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void subscribe(ObservableEmitter p0){
       q06 ta = this.a;
       p0.setCancellable(new zl7(1, ta));
       ta.a(new r06(this.b, p0));
       ta.f();
    }
}

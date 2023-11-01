package p.f16;
import io.reactivex.rxjava3.core.FlowableOnSubscribe;
import p.xy5;
import java.lang.String;
import java.lang.Object;
import io.reactivex.rxjava3.core.FlowableEmitter;
import p.xd4;
import p.v62;
import p.tc3;
import p.vc3;
import p.g16;
import p.m5;
import java.lang.Class;
import java.util.concurrent.atomic.AtomicReference;
import io.reactivex.rxjava3.disposables.Disposable;
import p.cd1;
import p.h16;
import io.reactivex.rxjava3.core.Emitter;

public final class f16 implements FlowableOnSubscribe	// class@00153d from classes.dex
{
    public final String[] a;
    public final xy5 b;

    public void f16(xy5 p0,String[] p1){
       super();
       this.a = p1;
       this.b = p0;
    }
    public final void subscribe(FlowableEmitter p0){
       xd4 oxd4 = new xd4(this.a, p0);
       if (!p0.d()) {
          f16 tb = this.b;
          tb.e.a(oxd4);
          v62 b = p0.b;
          b.getClass();
          cd1.d(b, new m5(0, new g16(tb, 0, oxd4)));
       }
       if (!p0.d()) {
          p0.onNext(h16.a);
       }
       return;
    }
}

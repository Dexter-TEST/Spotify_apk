package p.yc3;
import p.oe3;
import java.lang.Class;
import java.lang.String;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p.zf2;
import java.lang.Object;
import java.lang.Throwable;
import p.jc7;

public final class yc3 extends oe3	// class@002d8d from classes.dex
{
    private int _invoked;
    public final zf2 v;
    public static final AtomicIntegerFieldUpdater w;

    static {
       yc3.w = AtomicIntegerFieldUpdater.newUpdater(yc3.class, "_invoked");
    }
    public void yc3(zf2 p0){
       super();
       this.v = p0;
       this._invoked = 0;
    }
    public final Object invoke(Object p0){
       this.l(p0);
       return jc7.a;
    }
    public final void l(Throwable p0){
       if (yc3.w.compareAndSet(this, 0, 1)) {
          this.v.invoke(p0);
       }
       return;
    }
}

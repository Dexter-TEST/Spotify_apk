package p.xn5;
import p.ap0;
import p.ib4;
import java.lang.Object;
import p.in7;
import java.util.concurrent.atomic.AtomicReference;

public final class xn5 implements ap0	// class@002cb1 from classes.dex
{
    public final in7 a;
    public final AtomicReference b;
    public static final ib4 c;

    static {
       xn5.c = new ib4(1);
    }
    public void xn5(){
       super();
       in7 oin7 = new in7(this, 0);
       this.a = oin7;
       this.b = new AtomicReference(oin7);
    }
    public final void accept(Object p0){
       this.b.get().accept(p0);
    }
    public final void dispose(){
       this.b.getAndSet(xn5.c).dispose();
    }
}

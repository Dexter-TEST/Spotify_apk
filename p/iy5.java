package p.iy5;
import p.bi5;
import java.util.concurrent.atomic.AtomicInteger;
import p.i70;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.Class;

public final class iy5 implements bi5	// class@001a2c from classes.dex
{
    public final AtomicInteger a;
    public final i70 b;

    public void iy5(AtomicInteger p0,i70 p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final boolean test(Object p0){
       this.b.getClass();
       boolean b = (this.a.getAndIncrement() <= 3)? true: false;
       return b;
    }
}

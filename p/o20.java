package p.o20;
import p.ir0;
import p.b5;
import java.util.concurrent.CountDownLatch;
import java.lang.Object;
import java.lang.Throwable;

public final class o20 extends CountDownLatch implements ir0, b5	// class@002094 from classes.dex
{
    public Throwable a;

    public void o20(){
       super(1);
    }
    public final void accept(Object p0){
       this.a = p0;
       this.countDown();
    }
    public final void run(){
       this.countDown();
    }
}

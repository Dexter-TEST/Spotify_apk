package p.xk0;
import java.util.concurrent.CompletableFuture;
import p.e15;
import p.s90;

public final class xk0 extends CompletableFuture	// class@0003bf from classes2.dex
{
    public final s90 a;

    public void xk0(e15 p0){
       super();
       this.a = p0;
    }
    public final boolean cancel(boolean p0){
       if (p0) {
          this.a.cancel();
       }
       return super.cancel(p0);
    }
}

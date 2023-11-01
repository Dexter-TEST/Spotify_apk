package p.c82;
import java.util.function.BiConsumer;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.Object;
import java.lang.Throwable;
import p.k11;

public final class c82 extends AtomicReference implements BiConsumer	// class@0011b6 from classes.dex
{
    public final int a;

    public void c82(int p0){
       this.a = p0;
       super();
    }
    public final void a(Object p0,Throwable p1){
       BiConsumer uBiConsumer;
       switch (this.a){
           case 0:
             if ((uBiConsumer = this.get()) != null) {
                k11.y(uBiConsumer, p0, p1);
             }
             break;
           default:
             if ((uBiConsumer = this.get()) != null) {
                k11.y(uBiConsumer, p0, p1);
             }
             return;
       }
       return;
    }
    public final void accept(Object p0,Object p1){
       switch (this.a){
           case 0:
           default:
             this.a(p0, p1);
             return;
       }
       this.a(p0, p1);
       return;
    }
}

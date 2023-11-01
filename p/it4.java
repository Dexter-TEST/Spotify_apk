package p.it4;
import java.util.function.BiConsumer;
import p.w81;
import io.reactivex.rxjava3.core.Observer;
import p.c82;
import java.lang.Object;
import java.lang.Throwable;
import java.lang.NullPointerException;
import java.lang.String;
import java.util.concurrent.atomic.AtomicReference;

public final class it4 extends w81 implements BiConsumer	// class@0019ff from classes.dex
{
    public final c82 c;

    public void it4(Observer p0,c82 p1){
       super(p0);
       this.c = p1;
    }
    public final void accept(Object p0,Object p1){
       w81 ta = this.a;
       if (p1 != null) {
          ta.onError(p1);
       }else if(p0 != null){
          this.a(p0);
       }else {
          ta.onError(new NullPointerException("The CompletionStage terminated with null."));
       }
       return;
    }
    public void dispose(){
       super.dispose();
       this.c.set(null);
    }
}

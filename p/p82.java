package p.p82;
import p.c36;
import io.reactivex.rxjava3.core.Flowable;
import java.lang.Object;
import p.iv6;
import p.b36;
import p.kv6;

public final class p82 extends Flowable implements c36	// class@00220e from classes.dex
{
    public final Object b;

    public void p82(Object p0){
       super();
       this.b = p0;
    }
    public final Object get(){
       return this.b;
    }
    public final void u(iv6 p0){
       p0.onSubscribe(new b36(this.b, p0));
    }
}

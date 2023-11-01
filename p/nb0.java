package p.nb0;
import p.mb0;
import p.fa6;
import java.lang.Throwable;
import java.lang.Class;
import java.lang.Object;
import p.ea6;
import java.util.concurrent.atomic.AtomicReferenceArray;
import p.v96;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import p.yn0;
import p.jc7;
import java.lang.String;
import java.lang.StringBuilder;
import p.tp2;

public final class nb0 extends mb0	// class@001fa1 from classes.dex
{
    public final fa6 a;
    public final int b;

    public void nb0(fa6 p0,int p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void a(Throwable p0){
       nb0 ta = this.a;
       ta.getClass();
       ta.e.set(this.b, ea6.e);
       if (v96.d.incrementAndGet(ta) == ea6.f && !ta.c()) {
          ta.d();
       }
       return;
    }
    public final Object invoke(Object p0){
       this.a(p0);
       return jc7.a;
    }
    public final String toString(){
       return tp2.n("CancelSemaphoreAcquisitionHandler["+this.a+", ", this.b, ']');
    }
}

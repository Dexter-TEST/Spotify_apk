package p.r20;
import java.lang.Iterable;
import io.reactivex.rxjava3.core.ObservableSource;
import java.lang.Object;
import java.util.Iterator;
import p.q20;
import io.reactivex.rxjava3.core.Observer;

public final class r20 implements Iterable	// class@00245e from classes.dex
{
    public final ObservableSource a;
    public final int b;

    public void r20(ObservableSource p0,int p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final Iterator iterator(){
       q20 oq20 = new q20(this.b);
       this.a.subscribe(oq20);
       return oq20;
    }
}

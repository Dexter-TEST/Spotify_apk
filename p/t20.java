package p.t20;
import java.lang.Iterable;
import java.lang.Object;
import java.util.Iterator;
import p.w20;
import p.v20;
import io.reactivex.rxjava3.core.ObservableSource;
import p.s20;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import java.util.Map;
import java.util.Collections;
import java.util.Collection;

public final class t20 implements Iterable	// class@0026e4 from classes.dex
{
    public final int a;
    public final Object b;

    public void t20(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final Iterator iterator(){
       t20 tb = this.b;
       switch (this.a){
           case 0:
             s20 os20 = new s20();
             Observable.wrap(tb).materialize().subscribe(os20);
             return os20;
           case 1:
             return new v20(tb, new w20());
           default:
             Iterator iterator = (tb == null)? Collections.emptyIterator(): tb.values().iterator();
             return iterator;
       }
    }
}

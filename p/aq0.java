package p.aq0;
import p.la6;
import p.di7;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Iterator;
import java.lang.IllegalStateException;
import java.lang.String;

public final class aq0 implements la6	// class@000fcf from classes.dex
{
    public final AtomicReference a;

    public void aq0(di7 p0){
       super();
       this.a = new AtomicReference(p0);
    }
    public final Iterator iterator(){
       la6 andSet;
       if ((andSet = this.a.getAndSet(null)) != null) {
          return andSet.iterator();
       }
       throw new IllegalStateException("This sequence can be consumed only once.");
    }
}

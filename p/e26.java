package p.e26;
import p.ui3;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Class;
import java.lang.String;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p.h90;
import p.i70;
import p.l93;
import p.wf2;

public final class e26 implements ui3, Serializable	// class@001407 from classes.dex
{
    public wf2 a;
    public Object b;
    public static final AtomicReferenceFieldUpdater c;

    static {
       e26.c = AtomicReferenceFieldUpdater.newUpdater(e26.class, Object.class, "b");
    }
    public void e26(h90 p0){
       super();
       this.a = p0;
       this.b = i70.E;
    }
    private final Object writeReplace(){
       return new l93(this.getValue());
    }
    public final Object getValue(){
       e26 tb = this.b;
       i70 e = i70.E;
       if (tb != e) {
          return tb;
       }
       if ((tb = this.a) != null) {
          Object obj = tb.invoke();
          AtomicReferenceFieldUpdater c = e26.c;
          while (true) {
             if (c.compareAndSet(this, e, obj)) {
                e = 1;
             }else {
                if (c.get(this) != e) {
                   e = 0;
                }
             }
             if (e) {
                this.a = null;
                return obj;
             }
          }
       }
       return this.b;
    }
    public final String toString(){
       int i = (this.b != i70.E)? 1: 0;
       String str = (i)? String.valueOf(this.getValue()): "Lazy value not initialized yet.";
       return str;
    }
}

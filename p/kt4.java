package p.kt4;
import p.c00;
import io.reactivex.rxjava3.core.Observer;
import java.util.Iterator;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;

public final class kt4 extends c00	// class@001c7d from classes.dex
{
    public final Iterator a;
    public boolean b;
    public boolean c;
    public boolean t;
    public boolean v;

    public void kt4(Observer p0,Iterator p1){
       super();
       this.a = p1;
    }
    public final int b(int p0){
       if (!((p0 & 1))) {
          return 0;
       }
       this.c = true;
       return 1;
    }
    public final void clear(){
       this.t = true;
    }
    public void dispose(){
       this.b = true;
    }
    public boolean isDisposed(){
       return this.b;
    }
    public final boolean isEmpty(){
       return this.t;
    }
    public final Object poll(){
       Object obj = null;
       if (this.t != null) {
          return obj;
       }
       kt4 ta = this.a;
       if (this.v != null) {
          if (!ta.hasNext()) {
             this.t = true;
             return obj;
          }
       }else {
          this.v = true;
       }
       Object obj1 = ta.next();
       Objects.requireNonNull(obj1, "The iterator returned a null value");
       return obj1;
    }
}

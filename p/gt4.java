package p.gt4;
import p.c00;
import io.reactivex.rxjava3.core.Observer;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;

public final class gt4 extends c00	// class@001776 from classes.dex
{
    public final Observer a;
    public final Object[] b;
    public int c;
    public boolean t;
    public boolean v;

    public void gt4(Observer p0,Object[] p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final int b(int p0){
       if (!((p0 & 1))) {
          return 0;
       }
       this.t = true;
       return 1;
    }
    public final void clear(){
       this.c = this.b.length;
    }
    public void dispose(){
       this.v = true;
    }
    public boolean isDisposed(){
       return this.v;
    }
    public final boolean isEmpty(){
       boolean b = (this.c == this.b.length)? true: false;
       return b;
    }
    public final Object poll(){
       gt4 tc = this.c;
       gt4 tb = this.b;
       if (tc == tb.length) {
          return null;
       }
       this.c = tc + 1;
       object oobject = tb[tc];
       Objects.requireNonNull(oobject, "The array element is null");
       return oobject;
    }
}

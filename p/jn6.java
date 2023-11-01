package p.jn6;
import p.ma0;
import java.lang.Object;
import p.la0;
import java.lang.Class;
import java.lang.reflect.Array;
import java.lang.IllegalStateException;
import java.lang.String;

public final class jn6	// class@001b10 from classes.dex
{
    public Object[] a;
    public Object[] b;
    public int c;
    public int d;
    public int e;
    public in6 f;
    public hn6 g;
    public int h;

    public void jn6(ma0 p0){
       super();
       this.a = Array.newInstance(la0.class, 10);
       this.f = p0;
       this.h = 0;
    }
    public final void a(){
       if (this.b == null) {
          return;
       }
       throw new IllegalStateException("Data cannot be mutated in the middle of a batch update operation such as addAll or replaceAll.");
    }
}

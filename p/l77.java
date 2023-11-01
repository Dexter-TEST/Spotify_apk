package p.l77;
import java.lang.Comparable;
import java.lang.Runnable;
import java.lang.Long;
import java.lang.Object;
import java.lang.Integer;

public final class l77 implements Comparable	// class@001cfd from classes.dex
{
    public final Runnable a;
    public final long b;
    public final int c;
    public boolean t;

    public void l77(Runnable p0,Long p1,int p2){
       super();
       this.a = p0;
       this.b = p1.longValue();
       this.c = p2;
    }
    public final int compareTo(Object p0){
       int i;
       if (!(i = Long.compare(this.b, p0.b))) {
          i = Integer.compare(this.c, p0.c);
       }
       return i;
    }
}

package p.yd5;
import java.lang.Comparable;
import java.util.concurrent.FutureTask;
import p.e20;
import java.lang.Runnable;
import java.lang.Object;
import p.en6;

public final class yd5 extends FutureTask implements Comparable	// class@002d98 from classes.dex
{
    public final e20 a;

    public void yd5(e20 p0){
       super(p0, null);
       this.a = p0;
    }
    public final int compareTo(Object p0){
       yd5 ta = this.a;
       e20 j = ta.J;
       p0 = p0.a;
       e20 j1 = p0.J;
       int i = (j == j1)? ta.a - p0.a: en6.A(j1) - en6.A(j);
       return i;
    }
}

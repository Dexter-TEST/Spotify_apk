package p.r52;
import java.lang.Comparable;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import p.tp2;

public final class r52 implements Comparable	// class@00247b from classes.dex
{
    public int a;
    public int b;

    public void r52(){
       super();
    }
    public final int compareTo(Object p0){
       r52 tb = this.b;
       r52 b = p0.b;
       int i = (tb != b)? tb - b: this.a - p0.a;
       return i;
    }
    public final String toString(){
       return tp2.n("Order{order="+this.b+", index=", this.a, '}');
    }
}

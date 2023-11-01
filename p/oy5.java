package p.oy5;
import java.io.Serializable;
import p.v45;
import java.lang.Object;
import p.kf4;
import java.lang.Comparable;
import java.lang.Class;
import java.lang.String;

public final class oy5 extends v45 implements Serializable	// class@0021b6 from classes.dex
{
    public static final oy5 a;

    static {
       oy5.a = new oy5();
    }
    public void oy5(){
       super();
    }
    private Object readResolve(){
       return oy5.a;
    }
    public final v45 a(){
       return kf4.a;
    }
    public final int compare(Object p0,Object p1){
       p0.getClass();
       int i = (p0 == p1)? 0: p1.compareTo(p0);
       return i;
    }
    public final String toString(){
       return "Ordering.natural\(\).reverse\(\)";
    }
}

package p.kf4;
import java.io.Serializable;
import p.v45;
import java.lang.Object;
import p.oy5;
import java.lang.Comparable;
import java.lang.Class;
import java.lang.String;

public final class kf4 extends v45 implements Serializable	// class@001c01 from classes.dex
{
    public static final kf4 a;

    static {
       kf4.a = new kf4();
    }
    public void kf4(){
       super();
    }
    private Object readResolve(){
       return kf4.a;
    }
    public final v45 a(){
       return oy5.a;
    }
    public final int compare(Object p0,Object p1){
       p0.getClass();
       p1.getClass();
       return p0.compareTo(p1);
    }
    public final String toString(){
       return "Ordering.natural\(\)";
    }
}

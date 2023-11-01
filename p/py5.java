package p.py5;
import java.util.Comparator;
import java.lang.Object;
import java.lang.Comparable;
import java.lang.String;
import p.co5;
import p.jf4;

public final class py5 implements Comparator	// class@0022f7 from classes.dex
{
    public static final py5 a;

    static {
       py5.a = new py5();
    }
    public void py5(){
       super();
    }
    public final int compare(Object p0,Object p1){
       co5.o(p0, "a");
       co5.o(p1, "b");
       return p1.compareTo(p0);
    }
    public final Comparator reversed(){
       return jf4.a;
    }
}

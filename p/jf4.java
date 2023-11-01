package p.jf4;
import java.util.Comparator;
import java.lang.Object;
import java.lang.Comparable;
import java.lang.String;
import p.co5;
import p.py5;

public final class jf4 implements Comparator	// class@001ac6 from classes.dex
{
    public static final jf4 a;

    static {
       jf4.a = new jf4();
    }
    public void jf4(){
       super();
    }
    public final int compare(Object p0,Object p1){
       co5.o(p0, "a");
       co5.o(p1, "b");
       return p0.compareTo(p1);
    }
    public final Comparator reversed(){
       return py5.a;
    }
}

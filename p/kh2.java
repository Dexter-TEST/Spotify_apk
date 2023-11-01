package p.kh2;
import java.util.Comparator;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import java.lang.Comparable;

public final class kh2 extends Enum implements Comparator	// class@001c11 from classes.dex
{
    public static final kh2 a;
    public static final kh2[] b;

    static {
       kh2 okh2 = new kh2();
       kh2.a = okh2;
       kh2[] okh2Array = new kh2[]{okh2};
       kh2.b = okh2Array;
    }
    public void kh2(){
       super("INSTANCE", 0);
    }
    public static kh2 valueOf(String p0){
       return Enum.valueOf(kh2.class, p0);
    }
    public static kh2[] values(){
       return kh2.b.clone();
    }
    public final int compare(Object p0,Object p1){
       return p0.compareTo(p1);
    }
}

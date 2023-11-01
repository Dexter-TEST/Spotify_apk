package p.ro1;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class ro1 extends Enum	// class@002526 from classes.dex
{
    public static final ro1 a;
    public static final ro1 b;
    public static final ro1 c;
    public static final ro1[] t;

    static {
       ro1 oro1 = new ro1("IMMEDIATE", 0);
       ro1.a = oro1;
       ro1 oro11 = new ro1("BOUNDARY", 1);
       ro1.b = oro11;
       ro1 oro12 = new ro1("END", 2);
       ro1.c = oro12;
       ro1[] oro1Array = new ro1[]{oro1,oro11,oro12};
       ro1.t = oro1Array;
    }
    public void ro1(String p0,int p1){
       super(p0, p1);
    }
    public static ro1 valueOf(String p0){
       return Enum.valueOf(ro1.class, p0);
    }
    public static ro1[] values(){
       return ro1.t.clone();
    }
}

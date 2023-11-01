package p.oo1;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class oo1 extends Enum	// class@00215b from classes.dex
{
    public final int a;
    public static final oo1 b;
    public static final oo1[] c;

    static {
       oo1 ooo1 = new oo1("L", 0, 1);
       oo1.b = ooo1;
       oo1[] ooo1Array = new oo1[]{ooo1,new oo1("M", 1, 0),new oo1("Q", 2, 3),new oo1("H", 3, 2)};
       oo1.c = ooo1Array;
    }
    public void oo1(String p0,int p1,int p2){
       super(p0, p1);
       this.a = p2;
    }
    public static oo1 valueOf(String p0){
       return Enum.valueOf(oo1.class, p0);
    }
    public static oo1[] values(){
       return oo1.c.clone();
    }
}

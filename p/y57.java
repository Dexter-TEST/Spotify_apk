package p.y57;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class y57 extends Enum	// class@002d54 from classes.dex
{
    public static final y57 a;
    public static final y57 b;
    public static final y57 c;
    public static final y57[] t;

    static {
       y57 oy57 = new y57("OK", 0);
       y57.a = oy57;
       y57 oy571 = new y57("BAD_CONFIG", 1);
       y57.b = oy571;
       y57 oy572 = new y57("AUTH_ERROR", 2);
       y57.c = oy572;
       y57[] oy57Array = new y57[]{oy57,oy571,oy572};
       y57.t = oy57Array;
    }
    public void y57(String p0,int p1){
       super(p0, p1);
    }
    public static y57 valueOf(String p0){
       return Enum.valueOf(y57.class, p0);
    }
    public static y57[] values(){
       return y57.t.clone();
    }
}

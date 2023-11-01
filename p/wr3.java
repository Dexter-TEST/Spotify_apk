package p.wr3;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class wr3 extends Enum	// class@002b8f from classes.dex
{
    public static final wr3 a;
    public static final wr3 b;
    public static final wr3 c;
    public static final wr3 t;
    public static final wr3 v;
    public static final wr3 w;
    public static final wr3 x;
    public static final wr3[] y;

    static {
       wr3 owr3 = new wr3("VERBOSE", 0);
       wr3.a = owr3;
       wr3 owr31 = new wr3("DEBUG", 1);
       wr3.b = owr31;
       wr3 owr32 = new wr3("INFO", 2);
       wr3.c = owr32;
       wr3 owr33 = new wr3("WARNING", 3);
       wr3.t = owr33;
       wr3 owr34 = new wr3("ERROR", 4);
       wr3.v = owr34;
       wr3 owr35 = new wr3("BREADCRUMB", 5);
       wr3.w = owr35;
       wr3 owr36 = new wr3("YELL", 6);
       wr3.x = owr36;
       wr3[] owr3Array = new wr3[]{owr3,owr31,owr32,owr33,owr34,owr35,owr36};
       wr3.y = owr3Array;
    }
    public void wr3(String p0,int p1){
       super(p0, p1);
    }
    public static wr3 valueOf(String p0){
       return Enum.valueOf(wr3.class, p0);
    }
    public static wr3[] values(){
       return wr3.y.clone();
    }
}

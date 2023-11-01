package p.qf3;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class qf3 extends Enum	// class@00238e from classes.dex
{
    public static final qf3 a;
    public static final qf3 b;
    public static final qf3 c;
    public static final qf3 t;
    public static final qf3 v;
    public static final qf3 w;
    public static final qf3 x;
    public static final qf3[] y;

    static {
       qf3 oqf3 = new qf3("ANY", 0);
       qf3.a = oqf3;
       qf3 oqf31 = new qf3("ARRAY", 3);
       qf3.b = oqf31;
       qf3 oqf32 = new qf3("NUMBER", 5);
       qf3.c = oqf32;
       qf3 oqf33 = new qf3("NUMBER_FLOAT", 6);
       qf3.t = oqf33;
       qf3 oqf34 = new qf3("NUMBER_INT", 7);
       qf3.v = oqf34;
       qf3 oqf35 = new qf3("STRING", 8);
       qf3.w = oqf35;
       qf3 oqf36 = new qf3("BINARY", 10);
       qf3.x = oqf36;
       qf3[] oqf3Array = new qf3[11];
       oqf3Array[0] = oqf3;
       oqf3Array[1] = new qf3("NATURAL", 1);
       oqf3Array[2] = new qf3("SCALAR", 2);
       oqf3Array[3] = oqf31;
       oqf3Array[4] = new qf3("OBJECT", 4);
       oqf3Array[5] = oqf32;
       oqf3Array[6] = oqf33;
       oqf3Array[7] = oqf34;
       oqf3Array[8] = oqf35;
       oqf3Array[9] = new qf3("BOOLEAN", 9);
       oqf3Array[10] = oqf36;
       qf3.y = oqf3Array;
    }
    public void qf3(String p0,int p1){
       super(p0, p1);
    }
    public static qf3 valueOf(String p0){
       return Enum.valueOf(qf3.class, p0);
    }
    public static qf3[] values(){
       return qf3.y.clone();
    }
    public final boolean a(){
       boolean b = (this != qf3.c && (this != qf3.v && this != qf3.t))? false: true;
       return b;
    }
}

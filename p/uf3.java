package p.uf3;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class uf3 extends Enum	// class@00289c from classes.dex
{
    public static final uf3 a;
    public static final uf3 b;
    public static final uf3[] c;

    static {
       uf3 ouf3 = new uf3(true, "AUTO_CLOSE_JSON_CONTENT", true);
       uf3.a = ouf3;
       uf3 ouf31 = new uf3(7, "WRITE_BIGDECIMAL_AS_PLAIN", 0);
       uf3.b = ouf31;
       uf3[] ouf3Array = new uf3[10];
       ouf3Array[0] = new uf3(0, "AUTO_CLOSE_TARGET", true);
       ouf3Array[1] = ouf3;
       ouf3Array[2] = new uf3(2, "FLUSH_PASSED_TO_STREAM", true);
       ouf3Array[3] = new uf3(3, "QUOTE_FIELD_NAMES", true);
       ouf3Array[4] = new uf3(4, "QUOTE_NON_NUMERIC_NUMBERS", true);
       ouf3Array[5] = new uf3(5, "ESCAPE_NON_ASCII", 0);
       ouf3Array[6] = new uf3(6, "WRITE_NUMBERS_AS_STRINGS", 0);
       ouf3Array[7] = ouf31;
       ouf3Array[8] = new uf3(8, "STRICT_DUPLICATE_DETECTION", 0);
       ouf3Array[9] = new uf3(9, "IGNORE_UNKNOWN", 0);
       uf3.c = ouf3Array;
    }
    public void uf3(int p0,String p1,boolean p2){
       super(p1, p0);
       this.ordinal();
    }
    public static uf3 valueOf(String p0){
       return Enum.valueOf(uf3.class, p0);
    }
    public static uf3[] values(){
       return uf3.c.clone();
    }
}

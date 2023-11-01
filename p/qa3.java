package p.qa3;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class qa3 extends Enum	// class@002362 from classes.dex
{
    public static final qa3 a;
    public static final qa3 b;
    public static final qa3[] c;

    static {
       qa3 oqa3 = new qa3("OK", 0);
       qa3.a = oqa3;
       qa3 oqa31 = new qa3("BAD_CONFIG", 1);
       qa3.b = oqa31;
       qa3[] oqa3Array = new qa3[]{oqa3,oqa31};
       qa3.c = oqa3Array;
    }
    public void qa3(String p0,int p1){
       super(p0, p1);
    }
    public static qa3 valueOf(String p0){
       return Enum.valueOf(qa3.class, p0);
    }
    public static qa3[] values(){
       return qa3.c.clone();
    }
}

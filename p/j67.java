package p.j67;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class j67 extends Enum	// class@001a79 from classes.dex
{
    public static final j67 a;
    public static final j67 b;
    public static final j67[] c;

    static {
       j67 oj67 = new j67("CLEAR", 0);
       j67.a = oj67;
       j67 oj671 = new j67("SCANNABLES", 1);
       j67.b = oj671;
       j67[] oj67Array = new j67[]{oj67,oj671};
       j67.c = oj67Array;
    }
    public void j67(String p0,int p1){
       super(p0, p1);
    }
    public static j67 valueOf(String p0){
       return Enum.valueOf(j67.class, p0);
    }
    public static j67[] values(){
       return j67.c.clone();
    }
}

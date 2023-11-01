package p.dx6;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class dx6 extends Enum	// class@0013d8 from classes.dex
{
    public static final dx6 a;
    public static final dx6 b;
    public static final dx6 c;
    public static final dx6[] t;

    static {
       dx6 uodx6 = new dx6("FORCE_NONE", 0);
       dx6.a = uodx6;
       dx6 uodx61 = new dx6("FORCE_SQUARE", 1);
       dx6.b = uodx61;
       dx6 uodx62 = new dx6("FORCE_RECTANGLE", 2);
       dx6.c = uodx62;
       dx6[] uodx6Array = new dx6[]{uodx6,uodx61,uodx62};
       dx6.t = uodx6Array;
    }
    public void dx6(String p0,int p1){
       super(p0, p1);
    }
    public static dx6 valueOf(String p0){
       return Enum.valueOf(dx6.class, p0);
    }
    public static dx6[] values(){
       return dx6.t.clone();
    }
}

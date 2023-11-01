package p.dx0;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class dx0 extends Enum	// class@0013d2 from classes.dex
{
    public static final dx0 a;
    public static final dx0[] b;

    static {
       dx0 uodx0 = new dx0("COROUTINE_SUSPENDED", 0);
       dx0.a = uodx0;
       dx0[] uodx0Array = new dx0[]{uodx0,new dx0("UNDECIDED", 1),new dx0("RESUMED", 2)};
       dx0.b = uodx0Array;
    }
    public void dx0(String p0,int p1){
       super(p0, p1);
    }
    public static dx0 valueOf(String p0){
       return Enum.valueOf(dx0.class, p0);
    }
    public static dx0[] values(){
       return dx0.b.clone();
    }
}

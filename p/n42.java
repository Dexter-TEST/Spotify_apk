package p.n42;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class n42 extends Enum	// class@001f63 from classes.dex
{
    public static final n42 a;
    public static final n42[] b;

    static {
       n42 on42 = new n42();
       n42.a = on42;
       n42[] on42Array = new n42[]{on42};
       n42.b = on42Array;
    }
    public void n42(){
       super("APPEND", 0);
    }
    public static n42 valueOf(String p0){
       return Enum.valueOf(n42.class, p0);
    }
    public static n42[] values(){
       return n42.b.clone();
    }
}

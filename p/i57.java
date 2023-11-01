package p.i57;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class i57 extends Enum	// class@00192d from classes.dex
{
    public static final i57 a;
    public static final i57[] b;

    static {
       i57 oi57 = new i57();
       i57.a = oi57;
       i57[] oi57Array = new i57[]{oi57};
       i57.b = oi57Array;
    }
    public void i57(){
       super("RowClicked", 0);
    }
    public static i57 valueOf(String p0){
       return Enum.valueOf(i57.class, p0);
    }
    public static i57[] values(){
       return i57.b.clone();
    }
}

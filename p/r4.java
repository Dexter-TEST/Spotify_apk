package p.r4;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class r4 extends Enum	// class@002478 from classes.dex
{
    private final int value;
    private static final r4[] $VALUES;
    public static final r4 a;
    public static final r4 b;
    public static final r4 c;
    public static final r4 t;

    static {
       r4 or4 = new r4("BOOL_VALUE", 0, 2);
       r4.a = or4;
       r4 or41 = new r4("LONG_VALUE", 1, 3);
       r4.b = or41;
       r4 or42 = new r4("STRING_VALUE", 2, 4);
       r4.c = or42;
       r4 or43 = new r4("VALUE_NOT_SET", 3, 0);
       r4.t = or43;
       r4[] or4Array = new r4[]{or4,or41,or42,or43};
       r4.$VALUES = or4Array;
    }
    public void r4(String p0,int p1,int p2){
       super(p0, p1);
       this.value = p2;
    }
    public static r4 valueOf(String p0){
       return Enum.valueOf(r4.class, p0);
    }
    public static r4[] values(){
       return r4.$VALUES.clone();
    }
}

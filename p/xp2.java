package p.xp2;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class xp2 extends Enum	// class@002cbf from classes.dex
{
    public static final xp2 a;
    public static final xp2 b;
    public static final xp2 c;
    public static final xp2[] t;

    static {
       xp2 oxp2 = new xp2("NONE", 0);
       xp2.a = oxp2;
       xp2 oxp21 = new xp2("OFF", 1);
       xp2.b = oxp21;
       xp2 oxp22 = new xp2("ON", 2);
       xp2.c = oxp22;
       xp2[] oxp2Array = new xp2[]{oxp2,oxp21,oxp22};
       xp2.t = oxp2Array;
    }
    public void xp2(String p0,int p1){
       super(p0, p1);
    }
    public static xp2 valueOf(String p0){
       return Enum.valueOf(xp2.class, p0);
    }
    public static xp2[] values(){
       return xp2.t.clone();
    }
}

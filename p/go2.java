package p.go2;
import p.zv6;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;
import java.util.HashMap;

public final class go2 extends Enum implements zv6	// class@001748 from classes.dex
{
    public static final go2 a;
    public static final go2[] b;

    static {
       go2 ogo2 = new go2();
       go2.a = ogo2;
       go2[] ogo2Array = new go2[]{ogo2};
       go2.b = ogo2Array;
    }
    public void go2(){
       super("INSTANCE", 0);
    }
    public static go2 valueOf(String p0){
       return Enum.valueOf(go2.class, p0);
    }
    public static go2[] values(){
       return go2.b.clone();
    }
    public final Object get(){
       return new HashMap();
    }
}

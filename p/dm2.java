package p.dm2;
import java.lang.Enum;
import p.cm2;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public abstract class dm2 extends Enum	// class@001373 from classes.dex
{
    public static final cm2 a;
    public static final dm2[] b;

    static {
       cm2 uocm2 = new cm2();
       dm2.a = uocm2;
       dm2[] uodm2Array = new dm2[]{uocm2};
       dm2.b = uodm2Array;
       dm2.values();
    }
    public void dm2(){
       super("LINEAR", 0);
    }
    public static dm2 valueOf(String p0){
       return Enum.valueOf(dm2.class, p0);
    }
    public static dm2[] values(){
       return dm2.b.clone();
    }
}

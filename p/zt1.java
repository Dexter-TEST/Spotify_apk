package p.zt1;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.Class;
import java.util.Arrays;

public final class zt1 extends Enum	// class@002f5e from classes.dex
{
    public static final zt1[] a;

    static {
       zt1[] ozt1Array = new zt1[]{new zt1("MANUAL", 0),new zt1("INFERENCE", 1)};
       zt1.a = ozt1Array;
    }
    public void zt1(String p0,int p1){
       super(p0, p1);
    }
    public static zt1 valueOf(String p0){
       co5.o(p0, "value");
       return Enum.valueOf(zt1.class, p0);
    }
    public static zt1[] values(){
       return Arrays.copyOf(zt1.a, 2);
    }
}

package p.nz1;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.Class;
import java.util.Arrays;

public final class nz1 extends Enum	// class@002079 from classes.dex
{
    public static final nz1 a;
    public static final nz1 b;
    public static final nz1 c;
    public static final nz1[] t;

    static {
       nz1 onz1 = new nz1("LOGIN_RECOVERABLE", 0);
       nz1.a = onz1;
       nz1 onz11 = new nz1("OTHER", 1);
       nz1.b = onz11;
       nz1 onz12 = new nz1("TRANSIENT", 2);
       nz1.c = onz12;
       nz1[] onz1Array = new nz1[]{onz1,onz11,onz12};
       nz1.t = onz1Array;
    }
    public void nz1(String p0,int p1){
       super(p0, p1);
    }
    public static nz1 valueOf(String p0){
       co5.o(p0, "value");
       return Enum.valueOf(nz1.class, p0);
    }
    public static nz1[] values(){
       return Arrays.copyOf(nz1.t, 3);
    }
}

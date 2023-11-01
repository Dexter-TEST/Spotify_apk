package p.eu5;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.Class;
import java.util.Arrays;

public final class eu5 extends Enum	// class@0014fe from classes.dex
{
    public static final eu5 a;
    public static final eu5 b;
    public static final eu5 c;
    public static final eu5[] t;

    static {
       eu5 uoeu5 = new eu5("OPERATION_SUCCESS", 0);
       eu5.a = uoeu5;
       eu5 uoeu51 = new eu5("SERVICE_NOT_AVAILABLE", 1);
       eu5.b = uoeu51;
       eu5 uoeu52 = new eu5("SERVICE_ERROR", 2);
       eu5.c = uoeu52;
       eu5[] uoeu5Array = new eu5[]{uoeu5,uoeu51,uoeu52};
       eu5.t = uoeu5Array;
    }
    public void eu5(String p0,int p1){
       super(p0, p1);
    }
    public static eu5 valueOf(String p0){
       co5.o(p0, "value");
       return Enum.valueOf(eu5.class, p0);
    }
    public static eu5[] values(){
       return Arrays.copyOf(eu5.t, 3);
    }
}

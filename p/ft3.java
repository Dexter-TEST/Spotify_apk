package p.ft3;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.Class;
import java.util.Arrays;

public final class ft3 extends Enum	// class@001633 from classes.dex
{
    public final String a;
    public static final ft3 b;
    public static final ft3 c;
    public static final ft3 t;
    public static final ft3[] v;

    static {
       ft3 uoft3 = new ft3("SUCCESS", 0, "success");
       ft3.b = uoft3;
       ft3 uoft31 = new ft3("CANCEL", 1, "cancel");
       ft3.c = uoft31;
       ft3 uoft32 = new ft3("ERROR", 2, "error");
       ft3.t = uoft32;
       ft3[] uoft3Array = new ft3[]{uoft3,uoft31,uoft32};
       ft3.v = uoft3Array;
    }
    public void ft3(String p0,int p1,String p2){
       super(p0, p1);
       this.a = p2;
    }
    public static ft3 valueOf(String p0){
       co5.o(p0, "value");
       return Enum.valueOf(ft3.class, p0);
    }
    public static ft3[] values(){
       return Arrays.copyOf(ft3.v, 3);
    }
}

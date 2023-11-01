package p.cb2;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.Class;
import java.util.Arrays;

public final class cb2 extends Enum	// class@0011d2 from classes.dex
{
    public static final cb2 a;
    public static final cb2 b;
    public static final cb2 c;
    public static final cb2[] t;

    static {
       cb2 uocb2 = new cb2("SUCCESS", 0);
       cb2.a = uocb2;
       cb2 uocb21 = new cb2("SERVER_ERROR", 1);
       cb2.b = uocb21;
       cb2 uocb22 = new cb2("NO_CONNECTIVITY", 2);
       cb2.c = uocb22;
       cb2[] uocb2Array = new cb2[]{uocb2,uocb21,uocb22,new cb2("UNKNOWN_ERROR", 3)};
       cb2.t = uocb2Array;
    }
    public void cb2(String p0,int p1){
       super(p0, p1);
    }
    public static cb2 valueOf(String p0){
       co5.o(p0, "value");
       return Enum.valueOf(cb2.class, p0);
    }
    public static cb2[] values(){
       return Arrays.copyOf(cb2.t, 4);
    }
}

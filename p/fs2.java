package p.fs2;
import java.lang.Enum;
import java.lang.String;
import java.lang.Object;
import p.co5;
import java.lang.Class;
import java.util.Arrays;

public final class fs2 extends Enum	// class@001629 from classes.dex
{
    public static final fs2 a;
    public static final fs2 b;
    public static final fs2[] c;

    static {
       fs2 uofs2 = new fs2("GET", 0);
       fs2.a = uofs2;
       fs2 uofs21 = new fs2("POST", 1);
       fs2.b = uofs21;
       fs2[] uofs2Array = new fs2[]{uofs2,uofs21,new fs2("DELETE", 2)};
       fs2.c = uofs2Array;
    }
    public void fs2(String p0,int p1){
       super(p0, p1);
    }
    public static fs2 valueOf(String p0){
       co5.o(p0, "value");
       return Enum.valueOf(fs2.class, p0);
    }
    public static fs2[] values(){
       return Arrays.copyOf(fs2.c, 3);
    }
}

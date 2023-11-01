package p.yk5;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class yk5 extends Enum	// class@002dd7 from classes.dex
{
    public static final yk5 a;
    public static final yk5 b;
    public static final yk5[] c;

    static {
       yk5 oyk5 = new yk5("PREMIUM", 0);
       yk5.a = oyk5;
       yk5 oyk51 = new yk5("FREE", 1);
       yk5.b = oyk51;
       yk5[] oyk5Array = new yk5[]{oyk5,oyk51};
       yk5.c = oyk5Array;
    }
    public void yk5(String p0,int p1){
       super(p0, p1);
    }
    public static yk5 valueOf(String p0){
       return Enum.valueOf(yk5.class, p0);
    }
    public static yk5[] values(){
       return yk5.c.clone();
    }
}

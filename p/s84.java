package p.s84;
import p.tb3;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class s84 extends Enum implements tb3	// class@0025db from classes.dex
{
    public static final s84 a;
    public static final s84[] b;

    static {
       s84 os84 = new s84();
       s84.a = os84;
       s84[] os84Array = new s84[]{os84};
       s84.b = os84Array;
    }
    public void s84(){
       super("STREAMING", 0);
    }
    public static s84 valueOf(String p0){
       return Enum.valueOf(s84.class, p0);
    }
    public static s84[] values(){
       return s84.b.clone();
    }
    public final int getNumber(){
       return 0;
    }
}

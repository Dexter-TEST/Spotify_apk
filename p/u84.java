package p.u84;
import p.tb3;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class u84 extends Enum implements tb3	// class@002861 from classes.dex
{
    public final int a;
    public static final u84 b;
    public static final u84 c;
    public static final u84 t;
    public static final u84[] v;

    static {
       u84 ou84 = new u84("SEQUENTIAL", 0, 1);
       u84.b = ou84;
       u84 ou841 = new u84("EPISODIC", 1, 2);
       u84.c = ou841;
       u84 ou842 = new u84("RECENT", 2, 3);
       u84.t = ou842;
       u84[] ou84Array = new u84[]{ou84,ou841,ou842};
       u84.v = ou84Array;
    }
    public void u84(String p0,int p1,int p2){
       super(p0, p1);
       this.a = p2;
    }
    public static u84 valueOf(String p0){
       return Enum.valueOf(u84.class, p0);
    }
    public static u84[] values(){
       return u84.v.clone();
    }
    public final int getNumber(){
       return this.a;
    }
}

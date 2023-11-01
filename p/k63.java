package p.k63;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class k63 extends Enum	// class@001bb3 from classes.dex
{
    public static final k63 a;
    public static final k63 b;
    public static final k63 c;
    public static final k63[] t;

    static {
       k63 ok63 = new k63("MEMORY", 0);
       k63.a = ok63;
       k63 ok631 = new k63("DISK", 1);
       k63.b = ok631;
       k63 ok632 = new k63("NETWORK", 2);
       k63.c = ok632;
       k63[] ok63Array = new k63[]{ok63,ok631,ok632};
       k63.t = ok63Array;
    }
    public void k63(String p0,int p1){
       super(p0, p1);
    }
    public static k63 valueOf(String p0){
       return Enum.valueOf(k63.class, p0);
    }
    public static k63[] values(){
       return k63.t.clone();
    }
}

package p.l36;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class l36 extends Enum	// class@001cd9 from classes.dex
{
    public static final l36 a;
    public static final l36 b;
    public static final l36 c;
    public static final l36[] t;

    static {
       l36 ol36 = new l36("NETWORK_UNMETERED", 0);
       l36.a = ol36;
       l36 ol361 = new l36("DEVICE_IDLE", 1);
       l36.b = ol361;
       l36 ol362 = new l36("DEVICE_CHARGING", 2);
       l36.c = ol362;
       l36[] ol36Array = new l36[]{ol36,ol361,ol362};
       l36.t = ol36Array;
    }
    public void l36(String p0,int p1){
       super(p0, p1);
    }
    public static l36 valueOf(String p0){
       return Enum.valueOf(l36.class, p0);
    }
    public static l36[] values(){
       return l36.t.clone();
    }
}

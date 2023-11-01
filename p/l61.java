package p.l61;
import java.lang.Enum;
import java.lang.String;
import java.lang.Class;
import java.lang.Object;

public final class l61 extends Enum	// class@001cee from classes.dex
{
    public final String a;
    public static final l61 b;
    public static final l61 c;
    public static final l61 t;
    public static final l61[] v;

    static {
       l61 ol61 = new l61("LOGGED_OUT", 0, "LOGGED_OUT");
       l61.b = ol61;
       l61 ol611 = new l61("LOGGED_IN", 1, "LOGGED_IN");
       l61.c = ol611;
       l61 ol612 = new l61("PLAYING", 2, "PLAYING");
       l61.t = ol612;
       l61[] ol61Array = new l61[]{ol61,ol611,ol612};
       l61.v = ol61Array;
    }
    public void l61(String p0,int p1,String p2){
       this.a = p2;
    }
    public static l61 valueOf(String p0){
       return Enum.valueOf(l61.class, p0);
    }
    public static l61[] values(){
       return l61.v.clone();
    }
}

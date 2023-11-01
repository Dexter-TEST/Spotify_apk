package p.rn6;
import p.b07;
import java.util.HashSet;
import java.lang.String;
import java.lang.Object;

public final class rn6	// class@002522 from classes.dex
{
    public final String a;
    public static final b07 b;
    public static final HashSet c;

    static {
       rn6.b = new b07(27, 0);
       rn6.c = new HashSet(64);
    }
    public void rn6(String p0){
       super();
       this.a = p0;
    }
    public static synchronized final rn6 a(String p0){
       _monitor_enter(rn6.class);
       _monitor_exit(rn6.class);
       return rn6.b.a(p0);
    }
}

package p.ea6;
import java.lang.String;
import p.eo5;
import p.bx6;

public abstract class ea6	// class@00144e from classes.dex
{
    public static final int a;
    public static final bx6 b;
    public static final bx6 c;
    public static final bx6 d;
    public static final bx6 e;
    public static final int f;

    static {
       ea6.a = eo5.S("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12);
       ea6.b = new bx6("PERMIT");
       ea6.c = new bx6("TAKEN");
       ea6.d = new bx6("BROKEN");
       ea6.e = new bx6("CANCELLED");
       ea6.f = eo5.S("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12);
    }
}

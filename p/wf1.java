package p.wf1;
import java.lang.ThreadLocal;

public abstract class wf1	// class@002b24 from classes.dex
{
    public static final int a;

    static {
       ThreadLocal[] threadLocalA = new ThreadLocal[4];
       for (int i = 0; i < 4; i = i + 1) {
          threadLocalA[i] = new ThreadLocal();
       }
    }
}

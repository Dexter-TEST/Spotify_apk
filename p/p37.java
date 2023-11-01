package p.p37;
import java.lang.ThreadLocal;
import p.nu1;
import java.lang.Object;
import p.m20;
import java.lang.Thread;

public abstract class p37	// class@0021e6 from classes.dex
{
    public static final ThreadLocal a;

    static {
       p37.a = new ThreadLocal();
    }
    public static nu1 a(){
       nu1 onu1;
       ThreadLocal a = p37.a;
       if ((onu1 = a.get()) == null) {
          onu1 = new m20(Thread.currentThread());
          a.set(onu1);
       }
       return onu1;
    }
}

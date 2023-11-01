package p.x07;
import java.lang.String;
import p.eo5;
import p.vy6;
import java.util.concurrent.TimeUnit;
import p.ve4;
import p.ir2;

public abstract class x07	// class@002be4 from classes.dex
{
    public static final long a;
    public static final int b;
    public static final int c;
    public static final long d;
    public static final ve4 e;
    public static final ir2 f;
    public static final ir2 g;

    static {
       int a;
       x07.a = eo5.R("kotlinx.coroutines.scheduler.resolution.ns", 0x186a0, 1, Long.MAX_VALUE);
       if ((a = vy6.a) < 2) {
          a = 2;
       }
       x07.b = eo5.S("kotlinx.coroutines.scheduler.core.pool.size", a, 1, 0, 8);
       x07.c = eo5.S("kotlinx.coroutines.scheduler.max.pool.size", 0x1ffffe, 0, 0x1ffffe, 4);
       x07.d = TimeUnit.SECONDS.toNanos(eo5.R("kotlinx.coroutines.scheduler.keep.alive.sec", 60, 1, Long.MAX_VALUE));
       x07.e = ve4.C;
       x07.f = new ir2(0);
       x07.g = new ir2(1);
    }
}

package p.ld;
import p.y37;
import p.sc4;
import p.ic;
import p.zg0;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.util.HashSet;
import p.md;
import p.a47;
import p.iz7;
import java.lang.Runnable;
import java.util.concurrent.Executor;

public final class ld implements y37	// class@001d35 from classes.dex
{
    public final sc4 a;
    public final ExecutorService b;
    public w47 c;
    public final HashSet d;

    public void ld(){
       ExecutorService uExecutorSer = Executors.newSingleThreadExecutor();
       co5.l(uExecutorSer, "newSingleThreadExecutor\(\)");
       super();
       this.a = new sc4(new ic());
       this.b = uExecutorSer;
       this.d = new HashSet(50);
    }
    public final md a(String p0){
       co5.o(p0, "category");
       return new md(p0, this.a);
    }
    public final void b(a47 p0){
       this.b.execute(new iz7(this, 15, p0));
    }
}

package p.j71;
import java.util.concurrent.Executor;
import p.pw1;
import p.pc7;
import p.vy6;
import java.lang.String;
import p.eo5;
import p.zw0;
import p.ik3;
import java.lang.IllegalStateException;
import java.lang.Object;
import java.lang.Runnable;
import p.il1;
import p.xw0;

public final class j71 extends pw1 implements Executor	// class@001a7c from classes.dex
{
    public static final j71 c;
    public static final ik3 t;

    static {
       j71.c = new j71();
       pc7 c = pc7.c;
       int a = vy6.a;
       if (64 < a) {
       }else {
          a = 64;
       }
       j71.t = c.i0(eo5.S("kotlinx.coroutines.io.parallelism", a, 0, 0, 12));
    }
    public void j71(){
       super();
    }
    public final void close(){
       throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }
    public final void execute(Runnable p0){
       this.g0(il1.a, p0);
    }
    public final void g0(xw0 p0,Runnable p1){
       j71.t.g0(p0, p1);
    }
    public final zw0 i0(int p0){
       return pc7.c.i0(1);
    }
    public final String toString(){
       return "Dispatchers.IO";
    }
}

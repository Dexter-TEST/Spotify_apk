package p.v96;
import p.yn0;
import java.lang.Class;
import java.lang.String;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.lang.Object;

public abstract class v96 extends yn0	// class@0029ac from classes.dex
{
    public final long c;
    private int cleanedAndPointers;
    public static final AtomicIntegerFieldUpdater d;

    static {
       v96.d = AtomicIntegerFieldUpdater.newUpdater(v96.class, "cleanedAndPointers");
    }
    public void v96(long p0,v96 p1,int p2){
       super(p1);
       this.c = p0;
       this.cleanedAndPointers = p2 << 16;
    }
    public final boolean b(){
       boolean b = (this.cleanedAndPointers == this.f() && !this.c())? true: false;
       return b;
    }
    public final boolean e(){
       boolean b = (v96.d.addAndGet(this, 0xffff0000) == this.f() && !this.c())? true: false;
       return b;
    }
    public abstract int f();
    public final boolean g(){
       v96 tcleanedAndP;
       boolean b;
       int i1;
       do {
          tcleanedAndP = this.cleanedAndPointers;
          b = true;
          int i = (tcleanedAndP == this.f() && !this.c())? 0: 1;
          if (!i) {
             b = false;
             break ;
          }
          i1 = 0x10000 + tcleanedAndP;
       } while (v96.d.compareAndSet(this, tcleanedAndP, i1));
       return b;
    }
}

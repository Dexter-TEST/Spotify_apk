package p.iw4;
import p.zv4;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicReference;
import p.cw4;

public final class iw4 extends zv4	// class@001a19 from classes.dex
{
    public final int t;

    public void iw4(int p0,boolean p1){
       super(p1);
       this.t = p0;
    }
    public final void i(){
       if (this.b > this.t) {
          this.b = this.b - 1;
          this.h(this.get().get());
       }
       return;
    }
}

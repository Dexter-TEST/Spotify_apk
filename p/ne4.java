package p.ne4;
import androidx.lifecycle.b;
import java.lang.Object;
import java.lang.String;
import p.oq3;
import p.ck;
import java.lang.Runnable;

public class ne4 extends b	// class@001fc0 from classes.dex
{

    public void ne4(){
       super();
    }
    public void ne4(Object p0){
       super(p0);
    }
    public void k(Object p0){
       b.b("setValue");
       this.g = this.g + 1;
       this.e = p0;
       this.d(null);
    }
    public final void l(Object p0){
       b ta = this.a;
       _monitor_enter(ta);
       int i = (this.f == b.k)? 1: 0;
       this.f = p0;
       _monitor_exit(ta);
       if (i) {
          ck.o0().q0(this.j);
       }
       return;
    }
}

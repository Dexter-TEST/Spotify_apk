package p.l08;
import java.lang.Object;
import p.vj1;
import java.lang.Exception;
import p.l18;

public final class l08	// class@001cbe from classes.dex
{
    public final vj1 a;

    public void l08(){
       this.a = new vj1();
    }
    public final void a(Exception p0){
       l08 ta = this.a;
       vj1 b = ta.b;
       _monitor_enter(b);
       if (ta.a != null) {
          _monitor_exit(b);
       }else {
          ta.a = true;
          ta.e = p0;
          _monitor_exit(b);
          ta.c.d(ta);
       }
       return;
    }
    public final void b(Object p0){
       l08 ta = this.a;
       vj1 b = ta.b;
       _monitor_enter(b);
       if (ta.a != null) {
          _monitor_exit(b);
       }else {
          ta.a = true;
          ta.d = p0;
          _monitor_exit(b);
          ta.c.d(ta);
       }
       return;
    }
}

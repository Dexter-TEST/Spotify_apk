package p.y80;
import p.g90;
import p.a90;
import p.tb1;
import java.lang.Object;
import p.el6;
import p.x80;
import java.io.Closeable;
import p.we7;

public final class y80 implements g90	// class@002d68 from classes.dex
{
    public final tb1 a;
    public final el6 b;
    public final x80 c;
    public boolean d;
    public final a90 e;

    public void y80(a90 p0,tb1 p1){
       this.e = p0;
       super();
       this.a = p1;
       el6 uoel6 = p1.f(1);
       this.b = uoel6;
       this.c = new x80(p0, this, uoel6);
    }
    public final void a(){
       y80 te = this.e;
       _monitor_enter(te);
       if (this.d != null) {
          _monitor_exit(te);
          return;
       }else {
          this.d = true;
          _monitor_exit(te);
          te = this.b;
          try{
             we7.d(te);
             this.a.a();
             return;
          }catch(java.io.IOException e0){
          }
       }
    }
}

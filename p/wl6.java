package p.wl6;
import p.x37;
import p.lf5;
import java.lang.Object;
import p.yl6;
import p.fn0;
import java.lang.Boolean;
import p.t00;

public final class wl6	// class@002b5f from classes.dex
{
    public final x37 a;
    public final lf5 b;

    public void wl6(x37 p0,lf5 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void a(){
       wl6 ta = this.a;
       int i = (ta.d != null)? 1: 0;
       if (i) {
          ta.a();
       }else {
          ta = this.b;
          if (ta.f != null) {
             ta.h.b(2);
             ta.f = false;
             ta.e = false;
             ta.c.e();
             ta.g.onNext(Boolean.FALSE);
          }
       }
       return;
    }
    public final boolean b(){
       boolean b = true;
       if (this.b.f == null) {
          int i = (this.a.d != null)? 1: 0;
          if (!i) {
             b = false;
          }
       }
       return b;
    }
}

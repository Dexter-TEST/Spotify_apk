package p.r77;
import p.t77;
import p.y77;
import p.x77;
import java.lang.Object;
import java.util.List;
import p.s77;
import p.eg7;

public class r77 extends t77	// class@002492 from classes.dex
{
    public final t77 c;
    public final int d;
    public y77 e;

    public void r77(float p0,float p1,int p2,t77 p3){
       super(p0, p1);
       this.d = p2;
       this.c = p3;
       y77 oy77 = new y77();
       this.e = oy77;
       v77 a = (!p2)? x77.a: x77.b;
       oy77.a = a;
       return;
    }
    public final void a(y77 p0,float p1,float p2){
       this.e.b.add(p0);
       if (this.d == null) {
          this.a = p1;
          this.b = p2;
       }
       return;
    }
    public final s77 b(float p0){
       r77 td;
       s77 p0;
       eg7 uoeg7 = new eg7(this.a, this.b, 0x3f800000, p0);
       this.e.b.add(uoeg7);
       if ((td = this.d) == null) {
          this.a = 0x3f800000;
          this.b = p0;
       }
       p0 = new s77(this.a, this.b, td, this.c, this.e);
       p0.g = this;
       p0.f = uoeg7;
       return p0;
    }
}

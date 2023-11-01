package p.yi7;
import p.ui3;
import p.uf0;
import p.wf2;
import java.lang.Object;
import p.aj7;
import p.dj7;
import p.qo5;
import p.i01;
import p.ah3;
import java.lang.Class;
import p.ye7;
import p.vi7;

public final class yi7 implements ui3	// class@002dc7 from classes.dex
{
    public final ah3 a;
    public final wf2 b;
    public final wf2 c;
    public final wf2 t;
    public vi7 v;

    public void yi7(uf0 p0,wf2 p1,wf2 p2,wf2 p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
    }
    public final Object getValue(){
       yi7 tv;
       if ((tv = this.v) == null) {
          tv = new qo5(this.b.invoke(), this.c.invoke(), this.t.invoke()).g(ye7.z(this.a));
          this.v = tv;
       }
       return tv;
    }
}

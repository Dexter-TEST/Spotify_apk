package p.xy3;
import p.xo0;
import p.vi7;
import p.uy3;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.e63;
import p.ay6;
import p.wf2;
import p.sb4;
import p.hr0;
import p.ap0;
import p.wy3;
import p.ty3;

public final class xy3 extends vi7 implements xo0	// class@002d10 from classes.dex
{
    public final uy3 t;
    public sb4 v;
    public hr0 w;
    public final ay6 x;

    public void xy3(uy3 p0){
       co5.o(p0, "injector");
       super();
       this.t = p0;
       this.x = new ay6(e63.A);
    }
    public final void b(){
       xy3 tv;
       if ((tv = this.v) != null) {
          tv.b();
          return;
       }else {
          co5.N("controller");
          throw null;
       }
    }
    public final ap0 d(hr0 p0){
       this.w = p0;
       return new wy3(this, 0);
    }
    public final void e(ty3 p0){
       xy3 tw;
       if ((tw = this.w) != null) {
          tw.accept(p0);
          return;
       }else {
          co5.N("eventConsumer");
          throw null;
       }
    }
}

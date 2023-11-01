package p.ub1;
import p.xc2;
import p.on;
import p.dc1;
import p.vb1;
import p.nn6;

public final class ub1 extends xc2	// class@000367 from classes2.dex
{
    public boolean b;
    public final dc1 c;
    public final vb1 t;

    public void ub1(on p0,dc1 p1,vb1 p2){
       this.c = p1;
       this.t = p2;
       super(p0);
    }
    public final void close(){
       super.close();
       if (this.b == null) {
          this.b = true;
          ub1 tc = this.c;
          ub1 tt = this.t;
          _monitor_enter(tc);
          int i = tt.h - 1;
          tt.h = i;
          if (!i && tt.f != null) {
             tc.m0(tt);
          }
          _monitor_exit(tc);
       }
       return;
    }
}

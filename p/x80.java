package p.x80;
import p.wc2;
import p.a90;
import p.y80;
import p.el6;
import p.tb1;

public final class x80 extends wc2	// class@002c27 from classes.dex
{
    public final a90 b;
    public final y80 c;

    public void x80(a90 p0,y80 p1,el6 p2){
       this.b = p0;
       this.c = p1;
       super(p2);
    }
    public final void close(){
       x80 tb = this.b;
       x80 tc = this.c;
       _monitor_enter(tb);
       if (tc.d != null) {
          _monitor_exit(tb);
          return;
       }else {
          tc.d = true;
          _monitor_exit(tb);
          super.close();
          this.c.a.b();
          return;
       }
    }
}

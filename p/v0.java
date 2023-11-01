package p.v0;
import p.ty0;
import p.x0;
import p.s0;
import java.lang.Object;
import p.w0;
import java.lang.Thread;

public final class v0 extends ty0	// class@00295c from classes.dex
{

    public void v0(){
       super(0);
    }
    public final boolean d(x0 p0,s0 p1,s0 p2){
       _monitor_enter(p0);
       if (p0.b == p1) {
          p0.b = p2;
          _monitor_exit(p0);
          return true;
       }else {
          _monitor_exit(p0);
          return false;
       }
    }
    public final boolean e(x0 p0,Object p1,Object p2){
       _monitor_enter(p0);
       if (p0.a == p1) {
          p0.a = p2;
          _monitor_exit(p0);
          return true;
       }else {
          _monitor_exit(p0);
          return false;
       }
    }
    public final boolean f(x0 p0,w0 p1,w0 p2){
       _monitor_enter(p0);
       if (p0.c == p1) {
          p0.c = p2;
          _monitor_exit(p0);
          return true;
       }else {
          _monitor_exit(p0);
          return false;
       }
    }
    public final void t(w0 p0,w0 p1){
       p0.b = p1;
    }
    public final void u(w0 p0,Thread p1){
       p0.a = p1;
    }
}

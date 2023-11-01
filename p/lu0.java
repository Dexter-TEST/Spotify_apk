package p.lu0;
import p.hu0;
import p.sb4;
import p.ap0;
import p.ob4;
import java.lang.Object;
import p.j93;
import p.jt;
import p.lb4;
import java.util.Set;
import p.rb4;
import java.lang.IllegalArgumentException;
import java.lang.String;
import p.iu0;
import p.fu0;

public final class lu0 extends hu0	// class@001dc2 from classes.dex
{
    public final fu0 b;
    public final ap0 c;
    public final rb4 d;
    public final Object e;

    public void lu0(sb4 p0,ap0 p1,ob4 p2,Object p3,j93 p4){
       super();
       this.b = p0;
       this.c = p1;
       if (p4 != null) {
          jt ojt = p4.c(p3);
          jt a = ojt.a;
          if (p2.c == null) {
             this.d = p2.g(a, ojt.b);
             this.e = ojt.a;
          }else {
             throw new IllegalArgumentException("cannot pass in start effects when a loop has init defined");
          }
       }else {
          this.d = p2.f(p3);
          this.e = p3;
       }
       return;
    }
    public final String a(){
       return "running";
    }
    public final void d(Object p0){
       this.d.a(p0);
    }
    public final Object e(){
       rb4 z;
       if ((z = this.d.z) != null) {
       }else {
          z = this.e;
       }
       return z;
    }
    public final void h(){
       this.d.dispose();
       rb4 z = this.d.z;
       lu0 tb = this.b;
       lu0 tc = this.c;
       _monitor_enter(tb);
       if (z == null) {
          z = tb.b;
       }
       tb.e = new iu0(tb, tc, z);
       _monitor_exit(tb);
       return;
    }
    public final void i(Object p0){
       this.c.accept(p0);
    }
}

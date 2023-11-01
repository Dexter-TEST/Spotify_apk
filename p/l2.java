package p.l2;
import p.lv1;
import p.m2;
import java.lang.Thread;
import p.n2;
import p.j2;
import java.lang.Object;

public final class l2 extends lv1	// class@001cd2 from classes.dex
{

    public void l2(){
       super(0);
    }
    public final void E(m2 p0,m2 p1){
       p0.b = p1;
    }
    public final void F(m2 p0,Thread p1){
       p0.a = p1;
    }
    public final boolean f(n2 p0,j2 p1,j2 p2){
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
    public final boolean g(n2 p0,Object p1,Object p2){
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
    public final boolean h(n2 p0,m2 p1,m2 p2){
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
}

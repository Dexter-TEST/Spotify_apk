package p.ll3;
import p.ml3;
import java.lang.Object;
import p.gd7;
import p.bc3;
import p.f2;
import java.util.List;
import java.util.Collection;

public final class ll3 extends ml3	// class@001d77 from classes.dex
{

    public void ll3(){
       super();
    }
    public final void a(long p0,Object p1){
       p0.a = false;
    }
    public final void b(long p0,Object p1,Object p2){
       bc3 uobc3 = gd7.p(p0, p1);
       p2 = gd7.p(p0, p2);
       int i = uobc3.size();
       int i1 = p2.size();
       if (i > 0 && i1 > 0) {
          if (uobc3.a == null) {
             uobc3 = uobc3.f((i1 + i));
          }
          uobc3.addAll(p2);
       }
       if (i > 0) {
          p2 = uobc3;
       }
       gd7.z(p0, p1, p2);
       return;
    }
    public final List c(long p0,Object p1){
       bc3 uobc3 = gd7.p(p0, p1);
       if (uobc3.a == null) {
          int i = (!(i = uobc3.size()))? 10: i * 2;
          uobc3 = uobc3.f(i);
          gd7.z(p0, p1, uobc3);
       }
       return uobc3;
    }
}

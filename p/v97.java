package p.v97;
import p.or0;
import p.my;
import p.sy;
import p.ae6;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.Class;
import p.qy;
import p.rd;
import p.z52;
import java.util.List;

public final class v97 implements or0, my	// class@0029ad from classes.dex
{
    public final boolean a;
    public final ArrayList b;
    public final int c;
    public final z52 d;
    public final z52 e;
    public final z52 f;

    public void v97(sy p0,ae6 p1){
       super();
       this.b = new ArrayList();
       p1.getClass();
       this.a = p1.e;
       this.c = p1.a;
       qy oqy = p1.b.a();
       this.d = oqy;
       qy oqy1 = p1.c.a();
       this.e = oqy1;
       qy oqy2 = p1.d.a();
       this.f = oqy2;
       p0.f(oqy);
       p0.f(oqy1);
       p0.f(oqy2);
       oqy.a(this);
       oqy1.a(this);
       oqy2.a(this);
    }
    public final void b(){
       int i = 0;
       while (true) {
          v97 tb = this.b;
          if (i < tb.size()) {
             tb.get(i).b();
             i = i + 1;
          }else {
             break ;
          }
       }
       return;
    }
    public final void c(List p0,List p1){
    }
    public final void f(my p0){
       this.b.add(p0);
    }
}

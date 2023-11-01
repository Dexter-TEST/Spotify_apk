package p.fd6;
import p.r95;
import p.my;
import p.bw3;
import p.sy;
import p.wd6;
import java.lang.Object;
import android.graphics.Path;
import p.o93;
import java.lang.Class;
import p.md6;
import p.a27;
import java.util.List;
import p.qy;
import java.util.ArrayList;
import p.or0;
import p.v97;
import p.iz5;
import android.graphics.Path$FillType;

public final class fd6 implements r95, my	// class@0015aa from classes.dex
{
    public final Path a;
    public final boolean b;
    public final bw3 c;
    public final md6 d;
    public boolean e;
    public final o93 f;

    public void fd6(bw3 p0,sy p1,wd6 p2){
       super();
       this.a = new Path();
       this.f = new o93();
       p2.getClass();
       this.b = p2.d;
       this.c = p0;
       md6 omd6 = new md6(p2.c.b);
       this.d = omd6;
       p1.f(omd6);
       omd6.a(this);
    }
    public final void b(){
       this.e = false;
       this.c.invalidateSelf();
    }
    public final void c(List p0,List p1){
       ArrayList uArrayList1;
       p1 = null;
       int i = 0;
       while (true) {
          ArrayList uArrayList = p0;
          if (i < uArrayList.size()) {
             or0 oor0 = uArrayList.get(i);
             if (oor0 instanceof v97) {
                or0 oor01 = oor0;
                if (oor01.c == 1) {
                   this.f.a.add(oor01);
                   oor01.f(this);
                }else if(oor0 instanceof iz5){
                   if (p1 == null) {
                      uArrayList1 = new ArrayList();
                   }
                   uArrayList1.add(oor0);
                }
             }else {
             }
             i = i + 1;
          }else {
             break ;
          }
       }
       p0.j = p1;
       return;
    }
    public final Path d(){
       Path path;
       fd6 ta = this.a;
       if (this.e != null) {
          return ta;
       }
       ta.reset();
       if (this.b != null) {
          this.e = true;
          return ta;
       }else if((path = this.d.e()) == null){
          return ta;
       }else {
          ta.set(path);
          ta.setFillType(Path$FillType.EVEN_ODD);
          this.f.a(ta);
          this.e = true;
          return ta;
       }
    }
}

package p.po6;
import p.qy;
import p.z52;
import java.util.List;
import java.util.Collections;
import android.graphics.PointF;
import java.lang.Object;
import p.ph3;
import java.lang.Float;
import java.util.ArrayList;
import p.my;

public final class po6 extends qy	// class@0022a0 from classes.dex
{
    public final PointF h;
    public final PointF i;
    public final qy j;
    public final qy k;

    public void po6(z52 p0,z52 p1){
       super(Collections.emptyList());
       this.h = new PointF();
       this.i = new PointF();
       this.j = p0;
       this.k = p1;
       this.h(this.d);
    }
    public final Object e(){
       po6 th = this.h;
       po6 ti = this.i;
       ti.set(th.x, 0);
       ti.set(ti.x, th.y);
       return ti;
    }
    public final Object f(ph3 p0,float p1){
       po6 th = this.h;
       po6 ti = this.i;
       ti.set(th.x, 0);
       ti.set(ti.x, th.y);
       return ti;
    }
    public final void h(float p0){
       po6 tj = this.j;
       tj.h(p0);
       po6 tk = this.k;
       tk.h(p0);
       this.h.set(tj.e().floatValue(), tk.e().floatValue());
       int i = 0;
       while (true) {
          qy ta = this.a;
          if (i < ta.size()) {
             ta.get(i).b();
             i++;
          }else {
             break ;
          }
       }
       return;
    }
}

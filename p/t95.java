package p.t95;
import p.ph3;
import p.sv3;
import android.graphics.PointF;
import android.view.animation.Interpolator;
import java.lang.Float;
import p.mf7;
import android.graphics.Path;

public final class t95 extends ph3	// class@002728 from classes.dex
{
    public Path q;
    public final ph3 r;

    public void t95(sv3 p0,ph3 p1){
       super(p0, p1.b, p1.c, p1.d, p1.e, p1.f, p1.g, p1.h);
       this.r = p1;
       this.d();
    }
    public final void d(){
       ph3 tc1;
       ph3 tc = this.c;
       ph3 tb = this.b;
       tc = (tc != null && (tb != null && tb.equals(tc.x, tc.y)))? 1: 0;
       if (tb != null && ((tc1 = this.c) != null && !tc)) {
          t95 tr = this.r;
          ph3 o = tr.o;
          tc = tr.p;
          Path path = new Path();
          path.moveTo(tb.x, tb.y);
          if (o != null && tc != null) {
             int i = 0;
             if ((i - o.length()) || (i - tc.length())) {
                PointF x = tc1.x;
                PointF y = tc1.y;
                path.cubicTo((o.x + tb.x), (tb.y + o.y), (x + tc.x), (y + tc.y), x, y);
             label_0075 :
                this.q = path;
             }
          }
          path.lineTo(tc1.x, tc1.y);
          goto label_0075 ;
       }
       return;
    }
}

package p.u95;
import p.qh3;
import java.util.List;
import android.graphics.PointF;
import android.graphics.PathMeasure;
import p.ph3;
import java.lang.Object;
import p.t95;
import android.graphics.Path;

public final class u95 extends qh3	// class@00286b from classes.dex
{
    public final PointF h;
    public final float[] i;
    public final PathMeasure j;
    public t95 k;

    public void u95(List p0){
       super(p0);
       this.h = new PointF();
       float[] uofloatArray = new float[2];
       this.i = uofloatArray;
       this.j = new PathMeasure();
    }
    public final Object f(ph3 p0,float p1){
       t95 q;
       t95 ot95 = p0;
       if ((q = ot95.q) == null) {
          p0 = p0.b;
       }else {
          u95 tj = this.j;
          if (this.k != ot95) {
             tj.setPath(q, false);
             this.k = ot95;
          }
          u95 ti = this.i;
          tj.getPosTan((tj.getLength() * p1), ti, null);
          u95 th = this.h;
          th.set(ti[0], ti[1]);
       }
       return p0;
    }
}

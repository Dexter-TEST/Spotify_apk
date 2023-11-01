package p.cv6;
import p.bz;
import p.bw3;
import p.sy;
import p.yd6;
import android.graphics.Paint$Cap;
import android.graphics.Paint$Join;
import p.qd;
import p.rd;
import java.util.List;
import p.qy;
import p.my;
import android.graphics.Canvas;
import android.graphics.Matrix;
import p.ij0;
import p.ph3;
import android.graphics.Paint;

public final class cv6 extends bz	// class@001287 from classes.dex
{
    public final boolean q;
    public final qy r;

    public void cv6(bw3 p0,sy p1,yd6 p2){
       Paint$Cap sQUARE;
       Paint$Join join;
       Paint$Join bEVEL;
       yd6 f = p2.f;
       void ovoid = null;
       if (f == null) {
          throw ovoid;
       }
       int i = f - 1;
       int i1 = 1;
       if (i) {
          sQUARE = (i != i1)? Paint$Cap.SQUARE: Paint$Cap.ROUND;
       }else {
          sQUARE = Paint$Cap.BUTT;
       }
       Paint$Cap uCap = sQUARE;
       if ((f = p2.g) != null) {
          if (i = f - 1) {
             if (i != i1) {
                if (i != 2) {
                   join = ovoid;
                label_002d :
                   super(p0, p1, uCap, join, p2.h, p2.d, p2.e, p2.b, p2.a);
                   this.q = p2.i;
                   qy oqy = p2.c.a();
                   this.r = oqy;
                   oqy.a(this);
                   p1.f(oqy);
                   return;
                }else {
                   bEVEL = Paint$Join.BEVEL;
                }
             }else {
                bEVEL = Paint$Join.ROUND;
             }
          }else {
             bEVEL = Paint$Join.MITER;
          }
          join = bEVEL;
          goto label_002d ;
       }else {
          throw ovoid;
       }
    }
    public final void e(Canvas p0,Matrix p1,int p2){
       if (this.q != null) {
          return;
       }
       cv6 tr = this.r;
       this.i.setColor(tr.i(tr.b(), tr.c()));
       super.e(p0, p1, p2);
       return;
    }
}

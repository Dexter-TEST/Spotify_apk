package p.ur5;
import java.lang.Object;
import p.sr5;
import android.graphics.PointF;
import p.tr5;
import java.lang.Math;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Class;
import android.view.View;
import p.zr5;
import p.vr5;
import java.lang.String;
import android.util.Log;
import p.uk3;
import p.hr5;
import p.yr5;

public abstract class ur5	// class@002908 from classes.dex
{
    public int a;
    public RecyclerView b;
    public hr5 c;
    public boolean d;
    public boolean e;
    public View f;
    public final sr5 g;

    public void ur5(){
       super();
       this.a = -1;
       this.g = new sr5();
    }
    public PointF a(int p0){
       ur5 tc = this.c;
       if (tc instanceof tr5) {
          return tc.d(p0);
       }
       return null;
    }
    public final void b(int p0,int p1){
       PointF pointF;
       zr5 ozr5;
       PointF pointF1;
       ur5 tb = this.b;
       boolean i = -1;
       if (this.a == i || tb == null) {
          this.d();
       }
       int[] ointArray = null;
       int i1 = 0;
       if (this.d != null && (this.f == null && (this.c != null && (pointF = this.a(this.a)) != null))) {
          PointF x = pointF.x;
          if ((i1 - x) || (i1 - pointF.y)) {
             tb.f0((int)Math.signum(x), (int)Math.signum(pointF.y), ointArray);
          }
       }
       boolean b = false;
       this.d = b;
       ur5 tf = this.f;
       ur5 tg = this.g;
       if (tf != null) {
          this.b.getClass();
          if ((ozr5 = RecyclerView.M(tf)) != null) {
             i = ozr5.e();
          }
          if (i == this.a) {
             this.c(this.f, tb.y0, tg);
             tg.a(tb);
             this.d();
          }else {
             Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
             this.f = ointArray;
          }
       }
       if (this.e != null) {
          i = this;
          if (!i.b.E.I()) {
             i.d();
          }else {
             uk3 n = i.n;
             p0 = n - p0;
             if (((n * p0)) <= 0) {
                p0 = 0;
             }
             i.n = p0;
             n = i.o;
             p1 = n - p1;
             if (((n * p1)) <= 0) {
                p1 = 0;
             }
             i.o = p1;
             if (!p0 && !p1) {
                if ((pointF1 = i.a(i.a)) != null) {
                   PointF x1 = pointF1.x;
                   if ((i1 - x1) || (i1 - pointF1.y)) {
                      float f = (float)Math.sqrt((double)((pointF1.y * pointF1.y) + (x1 * x1)));
                      float f1 = pointF1.x / f;
                      pointF1.x = f1;
                      float f2 = pointF1.y / f;
                      pointF1.y = f2;
                      i.j = pointF1;
                      i.n = (int)(f1 * 10000.00f);
                      i.o = (int)(f2 * 10000.00f);
                      tg.a = (int)((float)i.n * 0x3f99999a);
                      tg.b = (int)((float)i.o * 0x3f99999a);
                      tg.c = (int)((float)i.g(0x2710) * 0x3f99999a);
                      tg.e = i.h;
                      tg.f = true;
                   }
                }
                tg.d = i.a;
                i.d();
             }
          }
          if (tg.d >= null) {
             b = true;
          }
          tg.a(tb);
          if (b && this.e != null) {
             this.d = true;
             tb.v0.b();
          }
       }
       return;
    }
    public abstract void c(View p0,vr5 p1,sr5 p2);
    public final void d(){
       if (this.e == null) {
          return;
       }
       this.e = false;
       boolean b = this;
       b.o = 0;
       b.n = 0;
       b.j = null;
       this.b.y0.a = -1;
       this.f = null;
       this.a = -1;
       this.d = false;
       ur5 tc = this.c;
       if (tc.v == this) {
          tc.v = null;
       }
       this.c = null;
       this.b = null;
       return;
    }
}

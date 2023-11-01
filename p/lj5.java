package p.lj5;
import p.id4;
import java.lang.Integer;
import p.x3;
import java.lang.Object;
import java.lang.Float;
import p.nj5;
import p.mj5;
import p.fe;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import android.content.Context;
import android.view.animation.PathInterpolator;
import p.xj0;

public final class lj5 implements id4	// class@001d67 from classes.dex
{
    public final nj5 a;
    public fe b;
    public fe c;
    public fe t;
    public static final x3 v;
    public static final x3 w;
    public static final x3 x;

    static {
       lj5.v = new x3(Integer.valueOf(0));
       Float uFloat = Float.valueOf(0x3f19999a);
       lj5.w = new x3(uFloat);
       lj5.x = new x3(uFloat);
    }
    public void lj5(nj5 p0){
       super();
       this.a = p0;
    }
    public final void a(float p0){
       lj5 ta = this.a;
       ta.b.setScaleX(this.b.a(p0));
       ta.b.setScaleY(this.b.a(p0));
       if (!ta.d.isEmpty()) {
          Iterator iterator = ta.d.iterator();
          while (iterator.hasNext()) {
             iterator.next().setAlpha(this.c.a(p0));
          }
       }
       if (!ta.c.isEmpty()) {
          Iterator iterator1 = ta.c.iterator();
          while (iterator1.hasNext()) {
             iterator1.next().setAlpha(this.t.a(p0));
          }
       }
       return;
    }
    public final void b(){
       float alpha;
       float f2;
       lj5 ta = this.a;
       PathInterpolator pathInterpol = xj0.w0(ta.b.getContext());
       mj5 e = ta.e;
       fe v9 = new fe(0, 0x3f800000, ta.b.getScaleX(), ta.a, pathInterpol);
       this.b = v9;
       if (!ta.d.isEmpty()) {
          alpha = ta.d.get(0).getAlpha();
          float f = 0;
          float f1 = 0x3f800000;
          f2 = (e != null)? lj5.w.a.floatValue(): alpha;
          v9 = new fe(f, f1, alpha, f2, pathInterpol);
          this.c = v10;
       }
       if (!ta.c.isEmpty()) {
          alpha = ta.c.get(0).getAlpha();
          f2 = (e != null)? lj5.x.a.floatValue(): alpha;
          v9 = new fe(0, 0x3f800000, alpha, f2, pathInterpol);
          this.t = ta;
       }
       return;
    }
    public final int d(){
       return lj5.v.a.intValue();
    }
}

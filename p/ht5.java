package p.ht5;
import p.id4;
import java.lang.Integer;
import p.x3;
import java.lang.Object;
import p.nj5;
import p.mj5;
import p.fe;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import android.content.Context;
import android.view.animation.PathInterpolator;
import p.xj0;

public final class ht5 implements id4	// class@0018bc from classes.dex
{
    public final nj5 a;
    public fe b;
    public fe c;
    public fe t;
    public static final x3 v;

    static {
       ht5.v = new x3(Integer.valueOf(200));
    }
    public void ht5(nj5 p0){
       super();
       this.a = p0;
    }
    public final void a(float p0){
       ht5 ta = this.a;
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
       ht5 ta = this.a;
       PathInterpolator pathInterpol = xj0.w0(ta.b.getContext());
       fe v8 = new fe(0, 0x3f800000, ta.b.getScaleX(), 0x3f800000, pathInterpol);
       this.b = v8;
       if (!ta.d.isEmpty()) {
          v8 = new fe(0, 0x3f800000, ta.d.get(0).getAlpha(), 0x3f800000, pathInterpol);
          this.c = v9;
       }
       if (!ta.c.isEmpty()) {
          v8 = new fe(0, 0x3f800000, ta.c.get(0).getAlpha(), 0x3f800000, pathInterpol);
          this.t = v9;
       }
       return;
    }
    public final int d(){
       return ht5.v.a.intValue();
    }
}

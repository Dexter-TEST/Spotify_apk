package p.og1;
import p.kd3;
import p.q65;
import p.an5;
import p.zr5;
import java.lang.Object;
import android.view.View;
import java.lang.Float;
import p.wh7;
import p.jh7;
import p.aw1;
import java.lang.Integer;
import p.vs;
import android.graphics.drawable.Drawable;
import p.dh7;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewGroup;

public final class og1 extends kd3	// class@002113 from classes.dex
{
    public int d;
    public int e;
    public boolean f;
    public final an5 g;
    public final q65 h;

    public void og1(q65 p0){
       super();
       this.d = -1;
       this.e = -1;
       this.f = true;
       this.g = new an5();
       this.h = p0;
    }
    public final void a(zr5 p0){
       og1 td;
       og1 te;
       zr5 a = p0.a;
       int i = 0x7f0a0418;
       Object tag = a.getTag(i);
       if (tag instanceof Float) {
          jh7.s(a, tag.floatValue());
       }
       a.setTag(i, null);
       a.setTranslationX(0);
       a.setTranslationY(0);
       if ((td = this.d) != -1 && ((te = this.e) != -1 && td != te)) {
          aw1 te1 = new aw1();
          te1.c = null;
          te1.a = Integer.valueOf(td);
          te1.b = Integer.valueOf(this.e);
          this.g.onNext(te1.d());
       }
       dh7.q(p0.a, null);
       this.d = -1;
       this.e = -1;
       return;
    }
    public final void e(RecyclerView p0,zr5 p1,float p2,float p3,boolean p4){
       View childAt;
       float f = (float)p1.a.getTop() + p3;
       p1 = p1.a;
       float f1 = (float)p1.getHeight() + f;
       float f2 = 0;
       if ((f - f2) < 0) {
          p3 = 0;
       }else if(((float)p0.getHeight() - f1) > 0){
          p3 = (float)((p0.getHeight() - p1.getHeight()) - p1.getTop());
       }
       if (p4 && p1.getTag(R.id.item_touch_helper_previous_elevation) == null) {
          Float uFloat = Float.valueOf(jh7.i(p1));
          int childCount = p0.getChildCount();
          int i = 0;
          while (i < childCount) {
             if ((childAt = p0.getChildAt(i)) != p1) {
                float f3 = jh7.i(childAt);
                if ((f2 - f3) > 0) {
                   f2 = f3;
                }
             }
             i = i + 1;
          }
          jh7.s(p1, (f2 + 0x3f800000));
          p1.setTag(R.id.item_touch_helper_previous_elevation, uFloat);
       }
       p1.setTranslationX(p2);
       p1.setTranslationY(p3);
       return;
    }
}

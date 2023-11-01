package p.od3;
import p.id4;
import java.lang.Integer;
import p.x3;
import java.lang.Object;
import java.lang.Float;
import p.dg1;
import p.uv1;
import java.util.ArrayList;
import java.util.List;
import android.view.View;
import p.fe;
import android.view.animation.PathInterpolator;

public final class od3 implements id4	// class@0020fa from classes.dex
{
    public final uv1 a;
    public final ArrayList b;
    public final ArrayList c;
    public static final x3 t;
    public static final x3 v;
    public static final x3 w;
    public static final x3 x;
    public static final PathInterpolator y;
    public static final x3 z;

    static {
       od3.t = new x3(Integer.valueOf(0));
       od3.v = new x3(Integer.valueOf(100));
       od3.w = new x3(Integer.valueOf(16));
       od3.x = new x3(Float.valueOf(0.18f));
       od3.y = dg1.c;
       od3.z = new x3(Float.valueOf(0));
    }
    public void od3(uv1 p0){
       super();
       this.b = new ArrayList();
       this.c = new ArrayList();
       this.a = p0;
    }
    public final void a(float p0){
       od3 ta = this.a;
       List list = ta.j();
       int i = 0;
       while (true) {
          List list1 = list;
          if (i < list1.size()) {
             View view = list1.get(i);
             view.setTranslationY(this.b.get(i).a(p0));
             view.setAlpha(this.c.get(i).a(p0));
             i = i + 1;
          }else {
             break ;
          }
       }
       ta.o();
       return;
    }
    public final void b(){
       od3 ood3 = this;
       od3 a = ood3.a;
       List list = a.j();
       float f = (float)this.d();
       od3 b = ood3.b;
       b.clear();
       od3 c = ood3.c;
       c.clear();
       int i = 0;
       while (true) {
          List list1 = list;
          if (i < list1.size()) {
             int i1 = list1.size() - i;
             i1 = i1 - 1;
             int i2 = od3.w.a.intValue() * i1;
             i2 = i2 + od3.v.a.intValue();
             View view = list1.get(i);
             float f1 = (float)od3.t.a.intValue() / f;
             float f2 = (float)i2 / f;
             float f3 = f1;
             float f4 = f2;
             PathInterpolator pathInterpol = od3.y;
             fe v9 = new fe(f3, f4, view.getAlpha(), od3.z.a.floatValue(), pathInterpol);
             c.add(v9);
             float translationY = view.getTranslationY();
             float f5 = a.n() * od3.x.a.floatValue();
             v9 = new fe(f3, f4, translationY, f5, pathInterpol);
             b.add(v9);
             i = i + 1;
          }else {
             break ;
          }
       }
       return;
    }
    public final int d(){
       return (((this.a.j().size() - 1) * od3.w.a.intValue()) + (od3.v.a.intValue() + od3.t.a.intValue()));
    }
}

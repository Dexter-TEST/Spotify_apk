package p.nd3;
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

public final class nd3 implements id4	// class@001fb6 from classes.dex
{
    public final uv1 a;
    public final ArrayList b;
    public final ArrayList c;
    public static final x3 A;
    public static final x3 B;
    public static final x3 t;
    public static final x3 v;
    public static final x3 w;
    public static final x3 x;
    public static final x3 y;
    public static final PathInterpolator z;

    static {
       nd3.t = new x3(Integer.valueOf(0));
       nd3.v = new x3(Integer.valueOf(266));
       nd3.w = new x3(Integer.valueOf(16));
       nd3.x = new x3(Float.valueOf(0.18f));
       Float uFloat = Float.valueOf(0);
       nd3.y = new x3(uFloat);
       nd3.z = dg1.d;
       nd3.A = new x3(uFloat);
       nd3.B = new x3(Float.valueOf(0x3f800000));
    }
    public void nd3(uv1 p0){
       super();
       this.b = new ArrayList();
       this.c = new ArrayList();
       this.a = p0;
    }
    public final void a(float p0){
       nd3 ta = this.a;
       List list = ta.j();
       int i = 0;
       while (true) {
          List list1 = list;
          if (i < list1.size()) {
             try{
                View view = list1.get(i);
                view.setTranslationY(this.b.get(i).a(p0));
                view.setAlpha(this.c.get(i).a(p0));
                i = i + 1;
             }catch(java.lang.IndexOutOfBoundsException e0){
                break ;
             }
          }else {
          }
       }
       e0.o();
       return;
    }
    public final void b(){
       nd3 ond3 = this;
       nd3 a = ond3.a;
       List list = a.j();
       float f = a.n();
       nd3 b = ond3.b;
       b.clear();
       nd3 c = ond3.c;
       c.clear();
       float f1 = (float)this.d();
       int i = 0;
       while (true) {
          List list1 = list;
          if (i < list1.size()) {
             int fe i1 = list1.size() - i;
             i1 = i1 - 1;
             int i2 = nd3.w.a.intValue() * i1;
             i2 = i2 + nd3.t.a.intValue();
             float f2 = (float)i2 / f1;
             x3 a1 = nd3.v.a;
             float f3 = (float)a1.intValue() / f1;
             PathInterpolator z = nd3.z;
             i1 = new fe(f2, f3, nd3.A.a.floatValue(), nd3.B.a.floatValue(), z);
             c.add(i1);
             f2 = (float)a1.intValue() / f1;
             f3 = nd3.x.a.floatValue() * f;
             float f4 = nd3.y.a.floatValue() * f;
             fe i11 = new fe(f2, f2, f3, f4, z);
             b.add(i1);
             i = i + 1;
          }else {
             break ;
          }
       }
       return;
    }
    public final int d(){
       List list = this.a.j();
       return ((nd3.w.a.intValue() * (list.size() - 1)) + (nd3.v.a.intValue() * list.size()));
    }
}

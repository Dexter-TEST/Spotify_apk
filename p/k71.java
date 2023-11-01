package p.k71;
import java.lang.Runnable;
import java.lang.Object;
import java.util.ArrayList;
import java.util.Iterator;
import p.zr5;
import p.q71;
import java.lang.Class;
import android.view.ViewPropertyAnimator;
import android.view.View;
import p.dr5;
import p.l71;
import android.animation.Animator$AnimatorListener;
import p.o71;
import p.n71;
import p.p71;
import p.m71;
import p.in;
import p.kn;
import p.eb1;
import java.util.List;
import java.util.Collections;
import p.xl3;

public final class k71 implements Runnable	// class@001bba from classes.dex
{
    public final int a;
    public final Object b;
    public final Object c;

    public void k71(Object p0,int p1,Object p2){
       this.a = p1;
       this.c = p0;
       this.b = p2;
       super();
    }
    public final void run(){
       Iterator iterator;
       p71 op71;
       p71 a;
       ViewPropertyAnimator viewProperty;
       dr5 uodr5;
       ViewPropertyAnimator viewProperty1;
       k71 ok71 = this;
       float f = 0x3f800000;
       float f1 = 0;
       k71 c = ok71.c;
       k71 b = ok71.b;
       switch (ok71.a){
           case 0:
             iterator = b.iterator();
             while (iterator.hasNext()) {
                op71 = iterator.next();
                k71 ok711 = c;
                a = op71.a;
                ok711.getClass();
                zr5 a1 = a.a;
                int i = op71.d - op71.b;
                int i1 = op71.e - op71.c;
                if (i) {
                   a1.animate().translationX(f1);
                }
                if (i1) {
                   a1.animate().translationY(f1);
                }
                viewProperty = a1.animate();
                ok711.p.add(a);
                m71 v13 = new m71(ok711, a, i, a1, i1, viewProperty);
                viewProperty.setDuration(ok711.e).setListener(v13).start();
             }
             b.clear();
             c.m.remove(b);
             return;
             break;
           case 1:
             iterator = b.iterator();
             while (iterator.hasNext()) {
                o71 oo71 = iterator.next();
                k71 ok712 = c;
                ok712.getClass();
                o71 a2 = oo71.a;
                a = 0;
                View view = (a2 == null)? a: a2.a;
                zr5 ozr5 = ((a2 = oo71.b) != null)? a2.a: a;
                q71 r = ok712.r;
                dr5 f2 = ok712.f;
                if (view != null) {
                   viewProperty = view.animate().setDuration(f2);
                   r.add(oo71.a);
                   int i2 = oo71.e - oo71.c;
                   viewProperty.translationX((float)i2);
                   i2 = oo71.f - oo71.d;
                   viewProperty.translationY((float)i2);
                   uodr5 = f2;
                   viewProperty1 = viewProperty;
                   viewProperty.alpha(f1).setListener(new n71(ok712, oo71, viewProperty1, view, 0)).start();
                }else {
                   uodr5 = f2;
                }
                if (ozr5 != null) {
                   viewProperty1 = ozr5.animate();
                   r.add(oo71.b);
                   n71 on71 = viewProperty;
                   n71 on711 = viewProperty;
                   on71 = new n71(ok712, oo71, viewProperty1, ozr5, 1);
                   viewProperty1.translationX(f1).translationY(f1).setDuration(uodr5).alpha(0x3f800000).setListener(on711).start();
                }else {
                   r = 0x3f800000;
                }
                op71 = 0x3f800000;
             }
             b.clear();
             c.n.remove(b);
             return;
             break;
           case 2:
             iterator = b.iterator();
             while (iterator.hasNext()) {
                zr5 ozr51 = iterator.next();
                k71 ok713 = c;
                ok713.getClass();
                zr5 a3 = ozr51.a;
                ViewPropertyAnimator viewProperty2 = a3.animate();
                ok713.o.add(ozr51);
                viewProperty2.alpha(f).setDuration(ok713.c).setListener(new l71(ok713, ozr51, a3, viewProperty2)).start();
             }
             b.clear();
             c.l.remove(b);
             return;
             break;
           default:
             in v = c.v;
             if (v.g == c.c) {
                in b1 = c.b;
                v.e = b1;
                v.f = Collections.unmodifiableList(b1);
                b.a(v.a);
                v.a(c.t);
             }
       }
       return;
    }
}

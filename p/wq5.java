package p.wq5;
import java.lang.Runnable;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.Object;
import android.view.View;
import p.q71;
import java.util.ArrayList;
import java.util.Iterator;
import p.dr5;
import p.zr5;
import android.view.ViewPropertyAnimator;
import p.l71;
import android.animation.Animator$AnimatorListener;
import java.util.Collection;
import p.k71;
import p.p71;
import p.wh7;
import p.dh7;
import p.o71;
import java.lang.Math;

public final class wq5 implements Runnable	// class@002b89 from classes.dex
{
    public final int a;
    public final RecyclerView b;

    public void wq5(RecyclerView p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void run(){
       RecyclerView g0;
       boolean b2;
       dr5 d;
       ArrayList uArrayList;
       k71 ok71;
       wq5 owq5 = this;
       wq5 b = owq5.b;
       boolean b1 = true;
       switch (owq5.a){
           case 0:
             if (b.L != null && !b.isLayoutRequested()) {
                if (b.J == null) {
                   b.requestLayout();
                }else if(b.O != null){
                   b.N = b1;
                }else {
                   b.o();
                }
             }
             break;
           default:
             if ((g0 = b.g0) != null) {
                q71 h = g0.h;
                int i = h.isEmpty() ^ b1;
                q71 j = g0.j;
                int i1 = j.isEmpty() ^ b1;
                q71 k = g0.k;
                int i2 = k.isEmpty() ^ b1;
                q71 i3 = g0.i;
                int i4 = i3.isEmpty() ^ b1;
                if (i || (i1 || (i4 || i2))) {
                   Iterator iterator = h.iterator();
                   while (true) {
                      d = g0.d;
                      if (iterator.hasNext()) {
                         zr5 ozr5 = iterator.next();
                         zr5 a = ozr5.a;
                         ViewPropertyAnimator viewProperty = a.animate();
                         g0.q.add(ozr5);
                         viewProperty.setDuration(d).alpha(0).setListener(new l71(g0, ozr5, viewProperty, a)).start();
                         iterator = iterator;
                         d = 1;
                      }else {
                         break ;
                      }
                   }
                   h.clear();
                   if (i1) {
                      uArrayList = new ArrayList();
                      uArrayList.addAll(j);
                      g0.m.add(uArrayList);
                      j.clear();
                      int i5 = 0;
                      ok71 = new k71(g0, i5, uArrayList);
                      if (i) {
                         dh7.n(uArrayList.get(i5).a.a, ok71, d);
                      }else {
                         ok71.run();
                      }
                   }
                   if (i2) {
                      uArrayList = new ArrayList();
                      uArrayList.addAll(k);
                      g0.n.add(uArrayList);
                      k.clear();
                      ok71 = new k71(g0, 1, uArrayList);
                      if (i) {
                         dh7.n(uArrayList.get(0).a.a, ok71, d);
                      }else {
                         ok71.run();
                      }
                   }
                   if (i4) {
                      uArrayList = new ArrayList();
                      uArrayList.addAll(i3);
                      g0.l.add(uArrayList);
                      i3.clear();
                      ok71 = new k71(g0, 2, uArrayList);
                      if (!i && (!i1 && !i2)) {
                         ok71.run();
                      }else {
                         long l = 0;
                         if (!i) {
                            d = l;
                         }
                         dr5 e = (i1)? g0.e: l;
                         if (i2) {
                            l = g0.f;
                         }
                         dh7.n(uArrayList.get(0).a, ok71, (Math.max(e, l) + d));
                      label_0135 :
                         b.E0 = b2;
                         return;
                      }
                   }
                }
             }
             b2 = false;
             goto label_0135 ;
       }
       return;
    }
}

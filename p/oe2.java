package p.oe2;
import androidx.viewpager2.adapter.a;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import android.view.ViewParent;
import android.view.View;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.lang.String;
import androidx.fragment.app.o;
import p.qv3;
import p.yq5;
import java.lang.Long;
import androidx.fragment.app.Fragment;
import java.lang.Class;
import androidx.fragment.app.a;
import p.uj3;
import java.util.ArrayList;

public final class oe2	// class@002102 from classes.dex
{
    public me2 a;
    public ne2 b;
    public zj3 c;
    public ViewPager2 d;
    public long e;
    public final a f;

    public void oe2(a p0){
       this.f = p0;
       super();
       this.e = -1;
    }
    public static ViewPager2 a(RecyclerView p0){
       ViewParent parent = p0.getParent();
       if (parent instanceof ViewPager2) {
          return parent;
       }
       throw new IllegalStateException("Expected ViewPager2 instance. Got: "+parent);
    }
    public final void b(boolean p0){
       Fragment uFragment;
       oe2 tf = this.f;
       if (tf.v.L()) {
          return;
       }
       if (this.d.getScrollState()) {
          return;
       }
       a w = tf.w;
       int i = (!w.j())? 1: 0;
       if (!i && tf.d()) {
          if ((i = this.d.getCurrentItem()) >= tf.d()) {
             return;
          }else {
             long l = (long)i;
             if (!(l - this.e) && !p0) {
                return;
             }else {
                Long longx = null;
                if ((uFragment = w.f(l, longx)) != null && uFragment.isAdded()) {
                   this.e = l;
                   a v = tf.v;
                   v.getClass();
                   a uoa = new a(v);
                   int i1 = 0;
                   while (i1 < w.j()) {
                      l = w.g(i1);
                      Fragment uFragment1 = w.k(i1);
                      if (uFragment1.isAdded()) {
                         if (l - this.e) {
                            uoa.l(uFragment1, uj3.t);
                         }else {
                            longx = uFragment1;
                         }
                         boolean b = (!(l - this.e))? true: false;
                         uFragment1.setMenuVisibility(b);
                      }
                      i1 = i1 + 1;
                   }
                   if (longx != null) {
                      uoa.l(longx, uj3.v);
                   }
                   if (!uoa.a.isEmpty()) {
                      uoa.f();
                   }
                }
             }
          }
       }
       return;
    }
}

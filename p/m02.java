package p.m02;
import p.mr5;
import java.lang.Object;
import androidx.recyclerview.widget.RecyclerView;
import p.lt2;
import android.os.Parcelable;
import androidx.recyclerview.widget.LinearLayoutManager;
import p.ju2;
import p.bt2;
import com.spotify.hubs.liteintegration.HubsView;
import android.content.Context;
import android.view.View;
import p.ry7;
import java.lang.Math;
import p.y46;
import java.lang.String;
import p.co5;
import p.hr5;
import p.yq5;
import com.spotify.allboarding.allboardingimpl.search.SearchFragment;
import p.x86;
import com.spotify.search.view.BackKeyEditText;
import p.h76;
import android.text.Editable;
import p.pg;
import java.lang.CharSequence;
import io.reactivex.rxjava3.disposables.Disposable;
import androidx.lifecycle.b;
import p.mk7;
import java.util.Collection;
import io.reactivex.rxjava3.core.Single;
import p.si4;
import p.v86;
import p.yf2;
import io.reactivex.rxjava3.core.Scheduler;
import p.u86;
import p.ir0;
import p.o02;
import com.spotify.legacyglue.recyclerview.RecyclerViewFastScroller;
import android.animation.Animator;
import p.ox7;
import android.view.ViewTreeObserver;
import p.bv0;
import android.view.ViewTreeObserver$OnPreDrawListener;
import android.view.ViewGroup;
import p.oy;
import p.wh7;
import p.dh7;

public final class m02 extends mr5	// class@001dfa from classes.dex
{
    public final int a;
    public final Object b;

    public void m02(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final void a(RecyclerView p0,int p1){
    }
    public final void b(RecyclerView p0,int p1,int p2){
       int i2;
       o02 t;
       float f2;
       o02 v;
       yq5 adapter;
       SearchFragment i3;
       Editable text;
       String str1;
       x86 y;
       lt2 e;
       lt2 f4;
       RecyclerViewFastScroller g;
       float f = 0;
       int i = 2;
       String str = null;
       m02 tb = this.b;
       int i1 = 0;
       switch (this.a){
           case 0:
             p1 = p0.computeHorizontalScrollOffset();
             i2 = p0.computeVerticalScrollOffset();
             p2 = tb.s.computeVerticalScrollRange();
             o02 r = tb.r;
             o02 a = tb.a;
             i = (((p2 - r)) > 0 && r >= a)? true: false;
             tb.t = i;
             i = tb.s.computeHorizontalScrollRange();
             o02 q = tb.q;
             boolean b = (((i - q)) > 0 && q >= a)? true: false;
             tb.u = b;
             if ((t = tb.t) == null && !b) {
                if (tb.v != null) {
                   tb.k(i1);
                }
             }else if(t != null){
                float f1 = (float)r;
                tb.l = (int)((((f1 / 2.00f) + (float)i2) * f1) / (float)p2);
                tb.k = Math.min(r, ((r * r) / p2));
             }
             if (tb.u != null) {
                f2 = (float)q;
                tb.o = (int)((((f2 / 2.00f) + (float)p1) * f2) / (float)i);
                tb.n = Math.min(q, ((q * q) / i));
             }
             if ((v = tb.v) == null || v == 1) {
                tb.k(1);
             }
             break;
           case 1:
             co5.o(p0, "recyclerView");
             hr5 layoutManage = p0.getLayoutManager();
             if (layoutManage instanceof LinearLayoutManager) {
             }else {
                str1 = str;
             }
             if (layoutManage != null) {
                layoutManage = layoutManage.c1();
                i2 = ((adapter = p0.getAdapter()) != null)? adapter.d(): 0;
                if (layoutManage > ((i2 - 3) - 1)) {
                   x86 ox86 = tb.v();
                   if ((i3 = tb.I) != null) {
                      if ((text = i3.a().getText()) != null) {
                         str = text.toString();
                      }
                      str1 = "";
                      if (str == null) {
                         str = str1;
                      }
                      p2 = (!str.length())? 1: 0;
                      x86 a1 = ox86.A;
                      if (!p2 && ox86.B != null) {
                         mk7 omk7 = ((y = ox86.y) != null && !y.isDisposed())? 1: 0;
                         if (!omk7) {
                            omk7 = ((omk7 = a1.e()) != null && omk7.f == 1)? 1: 0;
                            if (omk7) {
                               omk7 = 1;
                            label_00dd :
                               if (p2) {
                                  if ((y = ox86.y) != null) {
                                     y.dispose();
                                  }
                                  if ((y = ox86.B) != null) {
                                     str1 = y;
                                  }
                                  if ((omk7 = a1.e()) != null && (omk7 = omk7.b) != null) {
                                     i1 = omk7.size();
                                  }
                                  ox86.y = ox86.v.f(i1, str1, str).map(new v86(ox86, str, 1)).subscribeOn(ox86.x).observeOn(ox86.w).subscribe(new u86(ox86, i));
                               }
                            }
                         }
                      }
                      p2 = 0;
                      goto label_00dd ;
                   }else {
                      co5.N("searchField");
                      throw str;
                   }
                }
             }
             return;
             break;
           case 2:
             if (tb.w != null && tb.D == null) {
                f2 = (float)ry7.u(tb.getContext());
                float f3 = Math.max(f, Math.min((float)p0.computeVerticalScrollOffset(), f2)) / f2;
                tb.w.a(f3);
             }
             return;
             break;
           case 3:
             if ((e = tb.e) != null && (f4 = tb.f) != null) {
                f4.b(e, tb.c.t0());
             }
             return;
             break;
           case 4:
             if ((e = tb.e) != null && (f4 = tb.f) != null) {
                f4.b(e, tb.c.t0());
             }
             return;
             break;
           default:
             if (tb.isEnabled()) {
                if (Math.abs(p2) > 15) {
                   if (tb.A == null) {
                      if ((g = tb.G) != null && g.isRunning()) {
                         tb.G.cancel();
                         tb.G = str;
                      }
                      tb.setVisibility(i1);
                      i2 = (ox7.y(tb))? - tb.getMeasuredWidth(): tb.getMeasuredWidth();
                      tb.setTranslationX((float)i2);
                      tb.setAlpha(f);
                      tb.getViewTreeObserver().addOnPreDrawListener(new bv0(i, tb));
                   }
                   tb.A = true;
                }
                if (tb.A != null) {
                   tb.c();
                   if (tb.v == null) {
                      tb.b();
                      RecyclerViewFastScroller y1 = tb.y;
                      if (!tb.a.getChildCount()) {
                         y1.b(f);
                      }else {
                         i = tb.a.computeVerticalScrollOffset();
                         if ((i2 = tb.a.computeVerticalScrollRange() - tb.a.computeVerticalScrollExtent()) > 0) {
                            f = (float)i / (float)i2;
                         }
                         y1.b(f);
                         dh7.k(tb);
                      }
                   }
                }
             }
             return;
       }
       return;
    }
}

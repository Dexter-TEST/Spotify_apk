package p.zj6;
import p.p55;
import p.am1;
import p.r55;
import p.s55;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.ak6;
import p.uf;
import android.view.ViewGroup;
import android.view.View;
import p.et0;
import p.ry7;
import androidx.recyclerview.widget.RecyclerView;
import p.o11;
import com.spotify.allboarding.allboardingimpl.utils.PickerCollapsingTitleBar;
import p.oy6;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p.yq5;
import p.dr5;
import p.q71;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import android.widget.LinearLayout;
import p.wh7;
import p.gh7;
import p.j86;
import android.view.View$OnLayoutChangeListener;
import android.content.res.Resources;
import java.lang.NullPointerException;
import p.db;
import p.n46;
import p.k46;
import p.fl3;
import java.util.List;
import java.lang.Runnable;
import p.kn;
import java.util.Collection;
import java.util.Iterator;
import java.lang.Iterable;
import p.j46;
import p.k5;
import java.lang.CharSequence;
import android.widget.TextView;
import p.k8;
import android.view.View$OnClickListener;
import android.view.ViewParent;

public final class zj6 implements p55	// class@002f0d from classes.dex
{
    public final wf2 a;
    public oy6 b;
    public final ak6 c;

    public void zj6(am1 p0,r55 p1,s55 p2){
       co5.o(p0, "encoreEntryPoint");
       super();
       this.a = p2;
       p0 = p0.a;
       co5.o(p0, "<this>");
       this.c = new ak6(new uf(0, p0), p1);
    }
    public final boolean a(ViewGroup p0){
       View view1;
       View view2;
       View view3;
       boolean b = false;
       if (this.b != null) {
          return b;
       }
       View view = et0.n(p0, R.layout.single_item_picker, p0, b);
       int i = 0x7f0a0417;
       if ((view1 = ry7.q(view, i)) != null) {
          i = 0x7f0a05b3;
          if ((view2 = ry7.q(view, i)) != null) {
             o11 oo11 = o11.c(view2);
             i = 0x7f0a05b4;
             if ((view3 = ry7.q(view, i)) != null) {
                oy6 i1 = new oy6(view, view1, oo11, view3, 7);
                this.b = i;
                oy6 v = i.v;
                co5.l(v, "binding.singleItemPickerCollapsingTitle");
                v.setSearchVisible(b);
                v.setFiltersVisible(b);
                RecyclerView recyclerView = this.e();
                recyclerView.setAdapter(this.c);
                dr5 itemAnimator = recyclerView.getItemAnimator();
                co5.j(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
                itemAnimator.g = b;
                zj6 tb = this.b;
                co5.i(tb);
                o11 c = tb.t.c;
                co5.l(c, "binding.singleItemPickerActionButtons.actionButton");
                c.setVisibility(b);
                tb = this.b;
                co5.i(tb);
                c = tb.t.b;
                co5.l(c, "binding.singleItemPickerActionButtons.root");
                if (gh7.c(c) && !c.isLayoutRequested()) {
                   RecyclerView recyclerView1 = this.e();
                   recyclerView1.setPadding(recyclerView1.getPaddingLeft(), recyclerView1.getPaddingTop(), recyclerView1.getPaddingRight(), c.getHeight());
                }else {
                   c.addOnLayoutChangeListener(new j86(3, this));
                }
                tb = this.b;
                co5.i(tb);
                p0.addView(tb.b);
                return true;
             }
          }
       }
       throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
    public final void b(db p0){
       co5.o(p0, "viewEffect");
    }
    public final boolean c(n46 p0){
       co5.o(p0, "model");
       return p0 instanceof k46;
    }
    public final void d(n46 p0,boolean p1){
       boolean b;
       k46 t;
       k5 a;
       co5.o(p0, "model");
       if (!p0 instanceof k46) {
          return;
       }
       zj6 tb = this.b;
       co5.i(tb);
       oy6 v = tb.v;
       co5.l(v, "binding.singleItemPickerCollapsingTitle");
       v.setTitle(p0.a);
       k46 c = p0.c;
       this.c.t.b(c, null);
       tb = this.b;
       co5.i(tb);
       o11 c1 = tb.t.c;
       co5.l(c1, "binding.singleItemPickerActionButtons.actionButton");
       if (p0.b != null) {
          if (!c instanceof Collection || !c.isEmpty()) {
             Iterator iterator = c.iterator();
             while (true) {
                if (iterator.hasNext()) {
                   if (iterator.next().c == null) {
                      continue ;
                   }
                }
             }
             c1.setEnabled(b);
             if ((t = p0.t) == null || (a = t.a) == null) {
                a = "";
             }
             c1.setText(a);
             c1.setOnClickListener(new k8(8, this));
             return;
          }
          b = false;
       }
       b = true;
    }
    public final RecyclerView e(){
       zj6 tb = this.b;
       co5.i(tb);
       oy6 c = tb.c;
       co5.l(c, "binding.itemListRecyclerView");
       return c;
    }
    public final void remove(){
       zj6 tb;
       oy6 b;
       ViewParent parent = ((tb = this.b) != null && (b = tb.b) != null)? b.getParent(): null;
       if (parent instanceof ViewGroup) {
       }else {
          parent = null;
       }
       if (parent != null) {
          zj6 tb1 = this.b;
          co5.i(tb1);
          parent.removeView(tb1.b);
       }
       this.b = null;
       return;
    }
}

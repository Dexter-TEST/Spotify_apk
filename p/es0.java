package p.es0;
import p.p55;
import android.content.Context;
import p.r61;
import p.bb7;
import p.r55;
import p.s55;
import java.lang.Object;
import java.lang.String;
import p.co5;
import com.spotify.allboarding.allboardingimpl.mobius.list.AllboardingRvAdapter;
import p.cs0;
import p.c07;
import p.cc1;
import p.ds0;
import android.view.ViewGroup;
import android.view.View;
import p.et0;
import p.ry7;
import p.o11;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.spotify.allboarding.allboardingimpl.utils.PickerCollapsingTitleBar;
import com.spotify.allboarding.allboardingimpl.utils.GridRecyclerView;
import p.yq5;
import androidx.recyclerview.widget.RecyclerView;
import android.view.animation.LayoutAnimationController;
import p.dr5;
import p.q71;
import p.yy;
import java.util.concurrent.CopyOnWriteArraySet;
import android.content.res.Resources;
import java.lang.NullPointerException;
import p.db;
import p.bb;
import p.ab;
import p.n46;
import p.e46;
import java.lang.Class;
import p.eb4;
import p.zk;
import p.xq7;
import p.mb7;
import p.kb7;
import p.fb7;
import p.gb7;
import p.nb7;
import p.ds3;
import p.mi;
import java.util.ArrayList;
import java.util.Iterator;
import java.lang.Iterable;
import p.he5;
import p.de5;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.List;
import java.util.Set;
import java.util.Map$Entry;
import p.jx;
import p.vk;
import p.iq6;
import java.lang.Integer;
import p.nq5;
import p.or7;
import java.util.Collection;
import p.li5;
import p.zf2;
import com.spotify.allboarding.allboardingdomain.model.SearchConfiguration;
import p.fl3;
import java.lang.Runnable;
import p.kn;
import android.widget.TextView;
import java.lang.CharSequence;
import com.spotify.encoremobile.component.buttons.EncoreButton;
import p.kb;
import p.k5;
import p.bs0;
import android.view.View$OnClickListener;
import android.widget.LinearLayout;
import p.wh7;
import p.gh7;
import p.j86;
import android.view.View$OnLayoutChangeListener;
import p.je5;
import p.iz7;
import android.view.ViewParent;

public final class es0 implements p55	// class@0014e7 from classes.dex
{
    public final Context a;
    public final bb7 b;
    public final zf2 c;
    public final zf2 d;
    public final wf2 e;
    public final wf2 f;
    public final wf2 g;
    public final wf2 h;
    public final zf2 i;
    public o11 j;
    public String k;
    public final AllboardingRvAdapter l;
    public final c07 m;
    public final ds0 n;

    public void es0(Context p0,r61 p1,bb7 p2,r55 p3,r55 p4,s55 p5,s55 p6,s55 p7,s55 p8,r55 p9){
       co5.o(p0, "context");
       co5.o(p1, "imageLoader");
       co5.o(p2, "pickerLogger");
       super();
       this.a = p0;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       this.e = p5;
       this.f = p6;
       this.g = p7;
       this.h = p8;
       this.i = p9;
       this.k = "";
       this.l = new AllboardingRvAdapter(p1, new cs0(this, 0), new cs0(this, 1));
       this.m = new c07(new cc1(2, this), new cs0(this, 2));
       this.n = new ds0(this);
    }
    public final boolean a(ViewGroup p0){
       View view1;
       View view3;
       View view4;
       boolean b = false;
       if (this.j != null) {
          return b;
       }
       View view = et0.n(p0, R.layout.picker_content_view, p0, b);
       int i = 0x7f0a00b9;
       if ((view1 = ry7.q(view, i)) != null) {
          o11 oo11 = o11.c(view1);
          View view2 = view;
          i = 0x7f0a04ff;
          if ((view3 = ry7.q(view, i)) != null) {
             i = 0x7f0a0500;
             if ((view4 = ry7.q(view, i)) != null) {
                o11 view5 = new o11(view2, oo11, view2, view3, view4, 13);
                this.j = view;
                this.g().setAdapter(this.l);
                this.g().setLayoutAnimation(null);
                dr5 itemAnimator = this.g().getItemAnimator();
                co5.j(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.SimpleItemAnimator");
                itemAnimator.g = b;
                this.f().setFiltersRecyclerViewAdapter(this.m);
                es0 tn = this.n;
                co5.o(tn, "listener");
                this.f().N.a.add(tn);
                es0 tj = this.j;
                co5.i(tj);
                p0.addView(tj.b);
                return true;
             }
          }
       }
       throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
    public final void b(db p0){
       es0 tj;
       o11 w;
       es0 tj1;
       o11 v;
       co5.o(p0, "viewEffect");
       if (p0 instanceof bb) {
          if ((tj = this.j) != null && (w = tj.w) != null) {
             w.p0();
          }
       }else if(p0 instanceof ab && ((tj1 = this.j) != null && (v = tj1.v) != null)){
          v.h(p0.a);
       }
       return;
    }
    public final boolean c(n46 p0){
       co5.o(p0, "model");
       return p0 instanceof e46;
    }
    public final void d(n46 p0,boolean p1){
       nq5 obj1;
       de5 a1;
       ArrayList uArrayList1;
       or7 obj2;
       mb7 b3;
       String placeholder;
       es0 uoes0 = this;
       Object obj = p0;
       co5.o(obj, "model");
       if (!obj instanceof e46) {
          return;
       }
       e46 a = obj.a;
       uoes0.k = a;
       int b = true;
       int b1 = false;
       e46 c = obj.c;
       e46 w = obj.w;
       e46 v = obj.v;
       e46 t = obj.t;
       e46 y = obj.y;
       if (p1) {
          String str = "step";
          es0 b2 = uoes0.b;
          if (t != null) {
             b2.getClass();
             co5.o(a, str);
             xq7 oxq7 = new xq7(new zk(bb7.a(a)));
             mb7 omb7 = new mb7();
             omb7.c(oxq7.b);
             omb7.b = oxq7.c.b.a;
             b2.a.a(omb7.a());
          }
          if (mi.K(obj)) {
             if (v != null) {
                b2.b(a, b);
             }
             if (w != null) {
                b2.b(a, b1);
             }
          }
          ArrayList uArrayList = new ArrayList();
          Iterator iterator = c.iterator();
          while (iterator.hasNext()) {
             he5 ohe5 = iterator.next();
             if (ohe5 instanceof de5) {
             }else {
                ohe5 = null;
             }
             if (ohe5 != null) {
                uArrayList.add(ohe5);
             }
             b1 = 0;
          }
          LinkedHashMap linkedHashMa = new LinkedHashMap();
          Iterator iterator1 = uArrayList.iterator();
          while (iterator1.hasNext()) {
             obj1 = iterator1.next();
             a1 = obj1.a;
             if ((uArrayList1 = linkedHashMa.get(a1)) == null) {
                ArrayList uArrayList2 = new ArrayList();
                linkedHashMa.put(a1, uArrayList2);
                uArrayList1 = uArrayList2;
             }
             uArrayList1.add(obj1);
          }
          Iterator iterator2 = linkedHashMa.entrySet().iterator();
          while (iterator2.hasNext()) {
             Map$Entry uEntry = iterator2.next();
             iterator1 = uEntry.getValue().iterator();
             while (true) {
                if (iterator1.hasNext()) {
                   obj1 = iterator1.next();
                   if (!obj1.c instanceof jx) {
                      continue ;
                   }
                }else {
                   Object obj3 = null;
                }
                Iterator iterator3 = uEntry.getValue().iterator();
                while (true) {
                   if (iterator3.hasNext()) {
                      obj2 = iterator3.next();
                      a1 = obj2.c;
                      b3 = (!a1 instanceof vk && !a1 instanceof iq6)? 0: 1;
                      if (b) {
                      label_0123 :
                         if (obj1 != null) {
                            b2.getClass();
                            co5.o(a, str);
                            obj1 = new nq5(bb7.a(a), Integer.valueOf(obj1.b));
                            b3 = new mb7();
                            b3.c(obj1.b);
                            b3.b = obj1.c.a;
                            b2.a.a(b3.a());
                         }
                         if (obj2 != null) {
                            b2.getClass();
                            co5.o(a, str);
                            obj2 = new or7(bb7.a(a), Integer.valueOf(obj2.b));
                            b3 = new mb7();
                            b3.c(obj2.b);
                            b3.b = obj2.c.a;
                            b2.a.a(b3.a());
                         }
                         b3 = 1;
                      }else {
                         b3 = 1;
                      }
                   }else {
                      obj2 = null;
                      goto label_0123 ;
                   }
                }
             }
          }
          if ((y.isEmpty() ^ 1)) {
             b2.getClass();
             co5.o(a, str);
             b2.a.a(new li5(bb7.a(a)).f());
          }
       }
       e46 b4 = obj.b;
       this.f().setTitle(b4);
       uoes0.i.invoke(b4);
       PickerCollapsingTitleBar pickerCollap = this.f();
       boolean b5 = (t != null)? true: false;
       pickerCollap.setSearchVisible(b5);
       pickerCollap = this.f();
       if (t == null || (placeholder = t.getPlaceholder()) == null) {
          placeholder = "";
       }
       pickerCollap.setSearchPlaceholder(placeholder);
       this.f().setFiltersVisible((y.isEmpty() ^ 1));
       Runnable runnable = null;
       uoes0.m.t.b(y, runnable);
       Resources resources = uoes0.a.getResources();
       b = mi.s(obj);
       es0 j = uoes0.j;
       co5.i(j);
       o11 w1 = j.c.w;
       String str1 = "binding.buttonContainer.selectedNbLabel";
       co5.l(w1, str1);
       y = (((y.isEmpty() ^ 1)) && b > 0)? 1: 0;
       int i = (y)? 0: 8;
       w1.setVisibility(i);
       j = uoes0.j;
       co5.i(j);
       w1 = j.c.w;
       co5.l(w1, str1);
       Object[] objArray = new Object[]{Integer.valueOf(b)};
       w1.setText(resources.getQuantityString(R.plurals.allboarding_selected_nb_label, b, objArray));
       j = uoes0.j;
       co5.i(j);
       w1 = j.c.t;
       str1 = "binding.buttonContainer.chooseXOrMoreLabel";
       co5.l(w1, str1);
       e46 x = obj.x;
       objArray = (obj.B == 1 && (b > 0 && b < x))? 1: 0;
       i = (objArray)? 0: 8;
       w1.setVisibility(i);
       j = uoes0.j;
       co5.i(j);
       w1 = j.c.t;
       co5.l(w1, str1);
       objArray = new Object[]{Integer.valueOf((x - b))};
       w1.setText(resources.getString(R.string.allboarding_choose_x_or_more_label, objArray));
       resources = (!this.e().getVisibility())? 1: 0;
       if (!resources && mi.K(obj)) {
          runnable = new kb(uoes0, 1, obj);
       }
       EncoreButton uEncoreButto = this.e();
       b3 = (mi.K(obj) && v != null)? 1: 0;
       int i1 = (b3)? 0: 8;
       uEncoreButto.setVisibility(i1);
       if (runnable != null) {
          runnable.invoke();
       }
       if (v != null) {
          this.e().setText(v.a);
          this.e().setOnClickListener(new bs0(uoes0, 0));
       }else {
          b3 = 0;
       }
       uEncoreButto = this.h();
       runnable = (mi.K(obj) && w != null)? 1: 0;
       b1 = (runnable)? 0: 8;
       uEncoreButto.setVisibility(b1);
       if (w != null) {
          this.h().setText(w.a);
          this.h().setOnClickListener(new bs0(uoes0, 1));
       }
       es0 j1 = uoes0.j;
       co5.i(j1);
       o11 b6 = j1.c.b;
       co5.l(b6, "binding.buttonContainer.root");
       if (gh7.c(b6) && !b6.isLayoutRequested()) {
          GridRecyclerView gridRecycler = this.g();
          gridRecycler.setPadding(gridRecycler.getPaddingLeft(), gridRecycler.getPaddingTop(), gridRecycler.getPaddingRight(), b6.getHeight());
       }else {
          b6.addOnLayoutChangeListener(new j86(2, uoes0));
       }
       ArrayList uArrayList3 = co5.w(c, mi.p(obj));
       uArrayList3.size();
       uoes0.l.t.b(uArrayList3, new iz7(obj, 7, uoes0));
       return;
    }
    public final EncoreButton e(){
       es0 tj = this.j;
       co5.i(tj);
       o11 c = tj.c.c;
       co5.l(c, "binding.buttonContainer.actionButton");
       return c;
    }
    public final PickerCollapsingTitleBar f(){
       es0 tj = this.j;
       co5.i(tj);
       o11 v = tj.v;
       co5.l(v, "binding.pickerCollapsingTitle");
       return v;
    }
    public final GridRecyclerView g(){
       es0 tj = this.j;
       co5.i(tj);
       o11 w = tj.w;
       co5.l(w, "binding.pickerRecyclerView");
       return w;
    }
    public final EncoreButton h(){
       es0 tj = this.j;
       co5.i(tj);
       o11 v = tj.c.v;
       co5.l(v, "binding.buttonContainer.secondaryActionButton");
       return v;
    }
    public final void remove(){
       es0 tj;
       o11 b;
       if (this.j != null) {
          es0 tn = this.n;
          co5.o(tn, "listener");
          this.f().N.a.remove(tn);
          ViewParent parent = ((tj = this.j) != null && (b = tj.b) != null)? b.getParent(): null;
          if (parent instanceof ViewGroup) {
          }else {
             parent = null;
          }
          if (parent != null) {
             tn = this.j;
             co5.i(tn);
             parent.removeView(tn.b);
          }
          this.j = null;
       }
       return;
    }
}

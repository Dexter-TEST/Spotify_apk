package com.spotify.hubs.liteintegration.HubsView;
import android.widget.FrameLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.View;
import com.spotify.legacyglue.gluelib.patterns.header.GlueHeaderLayout;
import androidx.recyclerview.widget.RecyclerView;
import android.content.res.Resources;
import p.xj0;
import p.ej5;
import p.ju2;
import p.lq5;
import p.y33;
import p.v33;
import p.sk2;
import p.dr5;
import p.hr5;
import p.gk2;
import p.fo3;
import com.spotify.legacyglue.gluelib.patterns.header.behavior.HeaderBehavior;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbar;
import p.ry7;
import p.q33;
import java.lang.Object;
import p.y46;
import p.jk2;
import android.app.Activity;
import android.view.Window;
import android.view.WindowManager$LayoutParams;
import p.r33;
import p.mj2;
import android.view.ViewGroup$LayoutParams;
import p.av0;
import p.u33;
import p.uu2;
import p.fh5;
import com.spotify.legacyglue.hugs.layouttraits.TraitsLayoutManager;
import p.ri3;
import p.xs2;
import p.yq5;
import p.m02;
import p.mr5;
import p.s33;
import p.e13;
import android.database.Observable;
import p.a43;
import p.ty0;
import p.iu2;
import p.ry2;
import p.fu2;
import p.su2;
import java.lang.String;
import p.o23;
import p.tu2;
import p.k23;
import p.z23;
import p.b43;
import p.bu2;
import p.w51;
import p.io2;
import java.util.List;
import p.e33;
import java.util.IdentityHashMap;
import p.ys2;
import p.bt2;
import java.util.WeakHashMap;
import java.util.Collection;
import android.os.Parcelable;
import java.util.Map;
import p.p7;
import p.b7;
import android.view.AbsSavedState;
import p.hj7;
import java.lang.Math;
import p.tu6;

public class HubsView extends FrameLayout	// class@0008bc from classes.dex
{
    public b7 A;
    public u33 B;
    public float C;
    public boolean D;
    public int E;
    public xs2 a;
    public xs2 b;
    public ej5 c;
    public y33 t;
    public lq5 v;
    public y46 w;
    public final GlueHeaderLayout x;
    public final RecyclerView y;
    public final RecyclerView z;

    public void HubsView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
       View.inflate(p0, R.layout.hubs_view, this);
       this.x = this.findViewById(R.id.glue_header_layout);
       RecyclerView recyclerView = this.findViewById(R.id.body);
       this.y = recyclerView;
       RecyclerView recyclerView1 = this.findViewById(R.id.overlay);
       this.z = recyclerView1;
       recyclerView.setHasFixedSize(true);
       recyclerView1.setHasFixedSize(true);
       this.C = this.getResources().getFraction(R.fraction.header_height_fraction_reduced, true, true);
       this.D = true;
       this.E = xj0.e0(8.00f, this.getResources());
    }
    public static void a(HubsView p0){
       ej5 g;
       y33 b;
       HubsView c = p0.c;
       if ((g = c.g) != null) {
          y33 oy33 = c.b.h(c.f, g, p0.x, -1);
          c.f = oy33;
          b = oy33.b;
       }else {
          b = null;
       }
       if (b == null) {
          b = (p0.D != null)? new v33(p0.getContext()): new sk2(p0.getContext());
       }
       p0.setHeaderView(b);
       return;
    }
    public static void f(RecyclerView p0,boolean p1){
       dr5 itemAnimator;
       if (!p1) {
          if ((itemAnimator = p0.getItemAnimator()) != null) {
             itemAnimator.e();
          }
          p0.setLayoutManager(null);
          p0.setLayoutManager(p0.getLayoutManager());
       }
       int i = (p1)? 0: 8;
       p0.setVisibility(i);
       return;
    }
    private void setHeaderView(View p0){
       View view;
       mj2 omj2;
       av0 a;
       int b = false;
       HubsView tx = this.x;
       if (p0 instanceof gk2) {
          view = p0;
          tx.F(view, new fo3(), b);
          view.setGlueToolbar(null);
          view.setExternalToolbarHeight((ry7.F(p0.getContext()) + this.E));
          view.setScrollObserver(new q33(b, this));
          if (!(0xbf800000 - view.getHeightFraction())) {
             view.setHeightFraction(this.C);
          }
       }else if(p0 instanceof jk2){
          view = p0;
          tx.F(view, new fo3(), true);
          HubsView tE = this.E;
          if (this.D != null) {
             b = ry7.u(p0.getContext());
          }else {
             Context context = p0.getContext();
             if (context instanceof Activity && ((context.getWindow().getAttributes().flags & 0x4000000))) {
                b = true;
             }
             if (b) {
                b = ry7.F(p0.getContext());
             }else {
             label_0081 :
                view.setStickyAreaSize(tE);
                view.setScrollObserver(new r33(this, p0));
             }
          }
          tE = tE + b;
          goto label_0081 ;
       }else if(p0 instanceof mj2){
          tx.F(p0, new fo3(), b);
       }
       if (this.B != null && ((omj2 = tx.D()) != null && (!omj2 instanceof sk2 && (a = omj2.getView().getLayoutParams().a) != null))) {
          HubsView tB = this.B;
          if (tB.c != null) {
             a.j = 0x3f800000;
             omj2.getView().requestLayout();
          }else {
             a.j = tB.t;
             omj2.getView().requestLayout();
          }
       }
       return;
    }
    public final void b(uu2 p0,fh5 p1){
       HubsView ty = this.y;
       ty.setLayoutManager(new TraitsLayoutManager(p1.c, this.getResources().getInteger(R.integer.hugs_grid_columns)));
       xs2 oxs2 = new xs2(p0);
       this.a = oxs2;
       ty.setAdapter(oxs2);
       ty.i(new m02(2, this));
       xs2 oxs21 = new xs2(p0);
       this.b = oxs21;
       this.z.setAdapter(oxs21);
       this.v = new lq5(p0);
       ej5 uoej5 = new ej5(p0);
       this.c = uoej5;
       uoej5.e.registerObserver(new s33(this));
    }
    public final void c(int p0){
       ju2[] oju2Array = new ju2[]{ty0.k().k(ry2.t).t(ty0.z().b(this.getResources().getString(p0)).build()).g()};
       this.g(ty0.B().k(oju2Array).g());
    }
    public final void d(b43 p0){
       if (p0 != null) {
          this.g(p0);
       }
       return;
    }
    public final void e(){
       ju2[] oju2Array = new ju2[]{ty0.k().j("app:loading_indicator", bu2.w.a).g()};
       this.g(ty0.B().k(oju2Array).g());
    }
    public final void g(b43 p0){
       ju2 oju21;
       y33 oy33;
       HubsView tB;
       hr5 layoutManage;
       ju2 oju2 = p0.e();
       int i = 0;
       int i1 = 1;
       lq5 t = (oju2 != null && io2.j(this.c.h.L(), oju2))? 0: 1;
       this.b.w(p0.j());
       HubsView tc = this.c;
       if ((oju21 = p0.e()) == null) {
          ej5 d = tc.d;
          d.b.clear();
          d.c.clear();
          tc.c.a.clear();
          if ((d = tc.f) != null) {
             tc.b.k(d);
             tc.f = null;
          }
       }
       tc.g = oju21;
       this.a.w(p0.m());
       boolean i2 = p0.j().isEmpty() ^ i1;
       int i3 = p0.m().isEmpty() ^ i1;
       HubsView.f(this.z, i2);
       i2 = (!i2 && i3)? true: false;
       HubsView ty = this.y;
       HubsView.f(ty, i2);
       ju2 oju22 = p0.e();
       tc = this.x;
       if (oju22 != null && (!oju22.j().isEmpty() && (oju22 = w51.w(oju22.e("primary_buttons"))) != null)) {
          oy33 = this.v.h(this.t, oju22, tc, i);
          this.t = oy33;
          oy33 = oy33.b;
       }else {
          oy33 = null;
       }
       tc.E(oy33, i1);
       if (i3 && (tB = this.B) != null) {
          xs2 w = this.a.w;
          w.c(tB.a, w.a);
          if ((layoutManage = ty.getLayoutManager()) != null) {
             layoutManage.s0(this.B.b);
          }
          tB = this.B;
          tB.a = null;
          tB.b = null;
       }
       this.b.g();
       if (oju2) {
          tB = this.c;
          t = tB.b.t;
          t.b.clear();
          t.c.clear();
          tB.e.a();
       }
       this.a.g();
       return;
    }
    public p7 getBodyNotifier(){
       if (this.A == null) {
          this.A = new b7(this.a);
       }
       return this.A;
    }
    public RecyclerView getRecyclerView(){
       return this.y;
    }
    public final void onRestoreInstanceState(Parcelable p0){
       super.onRestoreInstanceState(p0.getSuperState());
       this.B = p0;
    }
    public final Parcelable onSaveInstanceState(){
       HubsView tB;
       hr5 layoutManage;
       mj2 omj2;
       av0 a;
       u33 ou33 = new u33(super.onSaveInstanceState());
       if ((tB = this.B) != null) {
          ou33.a = tB.a;
          ou33.b = tB.b;
          ou33.t = tB.t;
          ou33.c = tB.c;
       }
       if ((tB = this.a) != null && ou33.a == null) {
          xs2 w = tB.w;
          ou33.a = w.d(w.a);
       }
       if ((layoutManage = this.y.getLayoutManager()) != null && ou33.b == null) {
          ou33.b = layoutManage.t0();
       }
       if ((omj2 = this.x.D()) != null && (!omj2 instanceof sk2 && (a = omj2.getView().getLayoutParams().a) != null)) {
          ou33.t = tu6.k(0, 0x3f800000, Math.abs(((float)a.w() / (float)(a.k + a.i))));
          ou33.c = a.D();
       }
       return ou33;
    }
    public void setExtraFilterHeight(int p0){
       this.E = p0;
    }
    public void setHasExternalToolbar(boolean p0){
       this.D = p0;
    }
    public void setHeaderHeightFraction(float p0){
       this.C = p0;
    }
    public void setHeaderScrollObserver(y46 p0){
       this.w = p0;
    }
}

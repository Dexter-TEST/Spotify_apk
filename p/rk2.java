package p.rk2;
import androidx.fragment.app.k;
import p.up0;
import java.lang.Object;
import java.util.ArrayList;
import p.em0;
import p.uv1;
import android.os.Handler;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import android.widget.LinearLayout;
import com.spotify.legacyglue.contextmenu.glue.GlueContextMenuLayout;
import android.widget.FrameLayout;
import com.spotify.legacyglue.contextmenu.glue.FadingEdgeScrollView;
import p.jm7;
import android.view.View$OnClickListener;
import p.pk2;
import p.wh7;
import p.j15;
import p.jh7;
import p.ko1;
import p.oy6;
import p.no6;
import p.oo6;
import p.nd3;
import p.od3;
import p.wl2;
import p.id4;
import p.kd4;
import p.gd4;
import p.n6;
import android.graphics.drawable.Drawable;
import p.qk2;
import android.animation.Animator;
import android.animation.Animator$AnimatorListener;
import android.content.res.Resources;
import android.content.res.Configuration;
import p.ye7;
import java.util.Iterator;
import java.lang.Runnable;

public final class rk2	// class@002503 from classes.dex
{
    public final us0 a;
    public final CoordinatorLayout b;
    public final LinearLayout c;
    public final GlueContextMenuLayout d;
    public final FrameLayout e;
    public View f;
    public final ArrayList g;
    public boolean h;
    public boolean i;
    public final em0 j;
    public final Handler k;
    public final nd3 l;
    public final od3 m;
    public final kd4 n;
    public final kd4 o;
    public final kd4 p;
    public final kd4 q;
    public Animator r;
    public final kd4 s;
    public final kd4 t;
    public final FadingEdgeScrollView u;
    public final View v;
    public final View w;
    public final boolean x;
    public final Context y;

    public void rk2(k p0,up0 p1){
       super();
       this.g = new ArrayList();
       ArrayList uArrayList = new ArrayList();
       this.j = new em0(24, this);
       uv1 ouv1 = new uv1(25, this);
       this.k = new Handler();
       this.a = p1;
       this.y = p0;
       this.x = false;
       int i = (this.b())? 0x7f0d00a0: 0x7f0d009e;
       CoordinatorLayout uCoordinator = LayoutInflater.from(p0).inflate(i, null);
       this.b = uCoordinator;
       LinearLayout linearLayout = uCoordinator.findViewById(R.id.top_bar_menu_layout);
       this.c = linearLayout;
       uCoordinator.findViewById(R.id.top_gradient_background_view);
       GlueContextMenuLayout glueContextM = uCoordinator.findViewById(R.id.panel);
       this.d = glueContextM;
       FrameLayout uFrameLayout = uCoordinator.findViewById(R.id.header_container);
       this.e = uFrameLayout;
       this.u = uCoordinator.findViewById(R.id.scroll);
       View view = uCoordinator.findViewById(R.id.progress_bar);
       this.v = view;
       View view1 = uCoordinator.findViewById(R.id.closeButton);
       this.w = view1;
       glueContextM.setSpinner(view);
       glueContextM.setIsInLandscapeAndAdaptive(this.b());
       jm7 ojm7 = new jm7(3, this);
       glueContextM.setOnClickListener(ojm7);
       uFrameLayout.setOnClickListener(ojm7);
       linearLayout.setOnClickListener(ojm7);
       if (view1 != null) {
          view1.setOnClickListener(ojm7);
       }
       jh7.u(linearLayout, new pk2(this, p0));
       this.l = new nd3(ouv1);
       od3 ood3 = new od3(ouv1);
       this.m = ood3;
       this.n = gd4.a(new ko1(ouv1));
       this.o = gd4.a(new oy6(ouv1));
       this.p = gd4.a(new no6(ouv1));
       this.q = gd4.a(new oo6(ouv1));
       this.s = gd4.a(ood3);
       this.t = gd4.a(new wl2(ouv1));
       linearLayout.setBackgroundColor(n6.b(linearLayout.getContext(), R.color.black));
       linearLayout.getBackground().setAlpha(false);
       this.d();
       return;
    }
    public final void a(){
       rk2 tr;
       this.i = true;
       qk2 oqk2 = new qk2(this, 0);
       if ((tr = this.r) != null && tr.isRunning()) {
          this.r.cancel();
       }
       tr = this.t;
       if (tr.isRunning()) {
          tr.cancel();
       }
       this.s.start();
       tr = this.p;
       if (tr.isRunning()) {
          tr.cancel();
       }
       if (this.h != null) {
          this.q.start();
       }
       tr = this.n;
       if (tr.isRunning()) {
          tr.cancel();
       }
       tr = this.o;
       tr.start();
       tr.addListener(oqk2);
       return;
    }
    public final boolean b(){
       rk2 ty = this.y;
       boolean b = true;
       int i = (ty.getResources().getConfiguration().orientation == 2)? 1: 0;
       if (!i || (ye7.G(ty) || this.x == null)) {
          b = false;
       }
       return b;
    }
    public final void c(){
       rk2 tf;
       rk2 td = this.d;
       GlueContextMenuLayout c = td.c;
       Iterator iterator = c.iterator();
       while (iterator.hasNext()) {
          td.removeView(iterator.next());
       }
       c.clear();
       td = this.g;
       td.clear();
       if ((tf = this.f) != null) {
          td.add(tf);
       }
       return;
    }
    public final void d(){
       rk2 tf;
       if ((tf = this.f) != null) {
          tf.setVisibility(8);
       }
       this.d.setProgressBarVisibility(4);
       this.k.postDelayed(this.j, 1000);
       this.n.start();
       this.h = true;
       return;
    }
}

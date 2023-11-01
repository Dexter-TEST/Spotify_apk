package p.ho3;
import p.xt2;
import java.lang.Object;
import p.c33;
import java.lang.Class;
import android.view.View;
import p.ju2;
import p.uu2;
import p.bt2;
import p.gk2;
import p.wh7;
import android.widget.TextView;
import p.tu2;
import java.lang.String;
import java.lang.CharSequence;
import android.text.TextUtils;
import p.ry7;
import p.co5;
import android.view.ViewGroup;
import java.util.List;
import java.util.Iterator;
import p.lq5;
import p.y33;
import p.et0;
import android.content.Context;
import android.content.res.Resources;
import p.xj0;
import android.content.res.Resources$Theme;
import p.xw5;
import p.dm2;
import p.em2;
import android.graphics.drawable.Drawable;
import p.dh7;
import java.util.EnumSet;
import p.nk2;
import java.lang.Enum;
import p.vo2;
import p.uo2;
import p.do5;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbar;
import com.spotify.legacyglue.gluelib.components.toolbar.GlueToolbars;
import p.hu2;
import p.j13;
import android.widget.ImageView;
import android.net.Uri;
import p.n6;
import p.hv5;
import p.wd5;
import java.lang.IllegalStateException;
import android.view.LayoutInflater;
import p.iq3;
import p.e07;
import p.io2;
import p.hq3;
import p.zo2;
import p.zk2;
import p.eo5;
import p.ak2;
import p.yo2;
import p.xe7;
import p.xo2;
import p.wo2;
import p.ap2;
import p.fs0;
import p.r45;
import p.uw5;
import p.sp6;
import p.ox7;
import java.util.ArrayList;
import p.ez2;
import p.t67;
import p.p77;
import p.go3;
import p.ej0;
import p.wp6;
import p.jl;
import p.or7;
import p.ik2;
import p.gp2;
import p.fp2;
import p.vm5;
import p.yw2;
import p.kb3;
import p.bp2;
import p.cp2;

public final class ho3 implements xt2	// class@00188f from classes.dex
{
    public final int a;
    public Object b;

    public void ho3(){
       this.a = 4;
       super();
    }
    public void ho3(c33 p0,int p1){
       this.a = p1;
       if (p1 != 3) {
          super();
          p0.getClass();
          this.b = p0;
          return;
       }else {
          super();
          p0.getClass();
          this.b = p0;
          return;
       }
    }
    public void ho3(c33 p0,int p1,int p2){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void b(View p0,ju2 p1,uu2 p2,bt2 p3){
       switch (this.a){
           case 0:
             this.e(p0, p1, p2);
             return;
           case 1:
             this.e(p0, p1, p2);
             return;
           case 2:
             this.e(p0, p1, p2);
             return;
           case 3:
             this.e(p0, p1, p2);
             return;
           default:
             TextView textView = wh7.m(p0, R.id.title);
             String str = p1.y().d();
             textView.setText(str);
             int i = 8;
             int i1 = (TextUtils.isEmpty(str))? 8: 0;
             textView.setVisibility(i1);
             textView = wh7.m(p0, R.id.description);
             str = p1.y().e();
             textView.setText(str);
             i1 = (TextUtils.isEmpty(str))? 8: 0;
             textView.setVisibility(i1);
             ry7.d(p0);
             co5.e(p0, p1, p2);
             ViewGroup viewGroup = wh7.m(p0, R.id.accessories);
             viewGroup.removeAllViews();
             Iterator iterator = p1.j().iterator();
             while (iterator.hasNext()) {
                viewGroup.addView(this.b.h(null, iterator.next(), viewGroup, 0).b);
             }
             if (viewGroup.getChildCount()) {
                i = 0;
             }
             viewGroup.setVisibility(i);
             return;
       }
    }
    public final View c(ViewGroup p0,uu2 p1){
       switch (this.a){
           case 0:
             return this.f(p0);
           case 1:
             return this.f(p0);
           case 2:
             return this.f(p0);
           case 3:
             return this.f(p0);
           default:
             if (this.b == null) {
                this.b = new lq5(p1);
             }
             View view = et0.n(p0, R.layout.component_banner, p0, false);
             Context context = p0.getContext();
             Resources resources = context.getResources();
             int i = xw5.b(resources, R.color.klein_blue, null);
             em2 resources1 = new em2(dm2.a, xw5.b(context.getResources(), R.color.fuchsia, null), i, false, (float)xj0.e0(8.00f, p0.getResources()));
             dh7.q(view, resources);
             return view;
       }
    }
    public final EnumSet d(){
       switch (this.a){
           case 0:
             return EnumSet.noneOf(nk2.class);
           case 1:
             return EnumSet.of(nk2.c);
           case 2:
             return EnumSet.noneOf(nk2.class);
           case 3:
             return EnumSet.noneOf(nk2.class);
           default:
             return EnumSet.of(nk2.y);
       }
    }
    public final void e(gk2 p0,ju2 p1,uu2 p2){
       String str;
       GlueToolbar glueToolbar;
       zo2 ozo2;
       j13 oj13;
       wo2 t;
       Context context;
       hv5 ohv5;
       Drawable uDrawable1;
       Drawable uDrawable2;
       j13 oj131;
       boolean i1;
       ImageView backgroundIm;
       String str4;
       float f = Float.NaN;
       float f1 = 64.00f;
       Drawable uDrawable = null;
       boolean b = false;
       switch (this.a){
           case 0:
             p0.setGlueToolbar(GlueToolbars.createGlueToolbar(p0.getContext(), p0));
             str = p1.y().d();
             String str1 = p1.y().m();
             String str2 = p1.y().j();
             String str3 = p1.y().e();
             if ((glueToolbar = p0.getGlueToolbar()) != null) {
                glueToolbar.setTitle(str);
             }
             if (str != null) {
                int i = 0x7f0d00aa;
                if (str1 != null) {
                   if (str2 != null) {
                      ozo2 = new zo2(LayoutInflater.from(p0.getContext()).inflate(i, p0, b));
                      eo5.P(ozo2);
                      ozo2.x.setText(str2);
                   }else {
                      ozo2 = xe7.m(p0);
                   }
                   ozo2.g(str1);
                }else {
                   t = new wo2(LayoutInflater.from(p0.getContext()).inflate(i, p0, b));
                   eo5.P(t);
                }
                ozo2.setTitle(str);
             }else if(str3 != null){
                ozo2 = xe7.n(p0);
                ozo2.setTitle(str3);
             }else {
                ozo2 = xe7.m(p0);
                ozo2.setTitle(uDrawable);
                ozo2.g(uDrawable);
             }
             vo2 b1 = ozo2.b;
             b1.setPadding(b1.getPaddingLeft(), b1.getPaddingTop(), b1.getPaddingRight(), xj0.e0(16.00f, b1.getResources()));
             do5.f(p0, ozo2);
             if (ozo2 instanceof fs0) {
                str1 = ((oj13 = p1.u().e()) != null)? oj13.a(): uDrawable;
                str2 = (oj13 != null)? oj13.c(): uDrawable;
                t = ozo2.t;
                this.b.b.b(t);
                if (str1 != null) {
                   if (!io2.j(str1, p0.getView().getTag(R.id.hub_glue_internal_tag_cover_art))) {
                      p0.setColor(b);
                   }
                   context = p0.getContext();
                   if (str2 != null) {
                      uDrawable = ox7.a(context, uw5.s(str2).e(sp6.Z), f, (float)xj0.e0(f1, context.getResources()));
                   }
                   ArrayList uArrayList = new ArrayList();
                   if (do5.D(oj13) == ez2.c) {
                      uArrayList.add(this.b.e.x);
                   }
                   ohv5 = this.b.b.g(str1);
                   ohv5.j(uArrayList);
                   if (uDrawable != null) {
                      ohv5.h(uDrawable);
                   }else {
                      ohv5.g();
                   }
                   if (uDrawable != null) {
                      ohv5.b(uDrawable);
                   }
                   ohv5.f(ox7.N(t, new go3(p0)));
                }else if(oj13 != null){
                   p0.setColor(b);
                   this.b.getClass();
                   c33.c(t, str2);
                }
                p0.getView().setTag(R.id.hub_glue_internal_tag_cover_art, str1);
                co5.e(t, p1, p2);
             }
             break;
           case 1:
             View view = LayoutInflater.from(p0.getContext()).inflate(R.layout.lite_2lines_header, p0, b);
             TextView textView = view.findViewById(R.id.metadata);
             TextView textView1 = view.findViewById(R.id.title);
             do5.f(p0, new iq3(view, textView, textView1));
             textView.setText(p1.y().j());
             textView1.setText(p1.y().d());
             if ((oj131 = p1.u().e()) != null) {
                uDrawable = oj131.a();
             }
             i1 = 0x7f0a0273;
             e07 tag = p0.getView().getTag(i1);
             c33 b2 = this.b.b;
             if (uDrawable == null) {
                p0.setColor(b);
                if (tag != null) {
                   b2.c(tag);
                }
             }else if(!io2.j(uDrawable, p0.getView().getTag(R.id.hubs_internal_image_tag))){
                p0.setColor(b);
                if (tag != null) {
                   b2.c(tag);
                }
             }
             if (tag == null) {
                tag = new hq3(p0);
                p0.getView().setTag(i1, tag);
             }
             hv5 ohv51 = b2.g(uDrawable);
             ohv51.g();
             ohv51.f(tag);
             p0.getView().setTag(R.id.hubs_internal_image_tag, uDrawable);
             return;
             break;
           case 2:
             do5.f(p0, this.g(p0, p1));
             p0.setGlueToolbar(GlueToolbars.createGlueToolbar(p0.getContext(), p0));
             oj131 = p1.u().c();
             backgroundIm = p0.getBackgroundImageView();
             Uri uri = (oj131 != null)? Uri.parse(oj131.a()): Uri.EMPTY;
             backgroundIm.setColorFilter(n6.b(backgroundIm.getContext(), R.color.opacity_black_30));
             if (!Uri.EMPTY.equals(uri)) {
                c33 b3 = this.h().b;
                b3.getClass();
                ohv5 = new hv5(b3, uri);
                if (ohv5.c != null) {
                   if (ohv5.f == null) {
                      ohv5.d = 0x7f0507ce;
                      if (ohv5.g == null) {
                         ohv5.e = 0x7f0507ce;
                         ohv5.e(backgroundIm);
                      }else {
                         throw new IllegalStateException("Error image already set.");
                      }
                   }else {
                      throw new IllegalStateException("Placeholder image already set.");
                   }
                }else {
                   throw new IllegalStateException("Already explicitly declared as no placeholder.");
                }
             }else {
                this.h().b.b(backgroundIm);
             }
             return;
             break;
           default:
             boolean b4 = true;
             i1 = (p1.y().d() != null)? true: false;
             jl.h(i1, "title is missing");
             if (p1.u().c() == null) {
                b4 = false;
             }
             jl.h(b4, "background image not set");
             do5.f(p0, this.g(p0, p1));
             or7 oor7 = new or7(this, p0, p1);
             ik2 d = p0.b.d;
             if (d.c.a != null) {
                d.b.setImageDrawable(uDrawable);
             }
             backgroundIm = p0.getBackgroundImageView();
             oor7.c.h().b.b(backgroundIm);
             oor7.a.setColor(b);
             if ((oj131 = oor7.b.u().c()) != null) {
                str = oj131.c();
                if ((str4 = oj131.a()) != null) {
                   context = oor7.a.getContext();
                   if (str != null) {
                      uDrawable = ox7.a(context, uw5.s(str).e(sp6.o0), f, (float)xj0.e0(f1, context.getResources()));
                   }
                   hv5 ohv52 = oor7.c.b.b.g(str4);
                   ohv52.h(uDrawable);
                   ohv52.f(ox7.N(backgroundIm, new yw2(oor7)));
                }else {
                   oor7.c.h().getClass();
                   c33.c(backgroundIm, str);
                }
             }
             return;
       }
       return;
    }
    public final gk2 f(ViewGroup p0){
       kb3 okb3;
       fp2 c = fp2.c;
       int i = 0x7f0302aa;
       switch (this.a){
           case 0:
             okb3 = new kb3();
             okb3.c = c;
             okb3.a = i;
             return okb3.c(p0.getContext());
           case 1:
             okb3 = new kb3();
             okb3.d = new gp2(p0.getContext(), c);
             gk2 ogk2 = okb3.c(p0.getContext());
             ogk2.setHeightFraction(0.20f);
             return ogk2;
           case 2:
             return new kb3().c(p0.getContext());
           default:
             kb3 c1 = new kb3();
             c1.a = i;
             gk2 ogk21 = c1.c(p0.getContext());
             ogk21.setTopOffset((ry7.F(p0.getContext()) + uw5.n(p0.getContext(), 0x10102eb)));
             ogk21.setGlueToolbar(GlueToolbars.createGlueToolbar(ogk21.getContext(), ogk21));
             return ogk21;
       }
    }
    public final vo2 g(gk2 p0,ju2 p1){
       String str;
       String str3;
       bp2 uobp2;
       GlueToolbar glueToolbar;
       cp2 uocp2;
       boolean b = false;
       switch (this.a){
           case 2:
             str = p1.y().d();
             String str1 = p1.y().m();
             String str2 = p1.y().j();
             str3 = p1.y().e();
             if (str != null) {
                if (str1 != null) {
                   if (str2 != null) {
                      p0.getClass();
                      uobp2 = new bp2(LayoutInflater.from(p0.getContext()).inflate(R.layout.glue_header_content_set_two_lines_and_metadata, p0, b));
                      eo5.P(uobp2);
                      uobp2.v.setText(str2);
                   }else {
                      uobp2 = xe7.o(p0);
                   }
                   uobp2.t.setText(str1);
                }else if(str3 != null){
                   uobp2 = xe7.n(p0);
                   uobp2.t.setText(str3);
                }else {
                   uobp2 = xe7.l(p0);
                }
                uobp2.setTitle(str);
             }else if(str3 != null){
                uobp2 = xe7.n(p0);
                uobp2.setTitle(str3);
             }else {
                uobp2 = xe7.o(p0);
                uobp2.setTitle(null);
                uobp2.t.setText(null);
             }
             if ((glueToolbar = p0.getGlueToolbar()) != null) {
                glueToolbar.setTitle(str);
             }
             break;
           default:
             str = p1.y().d();
             if ((str3 = p1.y().m()) != null) {
                uocp2 = xe7.o(p0);
                uocp2.t.setText(str3);
             }else {
                uocp2 = xe7.l(p0);
             }
             uocp2.setTitle(str);
             if ((glueToolbar = p0.getGlueToolbar()) != null) {
                b = true;
             }
             jl.g("toolbar not set", b);
             glueToolbar.setTitle(str);
             return uocp2;
       }
       return uobp2;
    }
    public final c33 h(){
       switch (this.a){
           case 2:
           default:
             return this.b;
       }
       return this.b;
    }
}

package p.hq2;
import p.yt2;
import android.content.Context;
import p.wd5;
import p.nq2;
import p.az2;
import java.lang.Object;
import android.view.View;
import p.ju2;
import p.uu2;
import p.bt2;
import p.mq2;
import java.lang.Class;
import p.zk2;
import p.eo5;
import p.lq2;
import android.view.ViewGroup$LayoutParams;
import p.hq0;
import p.tp2;
import android.util.DisplayMetrics;
import android.content.res.Resources;
import p.xj0;
import java.lang.Math;
import android.view.ViewGroup$MarginLayoutParams;
import p.hu2;
import p.j13;
import java.lang.String;
import android.net.Uri;
import java.lang.CharSequence;
import android.text.TextUtils;
import p.bz2;
import p.cz2;
import android.graphics.drawable.Drawable;
import p.n6;
import p.os0;
import p.au2;
import p.hv5;
import java.lang.StringBuilder;
import android.widget.TextView;
import p.ox7;
import android.text.TextUtils$TruncateAt;
import android.widget.ImageView;
import p.lz5;
import p.dy1;
import p.lf0;
import p.he1;
import p.wp6;
import p.e07;
import p.nf0;
import p.mf0;
import p.tu2;
import p.te5;
import p.lp6;
import p.xe7;
import p.dv2;
import p.du2;
import android.view.ViewGroup;
import java.util.EnumSet;
import p.nk2;
import java.lang.Enum;

public abstract class hq2 implements yt2	// class@0018a0 from classes.dex
{
    public final Context a;
    public final wd5 b;
    public final nq2 c;
    public final az2 d;

    public void hq2(Context p0,wd5 p1,nq2 p2,az2 p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
    }
    public final void b(View p0,ju2 p1,uu2 p2,bt2 p3){
       ViewGroup$LayoutParams layoutParams1;
       j13 oj13;
       boolean b1;
       CharSequence text;
       lp6 olp6;
       au2 uoau2;
       CharSequence uCharSequenc;
       lf0 olf0;
       lf0 olf01;
       hq2 ohq2 = this;
       mq2 omq2 = eo5.M(p0, mq2.class);
       lq2 olq2 = this.e();
       lq2 d = omq2.D;
       d.getClass();
       lq2 t = omq2.t;
       t.getClass();
       if (olq2 == null) {
          throw null;
       }
       hq0 layoutParams = t.getLayoutParams();
       float f = tp2.e(olq2);
       nq2 a = d.a;
       float f1 = (float)tp2.d(olq2);
       nq2 b = d.b;
       layoutParams.width = Math.min((int)((float)a.widthPixels * f), xj0.e0(f1, b));
       int i = (olq2 != 3 && olq2 != 2)? xj0.e0(7.00f, b): xj0.e0(12.00f, b);
       layoutParams.bottomMargin = i;
       t.setLayoutParams(layoutParams);
       olq2 = omq2.c;
       olq2.getClass();
       int i1 = Math.min((int)((float)a.widthPixels * f), xj0.e0(f1, b));
       if ((layoutParams1 = olq2.getLayoutParams()) == null) {
          olq2.setLayoutParams(new ViewGroup$LayoutParams(i1, -2));
       }else {
          layoutParams1.width = i1;
       }
       Uri uri = ((oj13 = p1.u().e()) != null && oj13.a() != null)? Uri.parse(oj13.a()): Uri.EMPTY;
       Drawable uDrawable = (oj13 != null && !TextUtils.isEmpty(oj13.c()))? ohq2.d.a(oj13.c(), bz2.t): os0.b(ohq2.a, R.color.image_placeholder_color);
       String str = "default";
       if (oj13 != null) {
          str = oj13.b().b("style", str);
       }
       olq2 = omq2.C;
       olq2.getClass();
       hv5 ohv5 = new hv5(olq2, uri);
       ohv5.i("lq2"+uri);
       TextView[] textViewArra = new TextView[2];
       i1 = 0;
       lq2 v = omq2.v;
       textViewArra[0] = v;
       lq2 w = omq2.w;
       textViewArra[1] = w;
       int i2 = (b1 = ox7.x(omq2.a))? 0x800005: 0x800003;
       TextUtils$TruncateAt sTART = (b1)? TextUtils$TruncateAt.START: TextUtils$TruncateAt.END;
       for (int i3 = 0; i3 < 2; i3 = i3 + 1) {
          object oobject = textViewArra[i3];
          oobject.setGravity(i2);
          oobject.setEllipsize(sTART);
       }
       str.getClass();
       lq2 b2 = omq2.b;
       if (!str.equals("circular")) {
          if (!str.equals("rounded")) {
             ohv5.h(uDrawable);
             ohv5.b(uDrawable);
             ohv5.e(t);
          }else {
             ohv5.h(uDrawable);
             ohv5.b(uDrawable);
             float f2 = (float)b2.getResources().getDimensionPixelSize(R.dimen.episode_card_corner_radius);
             switch (lz5.e.a){
                 case 23:
                   olf0 = new lf0(f2, i1);
                   break;
                 default:
                   olf0 = new lf0(f2, 1);
             }
             ohv5.f(ox7.M(t, olf0));
          }
       }else {
          f = 0x3f800000;
          nf0 textViewArra1 = new nf0(uDrawable, f);
          ohv5.h(textViewArra1);
          ohv5.b(textViewArra1);
          switch (mf0.f.a){
              case 23:
                olf01 = new lf0(f, i1);
                break;
              default:
                olf01 = new lf0(f, 1);
          }
          ohv5.f(ox7.M(t, olf01));
          v.setGravity(1);
          w.setGravity(1);
       }
       String str1 = p1.y().d();
       if (TextUtils.isEmpty(str1)) {
          v.setVisibility(8);
       }else {
          v.setText(str1);
          v.setVisibility(i1);
       }
       str1 = p1.y().m();
       if (TextUtils.isEmpty(str1)) {
          w.setVisibility(8);
       }else {
          w.setText(str1);
          w.setVisibility(i1);
       }
       if (p1.b().y("downloadedBadge", i1)) {
          String str2 = p1.y().m();
          if (!te5.a(p1.y().d())) {
             text = v.getText();
             olp6 = xj0.o(v.getContext());
             if (!TextUtils.isEmpty(text)) {
                text = xe7.T(text, olp6);
             }
             v.setText(text);
          }else if(!te5.a(str2)){
             text = w.getText();
             olp6 = xj0.o(v.getContext());
             if (!TextUtils.isEmpty(text)) {
                text = xe7.T(text, olp6);
             }
             w.setText(text);
          }
       }
       int dv2 i4 = TextUtils.isEmpty(p1.y().m()) ^ 1;
       if (((TextUtils.isEmpty(p1.y().d()) ^ 1)) && i4) {
          v.setLines(1);
       }else {
          v.setLines(2);
       }
       i4 = new dv2(p2.c);
       i4.c("click");
       i4.g(p1);
       i4.f(b2);
       i4.d();
       if ((uoau2 = p1.b().m("accessibility")) != null) {
          if ((uoau2 = uoau2.m("main")) != null) {
             b2.setContentDescription(uoau2.b("label", ""));
          }
          uCharSequenc = null;
       }else {
          uCharSequenc = null;
          b2.setContentDescription(uCharSequenc);
       }
       String str3 = p1.y().j();
       v = omq2.x;
       if (TextUtils.isEmpty(str3)) {
          v.setText(uCharSequenc);
          v.setVisibility(8);
       }else {
          v.setText(str3);
          v.setVisibility(i1);
       }
       str1 = p1.b().b("accessoryStyle", "");
       str1.getClass();
       if ((i4 = str1.hashCode()) != -1654568714) {
          if (i4 != -710065853) {
             if (i4 != 0x5e8f046 || !str1.equals("heart")) {
             label_02e4 :
                i1 = -1;
             }else {
                i1 = 2;
             }
          }else if(!str1.equals("highMatch")){
             goto label_02e4 ;
          }else {
             i1 = 1;
          }
       }else if(!str1.equals("whiteText")){
          goto label_02e4 ;
       }
       if (i1) {
          if (i1 != 1) {
             olq2 = omq2.B;
             if (i1 != 2) {
                v.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
                v.setTextColor(olq2);
             }else {
                v.setCompoundDrawablesWithIntrinsicBounds(null, null, omq2.y, null);
                v.setTextColor(olq2);
             }
          }else {
             v.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
             v.setTextColor(omq2.z);
          }
       }else {
          v.setCompoundDrawablesWithIntrinsicBounds(null, null, null, null);
          v.setTextColor(omq2.A);
       }
       return;
    }
    public final View c(ViewGroup p0,uu2 p1){
       lq2 olq2 = new lq2(p0.getContext(), p0, this.b, this.c);
       eo5.P(olq2);
       return olq2.b;
    }
    public final EnumSet d(){
       return EnumSet.of(nk2.b, nk2.t);
    }
    public abstract int e();
}

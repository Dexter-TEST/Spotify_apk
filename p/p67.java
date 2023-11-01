package p.p67;
import p.c61;
import androidx.appcompat.widget.Toolbar;
import java.lang.Object;
import java.lang.CharSequence;
import android.graphics.drawable.Drawable;
import android.content.Context;
import android.view.View;
import p.ej4;
import android.util.AttributeSet;
import p.p86;
import android.text.TextUtils;
import p.wh7;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.content.res.TypedArray;
import android.view.ViewGroup$LayoutParams;
import java.lang.Math;
import p.f06;
import androidx.appcompat.widget.AppCompatTextView;
import java.lang.String;
import p.f5;
import android.view.View$OnClickListener;

public final class p67 implements c61	// class@002201 from classes.dex
{
    public final Toolbar a;
    public int b;
    public View c;
    public Drawable d;
    public Drawable e;
    public Drawable f;
    public boolean g;
    public CharSequence h;
    public CharSequence i;
    public CharSequence j;
    public Window$Callback k;
    public boolean l;
    public w5 m;
    public int n;
    public Drawable o;

    public void p67(Toolbar p0,boolean p1){
       Drawable uDrawable;
       p67 to;
       int i2;
       p67 tc;
       Context context;
       Toolbar b2;
       super();
       int i = 0;
       this.n = i;
       this.a = p0;
       this.h = p0.getTitle();
       this.i = p0.getSubtitle();
       int b = true;
       boolean b1 = (this.h != null)? true: false;
       this.g = b1;
       this.f = p0.getNavigationIcon();
       AttributeSet uAttributeSe = null;
       p86 op86 = p86.m(p0.getContext(), uAttributeSe, ej4.D, R.attr.actionBarStyle);
       int i1 = 15;
       this.o = op86.e(i1);
       if (p1) {
          CharSequence uCharSequenc = op86.k(27);
          if (!TextUtils.isEmpty(uCharSequenc)) {
             this.g = b;
             this.h = uCharSequenc;
             if ((this.b & 0x08)) {
                p0.setTitle(uCharSequenc);
                if (this.g != null) {
                   wh7.p(p0.getRootView(), uCharSequenc);
                }
             }
          }
          uCharSequenc = op86.k(25);
          if (!TextUtils.isEmpty(uCharSequenc)) {
             this.i = uCharSequenc;
             if ((this.b & 0x08)) {
                p0.setSubtitle(uCharSequenc);
             }
          }
          if ((uDrawable = op86.e(20)) != null) {
             this.e = uDrawable;
             this.c();
          }
          if ((uDrawable = op86.e(17)) != null) {
             this.d = uDrawable;
             this.c();
          }
          if (this.f == null && (to = this.o) != null) {
             this.f = to;
             if ((this.b & 0x04)) {
                p0.setNavigationIcon(to);
             }else {
                p0.setNavigationIcon(uAttributeSe);
             }
          }
          this.b(op86.h(10, i));
          if (i2 = op86.i(9, i)) {
             View view = LayoutInflater.from(p0.getContext()).inflate(i2, p0, i);
             if ((tc = this.c) != null && ((this.b & 0x10))) {
                p0.removeView(tc);
             }
             this.c = view;
             if (view != null && ((this.b & 0x10))) {
                p0.addView(view);
             }
             this.b((this.b | 0x10));
          }
          if ((i2 = op86.b.getLayoutDimension(13, i)) > 0) {
             ViewGroup$LayoutParams layoutParams = p0.getLayoutParams();
             layoutParams.height = i2;
             p0.setLayoutParams(layoutParams);
          }
          i2 = op86.c(7, -1);
          b = op86.c(3, -1);
          if (i2 >= 0 || b >= 0) {
             i2 = Math.max(i2, i);
             b = Math.max(b, i);
             if (p0.K == null) {
                p0.K = new f06();
             }
             p0.K.a(i2, b);
          }
          if (i2 = op86.i(28, i)) {
             context = p0.getContext();
             p0.C = i2;
             if ((b2 = p0.b) != null) {
                b2.setTextAppearance(context, i2);
             }
          }
          if (i2 = op86.i(26, i)) {
             context = p0.getContext();
             p0.D = i2;
             if ((b2 = p0.c) != null) {
                b2.setTextAppearance(context, i2);
             }
          }
          if (i2 = op86.i(22, i)) {
             p0.setPopupTheme(i2);
          }
       }else if(p0.getNavigationIcon() != null){
          this.o = p0.getNavigationIcon();
       }else {
          i1 = 11;
       }
       this.b = i1;
       op86.o();
       if ((i = 0x7f120001) != this.n) {
          this.n = i;
          if (TextUtils.isEmpty(p0.getNavigationContentDescription())) {
             if ((to = this.n) != null) {
                uAttributeSe = this.a().getString(to);
             }
             this.j = uAttributeSe;
             if ((this.b & 0x04)) {
                if (TextUtils.isEmpty(uAttributeSe)) {
                   p0.setNavigationContentDescription(this.n);
                }else {
                   p0.setNavigationContentDescription(this.j);
                }
             }
          }
       }
       this.j = p0.getNavigationContentDescription();
       p0.setNavigationOnClickListener(new f5(this));
       return;
    }
    public final Context a(){
       return this.a.getContext();
    }
    public final void b(int p0){
       p67 tf;
       p67 tc;
       int i = this.b ^ p0;
       this.b = p0;
       if (i) {
          p67 ta = this.a;
          if ((i & 0x04)) {
             if (((p0 & 0x04)) && ((p0 & 0x04))) {
                if (TextUtils.isEmpty(this.j)) {
                   ta.setNavigationContentDescription(this.n);
                }else {
                   ta.setNavigationContentDescription(this.j);
                }
             }
             if ((this.b & 0x04)) {
                if ((tf = this.f) == null) {
                   tf = this.o;
                }
                ta.setNavigationIcon(tf);
             }else {
                ta.setNavigationIcon(null);
             }
          }
          if ((i & 0x03)) {
             this.c();
          }
          if ((i & 0x08)) {
             if ((p0 & 0x08)) {
                ta.setTitle(this.h);
                ta.setSubtitle(this.i);
             }else {
                ta.setTitle(null);
                ta.setSubtitle(null);
             }
          }
          if (((i & 0x10)) && (tc = this.c) != null) {
             if ((p0 & 0x10)) {
                ta.addView(tc);
             }else {
                ta.removeView(tc);
             }
          }
       }
       return;
    }
    public final void c(){
       p67 tb = this.b;
       if ((tb & 0x02)) {
          if ((tb & 0x01)) {
             if ((tb = this.e) == null) {
                tb = this.d;
             }
          }else {
             tb = this.d;
          }
       }else {
          Drawable uDrawable = null;
       }
       this.a.setLogo(tb);
       return;
    }
}

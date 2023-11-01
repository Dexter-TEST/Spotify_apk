package p.ez6;
import android.widget.LinearLayout;
import com.google.android.material.tabs.TabLayout;
import android.content.Context;
import p.wh7;
import android.view.View;
import p.eh7;
import android.os.Build$VERSION;
import p.vf;
import android.view.PointerIcon;
import p.mh5;
import java.lang.Object;
import p.mh7;
import p.bx;
import p.lv1;
import android.util.AttributeSet;
import android.content.res.TypedArray;
import p.ty0;
import p.ax;
import java.lang.Math;
import p.e27;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import p.ry7;
import p.q24;
import p.p24;
import android.graphics.Paint;
import java.lang.ref.Reference;
import android.widget.FrameLayout;
import java.lang.IllegalStateException;
import java.lang.String;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.graphics.Rect;
import android.view.ViewOverlay;
import p.cz6;
import android.widget.ImageView;
import android.widget.TextView;
import p.u27;
import android.view.LayoutInflater;
import p.vv7;
import p.dz6;
import android.view.View$OnLayoutChangeListener;
import java.lang.CharSequence;
import android.text.TextUtils;
import java.lang.IllegalArgumentException;
import p.eb3;
import android.graphics.drawable.GradientDrawable;
import p.tu6;
import android.util.StateSet;
import android.graphics.drawable.RippleDrawable;
import p.dh7;
import p.ce1;
import android.graphics.PorterDuff$Mode;
import java.lang.Class;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import p.xe7;
import p.r14;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.StringBuilder;
import android.content.res.Resources;
import java.lang.Integer;
import p.x3;
import android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo;
import p.w3;
import android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction;
import android.os.Bundle;
import android.view.View$MeasureSpec;
import android.text.Layout;
import android.text.TextPaint;

public final class ez6 extends LinearLayout	// class@00152b from classes.dex
{
    public int A;
    public final TabLayout B;
    public cz6 a;
    public TextView b;
    public ImageView c;
    public View t;
    public bx v;
    public View w;
    public TextView x;
    public ImageView y;
    public Drawable z;
    public static final int C;

    public void ez6(TabLayout p0,Context p1){
       int sDK_INT;
       this.B = p0;
       super(p1);
       this.A = 2;
       this.f(p1);
       eh7.k(this, p0.t, p0.v, p0.w, p0.x);
       this.setGravity(17);
       this.setOrientation((p0.R ^ 1));
       this.setClickable(1);
       Context context = this.getContext();
       vf ovf = ((sDK_INT = Build$VERSION.SDK_INT) >= 24)? new vf(5, mh5.b(context, 1002)): new vf(5, null);
       if (sDK_INT >= 24) {
          mh7.d(this, ovf.b);
       }
       return;
    }
    private bx getBadge(){
       return this.v;
    }
    private bx getOrCreateBadge(){
       int defaultColor;
       bx f;
       bx g;
       ez6 tv;
       if (this.v == null) {
          Context context = this.getContext();
          bx uobx = new bx(context);
          int[] ointArray = new int[0];
          TypedArray typedArray = ty0.q(context, null, lv1.g, R.attr.badgeStyle, 0x7f130510, ointArray);
          int intx = typedArray.getInt(8, 4);
          bx y = uobx.y;
          bx c = uobx.c;
          if (y.v != intx) {
             y.v = intx;
             uobx.B = (int)Math.pow(10.00f, ((double)intx - 0x3ff0000000000000)) - 1;
             c.d = true;
             uobx.g();
             uobx.invalidateSelf();
          }
          intx = 9;
          if (typedArray.hasValue(intx)) {
             intx = Math.max(0, typedArray.getInt(intx, 0));
             if (y.t != intx) {
                y.t = intx;
                c.d = true;
                uobx.g();
                uobx.invalidateSelf();
             }
          }
          intx = ry7.x(context, typedArray, 0).getDefaultColor();
          y.a = intx;
          ColorStateList uColorStateL = ColorStateList.valueOf(intx);
          bx b = uobx.b;
          if (b.a.c != uColorStateL) {
             b.k(uColorStateL);
             uobx.invalidateSelf();
          }
          intx = 3;
          if (typedArray.hasValue(intx)) {
             defaultColor = ry7.x(context, typedArray, intx).getDefaultColor();
             y.b = defaultColor;
             if (c.a.getColor() != defaultColor) {
                c.a.setColor(defaultColor);
                uobx.invalidateSelf();
             }
          }
          defaultColor = typedArray.getInt(true, 0x800035);
          if (y.z != defaultColor) {
             y.z = defaultColor;
             if ((f = uobx.F) != null && f.get() != null) {
                View view = uobx.F.get();
                FrameLayout uFrameLayout = ((g = uobx.G) != null)? g.get(): null;
                uobx.f(view, uFrameLayout);
             }
          }
          y.B = typedArray.getDimensionPixelOffset(6, 0);
          uobx.g();
          y.C = typedArray.getDimensionPixelOffset(10, 0);
          uobx.g();
          y.D = typedArray.getDimensionPixelOffset(7, y.B);
          uobx.g();
          y.E = typedArray.getDimensionPixelOffset(11, y.C);
          uobx.g();
          defaultColor = 2;
          if (typedArray.hasValue(defaultColor)) {
             uobx.v = (float)typedArray.getDimensionPixelSize(defaultColor, (int)uobx.v);
          }
          if (typedArray.hasValue(4)) {
             uobx.x = (float)typedArray.getDimensionPixelSize(4, (int)uobx.x);
          }
          defaultColor = 5;
          if (typedArray.hasValue(defaultColor)) {
             uobx.w = (float)typedArray.getDimensionPixelSize(defaultColor, (int)uobx.w);
          }
          typedArray.recycle();
          this.v = uobx;
       }
       this.c();
       if ((tv = this.v) != null) {
          return tv;
       }else {
          throw new IllegalStateException("Unable to create badge");
       }
    }
    public final void a(View p0){
       ViewGroup parent;
       boolean b = false;
       int i = (this.v != null)? 1: 0;
       if (!i) {
          return;
       }else if(p0 != null){
          this.setClipChildren(b);
          this.setClipToPadding(b);
          if ((parent = this.getParent()) != null) {
             parent.setClipChildren(b);
             parent.setClipToPadding(b);
          }
          ez6 tv = this.v;
          Rect b1 = new Rect();
          p0.getDrawingRect(b1);
          tv.setBounds(b1);
          tv.f(p0, null);
          if (tv.c() != null) {
             tv.c().setForeground(tv);
          }else {
             p0.getOverlay().add(tv);
          }
          this.t = p0;
       }
       return;
    }
    public final void b(){
       ViewGroup parent;
       ez6 tt;
       ez6 tv;
       boolean b = true;
       int i = (this.v != null)? 1: 0;
       if (!i) {
          return;
       }else {
          this.setClipChildren(b);
          this.setClipToPadding(b);
          if ((parent = this.getParent()) != null) {
             parent.setClipChildren(b);
             parent.setClipToPadding(b);
          }
          if ((tt = this.t) != null) {
             if ((tv = this.v) != null) {
                if (tv.c() != null) {
                   tv.c().setForeground(null);
                }else {
                   tt.getOverlay().remove(tv);
                }
             }
             this.t = null;
          }
          return;
       }
    }
    public final void c(){
       ez6 tc;
       ez6 ta;
       int i = (this.v != null)? 1: 0;
       if (!i) {
          return;
       }else if(this.w != null){
          this.b();
       }else if((tc = this.c) != null && ((ta = this.a) != null && ta.a != null)){
          if (this.t != tc) {
             this.b();
             this.a(this.c);
          }else {
             this.d(tc);
          }
       }else if((tc = this.b) != null && this.a != null){
          if (this.t != tc) {
             this.b();
             this.a(this.b);
          }else {
             this.d(tc);
          }
       }else {
          this.b();
       }
       return;
    }
    public final void d(View p0){
       ez6 tv;
       int i = ((tv = this.v) != null)? 1: 0;
       if (i && p0 == this.t) {
          Rect i1 = new Rect();
          p0.getDrawingRect(i1);
          tv.setBounds(i1);
          tv.f(p0, null);
       }
       return;
    }
    public final void drawableStateChanged(){
       super.drawableStateChanged();
       int[] drawableStat = this.getDrawableState();
       ez6 tz = this.z;
       int i = 0;
       if (tz != null && tz.isStateful()) {
          i = i | this.z.setState(drawableStat);
       }
       if (i) {
          this.invalidate();
          this.B.invalidate();
       }
       return;
    }
    public final void e(){
       ViewParent parent;
       ez6 tb;
       TextView textView;
       TabLayout z;
       ez6 tc;
       cz6 f;
       int selectedTabP;
       ez6 tw;
       ez6 ta = this.a;
       Drawable uDrawable = null;
       cz6 e = (ta != null)? ta.e: uDrawable;
       if (e != null) {
          if ((parent = e.getParent()) != this) {
             if (parent != null) {
                parent.removeView(e);
             }
             this.addView(e);
          }
          this.w = e;
          tb = this.b;
          int i = 8;
          if (tb != null) {
             tb.setVisibility(i);
          }
          if ((tb = this.c) != null) {
             tb.setVisibility(i);
             this.c.setImageDrawable(uDrawable);
          }
          textView = e.findViewById(0x1020014);
          this.x = textView;
          if (textView != null) {
             this.A = u27.b(textView);
          }
          this.y = e.findViewById(0x1020006);
       }else if((tw = this.w) != null){
          this.removeView(tw);
          this.w = uDrawable;
       }
       this.x = uDrawable;
       this.y = uDrawable;
       boolean b = false;
       if (this.w == null) {
          if (this.c == null) {
             ImageView imageView = LayoutInflater.from(this.getContext()).inflate(R.layout.design_layout_tab_icon, this, b);
             this.c = imageView;
             this.addView(imageView, b);
          }
          if (this.b == null) {
             textView = LayoutInflater.from(this.getContext()).inflate(R.layout.design_layout_tab_text, this, b);
             this.b = textView;
             this.addView(textView);
             this.A = u27.b(this.b);
          }
          tb = this.B;
          vv7.Q(this.b, tb.y);
          if ((z = tb.z) != null) {
             this.b.setTextColor(z);
          }
          this.g(this.b, this.c);
          this.c();
          if ((tc = this.c) != null) {
             tc.addOnLayoutChangeListener(new dz6(this, tc, b));
          }
          if ((tc = this.b) != null) {
             tc.addOnLayoutChangeListener(new dz6(this, tc, b));
          }
       }else if((tc = this.x) == null && this.y == null){
          this.g(tc, this.y);
       }
       if (ta != null && !TextUtils.isEmpty(ta.c)) {
          this.setContentDescription(ta.c);
       }
       if (ta != null) {
          if ((f = ta.f) != null) {
             ta = ((selectedTabP = f.getSelectedTabPosition()) != -1 && selectedTabP == ta.d)? 1: 0;
             if (ta) {
                b = true;
             }
          }else {
             throw new IllegalArgumentException("Tab not attached to a TabLayout");
          }
       }
       this.setSelected(b);
       return;
    }
    public final void f(Context p0){
       TabLayout v;
       ez6 tB = this.B;
       TabLayout h = tB.H;
       Drawable uDrawable = null;
       if (h != null) {
          Drawable uDrawable1 = eb3.m(p0, h);
          this.z = uDrawable1;
          if (uDrawable1 != null && uDrawable1.isStateful()) {
             this.z.setState(this.getDrawableState());
          }
       }else {
          this.z = uDrawable;
       }
       GradientDrawable gradientDraw = new GradientDrawable();
       int i = 0;
       gradientDraw.setColor(i);
       if (tB.B != null) {
          GradientDrawable gradientDraw1 = new GradientDrawable();
          gradientDraw1.setCornerRadius(0.00f);
          gradientDraw1.setColor(-1);
          TabLayout b = tB.B;
          int[][] ointArray = new int[][2];
          int[] ointArray1 = new int[2];
          ointArray[0] = tu6.K;
          ointArray1[0] = tu6.s(b, tu6.J);
          ointArray[1] = StateSet.NOTHING;
          ointArray1[1] = tu6.s(b, tu6.I);
          ColorStateList uColorStateL = new ColorStateList(ointArray, ointArray1);
          if ((v = tB.V) != null) {
             gradientDraw = uDrawable;
          }
          if (v == null) {
             uDrawable = gradientDraw1;
          }
          gradientDraw = new RippleDrawable(uColorStateL, gradientDraw, uDrawable);
       }
       dh7.q(this, gradientDraw);
       tB.invalidate();
       return;
    }
    public final void g(TextView p0,ImageView p1){
       cz6 a;
       TabLayout e;
       ez6 ta1;
       ez6 ta2;
       ez6 ta = this.a;
       CharSequence uCharSequenc = null;
       Drawable uDrawable = (ta != null && (a = ta.a) != null)? eb3.L(a).mutate(): uCharSequenc;
       ez6 tB = this.B;
       if (uDrawable != null) {
          ce1.h(uDrawable, tB.A);
          if ((e = tB.E) != null) {
             ce1.i(uDrawable, e);
          }
       }
       cz6 b = ((ta1 = this.a) != null)? ta1.b: uCharSequenc;
       int i = 8;
       if (p1 != null) {
          if (uDrawable != null) {
             p1.setImageDrawable(uDrawable);
             p1.setVisibility(0);
             this.setVisibility(0);
          }else {
             p1.setVisibility(i);
             p1.setImageDrawable(uCharSequenc);
          }
       }
       int i1 = TextUtils.isEmpty(b) ^ 0x01;
       if (p0 != null) {
          if (i1) {
             p0.setText(b);
             this.a.getClass();
             p0.setVisibility(0);
             this.setVisibility(0);
          }else {
             p0.setVisibility(i);
             p0.setText(uCharSequenc);
          }
       }
       if (p1 != null) {
          ViewGroup$MarginLayoutParams layoutParams = p1.getLayoutParams();
          i = (i1 && !p1.getVisibility())? (int)xe7.q(this.getContext(), i): 0;
          if (tB.R != null) {
             if (i != r14.b(layoutParams)) {
                r14.g(layoutParams, i);
                layoutParams.bottomMargin = 0;
                p1.setLayoutParams(layoutParams);
                p1.requestLayout();
             }
          }else if(i != layoutParams.bottomMargin){
             layoutParams.bottomMargin = i;
             r14.g(layoutParams, 0);
             p1.setLayoutParams(layoutParams);
             p1.requestLayout();
          }
       }
       if ((ta2 = this.a) != null) {
          uCharSequenc = ta2.c;
       }
       if (Build$VERSION.SDK_INT > 23) {
          if (!i1) {
             b = uCharSequenc;
          }
          eb3.D(this, b);
       }
       return;
    }
    public int getContentHeight(){
       object oobject;
       View[] viewArray = new View[]{this.b,this.c,this.w};
       int i = 0;
       int i1 = 0;
       int i2 = 0;
       int i3 = 0;
       while (i < 3) {
          if ((oobject = viewArray[i]) != null && !oobject.getVisibility()) {
             i2 = (i3)? Math.min(i2, oobject.getTop()): oobject.getTop();
             i1 = (i3)? Math.max(i1, oobject.getBottom()): oobject.getBottom();
             i3 = 1;
          }
          i = i + 1;
       }
       return (i1 - i2);
    }
    public int getContentWidth(){
       object oobject;
       View[] viewArray = new View[]{this.b,this.c,this.w};
       int i = 0;
       int i1 = 0;
       int i2 = 0;
       int i3 = 0;
       while (i < 3) {
          if ((oobject = viewArray[i]) != null && !oobject.getVisibility()) {
             i2 = (i3)? Math.min(i2, oobject.getLeft()): oobject.getLeft();
             i1 = (i3)? Math.max(i1, oobject.getRight()): oobject.getRight();
             i3 = 1;
          }
          i = i + 1;
       }
       return (i1 - i2);
    }
    public cz6 getTab(){
       return this.a;
    }
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo p0){
       String str1;
       Context uContext;
       super.onInitializeAccessibilityNodeInfo(p0);
       ez6 tv = this.v;
       int i = 1;
       if (tv != null && tv.isVisible()) {
          StringBuilder str = this.getContentDescription()+", ";
          tv = this.v;
          if (!tv.isVisible()) {
          label_0072 :
             str1 = null;
          }else {
             bx y = tv.y;
             if (tv.e()) {
                if (y.x > null && (uContext = tv.a.get()) != null) {
                   bx b = tv.B;
                   if (tv.d() <= b) {
                      Object[] objArray = new Object[i];
                      objArray[0] = Integer.valueOf(tv.d());
                      str1 = uContext.getResources().getQuantityString(y.x, tv.d(), objArray);
                   }else {
                      Object[] objArray1 = new Object[i];
                      objArray1[0] = Integer.valueOf(b);
                      str1 = uContext.getString(y.y, objArray1);
                   }
                }else {
                   goto label_0072 ;
                }
             }else {
                str1 = y.w;
             }
          }
          p0.setContentDescription(str+str1);
       }
       p0.setCollectionItemInfo(x3.f(0, i, this.a.d, i, this.isSelected()).a);
       if (this.isSelected()) {
          p0.setClickable(0);
          p0.removeAction(w3.e.a);
       }
       p0.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", this.getResources().getString(R.string.item_view_role_description));
       return;
    }
    public final void onMeasure(int p0,int p1){
       int tabMaxWidth;
       Layout layout;
       int size = View$MeasureSpec.getSize(p0);
       int mode = View$MeasureSpec.getMode(p0);
       ez6 tB = this.B;
       if ((tabMaxWidth = tB.getTabMaxWidth()) > 0 && (!mode && size <= tabMaxWidth)) {
          p0 = View$MeasureSpec.makeMeasureSpec(tB.I, Integer.MIN_VALUE);
       }
       super.onMeasure(p0, p1);
       if (this.b != null) {
          TabLayout f = tB.F;
          ez6 tA = this.A;
          ez6 tc = this.c;
          int i = 1;
          if (tc != null && !tc.getVisibility()) {
             tA = 1;
          }else if((tc = this.b) != null && tc.getLineCount() > i){
             f = tB.G;
          }
          int lineCount = this.b.getLineCount();
          int i1 = u27.b(this.b);
          if ((v3 = this.b.getTextSize() - f) || (i1 >= 0 || tA == i1)) {
             if (tB.Q == i && (tc > 0 && (lineCount == i && ((layout = this.b.getLayout()) == null && ((float)((this.getMeasuredWidth() - this.getPaddingLeft()) - this.getPaddingRight()) - ((f / layout.getPaint().getTextSize()) * layout.getLineWidth(0))) <= 0)))) {
                i = 0;
             }
             if (i) {
                this.b.setTextSize(0, f);
                this.b.setMaxLines(tA);
                super.onMeasure(p0, p1);
             }
          }
       }
       return;
    }
    public final boolean performClick(){
       boolean b = super.performClick();
       if (this.a != null) {
          if (!b) {
             this.playSoundEffect(0);
          }
          this.a.a();
          b = true;
       }
       return b;
    }
    public void setSelected(boolean p0){
       ez6 tb;
       int i = (this.isSelected() != p0)? 1: 0;
       super.setSelected(p0);
       if ((tb = this.b) != null) {
          tb.setSelected(p0);
       }
       if ((tb = this.c) != null) {
          tb.setSelected(p0);
       }
       if ((tb = this.w) != null) {
          tb.setSelected(p0);
       }
       return;
    }
    public void setTab(cz6 p0){
       if (p0 != this.a) {
          this.a = p0;
          this.e();
       }
       return;
    }
}

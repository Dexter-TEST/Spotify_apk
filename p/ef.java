package p.ef;
import p.wu0;
import android.widget.LinearLayout;
import android.content.Context;
import android.util.AttributeSet;
import p.b17;
import java.util.ArrayList;
import android.view.View;
import android.os.Build$VERSION;
import android.view.ViewOutlineProvider;
import p.ye7;
import android.content.res.TypedArray;
import p.ty0;
import android.animation.StateListAnimator;
import android.animation.AnimatorInflater;
import p.lv1;
import android.graphics.drawable.Drawable;
import p.wh7;
import p.dh7;
import android.graphics.drawable.ColorDrawable;
import p.q24;
import android.content.res.ColorStateList;
import android.view.ViewGroup;
import p.uf;
import java.lang.Object;
import p.j15;
import p.jh7;
import android.view.ViewGroup$LayoutParams;
import p.cf;
import android.widget.LinearLayout$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;
import p.df;
import p.bf;
import p.ri0;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import p.xp7;
import p.qi0;
import p.kj7;
import java.lang.Math;
import android.widget.FrameLayout$LayoutParams;
import p.pi0;
import p.et0;
import com.spotify.allboarding.allboardingimpl.utils.PickerCollapsingTitleBar;
import android.graphics.Canvas;
import android.content.res.Resources;
import android.animation.ValueAnimator;
import p.je;
import android.animation.TimeInterpolator;
import p.xe;
import android.animation.ValueAnimator$AnimatorUpdateListener;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import java.lang.ref.Reference;
import p.xu0;
import com.google.android.material.appbar.AppBarLayout$Behavior;
import android.view.View$MeasureSpec;
import p.gh7;
import java.lang.IllegalArgumentException;
import java.lang.String;
import android.graphics.drawable.Drawable$Callback;
import p.eh7;
import p.eb3;

public abstract class ef extends LinearLayout implements wu0	// class@00147b from classes.dex
{
    public boolean A;
    public boolean B;
    public boolean C;
    public int D;
    public WeakReference E;
    public ValueAnimator F;
    public final ArrayList G;
    public int[] H;
    public Drawable I;
    public int a;
    public int b;
    public int c;
    public int t;
    public boolean v;
    public int w;
    public xp7 x;
    public ArrayList y;
    public boolean z;

    public void ef(Context p0,AttributeSet p1,int p2){
       int i = this;
       AttributeSet uAttributeSe = p1;
       int i1 = p2;
       super(b17.D(p0, uAttributeSe, i1, R.style.Widget.Design.AppBarLayout), uAttributeSe, i1);
       i.b = -1;
       i.c = -1;
       i.t = -1;
       i.w = 0;
       i.G = new ArrayList();
       Context context = this.getContext();
       this.setOrientation(1);
       int sDK_INT = Build$VERSION.SDK_INT;
       if (this.getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
          this.setOutlineProvider(ViewOutlineProvider.BOUNDS);
       }
       Context context1 = this.getContext();
       int[] ointArray = new int[0];
       TypedArray typedArray = ty0.q(context1, p1, ye7.t, p2, R.style.Widget.Design.AppBarLayout, ointArray);
       if (typedArray.hasValue(0)) {
          this.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context1, typedArray.getResourceId(0, 0)));
       }
       typedArray.recycle();
       ointArray = new int[0];
       TypedArray typedArray1 = ty0.q(context, p1, lv1.e, p2, R.style.Widget.Design.AppBarLayout, ointArray);
       dh7.q(this, typedArray1.getDrawable(0));
       if (this.getBackground() instanceof ColorDrawable) {
          q24 oq24 = new q24();
          oq24.k(ColorStateList.valueOf(this.getBackground().getColor()));
          oq24.i(context);
          dh7.q(this, oq24);
       }
       int i2 = 4;
       if (typedArray1.hasValue(i2)) {
          this.d(typedArray1.getBoolean(i2, 0), 0, 0);
       }
       i2 = 3;
       if (typedArray1.hasValue(i2)) {
          ye7.T(this, (float)typedArray1.getDimensionPixelSize(i2, 0));
       }
       if (sDK_INT >= 26) {
          if (typedArray1.hasValue(2)) {
             this.setKeyboardNavigationCluster(typedArray1.getBoolean(2, 0));
          }
          if (typedArray1.hasValue(1)) {
             this.setTouchscreenBlocksFocus(typedArray1.getBoolean(1, 0));
          }
       }
       i.C = typedArray1.getBoolean(5, 0);
       i.D = typedArray1.getResourceId(6, -1);
       this.setStatusBarForeground(typedArray1.getDrawable(7));
       typedArray1.recycle();
       jh7.u(this, new uf(2, this));
       return;
    }
    public static cf b(ViewGroup$LayoutParams p0){
       if (p0 instanceof LinearLayout$LayoutParams) {
          return new cf(p0);
       }
       if (p0 instanceof ViewGroup$MarginLayoutParams) {
          return new cf(p0);
       }
       return new cf(p0);
    }
    public final void a(df p0){
       if (this.y == null) {
          this.y = new ArrayList();
       }
       if (p0 != null && !this.y.contains(p0)) {
          this.y.add(p0);
       }
       return;
    }
    public final void c(int p0){
       ef ty;
       bf uobf;
       CollapsingToolbarLayout p;
       qi0 a;
       float f;
       float f1;
       this.a = p0;
       if (!this.willNotDraw()) {
          dh7.k(this);
       }
       if ((ty = this.y) != null) {
          int i = ty.size();
          int i1 = 0;
          while (i1 < i) {
             if ((uobf = this.y.get(i1)) != null) {
                ri0 b = uobf.b;
                switch (uobf.a){
                    case 0:
                      b.N = p0;
                      int i2 = ((p = b.P) != null)? p.d(): 0;
                      int childCount = b.getChildCount();
                      int i3 = 0;
                      while (i3 < childCount) {
                         View childAt = b.getChildAt(i3);
                         qi0 layoutParams = childAt.getLayoutParams();
                         kj7 okj7 = CollapsingToolbarLayout.b(childAt);
                         if ((a = layoutParams.a) != 1) {
                            if (a == 2) {
                               int i4 = - p0;
                               f = (float)i4 * layoutParams.b;
                               okj7.b(Math.round(f));
                            }
                         }else {
                            int i5 = - p0;
                            int i6 = b.getHeight() - CollapsingToolbarLayout.b(childAt).b;
                            i6 = i6 - childAt.getHeight();
                            i6 = i6 - childAt.getLayoutParams().bottomMargin;
                            okj7.b(b17.f(i5, 0, i6));
                         }
                         i3 = i3 + 1;
                      }
                      b.d();
                      if (b.G != null && i2 > 0) {
                         dh7.k(b);
                      }
                      childCount = b.getHeight();
                      i3 = childCount - dh7.d(b);
                      i3 = i3 - i2;
                      childCount = childCount - b.getScrimVisibleHeightTrigger();
                      f1 = (float)childCount;
                      float f2 = (float)i3;
                      f1 = f1 / f2;
                      f = 0x3f800000;
                      f1 = Math.min(f, f1);
                      CollapsingToolbarLayout b1 = b.B;
                      b1.e = f1;
                      b1.f = et0.l(f, f1, 0x3f000000, f1);
                      int i7 = b.N + i3;
                      b1.g = i7;
                      float f3 = (float)Math.abs(p0) / f2;
                      b1.n(f3);
                      break;
                    default:
                      PickerCollapsingTitleBar k = b.K;
                      if (!this.getTotalScrollRange()) {
                         f1 = 0;
                      }else {
                         f1 = (float)p0 / (float)this.getTotalScrollRange();
                         f1 = Math.abs(f1);
                      }
                      k.setAlpha(f1);
                }
             }
             i1 = i1 + 1;
          }
       }
       return;
    }
    public final boolean checkLayoutParams(ViewGroup$LayoutParams p0){
       return p0 instanceof cf;
    }
    public final void d(boolean p0,boolean p1,boolean p2){
       int i = (p0)? 1: 2;
       int i1 = 0;
       int i2 = (p1)? 4: 0;
       i = i | i2;
       if (p2) {
          i1 = 8;
       }
       this.w = i | i1;
       this.requestLayout();
       return;
    }
    public final void draw(Canvas p0){
       super.draw(p0);
       int i = (this.I != null && this.getTopInset() > 0)? 1: 0;
       if (i) {
          p0.translate(0, (float)(- this.a));
          this.I.draw(p0);
          p0.restoreToCount(p0.save());
       }
       return;
    }
    public final void drawableStateChanged(){
       ef tI;
       super.drawableStateChanged();
       int[] drawableStat = this.getDrawableState();
       if ((tI = this.I) != null && (tI.isStateful() && tI.setState(drawableStat))) {
          this.invalidateDrawable(tI);
       }
       return;
    }
    public final boolean e(boolean p0){
       ef tF;
       int i = 1;
       int i1 = 0;
       if (((this.z ^ i)) && this.B != p0) {
          this.B = p0;
          this.refreshDrawableState();
          if (this.C != null && this.getBackground() instanceof q24) {
             q24 background = this.getBackground();
             float dimension = this.getResources().getDimension(R.dimen.design_appbar_elevation);
             int i2 = (p0)? 0: dimension;
             if (!p0) {
                dimension = 0;
             }
             if ((tF = this.F) != null) {
                tF.cancel();
             }
             float[] uofloatArray = new float[]{i2,dimension};
             ValueAnimator valueAnimato = ValueAnimator.ofFloat(uofloatArray);
             this.F = valueAnimato;
             valueAnimato.setDuration((long)this.getResources().getInteger(R.integer.app_bar_elevation_anim_duration));
             this.F.setInterpolator(je.a);
             this.F.addUpdateListener(new xe(this, background));
             this.F.start();
          }
       }else {
          i = false;
       }
       return i;
    }
    public final boolean f(View p0){
       ef tD;
       int i = 0;
       if (this.E == null && (tD = this.D) != -1) {
          View view = (p0 != null)? p0.findViewById(tD): i;
          if (view == null && this.getParent() instanceof ViewGroup) {
             view = this.getParent().findViewById(this.D);
          }
          if (view != null) {
             this.E = new WeakReference(view);
          }
       }
       if ((tD = this.E) != null) {
          i = tD.get();
       }
       if (i != null) {
          p0 = i;
       }
       boolean b = (p0 != null && (p0.canScrollVertically(-1) && p0.getScrollY() <= 0))? true: false;
       return b;
    }
    public final boolean g(){
       int i = 0;
       if (this.getChildCount() > 0) {
          View childAt = this.getChildAt(i);
          if (childAt.getVisibility() != 8 && !dh7.b(childAt)) {
             i = true;
          }
       }
       return i;
    }
    public final ViewGroup$LayoutParams generateDefaultLayoutParams(){
       return new cf();
    }
    public final LinearLayout$LayoutParams generateDefaultLayoutParams(){
       return new cf();
    }
    public final ViewGroup$LayoutParams generateLayoutParams(AttributeSet p0){
       return new cf(this.getContext(), p0);
    }
    public final ViewGroup$LayoutParams generateLayoutParams(ViewGroup$LayoutParams p0){
       return ef.b(p0);
    }
    public final LinearLayout$LayoutParams generateLayoutParams(AttributeSet p0){
       return new cf(this.getContext(), p0);
    }
    public final LinearLayout$LayoutParams generateLayoutParams(ViewGroup$LayoutParams p0){
       return ef.b(p0);
    }
    public xu0 getBehavior(){
       return new AppBarLayout$Behavior();
    }
    public int getDownNestedPreScrollRange(){
       ef tc;
       int i2;
       int i3;
       if ((tc = this.c) != -1) {
          return tc;
       }
       int i = this.getChildCount() - 1;
       int i1 = 0;
       while (i >= 0) {
          View childAt = this.getChildAt(i);
          cf layoutParams = childAt.getLayoutParams();
          int measuredHeig = childAt.getMeasuredHeight();
          cf a = layoutParams.a;
          if ((i2 = a & 0x05) == 5) {
             i2 = layoutParams.topMargin + layoutParams.bottomMargin;
             if (i3 = a & 0x08) {
                i3 = dh7.d(childAt);
             }else if(i3 = a & 0x02){
                i3 = measuredHeig - dh7.d(childAt);
             }else {
                i3 = i2 + measuredHeig;
             label_0045 :
                if (!i && dh7.b(childAt)) {
                   measuredHeig = measuredHeig - this.getTopInset();
                   i3 = Math.min(i3, measuredHeig);
                }
                i1 = i1 + i3;
             }
             i3 = i3 + i2;
             goto label_0045 ;
          }else if(i1 > 0){
             break ;
          }
          i = i - 1;
       }
       i = Math.max(0, i1);
       this.c = i;
       return i;
    }
    public int getDownNestedScrollRange(){
       ef tt;
       int i3;
       int i4;
       if ((tt = this.t) != -1) {
          return tt;
       }
       int childCount = this.getChildCount();
       int i = 0;
       int i1 = 0;
       while (i < childCount) {
          View childAt = this.getChildAt(i);
          cf layoutParams = childAt.getLayoutParams();
          int i2 = layoutParams.topMargin + layoutParams.bottomMargin;
          i2 = i2 + childAt.getMeasuredHeight();
          layoutParams = layoutParams.a;
          if (i3 = layoutParams & 0x01) {
             i1 = i1 + i2;
             if (i4 = layoutParams & 0x02) {
                i1 = i1 - dh7.d(childAt);
                break ;
             }else {
                i = i + 1;
             }
          }else {
             break ;
          }
       }
       childCount = Math.max(0, i1);
       this.t = childCount;
       return childCount;
    }
    public int getLiftOnScrollTargetViewId(){
       return this.D;
    }
    public final int getMinimumHeightForVisibleOverlappingContent(){
       int i;
       int topInset = this.getTopInset();
       if (!(i = dh7.d(this))) {
          i = ((i = this.getChildCount()) >= 1)? dh7.d(this.getChildAt((i - 1))): 0;
          if (!i) {
             return (this.getHeight() / 3);
          }
       }
       return ((i * 2) + topInset);
    }
    public int getPendingAction(){
       return this.w;
    }
    public Drawable getStatusBarForeground(){
       return this.I;
    }
    public float getTargetElevation(){
       return 0;
    }
    public final int getTopInset(){
       ef tx;
       int i = ((tx = this.x) != null)? tx.d(): 0;
       return i;
    }
    public final int getTotalScrollRange(){
       ef tb;
       int i2;
       int i3;
       if ((tb = this.b) != -1) {
          return tb;
       }
       int childCount = this.getChildCount();
       int i = 0;
       int i1 = 0;
       while (i < childCount) {
          View childAt = this.getChildAt(i);
          cf layoutParams = childAt.getLayoutParams();
          int measuredHeig = childAt.getMeasuredHeight();
          cf a = layoutParams.a;
          if (i2 = a & 0x01) {
             measuredHeig = measuredHeig + layoutParams.topMargin;
             measuredHeig = measuredHeig + layoutParams.bottomMargin;
             measuredHeig = measuredHeig + i1;
             if (!i && dh7.b(childAt)) {
                measuredHeig = measuredHeig - this.getTopInset();
             }
             i1 = measuredHeig;
             if (i3 = a & 0x02) {
                i1 = i1 - dh7.d(childAt);
                break ;
             }
          }else {
             break ;
          }
          i = i + 1;
       }
       childCount = Math.max(0, i1);
       this.b = childCount;
       return childCount;
    }
    public int getUpNestedPreScrollRange(){
       return this.getTotalScrollRange();
    }
    public final void onAttachedToWindow(){
       super.onAttachedToWindow();
       Drawable background = this.getBackground();
       if (background instanceof q24) {
          ye7.U(this, background);
       }
       return;
    }
    public final int[] onCreateDrawableState(int p0){
       ef tA;
       if (this.H == null) {
          int[] ointArray = new int[4];
          this.H = ointArray;
       }
       ef tH = this.H;
       int[] ointArray1 = super.onCreateDrawableState((p0 + tH.length));
       int i = ((tA = this.A) != null)? 0x7f0305c1: -2130904513;
       tH[0] = i;
       i = (tA != null && this.B != null)? 0x7f0305c2: -2130904514;
       tH[1] = i;
       i = (tA != null)? 0x7f0305be: -2130904510;
       tH[2] = i;
       int i1 = (tA != null && this.B != null)? 0x7f0305bd: -2130904509;
       tH[3] = i1;
       return View.mergeDrawableStates(ointArray1, tH);
    }
    public final void onDetachedFromWindow(){
       ef tE;
       super.onDetachedFromWindow();
       if ((tE = this.E) != null) {
          tE.clear();
       }
       this.E = null;
       return;
    }
    public final void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       int topInset;
       ef tI;
       int i;
       super.onLayout(p0, p1, p2, p3, p4);
       p1 = 1;
       if (dh7.b(this) && this.g()) {
          topInset = this.getTopInset();
          for (p2 = this.getChildCount() - p1; p2 >= 0; p2--) {
             wh7.i(this.getChildAt(p2), topInset);
          }
       }
       this.b = -1;
       this.c = -1;
       this.t = -1;
       topInset = false;
       this.v = topInset;
       p2 = this.getChildCount();
       p3 = 0;
       while (p3 < p2) {
          if (this.getChildAt(p3).getLayoutParams().c != null) {
             this.v = p1;
             break ;
          }
          p3++;
       }
       if ((tI = this.I) != null) {
          tI.setBounds(topInset, topInset, this.getWidth(), this.getTopInset());
       }
       if (this.z == null) {
          if (this.C == null) {
             tI = this.getChildCount();
             p3 = 0;
             while (true) {
                if (p3 < tI) {
                   cf a = this.getChildAt(p3).getLayoutParams().a;
                   a = ((i = a & 0x01) == p1 && (a = a & 0x0a))? 1: 0;
                   if (a) {
                      tI = 1;
                   label_0089 :
                      if (!tI) {
                         p1 = 0;
                      }
                   }else {
                      p3++;
                   }
                }else {
                   tI = 0;
                   goto label_0089 ;
                }
             }
          }
          if (this.A != p1) {
             this.A = p1;
             this.refreshDrawableState();
          }
       }
       return;
    }
    public final void onMeasure(int p0,int p1){
       super.onMeasure(p0, p1);
       if ((p0 = View$MeasureSpec.getMode(p1)) != 0x40000000 && (dh7.b(this) && this.g())) {
          int measuredHeig = this.getMeasuredHeight();
          if (p0 != Integer.MIN_VALUE) {
             if (!p0) {
                measuredHeig = measuredHeig + this.getTopInset();
             }
          }else {
             measuredHeig = b17.f((this.getTopInset() + this.getMeasuredHeight()), 0, View$MeasureSpec.getSize(p1));
          }
          this.setMeasuredDimension(this.getMeasuredWidth(), measuredHeig);
       }
       this.b = -1;
       this.c = -1;
       this.t = -1;
       return;
    }
    public void setElevation(float p0){
       super.setElevation(p0);
       Drawable background = this.getBackground();
       if (background instanceof q24) {
          background.j(p0);
       }
       return;
    }
    public void setExpanded(boolean p0){
       this.d(p0, gh7.c(this), true);
    }
    public void setLiftOnScroll(boolean p0){
       this.C = p0;
    }
    public void setLiftOnScrollTargetViewId(int p0){
       ef tE;
       this.D = p0;
       if ((tE = this.E) != null) {
          tE.clear();
       }
       this.E = null;
       return;
    }
    public void setLiftableOverrideEnabled(boolean p0){
       this.z = p0;
    }
    public void setOrientation(int p0){
       if (p0 != 1) {
          throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
       }
       super.setOrientation(p0);
       return;
    }
    public void setStatusBarForeground(Drawable p0){
       ef tI;
       if ((tI = this.I) != p0) {
          Drawable$Callback uCallback = null;
          if (tI != null) {
             tI.setCallback(uCallback);
          }
          if (p0 != null) {
             uCallback = p0.mutate();
          }
          this.I = uCallback;
          boolean b = false;
          if (uCallback != null) {
             if (uCallback.isStateful()) {
                this.I.setState(this.getDrawableState());
             }
             eb3.z(this.I, eh7.d(this));
             ef tI1 = this.I;
             boolean b1 = (!this.getVisibility())? true: false;
             tI1.setVisible(b1, b);
             this.I.setCallback(this);
          }
          if (this.I != null && this.getTopInset() > 0) {
             b = 1;
          }
          this.setWillNotDraw((b ^ 1));
          dh7.k(this);
       }
       return;
    }
    public void setStatusBarForegroundColor(int p0){
       this.setStatusBarForeground(new ColorDrawable(p0));
    }
    public void setStatusBarForegroundResource(int p0){
       this.setStatusBarForeground(eb3.m(this.getContext(), p0));
    }
    public void setTargetElevation(float p0){
       ye7.T(this, p0);
    }
    public void setVisibility(int p0){
       ef tI;
       super.setVisibility(p0);
       boolean b = (!p0)? true: false;
       if ((tI = this.I) != null) {
          tI.setVisible(b, false);
       }
       return;
    }
    public final boolean verifyDrawable(Drawable p0){
       boolean b = (!super.verifyDrawable(p0) && p0 != this.I)? false: true;
       return b;
    }
}

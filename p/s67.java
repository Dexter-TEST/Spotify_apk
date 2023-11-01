package p.s67;
import android.view.View$OnLongClickListener;
import android.view.View$OnHoverListener;
import android.view.View$OnAttachStateChangeListener;
import android.view.View;
import java.lang.CharSequence;
import java.lang.Object;
import p.r67;
import android.content.Context;
import android.view.ViewConfiguration;
import p.zh7;
import android.os.Build$VERSION;
import p.yh7;
import java.lang.Runnable;
import p.t67;
import android.view.ViewParent;
import java.lang.String;
import android.view.WindowManager;
import android.view.ViewManager;
import android.util.Log;
import p.wh7;
import p.gh7;
import android.widget.TextView;
import android.view.WindowManager$LayoutParams;
import android.os.IBinder;
import android.content.res.Resources;
import android.view.ViewGroup$LayoutParams;
import android.content.ContextWrapper;
import android.app.Activity;
import android.view.Window;
import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.View$MeasureSpec;
import p.dh7;
import android.view.MotionEvent;
import android.view.accessibility.AccessibilityManager;
import java.lang.Math;

public final class s67 implements View$OnLongClickListener, View$OnHoverListener, View$OnAttachStateChangeListener	// class@0025cd from classes.dex
{
    public boolean A;
    public final View a;
    public final CharSequence b;
    public final int c;
    public final r67 t;
    public final r67 v;
    public int w;
    public int x;
    public t67 y;
    public boolean z;
    public static s67 B;
    public static s67 C;

    public void s67(View p0,CharSequence p1){
       super();
       this.t = new r67(this, 0);
       this.v = new r67(this, 1);
       this.a = p0;
       this.b = p1;
       ViewConfiguration viewConfigur = ViewConfiguration.get(p0.getContext());
       int i = (Build$VERSION.SDK_INT >= 28)? yh7.a(viewConfigur): viewConfigur.getScaledTouchSlop() / 2;
       this.c = i;
       this.A = true;
       p0.setOnLongClickListener(this);
       p0.setOnHoverListener(this);
       return;
    }
    public static void b(s67 p0){
       s67 b;
       if ((b = s67.B) != null) {
          b.a.removeCallbacks(b.t);
       }
       s67.B = p0;
       if (p0 != null) {
          p0.a.postDelayed(p0.t, (long)ViewConfiguration.getLongPressTimeout());
       }
       return;
    }
    public final void a(){
       s67 ty;
       s67 ta = this.a;
       if (s67.C == this) {
          s67.C = null;
          if ((ty = this.y) != null) {
             int i = (ty.c.getParent() != null)? 1: 0;
             if (i) {
                ty.b.getSystemService("window").removeView(ty.c);
             }
             this.y = null;
             this.A = true;
             ta.removeOnAttachStateChangeListener(this);
          }else {
             Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
          }
       }
       if (s67.B == this) {
          s67.b(null);
       }
       ta.removeCallbacks(this.v);
       return;
    }
    public final void c(boolean p0){
       s67 c;
       int i3;
       int i4;
       long l;
       long l1;
       int identifier;
       int measuredHeig;
       s67 os67 = this;
       s67 a = os67.a;
       if (!gh7.b(a)) {
          return;
       }
       s67.b(null);
       if ((c = s67.C) != null) {
          c.a();
       }
       s67.C = os67;
       os67.z = p0;
       t67 ot67 = new t67(a.getContext());
       os67.y = ot67;
       s67 w = os67.w;
       s67 x = os67.x;
       s67 z = os67.z;
       int i = 0;
       int i1 = (ot67.c.getParent() != null)? 1: 0;
       if (i1) {
          i1 = (ot67.c.getParent() != null)? 1: 0;
          if (i1) {
             ot67.b.getSystemService("window").removeView(ot67.c);
          }
       }
       ot67.t.setText(os67.b);
       t67 v = ot67.v;
       v.token = a.getApplicationWindowToken();
       int dimensionPix = ot67.b.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
       int i2 = 2;
       if (a.getWidth() < dimensionPix) {
          measuredHeig = a.getWidth() / i2;
       }
       if (a.getHeight() >= dimensionPix) {
          dimensionPix = ot67.b.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
          i3 = x + dimensionPix;
          i4 = x - dimensionPix;
       }else {
          i3 = a.getHeight();
          i4 = 0;
       }
       v.gravity = 49;
       Resources resources = ot67.b.getResources();
       int i5 = (z != null)? 0x7f0603f1: 0x7f0603f0;
       dimensionPix = resources.getDimensionPixelOffset(i5);
       View rootView = a.getRootView();
       ViewGroup$LayoutParams layoutParams = rootView.getLayoutParams();
       if (!layoutParams instanceof WindowManager$LayoutParams || layoutParams.type != i2) {
          Context context = a.getContext();
          while (context instanceof ContextWrapper) {
             if (context instanceof Activity) {
                rootView = context.getWindow().getDecorView();
                break ;
             }
             context = context.getBaseContext();
          }
       }
       if (rootView == null) {
          Log.e("TooltipPopup", "Cannot find app view");
       }else {
          rootView.getWindowVisibleDisplayFrame(ot67.w);
          t67 w1 = ot67.w;
          if (w1.left < null && w1.top < null) {
             Resources resources1 = ot67.b.getResources();
             identifier = (identifier = resources1.getIdentifier("status_bar_height", "dimen", "android"))? resources1.getDimensionPixelSize(identifier): 0;
             DisplayMetrics displayMetri = resources1.getDisplayMetrics();
             ot67.w.set(i, identifier, displayMetri.widthPixels, displayMetri.heightPixels);
          }
          rootView.getLocationOnScreen(ot67.y);
          a.getLocationOnScreen(ot67.x);
          t67 x1 = ot67.x;
          w1 = ot67.y;
          i2 = x1[i] - w1[i];
          x1[i] = i2;
          x1[1] = x1[1] - w1[1];
          v.x = (i2 + w) - (rootView.getWidth() / 2);
          ot67.c.measure(View$MeasureSpec.makeMeasureSpec(i, i), View$MeasureSpec.makeMeasureSpec(i, i));
          measuredHeig = ot67.c.getMeasuredHeight();
          identifier = ot67.x[1];
          i4 = ((i4 + identifier) - dimensionPix) - measuredHeig;
          identifier = (identifier + i3) + dimensionPix;
          if (z != null) {
             if (i4 >= 0) {
                v.y = i4;
             }else {
                v.y = identifier;
             }
          }else if(((measuredHeig + identifier)) <= ot67.w.height()){
             v.y = identifier;
          }else {
             v.y = i4;
          }
       }
       ot67.b.getSystemService("window").addView(ot67.c, ot67.v);
       a.addOnAttachStateChangeListener(os67);
       if (os67.z != null) {
          l = 2500;
       }else if(((dh7.g(a) & 1)) == 1){
          l = (long)ViewConfiguration.getLongPressTimeout();
          l1 = 3000;
       }else {
          l = (long)ViewConfiguration.getLongPressTimeout();
          l1 = 0x3a98;
       }
       l = l1 - l;
       x = os67.v;
       a.removeCallbacks(x);
       a.postDelayed(x, l);
       return;
    }
    public final boolean onHover(View p0,MotionEvent p1){
       if (this.y != null && this.z != null) {
          return false;
       }
       s67 ta = this.a;
       AccessibilityManager systemServic = ta.getContext().getSystemService("accessibility");
       if (systemServic.isEnabled() && systemServic.isTouchExplorationEnabled()) {
          return false;
       }
       int action = p1.getAction();
       boolean b = true;
       if (action != 7) {
          if (action == 10) {
             this.A = b;
             this.a();
          }
       }else if(ta.isEnabled() && this.y == null){
          int i = (int)p1.getX();
          int i1 = (int)p1.getY();
          if (this.A == null) {
             s67 tc = this.c;
             if (Math.abs((i - this.w)) <= tc && Math.abs((i1 - this.x)) <= tc) {
                b = false;
             label_006f :
                if (b) {
                   s67.b(this);
                }
             }
          }
          this.w = i;
          this.x = i1;
          this.A = false;
          goto label_006f ;
       }
       return false;
    }
    public final boolean onLongClick(View p0){
       this.w = p0.getWidth() / 2;
       this.x = p0.getHeight() / 2;
       this.c(true);
       return true;
    }
    public final void onViewAttachedToWindow(View p0){
    }
    public final void onViewDetachedFromWindow(View p0){
       this.a();
    }
}

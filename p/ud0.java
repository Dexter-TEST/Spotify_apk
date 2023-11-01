package p.ud0;
import p.h87;
import java.lang.String;
import p.qd0;
import p.yw6;
import android.graphics.PointF;
import java.lang.Class;
import p.o87;
import p.wh7;
import android.view.View;
import p.gh7;
import android.graphics.Rect;
import java.lang.Object;
import java.util.HashMap;
import android.view.ViewParent;
import android.view.ViewGroup;
import android.animation.Animator;
import p.al7;
import android.graphics.Path;
import p.qf2;
import android.util.Property;
import android.animation.TypeConverter;
import android.animation.ObjectAnimator;
import p.td0;
import android.animation.AnimatorSet;
import p.rd0;
import android.animation.Animator$AnimatorListener;
import p.uw5;
import p.sd0;
import p.g87;

public final class ud0 extends h87	// class@002889 from classes.dex
{
    public static final String[] O;
    public static final yw6 P;
    public static final yw6 Q;
    public static final yw6 R;
    public static final yw6 S;
    public static final yw6 T;

    static {
       String[] stringArray = new String[]{"android:changeBounds:bounds","android:changeBounds:clip","android:changeBounds:parent","android:changeBounds:windowX","android:changeBounds:windowY"};
       ud0.O = stringArray;
       qd0 stringArray1 = new qd0();
       ud0.P = new yw6(1, PointF.class, "topLeft");
       ud0.Q = new yw6(2, PointF.class, "bottomRight");
       ud0.R = new yw6(3, PointF.class, "bottomRight");
       ud0.S = new yw6(4, PointF.class, "topLeft");
       ud0.T = new yw6(5, PointF.class, "position");
    }
    public void ud0(){
       super();
    }
    public final void L(o87 p0){
       o87 b = p0.b;
       if (gh7.c(b) || (b.getWidth() || b.getHeight())) {
          p0 = p0.a;
          p0.put("android:changeBounds:bounds", new Rect(b.getLeft(), b.getTop(), b.getRight(), b.getBottom()));
          p0.put("android:changeBounds:parent", b.getParent());
       }
       return;
    }
    public final void e(o87 p0){
       this.L(p0);
    }
    public final void h(o87 p0){
       this.L(p0);
    }
    public final Animator l(ViewGroup p0,o87 p1,o87 p2){
       int i4;
       h87 rect31;
       ObjectAnimator objectAnimat;
       ViewGroup parent;
       o87 oo87 = p1;
       o87 oo871 = p2;
       if (!oo87 || !oo871) {
          return null;
       }
       oo87 = oo87.a;
       o87 a = oo871.a;
       ViewGroup viewGroup = a.get("android:changeBounds:parent");
       if (oo87.get("android:changeBounds:parent") == null || viewGroup == null) {
          return null;
       }
       Rect rect = oo87.get("android:changeBounds:bounds");
       Rect rect1 = a.get("android:changeBounds:bounds");
       Rect left = rect.left;
       Rect left1 = rect1.left;
       Rect top = rect.top;
       Rect top1 = rect1.top;
       Rect right = rect.right;
       Rect right1 = rect1.right;
       rect = rect.bottom;
       rect1 = rect1.bottom;
       int i = right - left;
       int i1 = rect - top;
       int i2 = right1 - left1;
       int i3 = rect1 - top1;
       Rect rect2 = oo87.get("android:changeBounds:clip");
       Rect int rect3 = a.get("android:changeBounds:clip");
       if (i && (i1 || (i2 && i3))) {
          i4 = (left == left1 && top == top1)? 0: 1;
          if (right != right1 || rect != rect1) {
             i4 = i4 + 1;
          }
       }else {
          i4 = 0;
       }
       if (rect2 != null && (!rect2.equals(rect3) || (rect2 == null && rect3 != null))) {
          i4 = i4 + 1;
       }
       if ((rect3 = i4) > 0) {
          oo87 = oo871.b;
          al7.a(oo87, left, top, right, rect);
          int i5 = 2;
          if (rect3 == i5) {
             if (i == i2 && i1 == i3) {
                rect31 = this;
                rect31.K.getClass();
                objectAnimat = ObjectAnimator.ofObject(oo87, ud0.T, null, qf2.b((float)left, (float)top, (float)left1, (float)top1));
             }else {
                rect31 = this;
                td0 otd0 = new td0(oo87);
                rect31.K.getClass();
                rect31.K.getClass();
                AnimatorSet uAnimatorSet = new AnimatorSet();
                Animator[] uAnimatorArr = new Animator[i5];
                uAnimatorArr[0] = ObjectAnimator.ofObject(otd0, ud0.P, null, qf2.b((float)left, (float)top, (float)left1, (float)top1));
                uAnimatorArr[1] = ObjectAnimator.ofObject(otd0, ud0.Q, null, qf2.b((float)right, (float)rect, (float)right1, (float)rect1));
                uAnimatorSet.playTogether(uAnimatorArr);
                uAnimatorSet.addListener(new rd0(otd0));
                objectAnimat = uAnimatorSet;
             }
          }else {
             rect31 = this;
             if (left == left1 && top == top1) {
                rect31.K.getClass();
                objectAnimat = ObjectAnimator.ofObject(oo87, ud0.R, null, qf2.b((float)right, (float)rect, (float)right1, (float)rect1));
             }else {
                rect31.K.getClass();
                objectAnimat = ObjectAnimator.ofObject(oo87, ud0.S, null, qf2.b((float)left, (float)top, (float)left1, (float)top1));
             }
          }
          if (oo87.getParent() instanceof ViewGroup) {
             parent = oo87.getParent();
             uw5.u(parent, true);
             rect31.a(new sd0(parent));
          }
          return objectAnimat;
       }else {
          return null;
       }
    }
    public final String[] q(){
       return ud0.O;
    }
}

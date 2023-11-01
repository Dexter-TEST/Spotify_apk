package p.uk3;
import p.ur5;
import android.content.Context;
import android.view.animation.LinearInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import java.lang.IllegalArgumentException;
import java.lang.String;
import android.view.View;
import p.vr5;
import p.sr5;
import p.hr5;
import android.view.ViewGroup$LayoutParams;
import p.ir5;
import android.view.ViewGroup$MarginLayoutParams;
import android.graphics.PointF;
import java.lang.Math;

public class uk3 extends ur5	// class@0028c8 from classes.dex
{
    public final LinearInterpolator h;
    public final DecelerateInterpolator i;
    public PointF j;
    public final DisplayMetrics k;
    public boolean l;
    public float m;
    public int n;
    public int o;

    public void uk3(Context p0){
       super();
       this.h = new LinearInterpolator();
       this.i = new DecelerateInterpolator();
       this.l = false;
       this.n = 0;
       this.o = 0;
       this.k = p0.getResources().getDisplayMetrics();
    }
    public static int e(int p0,int p1,int p2,int p3,int p4){
       if (p4 == -1) {
          return (p2 - p0);
       }
       if (p4) {
          if (p4 == 1) {
             return (p3 - p1);
          }
          throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
       }else if((p2 = p2 - p0) > 0){
          return p2;
       }else if((p3 = p3 - p1) < 0){
          return p3;
       }else {
          return 0;
       }
    }
    public void c(View p0,vr5 p1,sr5 p2){
       uk3 tj;
       int i2;
       ur5 tc1;
       int i3;
       int i = this.h();
       ur5 tc = this.c;
       int i1 = 0;
       if (tc != null && tc.p()) {
          ir5 layoutParams1 = p0.getLayoutParams();
          i = uk3.e(((p0.getLeft() - hr5.Q(p0)) - layoutParams1.leftMargin), ((hr5.T(p0) + p0.getRight()) + layoutParams1.rightMargin), tc.getPaddingLeft(), (tc.F - tc.getPaddingRight()), i);
       }else {
          i = 0;
       }
       if ((tj = this.j) != null && (v0 = 0 - tj.y)) {
          i2 = (tj > 0)? 1: -1;
       }else {
          i2 = 0;
       }
       if ((tc1 = this.c) != null && tc1.q()) {
          ir5 layoutParams = p0.getLayoutParams();
          i1 = uk3.e(((p0.getTop() - hr5.V(p0)) - layoutParams.topMargin), ((hr5.G(p0) + p0.getBottom()) + layoutParams.bottomMargin), tc1.getPaddingTop(), (tc1.G - tc1.getPaddingBottom()), i2);
       }
       if ((i3 = (int)Math.ceil(((double)this.g((int)Math.sqrt((double)((i1 * i1) + (i * i)))) / 0x3fd57a786c22680a))) > 0) {
          p2.a = - i;
          p2.b = - i1;
          p2.c = i3;
          p2.e = this.i;
          p2.f = true;
       }
       return;
    }
    public float f(DisplayMetrics p0){
       return (25.00f / (float)p0.densityDpi);
    }
    public int g(int p0){
       float f = (float)Math.abs(p0);
       if (this.l == null) {
          this.m = this.f(this.k);
          this.l = true;
       }
       return (int)Math.ceil((double)(f * this.m));
    }
    public int h(){
       uk3 tj;
       int i;
       if ((tj = this.j) != null) {
          PointF x = tj.x;
          if (!(0 - x)) {
          label_0014 :
             i = 0;
          }else if((0 - x) > 0){
             i = 1;
          }else {
             i = -1;
          }
       }else {
          goto label_0014 ;
       }
       return i;
    }
}

package p.yl3;
import android.view.View$OnTouchListener;
import android.view.ViewConfiguration;
import android.widget.ListView;
import java.lang.Object;
import p.dr;
import android.view.animation.AccelerateInterpolator;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.MotionEvent;
import p.em0;
import p.wh7;
import java.lang.Runnable;
import p.dh7;
import java.lang.Class;
import android.view.animation.AnimationUtils;
import java.lang.Math;
import android.widget.AdapterView;
import android.view.ViewGroup;

public final class yl3 implements View$OnTouchListener	// class@002dde from classes.dex
{
    public final float[] A;
    public final float[] B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public final ListView H;
    public final dr a;
    public final AccelerateInterpolator b;
    public final View c;
    public em0 t;
    public final float[] v;
    public final float[] w;
    public int x;
    public int y;
    public final float[] z;
    public static final int I;

    static {
       yl3.I = ViewConfiguration.getTapTimeout();
    }
    public void yl3(ListView p0){
       super();
       dr uodr = new dr();
       this.a = uodr;
       this.b = new AccelerateInterpolator();
       float[] uofloatArray = new float[2]{0,0};
       this.v = uofloatArray;
       float[] uofloatArray1 = new float[2]{0x7f7fffff,0x7f7fffff};
       this.w = uofloatArray1;
       float[] uofloatArray2 = new float[2]{0,0};
       this.z = uofloatArray2;
       float[] uofloatArray3 = new float[2]{0,0};
       this.A = uofloatArray3;
       float[] uofloatArray4 = new float[2]{0x7f7fffff,0x7f7fffff};
       this.B = uofloatArray4;
       this.c = p0;
       DisplayMetrics density = Resources.getSystem().getDisplayMetrics().density;
       uofloatArray4[0] = (float)(int)((1575.00f * density) + 0x3f000000) / 1000.00f;
       uofloatArray3[0] = (float)(int)((density * 315.00f) + 0x3f000000) / 1000.00f;
       this.x = 1;
       uofloatArray1[0] = Float.MAX_VALUE;
       uofloatArray[0] = 0x3e4ccccd;
       uofloatArray2[0] = 0x3a83126f;
       this.y = yl3.I;
       uodr.a = 500;
       uodr.b = 500;
       this.H = p0;
    }
    public static float b(float p0,float p1,float p2){
       if ((p2 - p0) > 0) {
          return p2;
       }
       if ((p0 - p1) < 0) {
          return p1;
       }
       return p0;
    }
    public final float a(float p0,float p1,float p2,int p3){
       float f = 0;
       float f1 = yl3.b((this.v[p3] * p1), f, this.w[p3]);
       p0 = this.c((p1 - p0), f1) - this.c(p0, f1);
       yl3 tb = this.b;
       if ((p0 - f) < 0) {
          p0 = - tb.getInterpolation((- p0));
       }else if((f - p0) > 0){
          p0 = tb.getInterpolation(p0);
       }else {
          p0 = 0;
       label_0038 :
          if (tb = f - p0) {
             int i = this.A[p3];
             p3 = this.B[p3];
             f1 = this.z[p3] * p2;
             f = (tb > 0)? yl3.b((p0 * f1), i, p3): - yl3.b(((- p0) * f1), i, p3);
          }
          return f;
       }
       p0 = yl3.b(p0, 0xbf800000, 0x3f800000);
       goto label_0038 ;
    }
    public final float c(float p0,float p1){
       float f = 0;
       if (!(f - p1)) {
       }else {
          yl3 tx = this.x;
          int i = 1;
          if (tx != null && tx != i) {
             if (tx == 2 && (p0 - f) < 0) {
                f = p0 / (- p1);
             }
          }else if((p0 - p1) < 0){
             if ((f - p0) >= 0) {
                f = 0x3f800000 - (p0 / p1);
             }else if(this.F != null && tx == i){
                f = 0x3f800000;
             }
          }
       }
       return f;
    }
    public final boolean d(View p0,MotionEvent p1){
       int actionMasked;
       yl3 ty;
       if (this.G == null) {
          return false;
       }
       if (actionMasked = p1.getActionMasked()) {
          if (actionMasked != 1) {
             if (actionMasked != 2) {
                if (actionMasked == 3) {
                label_0016 :
                   this.e();
                }
             }else {
             label_001e :
                yl3 tc = this.c;
                yl3 ta = this.a;
                ta.c = this.a(p1.getX(), (float)p0.getWidth(), (float)tc.getWidth(), false);
                ta.d = this.a(p1.getY(), (float)p0.getHeight(), (float)tc.getHeight(), 1);
                if (this.F == null && this.f()) {
                   if (this.t == null) {
                      this.t = new em0(5, this);
                   }
                   this.F = true;
                   this.D = true;
                   if (this.C == null && (ty = this.y) > null) {
                      dh7.n(tc, this.t, (long)ty);
                   }else {
                      this.t.run();
                   }
                   this.C = true;
                }
             }
          }else {
             goto label_0016 ;
          }
       }else {
          this.E = true;
          this.C = false;
          goto label_001e ;
       }
       return false;
    }
    public final void e(){
       boolean b = false;
       if (this.D != null) {
          this.F = b;
       }else {
          yl3 ta = this.a;
          ta.getClass();
          long l = AnimationUtils.currentAnimationTimeMillis();
          int i = (int)(l - ta.e);
          dr b1 = ta.b;
          if (i > b1) {
             b = b1;
          }else if(i < 0){
             b = i;
          }
          ta.i = b;
          ta.h = ta.a(l);
          ta.g = l;
       }
       return;
    }
    public final boolean f(){
       int count;
       yl3 ta = this.a;
       dr d = ta.d;
       int i = (int)(d / Math.abs(d));
       Math.abs(ta.c);
       boolean b = false;
       if (i) {
          yl3 tH = this.H;
          if (count = tH.getCount()) {
             int childCount = tH.getChildCount();
             int firstVisible = tH.getFirstVisiblePosition();
             int i1 = firstVisible + childCount;
             if (i > 0) {
                if (i1 < count || tH.getChildAt((childCount - 1)).getBottom() > tH.getHeight()) {
                }
             }else if(i < 0 && (firstVisible > 0 && tH.getChildAt(b).getTop() >= 0)){
                i = 0;
                if (i) {
                   b = true;
                }
             }
          }
       }
       return b;
    }
    public final boolean onTouch(View p0,MotionEvent p1){
       this.d(p0, p1);
       return false;
    }
}

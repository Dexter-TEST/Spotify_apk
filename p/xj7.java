package p.xj7;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import java.lang.Object;
import android.util.AttributeSet;
import p.nt2;
import android.content.res.Resources;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import java.lang.CharSequence;
import java.lang.Class;
import android.view.accessibility.AccessibilityEvent;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityRecord;
import p.uj7;
import android.view.MotionEvent;
import android.view.View$MeasureSpec;
import p.yq5;
import java.lang.Math;
import p.b17;

public final class xj7 extends RecyclerView	// class@002c8f from classes.dex
{
    public final int a1;
    public final Object b1;

    public void xj7(Context p0){
       this.a1 = 1;
       super(p0, null);
    }
    public void xj7(Context p0,int p1){
       this.a1 = 1;
       super(p0, null, 0);
       this.b1 = new nt2(this.getResources());
    }
    public void xj7(Context p0,Object p1){
       this.a1 = 1;
       super(p0, 0);
    }
    public void xj7(ViewPager2 p0,Context p1){
       this.a1 = 0;
       this.b1 = p0;
       super(p1, null);
    }
    public final CharSequence getAccessibilityClassName(){
       switch (this.a1){
           case 0:
           default:
             return super.getAccessibilityClassName();
       }
       this.b1.K.getClass();
       return super.getAccessibilityClassName();
    }
    public final void onInitializeAccessibilityEvent(AccessibilityEvent p0){
       switch (this.a1){
           case 0:
           default:
             super.onInitializeAccessibilityEvent(p0);
             return;
       }
       super.onInitializeAccessibilityEvent(p0);
       xj7 tb1 = this.b1;
       p0.setFromIndex(tb1.t);
       p0.setToIndex(tb1.t);
       tb1.K.o(p0);
       return;
    }
    public final boolean onInterceptTouchEvent(MotionEvent p0){
       boolean b;
       switch (this.a1){
           case 0:
             b = (this.b1.I != null && super.onInterceptTouchEvent(p0))? true: false;
             break;
           default:
             return super.onInterceptTouchEvent(p0);
       }
       return b;
    }
    public final void onMeasure(int p0,int p1){
       int i3;
       nt2 a;
       nt2 b;
       nt2 d;
       float f3;
       switch (this.a1){
           case 1:
             int size = View$MeasureSpec.getSize(p0);
             yq5 adapter = this.getAdapter();
             if (size > 0 && (adapter != null && adapter.d() > 0)) {
                xj7 tb1 = this.b1;
                int i = 0;
                int i1 = adapter.f(i);
                tb1.getClass();
                int i2 = 1;
                float f1 = (i1 != 0x7f0a0240 && (i1 != 0x7f0a0241 && (i1 != 0x7f0a0242 && (i1 != 0x7f0a0227 && (i1 != 0x7f0a0228 && (i1 != 0x7f0a0229 && i1 != 0x7f0a0226))))))? 0: 1;
                float f = 0x3f800000;
                if (i3) {
                   a = tb1.a;
                   b = tb1.b;
                }else if(i1 != 0x7f0a023e && i1 != 0x7f0a021e){
                   f1 = 0;
                }else {
                   f1 = 1;
                }
                if (f1) {
                   a = tb1.e;
                   f1 = tb1.f;
                label_0080 :
                   int i4 = (size / (int)((float)a * f1)) + i2;
                   float f2 = (float)size;
                   d = tb1.d;
                   f3 = f2 / (float)((int)((float)((a + b) - b) * f1) + d);
                   float f4 = (float)(int)f3;
                   float f5 = f3 - f4;
                   if ((f5 - 0.20f) < 0) {
                      f3 = f4 + 0.20f;
                   }else if((0x3f4ccccd - f5) > 0){
                      f3 = (float)(int)(f3 + f) + 0.20f;
                   }
                   d = b17.s(((int)((f / f1) * (float)((int)(f2 / Math.max(f3, ((float)(i4 - 1) + 0.20f))) - d)) + b));
                }else if(i1 == 0x7f0a023f){
                   f3 = 1;
                }else {
                   f3 = 0;
                }
                if (f3) {
                   b = tb1.c;
                   f3 = 0;
                }else {
                   tb1 = View$MeasureSpec.makeMeasureSpec(i, i);
                }
                f1 = 0x3f800000;
                b = a;
                a = b;
                goto label_0080 ;
             }
             break;
           default:
             super.onMeasure(p0, p1);
             return;
       }
       super.onMeasure(p0, d);
       return;
    }
    public final boolean onTouchEvent(MotionEvent p0){
       boolean b;
       switch (this.a1){
           case 0:
             b = (this.b1.I != null && super.onTouchEvent(p0))? true: false;
             break;
           default:
             return super.onTouchEvent(p0);
       }
       return b;
    }
}

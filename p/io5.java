package p.io5;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import p.q24;
import p.ft5;
import p.p24;
import java.lang.Class;
import java.lang.Object;
import p.ad6;
import p.bd6;
import android.content.res.ColorStateList;
import p.wh7;
import android.graphics.drawable.Drawable;
import p.dh7;
import p.lv1;
import android.content.res.TypedArray;
import p.ho5;
import android.view.ViewGroup$LayoutParams;
import p.eh7;
import android.os.Handler;
import java.lang.Runnable;
import java.lang.String;
import p.sq0;
import java.lang.Integer;
import java.util.HashMap;
import p.nq0;
import p.oq0;

public abstract class io5 extends ConstraintLayout	// class@0019d4 from classes.dex
{
    public final ho5 H;
    public int I;
    public q24 J;

    public void io5(Context p0,AttributeSet p1){
       super(p0, p1, 0x7f0303d8);
       LayoutInflater.from(p0).inflate(R.layout.material_radial_view_group, this);
       q24 oq24 = new q24();
       this.J = oq24;
       ft5 uoft5 = new ft5(0x3f000000);
       p24 a = oq24.a.a;
       a.getClass();
       ad6 uoad6 = new ad6(a);
       uoad6.e = uoft5;
       uoad6.f = uoft5;
       uoad6.g = uoft5;
       uoad6.h = uoft5;
       oq24.setShapeAppearanceModel(new bd6(uoad6));
       this.J.k(ColorStateList.valueOf(-1));
       dh7.q(this, this.J);
       TypedArray typedArray = p0.obtainStyledAttributes(p1, lv1.D, R.attr.materialClockStyle, 0);
       this.I = typedArray.getDimensionPixelSize(0, 0);
       this.H = new ho5(this);
       typedArray.recycle();
    }
    public final void addView(View p0,int p1,ViewGroup$LayoutParams p2){
       Handler handler;
       super.addView(p0, p1, p2);
       if (p0.getId() == -1) {
          p0.setId(eh7.a());
       }
       if ((handler = this.getHandler()) != null) {
          io5 tH = this.H;
          handler.removeCallbacks(tH);
          handler.post(tH);
       }
       return;
    }
    public final void onFinishInflate(){
       super.onFinishInflate();
       this.p();
    }
    public final void onViewRemoved(View p0){
       Handler handler;
       super.onViewRemoved(p0);
       if ((handler = this.getHandler()) != null) {
          io5 tH = this.H;
          handler.removeCallbacks(tH);
          handler.post(tH);
       }
       return;
    }
    public final void p(){
       String str;
       int childCount = this.getChildCount();
       int i = 1;
       int i1 = 0;
       int i2 = 0;
       while (true) {
          str = "skip";
          if (i2 < childCount) {
             if (str.equals(this.getChildAt(i2).getTag())) {
                i = i + 1;
             }
             i2 = i2 + 1;
          }else {
             break ;
          }
       }
       sq0 osq0 = new sq0();
       osq0.b(this);
       float f = 0;
       while (i1 < childCount) {
          View childAt = this.getChildAt(i1);
          if (childAt.getId() != 0x7f0a010e && !str.equals(childAt.getTag())) {
             int id = childAt.getId();
             io5 tI = this.I;
             sq0 c = osq0.c;
             if (!c.containsKey(Integer.valueOf(id))) {
                c.put(Integer.valueOf(id), new nq0());
             }
             nq0 d = c.get(Integer.valueOf(id)).d;
             d.z = 0x7f0a010e;
             d.A = tI;
             d.B = f;
             id = childCount - i;
             float f1 = 360.00f / (float)id;
             f1 = f1 + f;
             f = f1;
          }
          i1 = i1 + 1;
       }
       osq0.a(this);
       this.setConstraintSet(null);
       this.requestLayout();
       return;
    }
    public final void setBackgroundColor(int p0){
       this.J.k(ColorStateList.valueOf(p0));
    }
}

package p.cf;
import android.widget.LinearLayout$LayoutParams;
import android.content.Context;
import android.util.AttributeSet;
import p.lv1;
import android.content.res.TypedArray;
import p.vx5;
import android.view.animation.Interpolator;
import android.view.animation.AnimationUtils;
import android.view.ViewGroup$LayoutParams;
import android.view.ViewGroup$MarginLayoutParams;

public final class cf extends LinearLayout$LayoutParams	// class@0011fc from classes.dex
{
    public final int a;
    public vx5 b;
    public final Interpolator c;

    public void cf(){
       super(-1, -2);
       this.a = 1;
    }
    public void cf(Context p0,AttributeSet p1){
       super(p0, p1);
       int i = 1;
       this.a = i;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, lv1.f);
       this.a = typedArray.getInt(i, 0);
       vx5 ovx5 = (typedArray.getInt(0, 0) != i)? null: new vx5(4);
       this.b = ovx5;
       i = 2;
       if (typedArray.hasValue(i)) {
          this.c = AnimationUtils.loadInterpolator(p0, typedArray.getResourceId(i, 0));
       }
       typedArray.recycle();
       return;
    }
    public void cf(ViewGroup$LayoutParams p0){
       super(p0);
       this.a = 1;
    }
    public void cf(ViewGroup$MarginLayoutParams p0){
       super(p0);
       this.a = 1;
    }
    public void cf(LinearLayout$LayoutParams p0){
       super(p0);
       this.a = 1;
    }
}

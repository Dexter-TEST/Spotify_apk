package p.ml7;
import p.fq0;
import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.view.View;
import p.oi;
import android.content.res.TypedArray;
import p.c62;
import android.view.ViewParent;
import java.lang.Object;
import android.util.SparseArray;

public abstract class ml7 extends fq0	// class@001ebd from classes.dex
{
    public boolean y;
    public boolean z;

    public void ml7(Context p0,AttributeSet p1){
       super(p0, p1);
    }
    public final void f(ConstraintLayout p0){
       this.e(p0);
    }
    public void h(AttributeSet p0){
       int index;
       super.h(p0);
       if (p0 != null) {
          TypedArray typedArray = this.getContext().obtainStyledAttributes(p0, oi.w);
          int indexCount = typedArray.getIndexCount();
          int i = 0;
          while (i < indexCount) {
             if ((index = typedArray.getIndex(i)) == 6) {
                this.y = true;
             }else if(index == 22){
                this.z = true;
             }
             i = i + 1;
          }
          typedArray.recycle();
       }
       return;
    }
    public abstract void l(c62 p0,int p1,int p2);
    public final void onAttachedToWindow(){
       View view;
       super.onAttachedToWindow();
       if (this.y != null || this.z != null) {
          ViewParent parent = this.getParent();
          if (parent instanceof ConstraintLayout) {
             int visibility = this.getVisibility();
             float elevation = this.getElevation();
             int i = 0;
             while (i < this.b) {
                if ((view = parent.a.get(this.a[i])) != null) {
                   if (this.y != null) {
                      view.setVisibility(visibility);
                   }
                   if (this.z != null && (0 - elevation) > 0) {
                      float f = view.getTranslationZ() + elevation;
                      view.setTranslationZ(f);
                   }
                }
                i = i + 1;
             }
          }
       }
       return;
    }
    public void setElevation(float p0){
       super.setElevation(p0);
       this.d();
    }
    public void setVisibility(int p0){
       super.setVisibility(p0);
       this.d();
    }
}

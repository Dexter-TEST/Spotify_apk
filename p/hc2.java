package p.hc2;
import p.ok3;
import android.content.Context;
import android.util.AttributeSet;
import android.graphics.Rect;
import p.lv1;
import android.content.res.TypedArray;
import p.ty0;
import android.graphics.drawable.Drawable;
import android.graphics.Canvas;
import android.view.ViewGroup;
import android.view.View;
import android.view.Gravity;
import android.graphics.drawable.Drawable$Callback;

public abstract class hc2 extends ok3	// class@001822 from classes.dex
{
    public Drawable G;
    public final Rect H;
    public final Rect I;
    public int J;
    public final boolean K;
    public boolean L;

    public void hc2(Context p0,AttributeSet p1){
       Drawable drawable;
       super(p0, p1, 0);
       this.H = new Rect();
       this.I = new Rect();
       this.J = 119;
       this.K = true;
       this.L = false;
       int[] ointArray = new int[0];
       TypedArray typedArray = ty0.q(p0, p1, lv1.r, 0, 0, ointArray);
       this.J = typedArray.getInt(true, this.J);
       if ((drawable = typedArray.getDrawable(0)) != null) {
          this.setForeground(drawable);
       }
       this.K = typedArray.getBoolean(2, true);
       typedArray.recycle();
       return;
    }
    public final void draw(Canvas p0){
       hc2 tG;
       super.draw(p0);
       if ((tG = this.G) != null) {
          if (this.L != null) {
             boolean b = false;
             this.L = b;
             int i = this.getRight() - this.getLeft();
             int i1 = this.getBottom() - this.getTop();
             hc2 tH = this.H;
             if (this.K != null) {
                tH.set(b, b, i, i1);
             }else {
                tH.set(this.getPaddingLeft(), this.getPaddingTop(), (i - this.getPaddingRight()), (i1 - this.getPaddingBottom()));
             }
             hc2 tI = this.I;
             Gravity.apply(this.J, tG.getIntrinsicWidth(), tG.getIntrinsicHeight(), tH, tI);
             tG.setBounds(tI);
          }
          tG.draw(p0);
       }
       return;
    }
    public final void drawableHotspotChanged(float p0,float p1){
       hc2 tG;
       super.drawableHotspotChanged(p0, p1);
       if ((tG = this.G) != null) {
          tG.setHotspot(p0, p1);
       }
       return;
    }
    public final void drawableStateChanged(){
       hc2 tG;
       super.drawableStateChanged();
       if ((tG = this.G) != null && tG.isStateful()) {
          this.G.setState(this.getDrawableState());
       }
       return;
    }
    public Drawable getForeground(){
       return this.G;
    }
    public int getForegroundGravity(){
       return this.J;
    }
    public final void jumpDrawablesToCurrentState(){
       hc2 tG;
       super.jumpDrawablesToCurrentState();
       if ((tG = this.G) != null) {
          tG.jumpToCurrentState();
       }
       return;
    }
    public final void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       super.onLayout(p0, p1, p2, p3, p4);
       this.L = p0 | this.L;
    }
    public final void onSizeChanged(int p0,int p1,int p2,int p3){
       super.onSizeChanged(p0, p1, p2, p3);
       this.L = true;
    }
    public void setForeground(Drawable p0){
       hc2 tG;
       if ((tG = this.G) != p0) {
          if (tG != null) {
             tG.setCallback(null);
             this.unscheduleDrawable(this.G);
          }
          this.G = p0;
          if (p0 != null) {
             this.setWillNotDraw(false);
             p0.setCallback(this);
             if (p0.isStateful()) {
                p0.setState(this.getDrawableState());
             }
             if (this.J == 119) {
                p0.getPadding(new Rect());
             }
          }else {
             this.setWillNotDraw(true);
          }
          this.requestLayout();
          this.invalidate();
       }
       return;
    }
    public void setForegroundGravity(int p0){
       if (this.J != p0) {
          if (!((0x800007 & p0))) {
             p0 = p0 | 0x800003;
          }
          if (!((p0 & 0x70))) {
             p0 = p0 | 0x30;
          }
          this.J = p0;
          if (p0 == 119 && this.G != null) {
             this.G.getPadding(new Rect());
          }
          this.requestLayout();
       }
       return;
    }
    public final boolean verifyDrawable(Drawable p0){
       boolean b = (!super.verifyDrawable(p0) && p0 != this.G)? false: true;
       return b;
    }
}

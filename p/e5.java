package p.e5;
import android.graphics.drawable.Drawable;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.e36;
import java.lang.IllegalArgumentException;
import androidx.appcompat.widget.ActionBarContainer;
import android.graphics.Canvas;
import android.graphics.Rect;
import java.lang.Math;
import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.Outline;
import android.graphics.ColorFilter;

public final class e5 extends Drawable	// class@001424 from classes.dex
{
    public final int a;
    public final Object b;

    public void e5(float p0,int p1,Drawable p2){
       int i = 1;
       this.a = i;
       co5.o(p2, "drawable");
       super();
       this.b = new e36(p0, p1, p2);
       if (p2.getIntrinsicWidth() < 0 || p2.getIntrinsicHeight() < 0) {
          i = 0;
       }
       if (i) {
          return;
       }else {
          throw new IllegalArgumentException("drawable must have an intrinsic size".toString());
       }
    }
    public void e5(ActionBarContainer p0){
       this.a = 0;
       super();
       this.b = p0;
    }
    public final void draw(Canvas p0){
       ActionBarContainer w;
       e36 c;
       e5 tb = this.b;
       switch (this.a){
           case 0:
             if (tb.x != null) {
                if ((w = tb.w) != null) {
                   w.draw(p0);
                }
             }else if((w = tb.t) != null){
                w.draw(p0);
             }
             if ((w = tb.v) != null && tb.y != null) {
                w.draw(p0);
             }
             break;
           default:
             co5.o(p0, "canvas");
             if ((c = tb.c) != null) {
                p0.drawColor(c);
             }
             c = tb.a;
             float f = (float)c.getIntrinsicWidth();
             float f1 = (float)c.getIntrinsicHeight();
             p0.translate(this.getBounds().exactCenterX(), this.getBounds().exactCenterY());
             p0.scale(((float)Math.min(this.getBounds().width(), this.getBounds().height()) / Math.max(f, f1)), ((float)Math.min(this.getBounds().width(), this.getBounds().height()) / Math.max(f, f1)));
             p0.scale(tb.b, tb.b);
             float f2 = - f;
             p0.translate((f2 / 2.00f), ((- f1) / 2.00f));
             c.draw(p0);
             p0.restoreToCount(p0.save());
             return;
       }
       return;
    }
    public final Drawable$ConstantState getConstantState(){
       switch (this.a){
           case 1:
           default:
             return super.getConstantState();
       }
       e5 tb = this.b;
       tb.d = this.getChangingConfigurations();
       return tb;
    }
    public final int getIntrinsicHeight(){
       switch (this.a){
           case 1:
           default:
             return super.getIntrinsicHeight();
       }
       e5 tb = this.b;
       return (int)((float)tb.a.getIntrinsicHeight() / tb.b);
    }
    public final int getIntrinsicWidth(){
       switch (this.a){
           case 1:
           default:
             return super.getIntrinsicWidth();
       }
       e5 tb = this.b;
       return (int)((float)tb.a.getIntrinsicWidth() / tb.b);
    }
    public final int getMinimumHeight(){
       switch (this.a){
           case 1:
           default:
             return super.getMinimumHeight();
       }
       e5 tb = this.b;
       return (int)((float)tb.a.getMinimumHeight() / tb.b);
    }
    public final int getMinimumWidth(){
       switch (this.a){
           case 1:
           default:
             return super.getMinimumWidth();
       }
       e5 tb = this.b;
       return (int)((float)tb.a.getMinimumWidth() / tb.b);
    }
    public final int getOpacity(){
       switch (this.a){
           case 0:
           default:
             return this.b.a.getOpacity();
       }
       return 0;
    }
    public final void getOutline(Outline p0){
       ActionBarContainer t;
       switch (this.a){
           case 0:
             e5 tb = this.b;
             if (tb.x != null) {
                if (tb.w != null) {
                   tb.t.getOutline(p0);
                }
             }else if((t = tb.t) != null){
                t.getOutline(p0);
             }
             break;
           default:
             super.getOutline(p0);
             return;
       }
       return;
    }
    public final int[] getState(){
       switch (this.a){
           case 1:
           default:
             return super.getState();
       }
       int[] state = this.b.a.getState();
       co5.l(state, "state.drawable.state");
       return state;
    }
    public final boolean isStateful(){
       switch (this.a){
           case 1:
           default:
             return super.isStateful();
       }
       return this.b.a.isStateful();
    }
    public final void jumpToCurrentState(){
       switch (this.a){
           case 1:
           default:
             super.jumpToCurrentState();
             return;
       }
       this.b.a.jumpToCurrentState();
       return;
    }
    public final Drawable mutate(){
       switch (this.a){
           case 1:
           default:
             return super.mutate();
       }
       Drawable uDrawable = this.getConstantState().newDrawable();
       co5.l(uDrawable, "constantState.newDrawable\(\)");
       return uDrawable;
    }
    public final boolean onLevelChange(int p0){
       switch (this.a){
           case 1:
           default:
             return super.onLevelChange(p0);
       }
       return this.b.a.setLevel(p0);
    }
    public final boolean onStateChange(int[] p0){
       switch (this.a){
           case 1:
           default:
             return super.onStateChange(p0);
       }
       co5.o(p0, "newState");
       return this.b.a.setState(p0);
    }
    public final void setAlpha(int p0){
       switch (this.a){
           case 0:
           default:
             this.b.a.setAlpha(p0);
             return;
       }
       return;
    }
    public final void setColorFilter(ColorFilter p0){
       switch (this.a){
           case 0:
           default:
             this.b.a.setColorFilter(p0);
             return;
       }
       return;
    }
    public final boolean setState(int[] p0){
       switch (this.a){
           case 1:
           default:
             return super.setState(p0);
       }
       co5.o(p0, "stateSet");
       return this.b.a.setState(p0);
    }
}

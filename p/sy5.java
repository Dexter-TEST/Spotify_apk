package p.sy5;
import p.ce6;
import p.c57;
import android.graphics.drawable.Drawable;
import p.ry5;
import android.graphics.Canvas;
import p.q24;
import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.Rect;
import p.tu6;
import android.graphics.ColorFilter;
import p.bd6;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff$Mode;

public final class sy5 extends Drawable implements ce6, c57	// class@0026c4 from classes.dex
{
    public ry5 a;

    public void sy5(ry5 p0){
       super();
       this.a = p0;
    }
    public final void draw(Canvas p0){
       sy5 ta = this.a;
       if (ta.b != null) {
          ta.a.draw(p0);
       }
       return;
    }
    public final Drawable$ConstantState getConstantState(){
       return this.a;
    }
    public final int getOpacity(){
       return this.a.a.getOpacity();
    }
    public final boolean isStateful(){
       return true;
    }
    public final Drawable mutate(){
       this.a = new ry5(this.a);
       return this;
    }
    public final void onBoundsChange(Rect p0){
       super.onBoundsChange(p0);
       this.a.a.setBounds(p0);
    }
    public final boolean onStateChange(int[] p0){
       boolean b = super.onStateChange(p0);
       boolean b1 = true;
       if (this.a.a.setState(p0)) {
          b = 1;
       }
       boolean b2 = tu6.B(p0);
       sy5 ta = this.a;
       if (ta.b != b2) {
          ta.b = b2;
       }else {
          b1 = b;
       }
       return b1;
    }
    public final void setAlpha(int p0){
       this.a.a.setAlpha(p0);
    }
    public final void setColorFilter(ColorFilter p0){
       this.a.a.setColorFilter(p0);
    }
    public final void setShapeAppearanceModel(bd6 p0){
       this.a.a.setShapeAppearanceModel(p0);
    }
    public final void setTint(int p0){
       this.a.a.setTint(p0);
    }
    public final void setTintList(ColorStateList p0){
       this.a.a.setTintList(p0);
    }
    public final void setTintMode(PorterDuff$Mode p0){
       this.a.a.setTintMode(p0);
    }
}

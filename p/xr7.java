package p.xr7;
import p.wr7;
import android.graphics.drawable.Drawable;
import java.lang.Class;
import java.lang.String;
import java.lang.reflect.Method;
import p.yr7;
import android.content.res.Resources;
import android.os.Build$VERSION;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.Rect;
import android.graphics.Outline;
import java.lang.Object;
import java.lang.Boolean;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff$Mode;

public final class xr7 extends wr7	// class@002cd5 from classes.dex
{
    public static Method y;

    public void xr7(Drawable p0){
       try{
          super(p0);
          if (xr7.y == null) {
             Class[] uClassArray = new Class[0];
             xr7.y = Drawable.class.getDeclaredMethod("isProjected", uClassArray);
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public void xr7(yr7 p0,Resources p1){
       try{
          super(p0, p1);
          if (xr7.y == null) {
             Class[] uClassArray = new Class[0];
             xr7.y = Drawable.class.getDeclaredMethod("isProjected", uClassArray);
          }
          return;
       }catch(java.lang.Exception e0){
       }
    }
    public final boolean a(){
       boolean b = false;
       if (Build$VERSION.SDK_INT == 21) {
          wr7 tw = this.w;
          if (tw instanceof GradientDrawable || (tw instanceof DrawableContainer || (tw instanceof InsetDrawable || tw instanceof RippleDrawable))) {
             b = true;
          }
       }
       return b;
    }
    public final Rect getDirtyBounds(){
       return this.w.getDirtyBounds();
    }
    public final void getOutline(Outline p0){
       this.w.getOutline(p0);
    }
    public final boolean isProjected(){
       wr7 tw;
       Method y;
       if ((tw = this.w) == null || (y = xr7.y) == null) {
          return v1;
       }
       try{
          Object[] objArray = new Object[0];
          return y.invoke(tw, objArray).booleanValue();
       }catch(java.lang.Exception e0){
       }
    }
    public final void setHotspot(float p0,float p1){
       this.w.setHotspot(p0, p1);
    }
    public final void setHotspotBounds(int p0,int p1,int p2,int p3){
       this.w.setHotspotBounds(p0, p1, p2, p3);
    }
    public final boolean setState(int[] p0){
       if (!super.setState(p0)) {
          return false;
       }
       this.invalidateSelf();
       return true;
    }
    public final void setTint(int p0){
       if (this.a()) {
          super.setTint(p0);
       }else {
          this.w.setTint(p0);
       }
       return;
    }
    public final void setTintList(ColorStateList p0){
       if (this.a()) {
          super.setTintList(p0);
       }else {
          this.w.setTintList(p0);
       }
       return;
    }
    public final void setTintMode(PorterDuff$Mode p0){
       if (this.a()) {
          super.setTintMode(p0);
       }else {
          this.w.setTintMode(p0);
       }
       return;
    }
}

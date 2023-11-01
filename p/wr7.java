package p.wr7;
import android.graphics.drawable.Drawable$Callback;
import p.vr7;
import p.c57;
import android.graphics.drawable.Drawable;
import android.graphics.PorterDuff$Mode;
import p.yr7;
import android.content.res.Resources;
import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.Rect;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import p.eb3;
import android.graphics.Region;
import p.be1;
import java.lang.Runnable;
import android.graphics.ColorFilter;

public abstract class wr7 extends Drawable implements Drawable$Callback, vr7, c57	// class@002b93 from classes.dex
{
    public int a;
    public PorterDuff$Mode b;
    public boolean c;
    public yr7 t;
    public boolean v;
    public Drawable w;
    public static final PorterDuff$Mode x;

    static {
       wr7.x = PorterDuff$Mode.SRC_IN;
    }
    public void wr7(Drawable p0){
       super();
       this.t = new yr7(this.t);
       this.b(p0);
    }
    public void wr7(yr7 p0,Resources p1){
       super();
       this.t = p0;
       if (p0 != null && (p0 = p0.b) != null) {
          this.b(p0.newDrawable(p1));
       }
       return;
    }
    public abstract boolean a();
    public final void b(Drawable p0){
       wr7 tw;
       if ((tw = this.w) != null) {
          tw.setCallback(null);
       }
       this.w = p0;
       if (p0 != null) {
          p0.setCallback(this);
          this.setVisible(p0.isVisible(), true);
          this.setState(p0.getState());
          this.setLevel(p0.getLevel());
          this.setBounds(p0.getBounds());
          if ((tw = this.t) != null) {
             tw.b = p0.getConstantState();
          }
       }
       this.invalidateSelf();
       return;
    }
    public final boolean c(int[] p0){
       if (!this.a()) {
          return false;
       }
       wr7 tt = this.t;
       yr7 c = tt.c;
       yr7 d = tt.d;
       if (c != null && d != null) {
          int colorForStat = c.getColorForState(p0, c.getDefaultColor());
          if (this.c == null || (colorForStat != this.a || d != this.b)) {
             this.setColorFilter(colorForStat, d);
             this.a = colorForStat;
             this.b = d;
             this.c = true;
             return true;
          }
       }else {
          this.c = false;
          this.clearColorFilter();
       }
       return false;
    }
    public final void draw(Canvas p0){
       this.w.draw(p0);
    }
    public final int getChangingConfigurations(){
       wr7 tt;
       int changingConf = super.getChangingConfigurations();
       int changingConf1 = ((tt = this.t) != null)? tt.getChangingConfigurations(): 0;
       return ((changingConf | changingConf1) | this.w.getChangingConfigurations());
    }
    public final Drawable$ConstantState getConstantState(){
       wr7 tt;
       if ((tt = this.t) != null) {
          int i = (tt.b != null)? 1: 0;
          if (i) {
             tt.a = this.getChangingConfigurations();
             return this.t;
          }
       }
       return null;
    }
    public final Drawable getCurrent(){
       return this.w.getCurrent();
    }
    public final int getIntrinsicHeight(){
       return this.w.getIntrinsicHeight();
    }
    public final int getIntrinsicWidth(){
       return this.w.getIntrinsicWidth();
    }
    public final int getLayoutDirection(){
       return eb3.o(this.w);
    }
    public final int getMinimumHeight(){
       return this.w.getMinimumHeight();
    }
    public final int getMinimumWidth(){
       return this.w.getMinimumWidth();
    }
    public final int getOpacity(){
       return this.w.getOpacity();
    }
    public final boolean getPadding(Rect p0){
       return this.w.getPadding(p0);
    }
    public final int[] getState(){
       return this.w.getState();
    }
    public final Region getTransparentRegion(){
       return this.w.getTransparentRegion();
    }
    public final void invalidateDrawable(Drawable p0){
       this.invalidateSelf();
    }
    public final boolean isAutoMirrored(){
       return be1.d(this.w);
    }
    public final boolean isStateful(){
       wr7 tt;
       yr7 c = (this.a() && (tt = this.t) != null)? tt.c: null;
       boolean b = (c != null && (c.isStateful() || this.w.isStateful()))? true: false;
       return b;
    }
    public final void jumpToCurrentState(){
       this.w.jumpToCurrentState();
    }
    public final Drawable mutate(){
       wr7 tw;
       wr7 tw1;
       if (this.v == null && super.mutate() == this) {
          this.t = new yr7(this.t);
          if ((tw = this.w) != null) {
             tw.mutate();
          }
          if ((tw = this.t) != null) {
             Drawable$ConstantState constantStat = ((tw1 = this.w) != null)? tw1.getConstantState(): null;
             tw.b = constantStat;
          }
          this.v = true;
       }
       return this;
    }
    public final void onBoundsChange(Rect p0){
       wr7 tw;
       if ((tw = this.w) != null) {
          tw.setBounds(p0);
       }
       return;
    }
    public final boolean onLayoutDirectionChanged(int p0){
       return eb3.z(this.w, p0);
    }
    public final boolean onLevelChange(int p0){
       return this.w.setLevel(p0);
    }
    public final void scheduleDrawable(Drawable p0,Runnable p1,long p2){
       this.scheduleSelf(p1, p2);
    }
    public final void setAlpha(int p0){
       this.w.setAlpha(p0);
    }
    public final void setAutoMirrored(boolean p0){
       be1.e(this.w, p0);
    }
    public final void setChangingConfigurations(int p0){
       this.w.setChangingConfigurations(p0);
    }
    public final void setColorFilter(ColorFilter p0){
       this.w.setColorFilter(p0);
    }
    public final void setDither(boolean p0){
       this.w.setDither(p0);
    }
    public final void setFilterBitmap(boolean p0){
       this.w.setFilterBitmap(p0);
    }
    public boolean setState(int[] p0){
       boolean b = this.w.setState(p0);
       boolean b1 = (!this.c(p0) && !b)? false: true;
       return b1;
    }
    public void setTint(int p0){
       this.setTintList(ColorStateList.valueOf(p0));
    }
    public void setTintList(ColorStateList p0){
       this.t.c = p0;
       this.c(this.getState());
    }
    public void setTintMode(PorterDuff$Mode p0){
       this.t.d = p0;
       this.c(this.getState());
    }
    public final boolean setVisible(boolean p0,boolean p1){
       p0 = (!super.setVisible(p0, p1) && !this.w.setVisible(p0, p1))? false: true;
       return p0;
    }
    public final void unscheduleDrawable(Drawable p0,Runnable p1){
       this.unscheduleSelf(p1);
    }
}

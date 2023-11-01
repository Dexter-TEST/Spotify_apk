package p.se1;
import android.graphics.drawable.Drawable$Callback;
import android.graphics.drawable.Drawable;
import android.content.res.ColorStateList;
import p.ce1;
import android.graphics.PorterDuff$Mode;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import p.be1;
import java.lang.Runnable;
import android.graphics.ColorFilter;

public final class se1 extends Drawable implements Drawable$Callback	// class@00260f from classes.dex
{
    public Drawable a;
    public boolean b;

    public void se1(Drawable p0){
       se1 ta;
       super();
       if ((ta = this.a) != null) {
          ta.setCallback(null);
       }
       this.a = p0;
       if (p0 != null) {
          p0.setCallback(this);
       }
       this.b = true;
       return;
    }
    public final void A(ColorStateList p0){
       ce1.h(this.a, p0);
    }
    public final void B(PorterDuff$Mode p0){
       ce1.i(this.a, p0);
    }
    public final boolean C(boolean p0,boolean p1){
       p0 = (!super.setVisible(p0, p1) && !this.a.setVisible(p0, p1))? false: true;
       return p0;
    }
    public final void a(Canvas p0){
       this.a.draw(p0);
    }
    public final int b(){
       return this.a.getChangingConfigurations();
    }
    public final Drawable c(){
       return this.a.getCurrent();
    }
    public final int d(){
       return this.a.getIntrinsicHeight();
    }
    public final void draw(Canvas p0){
       if (this.b != null) {
          this.a(p0);
       }
       return;
    }
    public final int e(){
       return this.a.getIntrinsicWidth();
    }
    public final int f(){
       return this.a.getMinimumHeight();
    }
    public final int g(){
       return this.a.getMinimumWidth();
    }
    public final int getChangingConfigurations(){
       return this.b();
    }
    public final Drawable getCurrent(){
       return this.c();
    }
    public final int getIntrinsicHeight(){
       return this.d();
    }
    public final int getIntrinsicWidth(){
       return this.e();
    }
    public final int getMinimumHeight(){
       return this.f();
    }
    public final int getMinimumWidth(){
       return this.g();
    }
    public final int getOpacity(){
       return this.h();
    }
    public final boolean getPadding(Rect p0){
       return this.i(p0);
    }
    public final int[] getState(){
       return this.j();
    }
    public final Region getTransparentRegion(){
       return this.k();
    }
    public final int h(){
       return this.a.getOpacity();
    }
    public final boolean i(Rect p0){
       return this.a.getPadding(p0);
    }
    public final void invalidateDrawable(Drawable p0){
       this.invalidateSelf();
    }
    public final boolean isAutoMirrored(){
       return this.l();
    }
    public final boolean isStateful(){
       return this.m();
    }
    public final int[] j(){
       return this.a.getState();
    }
    public final void jumpToCurrentState(){
       this.n();
    }
    public final Region k(){
       return this.a.getTransparentRegion();
    }
    public final boolean l(){
       return be1.d(this.a);
    }
    public final boolean m(){
       return this.a.isStateful();
    }
    public final void n(){
       this.a.jumpToCurrentState();
    }
    public final void o(Rect p0){
       this.a.setBounds(p0);
    }
    public final void onBoundsChange(Rect p0){
       this.o(p0);
    }
    public final boolean onLevelChange(int p0){
       return this.p(p0);
    }
    public final boolean p(int p0){
       return this.a.setLevel(p0);
    }
    public final void q(int p0){
       this.a.setAlpha(p0);
    }
    public final void r(boolean p0){
       be1.e(this.a, p0);
    }
    public final void s(int p0){
       this.a.setChangingConfigurations(p0);
    }
    public final void scheduleDrawable(Drawable p0,Runnable p1,long p2){
       this.scheduleSelf(p1, p2);
    }
    public final void setAlpha(int p0){
       this.q(p0);
    }
    public final void setAutoMirrored(boolean p0){
       this.r(p0);
    }
    public final void setChangingConfigurations(int p0){
       this.s(p0);
    }
    public final void setColorFilter(ColorFilter p0){
       this.t(p0);
    }
    public final void setDither(boolean p0){
       this.u(p0);
    }
    public final void setFilterBitmap(boolean p0){
       this.v(p0);
    }
    public final void setHotspot(float p0,float p1){
       if (this.b != null) {
          this.w(p0, p1);
       }
       return;
    }
    public final void setHotspotBounds(int p0,int p1,int p2,int p3){
       if (this.b != null) {
          this.x(p0, p1, p2, p3);
       }
       return;
    }
    public final boolean setState(int[] p0){
       if (this.b != null) {
          return this.y(p0);
       }
       return false;
    }
    public final void setTint(int p0){
       this.z(p0);
    }
    public final void setTintList(ColorStateList p0){
       this.A(p0);
    }
    public final void setTintMode(PorterDuff$Mode p0){
       this.B(p0);
    }
    public final boolean setVisible(boolean p0,boolean p1){
       if (this.b != null) {
          return this.C(p0, p1);
       }
       return false;
    }
    public final void t(ColorFilter p0){
       this.a.setColorFilter(p0);
    }
    public final void u(boolean p0){
       this.a.setDither(p0);
    }
    public final void unscheduleDrawable(Drawable p0,Runnable p1){
       this.unscheduleSelf(p1);
    }
    public final void v(boolean p0){
       this.a.setFilterBitmap(p0);
    }
    public final void w(float p0,float p1){
       ce1.e(this.a, p0, p1);
    }
    public final void x(int p0,int p1,int p2,int p3){
       ce1.f(this.a, p0, p1, p2, p3);
    }
    public final boolean y(int[] p0){
       return this.a.setState(p0);
    }
    public final void z(int p0){
       ce1.g(this.a, p0);
    }
}

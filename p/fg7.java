package p.fg7;
import p.c57;
import android.graphics.drawable.Drawable;
import android.content.res.Resources$Theme;
import p.ce1;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.PorterDuff$Mode;

public abstract class fg7 extends Drawable implements c57	// class@0015c4 from classes.dex
{
    public Drawable a;

    public void fg7(){
       super();
    }
    public void applyTheme(Resources$Theme p0){
       fg7 ta;
       if ((ta = this.a) != null) {
          ce1.a(ta, p0);
       }
       return;
    }
    public final void clearColorFilter(){
       fg7 ta;
       if ((ta = this.a) != null) {
          ta.clearColorFilter();
          return;
       }else {
          super.clearColorFilter();
          return;
       }
    }
    public final Drawable getCurrent(){
       fg7 ta;
       if ((ta = this.a) != null) {
          return ta.getCurrent();
       }
       return super.getCurrent();
    }
    public final int getMinimumHeight(){
       fg7 ta;
       if ((ta = this.a) != null) {
          return ta.getMinimumHeight();
       }
       return super.getMinimumHeight();
    }
    public final int getMinimumWidth(){
       fg7 ta;
       if ((ta = this.a) != null) {
          return ta.getMinimumWidth();
       }
       return super.getMinimumWidth();
    }
    public final boolean getPadding(Rect p0){
       fg7 ta;
       if ((ta = this.a) != null) {
          return ta.getPadding(p0);
       }
       return super.getPadding(p0);
    }
    public final int[] getState(){
       fg7 ta;
       if ((ta = this.a) != null) {
          return ta.getState();
       }
       return super.getState();
    }
    public final Region getTransparentRegion(){
       fg7 ta;
       if ((ta = this.a) != null) {
          return ta.getTransparentRegion();
       }
       return super.getTransparentRegion();
    }
    public final void jumpToCurrentState(){
       fg7 ta;
       if ((ta = this.a) != null) {
          ta.jumpToCurrentState();
       }
       return;
    }
    public boolean onLevelChange(int p0){
       fg7 ta;
       if ((ta = this.a) != null) {
          return ta.setLevel(p0);
       }
       return super.onLevelChange(p0);
    }
    public final void setChangingConfigurations(int p0){
       fg7 ta;
       if ((ta = this.a) != null) {
          ta.setChangingConfigurations(p0);
          return;
       }else {
          super.setChangingConfigurations(p0);
          return;
       }
    }
    public final void setColorFilter(int p0,PorterDuff$Mode p1){
       fg7 ta;
       if ((ta = this.a) != null) {
          ta.setColorFilter(p0, p1);
          return;
       }else {
          super.setColorFilter(p0, p1);
          return;
       }
    }
    public final void setFilterBitmap(boolean p0){
       fg7 ta;
       if ((ta = this.a) != null) {
          ta.setFilterBitmap(p0);
       }
       return;
    }
    public final void setHotspot(float p0,float p1){
       fg7 ta;
       if ((ta = this.a) != null) {
          ce1.e(ta, p0, p1);
       }
       return;
    }
    public final void setHotspotBounds(int p0,int p1,int p2,int p3){
       fg7 ta;
       if ((ta = this.a) != null) {
          ce1.f(ta, p0, p1, p2, p3);
       }
       return;
    }
    public final boolean setState(int[] p0){
       fg7 ta;
       if ((ta = this.a) != null) {
          return ta.setState(p0);
       }
       return super.setState(p0);
    }
}

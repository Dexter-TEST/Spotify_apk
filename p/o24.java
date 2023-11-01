package p.o24;
import p.xg;
import android.content.Context;
import android.util.AttributeSet;
import p.b17;
import android.view.View;
import p.lv1;
import android.content.res.TypedArray;
import p.ty0;
import android.content.res.ColorStateList;
import p.ry7;
import android.widget.CompoundButton;
import p.ln0;
import android.widget.RadioButton;

public final class o24 extends xg	// class@002097 from classes.dex
{
    public ColorStateList v;
    public boolean w;
    public static final int[][] x;

    static {
       int[][] ointArray = new int[][4]{new int[2]{0x101009e,0x10100a0},new int[2]{0x101009e,0xfefeff60},new int[2]{0xfefeff62,0x10100a0},new int[2]{0xfefeff62,0xfefeff60}};
       o24.x = ointArray;
    }
    public void o24(Context p0,AttributeSet p1){
       super(b17.D(p0, p1, R.attr.radioButtonStyle, 0x7f130532), p1, 0x7f03052c);
       p0 = this.getContext();
       int[] ointArray = new int[0];
       TypedArray typedArray = ty0.q(p0, p1, lv1.y, R.attr.radioButtonStyle, 0x7f130532, ointArray);
       if (typedArray.hasValue(0)) {
          ln0.c(this, ry7.x(p0, typedArray, 0));
       }
       this.w = typedArray.getBoolean(1, 0);
       typedArray.recycle();
       return;
    }
    private ColorStateList getMaterialThemeColorsTintList(){
       if (this.v == null) {
          int i = ry7.w(this, R.attr.colorOnSurface);
          int i1 = ry7.w(this, R.attr.colorSurface);
          int[] ointArray = new int[]{ry7.M(i1, 0x3f800000, ry7.w(this, R.attr.colorControlActivated)),ry7.M(i1, 0x3f0a3d71, i),ry7.M(i1, 0x3ec28f5c, i),ry7.M(i1, 0x3ec28f5c, i)};
          this.v = new ColorStateList(o24.x, ointArray);
       }
       return this.v;
    }
    public final void onAttachedToWindow(){
       super.onAttachedToWindow();
       if (this.w != null && ln0.a(this) == null) {
          this.setUseMaterialThemeColors(true);
       }
       return;
    }
    public void setUseMaterialThemeColors(boolean p0){
       this.w = p0;
       if (p0) {
          ln0.c(this, this.getMaterialThemeColorsTintList());
       }else {
          ln0.c(this, null);
       }
       return;
    }
}

package com.spotify.legacyglue.icons.SpotifyIconView;
import androidx.appcompat.widget.AppCompatImageView;
import android.content.Context;
import android.util.AttributeSet;
import p.sp6;
import p.eb3;
import android.content.res.TypedArray;
import android.content.res.ColorStateList;
import p.lp6;
import android.view.View;
import android.content.res.Resources;
import p.xj0;
import android.graphics.drawable.Drawable;
import android.graphics.Paint;
import p.mj5;
import p.oj5;
import p.wh7;
import p.dh7;
import android.graphics.Bitmap;
import java.lang.UnsupportedOperationException;
import java.lang.String;

public final class SpotifyIconView extends AppCompatImageView	// class@0008fe from classes.dex
{
    public sp6 t;
    public final lp6 v;
    public static final int[] w;

    static {
       SpotifyIconView.w = new int[4]{0x1010161,0x1010162,0x1010163,0x1010164};
    }
    public void SpotifyIconView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
    }
    public void SpotifyIconView(Context p0,AttributeSet p1,int p2){
       int intx;
       super(p0, p1, p2);
       this.t = sp6.x;
       int i = 0;
       TypedArray typedArray = p0.obtainStyledAttributes(p1, eb3.A, p2, i);
       int i1 = 2;
       if ((intx = typedArray.getInt(i1, -1)) != -1) {
          this.t = sp6.r0[intx];
       }
       intx = 1;
       float f = 0xbf800000;
       float dimension = typedArray.getDimension(intx, f);
       ColorStateList colorStateLi = typedArray.getColorStateList(i);
       typedArray.recycle();
       TypedArray typedArray1 = p0.obtainStyledAttributes(p1, SpotifyIconView.w, p2, i);
       float floatx = typedArray1.getFloat(3, 0);
       float floatx1 = typedArray1.getFloat(intx, 0);
       float floatx2 = typedArray1.getFloat(i1, 0);
       i = typedArray1.getColor(i, i);
       typedArray1.recycle();
       this.v = (f - dimension)? new lp6(this.getContext(), this.t, dimension): new lp6(this.getContext(), this.t, (float)xj0.e0(32.00f, this.getResources()));
       SpotifyIconView tv = this.v;
       if (colorStateLi == null) {
          colorStateLi = ColorStateList.valueOf(-1);
       }
       tv.c(colorStateLi);
       this.setImageDrawable(this.v);
       tv = this.v;
       tv.f.setShadowLayer(floatx, floatx1, floatx2, i);
       tv.invalidateSelf();
       if (!this.isInEditMode()) {
          oj5.a(this).a();
       }
       return;
    }
    public Drawable getDrawable(){
       return this.getDrawable();
    }
    public lp6 getDrawable(){
       return this.v;
    }
    public void setColor(int p0){
       this.v.b(p0);
    }
    public void setColorStateList(ColorStateList p0){
       this.v.c(p0);
    }
    public void setIcon(sp6 p0){
       this.t = p0;
       SpotifyIconView tv = this.v;
       tv.a = p0;
       tv.f();
       tv.g();
       tv.invalidateSelf();
       dh7.k(this);
    }
    public void setImageBitmap(Bitmap p0){
       throw new UnsupportedOperationException("Cannot call this method in SpotifyIconView");
    }
    public void setImageResource(int p0){
       throw new UnsupportedOperationException("Cannot call this method in SpotifyIconView");
    }
}

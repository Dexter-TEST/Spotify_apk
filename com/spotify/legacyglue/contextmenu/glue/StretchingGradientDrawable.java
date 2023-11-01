package com.spotify.legacyglue.contextmenu.glue.StretchingGradientDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.Matrix;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.Rect;
import android.graphics.Canvas;
import android.graphics.ColorFilter;

public class StretchingGradientDrawable extends Drawable	// class@0008e4 from classes.dex
{
    public final LinearGradient a;
    public final Paint b;
    public final Paint c;
    public final Paint d;
    public int e;
    public int f;
    public float g;
    public final Matrix h;

    public void StretchingGradientDrawable(int p0,int p1){
       super();
       this.h = new Matrix();
       LinearGradient v0 = new LinearGradient(0, 0, 0, 0x3f800000, p0, p1, Shader$TileMode.CLAMP);
       this.a = v0;
       Paint paint = new Paint(1);
       this.b = paint;
       paint.setShader(v0);
       paint = new Paint();
       this.c = paint;
       paint.setColor(p1);
       paint = new Paint();
       this.d = paint;
       paint.setColor(0xff000000);
       paint.setAlpha(0);
       this.f = 0;
    }
    public final void a(){
       StretchingGradientDrawable th = this.h;
       th.setScale((float)this.getBounds().width(), (float)(this.e + this.f));
       this.a.setLocalMatrix(th);
       this.invalidateSelf();
    }
    public final void draw(Canvas p0){
       Rect bounds = this.getBounds();
       p0.save();
       p0.drawRect(0, 0, (float)bounds.width(), (float)bounds.height(), this.d);
       p0.translate(0, this.g);
       p0.drawRect(0, 0, (float)bounds.width(), (float)bounds.height(), this.b);
       p0.restore();
    }
    public final int getAlpha(){
       return this.c.getAlpha();
    }
    public final int getOpacity(){
       return -3;
    }
    public final void setAlpha(int p0){
       this.b.setAlpha(p0);
       this.c.setAlpha(p0);
       this.invalidateSelf();
    }
    public final void setColorFilter(ColorFilter p0){
    }
    public void setGradientHeight(int p0){
       this.e = p0;
       this.a();
    }
}

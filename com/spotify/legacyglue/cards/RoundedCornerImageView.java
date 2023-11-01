package com.spotify.legacyglue.cards.RoundedCornerImageView;
import androidx.appcompat.widget.AppCompatImageView;
import android.content.Context;
import android.util.AttributeSet;
import android.content.res.Resources;
import android.view.View;
import p.xj0;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Paint;
import p.n6;
import android.graphics.Canvas;
import android.widget.ImageView;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import android.graphics.Xfermode;
import android.graphics.RectF;

public class RoundedCornerImageView extends AppCompatImageView	// class@0008e1 from classes.dex
{
    public int A;
    public int B;
    public final int t;
    public final Paint v;
    public RectF w;
    public Bitmap x;
    public final PorterDuffXfermode y;
    public int z;

    public void RoundedCornerImageView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
       this.t = xj0.d0(4.00f, this.getResources());
       this.y = new PorterDuffXfermode(PorterDuff$Mode.DST_ATOP);
       Paint paint = new Paint(1);
       this.v = paint;
       paint.setColor(n6.b(this.getContext(), R.color.opacity_black_60));
       this.setLayerType(2, null);
    }
    public final void onDraw(Canvas p0){
       super.onDraw(p0);
       RoundedCornerImageView tv = this.v;
       if (this.x == null) {
          this.x = Bitmap.createBitmap(this.A, this.B, Bitmap$Config.ARGB_8888);
          tv.setXfermode(null);
          new Canvas(this.x).drawRoundRect(this.w, (float)this.z, (float)this.z, tv);
       }
       tv.setXfermode(this.y);
       p0.drawBitmap(this.x, 0, 0, tv);
       return;
    }
    public final void onSizeChanged(int p0,int p1,int p2,int p3){
       super.onSizeChanged(p0, p1, p2, p3);
       this.A = p0;
       this.B = p1;
       this.w = new RectF(0, 0, (float)p0, (float)p1);
    }
    public void setRoundedCorners(boolean p0){
       RoundedCornerImageView tt = (p0)? this.t: 0;
       this.z = tt;
       return;
    }
}

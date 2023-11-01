package com.spotify.hubs.liteintegration.browse.BrowseRoundedCornerImageView;
import androidx.appcompat.widget.AppCompatImageView;
import android.content.Context;
import android.util.AttributeSet;
import android.content.res.Resources;
import android.view.View;
import p.xj0;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Paint;
import android.graphics.Canvas;
import android.widget.ImageView;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;
import android.graphics.Xfermode;
import android.graphics.RectF;

public class BrowseRoundedCornerImageView extends AppCompatImageView	// class@0008bd from classes.dex
{
    public int A;
    public int B;
    public final int t;
    public final PorterDuffXfermode v;
    public Bitmap w;
    public final Paint x;
    public RectF y;
    public int z;

    public void BrowseRoundedCornerImageView(Context p0,AttributeSet p1){
       super(p0, p1, 0);
       this.t = xj0.d0(4.00f, this.getResources());
       this.v = new PorterDuffXfermode(PorterDuff$Mode.DST_ATOP);
       this.x = new Paint(1);
       this.setLayerType(2, null);
    }
    public final void onDraw(Canvas p0){
       super.onDraw(p0);
       BrowseRoundedCornerImageView tx = this.x;
       if (this.w == null) {
          this.w = Bitmap.createBitmap(this.A, this.B, Bitmap$Config.ARGB_8888);
          tx.setXfermode(null);
          new Canvas(this.w).drawRoundRect(this.y, (float)this.z, (float)this.z, tx);
       }
       tx.setXfermode(this.v);
       p0.drawBitmap(this.w, 0, 0, tx);
       return;
    }
    public final void onSizeChanged(int p0,int p1,int p2,int p3){
       super.onSizeChanged(p0, p1, p2, p3);
       this.A = p0;
       this.B = p1;
       this.y = new RectF(0, 0, (float)p0, (float)p1);
    }
    public void setRoundedCorners(boolean p0){
       BrowseRoundedCornerImageView tt = (p0)? this.t: 0;
       this.z = tt;
       return;
    }
}

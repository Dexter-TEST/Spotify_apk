package com.spotify.encoremobile.facepile.FaceView;
import androidx.appcompat.widget.AppCompatImageView;
import android.content.Context;
import android.util.AttributeSet;
import java.lang.Object;
import java.lang.String;
import p.co5;
import android.view.View;
import p.ox7;
import p.r61;
import p.ey1;
import p.qk7;
import p.r;
import java.util.WeakHashMap;
import java.lang.Integer;
import p.n6;
import java.lang.StringBuilder;
import com.spotify.base.java.logging.Logger;
import p.yz1;
import java.lang.Number;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import p.li0;
import android.widget.ImageView;
import android.widget.ImageView$ScaleType;
import java.lang.Math;

public final class FaceView extends AppCompatImageView	// class@00089b from classes.dex
{
    public r61 t;

    public void FaceView(Context p0,AttributeSet p1){
       co5.o(p0, "context");
       super(p0, p1, 0);
       this.setVisibility(8);
       ox7.H(this, Float.MAX_VALUE);
    }
    public final void b(r61 p0,ey1 p1){
       yz1 oyz1;
       ey1 d;
       int i;
       ey1 d1;
       if (this.t != null) {
          r.c(this).a();
       }
       r61 or61 = null;
       if (p1 == null) {
          this.t = or61;
          this.setVisibility(8);
       }else {
          Context context = this.getContext();
          co5.l(context, "context");
          ey1 f = p1.f;
          if ((oyz1 = f.get(context)) == null) {
             ey1 c = p1.c;
             ey1 b = p1.b;
             if (p1.e != null) {
                i = ((d = p1.d) != null)? d.intValue(): 0x7f05046f;
                i = n6.b(context, i);
                Object[] objArray = new Object[0];
                Logger.b("Username: "+b+", displayName: "+c+", Color: "+i, objArray);
                oyz1 = new yz1(i, context, b);
             }else if((d1 = p1.d) != null){
                or61 = Integer.valueOf(n6.b(context, d1.intValue()));
             }
             oyz1 = new yz1(context, b, c, or61);
             f.put(context, oyz1);
          }
          i = ((p1 = p1.a) != null && p1.length())? 0: 1;
          if (i) {
             this.setImageDrawable(oyz1);
          }else {
             li0 oli0 = p0.a(Uri.parse(p1));
             oli0.a(oyz1);
             oli0.b(this);
          }
          this.setScaleType(ImageView$ScaleType.CENTER_CROP);
          this.setVisibility(0);
          this.t = p0;
       }
       return;
    }
    public final void onMeasure(int p0,int p1){
       super.onMeasure(p0, p1);
       this.setMeasuredDimension(Math.min(this.getMeasuredWidth(), this.getMeasuredHeight()), Math.min(this.getMeasuredWidth(), this.getMeasuredHeight()));
    }
}

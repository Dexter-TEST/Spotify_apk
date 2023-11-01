package p.gp2;
import p.bk2;
import android.widget.FrameLayout;
import android.content.Context;
import p.fp2;
import p.xl2;
import android.graphics.Paint;
import android.widget.ImageView;
import android.widget.ImageView$ScaleType;
import android.view.View;
import android.view.ViewGroup;
import p.ip2;
import p.u77;
import p.r77;
import p.t77;
import p.s77;
import p.g07;
import java.lang.Object;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;
import p.eg7;
import p.y77;
import android.graphics.Canvas;
import java.lang.Class;
import android.view.View$MeasureSpec;
import android.graphics.Color;
import p.lj0;

public final class gp2 extends FrameLayout implements bk2	// class@001751 from classes.dex
{
    public final xl2 a;
    public final ImageView b;
    public final fp2 c;
    public final ip2 t;
    public final y77 v;

    public void gp2(Context p0,fp2 p1){
       super(p0);
       this.c = p1;
       xl2 oxl2 = new xl2(p0);
       this.a = oxl2;
       if (p1 != fp2.c) {
          int i = 255;
          oxl2.d = i;
          oxl2.h.setAlpha(i);
          ImageView imageView = new ImageView(p0);
          this.b = imageView;
          imageView.setScaleType(ImageView$ScaleType.CENTER_CROP);
          this.addView(imageView, 0);
          this.t = new ip2(imageView);
          if (p1 == fp2.v) {
             u77 ou77 = new u77(0x3f000000);
             r77 or77 = new r77(ou77.a, ou77.b, 0, ou77);
             s77 os77 = or77.b(0);
             g07[] og07Array = new g07[]{new g07(imageView, Collections.singletonList(View.ALPHA))};
             os77.f.f = Arrays.asList(og07Array);
             os77 = os77.g;
             r77 c = os77.c;
             c.a(os77.e, os77.a, os77.b);
             this.v = c.c;
          }else {
             this.v = y77.c;
          }
       }
       this.setWillNotDraw(0);
       return;
    }
    public final boolean drawChild(Canvas p0,View p1,long p2){
       boolean b;
       if (p1 == this.b) {
          gp2 tc = this.c;
          if (tc.a != null) {
             gp2 ta = this.a;
             if (tc.b != null) {
                ta.a(p0);
             }
             b = super.drawChild(p0, p1, p2);
             ta.b(p0);
          label_001f :
             return b;
          }
       }
       b = super.drawChild(p0, p1, p2);
       goto label_001f ;
    }
    public ImageView getBackgroundImageView(){
       return this.b;
    }
    public View getView(){
       return this;
    }
    public final void onDraw(Canvas p0){
       super.onDraw(p0);
       if (this.c.a == null) {
          gp2 ta = this.a;
          ta.a(p0);
          ta.b(p0);
       }
       return;
    }
    public final void onLayout(boolean p0,int p1,int p2,int p3,int p4){
       if (this.c.a != null) {
          gp2 tt = this.t;
          p1 = tt.a(tt.c);
          ip2 a = tt.a;
          a.layout(0, p1, a.getMeasuredWidth(), (a.getMeasuredHeight() + p1));
       }
       return;
    }
    public final void onMeasure(int p0,int p1){
       super.onMeasure(p0, p1);
       this.a.f(this.getMeasuredWidth(), this.getMeasuredHeight());
       if (this.c.a != null) {
          p0 = this.getMeasuredWidth();
          int measuredHeig = this.getMeasuredHeight();
          gp2 tt = this.t;
          tt.getClass();
          tt.b = this.getMeasuredHeight();
          if (tt.d == null && tt.e == null) {
             measuredHeig = (int)((float)measuredHeig * 0x3fb33333);
          }
          tt.a.measure(View$MeasureSpec.makeMeasureSpec(p0, 0x40000000), View$MeasureSpec.makeMeasureSpec(measuredHeig, 0x40000000));
       }
       return;
    }
    public final void onSizeChanged(int p0,int p1,int p2,int p3){
       super.onSizeChanged(p0, p1, p2, p3);
       this.a.f(this.getMeasuredWidth(), this.getMeasuredHeight());
    }
    public void setAvoidCroppingImageWithParallax(boolean p0){
       this.t.e = p0;
    }
    public void setColor(int p0){
       this.setSolidColor(p0);
    }
    public void setGradientOffset(int p0){
       this.a.e = p0;
       this.invalidate();
    }
    public void setHasFixedSize(boolean p0){
       this.t.d = p0;
    }
    public void setSolidColor(int p0){
       gp2 ta = this.a;
       ta.h.setColor(lj0.f(Color.argb((int)102.00f, 0, 0, 0), p0));
       ta.h.setAlpha(ta.d);
       this.invalidate();
    }
}

package p.jk2;
import p.mj2;
import android.widget.FrameLayout;
import p.ek2;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.os.Build$VERSION;
import android.graphics.Paint;
import java.lang.Class;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import p.c56;
import android.graphics.drawable.LayerDrawable;
import android.widget.FrameLayout$LayoutParams;
import android.view.ViewGroup$LayoutParams;
import p.jp2;
import p.y46;
import p.nj2;
import p.oj2;
import p.wh7;
import p.gh7;
import p.fh7;
import p.hk2;
import p.ry7;

public final class jk2 extends FrameLayout implements mj2	// class@001af1 from classes.dex
{
    public final FrameLayout a;
    public hk2 b;
    public int c;
    public y46 t;
    public static final ek2 v;

    static {
       jk2.v = new ek2(1);
    }
    public void jk2(Context p0){
       super(p0, null, 0);
       this.t = jk2.v;
       LayoutInflater.from(p0).inflate(R.layout.glue_header_v2, this, true);
       if (Build$VERSION.SDK_INT < 23) {
          this.setLayerType(true, null);
       }
       FrameLayout uFrameLayout = this.findViewById(R.id.header_content);
       uFrameLayout.getClass();
       this.a = uFrameLayout;
       return;
    }
    public static void b(float p0,int p1,Drawable p2){
       if (p2 instanceof c56) {
          p2.a(p0, p1);
       }else if(p2 instanceof LayerDrawable){
          for (int i = 0; i < p2.getNumberOfLayers(); i = i + 1) {
             jk2.b(p0, p1, p2.getDrawable(i));
          }
       }
       return;
    }
    private FrameLayout$LayoutParams getContentLayoutParams(){
       return this.a.getLayoutParams();
    }
    public final void a(float p0,int p1){
       jk2 ta = this.a;
       ta.offsetTopAndBottom(((p1 - ta.getTop()) + this.getContentLayoutParams().topMargin));
       ta = this.b;
       if (ta instanceof jp2) {
          ta.a(p0);
       }
       jk2.b(p0, p1, this.getBackground());
       jk2.b(p0, p1, this.getForeground());
       this.t.a(p0);
       return;
    }
    public int getTotalScrollRange(){
       return (this.getMeasuredHeight() - this.c);
    }
    public View getView(){
       return this;
    }
    public final void onMeasure(int p0,int p1){
       super.onMeasure(p0, p1);
       jk2 tb = this.b;
       if (tb instanceof nj2) {
          tb.i();
       }
       return;
    }
    public void setContentBottomMargin(int p0){
       this.getContentLayoutParams().bottomMargin = p0;
       if (gh7.c(this) && !fh7.b(this)) {
          this.requestLayout();
       }
       return;
    }
    public void setContentTopMargin(int p0){
       this.getContentLayoutParams().topMargin = p0;
       if (gh7.c(this) && !fh7.b(this)) {
          this.requestLayout();
       }
       return;
    }
    public void setContentViewBinder(hk2 p0){
       FrameLayout$LayoutParams layoutParams = new FrameLayout$LayoutParams(-1, -2);
       layoutParams.gravity = 16;
       jk2 tb = this.b;
       jk2 ta = this.a;
       if (tb != null) {
          ta.removeView(tb.getView());
       }
       this.b = p0;
       if (p0 != null) {
          ta.addView(p0.getView(), layoutParams);
       }
       return;
    }
    public void setScrollObserver(y46 p0){
       this.t = ry7.r(p0, jk2.v);
    }
    public void setStickyAreaSize(int p0){
       this.c = p0;
    }
}

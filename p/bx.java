package p.bx;
import p.d27;
import android.graphics.drawable.Drawable;
import android.content.Context;
import java.lang.ref.WeakReference;
import java.lang.Object;
import p.ty0;
import java.lang.String;
import android.content.res.Resources;
import android.graphics.Rect;
import p.q24;
import p.e27;
import android.graphics.Paint$Align;
import android.graphics.Paint;
import p.ax;
import java.lang.ref.Reference;
import p.y17;
import java.text.NumberFormat;
import java.lang.Integer;
import android.widget.FrameLayout;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewGroup;
import p.wh7;
import p.eh7;
import p.p24;
import p.bd6;
import android.graphics.ColorFilter;

public final class bx extends Drawable implements d27	// class@001158 from classes.dex
{
    public float A;
    public int B;
    public float C;
    public float D;
    public float E;
    public WeakReference F;
    public WeakReference G;
    public final WeakReference a;
    public final q24 b;
    public final e27 c;
    public final Rect t;
    public float v;
    public float w;
    public float x;
    public final ax y;
    public float z;

    public void bx(Context p0){
       super();
       WeakReference weakReferenc = new WeakReference(p0);
       this.a = weakReferenc;
       ty0.i(p0, ty0.l, "Theme.MaterialComponents");
       Resources resources = p0.getResources();
       this.t = new Rect();
       this.b = new q24();
       this.v = (float)resources.getDimensionPixelSize(R.dimen.mtrl_badge_radius);
       this.x = (float)resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding);
       this.w = (float)resources.getDimensionPixelSize(R.dimen.mtrl_badge_with_text_radius);
       e27 uoe27 = new e27(this);
       this.c = uoe27;
       uoe27.a.setTextAlign(Paint$Align.CENTER);
       this.y = new ax(p0);
       if ((p0 = weakReferenc.get()) == null) {
       }else {
          y17 oy17 = new y17(p0, 0x7f13028d);
          if (uoe27.f != oy17 && (p0 = weakReferenc.get()) != null) {
             uoe27.b(oy17, p0);
             this.g();
          }
       }
       return;
    }
    public final void a(){
       this.invalidateSelf();
    }
    public final String b(){
       Context uContext;
       if (this.d() <= this.B) {
          return NumberFormat.getInstance().format((long)this.d());
       }
       if ((uContext = this.a.get()) == null) {
          return "";
       }
       Object[] objArray = new Object[]{Integer.valueOf(this.B),"+"};
       return uContext.getString(R.string.mtrl_exceed_max_badge_number_suffix, objArray);
    }
    public final FrameLayout c(){
       bx tG;
       FrameLayout uFrameLayout = ((tG = this.G) != null)? tG.get(): null;
       return uFrameLayout;
    }
    public final int d(){
       if (!this.e()) {
          return 0;
       }
       return this.y.t;
    }
    public final void draw(Canvas p0){
       if (!this.getBounds().isEmpty() && (this.y.c != null && this.isVisible())) {
          this.b.draw(p0);
          if (this.e()) {
             Rect rect = new Rect();
             String str = this.b();
             bx tc = this.c;
             tc.a.getTextBounds(str, 0, str.length(), rect);
             p0.drawText(str, this.z, (this.A + (float)(rect.height() / 2)), tc.a);
          }
       }
       return;
    }
    public final boolean e(){
       boolean b = (this.y.t != -1)? true: false;
       return b;
    }
    public final void f(View p0,FrameLayout p1){
       this.F = new WeakReference(p0);
       this.G = new WeakReference(p1);
       ViewGroup parent = p0.getParent();
       parent.setClipChildren(false);
       parent.setClipToPadding(false);
       this.g();
       this.invalidateSelf();
    }
    public final void g(){
       bx tG;
       ax z;
       bx tv;
       ax z1;
       float f;
       Context uContext = this.a.get();
       bx tF = this.F;
       ViewGroup viewGroup = null;
       View view = (tF != null)? tF.get(): viewGroup;
       if (uContext != null && view != null) {
          Rect rect = new Rect();
          bx tt = this.t;
          rect.set(tt);
          Rect rect1 = new Rect();
          view.getDrawingRect(rect1);
          if ((tG = this.G) != null) {
             viewGroup = tG.get();
          }
          if (viewGroup != null) {
             if (viewGroup == null) {
                viewGroup = view.getParent();
             }
             viewGroup.offsetDescendantRectToMyCoords(view, rect1);
          }
          tG = this.y;
          ax e = (this.e())? tG.E: tG.C;
          int i = e + tG.G;
          this.A = ((z = tG.z) != 0x800053 && z != 0x800055)? (float)(rect1.top + i): (float)(rect1.bottom - i);
          if (this.d() <= 9) {
             tv = (!this.e())? this.v: this.w;
             this.C = tv;
             this.E = tv;
             this.D = tv;
          }else {
             tv = this.w;
             this.C = tv;
             this.E = tv;
             this.D = (this.c.a(this.b()) / 2.00f) + this.x;
          }
          Resources resources = uContext.getResources();
          i = (this.e())? 0x7f0602b4: 0x7f0602b1;
          int dimensionPix = resources.getDimensionPixelSize(i);
          e = (this.e())? tG.D: tG.B;
          i = e + tG.F;
          if ((z1 = tG.z) != 0x800033 && z1 != 0x800053) {
             f = (!eh7.d(view))? (((float)rect1.right + this.D) - (float)dimensionPix) - (float)i: (((float)rect1.left - this.D) + (float)dimensionPix) + (float)i;
             this.z = f;
          }else if(!eh7.d(view)){
             f = (((float)rect1.left - this.D) + (float)dimensionPix) + (float)i;
          }else {
             f = (((float)rect1.right + this.D) - (float)dimensionPix) - (float)i;
          }
          this.z = f;
          bx tz = this.z;
          tF = this.A;
          tv = this.D;
          bx tE = this.E;
          tt.set((int)(tz - tv), (int)(tF - tE), (int)(tz + tv), (int)(tF + tE));
          tF = this.b;
          tF.setShapeAppearanceModel(tF.a.a.e(this.C));
          if (!rect.equals(tt)) {
             tF.setBounds(tt);
          }
       }
       return;
    }
    public final int getAlpha(){
       return this.y.c;
    }
    public final int getIntrinsicHeight(){
       return this.t.height();
    }
    public final int getIntrinsicWidth(){
       return this.t.width();
    }
    public final int getOpacity(){
       return -3;
    }
    public final boolean isStateful(){
       return false;
    }
    public final boolean onStateChange(int[] p0){
       return super.onStateChange(p0);
    }
    public final void setAlpha(int p0){
       this.y.c = p0;
       this.c.a.setAlpha(p0);
       this.invalidateSelf();
    }
    public final void setColorFilter(ColorFilter p0){
    }
}

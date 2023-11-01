package p.wg;
import android.widget.ProgressBar;
import java.lang.Object;
import android.util.AttributeSet;
import android.content.Context;
import android.view.View;
import p.p86;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.AnimationDrawable;
import p.vr7;
import p.wr7;
import android.graphics.drawable.LayerDrawable;
import android.os.Build$VERSION;
import p.t3;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Bitmap;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.RectF;
import android.graphics.drawable.shapes.Shape;
import android.graphics.BitmapShader;
import android.graphics.Shader$TileMode;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.ColorFilter;
import android.graphics.drawable.ClipDrawable;

public class wg	// class@002b34 from classes.dex
{
    public final ProgressBar a;
    public Bitmap b;
    public static final int[] c;

    static {
       wg.c = new int[2]{0x101013b,0x101013c};
    }
    public void wg(ProgressBar p0){
       super();
       this.a = p0;
    }
    public void a(AttributeSet p0,int p1){
       Drawable uDrawable;
       int i1;
       wg ta = this.a;
       p86 op86 = p86.m(ta.getContext(), p0, wg.c, p1);
       p1 = 0;
       if ((uDrawable = op86.f(p1)) != null) {
          if (uDrawable instanceof AnimationDrawable) {
             int numberOfFram = uDrawable.getNumberOfFrames();
             AnimationDrawable uAnimationDr = new AnimationDrawable();
             uAnimationDr.setOneShot(uDrawable.isOneShot());
             int i = 0;
             while (true) {
                i1 = 0x2710;
                if (i < numberOfFram) {
                   Drawable uDrawable1 = this.b(uDrawable.getFrame(i), true);
                   uDrawable1.setLevel(i1);
                   uAnimationDr.addFrame(uDrawable1, uDrawable.getDuration(i));
                   i = i + 1;
                }else {
                   break ;
                }
             }
             uAnimationDr.setLevel(i1);
             uDrawable = uAnimationDr;
          }
          ta.setIndeterminateDrawable(uDrawable);
       }
       if ((uDrawable = op86.f(true)) != null) {
          ta.setProgressDrawable(this.b(uDrawable, p1));
       }
       op86.o();
       return;
    }
    public final Drawable b(Drawable p0,boolean p1){
       wr7 w;
       if (p0 instanceof vr7) {
          wr7 owr7 = p0;
          if ((w = owr7.w) != null) {
             owr7.b(this.b(w, p1));
          }
       }else {
          int i = 1;
          if (p0 instanceof LayerDrawable) {
             int numberOfLaye = p0.getNumberOfLayers();
             Drawable[] uDrawableArr = new Drawable[numberOfLaye];
             int i1 = 0;
             for (int i2 = 0; i2 < numberOfLaye; i2 = i2 + 1) {
                boolean id = p0.getId(i2);
                Drawable drawable = p0.getDrawable(i2);
                id = (id != 0x102000d && id != 0x102000f)? false: true;
                uDrawableArr[i2] = this.b(drawable, id);
             }
             LayerDrawable layerDrawabl = new LayerDrawable(uDrawableArr);
             while (i1 < numberOfLaye) {
                layerDrawabl.setId(i1, p0.getId(i1));
                if (Build$VERSION.SDK_INT >= 23) {
                   t3.D(layerDrawabl, i1, t3.a(p0, i1));
                   t3.f(layerDrawabl, i1, t3.i(p0, i1));
                   t3.k(layerDrawabl, i1, t3.l(p0, i1));
                   t3.n(layerDrawabl, i1, t3.o(p0, i1));
                   t3.q(layerDrawabl, i1, t3.r(p0, i1));
                   t3.t(layerDrawabl, i1, t3.u(p0, i1));
                   t3.w(layerDrawabl, i1, t3.x(p0, i1));
                   t3.z(layerDrawabl, i1, t3.A(p0, i1));
                   t3.B(layerDrawabl, i1, t3.C(p0, i1));
                }
                i1 = i1 + 1;
             }
             return layerDrawabl;
          }else if(p0 instanceof BitmapDrawable){
             Bitmap bitmap = p0.getBitmap();
             if (this.b == null) {
                this.b = bitmap;
             }
             ShapeDrawable shapeDrawabl = new ShapeDrawable(new RoundRectShape(new float[8]{0x40a00000,0x40a00000,0x40a00000,0x40a00000,0x40a00000,0x40a00000,0x40a00000,0x40a00000}, null, null));
             shapeDrawabl.getPaint().setShader(new BitmapShader(bitmap, Shader$TileMode.REPEAT, Shader$TileMode.CLAMP));
             shapeDrawabl.getPaint().setColorFilter(p0.getPaint().getColorFilter());
             if (p1) {
                shapeDrawabl = new ClipDrawable(shapeDrawabl, 3, i);
             }
             return shapeDrawabl;
          }
       }
       return p0;
    }
}

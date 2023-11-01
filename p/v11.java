package p.v11;
import p.q24;
import p.bd6;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import android.graphics.PorterDuffXfermode;
import android.graphics.PorterDuff$Mode;
import android.graphics.Xfermode;
import android.graphics.RectF;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable$Callback;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.graphics.Bitmap$Config;
import android.graphics.Bitmap;

public final class v11 extends q24	// class@00295e from classes.dex
{
    public final Paint O;
    public final RectF P;
    public int Q;

    public void v11(bd6 p0){
       if (p0 != null) {
       }else {
          p0 = new bd6();
       }
       super(p0);
       Paint paint = new Paint(1);
       this.O = paint;
       paint.setStyle(Paint$Style.FILL_AND_STROKE);
       paint.setColor(-1);
       paint.setXfermode(new PorterDuffXfermode(PorterDuff$Mode.DST_OUT));
       this.P = new RectF();
       return;
    }
    public final void draw(Canvas p0){
       Drawable$Callback callback = this.getCallback();
       if (callback instanceof View) {
          if (callback.getLayerType() != 2) {
             callback.setLayerType(2, null);
          }
       }else {
          this.Q = p0.saveLayer(0, 0, (float)p0.getWidth(), (float)p0.getHeight(), null);
       }
       super.draw(p0);
       if (!this.getCallback() instanceof View) {
          p0.restoreToCount(this.Q);
       }
       return;
    }
    public final void g(Canvas p0){
       v11 tP = this.P;
       if (tP.isEmpty()) {
          super.g(p0);
          return;
       }else {
          Bitmap uBitmap = Bitmap.createBitmap(p0.getWidth(), p0.getHeight(), Bitmap$Config.ARGB_8888);
          Canvas uCanvas = new Canvas(uBitmap);
          super.g(uCanvas);
          uCanvas.drawRect(tP, this.O);
          p0.drawBitmap(uBitmap, 0, 0, null);
          return;
       }
    }
    public final void o(float p0,float p1,float p2,float p3){
       v11 tP = this.P;
       if ((tP.left - p0) || ((tP.top - p1) || ((tP.right - p2) || (tP.bottom - p3)))) {
          tP.set(p0, p1, p2, p3);
          this.invalidateSelf();
       }
       return;
    }
}

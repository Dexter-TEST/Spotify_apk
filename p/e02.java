package p.e02;
import android.graphics.drawable.Drawable;
import android.content.Context;
import android.graphics.Paint;
import p.uw5;
import android.graphics.LinearGradient;
import android.graphics.Shader$TileMode;
import android.graphics.Canvas;
import android.graphics.Shader;
import android.graphics.ColorFilter;

public final class e02 extends Drawable	// class@0013ef from classes.dex
{
    public final Paint a;
    public final LinearGradient b;

    public void e02(Context p0){
       super();
       this.a = new Paint(1);
       LinearGradient p0 = new LinearGradient(0, 0, 0, 0x3f800000, 0, uw5.k(p0, R.attr.pasteColorBackground), Shader$TileMode.CLAMP);
       this.b = p0;
    }
    public final void draw(Canvas p0){
       p0.save();
       p0.scale((float)p0.getWidth(), (float)p0.getHeight());
       e02 ta = this.a;
       ta.setShader(this.b);
       p0.drawRect(0, 0, 0x3f800000, 0x3f800000, ta);
       p0.restore();
    }
    public final int getOpacity(){
       return -3;
    }
    public final void setAlpha(int p0){
       this.a.setAlpha(p0);
    }
    public final void setColorFilter(ColorFilter p0){
       this.a.setColorFilter(p0);
    }
}

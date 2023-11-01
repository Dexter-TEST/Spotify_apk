package p.kz5;
import android.graphics.drawable.Drawable$ConstantState;
import android.graphics.Bitmap;
import java.lang.Object;
import java.lang.String;
import p.co5;
import android.graphics.BitmapShader;
import android.graphics.Shader$TileMode;
import android.graphics.Paint;
import android.graphics.Paint$Style;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import p.lz5;

public final class kz5 extends Drawable$ConstantState	// class@001cb2 from classes.dex
{
    public final Bitmap a;
    public final float b;
    public int c;
    public final BitmapShader d;
    public final Paint e;

    public void kz5(Bitmap p0,float p1){
       co5.o(p0, "bitmap");
       super();
       this.a = p0;
       this.b = p1;
       BitmapShader uBitmapShade = new BitmapShader(p0, Shader$TileMode.CLAMP, Shader$TileMode.CLAMP);
       this.d = uBitmapShade;
       Paint paint = new Paint(3);
       paint.setStyle(Paint$Style.FILL);
       paint.setShader(uBitmapShade);
       this.e = paint;
    }
    public final int getChangingConfigurations(){
       return this.c;
    }
    public final Drawable newDrawable(){
       return new lz5(this.a, this.b);
    }
}

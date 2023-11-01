package p.gi0;
import p.d07;
import io.reactivex.rxjava3.core.SingleEmitter;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import java.lang.String;
import p.co5;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Bitmap;
import p.hi6;
import java.lang.RuntimeException;
import java.lang.Throwable;

public final class gi0 implements d07	// class@001710 from classes.dex
{
    public final SingleEmitter a;

    public void gi0(SingleEmitter p0){
       this.a = p0;
       super();
    }
    public final void b(Drawable p0){
    }
    public final void c(Drawable p0){
       co5.o(p0, "result");
       this.a.onSuccess(p0.getBitmap());
    }
    public final void d(Drawable p0){
       this.a.tryOnError(new RuntimeException("Error getting bitmap from request"));
    }
}

package p.ii0;
import p.d07;
import p.kj0;
import p.ks5;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.graphics.drawable.AnimationDrawable;
import java.lang.String;
import p.co5;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.Bitmap;
import p.k63;
import android.graphics.drawable.Animatable;

public final class ii0 implements d07	// class@001999 from classes.dex
{
    public final kj0 a;
    public final ks5 b;
    public final ks5 c;

    public void ii0(kj0 p0,ks5 p1,ks5 p2){
       this.a = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public final void b(Drawable p0){
       kj0 a = this.a.a;
       a.setImageDrawable(p0);
       p0 = a.getDrawable();
       if (p0 instanceof AnimationDrawable) {
       }else {
          p0 = null;
       }
       if (p0 != null) {
          p0.start();
       }
       return;
    }
    public final void c(Drawable p0){
       co5.o(p0, "result");
       Bitmap bitmap = p0.getBitmap();
       ii0 tb = this.b;
       if (tb.a != null) {
          co5.l(bitmap, "bitmap");
          ks5 a = tb.a;
          co5.i(a);
          this.a.a(bitmap, a);
       }else {
          this.c.a = bitmap;
       }
       return;
    }
    public final void d(Drawable p0){
       kj0 a = this.a.a;
       Drawable drawable = a.getDrawable();
       if (drawable instanceof Animatable) {
       }else {
          drawable = null;
       }
       if (drawable != null) {
          drawable.stop();
       }
       if (p0 != null) {
          a.setImageDrawable(p0);
       }
       return;
    }
}

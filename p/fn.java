package p.fn;
import p.e07;
import io.reactivex.rxjava3.core.SingleEmitter;
import p.r45;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import android.graphics.Bitmap;
import p.hi6;
import java.lang.Exception;
import java.lang.String;
import java.lang.Throwable;
import p.ud5;

public final class fn implements e07	// class@001603 from classes.dex
{
    public final SingleEmitter a;
    public final r45 b;

    public void fn(SingleEmitter p0,r45 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void a(Drawable p0){
       fn tb = this.b;
       fn ta = this.a;
       if (tb.c()) {
          ta.onSuccess(tb.b());
       }else {
          ta.onError(new Exception("Couldn\'t load image"));
       }
       return;
    }
    public final void b(Drawable p0){
    }
    public final void c(Bitmap p0,ud5 p1){
       this.a.onSuccess(p0);
    }
}

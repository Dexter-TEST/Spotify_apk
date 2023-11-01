package p.e27;
import p.d27;
import java.lang.Object;
import android.text.TextPaint;
import p.ze0;
import java.lang.ref.WeakReference;
import java.lang.String;
import java.lang.CharSequence;
import android.graphics.Paint;
import p.y17;
import android.content.Context;
import p.ty0;
import java.lang.ref.Reference;

public final class e27	// class@001408 from classes.dex
{
    public final TextPaint a;
    public final ze0 b;
    public float c;
    public boolean d;
    public WeakReference e;
    public y17 f;

    public void e27(d27 p0){
       super();
       this.a = new TextPaint(1);
       this.b = new ze0(1, this);
       this.d = true;
       this.e = new WeakReference(null);
       this.e = new WeakReference(p0);
    }
    public final float a(String p0){
       if (this.d == null) {
          return this.c;
       }
       float f = (p0 == null)? 0: this.a.measureText(p0, false, p0.length());
       this.c = f;
       this.d = false;
       return f;
    }
    public final void b(y17 p0,Context p1){
       d27 uod27;
       d27 uod271;
       if (this.f != p0) {
          this.f = p0;
          if (p0 != null) {
             e27 ta = this.a;
             e27 tb = this.b;
             p0.f(p1, ta, tb);
             if ((uod27 = this.e.get()) != null) {
                ta.drawableState = uod27.getState();
             }
             p0.e(p1, ta, tb);
             this.d = true;
          }
          if ((uod271 = this.e.get()) != null) {
             uod271.a();
             uod271.onStateChange(uod271.getState());
          }
       }
       return;
    }
}

package p.r63;
import p.a5;
import p.wd5;
import android.widget.ImageView;
import p.cv5;
import android.graphics.drawable.Drawable;
import java.lang.String;
import java.lang.Object;
import android.graphics.Bitmap;
import p.ud5;
import java.lang.ref.Reference;
import android.content.Context;
import p.xd5;
import java.lang.AssertionError;
import java.lang.Exception;
import android.graphics.drawable.Animatable;

public final class r63 extends a5	// class@002485 from classes.dex
{
    public oi m;

    public void r63(wd5 p0,ImageView p1,cv5 p2,int p3,Drawable p4,String p5,Object p6){
       super(p0, p1, p2, p3, p4, p5, p6);
       this.m = null;
    }
    public final void a(){
       this.l = true;
       if (this.m != null) {
          this.m = null;
       }
       return;
    }
    public final void b(Bitmap p0,ud5 p1){
       Object obj;
       if (p0 != null) {
          if ((obj = this.c.get()) == null) {
             return;
          }
          a5 ta = this.a;
          xd5.a(obj, ta.c, p0, p1, this.d, ta.k);
          return;
       }else {
          Object[] objArray = new Object[]{this};
          throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", objArray));
       }
    }
    public final void c(Exception p0){
       ImageView imageView;
       a5 tg;
       if ((imageView = this.c.get()) == null) {
          return;
       }
       Drawable drawable = imageView.getDrawable();
       if (drawable instanceof Animatable) {
          drawable.stop();
       }
       if ((tg = this.g) != null) {
          imageView.setImageResource(tg);
       }else if((tg = this.h) != null){
          imageView.setImageDrawable(tg);
       }
       return;
    }
}

package p.kj0;
import android.widget.ImageView;
import java.lang.Object;
import java.lang.String;
import p.co5;
import android.graphics.Bitmap;
import p.k63;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.TransitionDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.content.res.Resources;
import android.view.View;
import java.lang.IllegalStateException;

public final class kj0	// class@001c21 from classes.dex
{
    public final ImageView a;

    public void kj0(ImageView p0){
       co5.o(p0, "imageView");
       super();
       this.a = p0;
    }
    public final void a(Bitmap p0,k63 p1){
       TransitionDrawable transitionDr;
       if (p0.isRecycled()) {
          throw new IllegalStateException();
       }
       kj0 ta = this.a;
       Drawable drawable = ta.getDrawable();
       if (drawable instanceof AnimationDrawable) {
       }else {
          drawable = null;
       }
       if (drawable != null) {
          drawable.stop();
       }
       if (p1 != k63.a) {
          Drawable[] uDrawableArr = new Drawable[2];
          Drawable drawable1 = ta.getDrawable();
          int i = 0;
          if (drawable1 == null) {
             drawable1 = new ColorDrawable(i);
          }
          uDrawableArr[i] = drawable1;
          uDrawableArr[1] = new BitmapDrawable(ta.getResources(), p0);
          transitionDr = new TransitionDrawable(uDrawableArr);
          transitionDr.setCrossFadeEnabled(1);
          transitionDr.startTransition(200);
       }else {
          transitionDr = new BitmapDrawable(ta.getResources(), p0);
       }
       ta.setImageDrawable(transitionDr);
       return;
    }
    public final boolean equals(Object p0){
       boolean b = false;
       if (!p0 instanceof kj0) {
          return b;
       }
       if (p0.a == this.a) {
          b = true;
       }
       return b;
    }
    public final int hashCode(){
       return this.a.hashCode();
    }
}

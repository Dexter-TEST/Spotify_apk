package p.wp6;
import p.e07;
import android.widget.ImageView;
import p.he1;
import java.lang.Object;
import android.graphics.drawable.Drawable;
import p.ec3;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.Bitmap;
import p.ud5;
import p.ap5;
import p.ej0;
import p.uv1;
import p.uf;
import p.c26;
import android.content.Context;
import android.view.View;

public final class wp6 implements e07	// class@002b82 from classes.dex
{
    public final ImageView a;
    public he1 b;
    public oi c;

    public void wp6(ImageView p0,he1 p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void a(Drawable p0){
       this.a.setImageDrawable(p0);
    }
    public final void b(Drawable p0){
       wp6 ta = this.a;
       ta.setImageDrawable(p0);
       if (ta.getDrawable() instanceof AnimationDrawable) {
          ta.getDrawable().start();
       }
       return;
    }
    public final void c(Bitmap p0,ud5 p1){
       ap5.e((p0.isRecycled() ^ 1));
       if (this.c instanceof ej0) {
          new uv1(p0).g(new uf(1, this));
       }
       Drawable uDrawable = this.b.a(p0);
       wp6 ta = this.a;
       Drawable drawable = ta.getDrawable();
       if (drawable instanceof AnimationDrawable) {
          drawable.stop();
       }
       ta.setImageDrawable(new ec3(ta.getContext(), uDrawable, drawable, p1));
       ap5.e((p0.isRecycled() ^ 1));
       return;
    }
    public final boolean equals(Object p0){
       boolean b = false;
       if (p0 == null) {
          return b;
       }
       if (!p0 instanceof wp6) {
          return b;
       }
       if (p0.a == this.a && p0.b == this.b) {
          b = true;
       }
       return b;
    }
    public final int hashCode(){
       return this.a.hashCode();
    }
}

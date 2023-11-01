package p.vj2;
import p.c56;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.Drawable;
import p.ap5;

public final class vj2 extends LayerDrawable implements c56	// class@002a06 from classes.dex
{

    public void vj2(Drawable[] p0){
       super(p0);
       boolean b = (p0.length == 2)? true: false;
       ap5.e(b);
       return;
    }
    public final void a(float p0,int p1){
       int i = 0;
       if (this.getDrawable(i) instanceof c56) {
          this.getDrawable(i).a(p0, p1);
       }
       i = 1;
       if (this.getDrawable(i) instanceof c56) {
          this.getDrawable(i).a(p0, p1);
       }
       return;
    }
}

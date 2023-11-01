package p.be;
import p.rr6;
import p.ee;
import android.content.res.Resources;
import p.sr6;
import p.qv3;
import p.jo6;
import android.graphics.drawable.Drawable;

public final class be extends rr6	// class@0010ae from classes.dex
{
    public qv3 I;
    public jo6 J;
    public static final int K;

    public void be(be p0,ee p1,Resources p2){
       super(p0, p1, p2);
       if (p0 != null) {
          this.I = p0.I;
          this.J = p0.J;
       }else {
          this.I = new qv3();
          this.J = new jo6();
       }
       return;
    }
    public final void e(){
       this.I = this.I.d();
       this.J = this.J.c();
    }
    public final Drawable newDrawable(){
       return new ee(this, null);
    }
    public final Drawable newDrawable(Resources p0){
       return new ee(this, p0);
    }
}

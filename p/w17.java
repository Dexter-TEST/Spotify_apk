package p.w17;
import p.uw5;
import p.y17;
import p.ty0;
import android.graphics.Typeface;

public final class w17 extends uw5	// class@002aab from classes.dex
{
    public final ty0 A;
    public final y17 B;

    public void w17(y17 p0,ty0 p1){
       this.B = p0;
       this.A = p1;
       super();
    }
    public final void p(int p0){
       this.B.m = true;
       this.A.r(p0);
    }
    public final void q(Typeface p0){
       w17 tB = this.B;
       tB.n = Typeface.create(p0, tB.c);
       tB.m = true;
       this.A.s(tB.n, false);
    }
}

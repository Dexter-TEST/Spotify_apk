package p.x17;
import p.ty0;
import p.y17;
import android.text.TextPaint;
import android.graphics.Typeface;

public final class x17 extends ty0	// class@002bee from classes.dex
{
    public final TextPaint m;
    public final ty0 n;
    public final y17 o;

    public void x17(y17 p0,TextPaint p1,ty0 p2){
       this.o = p0;
       this.m = p1;
       this.n = p2;
       super();
    }
    public final void r(int p0){
       this.n.r(p0);
    }
    public final void s(Typeface p0,boolean p1){
       this.o.g(this.m, p0);
       this.n.s(p0, p1);
    }
}

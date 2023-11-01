package p.rd6;
import p.td6;
import android.graphics.RectF;
import android.graphics.Matrix;
import android.graphics.Path;

public final class rd6 extends td6	// class@0024c8 from classes.dex
{
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public static final RectF h;

    static {
       rd6.h = new RectF();
    }
    public void rd6(float p0,float p1,float p2,float p3){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
    }
    public final void a(Matrix p0,Path p1){
       td6 ta = this.a;
       p0.invert(ta);
       p1.transform(ta);
       RectF h = rd6.h;
       h.set(this.b, this.c, this.d, this.e);
       p1.arcTo(h, this.f, this.g, false);
       p1.transform(p0);
    }
}

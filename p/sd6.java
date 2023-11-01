package p.sd6;
import p.td6;
import android.graphics.Matrix;
import android.graphics.Path;

public final class sd6 extends td6	// class@00260b from classes.dex
{
    public float b;
    public float c;

    public void sd6(){
       super();
    }
    public final void a(Matrix p0,Path p1){
       td6 ta = this.a;
       p0.invert(ta);
       p1.transform(ta);
       p1.lineTo(this.b, this.c);
       p1.transform(p0);
    }
}

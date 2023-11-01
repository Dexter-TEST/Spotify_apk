package p.vd6;
import java.lang.Object;
import java.util.ArrayList;
import p.rd6;
import p.pd6;
import android.graphics.Matrix;
import android.graphics.Path;
import p.td6;
import p.sd6;
import p.qd6;

public final class vd6	// class@0029d1 from classes.dex
{
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public final ArrayList g;
    public final ArrayList h;

    public void vd6(){
       super();
       this.g = new ArrayList();
       this.h = new ArrayList();
       this.d(0, 270.00f, 0);
    }
    public final void a(float p0){
       vd6 te = this.e;
       if (!(p0 - te)) {
          return;
       }
       float f = ((p0 - te) + 360.00f) % 360.00f;
       if ((0x43340000 - f) > 0) {
          return;
       }
       rd6 ord6 = new rd6(this.c, this.d, this.c, this.d);
       ord6.f = this.e;
       ord6.g = f;
       this.h.add(new pd6(ord6));
       this.e = p0;
       return;
    }
    public final void b(Matrix p0,Path p1){
       vd6 tg = this.g;
       int i = tg.size();
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          tg.get(i1).a(p0, p1);
       }
       return;
    }
    public final void c(float p0,float p1){
       sd6 osd6 = new sd6();
       osd6.b = p0;
       osd6.c = p1;
       this.g.add(osd6);
       qd6 oqd6 = new qd6(osd6, this.c, this.d);
       this.a((oqd6.b() + 270.00f));
       this.h.add(oqd6);
       this.e = oqd6.b() + 270.00f;
       this.c = p0;
       this.d = p1;
    }
    public final void d(float p0,float p1,float p2){
       this.a = 0;
       this.b = p0;
       this.c = 0;
       this.d = p0;
       this.e = p1;
       this.f = (p1 + p2) % 360.00f;
       this.g.clear();
       this.h.clear();
    }
}

package p.xe1;
import p.my;
import p.sy;
import p.o11;
import java.lang.Object;
import p.qd;
import p.qy;
import p.rd;
import p.z52;
import p.zh3;
import java.lang.Float;
import java.lang.Math;
import java.lang.Integer;
import android.graphics.Color;
import android.graphics.Paint;

public final class xe1 implements my	// class@002c5c from classes.dex
{
    public final my a;
    public final qy b;
    public final z52 c;
    public final z52 d;
    public final z52 e;
    public final z52 f;
    public boolean g;

    public void xe1(my p0,sy p1,o11 p2){
       super();
       this.g = true;
       this.a = p0;
       qy oqy = p2.b.a();
       this.b = oqy;
       oqy.a(this);
       p1.f(oqy);
       oqy = p2.c.a();
       this.c = oqy;
       oqy.a(this);
       p1.f(oqy);
       oqy = p2.t.a();
       this.d = oqy;
       oqy.a(this);
       p1.f(oqy);
       oqy = p2.v.a();
       this.e = oqy;
       oqy.a(this);
       p1.f(oqy);
       oqy = p2.w.a();
       this.f = oqy;
       oqy.a(this);
       p1.f(oqy);
    }
    public final void a(zh3 p0){
       if (this.g == null) {
          return;
       }
       this.g = false;
       double d = (double)this.d.e().floatValue() * 0x3f91df46a2529d39;
       float f = this.e.e().floatValue();
       float f1 = (float)Math.sin(d) * f;
       float f2 = (float)Math.cos((d + 0x400921fb54442d18)) * f;
       int i = this.b.e().intValue();
       int i1 = Color.red(i);
       int i2 = Color.green(i);
       p0.setShadowLayer(this.f.e().floatValue(), f1, f2, Color.argb(Math.round(this.c.e().floatValue()), i1, i2, Color.blue(i)));
       return;
    }
    public final void b(){
       this.g = true;
       this.a.b();
    }
}

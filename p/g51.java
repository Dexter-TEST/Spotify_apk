package p.g51;
import java.io.Closeable;
import android.content.Context;
import java.lang.Object;
import p.ow1;
import p.tm5;
import p.nd1;
import p.ta3;
import p.t47;
import p.u47;
import p.g01;
import p.z84;
import p.xv1;
import p.yv1;
import p.zv1;
import p.v36;
import p.u36;
import p.u87;
import p.nd7;
import p.wv1;
import p.u16;

public final class g51 implements Closeable	// class@0016a0 from classes.dex
{
    public tm5 a;
    public ta3 b;
    public tm5 c;
    public tm5 t;
    public tm5 v;

    public void g51(Context p0){
       g51 og51 = this;
       super();
       og51.a = nd1.b(ow1.a);
       ta3 ota3 = ta3.a(p0);
       og51.b = ota3;
       t47 a = t47.a;
       u47 a1 = u47.a;
       og51.c = nd1.b(new z84(ota3, new g01(ota3, a, a1, 0), 0));
       v36 ota31 = new v36(a, a1, zv1.a, new g01(og51.b, xv1.a, yv1.a, 1), 2);
       tm5 otm5 = nd1.b(ota3);
       og51.t = otm5;
       g51 og511 = og51.b;
       ota31 = new v36(og511, otm5, new u36(a, 0), a1, 0);
       g51 a2 = og51.a;
       g51 c = og51.c;
       g51 og512 = a2;
       v36 ov36 = v20;
       tm5 otm51 = otm5;
       u87 v21 = new u87(og512, c, ov36, otm51, otm5, 1);
       g51 v36 og513 = a2;
       nd7 v19 = new nd7(og511, c, otm5, v20, og513, otm5, a, 0);
       og513 = new v36(og512, otm5, ov36, otm51, 1);
       u87 otm52 = new u87(a, a1, v21, v19, og513, 0);
       og51.v = nd1.b(otm5);
    }
    public final void b(){
       this.t.get().close();
    }
    public final void close(){
       this.b();
    }
}

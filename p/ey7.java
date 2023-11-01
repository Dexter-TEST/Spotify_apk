package p.ey7;
import p.jd;
import java.lang.String;
import p.xy7;
import p.hy7;
import p.yx7;
import p.wz7;
import p.gz7;
import p.jz7;
import p.pz7;
import p.rz7;
import p.zy7;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicBoolean;
import java.lang.Exception;
import java.lang.Class;
import p.ky7;
import p.wy7;
import java.lang.Throwable;

public final class ey7	// class@001523 from classes.dex
{
    public final xy7 a;
    public final yx7 b;
    public final wz7 c;
    public final gz7 d;
    public final jz7 e;
    public final pz7 f;
    public final rz7 g;
    public final hy7 h;
    public final zy7 i;
    public final AtomicBoolean j;
    public static final jd k;

    static {
       ey7.k = new jd("ExtractorLooper");
    }
    public void ey7(xy7 p0,hy7 p1,yx7 p2,wz7 p3,gz7 p4,jz7 p5,pz7 p6,rz7 p7,zy7 p8){
       super();
       this.a = p0;
       this.h = p1;
       this.b = p2;
       this.c = p3;
       this.d = p4;
       this.e = p5;
       this.f = p6;
       this.g = p7;
       this.i = p8;
       this.j = new AtomicBoolean(false);
    }
    public final void a(int p0,Exception p1){
       ey7 ta = this.a;
       int i = 0;
       try{
          ta.getClass();
          ta.c(new ky7(ta, p0, i));
          ta.c(new ky7(ta, p0));
          return;
       }catch(p.dy7 e0){
          Object[] objArray = new Object[1];
          objArray[i] = p1.getMessage();
          ey7.k.c("Error during error handling: %s", objArray);
          return;
       }
    }
}

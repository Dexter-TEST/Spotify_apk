package p.ji0;
import p.m63;
import p.li0;
import p.ks5;
import p.kj0;
import java.lang.Object;
import p.n63;
import p.qv6;
import p.en6;
import p.k63;
import p.cd2;
import android.graphics.Bitmap;
import p.to1;
import java.lang.String;
import p.co5;
import java.lang.Class;

public final class ji0 implements m63	// class@001add from classes.dex
{
    public final li0 b;
    public final ks5 c;
    public final kj0 d;
    public final ks5 e;

    public void ji0(li0 p0,ks5 p1,kj0 p2,ks5 p3){
       this.b = p0;
       this.c = p1;
       this.d = p2;
       this.e = p3;
       super();
    }
    public final void a(n63 p0,qv6 p1){
       li0 c;
       ks5 a1;
       if ((c = this.b.c) != null) {
          c.a(p0, p1);
       }
       int i = en6.A(p1.c);
       k63 a = k63.a;
       if (i && i != 1) {
          if (i != 2) {
             if (i == 3) {
                a = k63.c;
             }else {
                throw new cd2(10);
             }
          }else {
             a = k63.b;
          }
       }
       if ((a1 = this.c.a) != null) {
          this.d.a(a1, a);
       }else {
          a1.a = a;
       }
       return;
    }
    public final void b(n63 p0){
       li0 c;
       if ((c = this.b.c) != null) {
          c.b(p0);
       }
       return;
    }
    public final void c(n63 p0,to1 p1){
       li0 c;
       co5.o(p1, "result");
       ji0 tb = this.b;
       tb.getClass();
       if ((c = tb.c) != null) {
          c.c(p0, p1);
       }
       return;
    }
    public final void d(n63 p0){
       li0 c;
       if ((c = this.b.c) != null) {
          c.d(p0);
       }
       return;
    }
}

package p.t87;
import p.s87;
import p.ah0;
import p.j36;
import p.md7;
import p.sq7;
import java.lang.Object;
import java.lang.Class;
import p.em0;
import java.lang.Runnable;
import java.util.concurrent.Executor;
import p.g51;
import p.tm5;
import java.lang.IllegalStateException;
import java.lang.String;
import android.content.Context;
import p.a70;

public final class t87 implements s87	// class@002721 from classes.dex
{
    public final ah0 a;
    public final ah0 b;
    public final j36 c;
    public final md7 d;
    public static g51 e;

    public void t87(ah0 p0,ah0 p1,j36 p2,md7 p3,sq7 p4){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       p4.getClass();
       p4.a.execute(new em0(12, p4));
    }
    public static t87 a(){
       g51 e;
       if ((e = t87.e) != null) {
          return e.v.get();
       }
       throw new IllegalStateException("Not initialized!");
    }
    public static void b(Context p0){
       if (t87.e == null) {
          _monitor_enter(t87.class);
          if (t87.e == null) {
             p0.getClass();
             new a70().a = p0;
             t87.e = new g51(p0);
          }
          _monitor_exit(t87.class);
       }
       return;
    }
}

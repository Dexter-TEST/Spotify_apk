package p.pn6;
import p.q63;
import p.g70;
import java.io.File;
import p.co5;
import java.lang.IllegalArgumentException;
import java.lang.String;
import java.lang.Object;
import java.io.Closeable;
import p.r;
import p.c42;
import java.lang.IllegalStateException;

public final class pn6 extends q63	// class@002297 from classes.dex
{
    public final co5 a;
    public boolean b;
    public g70 c;

    public void pn6(g70 p0,File p1,co5 p2){
       super();
       this.a = p2;
       this.c = p0;
       if (p1.isDirectory()) {
          return;
       }
       throw new IllegalArgumentException("cacheDirectory must be a directory.".toString());
    }
    public final co5 b(){
       return this.a;
    }
    public synchronized final void close(){
       pn6 tc;
       this.b = true;
       if ((tc = this.c) != null) {
          r.a(tc);
       }
       return;
    }
    public synchronized final g70 f(){
       pn6 tc;
       if (!((this.b ^ 0x01))) {
          throw new IllegalStateException("closed".toString());
       }
       if ((tc = this.c) != null) {
          return tc;
       }
       co5.i(null);
       throw null;
    }
}

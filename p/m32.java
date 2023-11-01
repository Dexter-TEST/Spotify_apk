package p.m32;
import p.q63;
import p.m95;
import p.c42;
import java.lang.String;
import java.io.Closeable;
import p.co5;
import p.r;
import p.g70;
import p.nn6;
import p.hp5;
import p.xe7;
import java.lang.IllegalStateException;
import java.lang.Object;

public final class m32 extends q63	// class@001e17 from classes.dex
{
    public final m95 a;
    public final c42 b;
    public final String c;
    public final Closeable t;
    public boolean v;
    public hp5 w;

    public void m32(m95 p0,c42 p1,String p2,Closeable p3){
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.t = p3;
    }
    public final co5 b(){
       return null;
    }
    public synchronized final void close(){
       m32 tw;
       this.v = true;
       if ((tw = this.w) != null) {
          r.a(tw);
       }
       if ((tw = this.t) != null) {
          r.a(tw);
       }
       return;
    }
    public synchronized final g70 f(){
       m32 tw;
       if (!((this.v ^ 0x01))) {
          throw new IllegalStateException("closed".toString());
       }
       if ((tw = this.w) != null) {
          return tw;
       }
       hp5 ohp5 = xe7.f(this.b.l(this.a));
       this.w = ohp5;
       return ohp5;
    }
}

package p.pj0;
import p.w47;
import java.lang.Object;
import p.a47;
import java.lang.String;
import p.co5;

public final class pj0 implements w47	// class@00226f from classes.dex
{
    public final w47[] a;

    public void pj0(w47[] p0){
       this.a = p0;
    }
    public final void a(a47 p0){
       co5.o(p0, "measurement");
       pj0 ta = this.a;
       int len = ta.length;
       for (int i = 0; i < len; i = i + 1) {
          ta[i].a(p0);
       }
       return;
    }
}

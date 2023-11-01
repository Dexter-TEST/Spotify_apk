package p.l87;
import p.i87;
import p.m87;
import p.h87;
import p.g87;

public final class l87 extends i87	// class@001d06 from classes.dex
{
    public final m87 a;

    public void l87(m87 p0){
       super();
       this.a = p0;
    }
    public final void a(h87 p0){
       l87 ta = this.a;
       int i = ta.Q - 1;
       ta.Q = i;
       if (!i) {
          ta.R = false;
          ta.n();
       }
       p0.w(this);
       return;
    }
    public final void e(h87 p0){
       l87 ta = this.a;
       if (ta.R == null) {
          ta.I();
          ta.R = true;
       }
       return;
    }
}

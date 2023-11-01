package p.gn0;
import p.oi;
import java.lang.Object;
import java.io.PrintStream;
import java.io.PrintWriter;

public final class gn0 extends oi	// class@00173d from classes.dex
{
    public final int H;
    public final Object I;

    public void gn0(int p0,Object p1){
       this.H = p0;
       this.I = p1;
    }
    public final gn0 p(Object p0){
       gn0 tI = this.I;
       switch (this.H){
           case 0:
           default:
             tI.print(p0);
             return this;
       }
       tI.print(p0);
       return this;
    }
}

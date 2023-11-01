package p.ck;
import p.xe7;
import p.bk;
import p.n81;
import java.lang.Runnable;

public final class ck extends xe7	// class@001228 from classes.dex
{
    public final n81 F;
    public static ck G;
    public static final bk H;

    static {
       ck.H = new bk(1);
    }
    public void ck(){
       super();
       this.F = new n81();
    }
    public static ck o0(){
       if (ck.G != null) {
          return ck.G;
       }
       ck uock = ck.class;
       _monitor_enter(uock);
       if (ck.G == null) {
          ck.G = new ck();
       }
       _monitor_exit(uock);
       return ck.G;
    }
    public final void n0(Runnable p0){
       this.F.o0(p0);
    }
    public final boolean p0(){
       return this.F.p0();
    }
    public final void q0(Runnable p0){
       this.F.q0(p0);
    }
}

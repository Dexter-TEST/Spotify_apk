package p.kj1;
import p.ap5;
import java.util.concurrent.ThreadPoolExecutor;
import java.lang.Throwable;
import p.j8;

public final class kj1 extends ap5	// class@001c22 from classes.dex
{
    public final ap5 G;
    public final ThreadPoolExecutor H;

    public void kj1(ap5 p0,ThreadPoolExecutor p1){
       this.G = p0;
       this.H = p1;
       super();
    }
    public final void u(Throwable p0){
       this.G.u(p0);
       this.H.shutdown();
    }
    public final void v(j8 p0){
       this.G.v(p0);
       this.H.shutdown();
    }
}

package p.bo0;
import p.i70;
import java.lang.Object;
import java.util.concurrent.ExecutorService;
import p.sr7;
import p.qf2;
import p.vf;
import java.lang.Runtime;
import java.lang.Math;
import p.ao0;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.Executors;

public final class bo0	// class@001100 from classes.dex
{
    public final ExecutorService a;
    public final ExecutorService b;
    public final sr7 c;
    public final qf2 d;
    public final vf e;
    public final int f;
    public final int g;
    public final int h;

    public void bo0(i70 p0){
       super();
       this.a = bo0.a(false);
       this.b = bo0.a(true);
       this.c = new sr7();
       this.d = new qf2(null);
       this.e = new vf(9);
       this.f = 4;
       this.g = Integer.MAX_VALUE;
       this.h = 20;
    }
    public static ExecutorService a(boolean p0){
       return Executors.newFixedThreadPool(Math.max(2, Math.min((Runtime.getRuntime().availableProcessors() - 1), 4)), new ao0(p0));
    }
}

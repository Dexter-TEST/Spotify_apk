package p.mz4;
import java.lang.Runnable;
import p.nz4;
import java.lang.Object;
import p.lz4;
import p.kf6;

public final class mz4 implements Runnable	// class@001f36 from classes.dex
{
    public final nz4 a;
    public final long b;

    public void mz4(nz4 p0,long p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void run(){
       mz4 ta = this.a;
       ta.b.offer(this);
       ta.c();
    }
}

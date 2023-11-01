package p.a90;
import java.io.Closeable;
import java.io.Flushable;
import java.io.File;
import java.lang.Object;
import p.dc1;
import p.u07;

public final class a90 implements Closeable, Flushable	// class@000f37 from classes.dex
{
    public final dc1 a;

    public void a90(File p0,long p1){
       super();
       this.a = new dc1(p0, p1, u07.h);
    }
    public synchronized final void b(){
    }
    public final void close(){
       this.a.close();
    }
    public final void flush(){
       this.a.flush();
    }
}

package p.x91;
import p.rw6;
import p.w91;
import p.sf2;
import java.lang.Object;
import java.util.concurrent.atomic.AtomicBoolean;
import p.nw6;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Throwable;
import p.jl;
import p.fr0;

public final class x91 implements rw6	// class@002c30 from classes.dex
{
    public final AtomicBoolean a;
    public final fr0 b;
    public final rw6 c;

    public void x91(w91 p0,sf2 p1){
       super();
       this.a = new AtomicBoolean(true);
       this.b = p0;
       this.c = p1;
    }
    public final nw6 Y(){
       x91 ta = this.a;
       x91 tc = this.c;
       boolean b = false;
       try{
          ta.set(b);
          return tc.Y();
       }catch(java.lang.IllegalStateException e3){
          jl.f("Error opening "+tc.getDatabaseName(), e3);
          if (!ta.compareAndSet(true, b)) {
             throw e3;
          }
          this.b.accept(this.getDatabaseName());
          return tc.Y();
       }
    }
    public final void close(){
       this.c.close();
    }
    public final String getDatabaseName(){
       return this.c.getDatabaseName();
    }
    public final void setWriteAheadLoggingEnabled(boolean p0){
       this.c.setWriteAheadLoggingEnabled(p0);
    }
}

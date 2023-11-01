package p.h2;
import java.lang.Throwable;
import java.lang.String;

public final class h2 extends Throwable	// class@0017ce from classes.dex
{
    public final int a;

    public void h2(int p0){
       this.a = p0;
       super("Failure occurred while trying to finish a future.");
    }
    private synchronized void a(){
    }
    private synchronized void b(){
    }
    public synchronized final Throwable fillInStackTrace(){
       switch (this.a){
           case 0:
           default:
             this.b();
             return this;
       }
       this.a();
       return this;
    }
}

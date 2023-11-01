package p.p07;
import p.h07;
import java.lang.Runnable;
import p.ir2;
import java.lang.Class;
import java.lang.Object;
import java.lang.String;
import java.lang.StringBuilder;
import p.w51;

public final class p07 extends h07	// class@0021c9 from classes.dex
{
    public final Runnable c;

    public void p07(Runnable p0,long p1,ir2 p2){
       super(p1, p2);
       this.c = p0;
    }
    public final void run(){
       this.c.run();
       this.b.getClass();
    }
    public final String toString(){
       p07 tc = this.c;
       return "Task["+tc.getClass().getSimpleName()+'@'+w51.x(tc)+", "+this.a+", "+this.b+']';
    }
}

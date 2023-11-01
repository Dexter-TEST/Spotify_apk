package p.m36;
import p.pw1;
import kotlinx.coroutines.scheduling.b;
import java.lang.String;
import p.xw0;
import java.lang.Runnable;
import p.x07;
import p.ir2;

public abstract class m36 extends pw1	// class@001e1b from classes.dex
{
    public final b c;

    public void m36(int p0,int p1,long p2){
       super();
       b v6 = new b(p0, p1, p2, "DefaultDispatcher");
       this.c = v6;
    }
    public final void g0(xw0 p0,Runnable p1){
       this.c.f(p1, x07.f, false);
    }
}

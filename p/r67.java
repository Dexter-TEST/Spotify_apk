package p.r67;
import java.lang.Runnable;
import p.s67;
import java.lang.Object;

public final class r67 implements Runnable	// class@002489 from classes.dex
{
    public final int a;
    public final s67 b;

    public void r67(s67 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void run(){
       r67 tb = this.b;
       switch (this.a){
           case 0:
           default:
             tb.a();
             return;
       }
       tb.c(false);
       return;
    }
}

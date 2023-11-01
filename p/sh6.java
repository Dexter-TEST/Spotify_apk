package p.sh6;
import java.lang.Runnable;
import p.hr0;
import java.lang.Object;
import p.rg6;

public final class sh6 implements Runnable	// class@00262e from classes.dex
{
    public final int a;
    public final hr0 b;

    public void sh6(hr0 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void run(){
       sh6 tb = this.b;
       switch (this.a){
           case 0:
           default:
             tb.accept(new rg6());
             return;
       }
       tb.accept(new rg6());
       return;
    }
}

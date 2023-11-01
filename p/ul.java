package p.ul;
import java.lang.Runnable;
import p.xl;
import java.lang.Object;
import java.lang.Boolean;
import p.an5;

public final class ul implements Runnable	// class@0028d6 from classes.dex
{
    public final int a;
    public final xl b;

    public void ul(xl p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void run(){
       ul tb = this.b;
       switch (this.a){
           case 0:
           default:
             tb.x.onNext(Boolean.FALSE);
             return;
       }
       tb.x.onNext(Boolean.TRUE);
       return;
    }
}

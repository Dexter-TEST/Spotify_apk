package p.ja1;
import java.lang.Runnable;
import java.lang.Object;
import java.io.Serializable;
import p.ka1;
import p.pl5;

public final class ja1 implements Runnable	// class@001a97 from classes.dex
{
    public final int a;
    public final int b;
    public final Object c;
    public final Object t;

    public void ja1(Object p0,int p1,Serializable p2,int p3){
       this.a = p3;
       this.t = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public final void run(){
       ja1 tc = this.c;
       ja1 tb = this.b;
       ja1 tt = this.t;
       switch (this.a){
           case 0:
           default:
             tt.l(tb, tc);
             return;
       }
       tt.b.l(tb, tc);
       return;
    }
}

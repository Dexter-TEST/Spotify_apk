package p.l8;
import java.lang.Runnable;
import p.q8;
import android.view.View;
import java.lang.Object;

public final class l8 implements Runnable	// class@001d07 from classes.dex
{
    public final int a;
    public final View b;
    public final View c;
    public final q8 t;

    public void l8(q8 p0,View p1,View p2,int p3){
       this.a = p3;
       this.t = p0;
       this.b = p1;
       this.c = p2;
       super();
    }
    public final void run(){
       l8 tc = this.c;
       l8 tb = this.b;
       l8 tt = this.t;
       switch (this.a){
           case 0:
           default:
             q8.b(tt.e, tb, tc);
             return;
       }
       q8.b(tt.i, tb, tc);
       return;
    }
}

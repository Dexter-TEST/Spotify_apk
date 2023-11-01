package p.k81;
import java.lang.Runnable;
import java.lang.Object;
import java.util.ArrayList;
import p.te2;
import androidx.fragment.app.w;

public final class k81 implements Runnable	// class@001bc2 from classes.dex
{
    public final int a;
    public final Object b;
    public final Object c;

    public void k81(Object p0,int p1,Object p2){
       this.a = p1;
       this.c = p0;
       this.b = p2;
       super();
    }
    public final void run(){
       k81 tb = this.b;
       switch (this.a){
           case 0:
           default:
             tb.c();
             return;
       }
       te2.a(tb, 4);
       return;
    }
}

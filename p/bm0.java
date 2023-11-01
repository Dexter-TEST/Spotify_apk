package p.bm0;
import p.wf2;
import java.lang.Object;
import p.en3;
import java.lang.String;
import p.ap3;
import androidx.activity.a;

public final class bm0 implements wf2	// class@0010ee from classes.dex
{
    public final int a;
    public final Object b;

    public void bm0(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final Object invoke(){
       bm0 tb = this.b;
       switch (this.a){
           case 0:
             tb.reportFullyDrawn();
             return null;
           case 1:
             tb.h.a("spotify:home");
             return null;
           default:
             return tb;
       }
    }
}

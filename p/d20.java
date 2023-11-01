package p.d20;
import java.lang.Runnable;
import p.p77;
import java.lang.Object;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.lang.String;

public final class d20 implements Runnable	// class@0012c1 from classes.dex
{
    public final int a;
    public final p77 b;

    public void d20(p77 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void run(){
       d20 tb = this.b;
       switch (this.a){
           case 0:
           default:
             throw new IllegalStateException("Transformation "+tb.a()+" mutated input Bitmap but failed to recycle the original.");
       }
       throw new IllegalStateException("Transformation "+tb.a()+" returned input Bitmap but recycled it.");
    }
}

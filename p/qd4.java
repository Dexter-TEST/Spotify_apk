package p.qd4;
import p.ir0;
import p.an5;
import java.lang.Object;
import p.wt;
import java.lang.String;

public final class qd4 implements ir0	// class@00237d from classes.dex
{
    public final int a;
    public final an5 b;

    public void qd4(an5 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       qd4 tb = this.b;
       switch (this.a){
           case 0:
             break;
           default:
       }
       tb.onNext(p0);
       return;
    }
}

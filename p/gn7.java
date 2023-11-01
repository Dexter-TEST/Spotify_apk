package p.gn7;
import p.ir0;
import p.hr0;
import java.lang.Object;
import p.q35;
import p.tc5;
import p.no7;
import p.za0;

public final class gn7 implements ir0	// class@001744 from classes.dex
{
    public final int a;
    public final hr0 b;

    public void gn7(hr0 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final void accept(Object p0){
       gn7 tb = this.b;
       switch (this.a){
           case 0:
          label_000a :
             tb.accept(p0);
             return;
             break;
           case 1:
             tb.accept(p0);
             return;
           case 2:
             goto label_000a ;
             break;
           case 3:
             goto label_000a ;
             break;
           default:
             goto label_000a ;
       }
    }
}

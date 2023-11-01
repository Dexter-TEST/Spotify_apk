package p.z06;
import p.tb0;
import p.r44;
import p.a16;
import java.lang.Object;
import p.k44;

public final class z06 implements tb0	// class@002e63 from classes.dex
{
    public final int a;
    public final r44 b;
    public final k44 c;

    public void z06(r44 p0,a16 p1,int p2){
       this.a = p2;
       this.b = p0;
       this.c = p1;
       super();
    }
    public final void cancel(){
       z06 tc = this.c;
       z06 tb = this.b;
       switch (this.a){
           case 0:
             tb.h(tc);
             return;
           case 1:
             tb.h(tc);
             return;
           case 2:
             tb.h(tc);
             return;
           default:
             tb.h(tc);
             return;
       }
    }
}

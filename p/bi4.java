package p.bi4;
import p.r90;
import p.ti3;
import java.lang.Object;
import p.bv5;
import p.t90;
import p.g15;

public final class bi4 implements r90	// class@0010ce from classes.dex
{
    public final int a;
    public final ti3 b;

    public void bi4(ti3 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final t90 a(bv5 p0){
       bi4 tb = this.b;
       switch (this.a){
           case 0:
           default:
             return tb.get().a(p0);
       }
       return tb.get().a(p0);
    }
}

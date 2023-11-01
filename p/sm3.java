package p.sm3;
import p.r90;
import p.tm3;
import java.lang.Object;
import p.bv5;
import p.t90;
import p.aw6;
import p.g15;

public final class sm3 implements r90	// class@002658 from classes.dex
{
    public final int a;
    public final tm3 b;

    public void sm3(tm3 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final t90 a(bv5 p0){
       sm3 tb = this.b;
       switch (this.a){
           case 0:
           default:
             return tb.b.get().a(p0);
       }
       return tb.a.get().a(p0);
    }
}

package p.vm;
import p.yf2;
import p.e66;
import java.lang.Object;
import p.b43;
import p.w66;
import java.lang.String;
import java.lang.Throwable;
import p.u66;

public final class vm implements yf2	// class@002a27 from classes.dex
{
    public final int a;
    public final e66 b;

    public void vm(e66 p0,int p1){
       this.a = p1;
       this.b = p0;
       super();
    }
    public final Object apply(Object p0){
       vm tb = this.b;
       switch (this.a){
           case 0:
           default:
             return new u66(tb.m, p0);
       }
       return new w66(p0, tb.m);
    }
}

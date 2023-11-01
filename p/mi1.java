package p.mi1;
import p.yf2;
import java.lang.Object;
import p.ei1;
import java.lang.Throwable;
import p.rf7;
import java.lang.String;
import p.x75;

public final class mi1 implements yf2	// class@001e9d from classes.dex
{
    public final int a;
    public final Object b;

    public void mi1(int p0,Object p1){
       this.a = p0;
       this.b = p1;
       super();
    }
    public final Object apply(Object p0){
       mi1 tb = this.b;
       switch (this.a){
           case 0:
           default:
             return new rf7(tb.a);
       }
       return new rf7(tb.a);
    }
}

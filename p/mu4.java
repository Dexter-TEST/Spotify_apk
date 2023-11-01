package p.mu4;
import p.yf2;
import p.rn6;
import java.lang.Object;
import p.tn6;
import java.lang.Integer;

public final class mu4 implements yf2	// class@001f09 from classes.dex
{
    public final rn6 a;
    public final int b;

    public void mu4(rn6 p0,int p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final Object apply(Object p0){
       return Integer.valueOf(p0.f(this.a, this.b));
    }
}

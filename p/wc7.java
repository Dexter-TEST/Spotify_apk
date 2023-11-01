package p.wc7;
import p.eb3;
import java.lang.Object;
import java.lang.reflect.Method;
import java.lang.Class;

public final class wc7 extends eb3	// class@002b0f from classes.dex
{
    public final Method F;
    public final Object G;

    public void wc7(Object p0,Method p1){
       this.F = p1;
       this.G = p0;
       super();
    }
    public final Object s(Class p0){
       eb3.a(p0);
       Object[] objArray = new Object[]{p0};
       return this.F.invoke(this.G, objArray);
    }
}

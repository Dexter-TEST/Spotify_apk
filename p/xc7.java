package p.xc7;
import p.eb3;
import java.lang.reflect.Method;
import java.lang.Class;
import java.lang.Object;
import java.lang.Integer;

public final class xc7 extends eb3	// class@002c50 from classes.dex
{
    public final Method F;
    public final int G;

    public void xc7(int p0,Method p1){
       this.F = p1;
       this.G = p0;
       super();
    }
    public final Object s(Class p0){
       eb3.a(p0);
       Object[] objArray = new Object[]{p0,Integer.valueOf(this.G)};
       return this.F.invoke(null, objArray);
    }
}

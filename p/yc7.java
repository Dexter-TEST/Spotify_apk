package p.yc7;
import p.eb3;
import java.lang.reflect.Method;
import java.lang.Class;
import java.lang.Object;

public final class yc7 extends eb3	// class@002d91 from classes.dex
{
    public final Method F;

    public void yc7(Method p0){
       this.F = p0;
       super();
    }
    public final Object s(Class p0){
       eb3.a(p0);
       Object[] objArray = new Object[]{p0,Object.class};
       return this.F.invoke(null, objArray);
    }
}

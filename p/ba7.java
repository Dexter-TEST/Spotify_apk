package p.ba7;
import java.security.PrivilegedAction;
import java.lang.reflect.Field;
import java.lang.Object;
import java.lang.reflect.AccessibleObject;

public final class ba7 implements PrivilegedAction	// class@00108a from classes.dex
{
    public final Field a;

    public void ba7(Field p0){
       this.a = p0;
       super();
    }
    public final Object run(){
       this.a.setAccessible(true);
       return null;
    }
}

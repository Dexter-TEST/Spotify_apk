package p.zv1;
import p.a02;
import java.lang.Object;
import p.et;
import java.lang.NullPointerException;
import java.lang.String;

public final class zv1 implements a02	// class@002f70 from classes.dex
{
    public static final zv1 a;

    static {
       zv1.a = new zv1();
    }
    public void zv1(){
       super();
    }
    public final Object get(){
       et f;
       if ((f = et.f) != null) {
          return f;
       }
       throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}

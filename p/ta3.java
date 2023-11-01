package p.ta3;
import p.a02;
import p.ti3;
import java.lang.Object;
import java.lang.NullPointerException;
import java.lang.String;

public final class ta3 implements a02, ti3	// class@002730 from classes.dex
{
    public final Object a;

    public void ta3(Object p0){
       super();
       this.a = p0;
    }
    public static ta3 a(Object p0){
       if (p0 != null) {
          return new ta3(p0);
       }
       throw new NullPointerException("instance cannot be null");
    }
    public final Object get(){
       return this.a;
    }
}

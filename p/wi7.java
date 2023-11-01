package p.wi7;
import p.aj7;
import p.tm5;
import java.lang.Object;
import java.lang.Class;
import p.vi7;
import java.lang.IllegalStateException;
import java.lang.String;
import p.me4;

public final class wi7 implements aj7	// class@002b45 from classes.dex
{
    public final tm5 a;

    public void wi7(tm5 p0){
       this.a = p0;
       super();
    }
    public final vi7 a(Class p0){
       vi7 ovi7 = this.a.get();
       if (p0.isAssignableFrom(ovi7.getClass())) {
          return p0.cast(ovi7);
       }
       Object[] objArray = new Object[]{p0,ovi7.getClass()};
       throw new IllegalStateException(String.format("Can\'t create instances of %s from %s", objArray));
    }
    public final vi7 b(Class p0,me4 p1){
       return this.a(p0);
    }
}

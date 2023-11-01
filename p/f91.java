package p.f91;
import p.a02;
import java.lang.Object;
import p.tm5;
import java.lang.IllegalStateException;

public final class f91 implements a02	// class@001580 from classes.dex
{
    public tm5 a;

    public void f91(){
       super();
    }
    public static void a(tm5 p0,tm5 p1){
       if (p0.a != null) {
          throw new IllegalStateException();
       }
       p0.a = p1;
       return;
    }
    public final Object get(){
       f91 ta;
       if ((ta = this.a) != null) {
          return ta.get();
       }
       throw new IllegalStateException();
    }
}

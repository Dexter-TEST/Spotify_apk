package p.fw5;
import java.util.concurrent.atomic.AtomicInteger;
import android.os.Handler;
import p.s9;
import p.hs0;
import java.lang.Object;

public final class fw5	// class@001650 from classes.dex
{
    public final Handler a;
    public final int b;
    public final ir0 c;
    public final ir0 d;
    public static final AtomicInteger e;

    static {
       fw5.e = new AtomicInteger(0);
    }
    public void fw5(Handler p0,s9 p1,hs0 p2){
       this.c = p1;
       this.d = p2;
       super();
       this.a = p0;
       this.b = fw5.e.getAndIncrement();
    }
    public final boolean a(Object p0){
       boolean b = true;
       if (this == p0) {
          return b;
       }
       if (!p0 instanceof fw5) {
          return false;
       }
       if (p0.b != this.b) {
          b = false;
       }
       return b;
    }
    public final boolean equals(Object p0){
       return this.a(p0);
    }
    public final int hashCode(){
       return this.b;
    }
}

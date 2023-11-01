package p.v7;
import p.j65;
import p.rm;
import p.dn3;
import p.mp;
import java.lang.Object;
import io.reactivex.rxjava3.core.Single;
import p.vp;
import p.r45;
import java.lang.IllegalStateException;
import java.lang.Throwable;
import java.lang.String;
import p.yf2;

public final class v7 implements j65	// class@00299c from classes.dex
{
    public final dn3 a;
    public final mp b;
    public static final rm c;

    static {
       v7.c = new rm(15);
    }
    public void v7(dn3 p0,mp p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final Single first(){
       r45 or45 = this.b.a();
       if (!or45.c()) {
          return Single.error(new IllegalStateException());
       }
       return this.a.b(or45.b()).map(v7.c);
    }
    public final Single g(String p0){
       return this.a.a(p0).map(v7.c);
    }
}

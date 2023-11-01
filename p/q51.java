package p.q51;
import p.r51;
import java.lang.Boolean;
import java.text.DateFormat;
import java.util.Date;
import java.lang.Class;
import java.lang.Object;
import p.vf3;
import p.gb6;

public final class q51 extends r51	// class@002332 from classes.dex
{
    public static final q51 x;

    static {
       q51.x = new q51(null, null);
    }
    public void q51(Boolean p0,DateFormat p1){
       super(Date.class, p0, p1);
    }
    public final r51 g(Boolean p0,DateFormat p1){
       return new q51(p0, p1);
    }
    public final void serialize(Object p0,vf3 p1,gb6 p2){
       if (this.e(p2)) {
          long l = (p0 == null)? 0: p0.getTime();
          p1.o0(l);
       }else {
          this.f(p0, p1, p2);
       }
       return;
    }
}

package p.q90;
import p.r51;
import java.lang.Boolean;
import java.text.DateFormat;
import java.util.Calendar;
import java.lang.Class;
import java.lang.Object;
import p.vf3;
import p.gb6;
import java.util.Date;

public final class q90 extends r51	// class@002355 from classes.dex
{
    public static final q90 x;

    static {
       q90.x = new q90(null, null);
    }
    public void q90(Boolean p0,DateFormat p1){
       super(Calendar.class, p0, p1);
    }
    public final r51 g(Boolean p0,DateFormat p1){
       return new q90(p0, p1);
    }
    public final void serialize(Object p0,vf3 p1,gb6 p2){
       if (this.e(p2)) {
          long l = (p0 == null)? 0: p0.getTimeInMillis();
          p1.o0(l);
       }else {
          this.f(p0.getTime(), p1, p2);
       }
       return;
    }
}

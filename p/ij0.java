package p.ij0;
import p.qh3;
import java.util.List;
import p.ph3;
import java.lang.Object;
import java.lang.Integer;
import p.wa4;
import p.b17;
import java.lang.IllegalStateException;
import java.lang.String;

public final class ij0 extends qh3	// class@0019a2 from classes.dex
{

    public void ij0(List p0){
       super(p0);
    }
    public final Object f(ph3 p0,float p1){
       return Integer.valueOf(this.i(p0, p1));
    }
    public final int i(ph3 p0,float p1){
       if (p0.b != null && p0.c != null) {
          return b17.l(p0.b.intValue(), wa4.b(p1, 0, 0x3f800000), p0.c.intValue());
       }
       throw new IllegalStateException("Missing values for keyframe.");
    }
}

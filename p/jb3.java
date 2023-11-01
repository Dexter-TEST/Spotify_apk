package p.jb3;
import p.qh3;
import java.util.List;
import p.ph3;
import java.lang.Object;
import java.lang.Integer;
import p.wa4;
import java.lang.IllegalStateException;
import java.lang.String;

public final class jb3 extends qh3	// class@001aa2 from classes.dex
{

    public void jb3(List p0){
       super(p0);
    }
    public final Object f(ph3 p0,float p1){
       return Integer.valueOf(this.i(p0, p1));
    }
    public final int i(ph3 p0,float p1){
       ph3 b;
       if ((b = p0.b) == null || p0.c == null) {
          throw new IllegalStateException("Missing values for keyframe.");
       }
       if (p0.k == 0x2ec8fb09) {
          p0.k = b.intValue();
       }
       b = p0.k;
       if (p0.l == 0x2ec8fb09) {
          p0.l = p0.c.intValue();
       }
       return (int)((p1 * (float)(p0.l - b)) + (float)b);
    }
}

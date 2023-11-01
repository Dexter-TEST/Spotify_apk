package p.rv5;
import java.lang.Object;
import p.ds2;
import java.lang.Throwable;
import p.oy6;
import com.googlecode.mp4parser.AbstractBox;
import java.lang.RuntimeException;
import java.lang.StringBuilder;
import java.lang.String;
import java.lang.Class;
import p.tp2;

public final class rv5	// class@002568 from classes.dex
{
    public static final Throwable a;
    public static final rv5 b;

    static {
       rv5.b = new rv5();
    }
    public void rv5(){
       super();
    }
    public static rv5 a(){
       rv5 b;
       if ((b = rv5.b) != null) {
          return b;
       }
       throw new ds2(rv5.a);
    }
    public static void b(oy6 p0){
       oy6 c = p0.c;
       if (!c instanceof AbstractBox) {
          throw new RuntimeException(tp2.j(AbstractBox.class, "Only methods in subclasses of ", " can  be annotated with ParseDetail"));
       }
       if (!c.isParsed()) {
          p0.c.parseDetails();
       }
       return;
    }
}

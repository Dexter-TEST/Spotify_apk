package p.w40;
import p.su0;
import java.lang.Object;
import p.fx5;
import p.to4;
import p.dx5;
import p.g70;
import p.u54;
import p.oe0;
import java.nio.charset.Charset;
import java.lang.Class;

public final class w40 implements su0	// class@002ac0 from classes.dex
{
    public Object a;

    public void w40(){
       super();
    }
    public void w40(Object p0){
       this.a = p0;
       super();
    }
    public final Object a(Object p0){
       u54 ou54;
       w40 ta = this.a;
       if (p0.a == null) {
          g70 og70 = p0.y();
          Charset uCharset = ((ou54 = p0.x()) == null)? null: ou54.a(oe0.a);
          if (uCharset == null) {
             uCharset = oe0.a;
          }
          p0.a = new dx5(og70, uCharset);
       }
       ta.getClass();
       ta.getClass();
       throw null;
    }
}

package p.fx5;
import java.io.Closeable;
import java.lang.Object;
import java.lang.String;
import p.g70;
import p.u54;
import p.oe0;
import java.nio.charset.Charset;
import p.we7;
import java.lang.Throwable;
import p.eb3;
import java.io.IOException;
import java.lang.StringBuilder;
import java.lang.Long;
import p.co5;

public abstract class fx5 implements Closeable	// class@001659 from classes.dex
{
    public dx5 a;

    public void fx5(){
       super();
    }
    public final String J(){
       u54 ou54;
       g70 og70 = this.y();
       Charset uCharset = ((ou54 = this.x()) == null)? null: ou54.a(oe0.a);
       if (uCharset == null) {
          uCharset = oe0.a;
       }
       eb3.d(og70, null);
       return og70.c0(we7.s(og70, uCharset));
    }
    public final byte[] b(){
       long l = this.f();
       if ((l - 0x7fffffff) > 0) {
          throw new IOException(co5.K(Long.valueOf(l), "Cannot buffer entire body for content length: "));
       }
       g70 og70 = this.y();
       byte[] uobyteArray = og70.D();
       eb3.d(og70, null);
       int len = uobyteArray.length;
       if ((l - -1) && (l - (long)len)) {
          throw new IOException("Content-Length \("+l+"\) and stream length \("+len+"\) disagree");
       }
       return uobyteArray;
    }
    public void close(){
       we7.d(this.y());
    }
    public abstract long f();
    public abstract u54 x();
    public abstract g70 y();
}

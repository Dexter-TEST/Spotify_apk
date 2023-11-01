package p.dx5;
import java.io.Reader;
import p.g70;
import java.nio.charset.Charset;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.jc7;
import p.nn6;
import java.io.InputStreamReader;
import p.y70;
import p.we7;
import java.io.InputStream;
import java.io.IOException;

public final class dx5 extends Reader	// class@0013d7 from classes.dex
{
    public final g70 a;
    public final Charset b;
    public boolean c;
    public InputStreamReader t;

    public void dx5(g70 p0,Charset p1){
       co5.o(p0, "source");
       co5.o(p1, "charset");
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void close(){
       dx5 tt;
       this.c = true;
       if ((tt = this.t) == null) {
          tt = 0;
       }else {
          tt.close();
          jc7 a = jc7.a;
       }
       if (tt == null) {
          this.a.close();
       }
       return;
    }
    public final int read(char[] p0,int p1,int p2){
       dx5 tt;
       co5.o(p0, "cbuf");
       if (this.c != null) {
          throw new IOException("Stream closed");
       }
       if ((tt = this.t) == null) {
          dx5 ta = this.a;
          y70 oy70 = ta.e0();
          tt = new InputStreamReader(oy70, we7.s(ta, this.b));
          this.t = tt;
       }
       return tt.read(p0, p1, p2);
    }
}

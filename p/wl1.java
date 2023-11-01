package p.wl1;
import java.lang.String;
import java.lang.Object;
import java.nio.charset.StandardCharsets;
import java.nio.charset.Charset;
import java.lang.StringBuilder;
import java.lang.IllegalArgumentException;
import p.dx6;
import p.cx6;

public final class wl1	// class@002b5a from classes.dex
{
    public final String a;
    public dx6 b;
    public final StringBuilder c;
    public int d;
    public int e;
    public cx6 f;
    public int g;

    public void wl1(String p0){
       char c;
       super();
       byte[] bytes = p0.getBytes(StandardCharsets.ISO_8859_1);
       StringBuilder str = new StringBuilder(bytes.length);
       int len = bytes.length;
       int i = 0;
       while (true) {
          if (i < len) {
             int i1 = bytes[i] & 0x00ff;
             if ((c = (char)i1) == '?' && p0.charAt(i) != '?') {
                break ;
             }else {
                str = str.append(c);
                i = i + 1;
             }
          }else {
             this.a = str;
             this.b = dx6.a;
             this.c = new StringBuilder(p0.length());
             this.e = -1;
             return;
          }
       }
       throw new IllegalArgumentException("Message contains characters outside ISO-8859-1 encoding.");
    }
    public final int a(){
       return this.c.length();
    }
    public final char b(){
       return this.a.charAt(this.d);
    }
    public final boolean c(){
       if (this.d < (this.a.length() - this.g)) {
          return true;
       }
       return false;
    }
    public final void d(int p0){
       wl1 tf;
       if ((tf = this.f) == null || p0 > tf.b) {
          this.f = cx6.e(p0, this.b);
       }
       return;
    }
    public final void e(char p0){
       this.c+p0;
    }
}

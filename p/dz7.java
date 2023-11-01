package p.dz7;
import java.io.InputStream;
import java.util.Enumeration;
import java.io.FileInputStream;
import java.lang.Object;
import java.io.File;
import java.lang.Class;
import java.lang.IndexOutOfBoundsException;

public final class dz7 extends InputStream	// class@0013eb from classes.dex
{
    public final Enumeration a;
    public FileInputStream b;

    public void dz7(Enumeration p0){
       super();
       this.a = p0;
       this.b();
    }
    public final void b(){
       dz7 tb;
       if ((tb = this.b) != null) {
          tb.close();
       }
       tb = this.a;
       if (tb.hasMoreElements()) {
          this.b = new FileInputStream(tb.nextElement());
          return;
       }else {
          this.b = null;
          return;
       }
    }
    public final void close(){
       dz7 tb;
       super.close();
       if ((tb = this.b) != null) {
          tb.close();
          this.b = null;
       }
       return;
    }
    public final int read(){
       dz7 tb;
       int i;
       while (true) {
          if ((tb = this.b) == null) {
             return -1;
          }
          if ((i = tb.read()) != -1) {
             break ;
          }else {
             this.b();
          }
       }
       return i;
    }
    public final int read(byte[] p0,int p1,int p2){
       int i;
       if (this.b == null) {
          return -1;
       }
       p0.getClass();
       if (p1 < 0 || (p2 < 0 || p2 > (p0.length - p1))) {
          throw new IndexOutOfBoundsException();
       }
       if (!p2) {
          return 0;
       }
       while (true) {
          if ((i = this.b.read(p0, p1, p2)) > 0) {
             return i;
          }
          this.b();
          if (this.b == null) {
             break ;
          }
       }
       return -1;
    }
}

package p.rn5;
import java.io.InputStream;
import p.tn5;
import p.qn5;
import java.io.RandomAccessFile;
import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.NullPointerException;
import java.lang.String;

public final class rn5 extends InputStream	// class@002521 from classes.dex
{
    public int a;
    public int b;
    public final tn5 c;

    public void rn5(tn5 p0,qn5 p1){
       this.c = p0;
       super();
       this.a = p0.l0((p1.a + 4));
       this.b = p1.b;
    }
    public final int read(){
       if (this.b == null) {
          return -1;
       }
       rn5 tc = this.c;
       tc.a.seek((long)this.a);
       this.a = tc.l0((this.a + 1));
       this.b = this.b - 1;
       return tc.a.read();
    }
    public final int read(byte[] p0,int p1,int p2){
       rn5 tb;
       rn5 orn5;
       if (p0 == null) {
          throw new NullPointerException("buffer");
       }
       if (((p1 | p2)) < 0 || p2 > (p0.length - p1)) {
          throw new ArrayIndexOutOfBoundsException();
       }
       if ((tb = this.b) <= null) {
          return -1;
       }
       if (p2 > tb) {
          orn5 = tb;
       }
       rn5 tc = this.c;
       tc.i0(this.a, p1, orn5, p0);
       this.a = tc.l0((this.a + orn5));
       this.b = this.b - orn5;
       return orn5;
    }
}

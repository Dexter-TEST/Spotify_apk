package p.fx1;
import p.bx1;
import java.io.InputStream;
import java.lang.IllegalArgumentException;
import java.lang.String;

public final class fx1 extends bx1	// class@001655 from classes.dex
{

    public void fx1(InputStream p0){
       super(p0);
       if (!p0.markSupported()) {
          throw new IllegalArgumentException("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
       }
       this.a.mark(Integer.MAX_VALUE);
       return;
    }
    public void fx1(byte[] p0){
       super(p0);
       this.a.mark(Integer.MAX_VALUE);
    }
    public final void f(long p0){
       bx1 tc = this.c;
       if (((long)tc - p0) > 0) {
          this.c = 0;
          this.a.reset();
       }else {
          p0 = p0 - (long)tc;
       }
       this.b((int)p0);
       return;
    }
}

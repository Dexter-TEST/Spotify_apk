package p.cg0;
import java.io.FilterInputStream;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.Class;
import java.lang.Object;
import java.lang.IndexOutOfBoundsException;

public final class cg0 extends FilterInputStream	// class@0011fd from classes.dex
{
    public int a;
    public int b;

    public void cg0(ByteArrayInputStream p0){
       super(p0);
       this.a = -1;
       this.b = -1;
    }
    public final boolean markSupported(){
       return false;
    }
    public final int read(){
       int i;
       if ((i = super.read()) == 3 && (this.a == null && this.b == null)) {
          this.a = -1;
          this.b = -1;
          i = super.read();
       }
       this.a = this.b;
       this.b = i;
       return i;
    }
    public final int read(byte[] p0,int p1,int p2){
       int i;
       int i1;
       p0.getClass();
       if (p1 < 0 || (p2 < 0 || p2 > (p0.length - p1))) {
          throw new IndexOutOfBoundsException();
       }
       if (!p2) {
          return 0;
       }
       if ((i = this.read()) == -1) {
          return -1;
       }
       p0[p1] = (byte)i;
       try{
          for (i = 1; i < p2 && (i1 = this.read()) != -1; i = i + 1) {
             int i2 = p1 + i;
             p0[i2] = (byte)i1;
          }
          return i;
       }catch(java.io.IOException e0){
       }
    }
}

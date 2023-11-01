package p.hx1;
import java.io.InputStream;

public final class hx1 extends InputStream	// class@0018dc from classes.dex
{
    public final InputStream a;
    public int b;

    public void hx1(InputStream p0){
       super();
       this.a = p0;
       this.b = 0x40000000;
    }
    public final int available(){
       return this.b;
    }
    public final void close(){
       this.a.close();
    }
    public final int read(){
       int i;
       if ((i = this.a.read()) == -1) {
          this.b = 0;
       }
       return i;
    }
    public final int read(byte[] p0){
       int i;
       if ((i = this.a.read(p0)) == -1) {
          this.b = 0;
       }
       return i;
    }
    public final int read(byte[] p0,int p1,int p2){
       int i;
       if ((i = this.a.read(p0, p1, p2)) == -1) {
          this.b = 0;
       }
       return i;
    }
    public final long skip(long p0){
       return this.a.skip(p0);
    }
}

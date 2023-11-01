package p.ex7;
import java.io.InputStream;
import java.io.FileInputStream;
import java.lang.Math;

public final class ex7 extends InputStream	// class@00151b from classes.dex
{
    public final InputStream a;
    public long b;

    public void ex7(FileInputStream p0,long p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void close(){
       super.close();
       this.a.close();
       this.b = 0;
    }
    public final int read(){
       ex7 tb = this.b;
       if ((tb) <= 0) {
          return -1;
       }
       this.b = tb - 1;
       return this.a.read();
    }
    public final int read(byte[] p0,int p1,int p2){
       int i;
       ex7 tb = this.b;
       if ((tb) <= 0) {
          return -1;
       }
       if ((i = this.a.read(p0, p1, (int)Math.min((long)p2, tb))) != -1) {
          this.b = this.b - (long)i;
       }
       return i;
    }
}

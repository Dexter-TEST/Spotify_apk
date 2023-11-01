package p.rx0;
import java.io.FilterInputStream;
import java.io.InputStream;

public final class rx0 extends FilterInputStream	// class@000325 from classes2.dex
{

    public void rx0(InputStream p0){
       super(p0);
    }
    public final int read(){
       return this.in.read();
    }
    public final int read(byte[] p0){
       return this.read(p0, 0, p0.length);
    }
    public final int read(byte[] p0,int p1,int p2){
       if (!p2) {
          return 0;
       }
       return this.in.read(p0, p1, p2);
    }
}

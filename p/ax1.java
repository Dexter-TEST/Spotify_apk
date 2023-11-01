package p.ax1;
import android.media.MediaDataSource;
import p.fx1;
import p.bx1;

public final class ax1 extends MediaDataSource	// class@00100c from classes.dex
{
    public long a;
    public final fx1 b;

    public void ax1(fx1 p0){
       this.b = p0;
       super();
    }
    public final void close(){
    }
    public final long getSize(){
       return -1;
    }
    public final int readAt(long p0,byte[] p1,int p2,int p3){
       if (!p3) {
          return 0;
       }
       int i = 0;
       if ((p0 - i) < 0) {
          return -1;
       }
       try{
          ax1 ta = this.a;
          if (ta - p0) {
             if ((ta - i) >= 0 && (p0 - (ta + (long)this.b.available())) >= 0) {
                return -1;
             }else {
                this.b.f(p0);
                this.a = p0;
             }
          }
          if (p3 > this.b.available()) {
             p3 = this.b.available();
          }
          if ((i = this.b.read(p1, p2, p3)) >= 0) {
             this.a = this.a + (long)i;
             return i;
          }else {
             this.a = -1;
             return -1;
          }
       }catch(java.io.IOException e0){
       }
    }
}

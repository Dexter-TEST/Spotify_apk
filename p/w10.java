package p.w10;
import java.nio.ByteBuffer;
import java.lang.Object;
import java.nio.Buffer;

public final class w10	// class@002aa4 from classes.dex
{
    public final int a;
    public int b;
    public final ByteBuffer c;

    public void w10(ByteBuffer p0){
       super();
       this.b = 0;
       this.c = p0;
       this.a = p0.position();
    }
    public final void a(int p0,int p1){
       int b;
       w10 tb = this.b;
       int i = (tb % 8) - 8;
       w10 ta = this.a;
       w10 tc = this.c;
       int i1 = 1;
       if (p1 <= i) {
          if ((b = tc.get(((tb / 8) + ta))) < 0) {
             b = b + 256;
          }
          b = b + (p0 << (i - p1));
          p0 = (this.b / 8) + ta;
          if (b > 127) {
             b = b - 256;
          }
          tc.put(p0, (byte)b);
          this.b = this.b + p1;
       }else {
          p1 = p1 - i;
          this.a((p0 >> p1), i);
          this.a((p0 & ((i1 << p1) - i1)), p1);
       }
       w10 tb1 = this.b;
       p1 = (tb1 / 8) + ta;
       if (((tb1 % 8)) <= 0) {
          i1 = 0;
       }
       tc.position((p1 + i1));
       return;
    }
}

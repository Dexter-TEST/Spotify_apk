package p.oz6;
import java.lang.Object;
import p.gg1;
import java.nio.ByteBuffer;

public abstract class oz6	// class@0021bf from classes.dex
{
    public int a;
    public ByteBuffer b;
    public int c;
    public int d;

    public void oz6(){
       super();
       if (gg1.a == null) {
          gg1.a = new gg1();
       }
       return;
    }
    public final int a(int p0){
       short shortx = (p0 < this.d)? this.b.getShort((this.c + p0)): 0;
       return shortx;
    }
    public final void b(ByteBuffer p0,int p1){
       this.b = p0;
       if (p0 != null) {
          this.a = p1;
          p1 = p1 - p0.getInt(p1);
          this.c = p1;
          this.d = this.b.getShort(p1);
       }else {
          this.a = 0;
          this.c = 0;
          this.d = 0;
       }
       return;
    }
}

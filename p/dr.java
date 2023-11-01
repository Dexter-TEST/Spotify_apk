package p.dr;
import java.lang.Object;
import p.yl3;

public final class dr	// class@0013a4 from classes.dex
{
    public int a;
    public int b;
    public float c;
    public float d;
    public long e;
    public long f;
    public long g;
    public float h;
    public int i;

    public void dr(){
       super();
       this.e = Long.MIN_VALUE;
       this.g = -1;
       this.f = 0;
    }
    public final float a(long p0){
       dr te = this.e;
       if ((p0 - te) < 0) {
          return 0;
       }
       dr tg = this.g;
       if ((tg) < 0 || (p0 - tg) < 0) {
          return (yl3.b(((float)(p0 - te) / (float)this.a), 0, 0x3f800000) * 0x3f000000);
       }
       te = this.h;
       return ((yl3.b(((float)(p0 - tg) / (float)this.i), 0, 0x3f800000) * te) + (0x3f800000 - te));
    }
}

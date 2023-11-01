package p.oi2;
import java.lang.Object;
import p.pi2;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.Integer;
import p.tp2;

public final class oi2	// class@002126 from classes.dex
{
    public final int[] a;
    public final int[] b;
    public final pi2 c;
    public final int d;
    public final int e;
    public final int f;
    public static final oi2 g;
    public static final oi2 h;
    public static final oi2 i;
    public static final oi2 j;
    public static final oi2 k;
    public static final oi2 l;

    static {
       oi2.g = new oi2(4201, 4096, 1);
       oi2.h = new oi2(1033, 1024, 1);
       oi2.i = new oi2(67, 64, 1);
       oi2.j = new oi2(19, 16, 1);
       oi2.k = new oi2(285, 256, 0);
       oi2.l = new oi2(301, 256, 1);
    }
    public void oi2(int p0,int p1,int p2){
       super();
       this.e = p0;
       this.d = p1;
       this.f = p2;
       int[] ointArray = new int[p1];
       this.a = ointArray;
       ointArray = new int[p1];
       this.b = ointArray;
       int i = 0;
       int i1 = 1;
       while (i < p1) {
          this.a[i] = i1;
          if ((i1 = i1 << 1) >= p1) {
             i1 = i1 ^ p0;
             int i2 = p1 - 1;
             i1 = i1 & i2;
          }
          i = i + 1;
       }
       p0 = 0;
       while (true) {
          i = p1 - 1;
          if (p0 < i) {
             this.b[this.a[p0]] = p0;
             p0++;
          }else {
             break ;
          }
       }
       int[] ointArray1 = new int[]{0};
       this.c = new pi2(this, ointArray1);
       ointArray1 = new int[]{1};
       pi2 opi2 = new pi2(this, ointArray1);
       return;
    }
    public final int a(int p0,int p1){
       if (!p0 || !p1) {
          return 0;
       }
       oi2 tb = this.b;
       return this.a[((tb[p0] + tb[p1]) % (this.d - 1))];
    }
    public final String toString(){
       return tp2.n("GF\(0x"+Integer.toHexString(this.e)+',', this.d, ')');
    }
}

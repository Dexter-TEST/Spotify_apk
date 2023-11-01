package p.qc6;
import java.lang.Object;
import java.lang.String;
import p.co5;

public final class qc6	// class@00030f from classes2.dex
{
    public int a;
    public final int[] b;

    public void qc6(){
       super();
       int[] ointArray = new int[10];
       this.b = ointArray;
    }
    public final int a(){
       int i = ((this.a & 0x0080))? this.b[7]: 0xffff;
       return i;
    }
    public final void b(qc6 p0){
       co5.o(p0, "other");
       int i = 0;
       while (i < 10) {
          int i1 = i + 1;
          int i2 = 1;
          int i3 = i2 << i;
          if (!(i3 = i3 & p0.a)) {
             i2 = 0;
          }
          if (i2) {
             this.c(i, p0.b[i]);
          }
          i = i1;
       }
       return;
    }
    public final void c(int p0,int p1){
       if (p0 >= 0) {
          qc6 tb = this.b;
          if (p0 < tb.length) {
             this.a = (1 << p0) | this.a;
             tb[p0] = p1;
          }
       }
       return;
    }
}

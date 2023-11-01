package p.r80;
import java.io.InputStream;
import java.lang.Object;
import p.r8;
import java.lang.String;
import java.lang.IllegalArgumentException;
import java.lang.StringBuilder;

public final class r80	// class@002494 from classes.dex
{
    public final InputStream a;
    public int b;
    public int c;
    public int d;
    public final r8 e;
    public static int f;

    public void r80(InputStream p0){
       super();
       this.e = new r8(50, 8);
       this.a = p0;
       this.b = p0.read();
       this.c = p0.read();
    }
    public final int a(){
       int i = -1;
       if (this.d == 8) {
          this.b = this.c;
          this.c = this.a.read();
          this.d = 0;
          if (this.b == i) {
          label_0048 :
             return i;
          }
       }
       r80 td = this.d;
       int i1 = (this.b >> (td - 7)) & 0x01;
       this.d = td + 1;
       char c = (!i1)? '0': '1';
       r80 te = this.e;
       r8 b = te.b;
       r8 c1 = te.c;
       if (b < (c1.length + i)) {
          c1[b] = c;
          te.b = b + 1;
       }
       r80.f = r80.f + 1;
       i = i1;
       goto label_0048 ;
    }
    public final boolean b(String p0){
       boolean b = (!this.a())? false: true;
       String str = (b)? "1": "0";
       this.g(p0, str);
       return b;
    }
    public final long c(int p0){
       if (p0 > 64) {
          throw new IllegalArgumentException("Can not readByte more then 64 bit");
       }
       long l = 0;
       for (int i = 0; i < p0; i = i + 1) {
          l = l << 1;
          l = l | (long)this.a();
       }
       return l;
    }
    public final long d(int p0,String p1){
       long l = this.c(p0);
       this.g(p1, String.valueOf(l));
       return l;
    }
    public final int e(String p0){
       int i = 0;
       int i1 = 0;
       while (!this.a()) {
          i1 = i1 + 1;
       }
       if (i1 > 0) {
          i = (int)((long)((1 << i1) - 1) + this.c(i1));
       }
       i1 = i & 0x01;
       i = ((i >> 1) + i1) * ((i1 << 1) - 1);
       this.g(p0, String.valueOf(i));
       return i;
    }
    public final int f(String p0){
       int i = 0;
       int i1 = 0;
       while (!this.a()) {
          i1 = i1 + 1;
       }
       if (i1 > 0) {
          i = (int)((long)((1 << i1) - 1) + this.c(i1));
       }
       this.g(p0, String.valueOf(i));
       return i;
    }
    public final void g(String p0,String p1){
       r80 te = this.e;
       String str = String.valueOf((r80.f - te.b));
       int i = str.length() - 8;
       StringBuilder str1 = "@".concat(str);
       for (int i1 = 0; i1 < i; i1 = i1 + 1) {
          str1 = str1.append(' ');
       }
       str1 = str1+p0;
       int i2 = (str1.length() - 100) - te.b;
       for (int i3 = 0; i3 < i2; i3++) {
          str1 = str1.append(' ');
       }
       str1+te+" \("+p1+"\)";
       te.b = 0;
       return;
    }
}

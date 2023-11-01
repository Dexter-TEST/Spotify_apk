package p.j32;
import p.nn6;
import p.xg3;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.b57;
import p.e70;
import java.lang.Class;
import p.u96;
import java.lang.Math;
import java.io.RandomAccessFile;
import p.x96;
import p.kg4;
import java.lang.IllegalArgumentException;
import java.lang.IllegalStateException;

public final class j32 implements nn6	// class@000251 from classes2.dex
{
    public final xg3 a;
    public long b;
    public boolean c;

    public void j32(xg3 p0,long p1){
       co5.o(p0, "fileHandle");
       super();
       this.a = p0;
       this.b = p1;
    }
    public final void close(){
       if (this.c != null) {
          return;
       }
       this.c = true;
       j32 ta = this.a;
       _monitor_enter(ta);
       j32 ta1 = this.a;
       int i = ta1.b - 1;
       ta1.b = i;
       if (!i && ta1.a != null) {
          _monitor_exit(ta);
          ta1.f();
          return;
       }else {
          _monitor_exit(ta);
          return;
       }
    }
    public final b57 e(){
       return b57.d;
    }
    public final long o(e70 p0,long p1){
       j32 oj32 = this;
       long l = p0;
       long l1 = p1;
       co5.o(l, "sink");
       int i = 1;
       if (!((oj32.c ^ i))) {
          throw new IllegalStateException("closed".toString());
       }
       j32 a = oj32.a;
       j32 b = oj32.b;
       a.getClass();
       int i1 = ((l1) >= 0)? 1: 0;
       if (i1) {
          l1 = l1 + b;
          j32 oj321 = b;
          while (true) {
             if ((oj321 - l1) < 0) {
                u96 ou96 = l.t0(i);
                u96 a1 = ou96.a;
                u96 c = ou96.c;
                long l2 = l1 - oj321;
                int i2 = c - 8192;
                int i3 = (int)Math.min(l2, (long)i2);
                _monitor_enter(a);
                co5.o(a1, "array");
                a.c.seek(oj321);
                int i4 = 0;
                while (true) {
                   if (i4 < i3) {
                      i2 = i3 - i4;
                      if ((i2 = a.c.read(a1, c, i2)) == -1) {
                         if (!i4) {
                            _monitor_exit(a);
                            i4 = -1;
                            break ;
                         }else {
                         label_005b :
                            _monitor_exit(a);
                            break ;
                         }
                      }else {
                         i4 = i4 + i2;
                      }
                   }else {
                      goto label_005b ;
                   }
                }
                if (i4 == -1) {
                   if (ou96.b == ou96.c) {
                      l.a = ou96.a();
                      x96.a(ou96);
                   }
                   if (!(b - oj321)) {
                      l1 = -1;
                   }else {
                   label_0086 :
                      l1 = oj321 - b;
                   }
                }else {
                   int i5 = ou96.c + i4;
                   ou96.c = i5;
                   long l3 = (long)i4;
                   oj321 = oj321 + l3;
                   l2 = l.b + l3;
                   l.b = l2;
                   i = 1;
                }
             }else {
                goto label_0086 ;
             }
          }
          if (l1 - -1) {
             oj32.b = oj32.b + l1;
          }
          return l1;
       }else {
          throw new IllegalArgumentException(kg4.k("byteCount < 0: ", l1).toString());
       }
    }
}

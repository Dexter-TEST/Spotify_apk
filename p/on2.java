package p.on2;
import p.nn6;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.hp5;
import java.util.zip.Inflater;
import p.i93;
import java.util.zip.CRC32;
import java.io.IOException;
import java.lang.Integer;
import p.kg4;
import p.b57;
import p.e70;
import p.u96;
import java.lang.Math;
import java.io.EOFException;
import java.lang.IllegalArgumentException;

public final class on2 implements nn6	// class@0002e5 from classes2.dex
{
    public byte a;
    public final hp5 b;
    public final Inflater c;
    public final i93 t;
    public final CRC32 v;

    public void on2(nn6 p0){
       co5.o(p0, "source");
       super();
       hp5 ohp5 = new hp5(p0);
       this.b = ohp5;
       Inflater inflater = new Inflater(true);
       this.c = inflater;
       this.t = new i93(ohp5, inflater);
       this.v = new CRC32();
    }
    public static void b(String p0,int p1,int p2){
       if (p2 == p1) {
          return;
       }
       Object[] objArray = new Object[]{p0,Integer.valueOf(p2),Integer.valueOf(p1)};
       throw new IOException(kg4.q(objArray, 3, "%s: actual 0x%08x != expected 0x%08x", "format\(this, *args\)"));
    }
    public final void close(){
       this.t.close();
    }
    public final b57 e(){
       return this.b.e();
    }
    public final void f(long p0,long p1,e70 p2){
       p2 = p2.a;
       co5.i(p2);
       while (true) {
          u96 c = p2.c;
          u96 b = p2.b;
          int i = c - b;
          if ((p0 - (long)i) >= 0) {
             int i1 = c - b;
             p0 = p0 - (long)i1;
             u96 f = p2.f;
             co5.i(f);
          }else {
             break ;
          }
       }
       while ((p1) > 0) {
          long l = (long)p2.b + p0;
          int i2 = (int)l;
          int i3 = p2.c - i2;
          i3 = (int)Math.min((long)i3, p1);
          this.v.update(p2.a, i2, i3);
          p1 = p1 - (long)i3;
          co5.i(p2.f);
          i2 = 0;
       }
       return;
    }
    public final long o(e70 p0,long p1){
       on2 oon22;
       on2 oon2 = this;
       Object obj = p0;
       long l = p1;
       co5.o(obj, "sink");
       long l1 = 0;
       int i = ((v2 = l - l1) >= 0)? 1: 0;
       if (i) {
          if (!v2) {
             return l1;
          }else {
             on2 v = oon2.v;
             int i1 = -1;
             on2 b = oon2.b;
             if (oon2.a == null) {
                b.V(10);
                hp5 b1 = b.b;
                byte b2 = b1.h0(3);
                int i2 = ((((b2 >> 1) & 1)) == 1)? 1: 0;
                if (i2) {
                   this.f(0, 10, b.b);
                }
                on2.b("ID1ID2", 8075, b.readShort());
                b.skip(8);
                l1 = ((((b2 >> 2) & 1)) == 1)? 1: 0;
                if (l1) {
                   b.V(2);
                   if (i2) {
                      this.f(0, 2, b.b);
                   }
                   long l2 = (long)b1.o0();
                   b.V(l2);
                   if (i2) {
                      this.f(0, l2, b.b);
                      l1 = l2;
                   }else {
                      l1 = l2;
                   }
                   b.skip(l1);
                }
                l1 = ((((b2 >> 3) & 1)) == 1)? 1: 0;
                if (l1) {
                   on2 oon21 = b;
                   long l3 = b.b(0, 0, Long.MAX_VALUE);
                   if (l3 - i1) {
                      if (i2) {
                         oon22 = oon21;
                         this.f(0, (l3 + 1), oon21.b);
                      }else {
                         oon22 = oon21;
                      }
                      oon22.skip((l3 + 1));
                   }else {
                      throw new EOFException();
                   }
                }else {
                   oon22 = b;
                }
                l1 = ((((b2 >> 4) & 1)) == 1)? 1: 0;
                if (l1) {
                   long l4 = oon22.b(0, 0, Long.MAX_VALUE);
                   if (l4 - -1) {
                      if (i2) {
                         this.f(0, (l4 + 1), oon22.b);
                      }
                      oon22.skip((l4 + 1));
                   }else {
                      throw new EOFException();
                   }
                }
                if (i2) {
                   on2.b("FHCRC", oon22.x(), (short)(int)v.getValue());
                   v.reset();
                }
                oon2.a = 1;
             }else {
                oon22 = b;
             }
             byte b3 = 2;
             if (oon2.a == 1) {
                e70 b4 = obj.b;
                l = oon2.t.o(obj, l);
                if (l - -1) {
                   this.f(b4, l, p0);
                   return l;
                }else {
                   oon2.a = b3;
                }
             }
             if (oon2.a == b3) {
                on2.b("CRC", oon22.E(), (int)v.getValue());
                on2.b("ISIZE", oon22.E(), (int)oon2.c.getBytesWritten());
                oon2.a = 3;
                if (!oon22.F()) {
                   throw new IOException("gzip finished without exhausting source");
                }
             }
             return -1;
          }
       }else {
          throw new IllegalArgumentException(kg4.k("byteCount < 0: ", l).toString());
       }
    }
}

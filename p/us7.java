package p.us7;
import p.c42;
import p.m95;
import java.lang.String;
import p.ir2;
import p.yg3;
import java.util.LinkedHashMap;
import p.el6;
import java.io.IOException;
import java.lang.Object;
import p.co5;
import java.util.List;
import java.lang.Class;
import p.at7;
import java.util.Map;
import p.ts7;
import java.lang.Iterable;
import p.dj0;
import java.lang.StringBuilder;
import p.i51;
import java.lang.Long;
import p.xg3;
import p.j32;
import p.nn6;
import p.hp5;
import p.xe7;
import java.lang.Throwable;
import p.io2;
import p.ej4;
import java.lang.UnsupportedOperationException;
import p.k52;
import p.i93;
import java.util.zip.Inflater;
import java.io.FileNotFoundException;

public final class us7 extends c42	// class@000374 from classes2.dex
{
    public final m95 b;
    public final c42 c;
    public final Map d;
    public static final m95 e;

    static {
       us7.e = ir2.u("/", false);
    }
    public void us7(m95 p0,yg3 p1,LinkedHashMap p2){
       super();
       this.b = p0;
       this.c = p1;
       this.d = p2;
    }
    public final el6 a(m95 p0){
       throw new IOException("zip file systems are read-only");
    }
    public final void b(m95 p0,m95 p1){
       co5.o(p0, "source");
       co5.o(p1, "target");
       throw new IOException("zip file systems are read-only");
    }
    public final void c(m95 p0){
       throw new IOException("zip file systems are read-only");
    }
    public final void d(m95 p0){
       co5.o(p0, "path");
       throw new IOException("zip file systems are read-only");
    }
    public final List g(m95 p0){
       ts7 ots7;
       co5.o(p0, "dir");
       m95 e = us7.e;
       e.getClass();
       if ((ots7 = this.d.get(at7.b(e, p0, true))) != null) {
          return dj0.B0(ots7.h);
       }
       throw new IOException("not a directory: "+p0);
    }
    public final i51 i(m95 p0){
       ts7 ots7;
       co5.o(p0, "path");
       m95 e = us7.e;
       e.getClass();
       p0 = at7.b(e, p0, true);
       if ((ots7 = this.d.get(p0)) == null) {
          return null;
       }
       ts7 b = ots7.b;
       int i = b ^ 0x01;
       i51 oi51 = (b != null)? null: Long.valueOf(ots7.d);
       i51 v9 = new i51(i, b, null, oi51, null, ots7.f, null);
       b = ots7.g;
       if (!(b - -1)) {
          return v9;
       }else {
          xg3 oxg3 = this.c.j(this.b);
          hp5 ohp5 = xe7.f(oxg3.y(b));
          if (oxg3 != null) {
             oxg3.b();
          }
          if (null == null) {
             co5.i(ohp5);
             i51 oi511 = ej4.I0(ohp5, v9);
             co5.i(oi511);
             return oi511;
          }else {
             throw null;
          }
       }
    }
    public final xg3 j(m95 p0){
       co5.o(p0, "file");
       throw new UnsupportedOperationException("not implemented yet!");
    }
    public final el6 k(m95 p0){
       co5.o(p0, "file");
       throw new IOException("zip file systems are read-only");
    }
    public final nn6 l(m95 p0){
       ts7 ots7;
       co5.o(p0, "file");
       m95 e = us7.e;
       e.getClass();
       boolean b = true;
       if ((ots7 = this.d.get(at7.b(e, p0, b))) == null) {
          throw new FileNotFoundException("no such file: "+p0);
       }
       xg3 oxg3 = this.c.j(this.b);
       i51 oi51 = null;
       hp5 ohp5 = xe7.f(oxg3.y(ots7.g));
       nn6 onn6 = oi51;
       if (oxg3 != null) {
          oxg3.b();
       }
       if (!onn6) {
          co5.i(ohp5);
          ej4.I0(ohp5, oi51);
          ts7 d = ots7.d;
          k52 ok52 = (ots7.e == null)? new k52(ohp5, d, b): new k52(new i93(xe7.f(new k52(ohp5, ots7.c, b)), new Inflater(b)), d, false);
          return ok52;
       }else {
          throw onn6;
       }
    }
}

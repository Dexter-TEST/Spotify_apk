package p.je4;
import p.fv5;
import p.u54;
import java.lang.String;
import p.gg1;
import p.j80;
import java.util.List;
import java.lang.Object;
import p.co5;
import java.lang.StringBuilder;
import p.f70;
import p.e70;
import p.ie4;
import p.mp2;

public final class je4 extends fv5	// class@001abd from classes.dex
{
    public final j80 a;
    public final List b;
    public final u54 c;
    public long d;
    public static final u54 e;
    public static final u54 f;
    public static final byte[] g;
    public static final byte[] h;
    public static final byte[] i;

    static {
       je4.e = gg1.C("multipart/mixed");
       gg1.C("multipart/alternative");
       gg1.C("multipart/digest");
       gg1.C("multipart/parallel");
       je4.f = gg1.C("multipart/form-data");
       je4.g = new byte[2]{':',0x20};
       je4.h = new byte[2]{0x0d,0x0a};
       je4.i = new byte[2]{'-','-'};
    }
    public void je4(j80 p0,u54 p1,List p2){
       co5.o(p0, "boundaryByteString");
       co5.o(p1, "type");
       super();
       this.a = p0;
       this.b = p2;
       this.c = gg1.C(p1+"; boundary="+p0.q());
       this.d = -1;
    }
    public final long a(){
       je4 td = this.d;
       if (!(td - -1)) {
          td = this.e(null, true);
          this.d = td;
       }
       return td;
    }
    public final u54 b(){
       return this.c;
    }
    public final void d(f70 p0){
       this.e(p0, false);
    }
    public final long e(f70 p0,boolean p1){
       e70 uoe70;
       e70 uoe701;
       u54 ou54;
       je4 oje4 = this;
       if (p1) {
          uoe70 = new e70();
          uoe701 = uoe70;
       }else {
          uoe701 = null;
          uoe70 = p0;
       }
       je4 b = oje4.b;
       int i = b.size();
       long l = 0;
       int i1 = 0;
       while (true) {
          je4 a = oje4.a;
          byte[] i2 = je4.i;
          byte[] h = je4.h;
          if (i1 < i) {
             int i3 = i1 + 1;
             ie4 oie4 = b.get(i1);
             ie4 a1 = oie4.a;
             co5.i(uoe70);
             uoe70.write(i2);
             uoe70.v(a);
             uoe70.write(h);
             if (a1 != null) {
                int i4 = a1.a.length / 2;
                for (int i5 = 0; i5 < i4; i5 = i6) {
                   int i6 = i5 + 1;
                   uoe70.W(a1.c(i5)).write(je4.g).W(a1.g(i5)).write(h);
                }
             }
             ie4 b1 = oie4.b;
             if ((ou54 = b1.b()) != null) {
                uoe70.W("Content-Type: ").W(ou54.a).write(h);
             }
             long l1 = b1.a();
             long l2 = -1;
             if (l1 - l2) {
                uoe70.W("Content-Length: ").X(l1).write(h);
             }else if(p1){
                co5.i(uoe701);
                uoe701.f();
                return l2;
             }
             uoe70.write(h);
             if (p1) {
                l = l + l1;
             }else {
                b1.d(uoe70);
             }
             uoe70.write(h);
             i1 = i3;
          }else {
             co5.i(uoe70);
             uoe70.write(i2);
             uoe70.v(a);
             uoe70.write(i2);
             uoe70.write(h);
             if (p1) {
                co5.i(uoe701);
                l = l + uoe701.b;
                uoe701.f();
                break ;
             }
             break ;
          }
       }
       return l;
    }
}

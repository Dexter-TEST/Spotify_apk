package p.u96;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.uk;
import java.lang.IllegalArgumentException;
import java.lang.IllegalStateException;

public final class u96	// class@000365 from classes2.dex
{
    public final byte[] a;
    public int b;
    public int c;
    public boolean d;
    public final boolean e;
    public u96 f;
    public u96 g;

    public void u96(){
       super();
       byte[] uobyteArray = new byte[8192];
       this.a = uobyteArray;
       this.e = true;
       this.d = false;
    }
    public void u96(byte[] p0,int p1,int p2,boolean p3){
       co5.o(p0, "data");
       super();
       this.a = p0;
       this.b = p1;
       this.c = p2;
       this.d = p3;
       this.e = false;
    }
    public final u96 a(){
       u96 tf;
       if ((tf = this.f) != this) {
       }else {
          tf = null;
       }
       u96 tg = this.g;
       co5.i(tg);
       tg.f = this.f;
       tg = this.f;
       co5.i(tg);
       tg.g = this.g;
       this.f = null;
       this.g = null;
       return tf;
    }
    public final void b(u96 p0){
       p0.g = this;
       p0.f = this.f;
       u96 tf = this.f;
       co5.i(tf);
       tf.g = p0;
       this.f = p0;
    }
    public final u96 c(){
       this.d = true;
       return new u96(this.a, this.b, this.c, true);
    }
    public final void d(u96 p0,int p1){
       if (p0.e == null) {
          throw new IllegalStateException("only owner can write".toString());
       }
       u96 c = p0.c;
       int i = c + p1;
       u96 a = p0.a;
       int i1 = 8192;
       if (i > i1) {
          if (p0.d == null) {
             u96 b = p0.b;
             if (((i - b)) <= i1) {
                i = 0;
                uk.j0(i, b, c, a, a);
                p0.c = p0.c - p0.b;
                p0.b = i;
             }else {
                throw new IllegalArgumentException();
             }
          }else {
             throw new IllegalArgumentException();
          }
       }
       u96 tb = this.b;
       uk.j0(p0.c, tb, (tb + p1), this.a, a);
       p0.c = p0.c + p1;
       this.b = this.b + p1;
       return;
    }
}

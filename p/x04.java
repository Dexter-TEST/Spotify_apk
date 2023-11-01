package p.x04;
import java.util.Iterator;
import p.ch3;
import p.z04;
import p.a14;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.util.NoSuchElementException;
import p.y04;

public final class x04 extends z04 implements Iterator, ch3	// class@002be1 from classes.dex
{
    public final int t;

    public void x04(a14 p0,int p1){
       this.t = p1;
       if (p1 != 1) {
          if (p1 != 2) {
             co5.o(p0, "map");
             super(p0);
             return;
          }else {
             co5.o(p0, "map");
             super(p0);
             return;
          }
       }else {
          co5.o(p0, "map");
          super(p0);
          return;
       }
    }
    public final Object next(){
       z04 ta;
       z04 tc = this.c;
       switch (this.t){
           case 0:
             break;
           case 1:
             if ((ta = this.a) >= tc.w) {
                throw new NoSuchElementException();
             }
             this.a = ta + 1;
             this.b = ta;
             this.a();
             return tc.a[ta];
             break;
           default:
             if ((ta = this.a) >= tc.w) {
                throw new NoSuchElementException();
             }
             this.a = ta + 1;
             this.b = ta;
             a14 b = tc.b;
             co5.i(b);
             this.a();
             return b[this.b];
       }
       if ((ta = this.a) >= tc.w) {
          throw new NoSuchElementException();
       }
       this.a = ta + 1;
       this.b = ta;
       this.a();
       return new y04(tc, ta);
    }
}

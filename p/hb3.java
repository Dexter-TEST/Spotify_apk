package p.hb3;
import java.util.Iterator;
import p.ch3;
import java.lang.Object;
import java.lang.Integer;
import java.lang.UnsupportedOperationException;
import java.lang.String;
import java.util.NoSuchElementException;

public final class hb3 implements Iterator, ch3	// class@00181a from classes.dex
{
    public final int a;
    public final int b;
    public boolean c;
    public int t;

    public void hb3(int p0,int p1,int p2){
       super();
       this.a = p2;
       this.b = p1;
       boolean b = true;
       if (p2 > 0) {
          if (p0 > p1) {
             b = false;
          }
       }else if(p0 >= p1){
       }
       this.c = b;
       if (!b) {
          p0 = p1;
       }
       this.t = p0;
       return;
    }
    public final Object a(){
       return Integer.valueOf(this.nextInt());
    }
    public final void b(){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
    public final boolean hasNext(){
       return this.c;
    }
    public final Object next(){
       return this.a();
    }
    public final int nextInt(){
       hb3 tt;
       if ((tt = this.t) == this.b) {
          if (this.c != null) {
             this.c = false;
          }else {
             throw new NoSuchElementException();
          }
       }else {
          this.t = this.a + tt;
       }
       return tt;
    }
    public final void remove(){
       this.b();
       throw null;
    }
}

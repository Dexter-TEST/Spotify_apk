package p.lv3;
import java.util.Iterator;
import p.ch3;
import java.lang.Object;
import java.util.NoSuchElementException;
import java.lang.Long;
import java.lang.UnsupportedOperationException;
import java.lang.String;

public final class lv3 implements Iterator, ch3	// class@001dce from classes.dex
{
    public final long a;
    public final long b;
    public boolean c;
    public long t;

    public void lv3(long p0,long p1,long p2){
       super();
       this.a = p2;
       this.b = p1;
       boolean b = true;
       p2 = p0 - p1;
       if ((p2) > 0) {
          if (p2 > 0) {
             b = false;
          }
       }else if(p2 >= 0){
       }
       this.c = b;
       if (!b) {
          p0 = p1;
       }
       this.t = p0;
       return;
    }
    public final Object a(){
       lv3 tt = this.t;
       if (!(tt - this.b)) {
          if (this.c != null) {
             this.c = false;
          }else {
             throw new NoSuchElementException();
          }
       }else {
          this.t = this.a + tt;
       }
       return Long.valueOf(tt);
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
    public final void remove(){
       this.b();
       throw null;
    }
}

package p.ma6;
import java.util.Iterator;
import p.au0;
import p.ch3;
import java.lang.Object;
import java.lang.RuntimeException;
import java.lang.IllegalStateException;
import java.lang.StringBuilder;
import java.lang.String;
import java.util.NoSuchElementException;
import p.di7;
import p.jc7;
import p.dx0;
import p.co5;
import p.eb3;
import p.xw0;
import p.il1;
import java.lang.UnsupportedOperationException;

public final class ma6 implements Iterator, au0, ch3	// class@001e5a from classes.dex
{
    public int a;
    public Object b;
    public Iterator c;
    public au0 t;

    public void ma6(){
       super();
    }
    public final RuntimeException a(){
       ma6 ta;
       IllegalStateException illegalState;
       if ((ta = this.a) != 4) {
          illegalState = (ta != 5)? new IllegalStateException("Unexpected state of the iterator: "+this.a): new IllegalStateException("Iterator has failed.");
       }else {
          illegalState = new NoSuchElementException();
       }
       return illegalState;
    }
    public final Object b(di7 p0,au0 p1){
       jc7 ojc7;
       Iterator iterator = p0.iterator();
       jc7 a = jc7.a;
       dx0 a1 = dx0.a;
       if (!iterator.hasNext()) {
          ojc7 = a;
       }else {
          this.c = iterator;
          this.a = 2;
          this.t = p1;
          co5.o(p1, "frame");
          ojc7 = a1;
       }
       if (ojc7 == a1) {
          a = ojc7;
       }
       return a;
    }
    public final void d(Object p0){
       eb3.G(p0);
       this.a = 4;
    }
    public final xw0 getContext(){
       return il1.a;
    }
    public final boolean hasNext(){
       ma6 ta;
       Iterator iterator;
       while (true) {
          ta = this.a;
          iterator = null;
          if (ta != null) {
             break ;
          }else {
          label_0029 :
             this.a = 5;
             ta = this.t;
             co5.i(ta);
             this.t = iterator;
             ta.d(jc7.a);
          }
       }
       if (ta != true) {
          if (ta == 2 || ta == 3) {
             return true;
          }
          if (ta == 4) {
             return false;
          }
          throw this.a();
       }else {
          ta = this.c;
          co5.i(ta);
          if (ta.hasNext()) {
             this.a = 2;
             return true;
          }else {
             this.c = iterator;
             goto label_0029 ;
          }
       }
    }
    public final Object next(){
       ma6 ta;
       if ((ta = this.a) != null) {
          int i = 1;
          if (ta != i) {
             if (ta != 2) {
                if (ta == 3) {
                   this.a = 0;
                   ta = this.b;
                   this.b = null;
                   return ta;
                }else {
                   throw this.a();
                }
             }else {
                this.a = i;
                ta = this.c;
                co5.i(ta);
                return ta.next();
             }
          }
       }
       if (this.hasNext()) {
          return this.next();
       }else {
          throw new NoSuchElementException();
       }
    }
    public final void remove(){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

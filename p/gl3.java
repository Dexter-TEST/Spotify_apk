package p.gl3;
import java.util.ListIterator;
import p.ch3;
import p.hl3;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.util.NoSuchElementException;
import java.lang.IllegalStateException;

public final class gl3 implements ListIterator, ch3	// class@00172e from classes.dex
{
    public final hl3 a;
    public int b;
    public int c;

    public void gl3(hl3 p0,int p1){
       co5.o(p0, "list");
       super();
       this.a = p0;
       this.b = p1;
       this.c = -1;
    }
    public final void add(Object p0){
       gl3 tb = this.b;
       this.b = tb + 1;
       this.a.add(tb, p0);
       this.c = -1;
    }
    public final boolean hasNext(){
       boolean b = (this.b < this.a.c)? true: false;
       return b;
    }
    public final boolean hasPrevious(){
       boolean b = (this.b > null)? true: false;
       return b;
    }
    public final Object next(){
       gl3 tb = this.b;
       gl3 ta = this.a;
       if (tb >= ta.c) {
          throw new NoSuchElementException();
       }
       this.b = tb + 1;
       this.c = tb;
       return ta.a[(ta.b + tb)];
    }
    public final int nextIndex(){
       return this.b;
    }
    public final Object previous(){
       gl3 tb;
       if ((tb = this.b) <= null) {
          throw new NoSuchElementException();
       }
       int i = tb - 1;
       this.b = i;
       this.c = i;
       gl3 ta = this.a;
       return ta.a[(ta.b + i)];
    }
    public final int previousIndex(){
       return (this.b - 1);
    }
    public final void remove(){
       gl3 tc = this.c;
       int i = -1;
       int i1 = (tc != i)? 1: 0;
       if (i1) {
          this.a.b(tc);
          this.b = this.c;
          this.c = i;
          return;
       }else {
          throw new IllegalStateException("Call next\(\) or previous\(\) before removing element from the iterator.".toString());
       }
    }
    public final void set(Object p0){
       gl3 tc;
       int i = ((tc = this.c) != -1)? 1: 0;
       if (i) {
          this.a.set(tc, p0);
          return;
       }else {
          throw new IllegalStateException("Call next\(\) or previous\(\) before replacing element from the iterator.".toString());
       }
    }
}

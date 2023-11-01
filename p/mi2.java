package p.mi2;
import java.util.Iterator;
import p.ch3;
import p.ni2;
import java.lang.Object;
import p.wf2;
import p.co5;
import p.zf2;
import java.lang.String;
import java.util.NoSuchElementException;
import java.lang.UnsupportedOperationException;

public final class mi2 implements Iterator, ch3	// class@001e9e from classes.dex
{
    public Object a;
    public int b;
    public final ni2 c;

    public void mi2(ni2 p0){
       this.c = p0;
       super();
       this.b = -2;
    }
    public final void a(){
       Object obj;
       mi2 tc = this.c;
       if (this.b == -2) {
          obj = tc.c.invoke();
       }else {
          mi2 ta = this.a;
          co5.i(ta);
          obj = tc.b.invoke(ta);
       }
       this.a = obj;
       int i = (obj == null)? 0: 1;
       this.b = i;
       return;
    }
    public final boolean hasNext(){
       if (this.b < null) {
          this.a();
       }
       boolean b = true;
       if (this.b != b) {
          b = false;
       }
       return b;
    }
    public final Object next(){
       if (this.b < null) {
          this.a();
       }
       if (this.b != null) {
          mi2 ta = this.a;
          co5.j(ta, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
          this.b = -1;
          return ta;
       }else {
          throw new NoSuchElementException();
       }
    }
    public final void remove(){
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

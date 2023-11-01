package p.f93;
import java.util.Iterator;
import p.ch3;
import java.lang.Object;
import java.lang.String;
import p.co5;
import p.ve1;
import p.la6;
import p.d93;
import p.ye7;
import java.lang.UnsupportedOperationException;

public final class f93 implements Iterator, ch3	// class@001582 from classes.dex
{
    public final int a;
    public final Iterator b;
    public int c;

    public void f93(Iterator p0){
       this.a = 0;
       co5.o(p0, "iterator");
       super();
       this.b = p0;
    }
    public void f93(ve1 p0){
       this.a = 1;
       super();
       this.b = p0.a.iterator();
       this.c = p0.b;
    }
    public final boolean hasNext(){
       f93 tb = this.b;
       switch (this.a){
           case 0:
           default:
             while (this.c > null && tb.hasNext()) {
                tb.next();
                int i = this.c - 1;
                this.c = i;
             }
             return tb.hasNext();
       }
       return tb.hasNext();
    }
    public final Object next(){
       f93 tb = this.b;
       switch (this.a){
           case 0:
             break;
           default:
             while (this.c > null && tb.hasNext()) {
                tb.next();
                int i = this.c - 1;
                this.c = i;
             }
             return tb.next();
       }
       f93 tc = this.c;
       this.c = tc + 1;
       if (tc >= null) {
          return new d93(tc, tb.next());
       }
       ye7.W();
       throw null;
    }
    public final void remove(){
       switch (this.a){
           case 0:
           default:
             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
       }
       throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

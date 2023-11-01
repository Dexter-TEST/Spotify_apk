package p.sc7;
import java.util.Iterator;
import p.tc7;
import java.lang.Object;
import java.util.List;
import p.u20;
import p.ak4;
import java.lang.String;
import p.yj4;
import java.lang.Throwable;
import java.lang.RuntimeException;
import p.iw1;
import java.util.NoSuchElementException;
import java.lang.UnsupportedOperationException;

public final class sc7 implements Iterator	// class@002603 from classes.dex
{
    public final int a;
    public Object b;
    public final Object c;

    public void sc7(tc7 p0){
       this.a = 0;
       this.c = p0;
       super();
       this.b = p0.a.iterator();
    }
    public void sc7(u20 p0){
       this.a = 1;
       this.c = p0;
       super();
    }
    public final boolean hasNext(){
       switch (this.a){
           case 0:
           default:
             u20 b = this.c.b;
             this.b = b;
             return (ak4.c(b) ^ 0x01);
       }
       return this.b.hasNext();
    }
    public final Object next(){
       switch (this.a){
           case 0:
           default:
             if (this.b == null) {
                this.b = this.c.b;
             }
             if (!ak4.c(this.b)) {
                sc7 tb = this.b;
                if (!tb instanceof yj4) {
                   this.b = null;
                   return tb;
                }else {
                   throw iw1.f(tb.a);
                }
             }else {
                throw new NoSuchElementException();
             }
       }
       return this.b.next();
    }
    public final void remove(){
       switch (this.a){
           case 0:
           default:
             throw new UnsupportedOperationException("Read only iterator");
       }
       throw new UnsupportedOperationException();
    }
}

package p.u42;
import java.util.Iterator;
import p.ch3;
import p.ni2;
import java.lang.Object;
import p.la6;
import p.v42;
import p.zf2;
import java.lang.Boolean;
import java.util.NoSuchElementException;
import java.lang.UnsupportedOperationException;
import java.lang.String;

public final class u42 implements Iterator, ch3	// class@00283c from classes.dex
{
    public final int a;
    public final Iterator b;
    public int c;
    public Object t;
    public final la6 v;

    public void u42(ni2 p0){
       this.a = 1;
       this.v = p0;
       super();
       this.b = p0.c.iterator();
       this.c = -1;
    }
    public void u42(v42 p0){
       this.a = 0;
       this.v = p0;
       super();
       this.b = p0.a.iterator();
       this.c = -1;
    }
    public final void a(){
       ni2 obj;
       u42 tv = this.v;
       u42 tb = this.b;
       switch (this.a){
           case 0:
             while (true) {
                if (tb.hasNext()) {
                   obj = tb.next();
                   u42 ou42 = tv;
                   if (ou42.c.invoke(obj).booleanValue() == ou42.b) {
                      this.t = obj;
                      this.c = 1;
                      break ;
                   }
                }else {
                   this.c = 0;
                   break ;
                }
             }
             break;
           default:
             if (tb.hasNext()) {
                obj = tb.next();
                if (tv.b.invoke(obj).booleanValue()) {
                   this.c = 1;
                   this.t = obj;
                label_0052 :
                   return;
                }
             }
             this.c = 0;
             goto label_0052 ;
       }
       return;
    }
    public final boolean hasNext(){
       boolean b = false;
       switch (this.a){
           case 0:
             if (this.c == -1) {
                this.a();
             }
             if (this.c == 1) {
                b = true;
             }
             break;
           default:
             if (this.c == -1) {
                this.a();
             }
             if (this.c == 1) {
                b = true;
             }
             return b;
       }
       return b;
    }
    public final Object next(){
       u42 tt;
       switch (this.a){
           case 0:
             break;
           default:
             if (this.c == -1) {
                this.a();
             }
             if (this.c != null) {
                tt = this.t;
                this.t = null;
                this.c = -1;
                return tt;
             }else {
                throw new NoSuchElementException();
             }
       }
       if (this.c == -1) {
          this.a();
       }
       if (this.c != null) {
          tt = this.t;
          this.t = null;
          this.c = -1;
          return tt;
       }else {
          throw new NoSuchElementException();
       }
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

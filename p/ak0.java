package p.ak0;
import java.util.Iterator;
import p.dk0;
import java.lang.Object;
import p.yj0;
import p.bk0;
import java.util.NoSuchElementException;
import java.util.ConcurrentModificationException;
import java.lang.String;
import p.ap5;

public abstract class ak0 implements Iterator	// class@000f99 from classes.dex
{
    public int a;
    public int b;
    public int c;
    public final dk0 t;

    public void ak0(dk0 p0){
       this.t = p0;
       super();
       this.a = p0.v;
       int i = (p0.isEmpty())? -1: 0;
       this.b = i;
       this.c = -1;
       return;
    }
    public final boolean hasNext(){
       boolean b = (this.b >= null)? true: false;
       return b;
    }
    public final Object next(){
       bk0 uobk0;
       int i1;
       ak0 tt = this.t;
       if (tt.v != this.a) {
          throw new ConcurrentModificationException();
       }
       if (!this.hasNext()) {
          throw new NoSuchElementException();
       }
       ak0 tb = this.b;
       this.c = tb;
       int i = this;
       yj0 w = i.w;
       switch (i.v){
           case 0:
             uobk0 = w.d(tb);
             break;
           case 1:
             uobk0 = new bk0(w, tb);
             break;
           default:
             uobk0 = w.l(tb);
       }
       if ((i1 = this.b + 1) >= tt.w) {
          i1 = -1;
       }
       this.b = i1;
       return uobk0;
    }
    public final void remove(){
       ak0 tt = this.t;
       if (tt.v != this.a) {
          throw new ConcurrentModificationException();
       }
       boolean b = (this.c >= null)? true: false;
       ap5.j("no calls to next\(\) since the last call to remove\(\)", b);
       this.a = this.a + 32;
       tt.remove(tt.d(this.c));
       this.b = this.b - 1;
       this.c = -1;
       return;
    }
}

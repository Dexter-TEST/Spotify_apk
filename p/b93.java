package p.b93;
import java.util.Iterator;
import java.lang.Object;
import p.lk;
import p.pk;
import p.wh6;
import p.sk;
import java.util.NoSuchElementException;
import java.lang.IllegalStateException;

public abstract class b93 implements Iterator	// class@00107c from classes.dex
{
    public int a;
    public int b;
    public boolean c;

    public void b93(int p0){
       super();
       this.a = p0;
    }
    public final boolean hasNext(){
       boolean b = (this.b < this.a)? true: false;
       return b;
    }
    public final Object next(){
       object oobject;
       if (!this.hasNext()) {
          throw new NoSuchElementException();
       }
       b93 tb = this.b;
       lk olk = this;
       olk = olk.v;
       switch (olk.t){
           case 0:
             oobject = olk.h(tb);
             break;
           case 1:
             oobject = olk.j(tb);
             break;
           default:
             oobject = olk.b[tb];
       }
       this.b = this.b + 1;
       this.c = true;
       return oobject;
    }
    public final void remove(){
       if (this.c == null) {
          throw new IllegalStateException();
       }
       int i = this.b - 1;
       this.b = i;
       int i1 = this;
       lk v = i1.v;
       switch (i1.t){
           case 0:
             v.i(i);
             break;
           case 1:
             v.i(i);
             break;
           default:
             v.g(i);
       }
       this.a = this.a - 1;
       this.c = false;
       return;
    }
}

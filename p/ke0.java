package p.ke0;
import java.util.Iterator;
import p.ch3;
import java.lang.Object;
import p.co5;
import java.util.NoSuchElementException;
import java.lang.Character;
import java.lang.UnsupportedOperationException;
import java.lang.String;

public final class ke0 implements Iterator, ch3	// class@001bf5 from classes.dex
{
    public final int a;
    public final int b;
    public boolean c;
    public int t;

    public void ke0(char p0,char p1,int p2){
       super();
       this.a = p2;
       this.b = p1;
       boolean b = true;
       if (p2 > 0) {
          if (co5.r(p0, p1) > 0) {
             b = false;
          }
       }else if(co5.r(p0, p1) >= 0){
       }
       this.c = b;
       if (!b) {
          p0 = p1;
       }
       this.t = p0;
       return;
    }
    public final Object a(){
       ke0 tt;
       if ((tt = this.t) == this.b) {
          if (this.c != null) {
             this.c = false;
          }else {
             throw new NoSuchElementException();
          }
       }else {
          this.t = this.a + tt;
       }
       return Character.valueOf((char)tt);
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

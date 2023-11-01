package p.q1;
import java.util.List;
import p.o1;
import p.i1;
import java.lang.Object;
import java.util.Collection;
import java.util.ListIterator;
import p.p1;
import java.lang.Class;
import java.util.RandomAccess;
import p.n1;

public class q1 extends o1 implements List	// class@002316 from classes.dex
{
    public final i1 w;

    public void q1(i1 p0,Object p1,List p2,o1 p3){
       this.w = p0;
       super(p0, p1, p2, p3);
    }
    public final void add(int p0,Object p1){
       this.b();
       this.b.add(p0, p1);
       q1 tw = this.w;
       tw.t = tw.t + 1;
       if (this.b.isEmpty()) {
          this.a();
       }
       return;
    }
    public final boolean addAll(int p0,Collection p1){
       boolean b;
       if (p1.isEmpty()) {
          return false;
       }
       int i = this.size();
       if (b = this.b.addAll(p0, p1)) {
          q1 tw = this.w;
          tw.t = tw.t + (this.b.size() - i);
          if (!i) {
             this.a();
          }
       }
       return b;
    }
    public final Object get(int p0){
       this.b();
       return this.b.get(p0);
    }
    public final int indexOf(Object p0){
       this.b();
       return this.b.indexOf(p0);
    }
    public final int lastIndexOf(Object p0){
       this.b();
       return this.b.lastIndexOf(p0);
    }
    public final ListIterator listIterator(){
       this.b();
       return new p1(this);
    }
    public final ListIterator listIterator(int p0){
       this.b();
       return new p1(this, p0);
    }
    public final Object remove(int p0){
       this.b();
       q1 tw = this.w;
       tw.t = tw.t - 1;
       this.c();
       return this.b.remove(p0);
    }
    public final Object set(int p0,Object p1){
       this.b();
       return this.b.set(p0, p1);
    }
    public final List subList(int p0,int p1){
       o1 tc;
       this.b();
       List list = this.b.subList(p0, p1);
       if ((tc = this.c) == null) {
          tc = this;
       }
       q1 tw = this.w;
       tw.getClass();
       o1 ta = this.a;
       n1 on1 = (list instanceof RandomAccess)? new n1(tw, ta, list, tc): new q1(tw, ta, list, tc);
       return on1;
    }
}

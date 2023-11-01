package p.wm2;
import java.util.AbstractList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.List;
import java.lang.String;
import java.util.ArrayList;
import java.util.Collection;
import p.tm2;
import java.lang.Object;
import p.uk;
import p.co5;

public final class wm2 extends AbstractList	// class@002b64 from classes.dex
{
    public Handler a;
    public final String b;
    public final ArrayList c;
    public final ArrayList t;
    public static final AtomicInteger v;

    static {
       wm2.v = new AtomicInteger();
    }
    public void wm2(List p0){
       super();
       this.b = String.valueOf(wm2.v.incrementAndGet());
       this.t = new ArrayList();
       this.c = new ArrayList(p0);
    }
    public void wm2(tm2[] p0){
       super();
       this.b = String.valueOf(wm2.v.incrementAndGet());
       this.t = new ArrayList();
       this.c = new ArrayList(uk.h0(p0));
    }
    public final void add(int p0,Object p1){
       co5.o(p1, "element");
       this.c.add(p0, p1);
    }
    public final boolean add(Object p0){
       co5.o(p0, "element");
       return this.c.add(p0);
    }
    public final void clear(){
       this.c.clear();
    }
    public final boolean contains(Object p0){
       int i = (p0 == null)? 1: p0 instanceof tm2;
       if (!i) {
          return false;
       }else {
          return super.contains(p0);
       }
    }
    public final Object get(int p0){
       return this.c.get(p0);
    }
    public final int indexOf(Object p0){
       int i = (p0 == null)? 1: p0 instanceof tm2;
       if (!i) {
          return -1;
       }else {
          return super.indexOf(p0);
       }
    }
    public final int lastIndexOf(Object p0){
       int i = (p0 == null)? 1: p0 instanceof tm2;
       if (!i) {
          return -1;
       }else {
          return super.lastIndexOf(p0);
       }
    }
    public final Object remove(int p0){
       return this.c.remove(p0);
    }
    public final boolean remove(Object p0){
       int i = (p0 == null)? 1: p0 instanceof tm2;
       if (!i) {
          return false;
       }else {
          return super.remove(p0);
       }
    }
    public final Object set(int p0,Object p1){
       co5.o(p1, "element");
       return this.c.set(p0, p1);
    }
    public final int size(){
       return this.c.size();
    }
}

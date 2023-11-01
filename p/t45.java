package p.t45;
import java.util.RandomAccess;
import p.h1;
import p.j80;
import java.lang.Object;
import p.h0;

public final class t45 extends h1 implements RandomAccess	// class@000340 from classes2.dex
{
    public final j80[] a;
    public final int[] b;

    public void t45(j80[] p0,int[] p1){
       super();
       this.a = p0;
       this.b = p1;
    }
    public final int a(){
       return this.a.length;
    }
    public final boolean contains(Object p0){
       if (!p0 instanceof j80) {
          return false;
       }
       return super.contains(p0);
    }
    public final Object get(int p0){
       return this.a[p0];
    }
    public final int indexOf(Object p0){
       if (!p0 instanceof j80) {
          return -1;
       }
       return super.indexOf(p0);
    }
    public final int lastIndexOf(Object p0){
       if (!p0 instanceof j80) {
          return -1;
       }
       return super.lastIndexOf(p0);
    }
}

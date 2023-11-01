package p.zy5;
import p.tw6;
import p.sw6;
import java.util.TreeMap;
import java.lang.Object;
import java.lang.String;
import p.co5;
import java.lang.Integer;
import java.util.Map$Entry;
import java.lang.Class;
import p.jn5;
import java.lang.IllegalArgumentException;
import java.lang.IllegalStateException;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Iterator;

public final class zy5 implements tw6, sw6	// class@002f8f from classes.dex
{
    public final int a;
    public String b;
    public final long[] c;
    public final double[] t;
    public final String[] v;
    public final byte[][] w;
    public final int[] x;
    public int y;
    public static final TreeMap z;

    static {
       zy5.z = new TreeMap();
    }
    public void zy5(int p0){
       super();
       this.a = p0;
       p0++;
       int[] ointArray = new int[p0];
       this.x = ointArray;
       long[] olongArray = new long[p0];
       this.c = olongArray;
       double[] uodoubleArra = new double[p0];
       this.t = uodoubleArra;
       String[] stringArray = new String[p0];
       this.v = stringArray;
       byte[][] uobyteArray = new byte[][p0];
       this.w = uobyteArray;
    }
    public static final zy5 x(int p0,String p1){
       Map$Entry uEntry;
       zy5 value;
       co5.o(p1, "query");
       TreeMap z = zy5.z;
       _monitor_enter(z);
       if ((uEntry = z.ceilingEntry(Integer.valueOf(p0))) != null) {
          z.remove(uEntry.getKey());
          value = uEntry.getValue();
          value.getClass();
          value.b = p1;
          value.y = p0;
          _monitor_exit(z);
       }else {
          _monitor_exit(z);
          value = new zy5(p0);
          value.b = p1;
          value.y = p0;
       }
       return value;
    }
    public final void C(int p0,double p1){
       this.x[p0] = 3;
       this.t[p0] = p1;
    }
    public final void P(int p0,long p1){
       this.x[p0] = 2;
       this.c[p0] = p1;
    }
    public final void b(jn5 p0){
       int i1;
       object oobject;
       zy5 ty = this.y;
       if (1 <= ty) {
          int i = 1;
          while (true) {
             if ((i1 = this.x[i]) != 1) {
                if (i1 != 2) {
                   if (i1 != 3) {
                      if (i1 != 4) {
                         if (i1 != 5) {
                         label_0056 :
                            if (i != ty) {
                               i = i + 1;
                            }
                         }else if((oobject = this.w[i]) != null){
                            p0.d0(oobject, i);
                            goto label_0056 ;
                         }else {
                            throw new IllegalArgumentException("Required value was null.".toString());
                         }
                      }else if((oobject = this.v[i]) != null){
                         p0.s(i, oobject);
                         goto label_0056 ;
                      }else {
                         throw new IllegalArgumentException("Required value was null.".toString());
                      }
                   }else {
                      p0.C(i, this.t[i]);
                      goto label_0056 ;
                   }
                }else {
                   p0.P(i, this.c[i]);
                   goto label_0056 ;
                }
             }else {
                p0.z(i);
                goto label_0056 ;
             }
          }
       }
       return;
    }
    public final void close(){
    }
    public final void d0(byte[] p0,int p1){
       co5.o(p0, "value");
       this.x[p1] = 5;
       this.w[p1] = p0;
    }
    public final String f(){
       zy5 tb;
       if ((tb = this.b) != null) {
          return tb;
       }
       throw new IllegalStateException("Required value was null.".toString());
    }
    public final void s(int p0,String p1){
       co5.o(p1, "value");
       this.x[p0] = 4;
       this.v[p0] = p1;
    }
    public final void y(){
       TreeMap z = zy5.z;
       _monitor_enter(z);
       z.put(Integer.valueOf(this.a), this);
       if (z.size() > 15) {
          int i = z.size() - 10;
          Iterator iterator = z.descendingKeySet().iterator();
          co5.l(iterator, "queryPool.descendingKeySet\(\).iterator\(\)");
          while (true) {
             int i1 = i - 1;
             if (i > 0) {
                iterator.next();
                iterator.remove();
                i = i1;
             }
          }
       }
       _monitor_exit(z);
       return;
    }
    public final void z(int p0){
       this.x[p0] = 1;
    }
}
